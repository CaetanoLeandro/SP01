package polimorfismosobrescrita;

public class Cliente {


    private String nome;
    private String segundoNome;
    private String sobreNome;

    public Cliente() {
    }

    public String cadastra() {
        return nome + segundoNome;
    }

    public String cadastra(String nome, String segundoNome, String sobreNome) { //Sobrecarga

        this.nome = nome;
        this.segundoNome= segundoNome;
        this.sobreNome = sobreNome;

        return nome + " "+ segundoNome +" "+ sobreNome;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }


}


