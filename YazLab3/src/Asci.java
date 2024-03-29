import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Asci implements Runnable {
	
	Image resim1 = new ImageIcon(this.getClass().getResource("yemek.png")).getImage();
	Image resim2 = new ImageIcon(this.getClass().getResource("saat.png")).getImage();
	public int id;
	public static JLabel masalar[];
	int i;
	public Asci(int id) {
		this.id=id;
	}
	
    public void run() {
    	while(true) {
    		try {
    			
				J.a1.acquire();
				Thread.sleep(200);
				for(i=0; i<J.masa; i++) {
	    			if(masalar[i].getName()=="yemek") {
	    				
	    				masalar[i].setName("yasdas");
	    				try {
	    					if(J.list3.contains(i)) {
								J.yaz.write(i+J.dizi3[i]*J.masa+".Müşteri Yemeğini yiyor...\n");
								J.dizi3[i]++;
							}
							else {
								J.yaz.write(i+".Müşteri Yemeğini yiyor...\n");
								J.dizi3[i]=1;
							}
							
							J.list3.add(i);
	    				} catch (IOException e) {
	    					// TODO Auto-generated catch block
	    					e.printStackTrace();
	    				}
	    				break;
	    			}
	    		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		J.a1.release();
    		
    		try {
				Thread.sleep(J.S_hazirlama);
				masalar[i].setName("yemekte");
				masalar[i].setIcon(new ImageIcon(resim1));

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
}
