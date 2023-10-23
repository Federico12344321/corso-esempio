package com.main;

import com.bean.Academy;
import com.bean.Corso;

public class MainApplication {

	public static void main(String[] args) {

		/*
		 * una delle due modalità utili ad inizializzare un array
		 */
		int arrayInt[] = new int[3];
		
		arrayInt[0] = 89;
		arrayInt[1] = 22;
		arrayInt[2] = 89;
		
		for(int i = 0; i < arrayInt.length; i++) {   // i= CURSORE
			
			System.out.println(arrayInt[i]);
		}
		
		/*
		 * seconda modalità utile per inizializzare un array
		 */
		int arrayNew[] = {98, 76, 57};
		
		for(int i = 0; i < arrayNew.length; i++) {   // i= CURSORE
			
			System.out.println(arrayNew[i]);
		}
		
		/*
		 * array di reference ad oggetti
		 */
		Corso corsi[] = new Corso[3];
		corsi[0] = new Corso("248C","Java SE", "Roma");
		corsi[1] = new Corso("124X","Java EE", "Milano");
		corsi[2] = new Corso("123V","Spring", "Napoli");
		
		for(Corso corso : corsi) {   // corso è il cursore di tipo Corso. entra nel for finche trova corsi nell'array
			
			System.out.println(corso.toString());
		}
		
		/*
		 * il polimorfismo ci consente di inizializzare un array di reference dello stesso tipo!
		 * in questo caso Object che potranno poi assumere forme di oggetti differenti
		 * in quanto tutti gli oggetti sono suoi figli
		 */
		
		Object arrayCA [] = new Object [2];
		arrayCA[0] = new Corso("124F","Angular","Roma");
		arrayCA[1] = new Academy("253S","Microservizi","Formatemp","Milano");
		
		for (Object object : arrayCA) {
			System.out.println(object.toString());
		}
	}

}
