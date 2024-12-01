package Interfaces;

import militar.Capitan;
import militar.Coronel;
import militar.SoldadoRaso;
import militar.Teniente;
import militar.TodosLosSoldados;
import util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Modificar extends javax.swing.JPanel {
    Crear crear;
    private ArrayList<TodosLosSoldados> todosLosSoldados;
    private ArrayList<SoldadoRaso> soldadosRasos;
    private ArrayList<Teniente> tenientes;
    private ArrayList<Capitan> capitanes;
    private ArrayList<Coronel> coroneles;

    public Modificar(Crear crear) {
        this.crear = crear;
        initComponents();
    }

    private void initComponents() {

        radioRangos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRaso = new javax.swing.JRadioButton();
        jCapitan = new javax.swing.JRadioButton();
        jTeniente = new javax.swing.JRadioButton();
        jCoronel = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("MODIFICACION DE UN SOLDADO");

        jLabel2.setText("Nombre:");

        jLabel3.setText("ID:");

        jLabel4.setText("Rango:");

        radioRangos.add(jRaso);
        jRaso.setText("Soldado raso");

        radioRangos.add(jCapitan);
        jCapitan.setText("Capitan");

        radioRangos.add(jTeniente);
        jTeniente.setText("Teniente");

        radioRangos.add(jCoronel);
        jCoronel.setText("Coronel");

        jTextField3.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jRaso.isSelected()){
                    jTextField3.setEditable(false);
                    jTextField5.setEditable(false);
                    jTextField6.setEditable(false);
                } else if (jTeniente.isSelected()) {
                    jTextField3.setEditable(true);
                    jTextField5.setEditable(false);
                    jTextField6.setEditable(false);
                } else if (jCapitan.isSelected()) {
                    jTextField3.setEditable(false);
                    jTextField5.setEditable(false);
                    jTextField6.setEditable(true);
                }else if (jCoronel.isSelected()) {
                    jTextField3.setEditable(false);
                    jTextField5.setEditable(true);
                    jTextField6.setEditable(false);
                }
            }
        };

        jRaso.addActionListener(actionListener);
        jCapitan.addActionListener(actionListener);
        jTeniente.addActionListener(actionListener);
        jCoronel.addActionListener(actionListener);


        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                boolean encontrado = false;

                
                if (jRaso.isSelected()) {
                    String id = jTextField2.getText();
                    String nombre = jTextField1.getText();
                    //System.out.println("nic"+id);
                    modificarSoldado("1", id,nombre); /* 
                    
                } else if (jTeniente.isSelected()) {
                    String nombre = jTextField1.getText();
                    String id = jTextField2.getText();
                    String unidad = jTextField3.getText();

                    Teniente teniente = new Teniente(nombre, id, "Teniente", 2, unidad);
                    agregarTeniente(teniente);

                } else if (jCapitan.isSelected()) {
                    String nombre = jTextField1.getText();
                    String id = jTextField2.getText();
                    String soldadosMandoStr = jTextField6.getText().trim();
                    System.out.println(soldadosMandoStr);
                    if (soldadosMandoStr.isEmpty() || !soldadosMandoStr.matches("\\d+")) {
                        javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid number for 'Estrategia'.");
                        return;
                    }
                    int soldadosMando = Integer.parseInt(soldadosMandoStr);

                    Capitan capitan = new Capitan(nombre, id, "Capitan", 3,soldadosMando);
                    agregarCapitan(capitan);

                }else if (jCoronel.isSelected()) {
                    String nombre = jTextField1.getText();
                    String id = jTextField2.getText();
                    String estrategia = jTextField5.getText();

                    Coronel coronel = new Coronel(nombre, id, "Coronel", 4,estrategia);
                    agregarCoronel(coronel);
                } */
            }
    }});

        jLabel5.setText("Unidad");

        jLabel6.setText("Soldados bajo su mando:");

        jLabel7.setText("Estrategia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jCapitan)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jCoronel))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jRaso)
                                                                        .addGap(28, 28, 28)
                                                                        .addComponent(jTeniente))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(51, 51, 51))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)))))
                                .addGap(35, 35, 35))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(86, 86, 86)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTeniente)
                                                                        .addComponent(jRaso))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jCoronel)
                                                                        .addComponent(jCapitan)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(83, 83, 83)
                                                                .addComponent(jLabel4))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRasoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void modificarSoldado(String rango, String id, String nombre){
        ArrayList<SoldadoRaso> soldadosRasos = crear.getSoldadosRasos();
        ArrayList<Teniente> tenientes = crear.getTenientes();
        ArrayList<Capitan> capitanes = crear.getCapitanes();
        ArrayList<Coronel> coroneles = crear.getCoroneles();
        ArrayList<TodosLosSoldados> todosLosSoldados = crear.getTodosLosSoldados();

        
        switch (rango) {
            case "1":
                //boolean encontrado = false;
                for (SoldadoRaso t : soldadosRasos){
                    if (t.getId().equals(id)) {
                        //encontrado = true;
                        t.setNombre(nombre);
                        //crear.setSoldadosRasos(soldadosRasos);
                }
            }
            /*
                break;
            case "Teniente":
                for (Teniente teniente : tenientes) {
                    JLabel label = new JLabel("ID: "+teniente.getId()+"      Nombre: "+teniente.getNombre());
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                }
                break;
            case "Capitan":
                for (Capitan capitan : capitanes) {
                    JLabel label = new JLabel("ID: "+capitan.getId()+"      Nombre: "+capitan.getNombre());
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                }
                break;
            case "Coronel":
                for (Coronel coronel : coroneles) {
                    JLabel label = new JLabel("ID: "+coronel.getId()+"      Nombre: "+coronel.getNombre());
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                }
                break;  */
            default:
                System.out.println("nada");
                break;
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jCapitan;
    private javax.swing.JRadioButton jCoronel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRaso;
    private javax.swing.JRadioButton jTeniente;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.ButtonGroup radioRangos;
    // End of variables declaration
}
