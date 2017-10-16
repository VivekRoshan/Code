import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

class Employee{

	int ID;
	int marks;
	public Employee(int id,int marks) {
		// TODO Auto-generated constructor stub
		this.ID = id;
		this.marks = marks;
	}
}
class MyEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (o1.marks>o2.marks)?1:-1;
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> integers = new HashSet<Integer>();
		integers.add(2);
		integers.add(6);
		integers.add(3);
		integers.add(8);
		integers.add(12);
		integers.add(66);
		integers.add(23);
		integers.add(86);
		System.out.println(integers);
		
		int count[] = {34, 22,10,60,30,22};
	    Set<Integer> set = new HashSet<Integer>();
	    set.add(34);
	    set.add(22);
	    set.add(10);
	    set.add(60);
	    set.add(30);
	    set.add(22);
	         
	      System.out.println(set);

		
		Employee employee=new Employee(1, 90);
		Employee employee2=new Employee(2, 95);
		Employee employee3=new Employee(3, 96);
		Employee employee4=new Employee(10, 80);
		Employee employee7=new Employee(10, 81);
		Employee employee5=new Employee(6, 9);
		
		Set<Employee> employees = new HashSet<>();
		employees.add(employee7);
		employees.add(employee7);
		employees.add(employee5);
		employees.add(employee4);
		employees.add(employee3);
		employees.add(employee2);
		employees.add(employee);
		
		
		for (Employee employee6 : employees) {
			System.out.println(employee6.ID+".... "+employee6.marks);
		}
		System.out.println();
		
		
		Iterator<Employee> i = employees.iterator(); 
		while(i.hasNext())
		{
			Employee employee6 = i.next();
			System.out.println(employee6.ID+"---"+employee6.marks);
		}
		
		Set<Employee> employees2 = new TreeSet<>(new MyEmployee());
		employees2.addAll(employees);
		for (Employee employee6 : employees2) {
			System.out.println(employee6.marks+":"+employee6.ID);
		}
		
		
		
		Set<Integer> integers2 = new TreeSet<>(integers);
		System.out.println(integers2);
		List<Employee> employees3 = new ArrayList<>();
		employees3.addAll(employees);
		System.out.println(employees3);
		Collections.sort(employees3, new MyEmployee());
		System.out.println(employees3.get(4).ID);
		System.out.println(employees3.get(5).ID);
		
		List<Integer> integers3 =  new ArrayList<>();
		integers3.add(2);
		integers3.add(4);
		integers3.add(7);
		integers3.add(4);
		integers3.add(98);
		
		//Collections.sort(integers3);
		System.out.println(integers3);
		
		
		PriorityQueue<Integer> integers4 = new PriorityQueue<Integer>(Collections.reverseOrder());
		integers4.addAll(integers);
		System.out.println(integers4);
		
		Collections.reverse(integers3);
		System.out.println(integers3);
		Collections.sort(integers3);
		System.out.println(integers3);
		
		Collections.reverse(integers3);
		System.out.println(integers3);
		
	}

}
