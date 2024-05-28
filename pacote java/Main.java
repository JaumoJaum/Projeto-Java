/* Esta classe instancia as demais classes 
 * Funcoes - Para realizar validações de dados de entrada e imprimir valores dentro de vetores
 * Respostas - Armazena todas as perguntas e respostas
 * Texto - Armazena os textos referentes aos tópicos
 *  Topicos - Armazena os temas a serem tratados
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class Main{

    //Módulo Principal
    public static void main(String[] args) {

        Funcoes objetoFuncoes = new Funcoes();

        Topicos objetoTopicos = new Topicos();

        Texto objetoTexto = new Texto();


        boolean verificaVerdade = objetoFuncoes.parandoExecucao("Deseja iniciar a operação? Digite 'S' ou 'N'\nR: ");

        //Inicia o Quiz
        if(verificaVerdade == true)
            System.out.println("\n\n------------------------------------------------------------------------------------------\n                              Bem vindo ao Quiz Ambiental!!!                              \n------------------------------------------------------------------------------------------\n\n\nO que deseja fazer?");

        while(verificaVerdade == true){
            //Escolher operação
            System.out.print("Digite: 1- Para aprender sobre os Tópicos Ambientais\n        2- Para realizar um Questionário Simples\nR: ");
            String escolha = objetoFuncoes.escolhendo("1", "2");

            System.out.println("\n\n------------------------------------------------------------------------------------------\n");

            //Leitura do Conteúdo
            if(escolha.equals("1")){
                
                

                //Retorna todos os Tópicos
                String[] todosTopicos = objetoTopicos.getAll();

                System.out.println("Tópicos Ambientais:\n");

                //imprime a lista dos seis tópicos
                objetoFuncoes.imprimirValores(todosTopicos, 6);

                System.out.print("\nQual tópico deseja ler?\nR: ");
                String saida = objetoFuncoes.escolhendo("1", "2", "3", "4", "5", "6");

                //calcula a posição do vetor
                //Se o tópico for o 1, a posição será 0
                //Se o tópico for o 6, a posição será 5
                int posicao = Integer.parseInt(saida) - 1;

                //Retorna todos os Textos
                String[] todosTextos = objetoTexto.getAll();

                //Imprime o texto referente a posição desejada
                System.out.println("\n"+todosTextos[posicao]);
                

            //Resposta de perguntas
            }else{
                //instancia a classe Random para gerar um numero aleatorio de 0 a 3
                Random objetoRandom = new Random();
                int numeroAleatorio = objetoRandom.nextInt(4);
                //instancia respostas enviando o numero aleatorio para indicar a pergunta correta
                Respostas objetoRespostas = new Respostas(numeroAleatorio);
                
                //Retorna todos os Tópicos
                String[] todosTopicos = objetoTopicos.getAll();

                System.out.println("\nTópicos Ambientais:");

                //imprime a lista dos seis tópicos
                objetoFuncoes.imprimirValores(todosTopicos, 6);

                System.out.print("\nQual tópico deseja realizar a Pergunta?\nR: ");
                String saida = objetoFuncoes.escolhendo("1", "2", "3", "4", "5", "6");

                //posicao pergunta escolhida referente ao topico
                String posicao = saida;

                //retorna um vetor da classe respostas
                String[] perguntaResposta = objetoRespostas.getQualPergunta(posicao);

                System.out.println("\nResponda:");

                //imprimir alternativas
                objetoFuncoes.imprimirValores(perguntaResposta, 6);
                
                /*a variavel pergunta resposta armazena na posição 0 a resposta
                 * de 1 a 5 as alternativas
                 * em 6 a resposta
                */

                System.out.print("\nR: ");
                //Só deixa o usuário digitar alternativas de A até E
                String alternativa = objetoFuncoes.escolhendo("A", "B", "C", "D", "E");

                //Verifica se a resposta está correta
                if(alternativa.equals(perguntaResposta[6].toUpperCase()))
                    System.out.println("\nParabéns, a resposta está correta!");

                else
                    System.out.println("\nOps! A resposta está incorreta, tente novamente!\n");

                
            }

            System.out.println("\n------------------------------------------------------------------------------------------\n");

            //Sair ou continuar
            verificaVerdade = objetoFuncoes.parandoExecucao("\n\nDeseja continuar no Quiz Ambiental? Digite 'S' ou 'N'\nR: ");
        
        }
        
        System.out.println("\n\n------------------------------------------------------------------------------------------\n                                  OPERAÇÃO FINALIZADA!!!                                  \n------------------------------------------------------------------------------------------\n\n\n");

        
    }
}