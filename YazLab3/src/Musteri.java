import java.awt.Image;
import java.awt.desktop.ScreenSleepEvent;
import java.io.IOException;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Musteri implements Runnable {
	Image resim1 = new ImageIcon(this.getClass().getResource("kırmızı.png")).getImage();
	public int id;
	public int masa_no;
	public static JLabel masalar[];
	public static JLabel musteriler[];
	public Musteri(int id) {
		this.id = id;
		
	}
	
	
    public void run() {
    	
    	try {
    		
			J.s2.acquire();
			Thread.sleep(200);
			J.s1.acquire();
			Thread.sleep(200);
			
			for (int i=0;i<J.masa;i++) {
	        	
	        	JLabel lbl = masalar[i];
	        	if(lbl.getToolTipText()=="fff") {
	        		break;
	        	}
	        	else if(lbl.getName()=="dolu") {
					
				}
				else if(lbl.getName()==null || lbl.getName()=="bos") {
					
					lbl.setName("dolu");
					lbl.setIcon(new ImageIcon(resim1));
					
					try {
						if(J.list1.contains(i)) {
							J.yaz.write(i+J.dizi1[i]*J.masa+".Müşteri Masaya Oturdu.\n");
							J.dizi1[i]++;
						}
						else {
							J.yaz.write(i+".Müşteri Masaya Oturdu.\n");
							J.dizi1[i]=1;
						}
						
						J.list1.add(i);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					musteriler[J.il].setVisible(false);
					J.il++;
					break;
				}
				
				
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        J.s1.release();
        
        
        
    }
}
