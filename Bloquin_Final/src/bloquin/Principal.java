package bloquin;

import javax.swing.JTextField;

/**
 *
 * @author Helen
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        jSpinnerOutraHora.setVisible(false);
    }

    String login;
    private String dia;
    private String mes;
    String cache1, cache2, icap;
    String hora;
    private String horaCustom;
    String periodo;
    private String status;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioCache1 = new javax.swing.JRadioButton();
        jRadioCache2 = new javax.swing.JRadioButton();
        jRadioIcap = new javax.swing.JRadioButton();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerOutraHora = new javax.swing.JSpinner();
        jSpinnerMes = new javax.swing.JSpinner();
        jRadioP00 = new javax.swing.JRadioButton();
        jRadioP01 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioOutroHorario = new javax.swing.JRadioButton();
        jButtonPesquisar = new javax.swing.JButton();
        jRadioP02 = new javax.swing.JRadioButton();
        jSpinnerDia = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        buttonGroup1.add(jRadioCache1);
        buttonGroup1.add(jRadioCache2);
        buttonGroup1.add(jRadioIcap);

        buttonGroup2.add(jRadioP01);
        buttonGroup2.add(jRadioP02);
        buttonGroup2.add(jRadioOutroHorario);
        buttonGroup2.add(jRadioP00);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloquin");
        setBackground(new java.awt.Color(102, 102, 255));
        setPreferredSize(new java.awt.Dimension(480, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jRadioCache1.setText("Cache1");
        jRadioCache1.setToolTipText("Busca os arquivos do proxypac");
        getContentPane().add(jRadioCache1);
        jRadioCache1.setBounds(110, 150, 70, 23);

        jRadioCache2.setText("Cache2");
        jRadioCache2.setToolTipText("Busca arquivos do proxy Cache2");
        jRadioCache2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCache2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioCache2);
        jRadioCache2.setBounds(220, 150, 70, 23);

        jRadioIcap.setText("Icap");
        jRadioIcap.setToolTipText("Busca arquivos do proxy Icap");
        getContentPane().add(jRadioIcap);
        jRadioIcap.setBounds(320, 150, 60, 23);

        jTextFieldLogin.setToolTipText("Digita um login válido");
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLogin);
        jTextFieldLogin.setBounds(70, 60, 350, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Selecione abaixo o arquivo de busca");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 110, 250, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Digite abaixo o login ou o Ip a ser buscado");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 30, 350, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dia");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 190, 90, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mês");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 190, 90, 20);

        jSpinnerOutraHora.setModel(new javax.swing.SpinnerNumberModel(1, 0, 24, 1));
        getContentPane().add(jSpinnerOutraHora);
        jSpinnerOutraHora.setBounds(180, 310, 80, 20);

        jSpinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(jSpinnerMes);
        jSpinnerMes.setBounds(290, 190, 80, 20);

        jRadioP00.setText("00:00 às 09:59");
        jRadioP00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioP00ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioP00);
        jRadioP00.setBounds(60, 280, 120, 23);

        jRadioP01.setText("10:00 às 19:59");
        jRadioP01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioP01ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioP01);
        jRadioP01.setBounds(180, 280, 120, 23);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selecione o Período ");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 240, 250, 20);

        jRadioOutroHorario.setText("Outro Horário");
        jRadioOutroHorario.setToolTipText("Você conseguirá selecionar apenas o intervalo de 1 hora para pesquisa");
        jRadioOutroHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOutroHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioOutroHorario);
        jRadioOutroHorario.setBounds(60, 310, 110, 23);

        jButtonPesquisar.setText("Procurar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(170, 360, 110, 40);

        jRadioP02.setText("20:00 às 23:59");
        jRadioP02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioP02ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioP02);
        jRadioP02.setBounds(310, 280, 120, 23);

        jSpinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(jSpinnerDia);
        jSpinnerDia.setBounds(130, 190, 80, 20);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Bloqueio de Login");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 420, 140, 16);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Desenvolvido por Helen Cassia");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 420, 190, 16);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 470, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioCache2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCache2ActionPerformed

    }//GEN-LAST:event_jRadioCache2ActionPerformed

    private void jRadioP01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioP01ActionPerformed
        jSpinnerOutraHora.setVisible(false);
    }//GEN-LAST:event_jRadioP01ActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        if (jRadioCache1.isSelected()) {
            iniciaCache1();
        }

        if (jRadioCache2.isSelected()) {
            iniciaCache2();
        }

        if (jRadioIcap.isSelected()) {
            iniciaIcap();
        }

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jRadioOutroHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOutroHorarioActionPerformed

        if (jRadioOutroHorario.isSelected()) {
            jSpinnerOutraHora.setVisible(true);
        }

    }//GEN-LAST:event_jRadioOutroHorarioActionPerformed

    private void jRadioP00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioP00ActionPerformed
        jSpinnerOutraHora.setVisible(false);

    }//GEN-LAST:event_jRadioP00ActionPerformed

    private void jRadioP02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioP02ActionPerformed
        jSpinnerOutraHora.setVisible(false);
    }//GEN-LAST:event_jRadioP02ActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed

    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });

    }

    public void iniciaCache1() {

        try {

            if (jRadioP00.isSelected()) {
                periodo = "0";
                hora = periodo;

            }
            if (jRadioP01.isSelected()) {
                periodo = "1";
                hora = periodo;

            }
            if (jRadioP02.isSelected()) {
                periodo = "2";
                hora = periodo;

            }
            if (jRadioOutroHorario.isSelected()) {
                setHoraCustom(String.valueOf(jSpinnerOutraHora.getValue()));
                hora = getHoraCustom();
            }

            login = jTextFieldLogin.getText();
            setDia(String.valueOf(jSpinnerDia.getValue()));
            setMes(String.valueOf(jSpinnerMes.getValue()));

            cache1 = ("http_log.cache1.2014." + getMes() + "." + getDia() + "." + hora + "");

            Bloquin_Cache1 bCache1 = new Bloquin_Cache1();
            bCache1.buscaCache1(login, cache1, hora);

        } catch (Exception e) {

            System.out.println("Erro " + e);
        }

    }

    public void iniciaCache2() {

        try {

            if (jRadioP00.isSelected()) {
                periodo = "0";
            }
            if (jRadioP01.isSelected()) {
                periodo = "1";
            }
            if (jRadioP02.isSelected()) {
                periodo = "2";
            }
            if (jRadioOutroHorario.isSelected()) {
                periodo = String.valueOf(jSpinnerOutraHora.getValue());
            }

            login = jTextFieldLogin.getText();
            setDia(String.valueOf(jSpinnerDia.getValue()));
            setMes(String.valueOf(jSpinnerMes.getValue()));
            hora = periodo;

            cache2 = ("http_log.cache2.2014." + getMes() + "." + getDia() + "." + hora + "");

            Bloquin_Cache2 bCache2 = new Bloquin_Cache2();
            bCache2.buscaCache2(login, cache2, hora);

        } catch (NumberFormatException e) {

            System.out.println("Erro " + e);

        }
    }

    public void iniciaIcap() {

        try {

            if (jRadioP00.isSelected()) {
                periodo = "0";
            }
            if (jRadioP01.isSelected()) {
                periodo = "1";
            }
            if (jRadioP02.isSelected()) {
                periodo = "2";
            }
            if (jRadioOutroHorario.isSelected()) {
                periodo = String.valueOf(jSpinnerOutraHora.getValue());
            }

            hora = periodo;
            login = jTextFieldLogin.getText();
            setDia(String.valueOf(jSpinnerDia.getValue()));
            setMes(String.valueOf(jSpinnerMes.getValue()));

            icap = ("icap_log.cache1.2014." + getMes() + "." + getDia() + "." + hora + "");

            Bloquin_Icap bIcap = new Bloquin_Icap();
            bIcap.buscaIcap(login, icap, hora);

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {

        int dia2;
        dia2 = Integer.parseInt(dia);

        if (dia2 <= 9) {

            dia = String.valueOf(dia2);
            this.dia = "0" + dia;
        } else {

            this.dia = dia;
        }
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {

        int mes2;
        mes2 = Integer.parseInt(mes);

        if (mes2 <= 9) {

            mes = String.valueOf(mes2);
            this.mes = "0" + mes;
        } else {

            this.mes = mes;
        }

    }

    public String getHoraCustom() {
        return horaCustom;
    }

    public void setHoraCustom(String horaCustom) {

        int horaCustom2;
        horaCustom2 = Integer.parseInt(horaCustom);

        if (horaCustom2 <= 9) {

            horaCustom = String.valueOf(horaCustom2);
            this.horaCustom = "0" + horaCustom;
        } else {

            this.horaCustom = horaCustom;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioCache1;
    private javax.swing.JRadioButton jRadioCache2;
    private javax.swing.JRadioButton jRadioIcap;
    private javax.swing.JRadioButton jRadioOutroHorario;
    private javax.swing.JRadioButton jRadioP00;
    private javax.swing.JRadioButton jRadioP01;
    private javax.swing.JRadioButton jRadioP02;
    private javax.swing.JSpinner jSpinnerDia;
    private javax.swing.JSpinner jSpinnerMes;
    private javax.swing.JSpinner jSpinnerOutraHora;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables

}
