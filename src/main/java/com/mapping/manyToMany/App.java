
package com.mapping.manyToMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Technology t1=new Technology();
		Technology t2=new Technology();
		Technology t3=new Technology();
		Technology t4=new Technology();

		List<Technology> list1=new ArrayList<>();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);

		
		List<Technology> list2=new ArrayList<>();
		list2.add(t2);
		list2.add(t3);
		list2.add(t4);
		
		List<Technology> list3=new ArrayList<>();
		list3.add(t1);
		list3.add(t3);
		list3.add(t4);

		List<Technology> list4=new ArrayList<>();
		list4.add(t1);
		list4.add(t2);
		
		Employees e1=new Employees(1,"Ankith","c",list1);
		Employees e2=new Employees(2,"Anand","A",list2);
		Employees e3=new Employees(3,"pavan","B",list3);
		Employees e4=new Employees(4,"nayan","D",list4);


		List<Employees> emp1=new ArrayList<>();
		emp1.add(e1);
		emp1.add(e2);

		emp1.add(e3);

		
		List<Employees> emp2=new ArrayList<>();
		emp2.add(e1);
		emp2.add(e3);
		emp2.add(e4);
		
		List<Employees> emp3=new ArrayList<>();
		emp3.add(e1);
		emp3.add(e2);


		List<Employees> emp4=new ArrayList<>();
		emp4.add(e1);
		emp4.add(e2);
		emp4.add(e4);
		
		t1.setTechId(100);
		t1.setTechName("java");
		t1.setEmpl(emp3);
		
		t2.setTechId(101);
		t2.setTechName("Python");
		t2.setEmpl(emp2);
		
		t3.setTechId(103);
		t3.setTechName("Javascript");
		t3.setEmpl(emp4);
		
		t4.setTechId(104);
		t4.setTechName("c++");
		t4.setEmpl(emp1);

		Configuration con = new Configuration();
		con.configure();

		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		s.save(t1);
		s.save(t2);
		s.save(t3);
		s.save(t4);
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);

		
tr.commit();
	}

}
