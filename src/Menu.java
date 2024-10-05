import java.util.Scanner;

public class Menu {

    private String nombre;
    private int ID;
    private int rango;

    public Menu(){

    }

    public void imprimirMenu(){

        Scanner scanner = new Scanner(System.in);
        int opcion1=0;
        ImprimirDatos imprimirDatos = new ImprimirDatos();

        do {

            System.out.println("");
            System.out.println("1. Crear soldado");
            System.out.println("2. Modificar soldado");
            System.out.println("3. Visualizar informacion soldado");
            System.out.println("4. Asignar mision");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");

            opcion1 = scanner.nextInt();
            boolean validar = false;
            switch(opcion1){
                case 1:

                    while(validar==false) {
                        System.out.println("");
                        System.out.println("Digite el nombre del soldado: ");

                        nombre = scanner.next();

                        if (nombre.matches("^[a-zA-Z]+$")) {
                            System.out.println("Tipo de rango que tendra el soldado:");
                            System.out.println("Digite 1 para Soldado raso");
                            System.out.println("Digite 2 para Teniente");
                            System.out.println("Digite 3 para Capitan");
                            System.out.println("Digite 4 para Coronel");

                            rango = scanner.nextInt();
                            validar = true;
                        } else {
                            System.out.println("PORFAVOR ESCRIBA UN NOMBRE VALIDO PARA EL SOLDADO");
                        }
                    }
                    break;

                case 2:

                    while(validar==false) {

                        System.out.println("");
                        System.out.println("Digite el rango del soldado");
                        System.out.println("Digite 1 para SoldadoRaso");
                        System.out.println("Digite 2 para Teniente");
                        System.out.println("Digite 3 para Capitan");
                        System.out.println("Digite 4 para Coronel");

                        rango = scanner.nextInt();
                        if(rango==1) {
                            imprimirDatos.imprimirSoldadoRaso();
                        }else if(rango==2) {
                            imprimirDatos.imprimirTeniente();
                        }else if(rango==3) {
                            imprimirDatos.imprimirCapitan();
                        }else if(rango==4) {
                            imprimirDatos.imprimirCoronel();
                        }


                        System.out.println("Digite el ID del soldado que desea modificar: ");
                        ID = scanner.nextInt();

                        //REALIZAR LA LOGICA DE EDITAR

                        validar = true;

                    }
                    break;
                case 3:

                    System.out.println("");
                    System.out.println("Digite el nivel del rango para ver informacion personalizada");
                    System.out.println("Digite 1 para SoldadoRaso");
                    System.out.println("Digite 2 para Teniente");
                    System.out.println("Digite 3 para Capitan");
                    System.out.println("Digite 4 para Coronel");

                    rango = scanner.nextInt();
                    if(rango==1) {
                        imprimirDatos.imprimirCapitan();
                    }else if(rango==2) {
                        imprimirDatos.imprimirTeniente();
                    }else if(rango==3) {
                        imprimirDatos.imprimirCapitan();
                    }else if(rango==4) {
                        imprimirDatos.imprimirCoronel();
                    }


                    System.out.println("Digite el ID del soldado que desea modificar: ");
                    ID = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;

            }
            System.out.println();

        }while(opcion1 != 5);

        scanner.close();

    }

}
