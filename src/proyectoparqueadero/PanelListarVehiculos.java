package proyectoparqueadero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author LUIS SILVESTRE
 */
public class PanelListarVehiculos extends javax.swing.JPanel {

    public PanelListarVehiculos() {
        initComponents();
        rbFueraParq.setSelected(true);
        TableColumnModel columnModel = tblVehiculos.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        tfPropietario = new javax.swing.JTextField();
        dcFechaBusqueda = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        rbEnParq = new javax.swing.JRadioButton();
        rbFueraParq = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbAuto = new javax.swing.JCheckBox();
        cbMoto = new javax.swing.JCheckBox();

        jLabel1.setText("Buscar Vehiculos");

        jLabel2.setText("Placa");

        jLabel3.setText("Propietario");

        jLabel4.setText("Fecha");

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Placa", "Propietario", "Tipo de Vehiculo", "Hora Entrada", "Hora Salida", "Pago"
            }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        jLabel5.setText("Tipo Vehiculo");

        buttonGroup3.add(rbEnParq);
        rbEnParq.setText("En parqueadero");

        buttonGroup3.add(rbFueraParq);
        rbFueraParq.setText("Fuera de parqueadero");
        rbFueraParq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFueraParqActionPerformed(evt);
            }
        });

        jLabel6.setText("Ubicacion del vehiculo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Cierre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbAuto.setText("Automovil");

        cbMoto.setText("Motocicleta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel5)
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(110, 110, 110)
                                    .addComponent(rbEnParq)
                                    .addGap(9, 9, 9)
                                    .addComponent(rbFueraParq))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(173, 173, 173)
                                    .addComponent(jLabel6))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(cbAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMoto)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbAuto)
                    .addComponent(cbMoto)
                    .addComponent(rbEnParq)
                    .addComponent(rbFueraParq))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton1))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    String consulta;
    String tipoVehiculo = "otro", estado = "", fecha = "";
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);

        // Tipo de Vehículo
        tipoVehiculo = (cbAuto.isSelected() && cbMoto.isSelected()) ? ""
                : (cbAuto.isSelected()) ? "Automovil"
                : (cbMoto.isSelected()) ? "Motocicleta" : "";

// Estado del Vehículo
        estado = (rbFueraParq.isSelected()) ? "No Disponible"
                : (rbEnParq.isSelected()) ? "Disponible" : "";

// Fecha
        fecha = (dcFechaBusqueda.getDate() != null)
                ? new SimpleDateFormat("yyyy-MM-dd").format(dcFechaBusqueda.getDate()) : "";

        try {
            // TODO add your handling code here:

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoparqueadero", "root", "Orion1")) {
                String consulta = "SELECT * FROM vehiculos WHERE estado=? AND tipovehiculo LIKE ? AND placa LIKE ? AND propietario LIKE ? AND horaentrada LIKE ?";
                System.out.println(consulta);

                try (PreparedStatement stat = conexion.prepareStatement(consulta)) {
                    stat.setString(1, estado);
                    stat.setString(2, "%" + tipoVehiculo + "%");
                    stat.setString(3, "%" + tfPlaca.getText() + "%");
                    stat.setString(4, "%" + tfPropietario.getText() + "%");
                    stat.setString(5, fecha + "%");

                    try (ResultSet rs = stat.executeQuery()) {
                        while (rs.next()) {
                            String horasalida = rs.getString(6);
                            String pago = rs.getString(7);

                            if (horasalida == null) {
                                horasalida = "No ha salido";
                                pago = "0";
                            } else {
                                horasalida = rs.getString(6).substring(10, 16);
                            }

                            String[] fila = {
                                rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getString(5).substring(10, 16),
                                horasalida,
                                "$" + pago
                            };

                            modelo.addRow(fila);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbFueraParqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFueraParqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFueraParqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            // TODO add your handling code here:

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoparqueadero", "root", "Orion1");
            Statement stat = conexion.createStatement();
            consulta = "SELECT SUM(valorpagado)FROM vehiculos WHERE estado='" + estado + "' AND tipovehiculo LIKE'%" + tipoVehiculo + "%' AND placa LIKE '%" + tfPlaca.getText() + "%' AND propietario LIKE '%" + tfPropietario.getText() + "%' AND horasalida LIKE '" + fecha + "%'";
            ResultSet rs = stat.executeQuery(consulta);
            rs.first();
            DecimalFormat df = new DecimalFormat("#.00");
            Double IngresosTotales = Double.parseDouble(rs.getString(1));
            JOptionPane.showMessageDialog(null, "El ingreso total del dia seleccionado es de : $ " + df.format(IngresosTotales) + " Pesos");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cbAuto;
    private javax.swing.JCheckBox cbMoto;
    private com.toedter.calendar.JDateChooser dcFechaBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbEnParq;
    private javax.swing.JRadioButton rbFueraParq;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPropietario;
    // End of variables declaration//GEN-END:variables
}
