public class Arqueiro extends Personagem {

    private int flechas;
    private int precisao;

    public Arqueiro(String nome, int vidaMaxima, int flechas, int precisao) {
        super(nome, "Arqueiro", vidaMaxima);
        this.flechas = flechas;
        this.precisao = precisao;
    }

    public void atirar() {
        if (flechas > 0) {
            flechas--;
            System.out.println(
                    getNome() + " atirou uma flecha. Precisão: "
                            + precisao + ". Flechas restantes: " + flechas
            );
        } else {
            System.out.println(getNome() + " não tem flechas.");
        }
    }
}