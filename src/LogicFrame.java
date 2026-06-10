import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogicFrame extends JFrame {
   private final int WIDTH = 400;
   private final int HEIGHT = 300;
   private final int FIELD_SIZE = 32;

   public LogicFrame() {
      super("Go10 - Numbers Converter");
      Dimension frameSize = new Dimension(WIDTH, HEIGHT);
      setSize(frameSize);

      JPanel content=  new JPanel();
      content.setLayout(new GridLayout(3, 2));

      //add decimal io field
      JPanel subPanel = new JPanel(new BorderLayout());
      JLabel swapLabel = new JLabel("Decimal: ");
      subPanel.add(swapLabel);
      content.add(subPanel);

      subPanel = new JPanel(new BorderLayout());
      JTextField inpField =  new JTextField(FIELD_SIZE);
      inpField.addActionListener(new DecimalListener());
      subPanel.add(inpField);
      content.add(subPanel);
      
      //add hex io field
      subPanel = new JPanel(new BorderLayout());
      swapLabel = new JLabel("Hex: x");
      subPanel.add(swapLabel);
      content.add(subPanel);

      subPanel = new JPanel(new BorderLayout());
      inpField = new JTextField(FIELD_SIZE);
      inpField.addActionListener(new HexListener());
      subPanel.add(inpField);
      content.add(subPanel);

      //add hex io field
      subPanel = new JPanel(new BorderLayout());
      swapLabel = new JLabel("Binary: b");
      subPanel.add(swapLabel);
      content.add(subPanel);

      subPanel = new JPanel(new BorderLayout());
      inpField = new JTextField(FIELD_SIZE);
      inpField.addActionListener(new BinaryListener());
      subPanel.add(inpField);
      content.add(subPanel);

      add(content);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }

   class DecimalListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {

      }
   }

   class HexListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {

      }
   }

   class BinaryListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {

      }
   }

}
