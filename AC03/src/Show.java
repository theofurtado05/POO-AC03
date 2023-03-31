public class Show extends Evento{
    String artista;

    IngressoVIP ingressoVip;

    
    Show(String nome, String local, int capacidade, Ingresso ingresso, String artista, IngressoVIP ingressoVIP){
        super(nome, local, capacidade, ingresso);
        this.artista = artista;
        this.ingressoVip = ingressoVIP;
    }

    @Override
    public void gravar() {
        System.out.println("Gravando um show!");
    }

    @Override
    public String toString() {
        String msg;
        msg = "Show de " + this.artista + "\n";
        msg += this.nome + "\n";
        msg += "local: " + this.local + "\n";
        msg += "capacidade do show: " + this.capacidade + " pessoas";

        return msg;
    }
}