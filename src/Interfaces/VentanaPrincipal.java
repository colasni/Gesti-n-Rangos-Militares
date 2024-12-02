package Interfaces;

import militar.*;
import util.ImprimirDatos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class VentanaPrincipal extends javax.swing.JFrame {
    Crear crear;
    Modificar m = new Modificar(crear);
    AsignarM as = new AsignarM(crear);
    ModificarEstado rp = new ModificarEstado(crear);
    Acciones ac = new Acciones(crear);

    private ArrayList<SoldadoRaso> soldadosRasos;
    private ArrayList<Teniente> tenientes;
    private ArrayList<Capitan> capitanes;
    private ArrayList<Coronel> coroneles;
    ImprimirDatos imprimirDatos = new ImprimirDatos();
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Crear crear) {

        this.crear = crear;
        Modificar m = new Modificar(crear);
        this.m = m;
        AsignarM as = new AsignarM(crear);
        this.as = as;
        ModificarEstado rp = new ModificarEstado(crear);
        this.rp = rp;
        Acciones ac = new Acciones(crear);
        this.ac = ac;
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Principal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SOLDADOS REGISTRADOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RANGO:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Soldado raso", "Teniente", "Capitan", "Coronel" }));

        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarListaSoldados();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
        );

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
        JTextArea areaSoldado = new javax.swing.JTextArea();
        areaSoldado.setEditable(false);


        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        jLabel3.setBackground(new java.awt.Color(153, 0, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTIÓN DE SOLDADOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("¡Bienvenido!");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("En este programa podras Crear, modificar, y muchas cosas mas con los soldados.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Para empezar oprime alguno de los botones que se encuentran arriba ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("de este texto.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("¡Buena suerte!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);

        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(207, 207, 207))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(220, 220, 220))))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
                PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
                PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(169, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RESET ALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Asignar misión");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Asignar Estado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Acciones");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton5)
                                                                .addGap(18,18,18)
                                                                .addComponent(jButton6)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton2)
                                                        .addComponent(jButton3)
                                                        .addComponent(jButton4)
                                                        .addComponent(jButton5)
                                                        .addComponent(jButton6))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }


    private void actualizarListaSoldados() {

        ArrayList<SoldadoRaso> soldadosRasos = crear.getSoldadosRasos();
        ArrayList<Teniente> tenientes = crear.getTenientes();
        ArrayList<Capitan> capitanes = crear.getCapitanes();
        ArrayList<Coronel> coroneles = crear.getCoroneles();

        String categoriaSeleccionada = (String) jComboBox1.getSelectedItem();
        jPanel2.removeAll();

        switch (categoriaSeleccionada) {
            case "Soldado raso":
                imprimirDatos.imprimirSoldadoRaso(soldadosRasos);
                for (SoldadoRaso soldadoRaso : soldadosRasos) {
                    if (soldadoRaso.getMision() == null) {
                        soldadoRaso.asignarMision("Sin misión");
                    }
                    if (soldadoRaso.getEstado() == null) {
                        soldadoRaso.setEstado("Sin estado");
                    }
                    JLabel label = new JLabel("ID: "+soldadoRaso.getId()+"      Nombre: "+soldadoRaso.getNombre());
                    JLabel lab = new JLabel("Misión: "+soldadoRaso.getMision()+"      Estado: "+soldadoRaso.getEstado());
                    JLabel sep = new JLabel("___________________________________");
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(sep);
                }
                break;
            case "Teniente":
                for (Teniente teniente : tenientes) {
                    if (teniente.getMision() == null) {
                        teniente.asignarMision("Sin misión");
                    }
                    if (teniente.getEstado() == null) {
                        teniente.setEstado("Sin estado");
                    }
                    JLabel label = new JLabel("ID: "+teniente.getId()+"      Nombre: "+teniente.getNombre());
                    JLabel lab = new JLabel("Misión: "+teniente.getMision()+"      Estado: "+teniente.getEstado());
                    JLabel uni = new JLabel("Unidad: "+teniente.getUnidad());
                    JLabel sep = new JLabel("___________________________________");
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    uni.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(uni);
                    jPanel2.add(sep);
                }
                break;
            case "Capitan":
                for (Capitan capitan : capitanes) {
                    if (capitan.getMision() == null) {
                        capitan.asignarMision("Sin misión");
                    }
                    if (capitan.getEstado() == null) {
                        capitan.setEstado("Sin estado");
                    }
                    JLabel label = new JLabel("ID: "+capitan.getId()+"      Nombre: "+capitan.getNombre());
                    JLabel lab = new JLabel("Misión: "+capitan.getMision()+"      Estado: "+capitan.getEstado());
                    JLabel sep = new JLabel("___________________________________");
                    JLabel bajo = new JLabel("Soldados a cargo: "+ capitan.getCantidadSoldadosBajoSuMando());
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    bajo.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(bajo);
                    jPanel2.add(sep);
                }
                break;
            case "Coronel":
                for (Coronel coronel : coroneles) {
                    if (coronel.getMision() == null) {
                        coronel.asignarMision("Sin misión");
                    }
                    if (coronel.getEstado() == null) {
                        coronel.setEstado("Sin estado");
                    }
                    JLabel label = new JLabel("ID: "+coronel.getId()+"      Nombre: "+coronel.getNombre());
                    JLabel lab = new JLabel("Misión: "+coronel.getMision()+"      Estado: "+coronel.getEstado());
                    JLabel sep = new JLabel("___________________________________");
                    JLabel est = new JLabel("Estrategia: "+ coronel.getEstrategia());
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    est.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(est);
                    jPanel2.add(sep);
                }
                break;
            default:
                JLabel label = new JLabel("Seleccione una categoría válida");
                jPanel2.add(label);
                System.out.println("nada");
                break;
        }

        jPanel2.revalidate();
        jPanel2.repaint();
    }


