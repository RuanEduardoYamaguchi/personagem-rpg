public class Arqueiro extends Personagem {

    private int quantidadeFlechas;
    private int precisao;

    public Arqueiro(
            String nome,
            int vidaMaxima,
            int quantidadeFlechas,
            int precisao
    ) {
        super(nome, "Arqueiro", vidaMaxima);

        this.quantidadeFlechas = quantidadeFlechas;
        this.precisao = precisao;
    }

    public int getQuantidadeFlechas() {
        return quantidadeFlechas;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void atirar() {
        if (quantidadeFlechas <= 0) {
            System.out.println(
                    getNome() + " não possui flechas para atacar."
            );
            return;
        }

        quantidadeFlechas--;

        System.out.println(
                getNome() + " atirou uma flecha com precisão "
                        + precisao
                        + "! Flechas restantes: "
                        + quantidadeFlechas
        );
    }

    @Override
    public void exibirEstado() {
        super.exibirEstado();
        System.out.println("Flechas: " + quantidadeFlechas);
        System.out.println("Precisão: " + precisao);
    }
}