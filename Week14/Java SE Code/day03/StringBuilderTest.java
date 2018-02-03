public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2, 4, 5, 34, 67, 2 };
		String s = arrayToString_2(arr);
		
		System.out.println(s);
	}

	/**
	 *将一个int数组变成字符串
	 */
	
	public static String arrayToString_2(int[] arr) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) 
				sb.append(arr[i]+",");
			else 
				sb.append(arr[i]+"]");
		}
		return sb.toString();
	
	}

	/**
	 *将一个int数组变成字符串
	 */
	
	public static String arrayToString(int[] arr) {
		// TODO Auto-generated method stub
		
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) 
				str+=arr[i]+",";
			else 
				str+=arr[i]+"]";
		}
		return str;
	}

}
