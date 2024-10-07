public class Coronel extends Rango{

    String estrategia;

    public Coronel(String nombre,String id,String rango,int nivel,String estrategia) {
        super(nombre,id,rango,nivel);
        this.estrategia = estrategia;
    }

    @Override
    void realizarAccion() {

    }

    @Override
    public void asignarMision(String mision) {

    }

    @Override
    public void reportarEstado() {

    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Rango: " + rango);
        System.out.println("nivel: " + nivel);
        System.out.println("estrategia: " + estrategia);
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    
}
