
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Jonathan Vasallo
 */
public class CasinoHome extends javax.swing.JFrame {
 private ArrayList<String> nameTransfer = new ArrayList();
    /**
     * Creates new form NewJFrame
     */
    public CasinoHome() {
        initComponents();
    }

    public String getjTextField1() {
     String getName = nameTransfer.get(0);
        return getName;
    }
    public void removeLogout(){
    nameTransfer.remove(0);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 429));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField1.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 102)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(330, 153, 160, 30);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 240, 160, 30);

        jTextField2.setBackground(new java.awt.Color(0, 0, 51));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 102)));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(330, 193, 160, 30);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Username:");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 102)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 153, 140, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Password:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 102)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 193, 140, 30);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 240, 140, 30);

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Quit");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 360, 60, 23);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 60, 310, 70);

        jLabel4.setFont(new java.awt.Font("Blackout", 0, 18)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-430, -80, 1110, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Login Button 
        String username = jTextField1.getText();
        String password = jTextField2.getText();
        boolean found = false;
        try{
            System.out.println("Trying to do the try statement ");
        String host = "jdbc:derby://localhost:1527/Accounts";
        String uName = "Allaccounts";
        String uPass = "accounts";
        Connection con = DriverManager.getConnection(host,uName,uPass);
        Statement stmt = con.createStatement();
        String SQL = "SELECT * FROM Allaccounts";
        ResultSet rs = stmt.executeQuery(SQL);
        
        while (rs.next()){
         String userN = rs.getString("Username");
         String userP = rs.getString("Password");
        
         System.out.println(userN +" " +userP );
         
         if(userN.equals(username) && userP.equals(password)){
             
         PlayingArea play = new PlayingArea(username);
         play.setVisible(true);
         this.setVisible(false);    
         found=true;
         
         break;
         }  
         
        } // end while 
        if(found == false){
        JOptionPane.showMessageDialog(null, "Your Password is Incorrect try again (CAPS SENSISTIVE)");
        }
        
        }catch(SQLException ex){
        System.out.println("error");    
        }
        
        // if true switch to other screen 
        
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Quit Button 
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Create Account Button
        
        String user = JOptionPane.showInputDialog("Enter A Username");
        if(user.length()>14 || user.length()==0){
        JOptionPane.showMessageDialog(null, "Please Use Less Than 15 Characters For the Username");
        }
        else{
        String Pass = JOptionPane.showInputDialog("Enter A Password");
            if(Pass.length()==0){
            JOptionPane.showMessageDialog(null, "Please Type a Valid Password");
            }else{
                try{
              // somehow incorperate the database info here Username + Pass
              String host = "jdbc:derby://localhost:1527/Accounts";
              String uName = "Allaccounts";
              String uPass = "accounts";
              
              Connection con = DriverManager.getConnection(host,uName,uPass);
              double numBal = 0;
              Statement stmt = con.createStatement();
              String SQL = "SELECT * FROM Allaccounts";
              String Insert = "INSERT INTO USERINFO (Username,Password,Balance)"
                      + " VALUES ('"+user+"','"+Pass+"',"+numBal+")";
              stmt.executeUpdate(Insert);
              JOptionPane.showMessageDialog(null, "Account Created.");
              
            } catch (SQLException ex) {
                //Logger.getLogger(CasinoHome.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "That Username has already been selected, choose another one");
            }
              
            }
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CasinoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasinoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasinoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasinoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasinoHome().setVisible(true);
                new CasinoHome().setSize(644,362);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}