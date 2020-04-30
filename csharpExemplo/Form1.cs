using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Atividade_pratica_supervisionada
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void limpar_Click(object sender, EventArgs e)
        {
            textlimpar.Text = string.Empty;
            textcriptografar.Text = string.Empty;
            textdescriptografar.Text = string.Empty;
        }

        private void criptografar_Click(object sender, EventArgs e)
        {
            textcriptografar.Text = string.Empty;
            for (int i = 0; i< textlimpar.Text.Length; i++)
            {
                int Usuario = (int)textlimpar.Text[i];
                int Criptografar = Usuario + 128;
                textcriptografar.Text += Char.ConvertFromUtf32(Criptografar);
            
            }
        }

        private void descriptografar_Click(object sender, EventArgs e)
        {
            textdescriptografar.Text = string.Empty;
            for(int i =0; i< textcriptografar.Text.Length; i++)
            {
                int Descriptografar = (int)textcriptografar.Text[i];
                int TextoOriginal = Descriptografar - 128;
                textdescriptografar.Text += Char.ConvertFromUtf32(TextoOriginal);
            }
        }
    }
}
