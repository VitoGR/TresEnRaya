package Ejercicios;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tablero extends javax.swing.JFrame {

    private boolean casilla[][] = new boolean[3][3];
    private int matriz[][] = new int[3][3];
    private String turnos = "us1";
    private String u1, u2;
    private int pun1 = 0, pun2 = 0, em = 0;

    public Tablero(String u1, String u2) {
        initComponents();
        setLocationRelativeTo(null);
        llenarCasilla();
        llenarMatriz();
        comprobarMatriz();
        this.u1 = u1;
        this.u2 = u2;

    }

    private void llenarCasilla() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }

    private void llenarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    private void x(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/X.png")));
    }

    private void o(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/O.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pnlFondo = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        menuPuntaje = new javax.swing.JMenuItem();
        menuPrincipal = new javax.swing.JMenuItem();
        menuReiniciar = new javax.swing.JMenuItem();
        Separador = new javax.swing.JPopupMenu.Separator();
        btnSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(585, 429));
        setMinimumSize(new java.awt.Dimension(585, 429));
        setUndecorated(true);
        setResizable(false);

        pnlFondo.setLayout(new java.awt.GridLayout(3, 3));

        b1.setMaximumSize(new java.awt.Dimension(200, 200));
        b1.setMinimumSize(new java.awt.Dimension(200, 200));
        b1.setPreferredSize(new java.awt.Dimension(200, 200));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        pnlFondo.add(b1);

        b2.setMaximumSize(new java.awt.Dimension(200, 200));
        b2.setMinimumSize(new java.awt.Dimension(200, 200));
        b2.setPreferredSize(new java.awt.Dimension(200, 200));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        pnlFondo.add(b2);

        b3.setMaximumSize(new java.awt.Dimension(200, 200));
        b3.setMinimumSize(new java.awt.Dimension(200, 200));
        b3.setPreferredSize(new java.awt.Dimension(200, 200));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        pnlFondo.add(b3);

        b4.setMaximumSize(new java.awt.Dimension(200, 200));
        b4.setMinimumSize(new java.awt.Dimension(200, 200));
        b4.setPreferredSize(new java.awt.Dimension(200, 200));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        pnlFondo.add(b4);

        b5.setMaximumSize(new java.awt.Dimension(200, 200));
        b5.setMinimumSize(new java.awt.Dimension(200, 200));
        b5.setPreferredSize(new java.awt.Dimension(200, 200));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        pnlFondo.add(b5);

        b6.setMaximumSize(new java.awt.Dimension(200, 200));
        b6.setMinimumSize(new java.awt.Dimension(200, 200));
        b6.setPreferredSize(new java.awt.Dimension(200, 200));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        pnlFondo.add(b6);

        b7.setMaximumSize(new java.awt.Dimension(200, 200));
        b7.setMinimumSize(new java.awt.Dimension(200, 200));
        b7.setPreferredSize(new java.awt.Dimension(200, 200));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        pnlFondo.add(b7);

        b8.setMaximumSize(new java.awt.Dimension(200, 200));
        b8.setMinimumSize(new java.awt.Dimension(200, 200));
        b8.setPreferredSize(new java.awt.Dimension(200, 200));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        pnlFondo.add(b8);

        b9.setMaximumSize(new java.awt.Dimension(200, 200));
        b9.setMinimumSize(new java.awt.Dimension(200, 200));
        b9.setPreferredSize(new java.awt.Dimension(200, 200));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        pnlFondo.add(b9);

        menuJuego.setText("Juego");

        menuPuntaje.setText("Puntajes");
        menuPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPuntajeActionPerformed(evt);
            }
        });
        menuJuego.add(menuPuntaje);

        menuPrincipal.setText("Menú principal");
        menuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalActionPerformed(evt);
            }
        });
        menuJuego.add(menuPrincipal);

        menuReiniciar.setText("Reiniciar");
        menuReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReiniciarActionPerformed(evt);
            }
        });
        menuJuego.add(menuReiniciar);
        menuJuego.add(Separador);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuJuego.add(btnSalir);

        Menu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        Menu.add(menuAyuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void menuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalActionPerformed
        pun1 = 0;
        pun2 = 0;
        em = 0;
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPrincipalActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if (casilla[0][0] == true) {
            if (turnos.equals("us1")) {
                x(b1);
                matriz[0][0] = 1;
                turnos = "us2";
            } else {
                o(b1);
                matriz[0][0] = 2;
                turnos = "us1";
            }
        }
        casilla[0][0] = false;
        comprobarMatriz();

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (casilla[0][1] == true) {
            if (turnos.equals("us1")) {
                x(b2);
                matriz[0][1] = 1;
                turnos = "us2";
            } else {
                o(b2);
                matriz[0][1] = 2;
                turnos = "us1";
            }
        }
        casilla[0][1] = false;
        comprobarMatriz();

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (casilla[0][2] == true) {
            if (turnos.equals("us1")) {
                x(b3);
                matriz[0][2] = 1;
                turnos = "us2";
            } else {
                o(b3);
                matriz[0][2] = 2;
                turnos = "us1";
            }
        }
        casilla[0][2] = false;
        comprobarMatriz();

    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (casilla[1][0] == true) {
            if (turnos.equals("us1")) {
                x(b4);
                matriz[1][0] = 1;
                turnos = "us2";
            } else {
                o(b4);
                matriz[1][0] = 2;
                turnos = "us1";
            }
        }
        casilla[1][0] = false;
        comprobarMatriz();

    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (casilla[1][1] == true) {
            if (turnos.equals("us1")) {
                x(b5);
                matriz[1][1] = 1;
                turnos = "us2";
            } else {
                o(b5);
                matriz[1][1] = 2;
                turnos = "us1";
            }
        }
        casilla[1][1] = false;
        comprobarMatriz();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (casilla[1][2] == true) {
            if (turnos.equals("us1")) {
                x(b6);
                matriz[1][2] = 1;
                turnos = "us2";
            } else {
                o(b6);
                matriz[1][2] = 2;
                turnos = "us1";
            }
        }
        casilla[1][2] = false;
        comprobarMatriz();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (casilla[2][0] == true) {
            if (turnos.equals("us1")) {
                x(b7);
                matriz[2][0] = 1;
                turnos = "us2";
            } else {
                o(b7);
                matriz[2][0] = 2;
                turnos = "us1";
            }
        }
        casilla[2][0] = false;
        comprobarMatriz();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (casilla[2][1] == true) {
            if (turnos.equals("us1")) {
                x(b8);
                matriz[2][1] = 1;
                turnos = "us2";
            } else {
                o(b8);
                matriz[2][1] = 2;
                turnos = "us1";
            }
        }
        casilla[2][1] = false;
        comprobarMatriz();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (casilla[2][2] == true) {
            if (turnos.equals("us1")) {
                x(b9);
                matriz[2][2] = 1;
                turnos = "us2";
            } else {
                o(b9);
                matriz[2][2] = 2;
                turnos = "us1";
            }
        }
        casilla[2][2] = false;
        comprobarMatriz();
    }//GEN-LAST:event_b9ActionPerformed

    private void menuPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPuntajeActionPerformed
        Resultado rs = new Resultado(this, true, u1, u2, pun1, pun2, em);
        rs.setVisible(true);

    }//GEN-LAST:event_menuPuntajeActionPerformed

    private void menuReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReiniciarActionPerformed
        pun1 = 0;
        pun2 = 0;
        em = 0;
        reiniciar();

        Turnos tr = new Turnos(this, true, u1, u2);
        tr.setVisible(true);
        turnos = tr.getTur();
    }//GEN-LAST:event_menuReiniciarActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://www.guiainfantil.com/articulos/ocio/juegos/juego-de-tres-en-raya-como-jugar-con-los-ninos-con-papel-y-lapiz/"));
            } catch (IOException ex) {
              //  Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarMatriz() {
        boolean j1 = false;
        boolean j2 = false;
        int empate = 0;
        int jug1 = 0, jug2 = 0;

        Turnos tr = new Turnos(this, true, u1, u2);

        j1 = comprobar(1);
        j2 = comprobar(2);

        if (j1 == true) {
            jug1 = 1;
        } else if (j2 == true) {
            jug2 = 2;
        }
        int aleatorio;
        aleatorio = (int) (Math.random() * 100);

        if (j1 == true) {
            Ganador g1 = new Ganador(this, true, jug1, aleatorio, u1, u2);
            g1.setVisible(true);
            pun1++;
            reiniciar();
            tr.setVisible(true);
            turnos = tr.getTur();
        } else if (j2 == true) {
            Ganador g2 = new Ganador(this, true, jug2, aleatorio, u1, u2);
            g2.setVisible(true);
            pun2++;
            reiniciar();
            tr.setVisible(true);
            turnos = tr.getTur();
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != 0) {
                        empate++;
                    }
                }
            }
        }

        if (empate == 9) {
            Empate e = new Empate(this, true, aleatorio, u1, u2);
            e.setVisible(true);
            em++;
            tr.setVisible(true);
            turnos = tr.getTur();
            reiniciar();
        } else {
            empate = 0;
        }
    }

    private boolean comprobar(int num) {
        boolean ganador = false;

        if (matriz[0][0] == num && matriz[0][1] == num && matriz[0][2] == num) {
            ganador = true;
        } else if (matriz[1][0] == num && matriz[1][1] == num && matriz[1][2] == num) {
            ganador = true;
        } else if (matriz[2][0] == num && matriz[2][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][1] == num && matriz[2][0] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num) {
            ganador = true;
        } else if (matriz[0][1] == num && matriz[1][1] == num && matriz[2][1] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][2] == num && matriz[2][2] == num) {
            ganador = true;
        }

        return ganador;

    }

    private void reiniciar() {
        /*
        vuelvo a cero la matriz
        vuelvo a true las casillas
        quito todas las imagenes de los botones
         */
        llenarCasilla();
        llenarMatriz();

        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JPopupMenu.Separator Separador;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem menuPrincipal;
    private javax.swing.JMenuItem menuPuntaje;
    private javax.swing.JMenuItem menuReiniciar;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
