/*프로그램 작성일자: 2019.10.24
 *프로그램 설명: 무명 클래스를 사용해 누른 버튼에 따라 페이지의 배경색상을 변경하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.24 AM 11:31
 */
package week9TestingPackage2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame {
       private JButton button1, button2;
       private JPanel panel;
 
       public MyFrame() {
             this.setSize(300, 200);
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.setTitle("이벤트 예제");
             panel = new JPanel();
             button1 = new JButton("노란색");
             button1.addActionListener(new MyListener());
             panel.add(button1);
             button2 = new JButton("핑크색");
             button2.addActionListener(new MyListener());
             panel.add(button2);
             this.add(panel);   
             this.setVisible(true);
       	}
       	private class MyListener implements ActionListener {   //내부 클래스로 작성
             public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button1) {         //이벤트를 발생시킨 객체 식별
                           cs.yellowSet();
                    } else if (e.getSource() == button2) {
                           cs.pinkSet();
                    }
             }
        }
       	colorSet cs = new colorSet() {
				public void yellowSet() {
					panel.setBackground(Color.YELLOW);
				}
				public void pinkSet() {
					panel.setBackground(Color.PINK);
				}
			};
  }

interface colorSet{
 	void yellowSet();
 	void pinkSet();
 }

public class ChangeBackground {
  		public static void main(String[] args) {
  			MyFrame t = new MyFrame();
  			
  		}
  	}