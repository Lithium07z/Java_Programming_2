/*���α׷� �ۼ�����: 2019.10.24
 *���α׷� ����: ���ٽ��� ����� ���� ��ư�� ���� �������� �������� �����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.24 AM 11:14
 */
package week9TestingPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame {
       private JButton button1, button2;
       private JPanel panel;
       YellowButton yButton = () -> panel.setBackground(Color.YELLOW);
       PinkButton pButton = () -> panel.setBackground(Color.PINK);
 
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
       
       private class MyListener implements ActionListener {   //���� Ŭ������ �ۼ�
             public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button1) {         //�̺�Ʈ�� �߻���Ų ��ü �ĺ�
                           yButton.colorset();
                    } else if (e.getSource() == button2) {
                           panel.setBackground(Color.PINK);
                           pButton.colorset();
                    }
             }
        }
  }
		@FunctionalInterface
		interface YellowButton {
			void colorset();
		}

		@FunctionalInterface
		interface PinkButton {
			void colorset();
		}
		public class ChangeBackground {
			public static void main(String[] args) {
             MyFrame t = new MyFrame();
			}
		}