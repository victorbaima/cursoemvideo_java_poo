package exercaula03;

public class Carro {
    public String modelo;
    public String cor;
    private int chassi;
    private int renavan;
    public int velocidade;
    protected boolean regularizado;
    public void status() {
        System.out.println("O veículo " + this.modelo + " de cor " + this.cor + " foi registrado com velocidade de " + this.velocidade + "km/h.");
    }
    public void infracao() {
        if(this.velocidade > 80){
            System.out.println("Infração registrada por excesso de velocidade!");
        }
        if(this.regularizado == false) {
            System.out.println("O veículo possui irregularidades!");
        } else {
            System.out.println("Veículo em situação regular!");
        }
    }
}
