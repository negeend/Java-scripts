public class Count {
	
	public static int count(int[] array, int element) {
		int result = 0;
		int i = 0;
		while(i <= array.length - 1) {
			if(array[i] == element) {
				result += 1;
			}
			i += 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {};
		int result = count(array, 1);
		System.out.println(result);
		
	}
	
}