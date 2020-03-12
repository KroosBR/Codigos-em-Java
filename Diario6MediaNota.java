
// classe Diario6MediaNota implementa estrutura case

import javax.swing.*; // interface gr·fica
import java.text.DecimalFormat; // permite definiÁ„o de casas decimais
/**
 *
 * @author jwcosta
 */
public class Diario6MediaNota {
    
   private String nomeCurso; // nome do curso para Diario6MediaNota
   private int Cont;  // numero de notas
   private int total; // soma das notas
   private int aCont; // contagem de notas conceito A
   private int bCont; // contagem de notas conceito B
   private int cCont; // contagem de notas conceito C
   private int dCont; // contagem de notas conceito D
   private int eCont; // contagem de notas conceito F

   //Construtor que inicializa o nomeCurso sem argumento
   public Diario6MediaNota()
   {
      nomeCurso = "Java!";
   }//termina construtor

   //Construtor que inicializa o nomeCurso com argumento
   public Diario6MediaNota(String nome)
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

   // exibe uma mensagem de boas-vindas para o usu·rio Diario6MediaNota
   public void mostraMensagem()
   {
      // essa instruÁ„o chama getNomeCurso para obter o
      JOptionPane.showMessageDialog(null,getNomeCurso() );
   } // termina o mÈtodo mostraMensagem

   public void mediaTurma()
   {
      int nota;    // valor da nota

      String ent;      // vari·vel de entrada de dados

       // Processamento
      ent = JOptionPane.showInputDialog(
                 "Entre uma nota, -1 para sair:" );

      // converte string para inteiro
      nota = Integer.parseInt( ent );

      while ( nota != -1 ) {

         total = total + nota;

         Cont = Cont + 1;

         // chama método para incrementar o contador de conceitos
         incrementaConceito( nota );

          ent = JOptionPane.showInputDialog(
                      "Entre uma nota, -1 para sair:" );

         // converte string para inteiro
         nota = Integer.parseInt( ent );
      }
   }
   public void relatorioDiario(){

      double media;    // mÈdia aritmÈtica das notas
       JTextArea CaixaSaida = new JTextArea( 11, 10 ); // Conceito

      DecimalFormat doisDigitos = new DecimalFormat( "0.00" );

      CaixaSaida.append( "Conceito\tNúmero de Alunos\nA\t"
                            + aCont + "\nB\t"+ bCont+"\nC\t"
                            + cCont + "\nD\t"+ dCont+"\nE\t"
                            + eCont );
      if ( Cont != 0 ) {
         media = (double) total / Cont;

         // saida de dados
         JOptionPane.showMessageDialog( null,
         "A média da turma é " + doisDigitos.format( media ),
         "média",JOptionPane.INFORMATION_MESSAGE );
         CaixaSaida.setEditable(false);
         JOptionPane.showMessageDialog(
         null, CaixaSaida, "Diário "+nomeCurso,
         JOptionPane.INFORMATION_MESSAGE );

      }
      else
         JOptionPane.showMessageDialog( null,
            "Faltam valores", "Classe Média",
            JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );    // terminate the program
   }
   private void incrementaConceito( int nota )
   {
      // determina a nota que foi inserida
      switch ( nota / 10 )
      {
         case 9:  // nota estava entre 90
         case 10: // e 100
            ++aCont; // incrementa aCont
            break; // necess·rio para sair de switch

         case 8: // nota estava entre 80 e 89
            ++bCont; // incrementa bCount
            break; // sai do switch

         case 7: // nota estava entre 70 e 79
            ++cCont; // incrementa cCount
            break; // sai do switch

         case 6: // nota estava entre 60 e 69
            ++dCont; // incrementa dCount
            break; // sai de switch

         default: // nota era menor que 60
            ++eCont; // incrementa fCount
            break; // opcional; sair· de switch de qualquer jeito
      } // fim do switch
   } // fim do mÈtodo incrementaConceito
} // fim classe Diario6MediaNota


/**************************************************************************
 * Modificado de : Deitel, H. M.; Deitel, P.J. Java Como Programar.         *
 * Porto Alegre:Bookman,2005.                                               *
 ***************************************************************************/