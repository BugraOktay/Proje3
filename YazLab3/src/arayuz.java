import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.awt.event.ActionEvent;

public class arayuz extends JFrame {

	private JPanel contentPane;
	private JTextField textmasa;
	private JTextField textgarson;
	private JTextField textasci;
	private JTextField textField;
	private JTextField textkasa;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arayuz frame = new arayuz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public arayuz() {
		try {
			J.yaz = new FileWriter("C:\\Users\\bugra\\OneDrive\\Masaüstü\\Yeni Metin Belgesi.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image resim1 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
		Image resim2 = new ImageIcon(this.getClass().getResource("kırmızı.png")).getImage();
		Image resim3 = new ImageIcon(this.getClass().getResource("garson.png")).getImage();
		Image resim4 = new ImageIcon(this.getClass().getResource("saat.png")).getImage();
		Image resim5 = new ImageIcon(this.getClass().getResource("yemek.png")).getImage();
		Image resim6 = new ImageIcon(this.getClass().getResource("kasa.png")).getImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 250, 205));
		panel2.setBounds(0, 0, 1186, 663);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(95, 45, 80, 19);
		panel2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Her                    saniyede bir                      'i öncelikli toplam                      kişi gelmektedir.\r\n");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(61, 43, 968, 19);
		panel2.add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(301, 45, 80, 19);
		panel2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(543, 45, 80, 19);
		panel2.add(textField_8);
		
		JLabel lblNewLabel_3_1 = new JLabel("Saniyelik süreye göre restoranın maksimum kapasitesini hesapla :\r\n");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(151, 111, 547, 19);
		panel2.add(lblNewLabel_3_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(61, 113, 80, 19);
		panel2.add(textField_9);
		
		JButton p2_b1 = new JButton("Onayla");
		
		p2_b1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		p2_b1.setBounds(712, 111, 97, 22);
		panel2.add(p2_b1);
		
		JLabel p2_lbl1 = new JLabel("");
		p2_lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p2_lbl1.setBounds(61, 225, 760, 19);
		panel2.add(p2_lbl1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Masa, Garson ve Aşçı sayısına göre toplam kazancı hesapla :\r\n");
		lblNewLabel_3_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_1_2.setBounds(61, 321, 569, 19);
		panel2.add(lblNewLabel_3_1_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(558, 321, 80, 19);
		panel2.add(textField_10);
		
		JButton p2_b2 = new JButton("Onayla");
		p2_b2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		p2_b2.setBounds(663, 320, 97, 22);
		panel2.add(p2_b2);
		
		JLabel p2_lbl2 = new JLabel("");
		p2_lbl2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p2_lbl2.setBounds(61, 385, 760, 19);
		panel2.add(p2_lbl2);
		panel2.setVisible(false);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 250, 205));
		panel1.setBounds(0, 0, 1186, 663);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Problem 1");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 38));
		btnNewButton_1.setBounds(219, 270, 258, 82);
		panel1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Problem 2");
		
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 38));
		btnNewButton_1_1.setBounds(625, 270, 258, 82);
		panel1.add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(0, 0, 1186, 663);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Masa Sayısı: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(28, 10, 87, 25);
		panel.add(lblNewLabel_1);
		
