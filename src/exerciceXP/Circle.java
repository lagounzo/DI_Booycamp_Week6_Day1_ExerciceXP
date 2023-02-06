/**
 * @author N'ZO LAGOU
 * 
 * 
 *  Exercice 2 : Décalage Horaire
Instructions
Pour cette question, vous devrez demander à l'utilisateur le décalage horaire entre son domicile et l'endroit où il se rend.

Si le fuseau horaire de destination est « derrière » le fuseau horaire du domicile de l'utilisateur, celui-ci doit entrer un nombre négatif.

Par exemple, le décalage horaire entre Seattle et Nairobi est de 9 heures et le décalage horaire entre New York et Mexico est de -1 heure.

Indiquez l'heure à laquelle il sera dans la destination de voyage lorsqu'il sera minuit à la maison et lorsqu'il sera midi à la maison. Vous 
pouvez les signaler dans 24 formats, où minuit correspond à 0 h 00 et midi à 12 h 00.
 * 
 * 
 * 
 */

package exerciceXP;

public class Circle {

	 private double radius;

	    private String color;

	    public Circle() {
	    }

	    public Circle(double radius) {

	        this.radius = radius;

	    }

	    public Circle(double radius, String color) {

	        this.radius = radius;

	        this.color = color;

	    }

	    public double getRadius() {

	        return radius;

	    }

	    public void setRadius(double radius) {

	        this.radius = radius;

	    }

	    public String getColor() {

	        return color;

	    }

	    public void setColor(String color) {

	        this.color = color;

	    }

	    
	    public String toString() {

	        return "Circle [radius=" + radius + ", color=" + color + "] ";

	    }

	    public String getArea() {

	        return "Circle [radius=" + radius + ", color=" + color + "] ";

	    }

	    public static void main(String[] args) {

	        Circle circle = new Circle();

	        circle.setColor("red");

	        circle.setRadius(10.0);

	        System.out.println("Afficher le rayon et la couleur " + circle.toString());

	        System.out.println("Afficher le rayon et la couleur " + circle.getArea());

	        System.out.println("Afficher le rayon  " + circle.getRadius());

	        System.out.println("Afficher  la couleur " + circle.getColor());

	    }

}
