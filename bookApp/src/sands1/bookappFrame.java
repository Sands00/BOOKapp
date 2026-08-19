/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sands1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author Sandiso
 */
public class bookappFrame extends JFrame{
    
    private JMenuBar menu;
    private JMenu filemenu;
    
    private JMenuItem shelve;
    private JMenuItem exit;
    
    private JPanel tittlePnl;
    private JPanel authorPnl;
    private JPanel hdPnl;
    private JPanel disPlayPnl;
    private JPanel BtsPnl;
    private JPanel detailsPnl;
    private JPanel mainPnl;
    
    private JLabel hdLbl;
    private JLabel tittleLbl;
    private JLabel authorLbl;
    
    private JTextField tittleTF;
    private JTextField authorTF;
    
    private JTextArea disTArea;
    
    private JButton add;
    private JButton search;
    private JButton clear;
    
    private File file;
    private BufferedWriter bw;
    private BufferedReader br;
    
    private JFileChooser fc;
    
    public bookappFrame(){
        setTitle("Readers here!");
        setSize(600,550);
        
        menu=new JMenuBar();
        
        filemenu = new JMenu("file") ;
        
        shelve=new JMenuItem("Book Shelve");
        shelve.addActionListener(new file());
        exit=new JMenuItem("Exit");
        exit.addActionListener(new exit());
        
        filemenu.add(shelve);
        filemenu.add(exit);
        menu.add(filemenu);
        
        tittlePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        authorPnl =new JPanel(new FlowLayout(FlowLayout.LEFT));
        hdPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        disPlayPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        BtsPnl =new JPanel(new FlowLayout(FlowLayout.LEFT));
        detailsPnl = new JPanel(new GridLayout(3,1,1,1));
        mainPnl = new JPanel(new BorderLayout()) ;
        
        tittleLbl=new JLabel("Title: ");
        authorLbl = new JLabel("Author: ") ;
        
        hdLbl=new JLabel("Books Here");
        hdLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        hdLbl.setForeground(Color.RED);
        hdLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        tittleTF=new JTextField(20) ;
        authorTF = new JTextField(20) ;
        
        disTArea= new JTextArea(30,20);
        disTArea.setEditable(false);
        
        add=new JButton("Add Book") ;
        add.addActionListener(new addbook());
        search=new JButton("Search") ;
        add.addActionListener(new search());
        clear=new JButton("Clear") ;
        add.addActionListener(new clear());
        
        tittlePnl.add(tittleLbl);
        tittlePnl.add(tittleTF);
        
        authorPnl.add(authorLbl);
        authorPnl.add(authorTF);
        
        disPlayPnl.add(disTArea);
        
        detailsPnl.add(tittlePnl);
        detailsPnl.add(authorPnl);
        detailsPnl.add(disPlayPnl);
        
        BtsPnl.add(add);
        BtsPnl.add(search);
        BtsPnl.add(clear);
        
        mainPnl.add(hdPnl,BorderLayout.NORTH);
        mainPnl.add(detailsPnl,BorderLayout.CENTER);
        mainPnl.add(BtsPnl,BorderLayout.SOUTH);
        
        add(mainPnl);
        
        
        pack();
        setJMenuBar(menu);
        setVisible(true);
        
        
        
        
        
        
    }

    private  class addbook implements ActionListener {

        

        @Override
        public void actionPerformed(ActionEvent ae) {
            makebook();
        }
    }

    private  class search implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private  class clear implements ActionListener {

        

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private  class file implements ActionListener {

       
        @Override
        public void actionPerformed(ActionEvent ae) {
        
            JFileChooser fc = new JFileChooser();
            
            int val = fc.showSaveDialog(bookappFrame.this);
            
            if(val== JFileChooser.APPROVE_OPTION){
                try {
                    file=fc.getSelectedFile();
                    bw=new BufferedWriter(new FileWriter(file));
                    
                } catch (IOException ex) {
                    Logger.getLogger(bookappFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        
        }
    }

    private static class exit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }

       
    }
    
    public void makebook(){
        
        
        
    }
    
    
    
    
    
    
    
}
