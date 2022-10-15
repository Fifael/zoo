import java.util.ArrayList;

public abstract class Animal {

    private int id;
    private String nome;
    private String especie;

    protected Animal (int id, String nome, String especie)

    {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n:nome: " + this.nome + "\nespecie: " + this.especie;
    }
}
