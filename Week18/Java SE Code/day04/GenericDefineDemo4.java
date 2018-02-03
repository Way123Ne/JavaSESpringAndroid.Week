public class GenericDefineDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool<String> tool = new Tool<String>();
		tool.show("abc");
		tool.show(new Integer(4));
		tool.print("xixixi");
	//	tool.print(new Integer(5));
		
		tool.method("hahaha");
		tool.method(new Integer(8));
		
	}

}
