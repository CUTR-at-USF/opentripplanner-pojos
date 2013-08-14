package org.opentripplanner.routing.patch;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class AlertHeaderText implements Serializable{

	private static final long serialVersionUID = -2726255462265642201L;
	@Getter @Setter private Translations translations;
	@Getter @Setter private String someTranslation;
	
	public AlertHeaderText() {
		// TODO Auto-generated constructor stub
	}
}
