public abstract class Evento {
    String nome;
    String local;
    int capacidade;

    Ingresso ingresso;

    Evento(String nome, String local, int capacidade, Ingresso ingresso) {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
        this.ingresso = ingresso;
    }

    
    public abstract void gravar();

    public double calcularReceita(){
        return this.capacidade *  this.ingresso.valor;
    }

    public boolean verificarCapacidade(int numPessoas) {
        if (numPessoas <= this.capacidade) {
            return true;
        }
        return false;
    }
}