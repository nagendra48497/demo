package capgemini.com;

public class Child extends Parent {

	int cid = 99;
	public Child() {
		super();
		System.out.println("Child().......");
	}
	void books() {
		System.out.println("Engineering books");
		
	}
	
	
public static void main(String[] args) {
	
	Object obj = new Object();
	
	System.out.println(obj.toString());
	Parent p = new Parent();
	System.out.println(p.pid);
	p.bike();
	System.out.println(p.toString());
	Child c = new Child();
	
	c.books();
	c.bike();
	System.out.println(c.toString());
	
	
}

	


	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	