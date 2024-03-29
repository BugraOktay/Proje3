import java.awt.Image;
import java.io.IOException;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Garson implements Runnable {
	
	Image resim1 = new ImageIcon(this.getClass().getResource("garson.png")).getImage();
	Image resim2 = new ImageIcon(this.getClass().getResource("saat.png")).getImage();
	public int id;
	public static JLabel masalar[];
	int i;
	public Garson(int id) {
		this.id=id;
	}
	
    public void run() {
    	while(true) {
    	
    	
    	
    	try {
			J.g1.acquire();
			Thread.sleep(200);
			
			for(i=0; i< J.masa; i++) {
	    		if(masalar[i].getName()=="dolu") {
	    			masalar[i].setIcon(new ImageIcon(resim1));
	    			masalar[i].setName("garson");
	    			
	    			try {
	    				if(J.list2.contains(i)) {
	    					J.yaz.write(id+".Garson "+(i+J.dizi2[i]*J.masa)+".Müşterinin Siparişini Alıyor...\n");
							J.yaz.write((i+J.dizi2[i]*J.masa)+".Müşteri Yemeğin Gelmesini Bekliyor....\n");
							J.dizi2[i]++;
	    				}
	    				else {
	    					J.yaz.write(id+".Garson "+i+".Müşterinin Siparişini Alıyor...\n");
							J.yaz.write(i+".Müşteri Yemeğin Gelmesini Bekliyor....\n");
							J.dizi2[i]=1;
						}
	    				J.list2.add(i);
						
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
    	
        J.g1.release();
        
        try {
			Thread.sleep(J.S_siparis);
			masalar[i].setIcon(new ImageIcon(resim2));
			
			masalar[i].setName("yemek");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }}
    
    
}
