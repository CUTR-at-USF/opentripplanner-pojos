package org.opentripplanner.routing.patch;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class Entry implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2026335084427623584L;

	@Getter @Setter private String key = null;
	
	@Getter @Setter private String value = null;
	   	
	public Entry(String key, String value){
		this.key = key;
		this.value = key;
	}
	
	public Entry(){
	}
	
	public Entry(String value){
		this.value = value;
	}    	    	
}