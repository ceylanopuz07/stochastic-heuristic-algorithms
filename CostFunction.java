package algorithm;

public class CostFunction implements Cloneable {

	public double[] solutionString;
	private double objFonctionValue;

	// methods
	public double getObjFonctionValue() {
		return objFonctionValue;
	}

	public void setObjFonctionValue(double objFonctionValue) {
		this.objFonctionValue = objFonctionValue;
	}

	public double calculateObfunction() {

		double result = 0.0d;
		setObjFonctionValue(result);
		return result;
	}
}