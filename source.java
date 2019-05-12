/*
Dan Pengra
Daktronics IT-
IT Auction Auto-Submitter
Version 0.9

Purpose: 
This application uses Java forms to quickly and efficiently 
compile sales and auction data, for both upload to the 
FlexNet database and to create PDF printouts to allow
quick purchasing of old IT assets.
 *
 */
package newpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
/**
 *
 * @author dpengra
 */
public class Interface extends javax.swing.JFrame {
    public static List<String> opt = new ArrayList<>();
    public static List<Double> opt2 = new ArrayList<>();
    public static int groupIterator = 0;
    public static double totalCost = 0.0;
    public static double[] prices= new double[8];
    public static int found = 0;
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField5 = new javax.swing.JTextField();

        jDialog1.setTitle("Advanced");
        jDialog1.setMinimumSize(new java.awt.Dimension(265, 295));

        jLabel11.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel11.setText("Advanced Input");

        jLabel14.setText("Physical Date");

        jLabel15.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMinimumSize(new java.awt.Dimension(239, 94));
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Nov", "Dec" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1))
                    .addComponent(jButton3))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jDialog2.setMinimumSize(new java.awt.Dimension(206, 151));

        jLabel17.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel17.setText("ERROR");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("jLabel18");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("jLabel19");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(62, 62, 62))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IT Auction AutoSubmitter");
        setMinimumSize(new java.awt.Dimension(332, 373));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Buyer Name");

        jComboBox1.setModel(new DefaultComboBoxModel(opt.toArray()));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Model");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Serial Number");

        jLabel4.setText("Price");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Advanced...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel6.setText("Auction Asset Modifier");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Last Order");

        jLabel7.setText("Name");

        jLabel8.setText("Serial Number");

        jLabel9.setText("Model");

        jLabel10.setText("Price");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton1.setText("Create PDF Form");

        jRadioButton2.setText("Group items");

        jLabel13.setText("0 in cart");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pay Periods", "1", "2", "3", "4" }));

        jButton4.setText("CLR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel16.setText("ID");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Auction");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Sold");

        jToggleButton1.setText("-$10");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField5.setText("Seller Name Here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField6)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton1))
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jRadioButton3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jToggleButton1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    Function: jButton1ActionPerformed
    Purpose: This is a decision tree for the Submit button.
    It will submit error messages, import into the output file, 
    and/or produce new PDF files when the standard Submit button is pressed.
    
    PDF output is done using the Apache PDFBox.
    
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jToggleButton1.setSelected(false);
        String name, sn, price, state;
        int selection=0;
        if(groupIterator<8){
        name = jTextField1.getText();
        sn = jTextField2.getText();
        price = jTextField3.getText();
        if(jRadioButton3.isSelected()){
            state="Auction";
        }
        else{
            state="Sold";
        }
        if(jTextField6.getText().contains(",") || name.contains(",") || sn.contains(",") || price.contains(",")|| jTextField5.getText().contains(",")){
            dialogShow("Invalid syntax. No commas.", "", "");
            jLabel7.setText("Invalid syntax. No commas.");
            jLabel8.setText("");
            jLabel9.setText("");
            jLabel10.setText("");
        }
        else if(jTextField6.getText().equals("") || name.equals("") || sn.equals("") || price.equals("")|| jTextField5.getText().equals("") || jComboBox1.getSelectedIndex()==0 || "Seller Name Here".equals(jTextField5.getText())){
            dialogShow("Invalid syntax. No empty fields.", "Don't forget to specify a model.", "");}
        else if(jRadioButton1.isSelected() && 0==jComboBox5.getSelectedIndex() ){
            dialogShow("Invalid syntax. No empty fields.", "Don't forget to specify a model.", "");}
        else{
            if(!(jLabel7.getText().equals(jTextField1.getText()))){
                    groupIterator=0;
                    }
            jLabel7.setText(name);
            jLabel8.setText(sn);
            jLabel9.setText(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
            jLabel10.setText(price);
        try {
            if(jRadioButton1.isSelected()){
                if(!jRadioButton2.isSelected()){
                    PDDocument pdfDoc = PDDocument.load(new File("sourcefile.pdf"));
                    PDAcroForm acroForm = pdfDoc.getDocumentCatalog().getAcroForm();
                    PDField field = acroForm.getField("Purchaser name");
                    field.setValue(name);
                    field = acroForm.getField("IT Employee Printed Name");
                    field.setValue(jTextField5.getText());
                    field = acroForm.getField("Purchaser Printed Name");
                    field.setValue(name);
                    field = acroForm.getField("Purchaser Employee Number");
                    field.setValue(jTextField6.getText());
                    field = acroForm.getField("IT Device");
                    field.setValue(sn);
                    field = acroForm.getField("Purchase Amount");
                    field.setValue(price);
                    field = acroForm.getField("I agree to a payroll deduction total of");
                    field.setValue(price);
                    field = acroForm.getField("to be processed over");
                        field.setValue(Integer.toString(jComboBox5.getSelectedIndex()));
                        field = acroForm.getField("Date");
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
                        LocalDateTime now = LocalDateTime.now();  
                        field.setValue(dtf.format(now));
                        field = acroForm.getField("Date_2");
                        field.setValue(dtf.format(now));
                    groupIterator=0;
                    jLabel13.setText(Integer.toString(groupIterator)+" in cart");
                    pdfDoc.save(name+".pdf");
                    pdfDoc.close();
                }
                else{
                    prices[groupIterator]=Double.parseDouble(price);
                    groupIterator++;    
                            jLabel13.setText(Integer.toString(groupIterator)+" in cart");
                            PDDocument pdfDoc;
                            if (groupIterator==1){pdfDoc = PDDocument.load(new File("sourcefile.pdf"));}
                            else{
                            pdfDoc = PDDocument.load(new File(name+".pdf"));
                            }
                            PDAcroForm acroForm = pdfDoc.getDocumentCatalog().getAcroForm();
                            PDField field1, field2;
                            field1 = acroForm.getField("Purchaser name");
                            field1.setValue(name);
                            field2 = acroForm.getField("Purchase Amount");
                           if(groupIterator%4==1){
                           field1 = acroForm.getField("IT Device");
                           field2 = acroForm.getField("Purchase Amount");}
                           else if(groupIterator%4==2){
                           field1 = acroForm.getField("Text1");
                           field2 = acroForm.getField("Text5");}
                           else if(groupIterator%4==3){
                           field1 = acroForm.getField("Text4");
                           field2 = acroForm.getField("Text6");}
                           else if(groupIterator%4==0){
                           field1 = acroForm.getField("Text3");
                           field2 = acroForm.getField("Text7");}
                           if(groupIterator>4){
                               String tutFargas = field1.getValueAsString();
                               field1.setValue(tutFargas+"+"+sn);
                               field2.setValue(Double.toString(Double.parseDouble(price)+prices[groupIterator-5]));
                           }
                           else{
                               field1.setValue(sn);
                               field2.setValue(price);
                           }
                           field2 = acroForm.getField("I agree to a payroll deduction total of");
                           if(groupIterator>1){
                           field2.setValue(Double.toString(prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6]+prices[7]));
                           }
                           else{
                            field2.setValue(price);
                           }
                            field1 = acroForm.getField("Purchaser Printed Name");
                            field1.setValue(name);
                            field1 = acroForm.getField("Purchaser Employee Number");
                            field1.setValue(jTextField6.getText());
                            field1 = acroForm.getField("IT Employee Printed Name");
                            field1.setValue(jTextField5.getText());
                            field1 = acroForm.getField("to be processed over");
                            field1.setValue(Integer.toString(jComboBox5.getSelectedIndex()));
                            field1 = acroForm.getField("Date");
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
                            LocalDateTime now = LocalDateTime.now();  
                            field1.setValue(dtf.format(now));
                            field1 = acroForm.getField("Date_2");
                            field1.setValue(dtf.format(now));
                           pdfDoc.save(name+".pdf");
                           pdfDoc.close();
                }}
            FileWriter fw = new FileWriter("output.csv", true);
            BufferedWriter nunkyFuts = new BufferedWriter(fw);
            PrintWriter outLine = new PrintWriter(nunkyFuts);
            //outLine.println("OO");
            LocalDateTime now = LocalDateTime.now();  
            int day = now.getDayOfMonth();
            int month = now.getMonthValue();
            int year = now.getYear();
            
            
            if(jComboBox1.getSelectedIndex()!=1){
            //outLine.println(name+ ","+ sn+ ","+ jComboBox1.getItemAt(jComboBox1.getSelectedIndex())+ ","+ price+",,,,"+state+","+"Retired");
            outLine.println(sn+","+jComboBox1.getItemAt(jComboBox1.getSelectedIndex())+","+"Retired"+","+name+","+price+","+month+"/"+day+"/"+year+","+state+",,"+month+"/"+day+"/"+year+","+jTextField5.getText());
            }
            outLine.close(); 
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            dialogShow("One or more source files missing/used.","Does the folder contain:","sourcefile.pdf output.csv");
        }}}
        else{
        jLabel13.setText("Failed. PDF is full.");}
    }//GEN-LAST:event_jButton1ActionPerformed
