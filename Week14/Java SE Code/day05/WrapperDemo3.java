public class WrapperDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num = 4;
		//num = num + 5;

		//Integer i = 4;//i = new Integer(4);JDK1.5自动装箱，简化书写
		//i = i + 6;//i = new Integer(i.integer(i.intValue() + 6); //i.intValue() JDK1.5自动拆箱

		show(55);

		Integer a = new Integer(127);//
		Integer b = new Integer(127);

		System.out.println(a==b); //不同地址，两个不同对象，开辟不同内存空间
		System.out.println(a.equals(b));//两个相同对象127

		Integer x = 127;
		Integer y = 124;
		System.out.println(x==y);//相同地址 //jdk1.5之后，自动装箱，如果装箱的是一个字节，那么该数据会共享不会被重新开辟内存空间
		System.out.println(x.equals(y));//相同地址
	}
	public static void show(Object a){ //Object a = new Integer(55);
		System.out.println("a="+a);
	}

}
