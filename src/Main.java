public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro =
                new Guerreiro("Aragorn", 120, 20, 15);

        Mago mago =
                new Mago("Gandalf", 80, 100, 30);

        Arqueiro arqueiro =
                new Arqueiro("Legolas", 90, 20, 25);

        System.out.println("--- Personagens criados ---");
        guerreiro.exibirEstado();
        mago.exibirEstado();
        arqueiro.exibirEstado();

        System.out.println("\n--- Acoes especiais ---");
        guerreiro.golpear();
        mago.lancarMagia();
        arqueiro.atirar();

        System.out.println("\n--- Estado depois das acoes ---");
        guerreiro.exibirEstado();
        mago.exibirEstado();
        arqueiro.exibirEstado();

        System.out.println("\n--- testando os meetodos ---");
        guerreiro.receberDano(40);
        mago.recuperarVida(10);
        arqueiro.receberMoedas(50);
        arqueiro.gastarMoedas(20);
        guerreiro.subirNivel();

        System.out.println("\n--- Estado final ---");
        guerreiro.exibirEstado();
        mago.exibirEstado();
        arqueiro.exibirEstado();
    }
}