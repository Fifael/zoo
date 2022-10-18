import java.util.ArrayList;

public class Jaula {
    private int id;
    private String nome;
    private String tipo;

    public static ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public Jaula( int id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        jaulas.add(this);
    }

    public int getId() {
    return this.id;
    }

    public String getNome() {
    return this.nome;
    }

    public String getTipo() {
    return this.tipo;
    }

    public void setId(int id) {
    this.id = id;
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }    

    public void setTipo(String tipo) {
    this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + " Nome: " + this.nome + " Tipo: " + this.tipo;
    }

}
