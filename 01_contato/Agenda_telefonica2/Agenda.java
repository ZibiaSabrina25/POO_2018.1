import java.util.Scanner;
import java.util.ArrayList;
public class Agenda {
	 public static void main(String[] args){
         String[] nome = new String[3];
         Scanner scan = new Scanner(System.in);
         int i = 0;
         ArrayList<String> id = new ArrayList<String>();
         int telefone = 8;
       
         
         for(i=0 ; i < 3 ; i++){
             System.out.print("\nIniciar com o nome " + i + ": ");
             nome[i] = scan.nextLine();
             
             System.out.print("\nInforme o identificador " + id);
             Scanner sc = new Scanner(System.in);
             
             if (id.get(i).equals(id))
             {
             	System.out.println("Identificador ja existe!");
             	return;
             }else {
             	
             	System.out.println("Digite o telefone ");
             	Scanner sca = new Scanner(System.in);
                 telefone = sca.nextInt();
           
             }
            
         }
         for(i=0 ; i< 3; i++){
             System.out.println("\nNome" + i + "Add: " +nome[i]);
             System.out.println("\nIdentificador e " + id);
             System.out.println("\ntelefone e " + telefone);
         }


 }
}
