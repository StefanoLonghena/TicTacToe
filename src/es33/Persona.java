package es33;

public class Persona {

    private int età;
    private String nome;
    private String sesso;
    private String professione;

    public Persona(int età, String nome, String sesso, String professione) {
        this.età = età;
        this.nome = nome;
        this.sesso = sesso;
        this.professione = professione;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getProfessione() {
        return professione;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }

    public String chiSei(String name, String sesso, int eta, String professione) {
        System.out.println("Sono una persona di nome: " + name + \n);
    }
}
