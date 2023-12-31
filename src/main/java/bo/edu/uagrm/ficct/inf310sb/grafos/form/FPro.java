/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bo.edu.uagrm.ficct.inf310sb.grafos.form;

import bo.edu.uagrm.ficct.inf310sb.grafos.excepciones.AristaYaExisteExcepcion;
import bo.edu.uagrm.ficct.inf310sb.grafos.excepciones.NroVerticesInvalidoExcepcion;
import bo.edu.uagrm.ficct.inf310sb.grafos.pesados.AlgDijkstra;
import bo.edu.uagrm.ficct.inf310sb.grafos.pesados.GrafoPesado;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 59178
 */
public class FPro extends javax.swing.JFrame {
    int CANTIDAD_VERTICES=10;
    GrafoPesado grafo1;
    int UAGRM = 0;
    int LINCOLN_SCHOOL = 1;
    int VENTURA_MALL = 2;
    int CINE_CENTER = 3;
    int AEROPUERTO = 4;
    int PARQUE = 5;
    int ZOO = 6;
    int UTEPSA = 7;
    int UPSA = 8;
    int RAMADA = 9;
    

    /**
     * Creates new form FPro
     */
    public FPro() throws NroVerticesInvalidoExcepcion {
        initComponents();
        setLocationRelativeTo(null);
        grafo1 = new GrafoPesado(CANTIDAD_VERTICES);
        
       
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
        Aero = new javax.swing.JLabel();
        Zoolo = new javax.swing.JLabel();
        Uagrm = new javax.swing.JLabel();
        CineCenter = new javax.swing.JLabel();
        Ventura = new javax.swing.JLabel();
        Ups = new javax.swing.JLabel();
        Lincoln = new javax.swing.JLabel();
        Utepsa = new javax.swing.JLabel();
        ramada = new javax.swing.JLabel();
        Parq = new javax.swing.JLabel();
        parqToUagr = new javax.swing.JTextField();
        zooToParq = new javax.swing.JTextField();
        utepToZoo = new javax.swing.JTextField();
        upsToUtep = new javax.swing.JTextField();
        ramToUp = new javax.swing.JTextField();
        ramToVen = new javax.swing.JTextField();
        ventToLin = new javax.swing.JTextField();
        uagToLin = new javax.swing.JTextField();
        cineToAero = new javax.swing.JTextField();
        aeroToPark = new javax.swing.JTextField();
        ramToCine = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_res = new javax.swing.JTextArea();
        partida = new javax.swing.JComboBox<>();
        destino = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ventuToCine = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aero.setForeground(new java.awt.Color(255, 255, 255));
        Aero.setText("AEROPUERTO");
        jPanel1.add(Aero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        Zoolo.setForeground(new java.awt.Color(255, 255, 255));
        Zoolo.setText("ZOOLOGICO");
        jPanel1.add(Zoolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        Uagrm.setForeground(new java.awt.Color(255, 255, 255));
        Uagrm.setText("UAGRM");
        jPanel1.add(Uagrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        CineCenter.setForeground(new java.awt.Color(255, 255, 255));
        CineCenter.setText("CINE CENTER");
        jPanel1.add(CineCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        Ventura.setForeground(new java.awt.Color(255, 255, 255));
        Ventura.setText("VENTURA MALL");
        jPanel1.add(Ventura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        Ups.setForeground(new java.awt.Color(255, 255, 255));
        Ups.setText("UPSA");
        jPanel1.add(Ups, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, -1));

        Lincoln.setForeground(new java.awt.Color(255, 255, 255));
        Lincoln.setText("LINCOLN SCHOOL");
        jPanel1.add(Lincoln, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        Utepsa.setForeground(new java.awt.Color(255, 255, 255));
        Utepsa.setText("UTEPSA");
        jPanel1.add(Utepsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        ramada.setForeground(new java.awt.Color(255, 255, 255));
        ramada.setText("RAMADA");
        jPanel1.add(ramada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, -1, 20));

        Parq.setForeground(new java.awt.Color(255, 255, 255));
        Parq.setText("PARQUE");
        Parq.setName(""); // NOI18N
        jPanel1.add(Parq, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        parqToUagr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        parqToUagr.setText("112");
        jPanel1.add(parqToUagr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        zooToParq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        zooToParq.setText("16");
        jPanel1.add(zooToParq, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 50, -1));

        utepToZoo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        utepToZoo.setText("8");
        jPanel1.add(utepToZoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 190, 40, -1));

        upsToUtep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        upsToUtep.setText("7");
        jPanel1.add(upsToUtep, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 410, 40, -1));

        ramToUp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ramToUp.setText("13");
        jPanel1.add(ramToUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 40, -1));

        ramToVen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ramToVen.setText("30");
        jPanel1.add(ramToVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 40, -1));

        ventToLin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ventToLin.setText("15");
        jPanel1.add(ventToLin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 40, -1));

        uagToLin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uagToLin.setText("9");
        jPanel1.add(uagToLin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, -1));

        cineToAero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cineToAero.setText("10");
        jPanel1.add(cineToAero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 40, -1));

