package militar;
public class Capitan extends Rango{

    private String nombre;
    private String id;
    private String rango;
    private int nivel;
    private int cantidadSoldadosBajoSuMando;

    public Capitan(String nombre, String id, String rango, int nivel, int cantidadSoldadosBajoSuMando) {
        super(nombre, id, rango, nivel);
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        this.nivel = nivel;
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
        //TODO Auto-generated constructor stub
    }



    @Override
    void realizarAccion() {
        String accion = "Planificar y optimizar las operaciones de patrullaje en función de las necesidades estratégicas.";
    }

    @Override
    public void asignarMision(String mision) {
        this.mision = mision;
        System.out.println("Mision asignada: " + mision);
    }

    @Override
    public void patrullar(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El Capitan "+ nombre + "con numero de identificacion" + id + "debe hacer lo siguiente");

        if(randomNumber == 1){
            System.out.println("Diseñar las estrategias de patrullaje para áreas críticas.");
        } else if (randomNumber == 2) {
            System.out.println("Evaluar informes de los tenientes y soldados rasos para identificar patrones o riesgos.");
        } else if (randomNumber == 3) {
            System.out.println("Asegurarse de que se cumplen los protocolos y procedimientos establecidos.");
        }

    }

    @Override
    public void saludar(String nombre) {
        this.nombre = nombre;
        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);

        if(primeraLetra==ultimaLetra){
            System.out.println("¡Buenos días, mi coronel! Patrullas desplegadas según las órdenes.");
        }else{
            System.out.println("¡Buenos días, equipo! Necesito un informe completo antes del mediodía.");
        }
    }


    @Override
    public String getMision() {
        return mision;
    }

    @Override
    public void reportarEstado(String estado) {
        this.estado = estado;
        System.out.println("Estado asignado: " + estado);

    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSoldadosBajoSuMando() {
        return cantidadSoldadosBajoSuMando;
    }

    public void setCantidadSoldadosBajoSuMando(int cantidadSoldadosBajoSuMando) {
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getRango() {
        return rango;
    }

    @Override
    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }


}
