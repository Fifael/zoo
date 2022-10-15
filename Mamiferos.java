import java.util.ArrayList;

public class Mamiferos extends Animal {

    private String tempoDeGestacao;

    private static ArrayList<Mamiferos> mamiferos = new ArrayList<>();

    public Mamiferos( int id, String nome, String especie, String tempoDeGestacao) {
        
        super(id, nome, especie); 
        this.tempoDeGestacao = tempoDeGestacao;

        mamiferos.add(this);


    }
    @Override
    public String toString() {
        return super.toString()
            + "\nEspecialidade: " + this.tempoDeGestacao;


    }

}
