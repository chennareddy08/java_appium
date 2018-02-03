package InterfaceConcept;

public class develop implements Client,Book{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //create object of this class
		develop dev = new develop();
	//call those method using object.class	
		dev.balance();
		dev.Creditcard();
		dev.Transfer();
	//calling method you have created in interface
		dev.login();
		 //create object of this class	with interface
		
		//  //to call only that method present in interface
	System.out.println("------------using interface----------");
		
		Client dev1 = new develop(); //this called rRuntime Polymorphisim
    dev1.balance();
    dev1.Creditcard();
    dev1.Transfer();
  //to call only that method present in interface
    Book b = new develop();
    b.movie();
    
    //we  cannot call dev1.login() here because dev1 is reponsible for only Client Method
    
    
		
		
	}

	@Override
	public void Creditcard() {
		// TODO Auto-generated method stub
		System.out.println("credit card method is implemented");
		
	}

	@Override
	public void Transfer() {
		// TODO Auto-generated method stub
		System.out.println("Transfer method is implemented");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("balance method is implemented");
	}
	

  public void login()
  {
	  System.out.println("login is implemented");
  }

@Override
public void movie() {
	// TODO Auto-generated method stub
	System.out.println("movie is implemented");
}

@Override
public void ticket() {
	// TODO Auto-generated method stub
	System.out.println("ticket is implemented");
}
  }



