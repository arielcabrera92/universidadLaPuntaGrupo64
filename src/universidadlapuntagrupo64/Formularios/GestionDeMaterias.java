/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadlapuntagrupo64.Formularios;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;
import universidadlapuntagrupo64.AccesoADatos.MateriaData;
import universidadlapuntagrupo64.Entidades.Materia;

/**
 *
 * @author Asus
 */
public class GestionDeMaterias extends javax.swing.JInternalFrame {
    private MateriaData matData =new MateriaData();
    private Materia matActual = null;
    /**
     * Creates new form GestionDeMaterias
     */
    public GestionDeMaterias() {
        initComponents();
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
        jBnuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRestado = new javax.swing.JRadioButton();
        jTaño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(56, 133, 188));

        jBnuevo.setBackground(new java.awt.Color(23, 56, 79));
        jBnuevo.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jBnuevo.setForeground(new java.awt.Color(255, 255, 255));
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Estado");

        jRestado.setBackground(new java.awt.Color(56, 133, 188));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setText("Materia");

        jTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigoActionPerformed(evt);
            }
        });

        jBbuscar.setBackground(new java.awt.Color(23, 56, 79));
        jBbuscar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jBbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBeliminar.setBackground(new java.awt.Color(23, 56, 79));
        jBeliminar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBeliminar.setText("Eliminar");

        jBguardar.setBackground(new java.awt.Color(23, 56, 79));
        jBguardar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jBguardar.setForeground(new java.awt.Color(255, 255, 255));
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setBackground(new java.awt.Color(23, 56, 79));
        jBsalir.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(255, 255, 255));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRestado)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jBbuscar))
                            .addComponent(jTnombre)
                            .addComponent(jTaño))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jBsalir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jRestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        
        try{
            Integer codigo = Integer.parseInt(jTcodigo.getText());
            matActual = matData.buscarMateria(codigo);
            if(matActual!= null){
                jTnombre.setText(matActual.getNombre());
                Integer año =Integer.parseInt(jTaño.getText());
                //jTaño.setText(matActual.getAnio()+"");
                jRestado.setSelected(matActual.isEstado());
            }
        
        }catch(NumberFormatException ex){
        
            JOptionPane.showMessageDialog(this, "Ingrese un codigo valido"); 
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        matActual=null;
        
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        try{
       
            Integer codigo=Integer.parseInt(jTcodigo.getText());
            String nombre = jTnombre.getText();
            
            if(nombre.isEmpty()){
            
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            Integer año=Integer.parseInt(jTaño.getText());
            Boolean estado=jRestado.isSelected();
            if(matActual==null){
            
                matActual=new Materia(codigo,nombre,año,estado);  
                matData.guardarMateria(matActual);
                
            }else{
            
                matActual.setidMateria(codigo);
                matActual.setNombre(nombre);
                matActual.setAnio(año);
                matData.modificarMateria(matActual);
                
            }
        }catch(NumberFormatException nfe){
        
            JOptionPane.showMessageDialog(this, "Debe ingresar el codigo valido");
        } 
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodigoActionPerformed
    private void limpiarCampos(){
    
        jTcodigo.setText("");
        jTnombre.setText("");
        jTaño.setText("");
        jRestado.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTaño;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
