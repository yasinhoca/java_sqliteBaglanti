package sqlbaglanti;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TimerTask;
import java.util.Timer;

public class sett {

	static int sayac = 10;
	public static void main(String[] args){
		Timer myTimer = new Timer();
		TimerTask gorev1= new TimerTask(){
			@Override public void run() {
				System.out.print("G1 -");
				sayac++;
				if(sayac==25) myTimer.cancel();
			}
		};
		myTimer.schedule(gorev1,0,300);
		TimerTask gorev2 = new TimerTask(){
			@Override public void run() {
				System.out.print("G2 -");
				sayac+=3;
			}
		};
		myTimer.schedule(gorev2, 100, 1000);}
}


