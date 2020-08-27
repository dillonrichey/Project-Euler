import java.util.ArrayList;

/*
 * If p is the perimeter of a right angle triangle with integral length 
 * sides, {a,b,c}, there are exactly three solutions for p = 120.
 * 	
 * 	{20,48,52}, {24,45,51}, {30,40,50}
 * 
 * For which value of p ≤ 1000, is the number of solutions maximised?
 */

public class IntegerRightTriangles {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		int numSolutions;
		int greatestSolutions = 0;
		int greatestValue = 0;

		for (int i = 1; i < 1000; i++) {
			ArrayList<int[]> values = sides(i);
		numSolutions = values.size();
		if (numSolutions > greatestSolutions) {
			greatestSolutions = numSolutions;
			greatestValue = i;
		}
		if (values.size() > 0) {
			System.out.print("Values for " + i + ": ");

			for (int j = 0; j < values.size(); j++) {
				int[] tmp = values.get(j);
				for (int k = 0; k < tmp.length; k++) {
					if (k == 0) {
						System.out.print("{");
					} else if (k == tmp.length - 1) {
						if (j < values.size() - 1) {
							System.out.print(tmp[k] + "}, ");
						} else {
							System.out.print(tmp[k] + "} \n");
						}

					} else {
						System.out.print(tmp[k] + ", ");
					}
				}
			}
		}
		}

		System.out.println("The number for which solutions are maximised is " + greatestValue + ", for which there are " + greatestSolutions + " solutions.");
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Program run time: " + time);

	}

	public static ArrayList<int[]> sides(int perimeter) {

		ArrayList<int[]> sideList = new ArrayList<>();
		ArrayList<Integer> checkList = new ArrayList<>();
		int sideA, sideB, sideC;

		for (int i = 1; i < perimeter; i++) {
			sideA = i;
			for (int j = 1; j < (perimeter - sideA); j++) {
				sideB = j;
				sideC = perimeter - (sideA + sideB);

				// check if the side lengths fit Pythagorean's theorem
				if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {

					// check to see if the length of sideA has already been used to avoid duplicate
					// factors
					if (checkList.contains(sideA)) {
						int index = checkList.indexOf(sideA);

						// if sideA is a factor stored at index 0, check if either sideA or sideB are
						// stored at index 1
						if (index == 0) {
							if (checkList.get(index + 1) != sideB && checkList.get(index + 1) != sideC) {
								int[] tmp = new int[4];
								tmp[0] = perimeter;
								tmp[1] = sideA;
								tmp[2] = sideB;
								tmp[3] = sideC;
								sideList.add(tmp);
								checkList.add(sideA);
								checkList.add(sideB);
								checkList.add(sideC);
							}
						} else {
							// check if the numbers stored on either side of sideA are the value for sideB
							// if not, add factors to sideList and checkList so they can be checked for
							// later
							if ((checkList.get(index - 1) != sideB) && checkList.get(index + 1) != sideB) {
								int[] tmp = new int[4];
								tmp[0] = perimeter;
								tmp[1] = sideA;
								tmp[2] = sideB;
								tmp[3] = sideC;
								sideList.add(tmp);
								checkList.add(sideA);
								checkList.add(sideB);
								checkList.add(sideC);

							}

						}
					} else {
						// if sideA has not been used before, add all sides to sideList and checkList
						int[] tmp = new int[4];
						tmp[0] = perimeter;
						tmp[1] = sideA;
						tmp[2] = sideB;
						tmp[3] = sideC;
						sideList.add(tmp);
						checkList.add(sideA);
						checkList.add(sideB);
						checkList.add(sideC);
					}

				}
			}
		}

		return sideList;

	}

}
