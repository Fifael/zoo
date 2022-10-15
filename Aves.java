import java.util.ArrayList;

public class Aves extends Animal {

    private String planagem;

    private static ArrayList<Aves> aves = new ArrayList<>();
    
    public Aves( int id, String nome, String especie, String planagem) {

        super(id, nome, especie);     
        this.planagem = planagem;
    
        aves.add(this);

    }
    @Override
    public String toString() {
        return super.toString()
            + "\nEspecialidade: " + this.planagem;


    }
}
