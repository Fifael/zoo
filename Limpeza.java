import java.util.ArrayList;

public class Limpeza{

    public int id; 
    public String data;
    public String descrição;
    public int idJaula;
    public Jaula jaula;

    public static ArrayList<Limpeza> limpezas = new ArrayList<Limpeza>();

    public Limpeza ( int id, String data, String descrição, Jaula jaula ) {

         this.id = id; 
         this.data = data;
         this.descrição = descrição;
         this.jaula = jaula; 
         limpezas.add(this);
    }

    public int getId() {
    return id;
    }

    public String getData() {
    return data;
    }

    public String getDescrição() {
    return descrição;
    }

    public Jaula getJaula() {
    return jaula;
    }

    public void setId(int id) {
    this.id = id;
    }

    public void setData(String data) {
    this.data = data;
    }

    public void setDescrição(String descrição) {
    this.descrição = descrição;
    }

    public void setJaula(Jaula jaula) {
    this.jaula = jaula;
    }

    @Override
    public String toString() {
    return "Id: " + this.id + " | Data: " + this.data + " | Descrição: " + this.descrição + " | Id Jaula: " + this.idJaula;
    }

}