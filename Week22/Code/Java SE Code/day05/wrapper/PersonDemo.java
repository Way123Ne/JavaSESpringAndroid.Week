package wayne.c5.wrapper;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		p.chifan();
		
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2();
		p2.chifan();
	}

}

class Person{
	void chifan(){
		System.out.println("chifan");
	}
}

//这个类的出现是为了增强Person类而出现代的
class NewPerson{
	private Person p;
	NewPerson(Person p){
		this.p = p;
	}
	
	public void chifan(){
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
	}
}

class NewPerson2 extends Person{
	public void chifan(){
		System.out.println("开胃酒");
		super.chifan();
		System.out.println("甜点");
	}
}
