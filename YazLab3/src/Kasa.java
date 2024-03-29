import java.awt.Image;import java.awt.font.ImageGraphicAttribute;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Kasa implements Runnable {
	Image resim1 = new ImageIcon(this.getClass().getResource("kasa.png")).getImage();
	Image resim2 = new ImageIcon(this.getClass().getResource("yeşil.png")).getImage();
	public int id;
	public static JLabel masalar[];
	int i;
	Boolean b;
	public Kasa(int id) {
		this.id=id;
	}
    public void run() {
    	while(true) {
    		try {
				J.k1.acquire();
				Thread.sleep(200);
				b=false;
				for (i = 0; i < J.masa; i++) {
	        		if(masalar[i].getName()=="yedi") {
	        			b=true;
	        			masalar[i].setName("kasa");
	        			masalar[i].setIcon(new ImageIcon(resim1));
	        			break;
	        		}
	        	}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		J.k1.release();
    		
    		try {
    			if(b==true) {
				Thread.sleep(J.S_odeme);
				masalar[i].setIcon(new ImageIcon(resim2));
				masalar[i].setName(null);
				J.s2.release();
				try {
					if(J.list4.contains(i)) {
						J.yaz.write(i+J.dizi4[i]*J.masa+".Müşteri Ödemesini Yapıp Masadan Ayrılıyor...\n");
						J.dizi4[i]++;
					}
					else {
						J.yaz.write(i+".Müşteri Ödemesini Yapıp Masadan Ayrılıyor...\n");
						J.dizi4[i]=1;
					}
					
					J.list4.add(i);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
					
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
