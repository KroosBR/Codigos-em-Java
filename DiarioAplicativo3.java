
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwcosta
 */
public class DiarioAplicativo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // mÈtodo main inicia a execuÁ„o do programa
   
      // cria Scanner para obter entrada a partir da janela de comando
      Scanner entrada = new Scanner( System.in );

      // cria um objeto Diario3 e o atribui a diarioJava
      Diario3 diarioJava = new Diario3();
      // cria outro objeto Diario3 e o atribui a diarioJava
      Diario3 diario2 = new Diario3("Sistemas Operacionais");

      // exibe valor inicial de nomeCurso
      System.out.printf( "Nome do Curso : %s\n\n",
         diarioJava.getNomeCurso() );

      // solicita e lÍ o nome do curso
      System.out.println( "Entre com o nome do curso :" );
      String nomeCurso = entrada.nextLine(); // lÍ uma linha de texto
      diarioJava.setNomeCurso( nomeCurso ); // configura o nome do curso
      System.out.println(); // gera saÌda de uma linha em branco

      // exibe mensagem de boas-vindas depois de especificar nome do curso
      diarioJava.mostraMensagem();
      diario2.mostraMensagem();
   } // fim de main
    
}
