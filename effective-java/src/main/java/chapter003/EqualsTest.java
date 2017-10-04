package main.java.chapter003;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class EqualsTest {

	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		System.out.println("p1==p2 ? " + p1.equals(p2));
		Map<Point, String> map = new HashMap<Point, String>();
		map.put(p1, "non-null");
		System.out.println("map.get(p2): " + map.get(p2));
	}
}

class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

class ColorPoint {
	private final Point point;
	private final Color color;
	public ColorPoint(Point point, Color color) {
		this.point = point;
		this.color = color;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint)) {
			return false;
		}
		ColorPoint p = (ColorPoint) o;
		return p.getPoint().getX() == getPoint().getX() && p.getPoint().getY() == getPoint().getY()
				&& p.getColor() == getColor();
	}
	public Point getPoint() {
		return point;
	}
	public Color getColor() {
		return color;
	}
}

class NamedPoint extends Point {
	public NamedPoint(int x, int y) {
		super(x, y);
	}
	public boolean equals(Object o) {
		if (null == o || o.getClass() != getClass()) {
			return false;
		}
		NamedPoint p = (NamedPoint) o;
		return p.getX() == getX() && p.getY() == getY();
	}
	public String getName() {
		return "Point" + getClass().getSimpleName();
	}	
}

//class ColorPoint extends Point {
//	private Color color;
//	public ColorPoint(int x, int y, Color color) {
//		super(x, y);
//		this.color = color;
//	}
//	@Override
//	public boolean equals(Object o) {
//		if (!(o instanceof ColorPoint)) {
//			return false;
//		}
//		ColorPoint p = (ColorPoint) o;
//		return p.getX() == getX() && p.getY() == getY() && p.getColor() == getColor();
//	}
//	public Color getColor() {
//		return color;
//	}
//	
//}