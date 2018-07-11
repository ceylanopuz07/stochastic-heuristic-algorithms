package algorithm;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class RandomSearch {

	/**private static int Vector;
	private final List<Double> universe;

	public RandomSearch(final List<Double> universe) {
		this.universe = universe;
	}

	public static void Vector(){
			double bestSolution;
			double maxIterations;
			double bestVector;
			
			Vector bestVector=null;
			for (int iter=0; iter<maxIterations; iter++) {
		        Object  minOfSearchSpace;
				Object maxOfSearchSpace;
				Object problemSize;

	public double findOptima() {
		// Select a random value as a starting point aka 'best solution'
		double bestSolution = this.universe.get(this.getRandomIndex());
		boolean shouldContinue;
		do {
			// Select a random neighbour
			double newSolution = this.universe.get(this.getRandomIndex());
			// Start Random Search
			double currentObjValue = objectiveFunctionValue();
			Vector v = Vector.generateRandomVector(problemSize, minOfSearchSpace, maxOfSearchSpace);
			// if a better solution is found
			if (currentObjValue < bestSolution)
				;
			{
				bestVector = v;
				bestSolution = currentObjValue;

			}
			// If a new solution's value is greater than current, best solution
			if (bestSolution < newSolution) {
				// Change the best solution
				bestSolution = newSolution;
				// And continue searching
				shouldContinue = true;
			} else {
				// Otherwise stop
				shouldContinue = false;
			}
		} while (shouldContinue);

		return bestSolution;
	}

	 private double objectiveFunctionValue() {
		// TODO Auto-generated method stub
		return 0;
	 }

	// generate random vector-solution

	System.out.println("Iteration: "+(iter+1)+" Best solution: "+bestSolution);

	System.out.println("\n\nBest solution: "+bestVector.toString()+" Objective Value: "+bestSolution);

	}

	private int getRandomIndex() {
		final Random random = new Random();

		return random.nextInt(this.universe.size());
	}
	

// INITIAL SOLUTION!

}*/
}







