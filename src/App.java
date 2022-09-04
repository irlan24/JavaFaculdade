public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta(); //Instancia obj 1
        c1.cor = "Azul";
        c1.carga=80;
        c1.ponta = 0.5f;

        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta(); //Instancia obj 2
        c2.cor = "Vermelha";
        c2.carga = 30;
        c2.ponta = 1.0f;

        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
