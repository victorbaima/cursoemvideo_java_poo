package exercaula07;

public class ExercAula07 {

    public static void main(String[] args) {
        Lutador[] l = new Lutador[7];
        
        l[0] = new Lutador("Anderson Silva", "Brasileiro", 42, 1.88f, 87, 46, 2, 0);
        
        l[0].apresentar();
    }
}
