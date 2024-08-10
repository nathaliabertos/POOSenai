package Canil2;

public class Cachorro {
    private String nome;
    private String pelagem;
    private char porte;
    private int idade;
    private boolean adestrado;
    private boolean castrado;
    private boolean dormindo;

    public Cachorro(String nome, String pelagem, char porte, int idade){
        this.nome = nome;
        this.pelagem = pelagem;
        this.porte = porte;
        this.idade = idade;
        this.adestrado = false;
        this.castrado = false;
        this.dormindo = false;
    }

    public String dormir(float tempo) {
        return "";
    }
    public String latir(){
        return "";
    }
    public String rolar(char direcao){
        return "";
    }
    public String darPata(){
        return "";
    }
    public String deitar(){
        return "";
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getPorte() {
        return porte;
    }
    public void setPorte(char porte) {
        this.porte = porte;
    }
    public boolean isAdestrado() {
        return adestrado;
    }
    public void setAdestrado(boolean adestrado) {
        this.adestrado = adestrado;
    }
    public boolean isCastrado() {
        return castrado;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    public boolean isDormindo() {
        return dormindo;
    }
    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    public String toString(){
        String texto = "Nome: " + nome + "\n" +
                "Pelagem: " + pelagem + "\n" +
                "Porte: " + porte + "\n" +
                "Idade: " + idade + "\n" +
                "Adestrado: " + adestrado + "\n" +
                "Castrado: " + castrado + "\n" +
                "Dormindo: " + dormindo;
        return texto;

    }
}
