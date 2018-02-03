package wayne.c6.generic.define.demo;

public class GenericDefineDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	InterImpl in = new InterImpl();
	//	in.show("abc");
		
		InterImpl2<Integer> in2 = new InterImpl2<Integer>();
		in2.show(6);
	}

}

//泛型接口，将泛型定义在接口上

interface inter<T>{
	public void show(T t);
}

/*
class InterImpl implements inter<String>{
	public void show(String str){  //方法中明确具体数据类型
	System.out.println("show:" + str);
	}
}
*/

class InterImpl2<Q> implements inter<Q>{
	public void show(Q q){ //在子类中明确具体数据类型--〉InterImpl2<Integer> in2 = new InterImpl2<Integer>();
		System.out.println("show:" + q);
	}
}
