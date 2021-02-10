public class Contains {
	
	public static boolean contains(int[] a, int element) {
		int x = 0;
		int len = a.length;
		while(x <= len - 1) {
			if(a[x] == element) {
				return true;
			} else {
				x += 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] array = {1};
		boolean result = contains(array, 5); 
		System.out.println(result);
		
	}
	
	
}