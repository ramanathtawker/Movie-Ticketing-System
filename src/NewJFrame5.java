import javax.swing.*;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame5.java
 *
 * Created on Sep 19, 2018, 3:43:43 PM
 */

/**
 *
 * @author Ramanatha Tawker
 */
public class NewJFrame5 extends javax.swing.JFrame {

    /** Creates new form NewJFrame5 */
    public String seatSelected="";
    public NewJFrame5() {
        initComponents();

       try{

           Class.forName("java.sql.DriverManager");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
                Statement st=con1.createStatement();
                ResultSet rs=st.executeQuery("SELECT *FROM CHENNAI WHERE MOVIENAME='MOVIENT1200'");
                while(rs.next())
                {
                 
                    if((Integer.parseInt(rs.getString("SEAT1")))==0){
                     jCheckBox1.setEnabled(false);
                 }
                 {
                 if((Integer.parseInt(rs.getString("SEAT2")))==0){
                     jCheckBox2.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT3")))==0){
                     jCheckBox3.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT4")))==0){
                     jCheckBox4.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT5")))==0){
                     jCheckBox5.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT6")))==0){
                     jCheckBox6.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT7")))==0){
                     jCheckBox7.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT8")))==0){
                     jCheckBox8.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT9")))==0){
                     jCheckBox9.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT10")))==0){
                     jCheckBox10.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT11")))==0){
                     jCheckBox11.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT12")))==0){
                     jCheckBox12.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT13")))==0){
                     jCheckBox13.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT14")))==0){
                     jCheckBox14.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT15")))==0){
                     jCheckBox15.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT16")))==0){
                     jCheckBox16.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT17")))==0){
                     jCheckBox17.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT18")))==0){
                     jCheckBox18.setEnabled(false);
                 }if((Integer.parseInt(rs.getString("SEAT19")))==0){
                     jCheckBox19.setEnabled(false);
                 }if((Integer.parseInt(rs.getString("SEAT20")))==0){
                     jCheckBox20.setEnabled(false);
                 }if((Integer.parseInt(rs.getString("SEAT21")))==0){
                     jCheckBox21.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT22")))==0){
                     jCheckBox22.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT23")))==0){
                     jCheckBox23.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT24")))==0){
                     jCheckBox24.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT25")))==0){
                     jCheckBox25.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT26")))==0){
                     jCheckBox26.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT27")))==0){
                     jCheckBox27.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT28")))==0){
                     jCheckBox28.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT29")))==0){
                     jCheckBox29.setEnabled(false);
                 }
                 if((Integer.parseInt(rs.getString("SEAT30")))==0){
                     jCheckBox30.setEnabled(false);
                 }
                 jLabel4.setText("Date:"+rs.getString("DATE"));



        }}}
       catch(Exception e)
       {
JOptionPane.showMessageDialog(null,e.getMessage());
       }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SCREEN     THIS     WAY");
        jLabel1.setToolTipText("");

        jCheckBox1.setText("A1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("A2");

        jCheckBox3.setText("A3");

        jCheckBox4.setText("A5");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("A6");

        jCheckBox6.setText("A4");

        jCheckBox7.setText("B1");

        jCheckBox8.setText("B2");

        jCheckBox9.setText("B3");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("B4");

        jCheckBox11.setText("B5");

        jCheckBox12.setText("B6");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        jLabel2.setText("NUMBER OF TICKETS");

        jCheckBox13.setText("C1");

        jCheckBox14.setText("C2");

        jCheckBox15.setText("C3");

        jCheckBox16.setText("C4");

        jCheckBox17.setText("C5");

        jCheckBox18.setText("C6");

        jCheckBox19.setText("D1");

        jCheckBox20.setText("D2");

        jCheckBox21.setText("D3");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setText("D4");

        jCheckBox23.setText("D5");

        jCheckBox24.setText("D6");

        jCheckBox25.setText("E1");

        jCheckBox26.setText("E2");

        jCheckBox27.setText("E3");

        jCheckBox28.setText("E4");

        jCheckBox29.setText("E5");
        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });

