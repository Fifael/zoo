import java.util.ArrayList;

public class Repteis extends Animal {


    private String habitat;
    
    private static ArrayList<Repteis> repteis = new ArrayList<>();


    public Repteis(int id, String nome, String especie, String habitat) {
        super(id, nome, especie);
        this.habitat = habitat;
        repteis.add(this);
        
    }

            public String gethabitat(){
            return this.habitat;    
            }

            public void sethabitat (String habitat){
            this.habitat = habitat;    
            }

              @Override
              public String toString() {
                  return super.toString()
                      + "\nEspecialidade: " + this.habitat;

    }
}
