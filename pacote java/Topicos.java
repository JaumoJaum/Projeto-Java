public class Topicos{

    private String topicoUm;
    private String topicoDois;
    private String topicoTres;
    private String topicoQuatro;
    private String topicoCinco;
    private String topicoSeis;
    
    //Construtor atribui os topicos na classe
   Topicos(){
    String Topico = "1-Aquecimento Global";
    setTopicoUm(Topico);

    Topico = "2-Poluição da Água";
    setTopicoDois(Topico);

    Topico = "3-Desmatamento";
    setTopicoTres(Topico);

    Topico = "4-Poluiçao do Ar";
    setTopicoQuatro(Topico);

    Topico = "5-Gestão de Resíduos";
    setTopicoCinco(Topico);
    
    Topico = "6-Escassez de Recursos Naturais";
    setTopicoSeis(Topico);
   }

   public String[] getAll(){
    String[] todosTopicos = {getTopicoUm(),getTopicoDois(),getTopicoTres(),getTopicoQuatro(),getTopicoCinco(),getTopicoSeis()};
    return todosTopicos;
   }

    //Set´s

   public void setTopicoUm(String entrada){
    this.topicoUm = entrada;
   }

   public void setTopicoDois(String entrada){
    this.topicoDois = entrada;
   }

   public void setTopicoTres(String entrada){
    this.topicoTres = entrada;
   }

   public void setTopicoQuatro(String entrada){
    this.topicoQuatro = entrada;
   }

   public void setTopicoCinco(String entrada){
    this.topicoCinco = entrada;
   }

   public void setTopicoSeis(String entrada){
    this.topicoSeis = entrada;
   }

   //Get's

   public String getTopicoUm(){
    return this.topicoUm;
   }

   public String getTopicoDois(){
    return this.topicoDois;
   }

   public String getTopicoTres(){
    return this.topicoTres;
   }

   public String getTopicoQuatro(){
    return this.topicoQuatro;
   }

   public String getTopicoCinco(){
    return this.topicoCinco;
   }

   public String getTopicoSeis(){
    return this.topicoSeis;
   }
}