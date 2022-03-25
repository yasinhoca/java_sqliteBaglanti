package sqlbaglanti;

import java.util.ArrayList;

public class gb {
	
	static boolean asalMi(int s) {
		int bolenSayac=0;

		if(s>1) {
			for(int i=2;i<s;i++) {
				if(s%i==0) bolenSayac++;
			}

			if(bolenSayac==0) return true;
			else return false;
		} else return false;

	}
	
	static ArrayList<Integer> asalListe(int sayi){
		ArrayList<Integer> liste = new ArrayList<>();
		
		for(int i=2;i<sayi;i++) {
			if(asalMi(i)) liste.add(i);
		}
				
		return liste;
		
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> asallar = asalListe(44);
		System.out.println(asallar);
		
		int i,j;
		
		for(i=0;i<asallar.size();i++) {
			for(j=0;j<asallar.size();j++) {
				if(asallar.get(i)+asallar.get(j)==44) System.out.println(asallar.get(i)+" + "+asallar.get(j));
			}
		}
		
	}

}
