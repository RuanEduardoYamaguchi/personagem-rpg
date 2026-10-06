public class Personagem {

    private String nome;
    private String classe;
    private int vidaAtual;
    private final int vidaMaxima;
    private int nivel;
    private int moedas;

    public Personagem(String nome, String classe, int vidaMaxima) {
        if (vidaMaxima <= 0) {
            throw new IllegalArgumentException(
                    "A vida máxima deve ser maior que zero."
            );
        }

        this.nome = nome;
        this.classe = classe;
        this.vidaMaxima = vidaMaxima;

        // Valores definidos automaticamente pelo jogo
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.moedas = 100;
    }

    // Nome pode ser consultado e alterado
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Classe pode ser consultada e alterada
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    // Os demais atributos podem apenas ser consultados diretamente
    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getNivel() {
        return nivel;
    }

    public int getMoedas() {
        return moedas;
    }

    public void receberDano(int dano) {
        if (dano < 0) {
            System.out.println("O dano não pode ser negativo.");
            return;
        }

        vidaAtual -= dano;

        if (vidaAtual < 0) {
            vidaAtual = 0;
        }

        System.out.println(nome + " recebeu " + dano + " de dano.");
    }

    public void recuperarVida(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A recuperação não pode ser negativa.");
            return;
        }

        vidaAtual += quantidade;

        if (vidaAtual > vidaMaxima) {
            vidaAtual = vidaMaxima;
        }

        System.out.println(nome + " recuperou vida.");
    }

    public void receberMoedas(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A quantidade não pode ser negativa.");
            return;
        }

        moedas += quantidade;

        System.out.println(nome + " recebeu " + quantidade + " moedas.");
    }

    public void gastarMoedas(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A quantidade não pode ser negativa.");
            return;
        }

        if (quantidade > moedas) {
            System.out.println("Moedas insuficientes.");
            return;
        }

        moedas -= quantidade;

        System.out.println(nome + " gastou " + quantidade + " moedas.");
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nome + " subiu para o nível " + nivel + ".");
    }

    public void exibirEstado() {
        System.out.println("\n--- Estado do personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("Nível: " + nivel);
        System.out.println("Moedas: " + moedas);
    }
}