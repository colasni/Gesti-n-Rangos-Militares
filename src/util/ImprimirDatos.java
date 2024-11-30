package util;

import java.util.ArrayList;

import militar.Capitan;
import militar.Coronel;
import militar.Soldado;
import militar.SoldadoRaso;
import militar.Teniente;

public class ImprimirDatos {

    public ImprimirDatos() {


    }

    public void imprimirSoldadoRaso(ArrayList<SoldadoRaso> soldadoRasos) {
        for (Soldado soldado : soldadoRasos) {
            System.out.println("Identificación: " + soldado.getId());
            System.out.println("Nombre: " + soldado.getNombre());
            System.out.println("Rango: " + soldado.getRango());
            if (soldado.getMision() == null) {
                System.out.println("mision: No tiene mision");                
            }
            else {
                System.out.println("mision: " + soldado.getMision());
            }

            if (soldado.getEstado() == null) {
                System.out.println("Estado: No tiene estado definido");
            }
            else {
                System.out.println("Estado: " + soldado.getEstado());
            }

            System.out.println("====================================");

        }
    }

    public void imprimirTeniente(ArrayList<Teniente> tenientes) {
        for (Teniente teniente : tenientes) {
            System.out.println("Identificación: " + teniente.getId());
            System.out.println("Nombre: " + teniente.getNombre());
            System.out.println("Rango: " + teniente.getRango());
            System.out.println("Unidad: " + teniente.getUnidad());
            if (teniente.getMision() == null) {
                System.out.println("mision: No tiene mision");                
            }
            else {
                System.out.println("mision: " + teniente.getMision());
            }

            if (teniente.getEstado() == null) {
                System.out.println("Estado: No tiene estado definido");
            }
            else {
                System.out.println("Estado: " + teniente.getEstado());
            }

            System.out.println("====================================");
        }
    }


    public void imprimirCapitan(ArrayList<Capitan> capitanes) {
        for (Capitan capitan : capitanes) {
            System.out.println("Identificación: " + capitan.getId());
            System.out.println("Nombre: " + capitan.getNombre());
            System.out.println("Rango: " + capitan.getRango());
            System.out.println("Cantidad soldados bajo su mando: " + capitan.getCantidadSoldadosBajoSuMando());
            if (capitan.getMision() == null) {
                System.out.println("mision: No tiene mision");                
            }
            else {
                System.out.println("mision: " + capitan.getMision());
            }

            if (capitan.getEstado() == null) {
                System.out.println("Estado: No tiene estado definido");
            }
            else {
                System.out.println("Estado: " + capitan.getEstado());
            }

            System.out.println("====================================");
        }
    }

    public void imprimirCoronel(ArrayList<Coronel> coroneles) {
        for (Coronel coronel : coroneles) {
            System.out.println("Identificación: " + coronel.getId());
            System.out.println("Nombre: " + coronel.getNombre());
            System.out.println("Rango: " + coronel.getRango());
            System.out.println("Estrategia: " + coronel.getEstrategia());
            if (coronel.getMision() == null) {
                System.out.println("mision: No tiene mision");                
            }
            else {
                System.out.println("mision: " + coronel.getMision());
            }

            if (coronel.getEstado() == null) {
                System.out.println("Estado: No tiene estado definido");
            }
            else {
                System.out.println("Estado: " + coronel.getEstado());
            }

            System.out.println("====================================");
        }
    }

}
