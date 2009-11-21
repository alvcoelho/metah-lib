package br.unifor.metahlib.problems.tsp.ga;

import java.util.Random;

import br.unifor.metahlib.metaheuristics.ga.MutationOperator;
import br.unifor.metahlib.problems.tsp.neighborhood.TwoOpt;

/**
 * Implements a mutation operator using the TwoOpt algorithm.
 */
public class TwoOptMutationOperator extends MutationOperator {

	TwoOpt twoOpt;
	
	public TwoOptMutationOperator(){
		twoOpt = new TwoOpt();
	}

	@Override
	public boolean mutate(Object[] genes, double mutationProbability) {
		if (random.nextDouble() < mutationProbability){
			Object[] neighbor = twoOpt.getRandomNeighbor(genes, -1, -1).neighbor;
			for (int i = 0; i < neighbor.length; ++i){
				genes[i] = neighbor[i];
			}
			return true;
			
		} else {
			return false;
		}
	}
	
	@Override
	public void setRandom(Random random){
		super.setRandom(random);
		twoOpt.setRandom(random);
	}
}
