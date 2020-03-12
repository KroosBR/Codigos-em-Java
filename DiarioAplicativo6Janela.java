// Cria e manipula um objeto Diario6MediaNota.

import javax.swing.JOptionPane; // interface gr·fica

/**
 *
 * @author jwcosta
 */
public class DiarioAplicativo6Janela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // mÈtodo main inicia a execuÁ„o do programa
 
      // cria vari·vel String para obter entrada a partir de janela gr·fica
      String nomeCurso = new String();

      // cria um objeto Diario5MediaNota e o atribui a diarioJava
      Diario6MediaNota diarioJava = new Diario6MediaNota();

      // solicita e lÍ o nome do curso
      nomeCurso =
          JOptionPane.showInputDialog("Entre com o nome do curso :" );
      diarioJava.setNomeCurso( nomeCurso ); // configura o nome do curso

      // exibe mensagem de boas-vindas depois de especificar nome do curso
      diarioJava.mostraMensagem();
      // lÍ, calcula e mostra no vÌdeo a mÈdia das notas dos alunos
      diarioJava.mediaTurma();
      // apresenta o relatÛrio das notas e conceitos
      diarioJava.relatorioDiario();
   } // fim de main

} // fim da classe DiarioAplicativo4Janela


/**************************************************************************
 * Modificado de : Deitel, H. M.; Deitel, P.J. Java Como Programar.         *
 * Porto Alegre:Bookman,2005.                                               *
 ***************************************************************************/