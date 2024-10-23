/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ToDoList_App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author x
 */
public class ToDoList {
    
    private JFrame frame;
    private JPanel titleBar;
    private JLabel titleLabel;
    private JLabel closeLabel;
    private JLabel minimizeLabel;
    private JPanel dashboardPanel;
    private JButton addTaskButton;
    private ArrayList<String> tasks = new ArrayList<>();
    
    private boolean isDragging = false;
    private Point mouseOffset;
    
    
    // Constructor
    public ToDoList () {
        // Main JFrame 
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);
//        frame.setBackground(new Color(255,255,55));

        // Set Border for the Frame
        frame.getRootPane().setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(7, 7, 7, 7, new Color(211,84,0)), new EmptyBorder(0,0,0,0)));

        // Title Bar
        titleBar = new JPanel();
        titleBar.setLayout(null);
        titleBar.setBackground(new Color(12,22,30));
        titleBar.setPreferredSize(new Dimension(frame.getWidth(),30));
        frame.add(titleBar, BorderLayout.NORTH);
        
        // Config the title Bar
        titleLabel = new JLabel("To-Do-List");
        titleLabel.setBackground(new Color(255,255,255));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBounds(10,0,250,30);
        titleBar.add(titleLabel);
        
        // Create and config the Close Label
        closeLabel = new JLabel("x");
        closeLabel.setForeground(Color.WHITE);
        closeLabel.setFont(new Font("Arial", Font.BOLD,16));
        closeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        closeLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeLabel.setBounds(frame.getWidth()-50,0,30,30);
        titleBar.add(closeLabel);
        
        // Create and config the Minimize Label
        minimizeLabel = new JLabel("-");
        minimizeLabel.setForeground(Color.WHITE);
        minimizeLabel.setFont(new Font("Arial", Font.BOLD,16));
        minimizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        minimizeLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        minimizeLabel.setBounds(frame.getWidth()-75,0,30,30);
        titleBar.add(minimizeLabel);
        
        // Create the Dashboard Panel
        dashboardPanel = new JPanel();
        dashboardPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        dashboardPanel.setBackground(new Color(200,200,200));
        frame.add(dashboardPanel,BorderLayout.CENTER);
        
        
        
        
        
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new ToDoList();
        
    }
    
}
