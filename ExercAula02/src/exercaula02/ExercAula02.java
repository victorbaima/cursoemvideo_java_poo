package exercaula02;

public class ExercAula02 {

    public static void main(String[] args) {
        Consulta c1 = new Consulta();
        c1.especialidade = "Neurologista";
        c1.horario = 15;
        c1.status = "Confirmada";
        c1.status();
                
        Paciente p1 = new Paciente();
        p1.nome = "Jose da Silva";
        p1.idade = 46;
        p1.sexo = "M";
    }
    
}
