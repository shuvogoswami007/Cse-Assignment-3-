class Phone{
//	int ram, internal_store;
	String processor,ram, internal_store;
	Phone(){
		
}
Phone(String ram, String internal_store){
	this.ram=ram;
	this.internal_store=internal_store;
	}
	Phone(String ram, String internal_store, String processor){
			this.ram=ram;
        	this.internal_store=internal_store;
	         this.processor=processor;
	}
	void display(){
		System.out.println("RAM of the phone: "+ram);
			System.out.println("Internal storeage of the phone: "+internal_store);
   	System.out.println("Processor of the phone: "+processor);
   	System.out.println("\n");
}
}

public class task01 {
	public static void main(String[] args) {
		Phone P1= new Phone();
		P1.display();
		
		Phone P2= new Phone("4GiB", "128GB");
		P2.display();
		
		Phone P3= new Phone("6GB", "258GB"," MediaTek Helio G95 ");
		P3.display();
		
	}
}