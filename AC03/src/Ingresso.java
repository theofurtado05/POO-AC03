public class Ingresso implements Pagamento {
    double valor;

    @Override
    public double efetuarPagamento(){
        return valor - (valor * 0.42);
    }

    @Override
    public String toString() {
        return "Valor do ingresso: " + this.valor;
    }
}
