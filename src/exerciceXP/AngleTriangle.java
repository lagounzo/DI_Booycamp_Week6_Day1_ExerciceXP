/**
 * @author N'ZO LAGOU
 * 
 * Objectif : Trois angles d'un triangle

 */


/**
 * Exercice 1 : Trois Angles D'un Triangle
Instructions
Écrivez un programme Java qui demande à un utilisateur d'entrer les trois angles d'un triangle.

Si la somme des trois angles saisis est égale à 180, imprimez "C'est un triangle valide.", sinon "Ce n'est pas un triangle valide".


 */





package exerciceXP;

import java.util.Scanner;

public class AngleTriangle {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner write = new Scanner(System.in)) {
			System.out.println("Entrez l'angle 1 du triangle");

	        int angle_1 = write.nextInt();

	        System.out.println("Entrez l\'angle 2 du triangle");

	        int angle_2 = write.nextInt();

	        System.out.println("Entrez l\'angle 3 du triangle");

	        int angle_3 = write.nextInt();

	        int sum = angle_1 + angle_2 + angle_3;

	        if (sum == 180) {

	            System.out.println("It is a valid triangle");

	        } else {

	            System.out.println("It is not a valid triangle");
	        }
		}

	}

}
