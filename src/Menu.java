import java.util.ArrayList;
import java.util.Scanner;

import militar.Capitan;
import militar.Coronel;
import militar.Soldado;
import militar.SoldadoRaso;
import militar.Teniente;

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
            System.out.println("5. Asignar estado actual");
            System.out.println("6. Reporte estado actual");
            System.out.println("7. Salir");
            System.out.println("Elige una opcion: ");
            opcion1 = scanner.nextInt();

            boolean validar = false;
            switch(opcion1) {
                case 1:

                    while (validar == false) {
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

                            System.out.println("Numero de ID:");
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

                    while (validar == false) {

                        System.out.println("");
                        System.out.println("Digite el rango del soldado");
                        System.out.println("Digite 1 para SoldadoRaso");
                        System.out.println("Digite 2 para Teniente");
                        System.out.println("Digite 3 para Capitan");
                        System.out.println("Digite 4 para Coronel");
                        nivel = scanner.nextInt();

                        System.out.println("Digite el ID del soldado que desea modificar: ");
                        id = scanner.next();
                        boolean encontrado = false;
                        if (nivel == 1) {
                            for (Soldado s : soldadosRasos) {
                                if (s.getId().equals(id)) {
                                    System.out.println("Soldado raso encontrado: " + s.getNombre());
                                    encontrado = true;

                                    System.out.println("¿Desea modificar el nombre? (S/N)");
                                    String respuesta = scanner.next();
                                    if (respuesta.equalsIgnoreCase("S")) {
                                        System.out.println("Ingrese el nuevo nombre:");
                                        String nuevoNombre = scanner.next();
                                        s.setNombre(nuevoNombre);
                                        System.out.println("Nombre actualizado a: " + s.getNombre());
                                        break;
                                    }
                                }
                            }

                            if (!encontrado) {
                                System.out.println("No se encontró ningún soldado raso con el ID: " + id);
                            }

                            validar = true;

                        } else if (nivel == 2) {
                            for (Teniente t : tenientes) {
                                if (t.getId().equals(id)) {
                                    System.out.println("Teniente encontrado: " + t.getNombre());
                                    encontrado = true;

                                    System.out.println("¿Desea modificar el nombre? (S/N)");
                                    String respuesta = scanner.next();
                                    if (respuesta.equalsIgnoreCase("S")) {
                                        System.out.println("Ingrese el nuevo nombre:");
                                        String nuevoNombre = scanner.next();
                                        t.setNombre(nuevoNombre);
                                        System.out.println("Nombre actualizado a: " + t.getNombre());

                                    }

                                    // Modificar la unidad a la que pertenece
                                    System.out.println("¿Desea modificar la unidad a la que pertenece? (S/N)");
                                    respuesta = scanner.next();
                                    if (respuesta.equalsIgnoreCase("S")) {
                                        System.out.println("Ingrese la nueva la unidad:");
                                        String nuevaUnidad = scanner.next();
                                        t.setUnidad(nuevaUnidad);
                                        System.out.println("Unidad a la que pertenece actualizada a: " + t.getUnidad());
                                    }
                                    break;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("No se encontró ningún teniente con el ID: " + id);
                            }

                            validar = true;
                        } else if (nivel == 3) {
                            for (Capitan c : capitanes) {
                                if (c.getId().equals(id)) {
                                    System.out.println("Capitan encontrado: " + c.getNombre());
                                    encontrado = true;

                                    System.out.println("¿Desea modificar el nombre? (S/N)");
                                    String respuesta = scanner.next();
                                    if (respuesta.equalsIgnoreCase("S")) {
                                        System.out.println("Ingrese el nuevo nombre:");
                                        String nuevoNombre = scanner.next();
                                        c.setNombre(nuevoNombre);
                                        System.out.println("Nombre actualizado a: " + c.getNombre());
                                    }
                                    // Modificar numero de soldados bajo su mando
                                    System.out.println("¿Desea modificar el numero de soldados bajo su mando? (S/N)");
                                    respuesta = scanner.next();
                                    if (respuesta.equalsIgnoreCase("S")) {
                                        System.out.println("Ingrese el nuevo numero de soldados bajo su mando:");
                                        int soldadosBajoElMando = scanner.nextInt();
                                        c.setCantidadSoldadosBajoSuMando(soldadosBajoElMando);
                                        System.out.println("Numero de soldados bajo su mando actualizado a: " + c.getCantidadSoldadosBajoSuMando());
                                    }
                                    break;
                                }

                            }

                            if (!encontrado) {
                                System.out.println("No se encontró ningún capitan con el ID: " + id);
                            }
                            validar = true;

                        } else if (nivel == 4) {
                            for (Coronel c : coroneles) {
                                if (c.getId().equals(id)) {
                                    System.out.println("Coronel encontrado: " + c.getNombre());
                                    encontrado = true;

                                    // Modificar nombre
                                    System.out.println("¿Desea modificar el nombre? (S/N)");
                                    String respuesta = scanner.next();
                                    if (respuesta.equalsIgnoreCase("S")) {
                                        System.out.println("Ingrese el nuevo nombre:");
                                        String nuevoNombre = scanner.next();
                                        c.setNombre(nuevoNombre);
                                        System.out.println("Nombre actualizado a: " + c.getNombre());
                                    }

                                    // Modificar estrategia
                                    System.out.println("¿Desea modificar la estrategia? (S/N)");
                                    respuesta = scanner.next();
                                    if (respuesta.equalsIgnoreCase("S")) {
                                        System.out.println("Ingrese la nueva estrategia:");
                                        String nuevaEstrategia = scanner.next();
                                        c.setEstrategia(nuevaEstrategia);
                                        System.out.println("Estrategia actualizada a: " + c.getEstrategia());
                                    }
                                    break;  // Salimos del bucle una vez que encontramos el coronel
                                }
                            }


                            if (!encontrado) {
                                System.out.println("No se encontró ningún coronel con el ID: " + id);
                            }
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
                    if (nivel == 1) {
                        imprimirDatos.imprimirSoldadoRaso(soldadosRasos);
                    } else if (nivel == 2) {
                        imprimirDatos.imprimirTeniente(tenientes);
                    } else if (nivel == 3) {
                        imprimirDatos.imprimirCapitan(capitanes);
                    } else if (nivel == 4) {
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
                    System.out.println("Digite el ID del soldado al que desea asignar la misión: ");
                    id = scanner.next();
                    boolean encontrado = false;

                    if (nivel == 1) {
                        for (SoldadoRaso soldado : soldadosRasos) {
                            if (soldado.getId().equals(id)) {
                                System.out.println("Digite la misión que desea asignar al soldado raso: ");
                                String mision = scanner.next();
                                soldado.asignarMision(mision);
                                System.out.println("Misión asignada correctamente.");
                                encontrado = true;
                                break;
                            }
                        }
                    } else if (nivel == 2) {
                        for (Teniente teniente : tenientes) {
                            if (teniente.getId().equals(id)) {
                                System.out.println("Digite la misión que desea asignar al teniente: ");
                                String mision = scanner.next();
                                teniente.asignarMision(mision);
                                System.out.println("Misión asignada correctamente.");
                                encontrado = true;
                                break;
                            }
                        }
                    } else if (nivel == 3) {
                        for (Capitan capitan : capitanes) {
                            if (capitan.getId().equals(id)) {
                                System.out.println("Digite la misión que desea asignar al capitán: ");
                                String mision = scanner.next();
                                capitan.asignarMision(mision);
                                System.out.println("Misión asignada correctamente.");
                                encontrado = true;
                                break;
                            }
                        }
                    } else if (nivel == 4) {
                        for (Coronel coronel : coroneles) {
                            if (coronel.getId().equals(id)) {
                                System.out.println("Digite la misión que desea asignar al coronel: ");
                                String mision = scanner.next();
                                coronel.asignarMision(mision);
                                System.out.println("Misión asignada correctamente.");
                                encontrado = true;
                                break;
                            }
                        }
                    }

                    if (encontrado == false) {
                        System.out.println("Soldado no encontrado.");
                    }
                    break;

                case 5:

                    System.out.println("Digite el nivel del rango para establecer un estado actual");
                    System.out.println("Digite 1 para SoldadoRaso");
                    System.out.println("Digite 2 para Teniente");
                    System.out.println("Digite 3 para Capitan");
                    System.out.println("Digite 4 para Coronel");

                    nivel = scanner.nextInt();
                    System.out.println("Digite el ID del soldado al que desea establecer un estado actual: ");
                    id = scanner.next();
                    boolean encontro = false;

                    if (nivel == 1) {
                        for (SoldadoRaso soldado : soldadosRasos) {
                            if (soldado.getId().equals(id)) {
                                System.out.println("Digite el estado actual que desea asignar al soldado raso: ");
                                String estado = scanner.next();
                                soldado.reportarEstado(estado);
                                encontro = true;
                                break;
                            }
                        }
                    } else if (nivel == 2) {
                        for (Teniente teniente : tenientes) {
                            if (teniente.getId().equals(id)) {
                                System.out.println("Digite el estado actual que desea asignar al teniente: ");
                                String estado = scanner.next();
                                teniente.reportarEstado(estado);
                                System.out.println("Estado actual correctamente.");
                                encontro = true;
                                break;
                            }
                        }
                    } else if (nivel == 3) {
                        for (Capitan capitan : capitanes) {
                            if (capitan.getId().equals(id)) {
                                System.out.println("Digite el estado actual que desea asignar al capitán: ");
                                String estado = scanner.next();
                                capitan.reportarEstado(estado);
                                System.out.println("Estado actual correctamente.");
                                encontro = true;
                                break;
                            }
                        }
                    } else if (nivel == 4) {
                        for (Coronel coronel : coroneles) {
                            if (coronel.getId().equals(id)) {
                                System.out.println("Digite el estado actual que desea asignar al coronel: ");
                                String estado = scanner.next();
                                coronel.reportarEstado(estado);
                                System.out.println("Estado actual correctamente.");
                                encontro = true;
                                break;
                            }
                        }
                    }

                    if (encontro == false) {
                        System.out.println("Soldado no encontrado.");
                    }

                    break;

                case 6:

                    while (validar == false) {

                        System.out.println("");
                        System.out.println("Digite el rango del soldado");
                        System.out.println("Digite 1 para SoldadoRaso");
                        System.out.println("Digite 2 para Teniente");
                        System.out.println("Digite 3 para Capitan");
                        System.out.println("Digite 4 para Coronel");
                        nivel = scanner.nextInt();

                        System.out.println("Digite el ID del soldado del que desea conocer su estado actual: ");
                        id = scanner.next();
                        boolean encontrar = false;
                        if (nivel == 1) {
                            for (Soldado s : soldadosRasos) {
                                if (s.getId().equals(id)) {
                                    System.out.println("Soldado raso encontrado: " + s.getNombre());
                                    if (s.getMision() == null) {
                                        System.out.println("mision: No tiene mision");
                                    }
                                    else {
                                        System.out.println("mision: " + s.getMision());
                                    }

                                    if (s.getEstado() == null) {
                                        System.out.println("Estado: No tiene estado definido");
                                    }
                                    else {
                                        System.out.println("Estado: " + s.getEstado());
                                    }
                                    encontrar = true;

                                }
                            }

                            if (!encontrar) {
                                System.out.println("No se encontró ningún soldado raso con el ID: " + id);
                            }

                            validar = true;

                        } else if (nivel == 2) {
                            for (Teniente t : tenientes) {
                                if (t.getId().equals(id)) {
                                    System.out.println("Teniente encontrado: " + t.getNombre());
                                    if (t.getMision() == null) {
                                        System.out.println("mision: No tiene mision");
                                    }
                                    else {
                                        System.out.println("mision: " + t.getMision());
                                    }

                                    if (t.getEstado() == null) {
                                        System.out.println("Estado: No tiene estado definido");
                                    }
                                    else {
                                        System.out.println("Estado: " + t.getEstado());
                                    }
                                    encontrar = true;

                                }
                            }

                            if (!encontrar) {
                                System.out.println("No se encontró ningún teniente con el ID: " + id);
                            }

                            validar = true;
                        } else if (nivel == 3) {
                            for (Capitan c : capitanes) {
                                if (c.getId().equals(id)) {
                                    System.out.println("Capitan encontrar: " + c.getNombre());
                                    if (c.getMision() == null) {
                                        System.out.println("mision: No tiene mision");
                                    }
                                    else {
                                        System.out.println("mision: " + c.getMision());
                                    }

                                    if (c.getEstado() == null) {
                                        System.out.println("Estado: No tiene estado definido");
                                    }
                                    else {
                                        System.out.println("Estado: " + c.getEstado());
                                    }
                                    encontrar = true;

                                }

                            }

                            if (!encontrar) {
                                System.out.println("No se encontró ningún capitan con el ID: " + id);
                            }
                            validar = true;

                        } else if (nivel == 4) {
                            for (Coronel c : coroneles) {
                                if (c.getId().equals(id)) {
                                    System.out.println("Coronel encontrar: " + c.getNombre());
                                    if (c.getMision() == null) {
                                        System.out.println("mision: No tiene mision");
                                    }
                                    else {
                                        System.out.println("mision: " + c.getMision());
                                    }

                                    if (c.getEstado() == null) {
                                        System.out.println("Estado: No tiene estado definido");
                                    }
                                    else {
                                        System.out.println("Estado: " + c.getEstado());
                                    }
                                    encontrar = true;

                                }
                            }


                            if (!encontrar) {
                                System.out.println("No se encontró ningún coronel con el ID: " + id);
                            }
                        }
                        validar = true;
                    }

                    break;

                case 7:
                    System.out.println("");
                    break;
            }

            System.out.println();

        }while(opcion1 != 7);

        scanner.close();

    }

}