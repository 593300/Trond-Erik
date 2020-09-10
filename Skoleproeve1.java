package no.hvl.dat100;

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.*;

public class Skoleproeve1 {

	public static void main(String[] args) {
		
		oppgave1();
		oppgave1b();
		oppgave1c();
		oppgave2();
		oppgave3();
		
	}
		
		//OPPGAVE 1A
		private static void oppgave1() {
			
		String TallTxt = showInputDialog("Skriv inn heltall:");
		int tall = parseInt(TallTxt);
		
		System.out.println("Du skrev inn " + tall);
		
		//mindre enn 0
		if(tall < 0) {
			System.out.print("Tallet er mindre enn 0");
			
		//lik 0
		}else if(tall == 0) {
			System.out.print("Tallet er lik 0");
			
		//større enn 0	
		}else if(tall > 0) {
			System.out.print("Tallet er større enn 0");
			
		}

	}
		
		//OPPGAVE 1B
		private static void oppgave1b() {
			String TallTxt = showInputDialog("Skriv inn heltall mellom 5 og 8: ");
			int tall = parseInt(TallTxt);
			
			
			
			//under
			if(tall<5) {
				System.out.println("Du skrev inn " + tall + ", og " + tall + " er utenfor intervallet");
			//over	
			}else if(tall>8) {
				System.out.println("Du skrev inn " + tall + ", og " + tall + " er utenfor intervallet");
			//riktig verdi
			}else {
				System.out.println("Du skrev inn " + tall + ", og " + tall + " er innenfor intervallet");

			}
			
			
		}
		
		//OPPGAVE 1C 
		private static void oppgave1c() {
			// Oppgave C
			
			String tallTxt = showInputDialog("Skriv inn heltall:");
			int tall = parseInt(tallTxt);
					
	        String tallString;
	        switch (tall) {
	            case 0:  tallString = "null";
	                     break;
	            case 1:  tallString = "en";
	                     break;
	            case 2:  tallString = "to";
	                     break;
	            case 3:  tallString = "tre";
	                     break;
	            case 4:  tallString = "fire";
	                     break;
	            default: tallString = "ulovlig verdi";
	        }
	        System.out.println(tallString);
			
			
		}
		
		//OPPGAVE 2
		private static void oppgave2() {
			// Oppgave 2
			for(int i = 2; i < 7; i++) {
				System.out.println("10/" + i + " = " +10/i);
			}
		}
		
		//OPPGAVE 3
		private static void oppgave3() {
			String TallTxt = showInputDialog("Skriv inn heltall:");
			int tall = parseInt(TallTxt);
			
			int sum = 2;
			
			if(tall == 0) {
				System.out.println(sum);
			}
		}

	
}
	



