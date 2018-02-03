package com.wayne.c1.gui.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyDemo {

	private Frame f;
	private TextField tf;
	private Button but;

	public MouseAndKeyDemo() {
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		f = new Frame("演示鼠标和键盘监听");
		f.setBounds(400, 200, 500, 400);
		f.setLayout(new FlowLayout());

		tf = new TextField(25);

		but = new Button("一个按钮");

		f.add(tf);
		f.add(but);

		myEvent();

		f.setVisible(true);
	}

	private void myEvent() {
		// TODO Auto-generated method stub
		
		//给文本框添加键盘监听
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			//	System.out.println("key run..."+KeyEvent.getKeyText(e.getKeyCode())+"::::"+e.getKeyCode());
			//	int code = e.getKeyCode();
			//	if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9)){
			//		System.out.println("必须是数字");
			//		e.consume();
			//	}
				
				//control+enter
				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_ENTER){
					System.out.println("enter run ...");
				}
			}
		});
		
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub

				System.exit(0);
			}
		});

		but.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("action run.....");
			}
		});
		
		// 在按钮上添加一个鼠标监听
		but.addMouseListener(new MouseAdapter() {
			
			private int count = 1;

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

				// System.out.println("mouse enter..." + count++);

				tf.setText("mouse enter..." + count++);
			}
			
			//click比action先执行
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
		
				if(e.getClickCount()==2)
					tf.setText("mouse double click..." + count++);
				//System.out.println("mouse click..." + count++);
				//System.out.println(e);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MouseAndKeyDemo();
	}

}
