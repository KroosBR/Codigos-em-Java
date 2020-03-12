
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwcosta
 */
public class DiarioAplicativo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cria Scanner para obter entrada a partir da janela de comando
      Scanner entrada = new Scanner( System.in );

      // cria um objeto Diario2 e o atribui a diarioJava
      Diario2 diarioJava = new Diario2();
      //diarioJava.a=3;
      //diarioJava.b=4;
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
     
    }
}
