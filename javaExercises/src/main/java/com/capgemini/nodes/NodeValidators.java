package com.capgemini.nodes;

import java.util.List;

/**
 * Created by ldrygala on 2015-02-09.
 * <p/>
 * Write validate for
 * <ul>
 * <li>node id should have 4 characters</li> IDException
 * <li>node description can have maximal 128 characters</li> DescException
 * <li>no cycle</li> CycleException
 * <li>only penultimate can have two subsequent</li> TwoSubsequentException
 * </ul>
 */
public class NodeValidators {
	public void validateMethod(List<Node> nodes) {
		int Subsequent_c = 0;

		try {

			for (int i = 0; i < nodes.size(); i++) {

				if (nodes.get(i).getID().length() != 4)
					throw new IDException(); // 1

				if (nodes.get(i).getDescription().length() > 128)
					throw new DescException(); // 2

				for (int j = 0; j < nodes.size(); j++) {

					if (((nodes.get(i).getPredecessorId()).compareTo(nodes.get(j).getID()) == 0) && // 3
							((nodes.get(j).getPredecessorId()).compareTo(nodes.get(i).getID()) == 0))
						throw new CycleException();

					if (i != nodes.size() - 2 && nodes.get(j).getPredecessorId().compareTo(nodes.get(i).getID()) == 0) // 4
						Subsequent_c++;

					if (Subsequent_c >= 2)
						throw new TwoSubsequentException();
				}
				Subsequent_c = 0;
			}

		} catch (IDException | DescException | CycleException | TwoSubsequentException exc) {
			System.out.println(exc);
		}

	}
}
