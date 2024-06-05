package com.validation;

import com.custom_exception.PollutionLevelExceededException;
import com.enum_classes.Color;

public class ValidationRules {

//	public static 
	public static void checkpollutionLevel(double level) throws PollutionLevelExceededException {

		if (level >= 20) {
			throw new PollutionLevelExceededException("Your vehicle pollution level exceeded");
		}
	}

	public static Color findByName(String name) {
		for (Color color : Color.values()) {
			if (color.name().equalsIgnoreCase(name)) {
				return color;
			}
		}
		return null;
	}

}
