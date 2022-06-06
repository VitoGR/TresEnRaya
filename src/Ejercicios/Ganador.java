package Ejercicios;

import java.awt.Color;

public class Ganador extends javax.swing.JDialog {

    private int j;
    private int al;
    private String ganador1;
    private String ganador2;

    public Ganador(java.awt.Frame parent, boolean modal, int j, int al, String ganador1, String ganador2) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);

        this.j = j;
        this.al = al;
        this.ganador1 = ganador1;
        this.ganador2 = ganador2;
        e1.setVisible(false);
        e2.setVisible(false);
        e3.setVisible(false);
        gif();
    }

    private void gif() {
        if (al <= 33 && j == 1) {
            e1.setVisible(true);
            lblGanador.setForeground(Color.yellow);
            lblGanador.setText("Felicidades " + ganador1);
        } else if (al <= 33 && j == 2) {
            e1.setVisible(true);
            lblGanador.setForeground(Color.yellow);
            lblGanador.setText("Felicidades " + ganador2);
        } else if (al >= 34 && al <= 67 && j == 1) {
            lblGanador.setForeground(Color.BLACK);
            e2.setVisible(true);
            lblGanador.setText("Felicidades " + ganador1);
        } else if (al >= 34 && al <= 67 && j == 2) {
            e2.setVisible(true);
            lblGanador.setForeground(Color.BLACK);
            lblGanador.setText("Felicidades " + ganador2);
        } else if (al >= 68 && al <= 100 && j == 1) {
            e3.setVisible(true);
            lblGanador.setForeground(Color.yellow);
            lblGanador.setText("Felicidades " + ganador1);
        } else if (al >= 68 && al <= 100 && j == 2) {
            e3.setVisible(true);
            lblGanador.setForeground(Color.yellow);
            lblGanador.setText("Felicidades " + ganador1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGanador = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblGanador = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlGanador.setMaximumSize(new java.awt.Dimension(500, 400));
        pnlGanador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setBackground(new java.awt.Color(51, 51, 51));
        btnJugar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Seguir Jugando");
        btnJugar.setMaximumSize(new java.awt.Dimension(139, 27));
        btnJugar.setMinimumSize(new java.awt.Dimension(139, 27));
        btnJugar.setPreferredSize(new java.awt.Dimension(139, 27));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        pnlGanador.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 139, 27));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setLabel("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(139, 27));
        btnSalir.setMinimumSize(new java.awt.Dimension(139, 27));
        btnSalir.setPreferredSize(new java.awt.Dimension(139, 27));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlGanador.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 0, 139, 27));

        lblGanador.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        lblGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanador.setText("Felicidades");
        pnlGanador.add(lblGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 50));

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/win1.gif"))); // NOI18N
        e1.setToolTipText("");
        pnlGanador.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unico.gif"))); // NOI18N
        e2.setToolTipText("");
        pnlGanador.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shin.gif"))); // NOI18N
        e3.setToolTipText("");
        pnlGanador.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGanador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGanador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JPanel pnlGanador;
    // End of variables declaration//GEN-END:variables
}
