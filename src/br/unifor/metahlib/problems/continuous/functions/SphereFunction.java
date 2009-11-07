package br.unifor.metahlib.problems.continuous.functions;

import br.unifor.metahlib.problems.continuous.OptimizableFunction;

public class SphereFunction extends OptimizableFunction {

	/**
	 * Class constructor.
	 */
	public SphereFunction(){
		super(30/*dimensions*/);
		setAllRanges(-100, 100);
		optimalResult = 0.0;
		optimizationType = OptimizationType.MINIMIZATION;
	}
	
	/**
	 * Executes the function.
	 */
	@Override
	public double eval(Object[] values) {
		double sum = 0;
		for(int i = 0; i < values.length; i++){
			sum+= Math.pow((Double)values[i], 2);
		}

		return sum;
	}
}
