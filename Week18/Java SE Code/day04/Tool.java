/*
public class Tool {

	private Object Object;

	public Object getObject() {
		return Object;
	}

	public void setObject(Object Object) {
		this.Object = Object;
	}
	
}*/

//在jdk1.5之后，使用泛型来接收类中要操作的引用数据类型
//泛型类。什么时候用？当类中的操作的引用数据类型不确定的时候，就使用泛型来表示

public class Tool<QQ>{
	private QQ qq;

	public QQ getObject() {
		return qq;
	}

	public void setObject(QQ Object) {
		this.qq = Object;
	}
	
	/*
	 * 将泛型定义在方法上
	 */
	public <W> void show(W str){  //将泛型自定义在方法上，W 代表任意引用的数据类型
		System.out.println("show:" + str);
	}
	
	public void print(QQ str){   //该泛型跟随class Tool<QQ>
		System.out.println("print:" + str);
	}
	
	/*
	 * 当方法静态时，不能访问类上定义的泛型，如果静态方法使用泛型。
	 * 只能将泛型自定义在方法上
	 * 
	 * 自定义泛型格式：修饰符  <> 返回类型
	 * 
	 */
	public static <Y> void method(Y obj){  
		System.out.println("Y:" + obj);
	}

}

