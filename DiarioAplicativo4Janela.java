// Cria e manipula um objeto Diario4Janela.

import javax.swing.JOptionPane; // interface gr·fica
/**
 *
 * @author jwcosta
 */
public class DiarioAplicativo4Janela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String nomeCurso = new String();

      Diario4Janela diarioJava = new Diario4Janela();

      nomeCurso =
          JOptionPane.showInputDialog("Entre com o nome do curso :" );
      diarioJava.setNomeCurso( nomeCurso ); 

      JOptionPane.showMessageDialog(null,diarioJava.getNomeCurso() + " curso do Cefet");
     // diarioJava.mostraMensagem();
      
      

   } // fim de main

} // fim da classe DiarioAplicativo4Janela


/**************************************************************************
 * Modificado de : Deitel, H. M.; Deitel, P.J. Java Como Programar.         *
 * Porto Alegre:Bookman,2005.                                               *
 ***************************************************************************/