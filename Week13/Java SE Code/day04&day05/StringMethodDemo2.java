public class StringMethodDemo2 {
	/**
	 * @garam args
	 */
	public static void main(String[] args)
	{
		/*按照面向对象的思想对字符串进行功能分类
  		 *
		 *2.转换。
		 *	2.1将字符串变成字符串数组(字符串的切割)
		 *		String[] split(String regex); //涉及到正则表达式
		 *	2.2将字符串变成字符数组
		 *		char[] toCharArray();
		 *	2.3将字符串变成字节数组
		 *		byte[] getBytes();
		 *	2.4将字符串中的字符转成大小写
		 *		String toUpperCase():大写
		 *		String toLowerCase():小写
		 * 	2.5将字符串中的内容进行替换
		 *		String replace(char oldch,char newch);
		 *		String replace(String s1,String s2);
		 *	2.6将字符串两端的空格去除
		 *		String trim();
		 *	2.7将字符串进行连接
		 *		String concat(string);
		 *	2.8将基本数据类型变成字符串
		 *		String valueOf();
		 *
		 *
		 */
		
		stringMethodDemo_2();
	
	}

	private static void stringMethodDemo_2() {
		// TODO Auto-generated method stub
		String s = "张三.李四.王五";
	//	System.out.println(",");
		String[] arr = s.split("\\.");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		char[] chs = s.toCharArray();	

		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		s = "ab我";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		System.out.println("bcds".toUpperCase());
		System.out.println("ADGCB".toLowerCase());
		
		String s1 = "java";
		String s2 = s1.replace('q', 'z');
		System.out.println(s1==s2);
		System.out.println("java".replace('a', 'o'));
		System.out.println("java".replace('q', 'o'));
		
		System.out.println("-"+"    ab  c    "+"-");
		System.out.println("-"+"    ab  c    ".trim()+"-");
		
		System.out.println("abc".concat("kk"));
		System.out.println("abc"+"kk");

		System.out.println(String.valueOf(4)+1);
		System.out.println(""+4+1);
			
	}

}


