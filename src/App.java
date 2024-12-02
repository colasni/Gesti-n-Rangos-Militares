
import Interfaces.*;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Crear crear = new Crear();
        //Menu menu = new Menu();

        //menu.imprimirMenu();

        VentanaPrincipal ventana = new VentanaPrincipal(crear);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
