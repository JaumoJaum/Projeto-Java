import java.util.Scanner;

public class Funcoes{


    //Imprime 'N' valores no Array
    public void imprimirValores(String[] valores, int contador){
        int resultado = 0;
        for(int i = 0; i < contador; i++){
            System.out.println("\n  " + valores[i]);
        }
    }

    //Só permite que a entrada seja "S" ou "N"
    public boolean parandoExecucao(String texto){
        Scanner scanner = new Scanner(System.in);

        System.out.print(texto);
        String entrada = scanner.nextLine().toUpperCase();


        while(!entrada.equals("N") && !entrada.equals("S")){
            System.out.print("Digite somente 'S' ou 'N': ");
            entrada = scanner.nextLine().toUpperCase();
            
        }

        if(entrada.equals("S"))
            return true;
        else
            return false;

    }

    //-------------------------POLIMORFISMOS DE SOBRECARGA-------------------------
    //Validam a entrada do usuário

    //Só permite que a entrada seja "1" ou "2"
    //principalmente utilizado para escolher se quer realizar o questionário ou ler os tópicos
    public String escolhendo(String escolhaUm, String escolhaDois){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();


        while(!entrada.equals(escolhaUm) && !entrada.equals(escolhaDois)){
            System.out.print("Digite somente '"+escolhaUm+"' ou '"+escolhaDois+"': ");
            entrada = scanner.nextLine().toUpperCase();
            
        }
        
        return entrada;

    }

    //Só permite que a entrada seja "1", "2", "3", "4" ou "5"
    //Principalmente utilizado para as alternativas
    public String escolhendo(String escolhaUm, String escolhaDois, String escolhaTres, String escolhaQuatro, String escolhaCinco){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine().toUpperCase();


        while(!entrada.equals(escolhaUm) && !entrada.equals(escolhaDois) && !entrada.equals(escolhaTres) && !entrada.equals(escolhaQuatro) && !entrada.equals(escolhaCinco)){
            System.out.print("Digite somente '"+ escolhaUm + "', '"+ escolhaDois + "', '"+ escolhaTres + "', '"+ escolhaQuatro + "', '"+ escolhaCinco + "': ");
            entrada = scanner.nextLine().toUpperCase();
            
        }

        return entrada;

    }
    
    //Só permite que a entrada seja "1", "2", "3", "4", "5" ou "6"
    //Principalmente utilizado para os tópicos
    public String escolhendo(String escolhaUm, String escolhaDois, String escolhaTres, String escolhaQuatro, String escolhaCinco, String escolhaSeis){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();


        while(!entrada.equals(escolhaUm) && !entrada.equals(escolhaDois) && !entrada.equals(escolhaTres) && !entrada.equals(escolhaQuatro) && !entrada.equals(escolhaCinco) && !entrada.equals(escolhaSeis)){
            System.out.print("Digite somente '"+ escolhaUm + "', '"+ escolhaDois + "', '"+ escolhaTres + "', '"+ escolhaQuatro + "', '"+ escolhaCinco + "' ou '"+ escolhaSeis + "': ");
            entrada = scanner.nextLine().toUpperCase();
            
        }

        return entrada;

    }
}