//    private void actualizarListaSoldados() {
//    String categoriaSeleccionada = (String) jComboBox1.getSelectedItem();
//    jPanel2.removeAll();
//
//
//
//    List<String> nombres = new ArrayList<>();
//
//    switch (categoriaSeleccionada) {
//        case "Soldado raso":
//            for (SoldadoRaso soldado : soldadosRasos) {
//                nombres.add(soldado.getNombre());
//            }
//            break;
//        case "Teniente":
//            for (Teniente teniente : tenientes) {
//                nombres.add(teniente.getNombre());
//            }
//            break;
//        case "Capitan":
//            for (Capitan capitan : capitanes) {
//                nombres.add(capitan.getNombre());
//            }
//            break;
//        case "Coronel":
//            for (Coronel coronel : coroneles) {
//                nombres.add(coronel.getNombre());
//            }
//            break;
//        default:
//            nombres.add("Seleccione una categoría válida");
//            break;
//    }
//
//    // Imprimir la lista de nombres para depuración
//    System.out.println("Nombres: " + nombres);
//
//    StringBuilder listText = new StringBuilder("<html>");
//    for (String nombre : nombres) {
//        listText.append(nombre).append("<br>");
//    }
//    listText.append("</html>");
//
//    // Imprimir el texto formateado para depuración
//    System.out.println("Texto formateado: " + listText.toString());
//
//    JLabel label = new JLabel(listText.toString());
//    jPanel2.add(label);
//
//
//
//    // Revalidar y repintar el panel
//    jPanel2.revalidate();
//    jPanel2.repaint();
//}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        crear.getTodosLosSoldados().clear();
        crear.getSoldadosRasos().clear();
        crear.getTenientes().clear();
        crear.getCapitanes().clear();
        crear.getCoroneles().clear();
        JOptionPane.showMessageDialog(this, "Todos los datos han sido reseteados");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        crear.setSize(567,271);
        crear.setLocation(0,0);

        Principal.removeAll();
        Principal.add(crear,BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        m.setSize(567,271);
        m.setLocation(0,0);

        Principal.removeAll();
        Principal.add(m,BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        as.setSize(567,271);
        as.setLocation(0,0);

        Principal.removeAll();
        Principal.add(as,BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        rp.setSize(567,271);
        rp.setLocation(0,0);

        Principal.removeAll();
        Principal.add(rp,BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        ac.setSize(567,271);
        ac.setLocation(0,0);

        Principal.removeAll();
        Principal.add(ac,BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }




    // Variables declaration - do not modify
    private javax.swing.JPanel Principal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration
}
