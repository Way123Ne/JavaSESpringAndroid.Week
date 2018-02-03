package com.wayne.swing.demo;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MyWindow extends javax.swing.JFrame {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private JTextField jTextField1;
	private JButton jButton1;
	private JTextArea jTextArea2;
	private JTextArea jTextArea1;
	private JButton jButton2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MyWindow inst = new MyWindow();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MyWindow() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			FlowLayout thisLayout = new FlowLayout();
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setPreferredSize(new java.awt.Dimension(378, 30));
				jTextField1.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent evt) {
						jTextField1KeyPressed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("\u8f6c\u5230");
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setLayout(null);
				jButton1.setText("\u8f6c\u5230");
				jButton1.setPreferredSize(new java.awt.Dimension(384, -14));
				jButton1.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent evt) {
						jTextField1KeyPressed(evt);
					}
				});

			}
			{
				jTextArea1 = new JTextArea();
				getContentPane().add(jTextArea1);
			}
			{
				jTextArea2 = new JTextArea();
				getContentPane().add(jTextArea2);
				jTextArea2.setPreferredSize(new java.awt.Dimension(392, 164));
			}
			pack();
			this.setSize(645, 288);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		//TODO add your code for jButton2.actionPerformed
		showDir();
	}

	private void showDir() {
		/*
		 * 通过电机按钮或去文本框中的目录
		 * 将目录中的内容现实在文本区域中
		 */
		
		String dir_str = jTextField1.getText();
		File dir = new File(dir_str);
		
		if(dir.exists() && dir.isDirectory()){
			jTextArea1.setText("");
			String[] names = dir.list();
			
			for(String name : names){
				jTextArea1.append(name+LINE_SEPARATOR);
			}
		}
	}
	
	
	private void jTextField1KeyPressed(KeyEvent evt) {
		System.out.println("jTextField1.keyPressed, event="+evt);
		//TODO add your code for jTextField1.keyPressed
		if(evt.getKeyCode()==KeyEvent.VK_ENTER)
			showDir();
	}

}
