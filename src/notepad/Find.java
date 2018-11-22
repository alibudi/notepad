/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notepad;
import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import javafx.scene.input.KeyCode;

/**
 *
 * @author putri
 */
public class Find extends javax.swing.JDialog {
menu parent;
JTextArea jta;
String Orientation;
String data,fin;
int start=0; 

int checkcase;
    
    public Find(menu parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent=parent;
        jta=parent.txt_area;
        buttonGroup1.add(upradio);
        buttonGroup1.add(downradio);
        start=jta.getCaretPosition();
        this.setLocationRelativeTo(this);
     }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cbMatchcase = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        upradio = new javax.swing.JRadioButton();
        downradio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbMatchcase.setText("Match Case");
        cbMatchcase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMatchcaseItemStateChanged(evt);
            }
        });

        jLabel1.setText("Find What");

        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FindKeyPressed(evt);
            }
        });

        btnFind.setText("Find Next");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Direction"));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        upradio.setText("Up");
        upradio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                upradioItemStateChanged(evt);
            }
        });

        downradio.setSelected(true);
        downradio.setText("Down");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upradio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(downradio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(upradio)
                .addComponent(downradio))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbMatchcase)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncancel)
                        .addComponent(cbMatchcase))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
OrientationModule();
    }//GEN-LAST:event_btnFindActionPerformed

    void OrientationModule(){
    
    if(upradio.isSelected()){ 
        Orientation=upradio.getText();}
else{
    Orientation=downradio.getText();}



   Find(Orientation,checkcase);
    }
    
    void Find(String Or, int checkcase){
    
    try{
           data=jta.getText().trim();
            if(checkcase==1)  {
                            data=jta.getText().trim();
                           fin=txtFind.getText().trim();
                           }/// checking the case sensivity
                                                
                         else{
                         data=jta.getText().trim().toLowerCase();
                         fin=txtFind.getText().trim().toLowerCase();
                         
                         }// if no case sensitivity is  done
           
                                    
  if(Or.equals("Down")){
                        
                            System.out.println(data); 
                            if(data.contains(fin)){
                             start=data.indexOf(fin,start);
                              System.out.println(fin+start); 
                             if(start==-1){
                            //JOptionPane.showMessageDialog(null, start);//" nothing is find");
                             start=0;
                             start=data.indexOf(fin,start);
                             }
                             if(start!=0){
                            //JOptionPane.showMessageDialog(null, "Match Found at "+start);
                           jta.select(start,start+fin.length());} 

                           start+=fin.length()+1;  
                            }
                            
                       
                    }
  else if(Or.equals("Up")){
                          if(start!=0){start-=fin.length()+1;}
                          
                            System.out.println(data); 
                            if(data.contains(fin)){
                             start=data.lastIndexOf(fin,start);
                              System.out.println(fin+start); 
                             if(start==-1){
                          //  JOptionPane.showMessageDialog(null, start);//" nothing is find");
                             start=data.length()-1;
                             start=data.lastIndexOf(fin,start);
                             }
                           // JOptionPane.showMessageDialog(null, "Match Found at "+start);



                           jta.select(start,start+fin.length());  

                        start-=fin.length()-1; 
                           
                            }
                    }
 
    }catch(Exception e){}
    
    
    
    }
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void upradioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_upradioItemStateChanged
     start-=(fin.length()+1);
     txtFind.requestFocus();
    }//GEN-LAST:event_upradioItemStateChanged

    private void cbMatchcaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMatchcaseItemStateChanged
        // TODO add your handling code here:
        
        if(cbMatchcase.isSelected()){
    checkcase=1;
        }
        else checkcase=0;
       txtFind.requestFocus();
    }//GEN-LAST:event_cbMatchcaseItemStateChanged

    private void FindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        OrientationModule();
        }
    }//GEN-LAST:event_FindKeyPressed

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
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Find dialog = new Find(new menu(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btncancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbMatchcase;
    private javax.swing.JRadioButton downradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtFind;
    private javax.swing.JRadioButton upradio;
    // End of variables declaration//GEN-END:variables
}