		textmasa = new JTextField();
		textmasa.setBounds(125, 14, 53, 19);
		panel.add(textmasa);
		textmasa.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Garson Sayısı: ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(218, 10, 99, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Aşcı Sayısı: ");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(431, 10, 78, 25);
		panel.add(lblNewLabel_1_2);
		
		textgarson = new JTextField();
		textgarson.setColumns(10);
		textgarson.setBounds(327, 14, 53, 19);
		panel.add(textgarson);
		
		textasci = new JTextField();
		textasci.setColumns(10);
		textasci.setBounds(519, 14, 53, 19);
		panel.add(textasci);
		
		
		JLabel lblmasa = new JLabel("Masalar");
		lblmasa.setForeground(new Color(128, 0, 0));
		lblmasa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblmasa.setBounds(109, 71, 63, 25);
		panel.add(lblmasa);
		lblmasa.setVisible(false);
		
		JLabel lblgarson = new JLabel("Garsonlar");
		lblgarson.setForeground(new Color(128, 0, 0));
		lblgarson.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblgarson.setBounds(409, 71, 93, 25);
		panel.add(lblgarson);
		lblgarson.setVisible(false);
		
		JLabel lblasci = new JLabel("Aşcılar");
		lblasci.setForeground(new Color(128, 0, 0));
		lblasci.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblasci.setBounds(719, 71, 63, 25);
		panel.add(lblasci);
		lblasci.setVisible(false);
		
		JLabel lblmusteri = new JLabel("Müşteriler");
		lblmusteri.setForeground(new Color(128, 0, 0));
		lblmusteri.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblmusteri.setBounds(109, 299, 78, 25);
		panel.add(lblmusteri);
		lblmusteri.setVisible(false);
		
		JButton btnNewButton = new JButton("Onayla");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(783, 13, 99, 21);
		panel.add(btnNewButton);
		
		textkasa = new JTextField("1");
		textkasa.setColumns(10);
		textkasa.setBounds(694, 14, 53, 19);
		panel.add(textkasa);
		
		JLabel lblm[] = new JLabel[30];	
		JLabel lblg[] = new JLabel[30];	
		JLabel lbla[] = new JLabel[30];	
		JLabel lbl_musteri[] = new JLabel[30];
		
		masa(panel, lblm);
		garson(panel, lblg);
		asci(panel, lbla);
		musteri(panel, lbl_musteri);
		Garson.masalar=lblm;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblasci.setVisible(true);
				lblmasa.setVisible(true);
				lblgarson.setVisible(true);
				J.masa=Integer.parseInt(textmasa.getText());
				J.garson=Integer.parseInt(textgarson.getText());
				J.asci=Integer.parseInt(textasci.getText());
				J.kasa=Integer.parseInt(textkasa.getText());
				for (JLabel j : lbla) {
					if(j!=null)
						j.setVisible(false);
				}
				for (JLabel j : lblg) {
					if(j!=null)
						j.setVisible(false);
				}
				for (JLabel j : lblm) {
					if(j!=null)
						j.setVisible(false);
				}
				
				for (int i = 0; i < J.masa; i++) {
					lblm[i].setVisible(true);
					
				}
				for (int i = 0; i < J.garson; i++) {
					lblg[i].setVisible(true);
					
				}
				for (int i = 0; i < J.asci; i++) {
					lbla[i].setVisible(true);
					
				}
				J.s2= new Semaphore(J.masa);
				J.g2= new Semaphore(J.garson);
				
			}
		});
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(927, 14, 96, 19);
		panel.add(textField);
		
			
		JButton btnMteriGnder = new JButton("Müşteri Gönder");
		btnMteriGnder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J.il=0;
				for(int i=0;i<J.masa;i++) {
					lblm[i].setToolTipText("ds");
					
				}
				Image resim2 = new ImageIcon(this.getClass().getResource("mavi.png")).getImage();
				Image resim1 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
				
				for (JLabel j : lbl_musteri) {
					if(j!=null) {
						j.setVisible(false);
						j.setIcon(new ImageIcon(resim1));
					}
						
				}
				
				lblmusteri.setVisible(true);
				String s = textField.getText();
				String[] parcalar = s.split(",");
				
				int a = Integer.parseInt(parcalar[0]);
				int b = Integer.parseInt(parcalar[1]);
				J.ab=a+b;
				for (int j = 0; j < b; j++) {
					lbl_musteri[j].setIcon(new ImageIcon(resim2));
					
				}
				for (int j = 0; j < a+b; j++) {
					lbl_musteri[j].setVisible(true);
					
					
					
				}
				Asci.masalar=lblm;
				Kasa.masalar=lblm;
				
				destek.masalar=lblm;
				Sil.musteriler=lbl_musteri;
				Sil.masalar=lblm;
				Musteri.masalar=lblm;
				Musteri.musteriler=lbl_musteri;
				for (int i =0; i<J.masa;i++) {
					lblm[i].setName(null);
				}
				Thread t[]= new Thread[J.ab];
				
				for (int i=0;i<J.ab;i++) {
					Thread thread = new Thread(new Musteri(i));
					t[i]=thread;
					thread.start();
					
				}
				J.thread=t;
				
				Thread thread = new Thread(new Sil());
				thread.start();
				
				
			}
		});
		btnMteriGnder.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnMteriGnder.setBounds(1033, 13, 143, 21);
		panel.add(btnMteriGnder);
		
		JButton basla = new JButton("Similasyonu Başlat");
		basla.setFont(new Font("Times New Roman", Font.BOLD, 12));
		basla.setBounds(1033, 427, 143, 21);
		panel.add(basla);
		
		JButton btnyaz = new JButton("Dosyaya Yazdır");
		btnyaz.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnyaz.setBounds(1033, 396, 143, 21);
		panel.add(btnyaz);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Kasa Sayısı: ");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(597, 10, 87, 25);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(955, 469, 30, 30);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(resim3));
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(955, 513, 30, 30);
		panel.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setIcon(new ImageIcon(resim4));
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(955, 560, 30, 30);
		panel.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setIcon(new ImageIcon(resim5));
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBounds(955, 600, 30, 30);
		panel.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setIcon(new ImageIcon(resim6));
		
		JLabel lblNewLabel_1_3 = new JLabel("Garson Sipariş Alıyor");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(995, 474, 168, 25);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Müşteri Yemeği Bekliyor");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(995, 518, 181, 25);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Müşteri Yemeği Yiyor");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(995, 560, 181, 25);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Müşteri Ödemesini Yapıyor");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(995, 600, 181, 25);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Sipariş Alma Süresi:");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(908, 71, 168, 25);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Yemek Hazırlama Süresi:");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3_2.setBounds(908, 106, 168, 25);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Yemek Yeme Süresi:");
		lblNewLabel_1_3_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3_3.setBounds(908, 141, 168, 25);
		panel.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Ödeme İşlemi Süresi:");
		lblNewLabel_1_3_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3_4.setBounds(908, 176, 168, 25);
		panel.add(lblNewLabel_1_3_4);
		
		JLabel lblNewLabel_1_3_5 = new JLabel("Müşteri Bekleme Süresi:");
		lblNewLabel_1_3_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3_5.setBounds(908, 210, 168, 25);
		panel.add(lblNewLabel_1_3_5);
		
		textField_1 = new JTextField("2");
		textField_1.setColumns(10);
		textField_1.setBounds(1088, 75, 75, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField("3");
		textField_2.setColumns(10);
		textField_2.setBounds(1088, 106, 75, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField("3");
		textField_3.setColumns(10);
		textField_3.setBounds(1088, 145, 75, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField("1");
		textField_4.setColumns(10);
		textField_4.setBounds(1088, 176, 75, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField("20");
		textField_5.setColumns(10);
		textField_5.setBounds(1088, 214, 75, 19);
		panel.add(textField_5);
		
		JButton Sure_onay = new JButton("Onayla");
		Sure_onay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J.S_siparis=Integer.parseInt(textField_1.getText())*1000;
				J.S_hazirlama=Integer.parseInt(textField_2.getText())*1000;
				J.S_yeme=Integer.parseInt(textField_3.getText())*1000;
				J.S_odeme=Integer.parseInt(textField_4.getText())*1000;
				J.S_bekleme=Integer.parseInt(textField_5.getText())*1000;
			}
		});
		Sure_onay.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Sure_onay.setBounds(1077, 249, 99, 21);
		panel.add(Sure_onay);
		
		
		btnyaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					J.yaz.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		basla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Thread tt[]= new Thread[J.garson];
				for(int j=0;j<J.garson;j++) {
					Thread t1 = new Thread(new Garson(j));
					t1.start();
					tt[j]=t1;
				}
				J.thread_g = tt;
				
				Thread ttt[]= new Thread[J.asci*2];
				for(int j=0;j<J.asci*2;j++) {
					Thread t1 = new Thread(new Asci(j));
					t1.start();
					ttt[j]=t1;
				}
				J.thread_a = ttt;
				
				for(int j=0;j<J.kasa;j++) {
					Thread t1 = new Thread(new Kasa(j));
					t1.start();
				}
				
				Thread thread = new Thread(new Sil());
				thread.start();
				for(int j=0; j<10;j++) {
					Thread thread2 = new Thread(new destek());
					thread2.start();
				}
				
				
			}
		});
		
		panel.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panel1.setVisible(false);
				panel2.setVisible(false);
			}
		});
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
		});
		p2_b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField_6.getText());
				int c = Integer.parseInt(textField_8.getText());
				int d = Integer.parseInt(textField_9.getText());
				p2_lbl1.setText(c*2+" Masa "+c*2+" Garson "+ c+ " Aşçı ");
			}
		});
		p2_b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField_6.getText());
				int c = Integer.parseInt(textField_8.getText());
				int d = Integer.parseInt(textField_9.getText());
				int gelen=d/a*c;
				String s = textField_10.getText();
				String[] parcalar = s.split(",");
				
				int x = Integer.parseInt(parcalar[0]);
				int y = Integer.parseInt(parcalar[1]);
				int z = Integer.parseInt(parcalar[2]);
				int giden=0;
				if(x!=c*2 || y!=c*2 || z!=c) {
					if(x==0 || y==0 ||z==0)
						giden =gelen;
					else {
						giden=10;
					}
				}
				int top=x+y+z+giden;
				p2_lbl2.setText("Toplam kazanç: "+(gelen-top));;
				
			}
		});
		
		
	}
	public Musteri[] musteri_gir(int adet) {
		Musteri m[] = new Musteri[adet];
		for (int i = 0; i < adet; i++) {
			m[i]= new Musteri(J.musteri_id);
			J.musteri_id++;
			
		}
		return m;
	}
	public void masa(JPanel panel,JLabel lbl[]) {
		Image resim1 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
		Image resim2 = new ImageIcon(this.getClass().getResource("kırmızı.png")).getImage();
		for(int j=0;j<5; j++) {
			for (int i = 0; i < 5; i++) {
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(50+i*40, 100+j*40, 30, 30);
				lblNewLabel.setIcon(new ImageIcon(resim1));
				lbl[i+j*5]=lblNewLabel;
				panel.add(lbl[i+j*5]);
				lbl[i+j*5].setVisible(false);
				
			}
		}
	}
	
	public void garson(JPanel panel,JLabel lbl[]) {
		Image resim1 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
		Image resim2 = new ImageIcon(this.getClass().getResource("kırmızı.png")).getImage();
		for(int j=0;j<5; j++) {
			for (int i = 0; i < 5; i++) {
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(350+i*40, 100+j*40, 30, 30);
				lblNewLabel.setIcon(new ImageIcon(resim1));
				lbl[i+j*5]=lblNewLabel;
				panel.add(lbl[i+j*5]);
				lbl[i+j*5].setVisible(false);
				
			}
		}
	}
	
	public void asci(JPanel panel,JLabel lbl[]) {
		Image resim1 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
		Image resim2 = new ImageIcon(this.getClass().getResource("kırmızı.png")).getImage();
		for(int j=0;j<5; j++) {
			for (int i = 0; i < 5; i++) {
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(650+i*40, 100+j*40, 30, 30);
				lblNewLabel.setIcon(new ImageIcon(resim1));
				lbl[i+j*5]=lblNewLabel;
				panel.add(lbl[i+j*5]);
				lbl[i+j*5].setVisible(false);
				
			}
		}
	}
	
	public void musteri(JPanel panel,JLabel lbl[]) {
		Image resim1 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
		Image resim2 = new ImageIcon(this.getClass().getResource("kırmızı.png")).getImage();
		for(int j=0;j<5; j++) {
			for (int i = 0; i < 5; i++) {
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(50+i*40, 320+j*40, 30, 30);
				lblNewLabel.setIcon(new ImageIcon(resim1));
				lbl[i+j*5]=lblNewLabel;
				panel.add(lbl[i+j*5]);
				lbl[i+j*5].setVisible(false);
				
			}
		}
	}
}
