package exerccelular;

public class Celular {
    //ATRIBUTOS
    String marca, modelo, conexao, contato;
    int armazenamento, camera, carga, volume;
    
    void status(){
        System.out.println("O celular é um " + this.modelo + " da " + this.marca);
        System.out.println("Tem capacidade de armazenamento de " + this.armazenamento + "GB");
        System.out.println("Possui câmera de " + this.camera + "MP");
        System.out.println("E tecnologia de conexão " + this.conexao);
    }
    
    void carregar(){
            this.carga = 100;
    }
}
