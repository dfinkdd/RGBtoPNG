/*
 * The MIT License
 *
 * Copyright 2016 David Fink.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package rgbtopng;

import javax.swing.*;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author David Fink
 */
public class RGBtoPNG extends javax.swing.JFrame {

    //declare variables for use throughout the application
    private RGB currentRGB;
    private int imageWidth, imageHeight;
    private File rgbFile;
    private RGBFileManager rgbFileMan;

    /**
     * Creates new form RGBtoPNG
     */
    public RGBtoPNG() {
        initComponents();

        //initialize variables for use throughout the application
        currentRGB = new RGB(50, 50, 50);
        imageWidth = 50;
        imageHeight = 50;
        rgbFile = new File("rgbValues.rgb");
        rgbFileMan = new RGBFileManager();

        //checks if the file rgbValueArray.rgb exists, and if it does not exist,
        //the application will generate a copy
        if (!rgbFile.exists()) {
            try {
                rgbFileMan.writeRGBFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error generating RGB file. "
                        + "Please restart the application to utilize the "
                        + "'Generate Sampler' functionality.",
                        "Error Generating RGB File", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        titleHeader = new javax.swing.JLabel();
        colorPreview = new javax.swing.JPanel();
        redSlider = new javax.swing.JSlider();
        greenSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        genButton = new javax.swing.JButton();
        redLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        redValueLabel = new javax.swing.JLabel();
        greenValueLabel = new javax.swing.JLabel();
        blueValueLabel = new javax.swing.JLabel();
        genSamplerButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        sizeChangerMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 475));
        setMinimumSize(new java.awt.Dimension(400, 475));
        setPreferredSize(new java.awt.Dimension(400, 475));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, titleHeader, org.jdesktop.beansbinding.ELProperty.create("${text}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleHeader.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        titleHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleHeader.setText("RGBtoPNG");
        getContentPane().add(titleHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, -1));

        colorPreview.setBackground(new java.awt.Color(254, 254, 254));
        colorPreview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        colorPreview.setMaximumSize(new java.awt.Dimension(100, 100));
        colorPreview.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout colorPreviewLayout = new javax.swing.GroupLayout(colorPreview);
        colorPreview.setLayout(colorPreviewLayout);
        colorPreviewLayout.setHorizontalGroup(
            colorPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        colorPreviewLayout.setVerticalGroup(
            colorPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        getContentPane().add(colorPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        redSlider.setMaximum(255);
        redSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });
        getContentPane().add(redSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 250, -1));

        greenSlider.setMaximum(255);
        greenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderStateChanged(evt);
            }
        });
        getContentPane().add(greenSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 251, -1));

        blueSlider.setMaximum(255);
        blueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderStateChanged(evt);
            }
        });
        getContentPane().add(blueSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 251, -1));

        genButton.setBackground(new java.awt.Color(41, 180, 26));
        genButton.setText("Generate");
        genButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genButtonActionPerformed(evt);
            }
        });
        getContentPane().add(genButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        redLabel.setText("Red");
        getContentPane().add(redLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 40, -1));

        greenLabel.setText("Green");
        getContentPane().add(greenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 40, -1));

        blueLabel.setText("Blue");
        getContentPane().add(blueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 40, -1));

        redValueLabel.setText("50");
        getContentPane().add(redValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        greenValueLabel.setText("50");
        getContentPane().add(greenValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        blueValueLabel.setText("50");
        getContentPane().add(blueValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        genSamplerButton.setText("Generate Sampler");
        genSamplerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genSamplerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(genSamplerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        fileMenu.setText("File");
        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        sizeChangerMenuItem.setText("Change Output Size");
        sizeChangerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeChangerMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(sizeChangerMenuItem);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //triggers when the "Generate" button is clicked by the user, and generates
    //a file with the selected color
    private void genButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genButtonActionPerformed
        //get rgb values and assign to currentRGB
        currentRGB.setRed(redSlider.getValue());
        currentRGB.setGreen(greenSlider.getValue());
        currentRGB.setBlue(blueSlider.getValue());

        //calls the generateFile function for the current color
        currentRGB.generateFileToDirectory(imageWidth, imageHeight);
    }//GEN-LAST:event_genButtonActionPerformed

    //triggers when the red slider value is changed by the user; sets the label
    //text for the slider, sets the red value variable, and updates the color
    //preview
    private void redSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        //get the value on the red color slider, apply that value to the color
        //preview, and set the label text for the slider to the correct value
        currentRGB.setRed(redSlider.getValue());
        colorPreview.setBackground(currentRGB.toColor());
        redValueLabel.setText(Integer.toString(currentRGB.getRed()));
    }//GEN-LAST:event_redSliderStateChanged

    //triggers when the green slider value is changed by the user; sets the label
    //text for the slider, sets the green value variable, and updates the color
    //preview
    private void greenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderStateChanged
        //get the value on the green color slider, apply that value to the color
        //preview, and set the label text for the slider to the correct value
        currentRGB.setGreen(greenSlider.getValue());
        colorPreview.setBackground(currentRGB.toColor());
        greenValueLabel.setText(Integer.toString(currentRGB.getGreen()));
    }//GEN-LAST:event_greenSliderStateChanged

    //triggers when the blue slider value is changed by the user; sets the label
    //text for the slider, sets the blue value variable, and updates the color
    //preview
    private void blueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderStateChanged
        //get the value on the blue color slider, apply that value to the color
        //preview, and set the label text for the slider to the correct value
        currentRGB.setBlue(blueSlider.getValue());
        colorPreview.setBackground(currentRGB.toColor());
        blueValueLabel.setText(Integer.toString(currentRGB.getBlue()));
    }//GEN-LAST:event_blueSliderStateChanged

    //triggers when the "Generate Sampler" button is clicked; prompts user for
    //a sampler size, then generates a sampler of colors as individual files
    //in a similar manner as the individual file generator
    private void genSamplerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genSamplerButtonActionPerformed
        //prompt user for sampler size with samplerSizePanel presented in JOptionPane
        JPanel samplerSizePanel = new JPanel();
        samplerSizePanel.setLayout(new BoxLayout(samplerSizePanel, BoxLayout.Y_AXIS));
        JLabel samplerSizeLabel = new JLabel("Please select the sampler size. "
                + "Smaller values generate larger samplers, larger values generate"
                + " smaller samplers.");
        JSlider samplerSizeSlider = new JSlider(1, 5, 3);
        samplerSizeSlider.setPaintLabels(true);
        samplerSizeSlider.setSize(50, 10);
        samplerSizeSlider.setMajorTickSpacing(2);
        samplerSizeSlider.setMinorTickSpacing(1);
        samplerSizePanel.add(samplerSizeLabel);
        samplerSizePanel.add(samplerSizeSlider);

        //declare and initialize variable performOperation which will grab input
        //regarding whether or not the user wishes to continue file generation at
        //each stage where a cancel option is provided
        int performOperation = JOptionPane.showConfirmDialog(null, samplerSizePanel,
                "Select Sampler Size",
                JOptionPane.OK_CANCEL_OPTION);

        //map sampler size selection to enumerated value if the user chose to
        //perform the operation
        if (performOperation == JOptionPane.OK_OPTION) {
            int genLoopIncrementVal = samplerSizeSlider.getValue();
            switch (genLoopIncrementVal) {
                case 1:
                    genLoopIncrementVal = 10;
                    break;
                case 2:
                    genLoopIncrementVal = 100;
                    break;
                case 3:
                    genLoopIncrementVal = 1000;
                    break;
                case 4:
                    genLoopIncrementVal = 10000;
                    break;
                case 5:
                    genLoopIncrementVal = 100000;
                    break;
                default:
                    genLoopIncrementVal = 1000;
                    break;
            }

            //warn users that the operation may take a while to complete
            JOptionPane.showMessageDialog(null, "This operation may take a while to "
                    + "complete, please allow the application time to generate the files",
                    "Long Operation Warning", JOptionPane.WARNING_MESSAGE);

            //declare and initialize an ArrayList to store all RGB values recorded
            //in the RGB values file
            ArrayList<RGB> rgbVals = new ArrayList<>();

            //check that the file containing all RGB values exists, then if it
            //exists, run the file generation
            if (rgbFile.exists()) {
                JFileChooser fileChooser = new javax.swing.JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                performOperation = fileChooser.showDialog(null, "Select Output Directory");

                //continues file generation only if user has selected a directory
                //with the file chooser
                if (performOperation == JFileChooser.APPROVE_OPTION) {
                    File outputDir = fileChooser.getSelectedFile();

                    try {
                        rgbVals = rgbFileMan.readRGBFile();
                    } catch (IOException | ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "Error reading RGB file. "
                                + "Please restart the application to utilize the "
                                + "'Generate Sampler' functionality.",
                                "Error Reading RGB File", JOptionPane.ERROR_MESSAGE);
                    }

                    //declare and initialize variables to loop through the ArrayList of
                    //RGB values and generate files
                    Iterator valueIterator = rgbVals.iterator();
                    int seedValue = (int) Math.floor(10 * Math.random());
                    RGB iteratedRGB = null;
                    String savePath = "";

                    //get the path to the output directory and store in savePath
                    try {
                        savePath = outputDir.getCanonicalPath();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "The application could "
                                + "not get the specified path. Please try again.",
                                "Could Not Get Path", JOptionPane.ERROR_MESSAGE);
                    }

                    //iterate through rgbVals with valueIterator and generate sampler files
                    while (valueIterator.hasNext()) {
                        //increment through a specified number of values (set to the 
                        //user selection) starting with a random 0-10 seed value to 
                        //reach next value to be generated
                        for (int i = seedValue; i < genLoopIncrementVal; i++) {
                            if (valueIterator.hasNext()) {
                                iteratedRGB = (RGB) valueIterator.next();
                            }
                        }
                        iteratedRGB.generateFile(imageWidth, imageHeight, savePath);
                    }
                    JOptionPane.showMessageDialog(null, "File generation complete!",
                            "File Generation Complete", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_genSamplerButtonActionPerformed

    //triggers when the output size option in the Edit menu is selected' displays
    //a prompt for the user to set the output width and height, which are then 
    //set in the imageWidth and imageHeight variables
    private void sizeChangerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeChangerMenuItemActionPerformed
        //prompt user for new output size for generated files by displaying JPanel
        //sizeOptionsPanel with fields for width and height
        JPanel sizeOptionsPanel = new JPanel(new FlowLayout());
        JLabel widthLabel = new JLabel("Width (px)");
        JLabel heightLabel = new JLabel("Height (px)");
        JTextField widthField = new JTextField(3);
        JTextField heightField = new JTextField(3);
        sizeOptionsPanel.add(widthLabel);
        sizeOptionsPanel.add(widthField);
        sizeOptionsPanel.add(heightLabel);
        sizeOptionsPanel.add(heightField);

        //declare variable performOperation which will grab input regarding 
        //whether or not the user wishes to continue with the operation
        int performOperation;

        performOperation = JOptionPane.showConfirmDialog(null, sizeOptionsPanel,
                "Enter the width and height values for output:",
                JOptionPane.OK_CANCEL_OPTION);

        //set the width and height for output files according to entered values
        //only if the user selected 'OK' in the prompt
        if (performOperation == JOptionPane.OK_OPTION) {
            this.imageWidth = Integer.parseInt(widthField.getText());
            this.imageHeight = Integer.parseInt(heightField.getText());
        }
    }//GEN-LAST:event_sizeChangerMenuItemActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RGBtoPNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RGBtoPNG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueLabel;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JLabel blueValueLabel;
    private javax.swing.JPanel colorPreview;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton genButton;
    private javax.swing.JButton genSamplerButton;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JLabel greenValueLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel redLabel;
    private javax.swing.JSlider redSlider;
    private javax.swing.JLabel redValueLabel;
    private javax.swing.JMenuItem sizeChangerMenuItem;
    private javax.swing.JLabel titleHeader;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
