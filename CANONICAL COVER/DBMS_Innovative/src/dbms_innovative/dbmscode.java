/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbms_innovative;
import java.util.Arrays;
/**
 *
 * @author ravip
 */
public class dbmscode extends javax.swing.JFrame {

    /**
     * Creates new form dbmscode
     */
    public dbmscode() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("enter the fd into array");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTER YOUR FD'S");

        jButton2.setText("calculate the fd");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("-->");

        jButton3.setText("exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("step 1");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setText("step 2");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel5.setText("step 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(258, 258, 258))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel3)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel4)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int i = 0;
int repeat = 0;
int a = 10;//size of left side fd
int b = 10;//size of right side of fd
int size;
char fdy[][] = new char[100][10];
char fdx[][] = new char[100][10];

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String x = jTextField1.getText();
        String y = jTextField2.getText();
        fdx[i] = x.toCharArray();
        fdy[i] = y.toCharArray();
        i++;
        jTextField1.setText("");
        jTextField2.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //step 1 for canonical cover
        int j=0;
        int sum=0;
        int sumy[] = new int[b];
        int sumx[] = new int[a];
        
        while(j<i){
            sumy[j] = fdy[j].length;
            sum = sum + sumy[j];
            j++;
        }
        j=0;
        while(j<i){
            sumx[j] = fdx[j].length;
            j++;
        }
        
        char s1x[][] = new char[sum][10];
        char s1y[] = new char[sum];
        
        j=0;
        int cnt=0;
        while(j<i){ 
            int k =0;
            while(k < sumy[j]){
                s1x[cnt] = fdx[j].clone();
                s1y[cnt] = fdy[j][k];
                k++;
                cnt++;
            }
            j++;  
        }
        
        
        
        j=0;
        
        while(j<sum){
                System.out.print(s1x[j]);
                System.out.print("->");
                System.out.print(s1y[j]);
                System.out.print("\n");
                String str = String.valueOf(s1x[j]);
                jTextArea1.append(str + "->" + s1y[j] +"\n");
                j++;
            }
        
        
        
        
        
        //step 1 complete
        
        //step 2 of canonical cover
        
        step2(s1x,s1y,sum);
        
        //step 2 complete
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(dbmscode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dbmscode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dbmscode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dbmscode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dbmscode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void step2(char s1x[][],char s1y[],int sum) {
        int j = 0;// will tell position of the selected closure on whom we perform operation
        char s2x[][] = new char[sum][100];
        char s2y[] = new char[sum];
        char closure[][] = new char[1000][1000];
        char closurew[][] = new char[1000][1000];
        int pos[] = new int[sum];
        int posw[] = new int[sum];
//        int chec;
//        int chec1;
//    System.out.println("closure of the fd's");
    int n=0;
    int ex=0;
    int executor[] = new int[20];
    Arrays.fill(executor, 9999);
//    Arrays.fill(s2x, '\u0000');
//    Arrays.fill(s2y, '\u0000');
    one:while(j<sum){
        
            int k = 0;//will give the position of last element in the array closure
            while( k < s1x[j].length){
            closure[j][k] = s1x[j][k];
            k++;
            }
            
//            chec = s1x[j].length;
            closure[j][k]=s1y[j];
            k++;
            int k1;//will tell the position of the s1y(the right side of fd) or s1x(left side of the fd) that is being checked and whether we have to input into closure or not
            
//            while(ex<2)
//            {
            k1=0;
            while(k1 < sum){
                
                if(k1==j){
                    k1++;
                }
                
                if(k1==sum){
                    break;
                }

                if(k1!=j){
                    int cnt = 0;//will check whether the s1x that is being checked has its prime attributes or not in the closure if not then we don't add.
                    int k2 = 0;//will be used to loop the closure to check whether there is an attribute equal to the one in the closure in the fd that we will be checking
                    if(k>=s1x[k1].length){
                        int k3 = 0;// to get out of the loop if the attributes are not matching
                        while(cnt<s1x[k1].length){
                            k2=0;
                            while(k2<k){
                                if(closure[j][k2]==s1x[k1][cnt]){
                                    cnt++;
                                }
                                k2++;
                                
                                if(cnt==s1x[k1].length){
                                    closure[j][k]=s1y[k1];
                                    k++;
                                }
                                
                                if(cnt==s1x[k1].length){
                                    break;
                                }
                                
                                }
                            
                            k3++;
                            if(k3==s1x[k1].length){
                                break;
                            } 
                        }
                        
                    }
                    k1++;
                }
            }
//            ex++;
//            }
                //finding all the positions of last element of all the closures in the closure array
                k = 0;
                pos[j]=0;
                while(closure[j][k]!='\u0000'){
                    k++;
                }
                pos[j]=k+1;
//                System.out.println(pos[j]);
                //removing the repeating elements in closures in the closure array
                k=0;
                while(k<pos[j]){
                    k1=0;
                    while(k1<pos[j]){
                        if(k==k1){
                            k1++;
                        }
                        
                        if(k1==pos[j]){
                            break;
                        }
                        
                        if(closure[j][k]==closure[j][k1]){
                            int k2=k1;
                            while(k2<pos[j]){
                                closure[j][k2]=closure[j][k2+1];
                                k2++;
                            }
                        }
                     k1++;   
                    }
                    k++;
                }
                
                k = 0;
                pos[j]=0;
                while(closure[j][k]!='\u0000'){
                    k++;
                }
                pos[j]=k+1;
//                System.out.println(pos[j]);

            k = 0;//will give the position of last element in the array closurew
            while(k < s1x[j].length){
            closurew[j][k] = s1x[j][k];
            k++;
            }
            
//            chec = s1x[j].length;
//            closure[j][k]=s1y[j];
//            k++;

            //this time we perform operations on the fd by assuming they don't exist
            ex=0;//just for executing the loop twice so that we can cover all closures in the closurew array this is not needed for the closure array
            while(ex<2){
            k1 =0;//will tell the position of the s1y(the right side of fd) or s1x(left side of the fd) that is being checked and whether we have to input into closurew or not
            while(k1 < sum){
                
                if(k1==j){
                    k1++;
                }
                
                if(k1==sum){
                    break;
                }

                if(k1!=j){
                    int cnt = 0;//will check whether the s1x that is being checked has its prime attributes or not in the closurew if not then we don't add.
                    int k2 = 0;//will be used to loop the closurew to check whether there is an attribute equal to the one in the closurew in the fd that we will be checking
                    if(k>=s1x[k1].length){
                        int k3 = 0;// to get out of the loop if the attributes are not matching
                        while(cnt<s1x[k1].length){
                            k2=0;
                            while(k2<k){
                                if(closurew[j][k2]==s1x[k1][cnt]){
                                    cnt++;
                                }
                                k2++;
                                
                                if(cnt==s1x[k1].length){
                                    closurew[j][k]=s1y[k1];
                                    k++;
                                }
                                
                                if(cnt==s1x[k1].length){
                                    break;
                                }
                                
                                }
                            
                            k3++;
                            if(k3==s1x[k1].length){
                                break;
                            } 
                        }
                        
                    }
                    k1++;
                }
            }
            ex++;
            }
            
            //finding all the positions of last element of all the closures in the closurew array
                k = 0;
                posw[j]=0;
                while(closurew[j][k]!='\u0000'){
                    k++;
                }
                posw[j]=k+1;
//                System.out.println(posw[j]);
                
                //removing the repeating elements in closures in the closurew array
                k=0;
                while(k<posw[j]){
                    k1=0;
                    while(k1<posw[j]){
                        if(k==k1){
                            k1++;
                        }
                        
                        if(k1==posw[j]){
                            break;
                        }
                        
                        if(closurew[j][k]==closurew[j][k1]){
                            int k2=k1;
                            while(k2<posw[j]){
                                closurew[j][k2]=closurew[j][k2+1];
                                k2++;
                            }
                        }
                     k1++;   
                    }
                    k++;
                }
//                System.out.println(closurew[j]);
                
                //finding all the positions of last element of all the closures in the closurew array
                k = 0;
                posw[j]=0;
                while(closurew[j][k]!='\u0000'){
                    k++;
                }
                posw[j]=k+1;
//                System.out.println(posw[j]);
                

                //repeated block
                ex=0;
                while(ex<2){
                k=0;
                while(k<pos[j]){
                    k1=0;
                    while(k1<pos[j]){
                        if(k==k1){
                            k1++;
                        }
                        
                        if(k1==pos[j]){
                            break;
                        }
                        
                        if(closure[j][k]==closure[j][k1]){
                            int k2=k1;
                            while(k2<pos[j]){
                                closure[j][k2]=closure[j][k2+1];
                                k2++;
                            }
                        }
                     k1++;   
                    }
                    k++;
                }
                
                k = 0;
                pos[j]=0;
                while(closure[j][k]!='\u0000'){
                    k++;
                }
                pos[j]=k+1;
                
                k=0;
                while(k<posw[j]){
                    k1=0;
                    while(k1<posw[j]){
                        if(k==k1){
                            k1++;
                        }
                        
                        if(k1==posw[j]){
                            break;
                        }
                        
                        if(closurew[j][k]==closurew[j][k1]){
                            int k2=k1;
                            while(k2<posw[j]){
                                closurew[j][k2]=closurew[j][k2+1];
                                k2++;
                            }
                        }
                     k1++;   
                    }
                    k++;
                }
                
                k = 0;
                posw[j]=0;
                while(closurew[j][k]!='\u0000'){
                    k++;
                }
                posw[j]=k+1;
                
                ex++;
            }
                //repeated block end
                
                
                if(pos[j]==posw[j]){
                    k=0;
                   
                    int cnt=0;
                    while(k<pos[j]){
                        k1=0;
                        while(k1<pos[j]){
                            if(closure[j][k]==closurew[j][k1]){
                            cnt++;
                        }
                        k1++;
                        }
                        k++;
                    }
                    System.out.print("count : ");
                    System.out.print(cnt);
                   
                    k=0;
//                    
                    if(cnt==pos[j]){
                        while(k<s1x[j].length){
                        s1x[j][k]='*';
                        k++;
                        }
                    }
                    
                     if(cnt!=pos[j] && pos[j]==posw[j]){
                    s2x[n]=s1x[j].clone();
                    s2y[n]=s1y[j];
                    if(s2x[n].length>=2){
                    executor[n]=j;
                    }
                    n++;
                    
                }
                    
                }
               
               
                
               
                if(j==sum){
                    break;
                }
                
            j++;
            }
    
    
    
        j=0;
        while(j<sum){
            if(pos[j]!=posw[j] && s1x[j][0]!='*'){
                s2x[n]=s1x[j];
                s2y[n]=s1y[j];
                if(s2x[n].length>=2){
                executor[n]=j;
                }
                n++;
            }
            System.out.println("\n");
            System.out.print(s1x[j]);
            System.out.print("->");
            System.out.print(s1y[j]);
            System.out.println();
            System.out.println(closure[j]);
            System.out.println(closurew[j]);
            System.out.println(pos[j]);
            System.out.println(posw[j]);
            j++;
        }
        System.out.print("\n");
        
        j=0;
        while(j<n){
                System.out.println(executor[j]);
                System.out.print(s2x[j]);
                System.out.print("->");
                System.out.print(s2y[j]);
                System.out.print("\n");
                String str = String.valueOf(s2x[j]);
                jTextArea2.append(str + "->" + s2y[j] +"\n");
                j++;
            }
//        
//important function end
//            
        

        step3(s2x,s2y,closure,n,executor,pos);
        
        }

    private void step3(char s2x[][] , char s2y[] , char closure[][] , int n , int executor[] , int pos[]) {
//        System.out.print(s2x.length);
//        System.out.print(s2x[0].length);
          int n1=0;
          char s3x[][] = new char[s2x.length][10];
          char s3y[] = new char[s2y.length];
          char clo3[][][] = new char[s2x.length][1000][1000];
          int pos3[][] = new int[s2x.length][1000];
          int j=0;
//          Arrays.fill(s3x, '\u0000');    
//          Arrays.fill(s3y, '\u0000');
//

          while(j<n){
              int k =0;
              if(s2x[j].length>1){
                  
              while(k<s2x[j].length){
                  int a=0;
                  clo3[j][k][a]=s2x[j][k];
                  a++;//give last position of the array clo3
                  //imp part
                  
                  int k1=0;//will select the fd that will be checked from s2x
                  while(k1<n){
                      if(k1==n){
                          break;
                      }
                      int cnt=0;//will check whether the s2x that is being checked has its prime attributes in the closure of clo3 or not if not then we don't add
                      int k2=0;//will be used to loop the closure of clo3 to check whether there is attribute equal to closure in the fd or not
                      int k3=0;//to get out of the loops if the attributes are not matching
                      while(cnt<s2x[k1].length){
                          k2=0;
                          while(k2<a){
                              if(clo3[j][k][k2]==s2x[k1][cnt]){
                                    cnt++;
                                }
                              k2++;
                              
                              if(cnt==s2x[k1].length){
                                  clo3[j][k][a]=s2y[k1];
                                  a++;
                              }
                              
                              if(cnt==s2x[k1].length){
                                  break;
                              }
                          }
                          k3++;
                            if(k3==s2x[k1].length){
                                break;
                            }
                      }
                      k1++;
                  }
                  //imp part end
                  k++;
              }
              
              }
              else if(executor[j]==9999){
                  s3x[n1][0]=s2x[j][0];
                  s3y[n1]=s2y[j];
                  n1++;
              }
              k=0;
              
              
//              System.out.println(clo3[j][0]);
//              System.out.println(clo3[j][1]);
//              System.out.println(pos[executor[j]]);
              j++;
              
          }
          
          j=0;
          while(j<n){
              int k=0;
              while(k<s2x[j].length){
                  pos3[j][k]=0;
                  int k1=0;
                  while(clo3[j][k][k1]!='\u0000'){
                      k1++;
                  }
                  pos3[j][k]=k1+1;
                  k++;
              }
              
              k=0;
              while(k<s2x[j].length){
                  int k1=0;
                  while(k1<pos3[j][k]){
                      int k2=0;
                      while(k2<pos3[j][k]){
                          if(k2==k1){
                              k2++;
                          }
                          if(k2==pos3[j][k]){
                              break;
                          }
                          
                          if(clo3[j][k][k1]==clo3[j][k][k2]){
                              int k3=k1;
                              while(k3<pos3[j][k]){
                                  clo3[j][k][k3]=clo3[j][k][k3+1];
                                  k3++;
                              }
                          }
                      
                      k2++;
                      }
                      k1++;
                  }
                  k++;
              }
              
              k=0;
              while(k<s2x[j].length){
                  pos3[j][k]=0;
                  int k1=0;
                  while(clo3[j][k][k1]!='\u0000'){
                      k1++;
                  }
                  pos3[j][k]=k1+1;
                  k++;
              }
              
              j++;
          }
          
          j=0;
          while(j<n){
              if(executor[j]!=9999){
                  int k=0;
                  int cnt[] = new int[s2x[j].length];
                  Arrays.fill(cnt, 0);
                  while(k<s2x[j].length){
//                      if(pos3[j][k]!=pos[executor[j]]){
//                          s3x[n1]=s2x[j].clone();
//                          s3y[n1]=s2y[j];
//                          n1++;
//                          break;
//                      }
                      
                      
                      System.out.println(pos3[j][k]);
                      System.out.println(pos[executor[j]]);
                      if(pos3[j][k]==pos[executor[j]]){
                          int po=0;
                          
                          while(po<pos[executor[j]]){
                              int po1=0;
                              while(po1<pos[executor[j]]){
                                    if(clo3[j][k][po]==closure[executor[j]][po1]){
                                        cnt[k]++;
                                    }
                                    po1++;
                              }
                              po++;
                          }
                      }
                      System.out.println(cnt[k]);
                      if(cnt[k]==pos[executor[j]]){
                         s3x[n1][0]=s2x[j][k];
                         s3y[n1]=s2y[j];
                         n1++;
                         break;
                      }
                      
                      k++;
                      
//                      if(cnt!=pos[executor[j]] && k==s2x[j].length){
//                          s3x[n1]=s2x[j].clone();
//                          s3y[n1]=s2y[j];
//                          n1++;
//                      }
                  }
                  
                  int count=0;
                  k=0;
                  while(k<s2x[j].length){
                      if(cnt[k]!=pos[executor[j]]){
                          count++;
                      }
                      k++;
                  }
                  
                  if(count==s2x[j].length){
                      s3x[n1]=s2x[j].clone();
                      s3y[n1]=s2y[j];
                      n1++;
                  }
                  
              }
              j++;
          }
          
          System.out.println("final answer");
          j=0;
        while(j<n1){
//                System.out.println("final answer");
                System.out.print(s3x[j]);
                System.out.print("->");
                System.out.print(s3y[j]);
                System.out.print("\n");
                String str = String.valueOf(s3x[j]);
                jTextArea3.append(str + "->" + s3y[j] +"\n");
                j++;
            }
        
        
          
    }


    }




