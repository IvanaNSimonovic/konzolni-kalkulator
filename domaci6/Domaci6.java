package domaci6;

import java.util.Scanner;

public class Domaci6 {
	
	public static double sabiranje(double a, double b) {
		double zbir=a+b;
		return zbir;
	}
	public static double oduzimanje(double a, double b) {
		double razlika=a-b;
		return razlika;
	}
	public static double mnozenje(double a,double b) {
		double proizvod=a*b;
		return proizvod;
	}
	public static double deljenje(double a, double b) {
		double kolicnik=a/b;
		return kolicnik;
	}
	public static double stepenovanje(double a,double b) {
		double step=1;
	    for(int i=0;i<b;i++) {
	    	step*=a;
	      }
	    return step;
	}
	public static double faktorijel(double a) {
		double fakt=1;
		for(int i=1;i<=a;i++) {
			fakt*=i;
		}
		return fakt;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double rezultat=0;
		double a=0;
		System.out.println("trenutna vrednost "+a);
		System.out.println("komanda [arg]: ");
		int komanda=sc.nextInt();
		double b=sc.nextDouble();
		
		while (komanda!=-1) {
		
		if (komanda==1)rezultat=sabiranje(a, b);
		else if (komanda==2)rezultat=oduzimanje(a,b);
		else if (komanda==3)rezultat=mnozenje(a,b);
		else if (komanda==4)rezultat=deljenje(a,b);
		else if (komanda==5)rezultat=stepenovanje(a,b);
		else if (komanda==6)rezultat=faktorijel(b);
		else if (komanda==0)rezultat=0;
		else if (komanda==99)System.out.println("lista");
        a=rezultat;
        System.out.println("trenutna vrednost "+a);
		System.out.println("komanda [arg]: ");
		komanda=sc.nextInt();
	    b=sc.nextDouble();
	    }

	}
}