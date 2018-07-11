import java.util.List;
import java.util.Random;

import alghoritm.HillClimbing;
import alghoritm.SimulatedAnnealing;
import algorithm.RandomSearch;
import dejong.DeJongOne;
import dejong.DeJongTwo;
import dejong.Schwefel;;

public class Main {
	private static RandomSearch[] neighborhood;
	private static RandomSearch[] nextNeighborhood;
	private static int maxRun = 30;
	private static int MaxFes = 1000;
	private static Random rnd = new Random();
	private static int neighborhoodSize = 10;

	public static void main(String[] args) {

		Random rnd1 = new Random();
		double[] runBest = new double[maxRun];

		for (int n = 0; n < maxRun; n++) {
			// neighborhood = new RandomSearch[neighborhoodSize];
			// nextNeighborhood = new RandomSearch[neighborhoodSize];

			// iteration starts
			for (int iter = 0; iter < MaxFes; iter++) {

				for (int i = 0; i < neighborhoodSize; i++) {
					neighborhood[i] = (RandomSearch) nextNeighborhood[i];
				}

				for (int i = 0; i < neighborhoodSize; i++) {

					DeJongOne deJongOne = new DeJongOne(-5.00, 5.00);
					SimulatedAnnealing simulatedAnnealing = new SimulatedAnnealing(deJongOne.getUniverse());
					HillClimbing hillClimbing = new HillClimbing(deJongOne.getUniverse());
					// RandomSearch randomSearch = new
					// RandomSearch(randomSearch.getUniverse());

					Main.runAlgorithms(simulatedAnnealing, hillClimbing); // ,
																			// randomSearch);

					DeJongTwo deJongTwo = new DeJongTwo(-5.00, 5.00);
					simulatedAnnealing = new SimulatedAnnealing(deJongTwo.getUniverse());
					hillClimbing = new HillClimbing(deJongTwo.getUniverse());
					// randomSearch = new
					// RandomSearch(randomSearch.getUniverse());

					Main.runAlgorithms(simulatedAnnealing, hillClimbing); // ,
																			// randomSearch);

					Schwefel schwefel = new Schwefel(-500, 500);
					simulatedAnnealing = new SimulatedAnnealing(schwefel.getUniverse());
					hillClimbing = new HillClimbing(schwefel.getUniverse());
					// randomSearch = new
					// RandomSearch(randomSearch.getUniverse());
					Main.runAlgorithms(simulatedAnnealing, hillClimbing); // ,
																			// randomSearch);

				}
			}
			// runBest[n]=public SimulatedAnnealing(final List<Double> universe);
			   for(int n= 0; n<maxRun; n++ ){
				   
			   }

		}

	}

	private static void runAlgorithms(final SimulatedAnnealing simulatedAnnealing, final HillClimbing hillClimbing) { // ,
																														// final
																														// RandomSearch
																														// randomSearch)
																														// {
		long startTime = System.currentTimeMillis();
		final double foundOptimaSA = simulatedAnnealing.findOptima();
		long stopTime = System.currentTimeMillis();
		System.out.println("Simulated Annealing found solution: " + foundOptimaSA);
		System.out.println("Elapsed time: " + (stopTime - startTime) + " milliseconds");

		startTime = System.currentTimeMillis();
		final double foundOptimaHC = hillClimbing.findOptima();
		stopTime = System.currentTimeMillis();
		System.out.println("Hill Climbing found solution: " + foundOptimaHC);
		System.out.println("Elapsed time: " + (stopTime - startTime) + " milliseconds");

		/**
		 * startTime = System.currentTimeMillis(); final double foundOptimaRS =
		 * randomSearch.findOptima(); stopTime = System.currentTimeMillis();
		 * System.out.println("Random Search found solution: " + foundOptimaHC);
		 * System.out.println("Elapsed time: " + (stopTime - startTime) + "
		 * milliseconds");
		 */
	}
}