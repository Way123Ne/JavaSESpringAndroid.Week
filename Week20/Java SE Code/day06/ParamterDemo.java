package wayne.c4.news.demo;

public class ParamterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int sum = add(4, 6);
		// System.out.println("sum=" + sum);
		// int sum1 = add(5, 7);
		// System.out.println("sum1=" + sum1);
		// int sum2 = add(4, 6, 23);
		// System.out.println("sum2=" + sum2);

		// int[] arr = { 78, 27, 80, 23, 54 };
		// int sum = add(arr);
		// System.out.println("sum=" + sum);
		// int[] arr1 = { 7, 27, 0, 33, 54 };
		// int sum1 = add(arr1);
		// System.out.println("sum1=" + sum1);

		int sum = newAdd(75, 37, 3, 63, 12);
		System.out.println("sum=" + sum);
		int sum1 = newAdd(7, 3, 3, 63, 2, 78);
		System.out.println("sum1=" + sum1);
	}

	/*
	 * 函数的可变参数 其实就是一个数组，但是接收的是数组的元素 自动将这些元素封装成数组。简化了调用者的书写
	 * 
	 * 注意：可变参数类型，必须定义在参数列表的结尾
	 * 
	 */

	public static int newAdd(int a, int... arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/*
	 * public static int add(int[] arr) { // TODO Auto-generated method stub int
	 * sum = 0; int i; for (i = 0; i < arr.length; i++) { sum += arr[i]; }
	 * return sum; }
	 */

	/*
	 * public static int add(int i, int j, int k) { // TODO Auto-generated
	 * method stub return i + j + k; }
	 */

	/*
	 * public static int add(int i, int j) { // TODO Auto-generated method stub
	 * return i + j; }
	 */

}
