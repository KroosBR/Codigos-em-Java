
// classe Diario4Janela utiliza janela gr·fica (GUI)

import javax.swing.JOptionPane; // interface gr·fica

/**
 *
 * @author jwcosta
 */
public class Diario4Janela {
private String nomeCurso; // nome do curso para Diario4Janela

   //Construtor que inicializa o nomeCurso sem argumento
   public Diario4Janela()
   {
      nomeCurso = "Java!";
   }//termina construtor

   //Construtor que inicializa o nomeCurso com argumento
   public Diario4Janela(String nome)
   {
      nomeCurso = nome;
   }//termina construtor


   // mÈtodo para configurar o nome do curso
   public void setNomeCurso( String nome )
   {
      nomeCurso = nome; // armazena o nome do curso
   } // termina o mÈtodo setNomeCurso

   // mÈtodo para recuperar o nome do curso
   public String getNomeCurso()
   {
      return nomeCurso;
   } // termina o mÈtodo getNomeCurso

   // exibe uma mensagem de boas-vindas para o usu·rio Diario4Janela
 /*
   public void mostraMensagem()
   {
      // essa instruÁ„o chama getNomeCurso para obter o
      JOptionPane.showMessageDialog(null,getNomeCurso() + " curso do Cefet");
      
   } // termina o mÈtodo mostraMensagem
*/
} // fim classe Diario4Janela


/**************************************************************************
 * Modificado de : Deitel, H. M.; Deitel, P.J. Java Como Programar.         *
 * Porto Alegre:Bookman,2005.                                               *
 ***************************************************************************/
