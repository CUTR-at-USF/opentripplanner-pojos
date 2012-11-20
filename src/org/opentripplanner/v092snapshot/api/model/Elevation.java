package org.opentripplanner.v092snapshot.api.model;

import java.util.ArrayList;
import java.util.List;

import org.opentripplanner.v092snapshot.common.model.P2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Elevation {

	@Getter	@Setter	double first;

	@Getter	@Setter	double second;

	@Getter	@Setter	List<P2<Double>> elevation = new ArrayList<P2<Double>>();

	public Elevation(String data) {
		String[] values = data.split(",");

		for (int i = 0; i < values.length; i += 2) {
			P2<Double> value = new P2<Double>(Double.parseDouble(values[i]),
					Double.parseDouble(values[i + 1]));
			elevation.add(value);
		}
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		for (P2<Double> pair : elevation) {
			str.append(Math.round(pair.getFirst()));
			str.append(",");
			str.append(Math.round(pair.getSecond() * 10.0) / 10.0);
			str.append(",");
		}
		if (str.length() > 0)
			str.setLength(str.length() - 1);
		return str.toString();
	}

}
