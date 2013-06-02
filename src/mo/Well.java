package mo;

import java.util.Stack;

/**
 * 
 * @author elmasry
 * 
 * Omega 2013
 * A well consists of rings with different diameters. we throw disks into the well. 
 * a disk keeps falling down until it meets the ground, another disk, or a ring whose diameter is smaller than the disk 
 *
 */
public class Well {

	public int solution(int[] A, int[] B) {

		if (A.length > 200000 || B.length > 200000 || A.length == 0
				|| B.length == 0) {
			return 0;
		}

		Stack<Integer> wellQueue = new Stack<Integer>();
		int smallestValue = A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] < smallestValue) {
				smallestValue = A[i];
			}
			wellQueue.push(smallestValue);
		}
		int numAddedDisks = 0;
		for (int i = 0; i < B.length; i++) {
			while (!wellQueue.empty()) {
				if (wellQueue.peek() >= B[i]) {
					wellQueue.pop();
					numAddedDisks++;
					break;
				} else {
					wellQueue.pop();
				}
			}
		}
		return numAddedDisks;
	}

}
