package ultraemojicombat;

import java.util.Random;

public class Luta {
    // ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // MÉTODOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1.getNome()!= l2.getNome()){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);    // GERA 3 RESULTADOS ALEATÓRIOS: 0, 1 OU 2.
            switch(vencedor){
                case 0: System.out.println("A luta empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
                case 1: System.out.println(this.desafiado.getNome() + " ganhou!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
                case 2: System.out.println(this.desafiante.getNome() + " ganhou!");
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
            }
            
        } else {
            System.out.println("A luta não poode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
