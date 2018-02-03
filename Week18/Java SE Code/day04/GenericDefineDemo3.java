import wayne.p2.bean.Student;
import wayne.p2.bean.Worker;

public class GenericDefineDemo3 {

	public static void main(String[] args) {
		Tool<Student> tool = new Tool<Student>();
		
		//tool.setObject(new Worker());
		//Tool tool = new Tool();	
		//tool.setObject(new Worker());
		//Student stu = (Student) tool.getObject();
	}

}
