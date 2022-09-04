public class Caneta {

    //Atributo
    static String modelo = "Bic"; //Atributo estatico
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Metodo
    void status(){
        System.out.println("caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Tamanho de ponta? " + this.ponta);
        System.out.println("Capacidade atual(%)? " + this.carga);
        System.out.println("De qual modelo? " + Caneta.modelo); //Utilizando static
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;

    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar.");

        }else{
            System.out.println("Estou rabiscando!");
        }
    }

}
