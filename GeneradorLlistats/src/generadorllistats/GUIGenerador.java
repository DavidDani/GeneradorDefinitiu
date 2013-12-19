/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorllistats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Roig
 */
public class GUIGenerador extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    List<Alumne> llistaAlumnes = new ArrayList<>();
    SortedMap<Assignatura, Integer> llistaCurtaAssignatures = new TreeMap<>();

    public GUIGenerador() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel1.setText("Busca el fitxer que contè les dades:");

        path.setEditable(false);
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Selecciona les materies de les quals vols generar el llistat: ");

        jButton2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jButton2.setText("Generar el llistat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Generador de Llistats");

        jButton3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jButton3.setText("Sortir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jButton1.setText("Examinar:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        funcioPath();
        crearAlumnes(path.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed

    }//GEN-LAST:event_pathActionPerformed
    //Boto per generar el llistat
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jList1.getSelectedValuesList().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "NO HI HA RES SELECCIONAT");
        } else {
            generarXML();
            JOptionPane.showMessageDialog(rootPane, "FITXER GENERAT CORRECTAMENT");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
//Funcio que permet buscar un fitxer i escriure en el Text del costat

    private void funcioPath() {

        //Creem un objecte fitxer del tipus FileChooser
        JFileChooser fitxer = new JFileChooser();
        fitxer.showOpenDialog(null);
        //Creem un variable tipus Fitxer per obetnir el fitxer seleccionat anteriorment
        File f = fitxer.getSelectedFile();
        //Agafem el path i el guardem en una string
        String nomFitxer = f.getAbsolutePath();
        //Pintem el path dins el textbox anomenat 'path'"
        if (f.getName().endsWith(".csv")) {
            path.setText(nomFitxer);
        } else if (f.getName().endsWith(".csv") == false) {
            JOptionPane.showMessageDialog(null, "EL FITXER QUE HAS SELECCIONAT NO"
                    + " ES CORRECTE, SELECCIONA UN FITXER AMB EXTENSIÓ .CSV");
        }
    }

    private void generarXML() {
        List<Assignatura> materiesSeleccionades = jList1.getSelectedValuesList();
        try {        
            DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = (Document) docBuilder.newDocument();
            Element rootElement = doc.createElement("llistes");
            doc.appendChild(rootElement);

            for (Assignatura str : materiesSeleccionades) {
                Element assignatura = doc.createElement("llista");
                assignatura.setAttribute("materia", str.getNom());
                for (int i = 0; i < llistaAlumnes.size(); i++) {
                    if (llistaAlumnes.get(i).getLlistAssign().contains(str)) {
                        Element alumne = doc.createElement("alumne");
                        Element nomCognom = doc.createElement("cognomsNom");
                        nomCognom.appendChild(doc.createTextNode(llistaAlumnes.get(i).getNomComplet()));
                        alumne.appendChild(nomCognom);
                        Element curs = doc.createElement("grup");
                        curs.appendChild(doc.createTextNode(llistaAlumnes.get(i).getCurs()));
                        alumne.appendChild(curs);
                        assignatura.appendChild(alumne);
                    }
                }
                rootElement.appendChild(assignatura);
            }
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("llistaAlumesFiltrada.xml"));
            transformer.transform(source, result);
            
        } catch (TransformerException | ParserConfigurationException ex) {
            Logger.getLogger(GUIGenerador.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    private void crearAlumnes(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));//Llegim el fitxer
            String line = "";
            String patro = "\" #,\"\"00_NOM\"\",\"\"01_GRUPSCLASSE\"\",\"\"02_MATRICULADES\"\"\"";
            line = reader.readLine();//Saltem la línia de títols
            if (line.compareTo(patro) == 0) {
                while ((line = reader.readLine()) != null) {//mentre llegeixis linies del fitxer...
                    String[] dades = line.trim().split(",|\"");//desem els camps de la linia llegida separats per comes o cometes dobles
                    List<Assignatura> llistaAssignatures = new ArrayList<>();//Creem una llista de assignatures
                    for (int x = 15; x < dades.length; x++) {//mentre hi hagi assignatures a la línia d'aquest Alumne
                        Assignatura as = new Assignatura();//creem assignatura
                        as.setNom(dades[x]);//li donem el nom de l'assignatura
                        llistaAssignatures.add(as);//afegeix el nom de cada assignatura a la llista d'assignatures

                    }
                    //////Saber quines assignatures hi ha en total sense repetir-les
                    for (Assignatura aux : llistaAssignatures) {//per cada persona de l'array...
                        if (llistaCurtaAssignatures.containsKey(aux)) {//si ia existeix a l'array
                            llistaCurtaAssignatures.put(aux, llistaCurtaAssignatures.get(aux) + 1);//sumem +1 al valor de la persona valor(el valor es l'integer del hashmap
                        } else {//si no existia
                            llistaCurtaAssignatures.put(aux, 1);//afegim la persona al hashmap amb el valor 1
                        }
                    }
              /////

                    Alumne a = new Alumne();//creem l'alumne
                    a.setCodi(dades[1]);//afegim el codi
                    a.setNomComplet(dades[4] + "," + dades[5]);//afegim nom complet
                    a.setCurs(dades[10]);//afegim curs
                    a.setLlistAssign(llistaAssignatures);//afegim llista assignatures
                    llistaAlumnes.add(a);//afegim l'alumne amb les seves dades a la llista d'alumnes
                }

                jList1.setListData(llistaCurtaAssignatures.keySet().toArray());
            } else {
                JOptionPane.showMessageDialog(null, "EL FORMAT DEL FITXER .CSV NO ÉS CORRECTE!!!");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
            java.util.logging.Logger.getLogger(GUIGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIGenerador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField path;
    // End of variables declaration//GEN-END:variables
}