        aeroToPark.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        aeroToPark.setText("5");
        jPanel1.add(aeroToPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 40, -1));

        ramToCine.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ramToCine.setText("12");
        jPanel1.add(ramToCine, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 40, -1));

        jta_res.setColumns(20);
        jta_res.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jta_res.setRows(5);
        jScrollPane1.setViewportView(jta_res);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 540, 250));

        partida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        partida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lugar de partida", "Lincoln School", "Ventura mall", "Cine Center", "Aeropuerto", "Parque", "Uagrm", "Upsa", "Utepsa", "Zoologico", "Ramada" }));
        partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidaActionPerformed(evt);
            }
        });
        jPanel1.add(partida, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        destino.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lugar de destino", "Lincoln School", "Ventura mall", "Cine Center", "Aeropuerto", "Parque", "Uagrm", "Upsa", "Utepsa", "Zoologico", "Ramada" }));
        jPanel1.add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        Buscar.setText("BUSCAR RUTA MAS CORTA");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MAPA SC");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIAJE:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        ventuToCine.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ventuToCine.setText("200");
        jPanel1.add(ventuToCine, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1330, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:   
  
        drawStart();
        String itemPartida = (String) partida.getSelectedItem();
        String itemDestino = (String) destino.getSelectedItem();
        if ("Lugar de partida".equals(itemPartida) || "Lugar de destino".equals(itemDestino)|| itemPartida.equals(itemDestino)) {
            JOptionPane.showMessageDialog(
                    null, "Seleccione un lugar de partida y de destino");
        } else {
            try {
               
                    grafo1.insertarArista2(this.PARQUE, this.ZOO, Double.parseDouble(zooToParq.getText()));
                    grafo1.insertarArista2(this.ZOO, this.UTEPSA, Double.parseDouble(utepToZoo.getText()));
                    grafo1.insertarArista2(this.UTEPSA, this.UPSA, Double.parseDouble(upsToUtep.getText()));
                    grafo1.insertarArista2(this.RAMADA, this.UPSA, Double.parseDouble(ramToUp.getText()));
                    grafo1.insertarArista2(this.RAMADA, this.CINE_CENTER, Double.parseDouble(ramToCine.getText()));
                    grafo1.insertarArista2(this.RAMADA, this.VENTURA_MALL, Double.parseDouble(ramToVen.getText()));
                    grafo1.insertarArista2(this.CINE_CENTER, this.AEROPUERTO, Double.parseDouble(cineToAero.getText()));
                    grafo1.insertarArista2(this.AEROPUERTO, this.PARQUE, Double.parseDouble(aeroToPark.getText()));
                    grafo1.insertarArista2(this.VENTURA_MALL, this.LINCOLN_SCHOOL, Double.parseDouble(ventToLin.getText()));
                    grafo1.insertarArista2(this.LINCOLN_SCHOOL, this.UAGRM, Double.parseDouble(uagToLin.getText()));
                    grafo1.insertarArista2(this.UAGRM, this.PARQUE, Double.parseDouble(parqToUagr.getText()));
                    grafo1.insertarArista2(this.VENTURA_MALL,this.CINE_CENTER,Double.parseDouble(ventuToCine.getText()));
                  
             
                int posVerticeOrigen = getEquivalenteNumerico(itemPartida);
                int posVerticeDestino = getEquivalenteNumerico(itemDestino);
                AlgDijkstra alg = new AlgDijkstra(grafo1, posVerticeOrigen, posVerticeDestino);
                List<Integer> verticesCamino = alg.verticesATomar(posVerticeOrigen, posVerticeDestino);
                String costoOrigenToDestino = String.valueOf(alg.getCostoDeOrigenToDestino(posVerticeDestino));
                String lugaresCamino = getLugaresEquivalentes(verticesCamino);
                dibujarCamino(verticesCamino);
                jta_res.setText("Debemos tomar el camino que pasa por los sgtes lugares: \n"
                        + lugaresCamino + "\n" + "Distancia: " + costoOrigenToDestino + " KM ");
              grafo1=new GrafoPesado(CANTIDAD_VERTICES);
            
            } catch (AristaYaExisteExcepcion ex) {
                Logger.getLogger(FPro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NroVerticesInvalidoExcepcion ex) {
                Logger.getLogger(FPro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed
    public void paint(Graphics g){
    
      super.paint(g);
      /*dibujar linea
        *  se necesita coordenadaa
        *x inicial 
        * y inicial 
        *x final 
        * y final 
      
      */
      g.drawLine(300,100,200,200);
      g.setColor(Color.RED);
      
     //g.setcolor(new color(rgb); //busca el rgb a tu gusto xd
    
    }
    private void partidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partidaActionPerformed
    public int getEquivalenteNumerico(String seleccionado) {
        int equivalente = -1;
        switch (seleccionado) {
            case "Lincoln School" ->
                equivalente = this.LINCOLN_SCHOOL;
            case "Ventura mall" ->
                equivalente = this.VENTURA_MALL;
            case "Cine Center" ->
                equivalente = this.CINE_CENTER;
            case "Aeropuerto" ->
                equivalente = this.AEROPUERTO;
            case "Parque" ->
                equivalente = this.PARQUE;
            case "Uagrm" ->
                equivalente = this.UAGRM;
            case "Upsa" ->
                equivalente = this.UPSA;
            case "Utepsa" ->
                equivalente = this.UTEPSA;
            case "Zoologico" ->
                equivalente = this.ZOO;
            case "Ramada" ->
                equivalente = this.RAMADA;
            default ->
                throw new AssertionError();
        }
        return equivalente;
    }

    public String getLugaresEquivalentes(List<Integer> caminoATomar) {
        String equivalente = "";
        for (Integer posVertice : caminoATomar) {
            equivalente = equivalente + " -> " + getEquivalenteLugar(posVertice) + "\n";
        }
        return equivalente;
    }

    private String getEquivalenteLugar(int posVertice) {
        String equivalente = "";
        switch (posVertice) {
            case 0 ->
                equivalente = "UAGRM";
            case 1 ->
                equivalente = "LINCOLN SCHOOL";
            case 2 ->
                equivalente = "VENTURA MALL";
            case 3 ->
                equivalente = "CINE CENTER";
            case 4 ->
                equivalente = "AEROPUERTO";
            case 5 ->
                equivalente = "PARQUE";
            case 6 ->
                equivalente = "ZOOLOGICO";
            case 7 ->
                equivalente = "UTEPSA";
            case 8 ->
                equivalente = "UPSA";
            case 9 ->
                equivalente = "RAMADA";
            default ->
                throw new AssertionError();
        }
        return equivalente;
    }

    public void dibujarCamino(List<Integer> caminoAPintar) {
        for (Integer posVertice : caminoAPintar) {
            auxDibujarCamino(posVertice);

        }
    }

    private void auxDibujarCamino(int posVertice) {
        switch (posVertice) {
            case 0 ->
                Uagrm.setForeground(Color.GREEN);
            case 1 ->
                Lincoln.setForeground(Color.GREEN);
            case 2 ->
                Ventura.setForeground(Color.GREEN);
            case 3 ->
                CineCenter.setForeground(Color.GREEN);
            case 4 ->
                Aero.setForeground(Color.GREEN);
            case 5 ->
                Parq.setForeground(Color.GREEN);
            case 6 ->
                Zoolo.setForeground(Color.GREEN);
            case 7 ->
                Utepsa.setForeground(Color.GREEN);
            case 8 ->
                Ups.setForeground(Color.GREEN);
            case 9 ->
                ramada.setForeground(Color.GREEN);
            default ->
                throw new AssertionError();
        }
    }

    public void drawStart() {
        Uagrm.setForeground(Color.WHITE);
        Lincoln.setForeground(Color.WHITE);
        Ventura.setForeground(Color.WHITE);
        CineCenter.setForeground(Color.WHITE);
        Aero.setForeground(Color.white);
        Parq.setForeground(Color.WHITE);
        Zoolo.setForeground(Color.WHITE);
        Utepsa.setForeground(Color.WHITE);
        Ups.setForeground(Color.WHITE);
        ramada.setForeground(Color.WHITE);

    }

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
            java.util.logging.Logger.getLogger(FPro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FPro().setVisible(true);

                } catch (NroVerticesInvalidoExcepcion ex) {
                    Logger.getLogger(FPro.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aero;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel CineCenter;
    private javax.swing.JLabel Lincoln;
    private javax.swing.JLabel Parq;
    private javax.swing.JLabel Uagrm;
    private javax.swing.JLabel Ups;
    private javax.swing.JLabel Utepsa;
    private javax.swing.JLabel Ventura;
    private javax.swing.JLabel Zoolo;
    private javax.swing.JTextField aeroToPark;
    private javax.swing.JTextField cineToAero;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_res;
    private javax.swing.JTextField parqToUagr;
    private javax.swing.JComboBox<String> partida;
    private javax.swing.JTextField ramToCine;
    private javax.swing.JTextField ramToUp;
    private javax.swing.JTextField ramToVen;
    private javax.swing.JLabel ramada;
    private javax.swing.JTextField uagToLin;
    private javax.swing.JTextField upsToUtep;
    private javax.swing.JTextField utepToZoo;
    private javax.swing.JTextField ventToLin;
    private javax.swing.JTextField ventuToCine;
    private javax.swing.JTextField zooToParq;
    // End of variables declaration//GEN-END:variables
}
