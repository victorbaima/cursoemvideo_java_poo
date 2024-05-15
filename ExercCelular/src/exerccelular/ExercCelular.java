package exerccelular;

public class ExercCelular {

    public static void main(String[] args) {
        Celular aparelho1 = new Celular();
        aparelho1.marca = "Samsung";
        aparelho1.modelo = "Galaxy S20 FE";
        aparelho1.armazenamento = 96;
        aparelho1.camera = 12;
        aparelho1.conexao = "Wi-Fi";
        aparelho1.status();
    }
    
}
