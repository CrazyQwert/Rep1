package vorfuehrAufgabe7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PolygonManagement2 {
	

	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( 
				new InputStreamReader(System.in));
		int amtPoints;
		Polygon polygon = new Polygon();
		char alphabet = 'A';
		
		System.out.println("What is the name of your polygon?");
		polygon.name = tempinput.readLine();
		
		System.out.println("How many points has your polygon?");
		amtPoints = Integer.parseInt(tempinput.readLine());
		polygon.points = new Point[amtPoints];
		
		
		if (amtPoints > 2) {
			for (int i = 0; i < amtPoints; i++) {
				polygon.points[i] = new Point();
				polygon.points[i].name = alphabet;

				System.out.println("Please enter a X coordinate for point " + alphabet + " within your polygon:");
				polygon.points[i].x = Integer.parseInt(tempinput.readLine());

				System.out.println("Please enter a Y coordinate for point " + alphabet + " within your polygon:");
				polygon.points[i].y = Integer.parseInt(tempinput.readLine());

				alphabet++;
			}
			System.out.println();
			System.out.print("The circumference of your polgon \"" + polygon.name + "\" is: ");
			System.out.println(calcCircumference(polygon));
		} else {
			System.out.println("You need at least 3 points so that a circumference can be calculated!");
		}
		
	}
	
	static double calcDistance(Point a, Point b) {
		double distance = Math.sqrt(Math.pow((b.x - a.x), 2) 
				+ Math.pow((b.y - a.y), 2));
		return distance;
	}

	static double calcCircumference(Polygon polygon) {
		double circumference = 0;
		for (int i = 0; i < polygon.points.length; i++) {
			int x = i + 1;
			if (x >= polygon.points.length) {
				x = 0;
			}
			circumference = circumference + calcDistance(polygon.points[i], polygon.points[x]);
		}
		return circumference;
	}
}
