package vorfuehrAufgabe7;

public class PolygonManagement1 {
	
	public static void main(String[] args) {
		
		Point g = new Point();
		Point h = new Point();
		Point i = new Point();
		Polygon triangle1 = new Polygon();
		
		g.name = 'G';
		g.x = 1;
		g.y = 1;
		
		h.name = 'H';
		h.x = 2;
		h.y = 3;
		
		i.name = 'I';
		i.x = 3;
		i.y = 0;
		
		triangle1.name = "triangle1";
		triangle1.points = new Point[] {g, h, i};
				
		
		System.out.println(calcDistance(g, h));
		System.out.println(calcCircumference(triangle1));
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
