package MemberList;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MemberList extends JFrame{

	public MemberList() {

		File temp = new File("members.txt");
		System.out.println(temp.getAbsolutePath());

		//회원가입 창 설계

		JPanel p = new JPanel();
		add(p);
		setSize(500,500);
		setTitle("회원가입");

		Label l1 = new Label("이름");
		Label l2 = new Label("아이디");
		Label l3 = new Label("패스워드");
		Label l4 = new Label("주소");
		Label l5 = new Label("추가사항");

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);

		TextField t1 = new TextField(15);
		TextField t2 = new TextField(15);
		TextField t3 = new TextField(15);
		TextField t4 = new TextField(15);
		TextField t5 = new TextField(15);

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);

		t3.setEchoChar('*');

		JButton btn1 = new JButton("저장");
		JButton btn2 = new JButton("취소");

		add(btn1);
		add(btn2);
		add(p);

		l1.setBounds(40, 10, 40, 40);
		l2.setBounds(40, 50, 40, 40);
		l3.setBounds(40, 90, 60, 40);
		l4.setBounds(40, 130, 40, 40);
		l5.setBounds(40, 170, 60, 40);
		t1.setBounds(120, 10, 200, 30);
		t2.setBounds(120, 50, 200, 30);
		t3.setBounds(120, 90, 280, 30);
		t4.setBounds(120, 130, 280, 30);
		t5.setBounds(120, 180, 200, 120);
		btn1.setBounds(125, 330, 80, 30);
		btn2.setBounds(240, 330, 80, 30);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		btn1.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) { // 회원가입 데이터 저장
				try {

					String s = null;

					boolean isOk = false;

					BufferedWriter bw = new BufferedWriter(new FileWriter("members.txt", true));

					BufferedReader br = new BufferedReader(new FileReader("members.txt"));

					if(e.getSource() == btn1) {

						while((s = br.readLine()) != null) {

							// 아이디 중복

							String[] array = s.split("/");
							if(array.length != 0) {
							if(array[0].equals(t1.getText())){
								isOk = true;

								break;

							}
							}
						}
						//정보 입력시 중복이 없으면 데이터 보냄

						if(!isOk) {

							bw.write(t1.getText() + "/");
							bw.write(t2.getText() + "/");
							bw.write(t3.getText() + "/");
							bw.write(t4.getText() + "/");
							bw.write(t5.getText() + "\r\n");
							bw.close();
							JOptionPane.showMessageDialog(null, "회원가입을 축하합니다.");
							dispose();
						}else {
							JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
						}

					}else if(e.getSource() == btn2) {

						t1.setText("");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
					}

				}catch (IOException ex) {
					JOptionPane.showMessageDialog(null,"실패");
				}
			}
		});

	}

}