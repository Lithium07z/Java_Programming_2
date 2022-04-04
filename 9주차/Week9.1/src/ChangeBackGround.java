import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {
	private JButton button1, button2;
	private JPanel panel;

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		panel = new JPanel();
		button1 = new JButton("�����");
		button1.addActionListener(new MyListener());
		panel.add(button1);
		button2 = new JButton("��ũ��");
		button2.addActionListener(new MyListener());
		panel.add(button2);
		this.add(panel);
		this.setVisible(true);
	}

	private class MyListener implements ActionListener { // ���� Ŭ������ �ۼ�
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) { // �̺�Ʈ�� �߻���Ų ��ü �ĺ�
				panel.setBackground(Color.YELLOW);
			} else if (e.getSource() == button2) {
				panel.setBackground(Color.PINK);
			}
		}
	}
}

public class ChangeBackGround {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}