public class Computador{
    public String marca;
    public int tela;
    private String processador;
    private int armazenamento;
    private boolean carregado;
    
    public Computador(String m, String p, int a){
        this.marca = m;
        this.processador = p;
        this.setArmazenamento(a);
        this.carregar();
    }
    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    public String getProcessador(){
        return this.processador;
    }
    public void setProcessador(String p){
        this.processador = p;
    }
    public int getArmazenamento(){
        return this.armazenamento;
    }
    public void setArmazenamento(int a){
        this.armazenamento = a;
    }
    public void carregar(){
        this.carregado = true;
    }
    public void descarregar(){
        this.carregado = false;
    }
    public void status(){
        System.out.println("A maquina possui as seguintes caracteristicas:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Processador: " + this.getProcessador());
        System.out.println("Armazenamento: " + this.getArmazenamento());
        System.out.println("Carregado: " + this.carregado);
    }
}
