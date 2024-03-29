import javax.swing.JLabel;

public class Sil implements Runnable{
	public static JLabel musteriler[];
	public static JLabel masalar[];
	@Override
	public void run() {
		try {
			Thread.sleep(J.S_bekleme);
			for (int i=0; i<J.ab;i++) {
				musteriler[i].setVisible(false);
				
				
			}
			for(int i=0;i<J.masa;i++) {
				masalar[i].setToolTipText("fff");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
