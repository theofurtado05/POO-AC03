public class App {
    public static void main(String[] args) throws Exception {
        // Ingresso ingresso1 = new Ingresso();
        // IngressoVIP ingressoVIP = new IngressoVIP();
        
        // ingresso1.valor = 100;
        // ingressoVIP.valor = 100;
        // ingressoVIP.valorAdicional = 30;

        // //INGRESSO e INGRESSO VIP
        // System.out.println("A PAGAR: " + ingresso1.efetuarPagamento());
        // System.out.println("A PAGAR: " + ingressoVIP.efetuarPagamento());


        // //SHOW
        // Show show1 = new Show("Piramide do pablo", "Volta Redonda", 300, ingresso1, "Naldo Benny", ingressoVIP);

        // System.out.println(show1);


        // //Cinema
        // Cinema cinema1 = new Cinema("EVENTO", "Shopping", 150, ingresso1, "Sider", "701", "Comedia");
        // System.out.println(cinema1);


        // //Teatro
        // Teatro teatro1 = new Teatro("EVENTO TEATRO", "Vila STA CECILIA", 120, ingressoVIP);

        // System.out.println(teatro1);



        Ingresso ingresso = new Ingresso();
        IngressoVIP ingressoVIP = new IngressoVIP();

        ingresso.valor = 45;
        System.out.println(ingresso);

        ingressoVIP.valor = 50;
        ingressoVIP.valorAdicional = 15;
        System.out.println(ingressoVIP);

        Cinema cinema = new Cinema("Evento de cinema", "Shopping", 200, ingressoVIP, "CinemaX", "204", "Comedia");
        Show show = new Show("Evento de SHOW", "Ribalta", 450, ingresso, "Alexandre Pires", ingressoVIP);
        Teatro teatro = new Teatro("peça", "local", 150, ingresso);

        cinema.gravar();

        System.out.println(cinema);
        System.out.println(show.verificarCapacidade(100000));
        System.out.println(show.verificarCapacidade(1000));
        System.out.println(show);
        System.out.println(teatro);

        System.out.println(cinema.calcularReceita());
        System.out.println(ingresso.efetuarPagamento());

        
    }
}