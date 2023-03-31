public class Teatro extends Evento {


    Teatro(String nome, String local, int capacidade, Ingresso ingresso){
        super(nome, local, capacidade, ingresso);
    }

    @Override
    public void gravar() {
        System.out.println("Você não deveria gravar uma peça de teatro...");
    }

    @Override
    public String toString() {
        String msg;
        msg = "Peça de teatro\n";
        msg += this.nome + "\n";
        msg += "local: " + this.local + "\n";
        msg += "capacidade do teatro: " + this.capacidade + " pessoas";
        msg += "\nINGRESSO: " + this.ingresso;

        return msg;
    }
}
