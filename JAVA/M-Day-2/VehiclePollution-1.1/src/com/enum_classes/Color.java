package com.enum_classes;

public enum Color {
//	WHITE, SILVER, BLACK, RED, BLUE

	WHITE(1, "White"), SILVER(2, "Silver"), BLACK(3, "Black"), RED(4, "Red"), BLUE(5, "Blue");

	private final int number;
	private final String value;

	Color(int number, String value) {
		this.number = number;
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public String getValue() {
		return value;
	}

//	public static Color findByName(String name) {
//		for (Color color : values()) {
//			if (color.name().equalsIgnoreCase(name)) {
//				return color;
//			}
//		}
//		return null;
//	}
}
