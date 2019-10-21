package org.iuea.oop.views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.toedter.calendar.JDateChooser;


public class LandingPage extends JPanel {
	
	public  LandingPage() {
		
		//MAIN FRAME
		JFrame Lpage = new JFrame();
		 Lpage.setTitle("Student Information");
		 Lpage.setSize(700,400);
		 Lpage.setLocationRelativeTo(null);
		
		 //MENU BAR SECTION
		 JMenuBar mb = new  JMenuBar();
		 Lpage.setJMenuBar(mb);
		 //MENU INFORMATION
		 JMenu m = new JMenu("            Action          ");
		 mb.add(m);		 
		 JMenu k = new JMenu("            Help          ");
		 mb.add(k);
		 //LOGOUT MENU ITEM
		 JMenuItem Lg = new JMenuItem("         Log Out       ");		
		 m.add(Lg);
		 
		 JPanel Main,FPanel,SPanel,BPanel,TPanel,AddSec,dd;
		 //MAIN PANEL OF THE WINDOW
		 Main = new JPanel();
		 Main.setBackground(Color.gray);
		 Main.setLayout(new BorderLayout());
		 Lpage.getContentPane().add(Main);
		 
		 //LOG OUT ACTION LISTENER
		 Lg.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {													
					Lpage.setVisible(false);
					 new LoginView();
				}       
		 });
		 
		 //FOOTER SECTION
		 FPanel = new JPanel();		 
		 JLabel leb = new JLabel("Copy right ravens5 2019");
		 FPanel.setBorder( BorderFactory.createMatteBorder(1,0,0,0,Color.BLACK));
		 FPanel.add(leb);
		 Main.add(FPanel,BorderLayout.SOUTH);
		 
		 //SIDE PANEL
		 SPanel = new JPanel();
		 SPanel.setBackground(Color.WHITE);
		 SPanel.setBorder( BorderFactory.createMatteBorder(0,0,0,1,Color.BLACK));	
		 SPanel.setVisible(true);
		 Main.add(SPanel,BorderLayout.WEST);
		 
		 //BTN SECTION
		 BPanel = new JPanel();
		// BPanel.setBackground(Color.RED);
		 BPanel.setLayout(new GridLayout(0,1));
		 SPanel.setVisible(true);
		 SPanel.add(BPanel);
		 //SIDE BAR CONTENT
		 JButton student,b2,b3,b4;
		 student = new JButton("Students");	
		// b1.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(student);
		 b2 = new JButton("Course");
		// b2.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(b2);
		 b3 = new JButton("Course Units");
		// b3.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(b3);
		 b4 = new JButton("Lecturers");	
		// b4.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(b4);		 
//
//			//The Student page	****TAZAN*****		
	 TPanel = new JPanel();	
		 TPanel.setVisible(false);
		 TPanel.setLayout(new FlowLayout(FlowLayout.CENTER,40,10));		
		//THE TABLE BUTTONS
		JButton AddBtn,EditBtn,Delt;
		AddBtn =new JButton("Add");
		AddBtn.setBackground(Color.GREEN);			
		EditBtn =new JButton("Edit");
		EditBtn.setBackground(Color.ORANGE);			
		Delt =new JButton("Delete");
		Delt.setBackground(Color.RED);			
		TPanel.add(AddBtn);
		TPanel.add(EditBtn);
		TPanel.add(Delt);	
	

//			//THE TABLE SECTION   ****TAZAN*****
		 JTable table = new JTable();			
		//INITIAL DATA SET
		Object[] columnHeads = new String[] { "Registration" , "First Name","Last Name","Sex","DOB",};			
		String[][] Students = new String[][] {
				{ "Registration", "First Name","Last Name","Sex","DOB" },
				{  "039/BSSE-S", "Kevin","Mafabi","Male","06/21/1990", },
				{  "154/BCS", "Douglas","Masagazi","Male","04/28/2002", },
				{  "155/BIT" , "Mary","Namata","Female","03/10/2000",},					
				};
				
		DefaultTableModel model = new DefaultTableModel() {
			public boolean isCellEditable(int row, int col) { //DISABLES THE EDITING OF THE TABLE
				return false;
				}
				};				
		//model.setColumnIdentifiers(columnHeads);			
		//table.setModel(model);
		table.setBackground(Color.white);
		table.setForeground(Color.black);				
			
				model.setDataVector(Students, columnHeads);
				table.setModel(model);
				TPanel.add(table, BorderLayout.CENTER); //FOR ADDING TABLE TO MAIN FRAME
				Main.add(TPanel);					
				 
				 //STUDENT Btn ACTION LISTENERS						
				student.addActionListener(new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {													
						TPanel.setVisible(true);						
					}          
					});			
				
		 
					
			
					//ADD RECORD SECTION ****DOUGLAS****
//					
//					
//					//ADDING DATA TO THE TABLE ACTION LISTENER AREA ****TAZAN****
//					//EDIT SECTION OF THE TABLE    ****TREVOR****
//					//DELETE SECTION OF THE TABLE ****HARRIS****
		 
		 Lpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Lpage.setVisible(true); //setting the LandPage visible		 
	}
}
