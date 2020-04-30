package br.com.caelum.pm73.dao;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.pm73.dominio.Leilao;
import br.com.caelum.pm73.dominio.Usuario;

public class LeilaoDaoTest {

	private UsuarioDao usuarioDao;
	private Session session;
	private LeilaoDao leilaoDao;

	@Before
	public void antes() {
		session = new CriadorDeSessao().getSession();
		usuarioDao = new UsuarioDao(session);
		leilaoDao = new LeilaoDao(session);

		session.beginTransaction();
	}

	@After
	public void depois() {
		session.getTransaction().rollback();
		session.close();

	}

	@Test
	public void deveContarLeiloesNaoEncerrados() {

		Usuario guilherme = new Usuario("Guilherme", "guilherme@guilherme.com.br");

		Leilao ativo = new Leilao("Geladeira", 1500.0, guilherme, false);
		Leilao encerrado = new Leilao("Xbox", 700.0, guilherme, false);
		encerrado.encerra();

		usuarioDao.salvar(guilherme);
		leilaoDao.salvar(ativo);
		leilaoDao.salvar(encerrado);

		Long total = leilaoDao.total();

		assertEquals(1L, (total).longValue());
	}

	@Test
	public void deveRetornarZeroSeNaoHaLeiloesNovos() {
		Usuario guilherme = new Usuario("Mauricio Aniche", "mauricio@aniche.com.br");

		Leilao encerrado = new Leilao("XBox", 700.0, guilherme, false);
		Leilao tambemEncerrado = new Leilao("Geladeira", 1500.0, guilherme, false);
		encerrado.encerra();
		tambemEncerrado.encerra();

		usuarioDao.salvar(guilherme);
		leilaoDao.salvar(encerrado);
		leilaoDao.salvar(tambemEncerrado);

		long total = leilaoDao.total();

		assertEquals(0L, total);
	}
	
	@Test
    public void deveRetornarLeiloesDeProdutosNovos() {
        Usuario guilherme = new Usuario("Mauricio Aniche",
                "mauricio@aniche.com.br");

        Leilao produtoNovo = 
                new Leilao("XBox", 700.0, guilherme, false);
        Leilao produtoUsado = 
                new Leilao("Geladeira", 1500.0, guilherme,true);

        usuarioDao.salvar(guilherme);
        leilaoDao.salvar(produtoNovo);
        leilaoDao.salvar(produtoUsado);

        List<Leilao> novos = leilaoDao.novos();

        assertEquals(1, novos.size());
        assertEquals("XBox", novos.get(0).getNome());
    }
	
	@Test
    public void deveTrazerSomenteLeiloesAntigos() {
        Usuario guilherme = new Usuario("Mauricio Aniche",
                "mauricio@aniche.com.br");

        Leilao recente = 
                new Leilao("XBox", 700.0, guilherme, false);
        Leilao antigo = 
                new Leilao("Geladeira", 1500.0, guilherme,true);

        Calendar dataRecente = Calendar.getInstance();
        Calendar dataAntiga = Calendar.getInstance();
        dataAntiga.add(Calendar.DAY_OF_MONTH, -10);

        recente.setDataAbertura(dataRecente);
        antigo.setDataAbertura(dataAntiga);

        usuarioDao.salvar(guilherme);
        leilaoDao.salvar(recente);
        leilaoDao.salvar(antigo);

        List<Leilao> antigos = leilaoDao.antigos();

        assertEquals(1, antigos.size());
        assertEquals("Geladeira", antigos.get(0).getNome());
    }
	
	@Test
    public void deveTrazerSomenteLeiloesAntigosHaMaisDe7Dias() {
        Usuario guilherme = new Usuario("Mauricio Aniche",
                "mauricio@aniche.com.br");

        Leilao noLimite = 
                new Leilao("XBox", 700.0, guilherme, false);

        Calendar dataAntiga = Calendar.getInstance();
        dataAntiga.add(Calendar.DAY_OF_MONTH, -7);

        noLimite.setDataAbertura(dataAntiga);

        usuarioDao.salvar(guilherme);
        leilaoDao.salvar(noLimite);

        List<Leilao> antigos = leilaoDao.antigos();

        assertEquals(1, antigos.size());
    }
	
	@Test
	public void deveTrazerLeiloesNaoEncerradosNoPeriodo() {
		
		Calendar comecoDoIntervalo = Calendar.getInstance();
		comecoDoIntervalo.add(Calendar.DAY_OF_MONTH, -10);
		
		Calendar fimDoIntervalo = Calendar.getInstance();
		
		Usuario guilherme = new Usuario("Guilherme", "guilherme@guilherme.com.br");
		
		Leilao leilao1 = new Leilao("Xbox", 700.0, guilherme, false);
		Calendar dataDoleilao1 = Calendar.getInstance();
		dataDoleilao1.add(Calendar.DAY_OF_MONTH, -2);
		leilao1.setDataAbertura(dataDoleilao1);
		
		Leilao leilao2 = new Leilao("Geladeira", 1700.0, guilherme, false);
		Calendar dataDoLeilao2 = Calendar.getInstance();
		dataDoLeilao2.add(Calendar.DAY_OF_MONTH, -20);
		leilao2.setDataAbertura(dataDoLeilao2);
		
		usuarioDao.salvar(guilherme);
		leilaoDao.salvar(leilao1);
		leilaoDao.salvar(leilao2);
		
		List<Leilao> leiloes = leilaoDao.porPeriodo(comecoDoIntervalo, fimDoIntervalo);
		
		assertEquals(1, leiloes.size());
		assertEquals("Xbox", leiloes.get(0).getNome());
	}
	
	@Test
	public void naoDeveTrazerLeiloesEncerradosNoPeriodo() {
		
		Calendar comecoDoIntervalo = Calendar.getInstance();
		comecoDoIntervalo.add(Calendar.DAY_OF_MONTH, -10);
		
		Calendar fimDoIntervalo = Calendar.getInstance();
		
		Usuario guilherme = new Usuario("Guilherme", "guilherme@guilherme.com.br");
		
		Calendar dataLeilao1 = Calendar.getInstance();
		dataLeilao1.add(Calendar.DAY_OF_MONTH, -2);
		
		Leilao leilao1 = new Leilao("Xbox", 700.0, guilherme, false);
		leilao1.setDataAbertura(dataLeilao1);
		leilao1.encerra();
		
		usuarioDao.salvar(guilherme);
		leilaoDao.salvar(leilao1);
		
		List<Leilao> leiloes = leilaoDao.porPeriodo(comecoDoIntervalo, fimDoIntervalo);
		assertEquals(0, leiloes.size());
	}
}