        jCheckBox30.setText("E6");

        jLabel3.setText("jLabel3");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jCheckBox1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jCheckBox8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jCheckBox2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBox11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox29)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox18)
                                            .addComponent(jCheckBox12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jCheckBox30)
                                                .addComponent(jCheckBox24))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox13)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox14)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox15)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox16)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox21)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox28, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCheckBox22, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addComponent(jButton2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox25)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox26)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox27)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(74, 74, 74)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox30)
                    .addComponent(jCheckBox28)
                    .addComponent(jCheckBox29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox29ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCheckBox29ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int a=0;
        if(jCheckBox1.isSelected())
       {
          a++;
       }
       if(jCheckBox2.isSelected())
       {
          a++;
       }
       if(jCheckBox3.isSelected())
       {
          a++;
       }
       if(jCheckBox4.isSelected())
       {
          a++;
       }
       if(jCheckBox5.isSelected())
       {
          a++;
       }
       if(jCheckBox6.isSelected())
       {
          a++;
       }
       if(jCheckBox7.isSelected())
       {
          a++;
       }if(jCheckBox8.isSelected())
       {
          a++;
       }if(jCheckBox9.isSelected())
       {
          a++;
       }if(jCheckBox10.isSelected())
       {
          a++;
       }if(jCheckBox11.isSelected())
       {
          a++;
       }if(jCheckBox12.isSelected())
       {
          a++;
       }if(jCheckBox13.isSelected())
       {
          a++;
       }if(jCheckBox14.isSelected())
       {
          a++;
       }if(jCheckBox15.isSelected())
       {
          a++;
       }if(jCheckBox16.isSelected())
       {
          a++;
       }if(jCheckBox17.isSelected())
       {
          a++;
       }if(jCheckBox18.isSelected())
       {
          a++;
       }if(jCheckBox19.isSelected())
       {
          a++;
       }if(jCheckBox20.isSelected())
       {
          a++;
       }if(jCheckBox21.isSelected())
       {
          a++;
       }if(jCheckBox22.isSelected())
       {
          a++;
       }
       if(jCheckBox23.isSelected())
       {
          a++;
       }
       if(jCheckBox24.isSelected())
       {
          a++;
       }
       if(jCheckBox25.isSelected())
       {
          a++;
       }
       if(jCheckBox26.isSelected())
       {
          a++;
       }
       if(jCheckBox27.isSelected())
       {
          a++;
       }
       if(jCheckBox28.isSelected())
       {
          a++;
       }
       if(jCheckBox29.isSelected())
       {
          a++;
       }if(jCheckBox30.isSelected())
       {
          a++;
       }

        if((jComboBox1.getSelectedIndex()+1)==a)
        {

            try{
               int response=JOptionPane.showConfirmDialog(null,"Want to Proceed? \n (Once Proceede PAYMENT HAS TO BE MADE");
               if(response==JOptionPane.YES_OPTION)
               {
                Class.forName("java.sql.DriverManager");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
                Statement st=con1.createStatement();
             String SQL="SELECT * FROM CHENNAI WHERE MOVIENAME='MOVIENT1200'";
                ResultSet rs=st.executeQuery(SQL);
                while(rs.next())
                {
            int a1=Integer.parseInt(rs.getString("SEAT1"));
            if(jCheckBox1.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT1=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"A1 ";

            }
            if(jCheckBox2.isSelected())
            {
                String SQL2="UPDATE  CHENNAI SET SEAT2=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL2);
                seatSelected=seatSelected+"A2 ";
            }
            if(jCheckBox3.isSelected())
            {
                String SQL3="UPDATE  CHENNAI SET SEAT3=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL3);
                seatSelected=seatSelected+"A3 ";
            }
            if(jCheckBox4.isSelected())
            {
                String SQL4="UPDATE  CHENNAI SET SEAT4=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL4);
                seatSelected=seatSelected+"A4 ";
            }
            if(jCheckBox5.isSelected())
            {
                String SQL5="UPDATE  CHENNAI SET SEAT5=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL5);
                seatSelected=seatSelected+"A5 ";
            }
            if(jCheckBox6.isSelected())
            {
                String SQL6="UPDATE  CHENNAI SET SEAT6=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL6);
                seatSelected=seatSelected+"A6 ";
            }
            if(jCheckBox7.isSelected())
            {
                String SQL7="UPDATE  CHENNAI SET SEAT7=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL7);
                seatSelected=seatSelected+"B1 ";
            }
            if(jCheckBox8.isSelected())
            {
                String SQL8="UPDATE  CHENNAI SET SEAT8=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL8);
                seatSelected=seatSelected+"B2 ";
            }
            if(jCheckBox9.isSelected())
            {
                String SQL9="UPDATE  CHENNAI SET SEAT9=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL9);
                seatSelected=seatSelected+"B3 ";
            }if(jCheckBox10.isSelected())
            {
                String SQL10="UPDATE  CHENNAI SET SEAT10=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL10);
                seatSelected=seatSelected+"B4 ";

            }if(jCheckBox11.isSelected())
            {
                String SQL11="UPDATE  CHENNAI SET SEAT11=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL11);
                seatSelected=seatSelected+"B5 ";
            }
            if(jCheckBox12.isSelected())
            {
                String SQL12="UPDATE  CHENNAI SET SEAT12=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL12);
                seatSelected=seatSelected+"B6 ";
            }
            if(jCheckBox13.isSelected())
            {
                String SQL13="UPDATE  CHENNAI SET SEAT13=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL13);
                seatSelected=seatSelected+"C1 ";
            }
            if(jCheckBox14.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT14=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"C2 ";
            }
            if(jCheckBox15.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT15=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"C3 ";
            }
            if(jCheckBox16.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT16=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"C4 ";
            }
            if(jCheckBox17.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT17=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"C5 ";
            }
            if(jCheckBox18.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT18=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"C6 ";
            }
            if(jCheckBox19.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT19=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"D1 ";
            }
            if(jCheckBox20.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT20=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"D2 ";
            }
            if(jCheckBox21.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT21=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"D3 ";
            }
            if(jCheckBox22.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT22=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"D4 ";
            }
            if(jCheckBox23.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT23=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"D5 ";

            }
            if(jCheckBox24.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT24=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"D6 ";
            }
            if(jCheckBox25.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT25=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"E1 ";
            }
            if(jCheckBox26.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT26=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"E2 ";
            }
            if(jCheckBox27.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT27=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"E3 ";
            }
            if(jCheckBox28.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT28=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"E4 ";
            }
          if(jCheckBox29.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT29=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"E5 ";
            }
            if(jCheckBox30.isSelected())
            {
                String SQL1="UPDATE  CHENNAI SET SEAT30=0 WHERE MOVIENAME='MOVIENT1200' ";
                st.executeUpdate(SQL1);
                seatSelected=seatSelected+"E6 ";
            }
            JOptionPane.showMessageDialog(null,"You have Selected:" +seatSelected);


           int price=a*203;
            NewJFrame8 n8 = new NewJFrame8();
           n8.jTextField3.setText(price+"");
             n8.setVisible(true);
            n8.jTextField2.setText(seatSelected);
            this.setVisible(false);
            n8.jTextField1.setText(jLabel3.getText());
            n8.jTextField4.setText(jLabel4.getText());
            }
            }if(response==JOptionPane.NO_OPTION){
                   new NewJFrame7().setVisible(true);
                   this.setVisible(false);}

            }
            catch (Exception e) {

            }
        }
 else
        {
           JOptionPane.showMessageDialog(null,"Select "+a+" in Total");
 }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new NewJFrame7().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