/*
    Function: jComboBox1ActionPerformed
    Purpose: This function runs when the model select combo box
    is changed. It resets the Price field to the price of the new item,
    and deselects the "-$10" toggle button.
    
    */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jToggleButton1.setSelected(false);
        Double [] arr2 = new Double[opt2.size()];
        arr2 = opt2.toArray(arr2);
        //jLabel5.setText(Double.toString(jComboBox1.getSelectedIndex()));
        jTextField3.setText(Double.toString(arr2[jComboBox1.getSelectedIndex()]));
        if(jComboBox1.getSelectedIndex()==1){
        jLabel3.setText("       Item Name");}
        else{
        jLabel3.setText("Serial Number");}
    }//GEN-LAST:event_jComboBox1ActionPerformed
/*
    Function: jButton2ActionPerformed
    Purpose: This function runs when the "Advanced" button is 
    pressed. It pulls up the advanced options window.
    
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
/*
    Function: dialogShow
    Passed In: String one, two, three
    Purpose: This function displays notifications and error messages.
    Each string is written on a different line.
    
    */
    private void dialogShow(String one, String two, String three){
        jDialog2.setVisible(true);
        jDialog2.setLocationRelativeTo(jTextField2);
        jLabel18.setText(one);
        jLabel19.setText(two);
        jLabel20.setText(three);
    }
    /*
    Function: jButton3ActionPerformed
    Purpose: This is a decision tree for the advanced Submit button.
    It will submit error messages, import into the output file, 
    and/or produce new PDF files when the advanced Submit button
    in the second window is pressed.
    
    PDF output is done using the Apache PDFBox.
    
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        jToggleButton1.setSelected(false);                                        
        String name, sn, price, desc, state;
        int selection=0;
        int month, day, year;
        if(groupIterator<8){
        name = jTextField1.getText();
        sn = jTextField2.getText();
        price = jTextField3.getText();
        desc= jTextArea1.getText();
        month = jComboBox2.getSelectedIndex();
        day = jComboBox3.getSelectedIndex();
        year = jComboBox4.getSelectedIndex();
        if(day==0 || month==0 || year==0){
            LocalDateTime now = LocalDateTime.now();  
            day = now.getDayOfMonth();
            month = now.getMonthValue();
            year = now.getYear()-17;
        }
        if(jRadioButton3.isSelected()){
            state="Auction";
        }
        else{
            state="Sold";
        }
        if(jTextField6.getText().contains(",") || name.contains(",") || sn.contains(",") || price.contains(",") || desc.contains(",") || jTextField5.getText().contains(",")){
            dialogShow("Invalid syntax. No commas.", "", "");
            jLabel7.setText("Invalid syntax. No commas.");
            jLabel8.setText("");
            jLabel9.setText("");
            jLabel10.setText("");
        }
        else if(jTextField6.getText().equals("") || name.equals("") || sn.equals("") || price.equals("")|| jTextField5.getText().equals("") || jComboBox1.getSelectedIndex()==0 || "Seller Name Here".equals(jTextField5.getText())){
            dialogShow("Invalid syntax. No empty fields.", "Don't forget to specify a model.", "");}
        else if(jRadioButton1.isSelected() && 0==jComboBox5.getSelectedIndex() ){
            dialogShow("Invalid syntax. No empty fields.", "Don't forget to specify a model.", "");}
        else{
            if(!(jLabel7.getText().equals(jTextField1.getText()))){
                    groupIterator=0;
                    }  
            jLabel7.setText(name);
            jLabel8.setText(sn);
            jLabel9.setText(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
            jLabel10.setText(price);
        try {
            if(jRadioButton1.isSelected()){
                if(!jRadioButton2.isSelected()){
                    PDDocument pdfDoc = PDDocument.load(new File("sourcefile.pdf"));
                    PDAcroForm acroForm = pdfDoc.getDocumentCatalog().getAcroForm();
                    PDField field = acroForm.getField("Purchaser name");
                    field.setValue(name);
                    field = acroForm.getField("IT Employee Printed Name");
                    field.setValue(jTextField5.getText());
                    field = acroForm.getField("Purchaser Employee Number");
                    field.setValue(jTextField6.getText());
                    field = acroForm.getField("Purchaser Printed Name");
                    field.setValue(name);
                    field = acroForm.getField("IT Device");
                    field.setValue(sn);
                    field = acroForm.getField("Purchase Amount");
                    field.setValue(price);
                    field = acroForm.getField("I agree to a payroll deduction total of");
                    field.setValue(price);
                    field = acroForm.getField("to be processed over");
                        field.setValue(Integer.toString(jComboBox5.getSelectedIndex()));
                        field = acroForm.getField("Date");
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
                        LocalDateTime now = LocalDateTime.now();  
                        field.setValue(dtf.format(now));
                        field = acroForm.getField("Date_2");
                        field.setValue(dtf.format(now));
                    groupIterator=0;
                    jLabel13.setText(Integer.toString(groupIterator)+" in cart");
                    pdfDoc.save(name+".pdf");
                    pdfDoc.close();
                }
                else{
                    prices[groupIterator]=Double.parseDouble(price);
                    
                    groupIterator++;

                            jLabel13.setText(Integer.toString(groupIterator)+" in cart");
                            PDDocument pdfDoc;
                            if (groupIterator==1){pdfDoc = PDDocument.load(new File("sourcefile.pdf"));}
                            else{
                            pdfDoc = PDDocument.load(new File(name+".pdf"));
                            }
                            PDAcroForm acroForm = pdfDoc.getDocumentCatalog().getAcroForm();
                            PDField field1, field2;
                            field1 = acroForm.getField("Purchaser name");
                            field1.setValue(name);
                            field2 = acroForm.getField("Purchase Amount");
                           if(groupIterator%4==1){
                           field1 = acroForm.getField("IT Device");
                           field2 = acroForm.getField("Purchase Amount");}
                           else if(groupIterator%4==2){
                           field1 = acroForm.getField("Text1");
                           field2 = acroForm.getField("Text5");}
                           else if(groupIterator%4==3){
                           field1 = acroForm.getField("Text4");
                           field2 = acroForm.getField("Text6");}
                           else if(groupIterator%4==0){
                           field1 = acroForm.getField("Text3");
                           field2 = acroForm.getField("Text7");}
                           
                           if(groupIterator>4){
                               String tutFargas = field1.getValueAsString();
                               field1.setValue(tutFargas+"+"+sn);
                               field2.setValue(Double.toString(Double.parseDouble(price)+prices[groupIterator-5]));
                           }
                           else{
                               field1.setValue(sn);
                               field2.setValue(price);
                           }
                           field2 = acroForm.getField("I agree to a payroll deduction total of");
                           if(groupIterator>1){
                           field2.setValue(Double.toString(prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5]+prices[6]+prices[7]));
                           }
                           else{
                            field2.setValue(price);
                           }
                            field1 = acroForm.getField("Purchaser Printed Name");
                            field1.setValue(name);
                            field1 = acroForm.getField("IT Employee Printed Name");
                            field1.setValue(jTextField5.getText());
                            field1 = acroForm.getField("Purchaser Employee Number");
                            field1.setValue(jTextField6.getText());
                            //field1 = acroForm.getField("IT Device");
                            //field1.setValue(sn);
                            field1 = acroForm.getField("to be processed over");
                            field1.setValue(Integer.toString(jComboBox5.getSelectedIndex()));
                            field1 = acroForm.getField("Date");
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
                            LocalDateTime now = LocalDateTime.now();  
                            field1.setValue(dtf.format(now));
                            field1 = acroForm.getField("Date_2");
                            field1.setValue(dtf.format(now));
                           pdfDoc.save(name+".pdf");
                           pdfDoc.close();
                }}
            FileWriter fw = new FileWriter("output.csv", true);
            BufferedWriter nunkyFuts = new BufferedWriter(fw);
            PrintWriter outLine = new PrintWriter(nunkyFuts);
            //outLine.println("OO");
            
            if(jComboBox1.getSelectedIndex()!=1){
            outLine.println(sn+","+jComboBox1.getItemAt(jComboBox1.getSelectedIndex())+","+"Retired"+","+name+","+price+","+month+"/"+day+"/"+(year+2017) +","+state+","+desc+","+month+"/"+day+"/"+(year+2017) +","+jTextField5.getText());
            }
            outLine.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            dialogShow("One or more source files missing/used.","Does the folder contain:","sourcefile.pdf");
        }
                }
        }
        else{
        jLabel13.setText("Failed. PDF is full.");}
    }//GEN-LAST:event_jButton3ActionPerformed
/*
    Function: jTextField6KeyReleased
    Purpose: This function runs each time a key is released when typing into the ID field. However,
    it only activates when the field is exactly 5 characters. The program then looks for a shared file
    containing a the list of all Daktronics employees. It will then match the typed in ID with its associated name.
    
    */
    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        if(jTextField6.getText().length()==5){
        FileReader fr;
        File ned = new File("/r:/Software/IT Auction Auto Submitter/Copy of Employee List All.csv");
        if (ned.exists()){
            try {
                    fr = new FileReader("/r:/Software/IT Auction Auto Submitter/Copy of Employee List All.csv");
                    BufferedReader nunkyFuts = new BufferedReader(fr);

                    search(nunkyFuts, fr, jTextField6.getText());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        else{
            ned = new File("Copy of Employee List All.csv");
            if(ned.exists()){
                try {
                    fr = new FileReader("Copy of Employee List All.csv");
                    BufferedReader nunkyFuts = new BufferedReader(fr);

                    search(nunkyFuts, fr, jTextField6.getText());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }

        }}}
    }//GEN-LAST:event_jTextField6KeyReleased
/*
    Function: jButton4ActionPerformed
    Purpose: This function clears the current group order
    and starts over with 0 purchases on the order.
    
    */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    groupIterator=0;
    jLabel13.setText(Integer.toString(groupIterator)+" in cart");
    for(int e=0; e<8; e=e+1){
    prices[e]=0;
    }
    
    }//GEN-LAST:event_jButton4ActionPerformed
