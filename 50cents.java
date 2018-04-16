public class GumballMachine50cents extends GumballMachine{

	private int number_of_quarters;
	
	public GumballMachine50cents(int size) {
		super(size);
		this.number_of_quarters = 0;
	}
	
    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.number_of_quarters++ ;
    }
    
    public void turnCrank()
    {
    	if ( this.number_of_quarters >= 2 )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.number_of_quarters -= 2;
    			System.out.println( "Thanks for your 2 quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert 2 quarters" ) ;
    	}        
    }

}
