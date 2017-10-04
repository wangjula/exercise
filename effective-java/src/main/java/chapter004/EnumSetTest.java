package main.java.chapter004;

import java.util.EnumSet;

public class EnumSetTest {

	public static void main(String[] args) {
		EnumSet<Color> enumSet1 = EnumSet.allOf(Color.class);
		EnumSet<Color> enumSet2 = EnumSet.of(Color.GREEN, Color.ORANGE);
		System.out.println(enumSet1.containsAll(enumSet2));
	}

}

enum Color {
	RED(0),
	GREEN(1),
	ORANGE(2);
	private final int id;
	private Color(int id) {
		this.id = id;
	}
	private int getId() {
		return id;
	}
	public static Color valueOf(int id) {
		Color[] values = Color.values();
		for (Color c : values) {
			if (id == c.getId()) {
				return c;
			}
		}
		throw new RuntimeException("Color's id is illegal: " + id);
	}
}