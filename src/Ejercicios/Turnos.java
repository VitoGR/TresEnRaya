
package Ejercicios;

public class Turnos extends javax.swing.JDialog {

    private String usu1;
    private String usu2;
    private String tur;

    public Turnos(java.awt.Frame parent, boolean modal,String usu1,String usu2) {
        super(parent, modal);
        this.usu1 = usu1;
        this.usu2 = usu2;
        initComponents();
        setLocationRelativeTo(null);
         
    }
    
    public String getTur() {
        return tur;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlfondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnJ1 = new javax.swing.JButton();
        btnJ2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setMaximumSize(new java.awt.Dimension(500, 150));
        setMinimumSize(new java.awt.Dimension(500, 150));
        setUndecorated(true);
        setResizable(false);

        pnlfondo.setBackground(new java.awt.Color(0, 0, 0));
        pnlfondo.setForeground(new java.awt.Color(0, 51, 51));
        pnlfondo.setMaximumSize(new java.awt.Dimension(500, 150));
        pnlfondo.setMinimumSize(new java.awt.Dimension(500, 150));
        pnlfondo.setPreferredSize(new java.awt.Dimension(500, 150));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Quien Jugará primero?");
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 30));

        btnJ1.setBackground(new java.awt.Color(153, 255, 255));
        btnJ1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnJ1.setForeground(new java.awt.Color(0, 0, 0));
        btnJ1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btnJ1.setMaximumSize(new java.awt.Dimension(160, 45));
        btnJ1.setMinimumSize(new java.awt.Dimension(160, 45));
        btnJ1.setPreferredSize(new java.awt.Dimension(160, 45));
        btnJ1.setText(usu1+" 'X'");
        btnJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ1ActionPerformed(evt);
            }
        });

        btnJ2.setBackground(new java.awt.Color(255, 102, 51));
        btnJ2.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnJ2.setForeground(new java.awt.Color(0, 0, 0));
        btnJ2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btnJ2.setMaximumSize(new java.awt.Dimension(160, 45));
        btnJ2.setMinimumSize(new java.awt.Dimension(160, 45));
        btnJ2.setPreferredSize(new java.awt.Dimension(160, 45));
        btnJ2.setText(usu2+" 'O'");
        btnJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlfondoLayout = new javax.swing.GroupLayout(pnlfondo);
        pnlfondo.setLayout(pnlfondoLayout);
        pnlfondoLayout.setHorizontalGroup(
            pnlfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlfondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pnlfondoLayout.setVerticalGroup(
            pnlfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ1ActionPerformed
        tur = "us1";
        dispose();
    }//GEN-LAST:event_btnJ1ActionPerformed

    private void btnJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ2ActionPerformed
        tur = "us2";
        dispose();
    }//GEN-LAST:event_btnJ2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJ1;
    private javax.swing.JButton btnJ2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlfondo;
    // End of variables declaration//GEN-END:variables
}
