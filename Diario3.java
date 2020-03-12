/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwcosta
 */
public class Diario3 {
      private String nomeCurso; // nome do curso para Diario3

   //Construtor que inicializa o nomeCurso sem argumento
   public Diario3()
   {
     
   }//termina construtor

   //Construtor que inicializa o nomeCurso com argumento
   public Diario3(String nome)
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

   // exibe uma mensagem de boas-vindas para o usu·rio Diario3
   public void mostraMensagem()
   {
      // essa instruÁ„o chama getNomeCurso para obter o
      // nome do curso que Diario3 representa
      System.out.printf( "Bem vindo ao curso de :\n%s!\n",
         getNomeCurso() );
   } // termina o mÈtodo mostraMensagem
}
