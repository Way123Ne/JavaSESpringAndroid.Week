public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * StringBuffer:就是字符串缓冲区
		 * 注意：初始化容量为16个字符
		 *     StringBuffer(int capacity);具有指定初始容量的缓存区
		 * 
		 * 作用：用于存储数据的容器
		 *
		 * 特点：
		 * 1〉长度是可变的
		 * 2〉可以存储不同类型的数据
		 * 3> 最终要转成字符串进行使用
		 * 4〉可以对字符串进行修改
		 *
		 *
		 *既然是一个容器对象，应该具备什么功能呢？
		 *1.添加：
		 *		StringBuffer append(data);
		 *2.删除：
		 *	   StringBuffer delete(start,end):包含头，不包含尾
		 *     StringBuffer deleteCharAT(int index):删除指定位置到元素
		 *3.查找：
		 *	   char charAt(index);
		 *	   int indexOf(string);
		 *	   int lastIndexOf(string);
		 *4.修改：
		 *	   StringBuffer replace(start,end,string);
		 *	   void setCharAt(index,char);
		 *	
		 *增删改查C(create)U(update)R(read)D(delete)
		 *
		 *
		*/

		bufferMethodDemo_2();
	}

	public static void bufferMethodDemo_2() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("ahgr");
		
	//	sb.delete(1,3);
	//	sb.deleteCharAt(2);
	
	//清空缓存区
	//	sb.delete(0, sb.length());
	//	sb = new StringBuffer();
		
	//	sb.replace(0, 2, "ok");
	//	sb.setCharAt(1, 'd');
		
		sb.setLength(6);
		
		System.out.println("sb:"+sb);
		System.out.println("length:"+sb.length());
	//	System.out.println(sb.reverse());
	}

	public static void bufferMethodDemo_1() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("djdy");
		
		sb.append(4);
		sb.insert(3,"hi");
		
		System.out.println(sb.toString());
	}

	public static void bufferMethodDemo(){
		//创建缓冲区对象。
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append(false);//.append("haha");
		sb.insert(1, "haha");
//		sb.append(true);
		
		System.out.println(sb);
	}
}
