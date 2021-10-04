package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for(int tall : rad) {
				System.out.println(tall);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = "";
		
		for (int[] rad : matrise) {
			for(int tall : rad) {
				str += tall+ " ";
			}
			str += "\n";
		}
		return str;
		
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int multiplisert [][] = new int [matrise.length][matrise[0].length];
		int radIndex = 0;
		for (int[] rad : matrise) {
		int tallIndex=0;
			for(int tallIMatrise : rad) {
				multiplisert[radIndex][tallIndex] = tallIMatrise*tall;
				tallIndex++;
			}
		radIndex++;
		}
		return multiplisert;
		
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean like = true;
		int radIndex = 0;
		for (int[] rad : a) {
		int tallIndex=0;
			for(int tallIMatrise : rad) {
				if (tallIMatrise != b[radIndex][tallIndex]) {
					like = false;
				}
				tallIndex++;
			}
		radIndex++;
		}
		return like;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
