/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jwcosta
 */
public class Diario2 {
    private String nomeCurso; // nome do curso para esse Diario2
   // public int a;
   // private int b;
   // private Scanner ent;
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

   // exibe uma mensagem de boas-vindas para o usu·rio Diario2
   public void mostraMensagem()
   {  
      // essa instruÁ„o chama getNomeCurso para obter o
      // nome do curso que Diario2 representa
      System.out.printf( "Bem vindo ao curso de :\n%s!\n",
         getNomeCurso() );
     // System.out.println( "valor de a:"+a+ " valor de b: "+b);
   } // termina o mÈtodo mostraMensagem
   
           
}
