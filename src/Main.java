public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro(
                "Aragorn", 120, 20, 15
        );

        Mago mago = new Mago(
                "Gandalf", 80, 25, 30
        );

        Arqueiro arqueiro = new Arqueiro(
                "Legolas", 90, 3, 25
        );

        System.out.println("\n--- GUERREIRO ---");
        guerreiro.exibirEstado();

        System.out.println("\n--- MAGO ---");
        mago.exibirEstado();

        System.out.println("\n--- ARQUEIRO ---");
        arqueiro.exibirEstado();

        System.out.println("\n--- AÇÕES ESPECÍFICAS ---");

        guerreiro.golpear();

        mago.lancarMagia();
        mago.lancarMagia();
        mago.lancarMagia();

        arqueiro.atirar();
        arqueiro.atirar();
        arqueiro.atirar();
        arqueiro.atirar();

        System.out.println("\n--- AÇÕES HERDADAS DE PERSONAGEM ---");

        guerreiro.receberDano(30);
        guerreiro.recuperarVida(15);
        guerreiro.receberMoedas(50);
        guerreiro.subirNivel();

        mago.receberDano(20);
        mago.recuperarVida(10);
        mago.gastarMoedas(30);

        arqueiro.receberMoedas(20);
        arqueiro.subirNivel();

        System.out.println("\n--- ESTADO FINAL ---");

        guerreiro.exibirEstado();
        mago.exibirEstado();
        arqueiro.exibirEstado();
    }
}