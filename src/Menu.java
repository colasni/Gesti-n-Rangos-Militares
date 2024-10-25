import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private String nombre;
    private String id;
    private int nivel;
    private String unidad;
    private int cantidadSoldadosBajoSuMando;
    private String estrategia;
    private ArrayList<SoldadoRaso> soldadosRasos;
    private ArrayList<Teniente> tenientes;
    private ArrayList<Capitan> capitanes;
    private ArrayList<Coronel> coroneles;

    public Menu(){
        soldadosRasos = new ArrayList<SoldadoRaso>();
        tenientes = new ArrayList<Teniente>();
        capitanes = new ArrayList<Capitan>();
        coroneles = new ArrayList<Coronel>();
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
                            nivel = scanner.nextInt();

                            System.out.println("Numero de indentificación:");
                            id = scanner.next();

                            if (nivel == 1) {
                                SoldadoRaso soldadoRaso = new SoldadoRaso(nombre, id, "Soldado raso", nivel);
                                soldadosRasos.add(soldadoRaso);

                                validar = true;
                            }

                            if (nivel == 2) {
                                System.out.println("Dime la unidad del Teniente");
                                unidad = scanner.next();

                                Teniente teniente = new Teniente(nombre, id, "Teniente", nivel, unidad);
                                tenientes.add(teniente);

                                validar = true;
                            }

                            if (nivel == 3) {
                                System.out.println("Dime la cantidad de soldados bajo el mando del Capitan");
                                cantidadSoldadosBajoSuMando = scanner.nextInt();

                                Capitan capitan = new Capitan(nombre, id, "Capitan", nivel, cantidadSoldadosBajoSuMando);
                                capitanes.add(capitan);

                                validar = true;
                            }


                            if (nivel == 4) {
                                System.out.println("Dime la estrategia del Coronel");
                                estrategia = scanner.next();

                                Coronel coronel = new Coronel(nombre, id, "Coronel", nivel, estrategia);
                                coroneles.add(coronel);

                                validar = true;
                            }
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

                        nivel = scanner.nextInt();
                        if(nivel == 1) {
                            boolean seguir = true;
                            while (seguir) {
                                System.out.println("Digite el ID del soldado que desea modificar: ");
                                id = scanner.next();
                                boolean encontrado = false;
                        
                                for (SoldadoRaso soldado : soldadosRasos) {
                                    if (soldado.getId().equals(id)) {
                                        System.out.println("Soldado encontrado. Digite el nuevo nombre del soldado: ");
                                        String nuevoNombre = scanner.next();
                                        
                                        if (nuevoNombre.matches("^[a-zA-Z]+$")) {
                                            soldado.setNombre(nuevoNombre);
                                            System.out.println("Nombre actualizado correctamente.");
                                        } else {
                                            System.out.println("Nombre no válido. No se realizaron cambios.");
                                        }
                                        
                                        encontrado = true;
                                        break;
                                    }
                                }
                                
                                if (!encontrado) {
                                    System.out.println("Soldado no encontrado.");
                                }
                        
                                System.out.println("Quiere seguir actualizando datos?");
                                System.out.println("Digite 1 para seguir actualizando datos");
                                System.out.println("Digite 2 para salir");
                                int op = scanner.nextInt();
                                
                                if (op == 2) {
                                    break;  // Cambiar 'seguir' a 'false' si se elige la opción 2
                                }
                            }
                            validar = true;
                        }
                        
                        else if(nivel==2) {
                            //imprimirDatos.imprimirTeniente();
                        }else if(nivel==3) {
                            //imprimirDatos.imprimirCapitan();
                        }else if(nivel==4) {
                        }

                        validar = true;

                    }
                    break;
                case 3:

                    System.out.println();
                    System.out.println("Digite el nivel del rango para ver informacion personalizada");
                    System.out.println("Digite 1 para SoldadoRaso");
                    System.out.println("Digite 2 para Teniente");
                    System.out.println("Digite 3 para Capitan");
                    System.out.println("Digite 4 para Coronel");

                    nivel = scanner.nextInt();
                    if(nivel==1) {
                        imprimirDatos.imprimirSoldadoRaso(soldadosRasos);
                    }else if(nivel==2) {
                        imprimirDatos.imprimirTeniente(tenientes);
                    }else if(nivel==3) {
                        imprimirDatos.imprimirCapitan(capitanes);
                    }else if(nivel==4) {
                        imprimirDatos.imprimirCoronel(coroneles);
                    }
                    break;
                case 4:
                    System.out.println("Digite el nivel del rango para asignar mision");
                    System.out.println("Digite 1 para SoldadoRaso");
                    System.out.println("Digite 2 para Teniente");
                    System.out.println("Digite 3 para Capitan");
                    System.out.println("Digite 4 para Coronel");
                    
                    nivel = scanner.nextInt();
                    if(nivel==1) {
                        System.out.println("Digite el ID del soldado raso al que desea asignar la misión: ");
                        id = scanner.next();
                        for (SoldadoRaso soldado : soldadosRasos) {
                            if (soldado.getId().equals(id)) {
                                System.out.println("Digite la misión que desea asignar al soldado raso: ");
                                String mision = scanner.next();
                                soldado.asignarMision(mision);
                                System.out.println("Misión asignada correctamente.");
                                break;
                                }
                            else {
                                System.out.println("Soldado no encontrado.");
                            }
                        }
                    }
                    
                case 5:
                    System.out.println("");
                    break;

            }
            System.out.println();

        }while(opcion1 != 5);

        scanner.close();

    }

}
