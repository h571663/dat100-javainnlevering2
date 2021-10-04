package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int tall : tabell) {
			System.out.println(tall);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String str= "[";
		for(int i=0;i<tabell.length;i++) {
			if(i == tabell.length-1)
			str+=tabell[i];
			else
			str+=tabell[i]+",";
		}
		str += "]";
		return str;
		
	}

	// c)
	public static int summer1(int[] tabell) {

		int sum=0;
		for(int i=0;i<tabell.length;i++) {
			sum += tabell[i];
		}
		return sum;
	}
	public static int summer2(int[] tabell) {
		int i = 0;
		int sum = 0;
		while(i<tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;	
	}
	public static int summer3(int[] tabell) {

		int sum=0;
		for(int tall : tabell) {
			sum += tall;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes=false;
		
		for(int tallITabell : tabell) {
			if(tallITabell == tall)
				finnes = true;
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i=0;
		int index = -1;
		for(int tallITabell : tabell) {
			if(tallITabell == tall)
				index=i;
			else
				i++;
		}
		return index;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reverse = new int[tabell.length];
		int j = tabell.length-1;
		for(int i=0;i<tabell.length;i++) {
			reverse[j]=tabell[i];
			j--;
		}
		return reverse;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

	boolean sortert=true;
		
		for(int i= 0;i<tabell.length-1;i++) {
			if(tabell[i] > tabell[i+1])
				sortert=false;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sattSammen = new int[tabell1.length+tabell2.length];
		for(int i=0;i<tabell1.length;i++) {
			sattSammen[i]=tabell1[i];
		}
		for(int j=0;j<tabell2.length;j++) {
			sattSammen[j+tabell1.length]=tabell2[j];
		}
		return sattSammen;
	}
}