/*
    Function: formWindowOpened
    Purpose: This function displays errors if a file is missing from the program folder.
    
    */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         if(found==2){
            dialogShow("No presets.", "Make sure presets.txt","is in the program's file."); 
        }
        else if(found==1){
            dialogShow("No presets.", "Online presets will be used.","");
        }
    }//GEN-LAST:event_formWindowOpened
/*
    Function: jToggleButton1ActionPerformed
    Purpose: This function runs each time the "-$10" toggle
    button is pressed. Depending on the button's current state, it will add or subtract $10
    from the currently held price.
    
    */
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String collect = jTextField3.getText();
        double mark = Double.parseDouble(collect);
        if(jToggleButton1.isSelected()){
            mark=mark-10;
        }
        else{
            mark=mark+10;
        }
        jTextField3.setText(Double.toString(mark));
    }//GEN-LAST:event_jToggleButton1ActionPerformed
/*
    Function: readIn
    Purpose: This function opens the local presets file. If it fails,
    it will then try to open one on a shared file.
    
    It will then transfer the text on that file to two arrays of strings, 
    one for price and one for the model name.
    
    */
private static void readIn(String filething) throws IOException{
    FileInputStream in;
    String line;
        
            File x = new File(filething);
            if(!x.exists()){
            x= new File("/r:/Software/IT Auction Auto Submitter/presets.txt");
            if(x.exists()){
                found = 1;
                in = new FileInputStream("/r:/Software/IT Auction Auto Submitter/presets.txt");
            }
            else{
                found = 2;
                in = new FileInputStream(filething);
            }}
            else{in = new FileInputStream(filething);}
            BufferedReader br = new BufferedReader (new InputStreamReader(in));
            while ((line = br.readLine()) != null) {
		opt.add(line);
                opt2.add(Double.parseDouble(br.readLine()));
               
	}} 
/*
    Function: search
    Purpose: This function checks the ID input by the user
    and matches it with its associated name.
    */
private String search(BufferedReader nunkyFuts, FileReader fr, String id) throws IOException{
String x="";
String y="";
nunkyFuts.readLine();

while ((x = nunkyFuts.readLine()) != null){
if(x.substring(0, x.indexOf(',')).equals(id)){
    y=x.substring(0, x.indexOf(','));
    x= x.substring(x.indexOf(',')+1, x.indexOf(',', x.indexOf(',')+1));
    break;
}
}
jTextField1.setText(x);
return x;
}
public static void main(String args[])  {
         
        try {
            readIn("presets.txt");
        } catch (IOException ex) { 
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
       
           
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final int countdown=found;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void SetLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}