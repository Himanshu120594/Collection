
public class A {
private A()
{
	
}
static final A a = new A();
static A getObject()
{
	return a;
	
}

}
