import java.util.Random;

public class Respostas{

    //Perguntas
    private String PerguntaUm;
    private String PerguntaDois;
    private String PerguntaTres;
    private String PerguntaQuatro;
    private String PerguntaCinco;
    private String PerguntaSeis;

    //Respostas
    private String temaUm[] = new String[6];
    private String temaDois[] = new String[6];
    private String temaTres[] = new String[6];
    private String temaQuatro[] = new String[6];
    private String temaCinco[] = new String[6];
    private String temaSeis[] = new String[6];
    
    //Construtor atribui os temas na classe
    //O numero aleatorio indica a pergunta e as alternativas correspondentes por meio de posição do vetor ao utilizar os set's de pergunta e resposta
    //O vetor de perguntas armazena 4 variações do enunciado, cabe ao numero aleatório apontar a posição de um enunciado
    //Semelhante as perguntas, as respostas são armazenadas em matrizes, cabe ao nuúmero direcionar qual linha contém o conjunto de respostas referente à pergunta
    //vetorPerguntasTopicoUm[Numero aleatorio]              -             vetorRespostasTopicoUm[Numero aleatorio][6]
   Respostas(int numeroAleatorio){

    //PERGUNTAS----------------------------------------------------------------------------
    //primeira
    String perguntaUm[] = new String[4];
    perguntaUm[0] = "Dentre as opções abaixo, qual é considerada como consequência do aquecimento global?";
    perguntaUm[1] = "Qual dos seguintes gases é considerado um dos principais responsáveis pelo efeito"+
                    "\nestufa e contribui significativamente para o aquecimento global?";
    perguntaUm[2] = "Qual é o principal efeito do aumento do nível do mar causado pelo aquecimento global?";
    perguntaUm[3] = "Qual acordo internacional estabelecido em 1997 definiu metas para redução das "+
                    "\nemissões de gases de efeito estufa, especialmente para países desenvolvidos?";
    setPerguntaUm(perguntaUm[numeroAleatorio]);


    //segunda
    String perguntaDois[] = new String[4];
    perguntaDois[0] = "Qual é um dos principais poluentes aquáticos mencionados no texto sobre poluição da água?";
    perguntaDois[1] = "Qual evento é mencionado como um dos mais notórios relacionados à poluição da água no texto?";
    perguntaDois[2] = "Além das doenças gastrointestinais e problemas de pele, qual outra condição de saúde é"+
                      "\nmencionada como consequência da contaminação da água potável?";
    perguntaDois[3] = "Qual é uma das principais fontes de poluição aquática mencionadas no texto?";
     
    setPerguntaDois(perguntaDois[numeroAleatorio]);


    //terceira
    String perguntaTres[] = new String[4];
    perguntaTres[0] = "Assinale a alternativa incorreta:";
    perguntaTres[1] = "Qual é uma das consequências mencionadas do desmatamento para a biodiversidade?";
    perguntaTres[2] = "Além da diminuição da biodiversidade, qual outro impacto ambiental direto do desmatamento"+
                      "\né mencionado no texto?";
    perguntaTres[3] = "Qual é o papel das árvores mencionado no texto em relação às mudanças climáticas?";
     
    setPerguntaTres(perguntaTres[numeroAleatorio]);


    //quarta
    String perguntaQuatro[] = new String[4];
    perguntaQuatro[0] = "Qual das alternativas abaixo NÃO são consequências geradas pela poluição do ar?";
    perguntaQuatro[1] = "A poluição do ar é um dos problemas ambientais mais graves enfrentados atualmente,"+
                        "\ntrazendo impactos significativos na saúde humana, na biodiversidade e no clima. Diante desse"+
                        "\ncontexto,qual medida seria MAIS eficiente para mitigar os efeitos da poluição do ar?";
    perguntaQuatro[2] = "Qual das afirmativas abaixo descreve os principais impactos da poluição do ar na saúde"+
                        "\nhumana e no meio ambiente e suas respectivas soluções para reduzir esses problemas.";
    perguntaQuatro[3] = "Qual das alternativas abaixo são ações que contribuem para a poluição do ar?";
     
    setPerguntaQuatro(perguntaQuatro[numeroAleatorio]);



    //quinta
    String perguntaCinco[] = new String[4];
    perguntaCinco[0] = "É correto afirmar que a Gestão de Resíduos trata-se de: \n   I - Reciclagem.\n"+
                        "   II - Descarte adequado de resíduos que são considerados tóxicos.\n"+
                        "   III - Controle da disposição de aterros sanitários.\n"+
                        "   IV - Compostagem.\n"+
                        "   V - Conscientizar a população a respeito da importância dos cuidados necessários.";
    perguntaCinco[1] = "Qual alternativa abaixo melhor descreve a importância da gestão de resíduos sólidos?";
    perguntaCinco[2] = "Marque a alternativa que melhor sugere uma medida prática para aprimorar essa gestão:";
    perguntaCinco[3] = "De quem é a responsabilidade de gerenciamento e contribuição de aprimoramentos para"+
                        "\nesse problema que é a má gestão de resíduos?";
     
    setPerguntaCinco(perguntaCinco[numeroAleatorio]);


    //sexta
    String perguntaSeis[] = new String[4];
    perguntaSeis[0] = "Quais são os tipos de recursos naturais e suas respectivas características?";
    perguntaSeis[1] = "Qual alternativa melhor descreve os impactos que a escassez dos recursos naturais"+
                      "\ntraz para a sociedade e a biodiversidade mundial.";
    perguntaSeis[2] = "Qual das alternativas abaixo seria uma solução para a questão levantada?";
    perguntaSeis[3] = "Qual a principal diferença entre os recursos naturais renováveis e não renováveis?";
     
    setPerguntaSeis(perguntaSeis[numeroAleatorio]);
    
    //RESPOSTAS--------------------------------------------------------------------------------------

    //primeira
    String textoUm[][] = new String[4][6];
    textoUm[0][0]= "a) Aumento da camada de ozônio";
    textoUm[0][1]= "b) Derretimento das calotas polares";
    textoUm[0][2]= "c) Redução da frequência de eventos climáticos extremos";
    textoUm[0][3]= "d) Estabilização das temperaturas globais";
    textoUm[0][4]= "e) Diminuição na intensidade dos furacões";
    //aternativa correta
    textoUm[0][5]= "b";

    textoUm[1][0]= "a) Nitrogênio (N2)";
    textoUm[1][1]= "b) Metano (CH4)";
    textoUm[1][2]= "c) Oxigênio (O2)";
    textoUm[1][3]= "d) Vapor d'água (H2O)";
    textoUm[1][4]= "e) Dióxido de enxofre (SO2)";
    //aternativa correta
    textoUm[1][5]= "b";

    textoUm[2][0]= "a) Aumento da biodiversidade marinha.";
    textoUm[2][1]= "b) Aumento na temperatura das águas oceânicas.";
    textoUm[2][2]= "c) Diminuição da acidez dos oceanos.";
    textoUm[2][3]= "d) Inundação de áreas costeiras.";
    textoUm[2][4]= "e) Diminuição da circulação oceânica.";
    //aternativa correta
    textoUm[2][5]= "d";

    textoUm[3][0]= "a) Acordo de Paris";
    textoUm[3][1]= "b) Protocolo de Montreal";
    textoUm[3][2]= "c) Protocolo de Kyoto";
    textoUm[3][3]= "d) Convenção sobre Diversidade Biológica";
    textoUm[3][4]= "e) Acordo de Haia";
    //aternativa correta
    textoUm[3][5]= "c";
    setTemaUm(textoUm[numeroAleatorio]);

    //segunda
    String textoDois[][] = new String[4][6];
    textoDois[0][0]= "a) Dióxido de carbono";
    textoDois[0][1]= "b) Poluentes atmosféricos";
    textoDois[0][2]= "c) Efluentes domésticos";
    textoDois[0][3]= "d) Metais pesados";
    textoDois[0][4]= "e) Fertilizantes agrícolas";
    //aternativa correta
    textoDois[0][5]= "d";

    textoDois[1][0]= "a) Desastre nuclear de Chernobyl.";
    textoDois[1][1]= "b) Vazamento de produtos químicos tóxicos em Bhopal.";
    textoDois[1][2]= "c) Derramamento de petróleo do Exxon Valdez.";
    textoDois[1][3]= "d) Explosão da plataforma de petróleo Deepwater Horizon.";
    textoDois[1][4]= "e) Despejo de lixo plástico no Oceano Pacífico.";
    //aternativa correta
    textoDois[1][5]= "c";

    textoDois[2][0]= "a) Doenças respiratórias.";
    textoDois[2][1]= "b) Diabetes.";
    textoDois[2][2]= "c) Hipertensão.";
    textoDois[2][3]= "d) Câncer.";
    textoDois[2][4]= "e) Artrite.";
    //aternativa correta
    textoDois[2][5]= "d";

    textoDois[3][0]= "a) Efluentes domésticos.";
    textoDois[3][1]= "b) Poeira atmosférica.";
    textoDois[3][2]= "c) Poluição sonora.";
    textoDois[3][3]= "d) Emissões de gases de efeito estufa.";
    textoDois[3][4]= "e) Poluição luminosa.";
    //aternativa correta
    textoDois[3][5]= "a";
    setTemaDois(textoDois[numeroAleatorio]);

    //terceira
    String textoTres[][] = new String[4][6];
    textoTres[0][0]= "a) O desmatamento não tem um impacto limitado apenas nas comunidades indígenas, afetando outras áreas";
    textoTres[0][1]= "b) O desmatamento é uma prática que visa exclusivamente o desenvolvimento econômico das comunidades locais";
    textoTres[0][2]= "c) A remoção da cobertura vegetal causada pelo desmatamento é responsável pela diminuição da qualidade da água local";
    textoTres[0][3]= "d) A prática do desmatamento influencia na biodiversidade e nos padrões climáticos";
    textoTres[0][4]= "e) O desmatamento contribui para o aumento das emissões de gases de efeito estufa";
    //aternativa correta
    textoTres[0][5]= "b";

    textoTres[1][0]= "a) Diminuição da qualidade do solo.";
    textoTres[1][1]= "b) Redução da diversidade genética.";
    textoTres[1][2]= "c) Aumento da absorção de dióxido de carbono.";
    textoTres[1][3]= "d) Melhoria na adaptação das espécies.";
    textoTres[1][4]= "e) Diminuição das emissões de gases de efeito estufa.";
    //aternativa correta
    textoTres[1][5]= "b";

    textoTres[2][0]= "a) Aumento da cobertura vegetal.";
    textoTres[2][1]= "b) Redução das chuvas ácidas.";
    textoTres[2][2]= "c) Erosão do solo.";
    textoTres[2][3]= "d) Diminuição das concentrações de dióxido de carbono na atmosfera.";
    textoTres[2][4]= "e) Reflorestamento natural.";
    //aternativa correta
    textoTres[2][5]= "c";

    textoTres[3][0]= "a) Aumento das temperaturas globais.";
    textoTres[3][1]= "b) Redução das emissões de gases de efeito estufa.";
    textoTres[3][2]= "c) Aumento da atividade sísmica.";
    textoTres[3][3]= "d) Aumento da acidez dos oceanos.";
    textoTres[3][4]= "e) Diminuição da biodiversidade.";
    //aternativa correta
    textoTres[3][5]= "b";
    setTemaTres(textoTres[numeroAleatorio]);


    //quarta
    String textoQuatro[][] = new String[4][6];
    textoQuatro[0][0]= "a)	Deterioração da qualidade do ar.";
    textoQuatro[0][1]= "b)	Condições precárias na qualidade do ar em áreas rurais, afetando diretamente o solo e a produção agrária.";
    textoQuatro[0][2]= "c)	Partículas de fuligem, como por exemplo, a PM2,5 que se inalada por seres humanos, causa graves deficiências\nna saúde, podendo ocasionar a morte.";
    textoQuatro[0][3]= "d)	Pode ser considerada, atualmente, o maior risco ambiental que afeta a saúde humana.";
    textoQuatro[0][4]= "e)	Aumento das chances de ter um ataque cardíaco";
    //aternativa correta
    textoQuatro[0][5]= "b";

    textoQuatro[1][0]= "a) Aumentar o uso de veículos elétricos como solução para reduzir as emissões de gases poluentes.";
    textoQuatro[1][1]= "b) Implementar mais áreas verdes e parques urbanos, para assim absorver os poluentes atmosféricos e\nmelhorar a qualidade do ar.";
    textoQuatro[1][2]= "c) Reduzir a queima de combustíveis fósseis, promovendo o uso de energias renováveis e políticas de\neficiência energética.";
    textoQuatro[1][3]= "d) Desenvolver tecnologias avançadas de filtragem de ar para a aplicação em ambientes fechados\n(residências e escritórios).";
    textoQuatro[1][4]= "e) Implementar regulamentações mais rigorosas para empresas e indústrias, controlando as emissões de\npoluentes das mesmas e incentivando práticas sustentáveis.";
    //aternativa correta
    textoQuatro[1][5]= "c";

    textoQuatro[2][0]= "a) A poluição do ar causa na saúde humana doenças respiratórias, cardiovasculares e até mesmo"+
    "\ncâncer; já no meio ambiente esses problemas são retratados como a deterioração do ar e para o aquecimento global. Uma"+
    "\nmedida que deve ser tomada é implementar regulamentação mais rigorosas para controlar as emissões de poluentes, promovendo"+
    "\no uso de tecnologias limpas e renováveis.";
    textoQuatro[2][1]= "b) A poluição do ar não apresenta impactos significativos para a saúde humana, portanto não\nsão necessárias medidas específicas para reduzir esse problema.";
    textoQuatro[2][2]= "c) A poluição do ar afeta apenas áreas urbanas e densamente povoadas, em compensação,"+
    "\nnão apresenta riscos para as regiões rurais. Assim sendo, a solução é deslocar as indústrias para áreas menos habitadas.";
    textoQuatro[2][3]= "d) A poluição do ar e da atmosfera é algo inevitável e não há ações práticas que possam ser"+
    "\ntomadas para reduzi-la. A melhor abordagem, no caso, seria focas em tratamentos médicas para os problemas relacionados\na saúde humana causados pela poluição.";
    textoQuatro[2][4]= "e)	A poluição do ar é causada por fenômenos naturais, como por exemplo erupções vulcânicas, e não por"+
                        "\natividades humanas. Uma possível solução para a poluição do ar seria o monitoramento contínuo desses fenômenos e a implementação"+
                        "\nde planos de evacuação em áreas de risco.";
    //aternativa correta
    textoQuatro[2][5]= "a";

    textoQuatro[3][0]= "a) Impacto das queimadas florestais e queima de combustíveis, que geram uma grande emissão de\ncarbono e poluentes na atmosfera.";
    textoQuatro[3][1]= "b) Maquinário usado em áreas rurais para o controle de qualidade da terra, maquinas essas que\ngeram poluentes para o ar, tornando as áreas rurais as regiões mais poluentes.";
    textoQuatro[3][2]= "c) Política e recuperação econômica, que por meio da má gestão dessa situação, acaba alavancando\nproblemas a população e meio ambiente.";
    textoQuatro[3][3]= "d) Apenas a indústria pode levar culpa por tal acontecimento, já que é somente por elas que gases\npoluentes e tóxicos são emitidos na atmosfera.";
    textoQuatro[3][4]= "e) Má gestão e ação por parte da população, já que apenas a mesma pode ter o controle e fazer a\ndiferença nesses momentos.";
    //aternativa correta
    textoQuatro[3][5]= "a";
    setTemaQuatro(textoQuatro[numeroAleatorio]);


    //quinta
    String textoCinco[][] = new String[4][6];
    textoCinco[0][0]= "a) Apenas I, II e IV.";
    textoCinco[0][1]= "b) Apenas II e IV.";
    textoCinco[0][2]= "c) II, III e V.";
    textoCinco[0][3]= "d) Todas menos a III.";
    textoCinco[0][4]= "e) Todas estão corretas.";
    //aternativa correta
    textoCinco[0][5]= "e";

    textoCinco[1][0]= "a) A gestão de resíduos é fundamental para evitar a contaminação do meio ambiente e proteger a saúde pública.";
    textoCinco[1][1]= "b) A gestão desses resíduos não deve ser considerada um relevante, já que os mesmos podem ser facilmente"+
                      "\neliminados em aterros sanitários sem causar danos ao meio ambiente.";
    textoCinco[1][2]= "c) O processo deve se concentrar apenas na parte de incineração de resíduos, a fim de reduzir o volume\ndos memos e gerar energia.";
    textoCinco[1][3]= "d) É um problema solucionável devido a falta de tecnologias adequadas e recursos financeiros.";
    textoCinco[1][4]= "e) Responsabilidade exclusiva das autoridades governamentais e não requer alguma ação por parte da população.";
    //aternativa correta
    textoCinco[1][5]= "a";

    textoCinco[2][0]= "a) Não são necessárias medidas adicionais para melhorar a gestão de resíduos, já que a falta dessa"+
                      "\ngestão não afeta diretamente a sociedade e o meio ambiente.";
    textoCinco[2][1]= "b) Implementação de programas de reciclagem e coleta seletiva, incentivando sempre a separação"+
                      "\nadequada dos resíduos por parte dos cidadãos e a salientando a importância da redução e reutilização\ndos materiais.";
    textoCinco[2][2]= "c) Incineração de resíduos sólidos, sendo a abordagem mais eficiente e econômica.";
    textoCinco[2][3]= "d) mplementar políticas e regulamentações mais rigorosas para a sociedade, como multas caso o\nprocedimento correto não seja seguido.";
    textoCinco[2][4]= "e) Por meio de campanhas de conscientização e educação pública.";
    //aternativa correta
    textoCinco[2][5]= "b";

    textoCinco[3][0]= "a) Apenas dos poderes governamentais, que devem centralizar o problema a fim de elimina-lo de"+
                      "\nvez, assim melhorando a saúde e qualidade de vida da população.";
    textoCinco[3][1]= "b) Das grandes indústrias e do governo municipal, que têm maior poder de atuação e voz na sociedade,"+
                      "\ntendo força apenas para alertar o povo das consequências geradas pela falta de cuidado e gestão dos resíduos.";
    textoCinco[3][2]= "c) Da população e do governo, por serem os que mais consomem e consequentemente geram mais resíduos.";
    textoCinco[3][3]= "d) As ações só podem ser tomadas por meio da população e das grandes indústrias, já o governo só"+
                      "\nconsegue atuar na parte de conscientização e divulgação do problema em questão.";
    textoCinco[3][4]= "e) É responsabilidade dos poderes governamentais, das indústrias e da população, que devem atuar"+
                      "\nde modo conjunto para que á gestão seja efetiva para todas as partes da sociedade e maio ambiente.";
    //aternativa correta
    textoCinco[3][5]= "e";
    setTemaCinco(textoCinco[numeroAleatorio]);


    //sexta
    String textoSeis[][] = new String[4][6];
    textoSeis[0][0]= "a) Renováveis: não se esgota a curto prazo, mas sim a longo prazo;\n"+
                    "Não renováveis: possuem apenas uma quantidade limitada, se esgotando com facilidade,\ne sem chance de algum dia voltarem.";
    textoSeis[0][1]= "b) Renováveis: não se esgota, mas sim se renova, porém de forma lenta;\n"+
                    "Não renováveis: possuem apenas uma quantidade limitada a curto prazo, e podem demorar\n500 anos para se recompor.";
    textoSeis[0][2]= "c) Renováveis: não se esgota, mas sim se renova, porém de forma rápida; \n"+
                    "Não renováveis: possuem apenas uma quantidade limitada a curto prazo, e podem demorar\naté meio milênio para se recompor.";
    textoSeis[0][3]= "d) Renováveis: demora mais tempo que os recursos não renováveis, mas se\n"+
                    "esgota ao decorrer das ações humanas;\nNão renováveis: possuem apenas uma quantidade"+
                    "limitada, porém demora para se esgotar, e sem chance de algum dia voltarem.";
    textoSeis[0][4]= "e) Renováveis: não se esgota, e só a intervenção humana pode auxiliar o processo de renovação deles;\n"+
                    "Não renováveis: possuem apenas uma quantidade limitada a curto prazo, e podem demorar\naté meio milênio para se recompor.";
    //aternativa correta
    textoSeis[0][5]= "c";

    textoSeis[1][0]= "a) Pode levar a conflitos entre nações e comunidades, além de contribuir diretamente para o esgotamento de ecossistemas.";
    textoSeis[1][1]= "b) A escassez de tais recursos não é uma preocupação, pois sempre haverá meios tecnológicos que encontrarão soluções alternativas.";
    textoSeis[1][2]= "c) É um problema exclusivo de países em desenvolvimento, portanto não afeta regiões já tomadas pela industrialização.";
    textoSeis[1][3]= "d) Pode ser considerada um fenômeno temporário e auto controlável, uma vez que todos os recursos são renováveis\ne se regeneram ao decorrer do tempo.";
    textoSeis[1][4]= "e) É uma situação inevitável dado ao crescimento populacional e o consumo excessivo.";
    //aternativa correta
    textoSeis[1][5]= "e";

    textoSeis[2][0]= "a) a)	Promover o uso sustentável desses recursos por meio da conservação dos mesmos, e também por políticas agrícolas"+
                     "\nsustentável e investimentos em tecnologias de uso eficiente de recursos.";
    textoSeis[2][1]= "b) Não são necessárias medidas adicionais para lidar com esse problema, já que os recursos são auto renováveis.";
    textoSeis[2][2]= "c) Uma medida para lidar com a escassez de recursos seria a redistribuição equitativa dos recursos entre outros países.";
    textoSeis[2][3]= "d) d)	A melhor abordagem seria focar em medidas para aumentar a eficiência no uso dos recursos e promover a economia"+
                     "\ncircular, onde os recursos são reutilizados e reciclados continuamente.";
    textoSeis[2][4]= "e) Deixar os recursos se esgotarem, assim os mesmos porem se auto renovarem de forma saudável para a população e\no meio ambiente.]";
    //aternativa correta
    textoSeis[2][5]= "d";

    textoSeis[3][0]= "a) Enquanto os não renováveis não dependem da ação do homem para se produzirem novamente, os renováveis precisam"+
                     "\nde uma intervenção humana para que o processo de regeneração seja feito.";
    textoSeis[3][1]= "b) Os renováveis, como o próprio nome diz, se auto renova com o passar do tempo, já os não renováveis não"+
                     "\nconseguem se reproduzir tão facilmente, podendo chegar aa 500 anos para se recompor.";
    textoSeis[3][2]= "c) Os recursos renováveis dependem somente da ação humana para se renovarem, já os não renováveis não se renovam\nem hipótese alguma.";
    textoSeis[3][3]= "d) Por mais que tenham nomes diferentes, ambos recursos correm risco de se esgotar, portanto, no final se encaixam\nna mesma categoria.";
    textoSeis[3][4]= "e) Os renováveis, como o próprio nome diz, se auto renova com o passar do tempo, já os não renováveis não se renovam"+
                     "\nnem por interferência humana e nem ao longo dos anos.";
    //aternativa correta
    textoSeis[3][5]= "b";
    setTemaSeis(textoSeis[numeroAleatorio]);

   }
   

