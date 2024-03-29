import javax.swing.JLabel;

public class destek implements Runnable{
	public static JLabel masalar[];
	Boolean boolean1=false;
	int i;
	@Override
	public void run() {
		while(true) {
			try {
				J.j1.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(i=0; i<J.masa; i++) {
				if(masalar[i].getName()=="yemekte") {
					boolean1=true;
					masalar[i].setName("ddss");
					
					
					break;
				}
			}
			J.j1.release();
			if(boolean1) {
				try {
					Thread.sleep(J.S_yeme);
					masalar[i].setName("yedi");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
	}

}
