package exercaula03;

public class FotoSensor {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        car1.cor = "Vermelha";
        car1.modelo = "Fusca";
        car1.regularizado = true;
        car1.velocidade = 600;
        car1.status();
        car1.infracao();
    }
    
}
