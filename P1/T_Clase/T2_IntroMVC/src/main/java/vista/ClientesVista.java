/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.ClientesControlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClientesModelo;

/**
 *
 * @author Bryan
 */
public class ClientesVista extends javax.swing.JInternalFrame {

    ClientesControlador cc;
    ClientesModelo cm;

    /**
     * Creates new form ClientesVista
     */
    public ClientesVista() {
        initComponents();
        cc = new ClientesControlador();
        cm = new ClientesModelo();
        cargarClientes("");
    }

    public void cargarClientes(String buscarC) {
        cc.setBuscar(buscarC);
        DefaultTableModel dtm = cm.consultarClientes(cc);
        clientesjTable.setModel(dtm);
    }

    public void limpiarFormulario() {
        idjTextField.setText("");
        nombresjTextField.setText("");
        rucjTextField.setText("");
        contactojTextField.setText("");
        direccionjTextArea.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarClientejTextField = new javax.swing.JTextField();
        buscarjButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesjTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        insertarjButton = new javax.swing.JButton();
        actualizarjButton = new javax.swing.JButton();
        borrarjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombresjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rucjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contactojTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        direccionjTextArea = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jLabel1.setText("Buscar cliente:");

        buscarjButton.setText("Buscar");
        buscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarjButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        clientesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        clientesjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientesjTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Gesti??n"));

        insertarjButton.setText("Insertar");
        insertarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarjButtonActionPerformed(evt);
            }
        });

        actualizarjButton.setText("Actualizar");
        actualizarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarjButtonActionPerformed(evt);
            }
        });

        borrarjButton.setText("Borrar");
        borrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarjButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        idjTextField.setEditable(false);

        jLabel3.setText("Nombres:");

        jLabel4.setText("RUC:");

        jLabel5.setText("Contacto:");

        jLabel6.setText("Direcci??n:");

        direccionjTextArea.setColumns(20);
        direccionjTextArea.setRows(5);
        jScrollPane2.setViewportView(direccionjTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(insertarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(actualizarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrarjButton))
                    .addComponent(idjTextField)
                    .addComponent(nombresjTextField)
                    .addComponent(rucjTextField)
                    .addComponent(contactojTextField))
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarjButton)
                    .addComponent(actualizarjButton)
                    .addComponent(borrarjButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombresjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rucjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(contactojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        String buscarCli = buscarClientejTextField.getText().trim();
        cargarClientes(buscarCli);
    }//GEN-LAST:event_buscarjButtonActionPerformed

    private void insertarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarjButtonActionPerformed
        String id = idjTextField.getText().trim();
        String nombres = nombresjTextField.getText().trim();
        String ruc = rucjTextField.getText().trim();
        String contacto = contactojTextField.getText().trim();
        String direccion = direccionjTextArea.getText().trim();

        if (id.length() != 0 || nombres.length() == 0 || ruc.length() == 0 || contacto.length() == 0 || direccion.length() == 0) {
            JOptionPane.showMessageDialog(null, "Formulario vac??o", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cc.setNombres(nombres);
            cc.setRuc(ruc);
            cc.setContacto(contacto);
            cc.setDireccion(direccion);
            boolean respuesta = cm.insertarClientes(cc);

            if (respuesta) {
                JOptionPane.showMessageDialog(null, "Cliente insertado", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no insertado", "Error", JOptionPane.ERROR_MESSAGE);
            }

            cargarClientes("");
            limpiarFormulario();
        }
    }//GEN-LAST:event_insertarjButtonActionPerformed

    private void clientesjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesjTableMouseClicked
        int fila = clientesjTable.getSelectedRow();

        String id = clientesjTable.getValueAt(fila, 0).toString();
        String nombres = clientesjTable.getValueAt(fila, 1).toString();
        String ruc = clientesjTable.getValueAt(fila, 2).toString();
        String contacto = clientesjTable.getValueAt(fila, 3).toString();
        String direccion = clientesjTable.getValueAt(fila, 4).toString();

        idjTextField.setText(id);
        nombresjTextField.setText(nombres);
        rucjTextField.setText(ruc);
        contactojTextField.setText(contacto);
        direccionjTextArea.setText(direccion);
    }//GEN-LAST:event_clientesjTableMouseClicked

    private void actualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarjButtonActionPerformed
        String id = idjTextField.getText().trim();
        String nombres = nombresjTextField.getText().trim();
        String ruc = rucjTextField.getText().trim();
        String contacto = contactojTextField.getText().trim();
        String direccion = direccionjTextArea.getText().trim();

        if (id.length() == 0 || nombres.length() == 0 || ruc.length() == 0 || contacto.length() == 0 || direccion.length() == 0) {
            JOptionPane.showMessageDialog(null, "Formulario vac??o", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cc.setId(Integer.parseInt(id));
            cc.setNombres(nombres);
            cc.setRuc(ruc);
            cc.setContacto(contacto);
            cc.setDireccion(direccion);
            boolean respuesta = cm.actualizarClientes(cc);

            if (respuesta) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no actualizado", "Error", JOptionPane.ERROR_MESSAGE);
            }

            cargarClientes("");
            limpiarFormulario();
        }
    }//GEN-LAST:event_actualizarjButtonActionPerformed

    private void borrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarjButtonActionPerformed
        String id = idjTextField.getText().trim();

        if (id.length() == 0) {
            JOptionPane.showMessageDialog(null, "Formulario vac??o", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cc.setId(Integer.parseInt(id));
            boolean respuesta = cm.borrarClientes(cc);

            if (respuesta) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no eliminado", "Error", JOptionPane.ERROR_MESSAGE);
            }

            cargarClientes("");
            limpiarFormulario();
        }
    }//GEN-LAST:event_borrarjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarjButton;
    private javax.swing.JButton borrarjButton;
    private javax.swing.JTextField buscarClientejTextField;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JTable clientesjTable;
    private javax.swing.JTextField contactojTextField;
    private javax.swing.JTextArea direccionjTextArea;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JButton insertarjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombresjTextField;
    private javax.swing.JTextField rucjTextField;
    // End of variables declaration//GEN-END:variables
}
