package exam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame {
	
	public ButtonTest() {
		// 레이아웃을 지정한다.
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("클릭");
		btn1.setBackground(Color.YELLOW);
		btn1.setPreferredSize(new Dimension(150,150));
		add(btn1);
		
		// 익명클래스로 리스너 작성
		// ActionListener 
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼클릭함");
			}
		});
		
		setVisible(true);
		setSize(640, 480);
		setResizable(false); // 사이즈 재조정 불가능
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ButtonTest();
	}
}
