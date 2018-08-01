import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Him");
		Employee e2 = new Employee(2,"Gol");
		Employee e3 = new Employee(3,"Ank");
		Collection c1 = new ArrayList();
		c1.add(e1);
		c1.add(e2);
		c1.add(e3);
		int s = c1.size();
		System.out.println("Size = "+s);
		Iterator it = c1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}

	}

}
