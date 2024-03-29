import java.awt.Image;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.io.IOException;
import javax.swing.ImageIcon;

public class J {
	
	public static int garson = 0;
	public static int asci = 0;
	public static int masa =12;
	public static int sayac = 0;
	public static int kasa=0;
	public static int musteri_id = 0;
	public static int ab = 0;
	public static Thread thread[];
	public static Thread thread_g[];
	public static Thread thread_a[];
	public static int il = 0;
	public static Semaphore s1 = new Semaphore(1);
	public static Semaphore g1 = new Semaphore(1);
	public static Semaphore a1 = new Semaphore(1);
	public static Semaphore k1 = new Semaphore(1);
	public static Semaphore j1 = new Semaphore(1);
	public static Semaphore g2;
	public static Semaphore s2;
	public static Boolean b = true;
	public static int S_siparis=2000;
	public static int S_hazirlama=3000;
	public static int S_yeme=3000;
	public static int S_odeme=1000;
	public static int S_bekleme=20000;
	public static FileWriter yaz;
	public static int dizi[];
	public static ArrayList<Integer> list1= new ArrayList<>();
	public static int dizi1[]=new int[25];
	public static ArrayList<Integer> list2= new ArrayList<>();
	public static int dizi2[]=new int[25];
	public static ArrayList<Integer> list3= new ArrayList<>();
	public static int dizi3[]=new int[25];
	public static ArrayList<Integer> list4= new ArrayList<>();
	public static int dizi4[]=new int[25];

}
