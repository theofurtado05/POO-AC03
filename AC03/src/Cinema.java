public class Cinema extends Evento {
    String cinema, sala, genero;

    Cinema(String nome, String local, int capacidade, Ingresso ingresso, String cinema, String sala, String genero){
        super(nome, local, capacidade, ingresso);
        this.cinema = cinema;
        this.sala = sala;
        this.genero = genero;
    }


    @Override
    public void gravar() {
        System.out.println("Você não deveria gravar um filme...");
    }

    @Override
    public String toString() {
        String msg;
        msg = "Filme " + this.nome + "\n";
        msg += "Cinema " + this.cinema + ", sala " + this.sala + "\n";
        msg += "Gênero: " + this.genero + "\n";
        msg += "local: " + this.local + "\n";
        msg += "capacidade da sala: " + this.capacidade + " pessoas";

        return msg;
    }
}
