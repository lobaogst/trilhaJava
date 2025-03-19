import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
        

        

        String nome , agencia , conta;
        
        
        String resultadonome ="Mario Andrade";
        int resultadoconta = 1021;  
        String resultadoAgencia ="067-8";
        double saldo = 237.48;
        

        Scanner scanner = new Scanner(System.in); // Inicialize o Scanner

        System.out.print("Digite Numero Da Sua Agencia: ");
        agencia = scanner.nextLine();

        

        System.out.print("Digite Numero Da Sua Conta: ");
        conta = scanner.nextLine();
       

        int contaInteiro = Integer.parseInt(conta); // Converte a string 'conta' para inteiro
      

        if (agencia.equals(resultadoAgencia)&& contaInteiro==resultadoconta){

            System.out.println(" Olá "+resultadonome+" Obrigado por criar uma conta em nosso banco sua agencia é "+agencia +" conta"+resultadoconta+" e seu saldo é  "+saldo);
        }
        else{

            System.out.println("digite os dados corretamnte");
        }
       

       
        


        


        
        
       
        



    }
}