   public String[] getQualPergunta(String perguntaNum){
    //Armazena na posição 0, a pergunta. Nas posições de 1 a 5 as alternativas. Na posição 6, a resposta
    //{"Pergunta UM", "A", "B", "C", "D", "E", "Alternativa correta"}
    if(perguntaNum.equals("1")){
        String[] lista = getTemaUm();

        String[] saida =  {getPerguntaUm(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
        return saida;
        
    }else{
        if(perguntaNum.equals("2")){
            String[] lista = getTemaDois();

            String[] saida = {getPerguntaDois(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
            return saida;
        }else{
            if(perguntaNum.equals("3")){
                String[] lista = getTemaTres();
                
                String[] saida = {getPerguntaTres(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};       
                return saida;
           }else{
                if(perguntaNum.equals("4")){
                    String[] lista = getTemaQuatro();
                    
                    String[] saida = {getPerguntaQuatro(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
                    return saida;    
                }else{
                    if(perguntaNum.equals("5")){
                        String[] lista = getTemaCinco();
                        
                        String[] saida = {getPerguntaCinco(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};  
                        return saida;  
                    }else{
                            String[] lista = getTemaSeis();
                            
                            String[] saida = {getPerguntaSeis(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
                            return saida;
                        
                    }
                }
           }
        }

    }
 
   }


   //Set´s Perguntas

   public void setPerguntaUm(String entrada){
    this.PerguntaUm = entrada;
   }

   public void setPerguntaDois(String entrada){
    this.PerguntaDois = entrada;
   }

   public void setPerguntaTres(String entrada){
    this.PerguntaTres = entrada;
   }

   public void setPerguntaQuatro(String entrada){
    this.PerguntaQuatro = entrada;
   }

   public void setPerguntaCinco(String entrada){
    this.PerguntaCinco = entrada;
   }

   public void setPerguntaSeis(String entrada){
    this.PerguntaSeis = entrada;
   }

    //Set´s Respostas

   public void setTemaUm(String entrada[]){
    this.temaUm = entrada;
   }

   public void setTemaDois(String entrada[]){
    this.temaDois = entrada;
   }

   public void setTemaTres(String entrada[]){
    this.temaTres = entrada;
   }

   public void setTemaQuatro(String entrada[]){
    this.temaQuatro = entrada;
   }

   public void setTemaCinco(String entrada[]){
    this.temaCinco = entrada;
   }

   public void setTemaSeis(String entrada[]){
    this.temaSeis = entrada;
   }

   //Get's Perguntas

   public String getPerguntaUm(){
    return this.PerguntaUm;
   }

   public String getPerguntaDois(){
    return this.PerguntaDois;
   }

   public String getPerguntaTres(){
    return this.PerguntaTres;
   }

   public String getPerguntaQuatro(){
    return this.PerguntaQuatro;
   }

   public String getPerguntaCinco(){
    return this.PerguntaCinco;
   }

   public String getPerguntaSeis(){
    return this.PerguntaSeis;
   }

   //Get's Respostas

   public String[] getTemaUm(){
    return this.temaUm;
   }

   public String[] getTemaDois(){
    return this.temaDois;
   }

   public String[] getTemaTres(){
    return this.temaTres;
   }

   public String[] getTemaQuatro(){
    return this.temaQuatro;
   }

   public String[] getTemaCinco(){
    return this.temaCinco;
   }

   public String[] getTemaSeis(){
    return this.temaSeis;
   }
}