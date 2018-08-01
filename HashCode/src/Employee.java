
public class Employee {
int id;
String name;
Employee(int id,String name)
  {
	this.id=id;
	this.name=name;
	
  }
public int hashCode()
  {
	return id;
	
  }
public String toString()
  {
	return id+","+name;
  }
public boolean equals(Object obj)
  {
	return this.hashCode()==obj.hashCode();
  }

}
