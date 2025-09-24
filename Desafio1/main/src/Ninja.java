public class Ninja {

    private String nome;
    private  int idade;
    private String missao;
    private char nivelmissao;

    public Ninja(String nome, char nivelmissao, String missao, int idade) {
        this.nome = nome;
        this.nivelmissao = nivelmissao;
        this.missao = missao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getNivelmissao() {
        return nivelmissao;
    }

    public void setNivelmissao(char nivelmissao) {
        this.nivelmissao = nivelmissao;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String toString() {
        return "Meu nome é " + getNome() +
                ", minha idade é " + getIdade() +
                ", missão: " + getMissao() +
                ", nível: " + getNivelmissao();
    }

}
