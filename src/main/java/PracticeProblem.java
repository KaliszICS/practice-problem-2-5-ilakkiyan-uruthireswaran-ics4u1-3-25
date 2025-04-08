public class PracticeProblem {

	public static void insertionSort(char[] characters) {
		for (int i = 0; i < characters.length; i++) {
			char key = characters[i];
			int j = i - 1;
			while (j >= 0 && characters[j] > key) {
				characters[j + 1] = characters[j];
				j--;
			}
			characters[j + 1] = key;
		}
	}

	public static void main(String args[]) {
		char[] letters = {'a', 'D', 'v', 'V', 'g'};
		insertionSort(letters);
		for (char c : letters) {
			System.out.println(c + " ");
		}
		}
		
		
	}



