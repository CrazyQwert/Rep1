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
		
		//if-statement to check whether a polygon has the necessary amount of points
		if (amtPoints > 2) {
			//asking for coordinates for the desired number of points
			for (int i = 0; i < amtPoints; i++) {	
				polygon.points[i] = new Point();	//creating new Point-Object
				polygon.points[i].name = alphabet;	//naming Point-Object

				//setting x-coordinate
				System.out.println("Please enter a X coordinate for point " 
						+ alphabet + " within your polygon:");
				polygon.points[i].x = Integer.parseInt(tempinput.readLine());

				//setting y-coordinate
				System.out.println("Please enter a Y coordinate for point " 
						+ alphabet + " within your polygon:");
				polygon.points[i].y = Integer.parseInt(tempinput.readLine());

				alphabet++;	//iterating over alphabet
			}
			//output circumference
			System.out.println();
			System.out.print("The circumference of your polgon \"" + polygon.name + "\" is: ");
			System.out.println(calcCircumference(polygon));
		} else {
			System.out.println("You need at least 3 points so that a"
					+ " circumference can be calculated!");
		}
		
	}
	
	
	/**
	 * calculates the distance between two points a and b within 
	 * a Cartesian coordinate system
	 * @param a	first point
	 * @param b	second point
	 * @return	distance
	 */
	static double calcDistance(Point a, Point b) {
		double distance = Math.sqrt(Math.pow((b.x - a.x), 2) 
				+ Math.pow((b.y - a.y), 2));
		return distance;
	}

	/**
	 * calculates the circumference of a polygon with a custom amount
	 * of points specified within the points-array of the polygon-class using
	 * calcDistance.
	 * @param polygon	polygon of which the circumference is to be calculated
	 * @return	circumference
	 */
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
