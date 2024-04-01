import java.util.Random;

public class Jogador {
    private int vida;
    private int ataque;
    private int defesa;

    public Jogador() {

        this.vida = 20;
        this.defesa = gerarValoresAleatorios();
        this.ataque = gerarValoresAleatorios();
    }

    private int gerarValoresAleatorios() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida <= 0 ? 0 : vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void atacar(Inimigo inimigo) {
        int defesaInimigo = inimigo.getDefesa();
        int vidaInimigo = inimigo.getVida();
        int ataqueJogador = getAtaque();

        System.out.println("Ataque Jogador: " + ataqueJogador);
        System.out.println("Defesa Inimigo: " + defesaInimigo);

        if (ataqueJogador > defesaInimigo) {
            vidaInimigo = vidaInimigo - (ataqueJogador - defesaInimigo);
            inimigo.setVida(vidaInimigo);
            System.out.println("\nPontos de vida Inimigo: " + vidaInimigo);
        } else {
            System.out.println("\nJogador errou o ataque!");
            System.out.println("\nPontos de vida Inimigo: " + vidaInimigo);
        }

        setAtaque(gerarValoresAleatorios());

    }
    public int estaVivo() {
        if (getVida() > 0) {
            return 1;
        } else {
            System.out.println("Suas vidas acabaram!");
            return 0;
        }
    }
}
