public class IngressoVIP extends Ingresso{

    double valorAdicional;



    @Override
    public double efetuarPagamento(){
        return calcularValor() - (calcularValor() * 0.42);
    }

    public double calcularValor() {
        return this.valor + this.valorAdicional;
    }

    @Override
    public String toString() {
        return "Valor do ingresso " + this.calcularValor();
    }
}
