/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */ 
/**
 *
 * @author jwcosta
 */
import java.util.Scanner;
public class DiarioAplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cria Scanner para obter entrada a partir da janela de comando
      Diario DiarioJava;
      Scanner entrada = new Scanner( System.in );

      // cria um objeto Diario e o atribui a DiarioJava
      DiarioJava = new Diario();
      Diario DiarioSO = new Diario();

//Diario.setx();
        
      // prompt para entrada do nome do curso
      System.out.println( "Entre o nome do Curso: " );
      String nomeCurso = entrada.nextLine(); // lÍ uma linha de texto
      System.out.println(); // gera saÌda de uma linha em branco
      DiarioJava.setx();
      // chama mÈtodo displaMessage de DiarioJava
      // e passa nomeCurso como um argumento
      DiarioJava.mostraMensagem( nomeCurso );
     // DiarioSO.setx();
      DiarioSO.mostraMensagem( nomeCurso );
    }
}
