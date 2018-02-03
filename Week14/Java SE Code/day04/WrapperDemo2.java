public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *该包装对象主要用于基本类型和字符串之间的转换
		 *
		 *基本数据类型--->字符串
		 *	1>基本类型数值+""
		 *	2>用String类中的静态方法valueOf(基本类型数据);
		 *		
		 *字符串--->基本类型
		 *	1>使用包装类中的静态方法 xxx parseXxx("xxx类型的字符串");
		 *			int parseInt("intstring");
		 *			long parseLong("longstring");
		 *			boolean parseBoolean("booleanstring");
		 *			只有Character没有parse方法
		 *
		 *整数具备不同的进制体现
		 *
		 *十进制---〉其他进制
		 *		toBinaryString
		 *		toOctalString
		 *		toHexString
		 *
		 *其他进制--〉十进制
		 *		parseInt("string",radix)
		 *
		 */
		
		//int num = 4;
		//Integer i = new Integer(5);
		
		//int x = Integer.parseInt("123");
		//System.out.println(x);
		//System.out.println(Integer.parseInt("125") + 1);	
		
		//十进制---〉其他进制
		 System.out.println(Integer.toBinaryString(52));
		 System.out.println(Integer.toOctalString(52));
		 System.out.println(Integer.toHexString(52));
		 
		// System.out.println(Integer.toString(60,16));
		// 其他进制———〉十进制
		 System.out.println(Integer.parseInt("3c",16));
		 
	}

}
