/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package JFrame;

import java.util.Map;
import javax.swing.table.DefaultTableModel;
import trabajo_practico_5.Contacto;
import static JFrame.JFrame_Principal.contactos;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import trabajo_practico_5.Directorio;

public class JFrame_Busqueda extends javax.swing.JInternalFrame {

    private DefaultTableModel tablas = new DefaultTableModel();
    
    /**
     * Creates new form JFrame_Busqueda
     */
    public JFrame_Busqueda() {
        initComponents();
        TablasTreeMap();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaValores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jrContactos = new javax.swing.JRadioButton();
        jrCiudad = new javax.swing.JRadioButton();
        jlCambiante = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtBuscador = new javax.swing.JTextField();
        jrApellido = new javax.swing.JRadioButton();
        ContactosEnGeneral = new javax.swing.JRadioButton();
        jbExit = new javax.swing.JButton();

        TablaValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaValores);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Busqueda de contactos");

        Grupo1.add(jrContactos);
        jrContactos.setText("Telefono");
        jrContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrContactosActionPerformed(evt);
            }
        });

        Grupo1.add(jrCiudad);
        jrCiudad.setText("Ciudad");
        jrCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCiudadActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        Grupo1.add(jrApellido);
        jrApellido.setText("Apellido");
        jrApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrApellidoActionPerformed(evt);
            }
        });

        Grupo1.add(ContactosEnGeneral);
        ContactosEnGeneral.setSelected(true);
        ContactosEnGeneral.setText("Contactos");
        ContactosEnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactosEnGeneralActionPerformed(evt);
            }
        });

        jbExit.setText("Salir");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jbBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCambiante)
                            .addComponent(jtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ContactosEnGeneral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrCiudad)
                        .addGap(18, 18, 18)
                        .addComponent(jrContactos)
                        .addGap(18, 18, 18)
                        .addComponent(jrApellido)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrContactos)
                    .addComponent(jrCiudad)
                    .addComponent(jrApellido)
                    .addComponent(ContactosEnGeneral))
                .addGap(18, 18, 18)
                .addComponent(jlCambiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jbExit)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCiudadActionPerformed
        borrarFilasTabla();
        MostrarBotones();
        jlCambiante.setText("                       Coloque la ciudad:");
    }//GEN-LAST:event_jrCiudadActionPerformed

    private void jrContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrContactosActionPerformed
        borrarFilasTabla();
        MostrarBotones();
        jlCambiante.setText("        Coloque el numero de telefono:");
    }//GEN-LAST:event_jrContactosActionPerformed

    private void jrApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrApellidoActionPerformed
        borrarFilasTabla();
        MostrarBotones();
        jlCambiante.setText("                    Coloque el apellido:");
    }//GEN-LAST:event_jrApellidoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if(jrCiudad.isSelected()){
            borrarFilasTabla();
            TablaCiudad();
        }else if(jrContactos.isSelected()){
            borrarFilasTabla();
            TablaTelefono();
        }else if(jrApellido.isSelected()){
            borrarFilasTabla();
            TablaApellido();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void ContactosEnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactosEnGeneralActionPerformed
        borrarFilasTabla();
        TablasTreeMap();
    }//GEN-LAST:event_ContactosEnGeneralActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ContactosEnGeneral;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JTable TablaValores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbExit;
    private javax.swing.JLabel jlCambiante;
    private javax.swing.JRadioButton jrApellido;
    private javax.swing.JRadioButton jrCiudad;
    private javax.swing.JRadioButton jrContactos;
    private javax.swing.JTextField jtBuscador;
    // End of variables declaration//GEN-END:variables
    public void TablaCiudad(){

            String ids [] = {"Dni", "Nombre", "Apellido", "Dirección", "Ciudad"};
            tablas.setColumnIdentifiers(ids);
            TablaValores.setModel(tablas);
            
            String ciudad = jtBuscador.getText().trim(); //Obtenemos los datos del textField y los metemos en la variable ciudad
            
            Directorio directorio = new Directorio(); //Creamos una Instancia
            ArrayList<Contacto> contactosCiudad = directorio.buscarContactos(ciudad);

            
            for(Contacto contacto : contactosCiudad){
                tablas.addRow(new Object[]{contacto.getDni(),
                                           contacto.getNombre(),
                                           contacto.getApellido(),
                                           contacto.getDireccion(),
                                           contacto.getCiudad()}
                );
            }
        
    }
    
    public void TablaTelefono(){
            String ids [] = {"Dni", "Nombre", "Apellido", "Dirección", "Ciudad", "Telefono"};
            tablas.setColumnIdentifiers(ids);
            TablaValores.setModel(tablas);

            try{
            //Convertimos el jtBuscador en un Long
            Long telefono = Long.parseLong(jtBuscador.getText()); //Fijarse porque tira la exception, Pareciera que tiene algo adentro del textfield, Ya probe con trim(); 
            //PD, Sucede lo mismo en En la parte de apellido
            Directorio directorio = new Directorio(); //Creamos una Instancia
            Contacto contacto = directorio.buscarContacto(telefono);
            
            if(contacto != null){
            tablas.addRow(new Object[]{contacto.getDni(), 
                                      contacto.getNombre(),
                                      contacto.getApellido(),
                                      contacto.getDireccion(),
                                      contacto.getCiudad(),
                                      telefono}
            );                
            }else{
                JOptionPane.showMessageDialog(this, "No se encontro ningun contacto con ese numero telefonico asociado!");
            }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Ingrese caracteres validos!, Eso no es un numero de telefono...");
            }
        
    }

    public void TablaApellido(){
            String ids [] = {"Telefono", "Apellido"};
            tablas.setColumnIdentifiers(ids);
            TablaValores.setModel(tablas);
            
            String apellido = jtBuscador.getText();
            
            if(apellido.isEmpty()){
                JOptionPane.showMessageDialog(this, "El campo se encuentra vacio!, Ingrese un apellido valido...");
            }else{
                Directorio directorio = new Directorio(); //Creamos una Instancia
                TreeSet<Long> telefonos = directorio.buscarTelefono(apellido);
                for(Long telefono : telefonos){
                    tablas.addRow(new Object[]{telefono, apellido});
                }
            }
    }
    
    public void TablasTreeMap(){
        OcultarBotones();
        String ids [] = {"Dni", "Nombre", "Apellido", "Dirección", "Ciudad", "Telefono"};
        tablas.setColumnIdentifiers(ids);
        TablaValores.setModel(tablas);
        
        //Llenamos la tabla del TreeMap
        for(Map.Entry<Long, Contacto> llenar : contactos.entrySet()){
            Long telefono = llenar.getKey(); //Le agregamos la clave a la variable telefono
            Contacto contacto = llenar.getValue(); //Le ponemos los valores al contacto
            
           //Agregamos filas con los datos de los TreeMap
           tablas.addRow(new Object[]{contacto.getDni(), 
                                      contacto.getNombre(),
                                      contacto.getApellido(),
                                      contacto.getDireccion(),
                                      contacto.getCiudad(),
                                      telefono}
            );

        }
    }
    
    public void OcultarBotones(){
        this.jbBuscar.setVisible(false);
        this.jlCambiante.setVisible(false);
        this.jtBuscador.setVisible(false);
    }
    
    public void MostrarBotones(){
        this.jbBuscar.setVisible(true);
        this.jlCambiante.setVisible(true);
        this.jtBuscador.setVisible(true);
    }
    
    public void borrarFilasTabla(){ //Sacado de los apuntos, muy util!
        int filas = tablas.getRowCount()-1;
        for(int i=filas; i>=0; i--){
            tablas.removeRow(i);
        }
    }
    
}

