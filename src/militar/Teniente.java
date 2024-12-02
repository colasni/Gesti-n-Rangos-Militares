package militar;

public class Teniente extends Rango{

    private String nombre;
    private String id;
    private String rango;
    private int nivel;
    private String unidad; 
    private String patru;
    private String salu;

    public Teniente(String nombre, String id, String rango, int nivel, String unidad) {
        super(nombre, id, rango, nivel);
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        this.nivel = nivel;
        this.unidad = unidad;
        //TODO Auto-generated constructor stub
    }


    @Override
    void realizarAccion() {
        String accion = "Garantizar que el patrullaje sea eficiente y que las órdenes se cumplan adecuadamente.";
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
    public void patrullar(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El Teniente ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente");

        if(randomNumber == 1){
            patru = "Supervisar a los soldados rasos durante el patrullaje.";
        } else if (randomNumber == 2) {
            patru = "Coordinar las rutas de patrullaje y asignar sectores a cada grupo.";
        } else if (randomNumber == 3) {
            patru = "Actuar como punto de contacto entre los soldados y los rangos superiores.";
        }

    }

    @Override
    public void saludar(String nombre) {
        this.nombre = nombre;
        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);

        if(primeraLetra==ultimaLetra){
            salu = "¡Buenos días, mi capitán! Todo en orden en el sector asignado.";
        }else{
            salu = "¡Buenos días, soldados! Preparémonos para la inspección.";
        }
    }

    @Override
    public void regañado() {
        super.regañado();
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

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
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


    public String getPatru() {
        return patru;
    }


    public void setPatru(String patru) {
        this.patru = patru;
    }


    public String getSalu() {
        return salu;
    }


    public void setSalu(String salu) {
        this.salu = salu;
    }
    
}
