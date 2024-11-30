package militar;
public class Coronel extends Rango{
    private String nombre;
    private String id;
    private String rango;
    private int nivel;
    private String estrategia;

    public Coronel(String nombre,String id,String rango,int nivel,String estrategia) {
        super(nombre,id,rango,nivel);
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        this.nivel = nivel;
        this.estrategia = estrategia;
    }

    @Override
    void realizarAccion() {
        String accion = "Garantizar la seguridad general y ajustar las políticas de patrullaje según las amenazas o necesidades.";
    }

    @Override
    public void patrullar(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El Coronel "+ nombre + "con numero de identificacion" + id + "debe hacer lo siguiente");

        if(randomNumber == 1){
            System.out.println("Supervisar las operaciones generales de patrullaje y evaluar su efectividad.");
        } else if (randomNumber == 2) {
            System.out.println("Tomar decisiones de alto nivel sobre la reasignación de recursos o ajustes en las estrategias de vigilancia.");
        } else if (randomNumber == 3) {
            System.out.println("Gestionar la comunicación y coordinación entre diferentes áreas o unidades.");
        }

    }

    @Override
    public void asignarMision(String mision) {
        this.mision = mision;
        System.out.println("Mision asignada: " + mision);
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

    @Override
    public void saludar(String nombre) {
        this.nombre = nombre;
        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);


        if(primeraLetra==ultimaLetra){
            System.out.println("¡Buenos días! Procedemos según las instrucciones.");
        }else{
            System.out.println("Capitán, asegúrese de que todas las unidades estén en posición.");
        }


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

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
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
