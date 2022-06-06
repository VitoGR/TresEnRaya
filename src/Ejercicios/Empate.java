package Ejercicios;

import java.awt.Color;

public class Empate extends javax.swing.JDialog {

    private int al;
    private String u1;
    private String u2;

    public Empate(java.awt.Frame parent, boolean modal, int al, String u1, String u2) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        et1.setVisible(false);
        et2.setVisible(false);
        et3.setVisible(false);
        
        this.al = al;
        this.u1 = u1;
        this.u2 = u2;
        
        gf();
    }
    
    private void gf(){
        
        if (al <= 33) {
            et1.setVisible(true);
            lblEmpate.setForeground(Color.CYAN);
            lblEmpate.setText("Empate " + u1 + " y " + u2);
        } else if (al >= 34 && al <= 67) {
            et2.setVisible(true);
            lblEmpate.setLocation(0, 100);
            lblEmpate.setForeground(Color.RED);
            lblEmpate.setText("Tristes " + u1 + " y " + u2);
        } else if (al >= 68 && al <= 100) {
            et3.setVisible(true);
            lblEmpate.setForeground(Color.yellow);
            lblEmpate.setText("Sigan Participando " + u1 + " y " + u2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEmpate = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblEmpate = new javax.swing.JLabel();
        et1 = new javax.swing.JLabel();
        et2 = new javax.swing.JLabel();
        et3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlEmpate.setMaximumSize(new java.awt.Dimension(500, 400));
        pnlEmpate.setMinimumSize(new java.awt.Dimension(500, 400));
        pnlEmpate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setBackground(new java.awt.Color(51, 51, 51));
        btnJugar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Segui Jugando");
        btnJugar.setMaximumSize(new java.awt.Dimension(139, 27));
        btnJugar.setMinimumSize(new java.awt.Dimension(139, 27));
        btnJugar.setPreferredSize(new java.awt.Dimension(139, 27));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        pnlEmpate.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(139, 27));
        btnSalir.setMinimumSize(new java.awt.Dimension(139, 27));
        btnSalir.setPreferredSize(new java.awt.Dimension(139, 27));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlEmpate.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 0, 130, -1));

        lblEmpate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblEmpate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpate.setText("Empate");
        pnlEmpate.add(lblEmpate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, -1));

        et1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yama.gif"))); // NOI18N
        pnlEmpate.add(et1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        et2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pika.gif"))); // NOI18N
        pnlEmpate.add(et2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        et3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/musculoso.gif"))); // NOI18N
        pnlEmpate.add(et3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEmpate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEmpate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel et1;
    private javax.swing.JLabel et2;
    private javax.swing.JLabel et3;
    private javax.swing.JLabel lblEmpate;
    private javax.swing.JPanel pnlEmpate;
    // End of variables declaration//GEN-END:variables
}
