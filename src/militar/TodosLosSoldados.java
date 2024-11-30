package militar;

public class TodosLosSoldados {

    int nivel;
    String id;

    public TodosLosSoldados(String id, int nivel){
        this.nivel = nivel;
        this.id = id;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
