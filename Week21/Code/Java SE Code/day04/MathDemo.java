package wayne.c3.otherapi.system;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Math:提供了操作数学运算的方法。都是静态的
		 * 
		 * 常用的方法：
		 *  ceil():返回大于参数的最小整数 
		 *  floor():返回小于参数的最小整数 
		 *  round():返回四舍五入的整数
		 *  pow(a,b):a的b次方
		 *  random():返回一个大于等于0且小于小于1的整数，伪随机分配
		 *  nextDouble():等价于random()
		 */
		double d1 = Math.ceil(13.56);
		double d2 = Math.floor(13.56);
		double d3 = Math.round(13.56);

		// sop("d1="+d1);
		// sop("d2="+d2);
		// sop("d3="+d3);

		// double d = Math.pow(10, 3);
		// sop("d="+d);

		Random r = new Random();
		for (int i = 0; i < 10; i++) {

			// double d = Math.floor(Math.random() * 10);
			// double d = Math.ceil(Math.random() * 10);

			// double d = (int)(Math.random() * 10 + 1);
			// double d = (int) (r.nextDouble() * 10 + 1);
			int d = r.nextInt() * 10 + 1;

			System.out.println(d);
		}
	}

	public static void sop(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
