
// classe Diario5MediaNota utiliza janela gr·fica (GUI)

import javax.swing.JOptionPane; // interface gr·fica
import java.text.DecimalFormat; // permite definiÁ„o de casas decimais
/**
 *
 * @author jwcosta
 */
public class Diario5MediaNota {
   private String nomeCurso; // nome do curso para Diario5MediaNota

   //Construtor que inicializa o nomeCurso sem argumento
   public Diario5MediaNota()
   {
      nomeCurso = "Java!";
   }//termina construtor

   //Construtor que inicializa o nomeCurso com argumento
   public Diario5MediaNota(String nome)
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

   // exibe uma mensagem de boas-vindas para o usu·rio Diario5MediaNota
   public void mostraMensagem()
   {
      // essa instruÁ„o chama getNomeCurso para obter o
      JOptionPane.showMessageDialog(null,getNomeCurso() );
   } // termina o mÈtodo mostraMensagem

   public void mediaTurma()
   {
      int Cont,  // numero de notas
          nota,    // valor da nota
          total;         // soma das notas
      double media;    // mÈdia aritmÈtica das notas
      String ent;      // vari·vel de entrada de dados

      // InicializaÁ„o
      total = 0;
      Cont = 0;

      // Processamento
      ent = JOptionPane.showInputDialog(
                 "Entre uma nota, -1 para sair:" );

      // converte string para inteiro
      nota = Integer.parseInt( ent );

      while ( nota != -1 ) {

         total = total + nota;

         Cont = Cont + 1;

          ent = JOptionPane.showInputDialog(
                      "Entre uma nota, -1 para sair:" );


         // converte string para inteiro
          nota = Integer.parseInt( ent );
      }

      // finalizaÁ„o
      DecimalFormat doisDigitos = new DecimalFormat( "##0.00" );

      if ( Cont != 0 ) {
         media = (double) total / Cont;
         

         // saida de dados
         JOptionPane.showMessageDialog( null,
         "A média da turma é " + doisDigitos.format( media ),
         "média",JOptionPane.INFORMATION_MESSAGE );
      }
      else
         JOptionPane.showMessageDialog( null,
            "Faltam valores", "Classe Média",
            JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );    // terminate the program
   }
} // fim classe Diario5MediaNota


/**************************************************************************
 * Modificado de : Deitel, H. M.; Deitel, P.J. Java Como Programar.         *
 * Porto Alegre:Bookman,2005.                                               *
 ***************************************************************************/
