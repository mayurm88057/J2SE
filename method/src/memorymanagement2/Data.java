package memorymanagement2;

public class Data {
static  int z= 100;
	int x=300;
static {
	System.out.println("Inside static block z ="+z);
}
{
System.out.println("Inside the non static block");
System.out.println(z);
System.out.println(x);
m1();
m2();
}
void m1() {
 System.out.println("non static m1");
}

static void m2() {
	System.out.println("static m2");
}
}