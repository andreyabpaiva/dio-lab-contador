import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("informe o primeiro número: ");
        int parametroUm = sc.nextInt();
        System.out.println("");

        System.out.print("Informe o segundo número: ");
        int parametroDois = sc.nextInt();
        System.out.println("");

        sc.close();

        try{
                
            int diferenca = diferenca(parametroUm, parametroDois);

            for (int i = 1; i <= diferenca; i++){
                System.out.printf("imprimindo o %d%n", i);
            }

        }catch(ParametrosInvalidosException e){
            
           e.printStackTrace();

        }

       
        
    }


    static int diferenca(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois){

            throw new ParametrosInvalidosException("[ERRO]primeiro número precisa ser menor que segundo");
        }

        return parametroDois-parametroUm;

    }
}
