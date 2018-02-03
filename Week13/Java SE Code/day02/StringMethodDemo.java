public class StringMethodDemo {
	
	/**
	 * @garam args
	 */
	public static void main(String[] args)
	{
		/*按照面向对象的思想对字符串进行功能分类
  		 *"abcd"
		 *1.获取：
		 *1.1 获取字符串中字符的个数(长度).
		 *	 	int length();
		 *1.2 根据位置获取字符
		 * 		char charAt(int index);
		 *1.3 根据字符获取在字符串中的第一次出现的位置
		 *	int indexOf(int ch);
		 *	int indexOf(int ch,int fromIndex);从指定位置进行ch的查找第一次出现的位置(int->97-->ASCII->A)
		 *	int indexOf(String str);
		 *	int indexOf(String str,int fromIndex);
		 *	根据字符获取在字符串中的第一次出现的位置
		 *	int lastindexOf(int ch);
		 *	int lastindexOf(int ch,int fromIndex);从指定位置进行ch的查找第一次出现的位置
		 *	int lastindexOf(String str);
		 *	int lastindexOf(String str,int fromIndex);
		 *1.4 获取字符串中一部分字符串。也叫子串
		 *	String substring(int beginIndex, int endIndex);//包含begin,但endIndex-1(不包含end)
		 *	String substring(int beginIndex);
		 *
		 *
		 */
		
		stringMethodDemo_1();
	}

	private static void stringMethodDemo_1() {
		// TODO Auto-generated method stub
		String s = "abcdae";

		System.out.println("length:"+s.length());
		System.out.println("char:"+s.charAt(2));
	//	System.out.println("char:"+s.charAt(200));//java.lang.StringIndexOutOfBoundsException
		System.out.println("index:"+s.indexOf('k'));//-1我们可以根据-1来判断该字符串是否存在
		System.out.println("lastIndex"+s.lastIndexOf('a'));	
		
		System.out.println("substring:"+s.substring(2,5));
	}

}
