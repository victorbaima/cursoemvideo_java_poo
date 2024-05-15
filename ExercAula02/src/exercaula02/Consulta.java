package exercaula02;

public class Consulta {
    int horario;
    String status;
    String especialidade;
    
    void status() {
        System.out.println("Consulta para um " + this.especialidade);
        System.out.println("Marcada para às " + this.horario + "horas");
        System.out.println("Status: " + this.status);
    }
}
