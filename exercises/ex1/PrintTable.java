package exercise1;

class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "×" + i + "=" + i * j + " ");
			}
			System.out.print("\n");
		}

	}

}
