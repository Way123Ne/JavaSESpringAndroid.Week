package com.wayne.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.wayne.beanlife.PersonService;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/collection/beans.xml");
		Department department = (Department) ac.getBean("department");
		System.out.println(department.getName());

		System.out.println("*********通过String[]数组取出数据**********");
		for (String empName : department.getEmpName()) {
			System.out.println(empName);
		}

		System.out.println("*********通过List集合取出数据**********");
		for (Employee employee : department.getEmpList()) {
			System.out.println("name=" + employee.getName());
		}

		System.out.println("*********通过Set集合取出数据***********");
		for (Employee employee : department.getEmpSets()) {
			System.out.println("name=" + employee.getName());
		}

		System.out.println("*********通过Map集合取出数据  迭代器***********");
		Map<String, Employee> empMaps = department.getEmpMaps();
		Iterator it = empMaps.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Employee emp = empMaps.get(key);
			System.out.println("key=" + key + "" + emp.getName());
		}

		System.out.println("*********通过Map集合取出数据  for高级用法--> 简洁操作***********");
		for (Entry<String, Employee> entry1 : department.getEmpMaps().entrySet()) {
			System.out.println(entry1.getKey() + "" + entry1.getValue().getName());
		}

		//Properties类继承了Map接口,所以Properties<K,V>
		System.out.println("*********通过Properties集合取出数据 ***********");
		Properties pp = department.getPp();
		// System.out.println(pp.get("pp1").toString());
		for (Entry<Object, Object> entry : pp.entrySet()) {
	
			System.out.println(entry.getKey().toString() + "" + entry.getValue().toString());
		}
		
		
		System.out.println("*********通过Enumeration枚举取出数据 ***********");
		Enumeration en = pp.keys();
		while(en.hasMoreElements()){
			// Entry<Object,Object> elment = (Entry<Object, Object>)
			// en.nextElement();
			// System.out.println(elment.getKey()+""+elment.getValue());
			String key=(String) en.nextElement();
			
			System.out.println(key+""+pp.getProperty(key));
		}
	}
}
