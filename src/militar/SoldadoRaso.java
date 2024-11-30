package militar;
public class SoldadoRaso extends Rango{

    private String nombre;
    private String id;
    private String rango;
    private int nivel;
    
    
    public SoldadoRaso(String nombre, String id, String rango, int nivel) {
        super(nombre, id, rango, nivel);
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        this.nivel = nivel;
        //TODO Auto-generated constructor stub
    }

    @Override
    void realizarAccion() {
        String accion = "Ejecutar las operaciones básicas de vigilancia y seguridad.";
    }

    @Override
    public void asignarMision(String mision) {
        this.mision = mision;
        System.out.println("Mision asignada: " + mision);
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
    public void patrullar(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El soldado raso "+ nombre + "con numero de identificacion" + id + "debe hacer lo siguiente");

        if(randomNumber == 1){
            System.out.println("Patrullar áreas asignadas siguiendo rutas establecidas.");
        } else if (randomNumber == 2) {
            System.out.println("Reportar incidentes observados durante el patrullaje.");
        } else if (randomNumber == 3) {
            System.out.println("Realizar revisiones en puntos de control específicos.");
        }

    }

    @Override
    public void saludar(String nombre) {
        this.nombre = nombre;
        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);

        if(primeraLetra==ultimaLetra){
            System.out.println("¡Buenos días! soldado "+ nombre +"reportándose al servicio.");
        }else{
            System.out.println("¿Qué tal, compañero? Listo para el turno de patrulla.");
        }


    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    @Override
    public String getMision() {
        return mision;
    }
}
