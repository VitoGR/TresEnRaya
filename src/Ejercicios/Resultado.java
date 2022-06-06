
package Ejercicios;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class Resultado extends javax.swing.JDialog {

    private DefaultTableModel model = new DefaultTableModel();
    private String u1;
    private String u2;
    private int punt1;
    private int punt2;
    private int em;
    
    public Resultado(java.awt.Frame parent, boolean modal,String u1,String u2, int punt1, int punt2, int em) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        
        this.u1 = u1;
        this.u2 = u2;
        this.punt1 = punt1;
        this.punt2 = punt2;
        this.em = em;
        cargar();
    }

    private void cargar(){
        tblResultados.setForeground(Color.ORANGE);
        tblResultados.setBackground(Color.DARK_GRAY);
        model.addColumn(""+u1 + " 'X' ");
        model.addColumn(""+u2 + " 'O' ");
        model.addColumn("Empate ");
        
        String[] fila = {String.valueOf(punt1),String.valueOf(punt2),String.valueOf(em)};
        
        model.addRow(fila);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRes = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 225));
        setMinimumSize(new java.awt.Dimension(500, 225));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 200));
        setResizable(false);

        pnlRes.setMaximumSize(new java.awt.Dimension(500, 200));
        pnlRes.setMinimumSize(new java.awt.Dimension(500, 225));
        pnlRes.setPreferredSize(new java.awt.Dimension(500, 200));

        btnJugar.setBackground(new java.awt.Color(51, 51, 51));
        btnJugar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Seguir Jugando");
        btnJugar.setPreferredSize(new java.awt.Dimension(139, 27));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(129, 34));
        btnSalir.setMinimumSize(new java.awt.Dimension(129, 34));
        btnSalir.setPreferredSize(new java.awt.Dimension(139, 27));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Resultados");

        tblResultados.setModel(model);
        jScrollPane1.setViewportView(tblResultados);

        javax.swing.GroupLayout pnlResLayout = new javax.swing.GroupLayout(pnlRes);
        pnlRes.setLayout(pnlResLayout);
        pnlResLayout.setHorizontalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlResLayout.setVerticalGroup(
            pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResLayout.createSequentialGroup()
                .addGroup(pnlResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRes, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlRes;
    private javax.swing.JTable tblResultados;
    // End of variables declaration//GEN-END:variables
}
