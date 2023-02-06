/**
 * @author N'ZO LAGOU
 * 
 * 
 * 
 * /**
 *  Exercice 2 : Décalage Horaire
 *
 * Instructions
 * Pour cette question, vous devrez demander à l'utilisateur le décalage horaire entre son domicile
 * et l'endroit où il se rend.
 *
 * Si le fuseau horaire de destination est « derrière » le fuseau horaire du domicile de l'utilisateur,
 * celui-ci doit entrer un nombre négatif.
 *
 * Par exemple, le décalage horaire entre Seattle et Nairobi est de 9 heures et le décalage horaire entre
 * New York et Mexico est de -1 heure.
 *
 * Indiquez l'heure à laquelle il sera dans la destination de voyage lorsqu'il sera minuit à la maison et
 * lorsqu'il sera midi à la maison.
 * Vous pouvez les signaler dans 24 formats, où minuit correspond à 0 h 00 et midi à 12 h 00.
 */

package exerciceXP;

import java.util.Scanner;

public class DecalageHoraire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Veuillez entrer votre decallage horaire de votre position et votre destination ");


        try (Scanner horaire = new Scanner(System.in)) {
			// saisire l'heure
			int decalageHoraire = horaire.nextInt ();

			// Si le fuseau horaire de destination est « derrière » le fuseau horaire du domicile de l'utilisateur,
			// * celui-ci doit entrer un nombre négatif.
			int timeDestinationNuit = decalageHoraire < 0 ? 24 + decalageHoraire : decalageHoraire;

			//Indiquez l'heure à laquelle il sera dans la destination de voyage lorsqu'il sera minuit à la maison et
			// * lorsqu'il sera midi à la maison.
			int timeDestinationJournee = 12 + decalageHoraire ;

			System.out.println(" il sera " + timeDestinationJournee + " H est la destination de la journée à 12h au domicile "
			        + "il sera " +  timeDestinationNuit + " H à ca destination au domicile lorsqu'il sera 00h " );
		}


    }
	}


