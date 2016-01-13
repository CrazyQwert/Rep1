package vorfuehrAufgabe7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PolygonManagement2 {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( 
				new InputStreamReader(System.in));
		int amtPoints;
		Polygon polygon = new Polygon();

		System.out.println("How many points has your polygon?");
		amtPoints = Integer.parseInt(tempinput.readLine());
		
		for (int i = 0; i < amtPoints; i++) {
			
			
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
