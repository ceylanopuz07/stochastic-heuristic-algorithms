package dejong;

import java.util.ArrayList;
import java.util.List;

public class Schwefel {

	public final double startingPoint;
	private final double endingPoint;
	private final static double interval = 0.01;
	private static double sum = 0;

	public Schwefel(final int startingPoint, final double endingPoint) {
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
	}

	public List<Double> getUniverse() {
		final List<Double> universe = new ArrayList<>();
		double counter = startingPoint + interval;
		while (counter < endingPoint) {
			final double nextCounter = counter + interval;
			for (int i = 0; i < universe.size(); i++) {
				sum += (-nextCounter * Math.sin(Math.sqrt(Math.abs(counter))));
			}
			universe.add((418.9829 * universe.size()) - sum);
			counter += interval;
		}

		return universe;
	}

}
