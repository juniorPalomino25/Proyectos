/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Estructura.ListaAgencia;
import Estructura.ListaProducto;
import Modelo.Agencia;
import Modelo.Boleta;
import Modelo.Producto;
import Sistema.OlvaCourier;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FrmRegistroProducto extends javax.swing.JFrame {

    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    private Producto p5;
    
    public FrmRegistroProducto() {
        initComponents();
        
        Calendar hoy = Calendar.getInstance();
        etiquetaHora.setText(hoy.getTime().toString());
        etiquetaNombre.setText("Hola, "+OlvaCourier.clienteActual.getNombres());
        p1 = new Producto("", 0, 0, 0, 0, 0);
        p2 = new Producto("", 0, 0, 0, 0, 0);
        p3 = new Producto("", 0, 0, 0, 0, 0);
        p4 = new Producto("", 0, 0, 0, 0, 0);
        p5 = new Producto("", 0, 0, 0, 0, 0);
        
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
    
    public void instanciarValores(Producto p){
        campoNombreProducto.setText(p.getNombreProducto());
        campoPeso.setText(String.valueOf(p.getPeso()));
        campoLargo.setText(String.valueOf(p.getLargo()));
        campoAlto.setText(String.valueOf(p.getAlto()));
        campoAncho.setText(String.valueOf(p.getAncho()));
         
    }
    
    public void guardarValores(Producto p){
        try{
        p.setNombreProducto(campoNombreProducto.getText());
        p.setPeso(Double.parseDouble(campoPeso.getText()));
        p.setLargo(Double.parseDouble(campoLargo.getText()));
        p.setAlto(Double.parseDouble(campoAlto.getText()));
        p.setPeso(Double.parseDouble(campoPeso.getText()));
        }catch(Exception e){
            //OE TE NO HAY NADA EN LOS CAMPOS DE PESO Y BALA BLLBALBALBA
        }
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        TituloRegistroEnvio = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        ComboNProductos = new javax.swing.JComboBox<>();
        N = new javax.swing.JLabel();
        etiquetaNompreProducto = new javax.swing.JLabel();
        campoNombreProducto = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        etiquetaAlto = new javax.swing.JLabel();
        campoAlto = new javax.swing.JTextField();
        etiquetaAncho = new javax.swing.JLabel();
        campoAncho = new javax.swing.JTextField();
        etiquetaLargo = new javax.swing.JLabel();
        campoLargo = new javax.swing.JTextField();
        etiquetaAgenciaOrigen = new javax.swing.JLabel();
        etiquetaKg = new javax.swing.JLabel();
        etiquetacmAl = new javax.swing.JLabel();
        etiquetacmAn = new javax.swing.JLabel();
        etiquetacmL = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox<>();
        etiquetaDestino = new javax.swing.JLabel();
        comboOrigen = new javax.swing.JComboBox<>();
        botonSiguiente = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TituloRegistroEnvio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TituloRegistroEnvio.setText("Registro de Envio");

        etiquetaNombre.setText("Nombre del cliente");

        etiquetaHora.setText("Hora actual");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TituloRegistroEnvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(etiquetaNombre)
                .addGap(89, 89, 89)
                .addComponent(etiquetaHora)
                .addGap(100, 100, 100))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaHora)))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(TituloRegistroEnvio)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        ComboNProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        ComboNProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNProductosActionPerformed(evt);
            }
        });

        N.setText("N°");

        etiquetaNompreProducto.setText("Nombre producto: ");

        etiquetaPeso.setText("Peso");

        etiquetaAlto.setText("Alto");

        etiquetaAncho.setText("Ancho");

        etiquetaLargo.setText("Largo");

        etiquetaAgenciaOrigen.setText("Agencia Origen");

        etiquetaKg.setText("Kg.");

        etiquetacmAl.setText("cm.");

        etiquetacmAn.setText("cm.");

        etiquetacmL.setText("cm.");

        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));

        etiquetaDestino.setText("Agencia Destino");

        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        comboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrigenActionPerformed(evt);
            }
        });

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(N)
                .addGap(18, 18, 18)
                .addComponent(ComboNProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar)
                .addGap(86, 86, 86))
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(etiquetaLargo)
                        .addGap(18, 18, 18)
                        .addComponent(campoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetacmL)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaAlto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetacmAl)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaAncho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetacmAn))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(etiquetaAgenciaOrigen)
                        .addGap(18, 18, 18)
                        .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(etiquetaDestino)
                        .addGap(18, 18, 18)
                        .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonSiguiente)
                        .addGroup(BodyLayout.createSequentialGroup()
                            .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(BodyLayout.createSequentialGroup()
                                    .addComponent(etiquetaPeso)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoPeso))
                                .addComponent(etiquetaNompreProducto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaKg)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboNProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N)
                    .addComponent(botonGuardar))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNompreProducto)
                    .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPeso)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaKg))
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLargo)
                    .addComponent(campoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetacmL)
                    .addComponent(etiquetaAlto)
                    .addComponent(campoAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetacmAl)
                    .addComponent(etiquetaAncho)
                    .addComponent(campoAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetacmAn))
                .addGap(75, 75, 75)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAgenciaOrigen)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDestino)
                    .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(botonSiguiente)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboNProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNProductosActionPerformed
        int index= ComboNProductos.getSelectedIndex()+1;
        
        switch(index){
            case 1: instanciarValores(p1);break;
            case 2: instanciarValores(p2);break;
            case 3: instanciarValores(p3);break;
            case 4: instanciarValores(p4);break;
            case 5: instanciarValores(p5);break;
        }
        
    }//GEN-LAST:event_ComboNProductosActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        
        if(comboDestino.getSelectedItem().equals(comboOrigen.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "No puedes colocar el mismo ORIGEN Y DESTINO ");
        }
        else if(p1.getNombreProducto()==""){
            JOptionPane.showMessageDialog(null, "No se colocó ningun producto ");
        }else{
            int input = JOptionPane.showConfirmDialog(null, "¿Estás seguro de los cambios establecidos?");
            // 0=yes, 1=no, 2=cancel
            if(input==0){
                
                //darPreciosALosProductos()
                //darPreciosALosProductos()
                //darPreciosALosProductos()
                //darPreciosALosProductos()
                //darPreciosALosProductos()
                
                OlvaCourier.listaProductoActual.InsertarNodo(p1);
                OlvaCourier.listaProductoActual.InsertarNodo(p2);
                OlvaCourier.listaProductoActual.InsertarNodo(p3);
                OlvaCourier.listaProductoActual.InsertarNodo(p4);
                OlvaCourier.listaProductoActual.InsertarNodo(p5);
                
                OlvaCourier.boletaActual.setAgenciaInicial(OlvaCourier.agencias.getAgencia(comboOrigen.getSelectedItem().toString()));
                OlvaCourier.boletaActual.setAgenciaFinal(OlvaCourier.agencias.getAgencia(comboDestino.getSelectedItem().toString()));
                
                
            FrmBoleta boleta = new FrmBoleta();
            this.dispose();
            }
        }
        
        
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        int index = ComboNProductos.getSelectedIndex()+1;
        
        switch(index){
            case 1: guardarValores(p1);break;
            case 2: guardarValores(p2);break;
            case 3: guardarValores(p3);break;
            case 4: guardarValores(p4);break;
            case 5: guardarValores(p5);break;
            
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void comboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrigenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JComboBox<String> ComboNProductos;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel N;
    private javax.swing.JLabel TituloRegistroEnvio;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField campoAlto;
    private javax.swing.JTextField campoAncho;
    private javax.swing.JTextField campoLargo;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboOrigen;
    private javax.swing.JLabel etiquetaAgenciaOrigen;
    private javax.swing.JLabel etiquetaAlto;
    private javax.swing.JLabel etiquetaAncho;
    private javax.swing.JLabel etiquetaDestino;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaKg;
    private javax.swing.JLabel etiquetaLargo;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNompreProducto;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetacmAl;
    private javax.swing.JLabel etiquetacmAn;
    private javax.swing.JLabel etiquetacmL;
    private javax.swing.JPanel fondo;
    // End of variables declaration//GEN-END:variables
}