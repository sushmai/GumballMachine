

public class GumballMachineAllcoins extends GumballMachine{

	private int amount_of_coins;
	
	public GumballMachineAllcoins(int size) {
		super(size);
		this.amount_of_coins = 0;
	}
	
    public void insertQuarter(int coin)
    {
        if ( coin >= 0 )
            this.amount_of_coins+=coin ;
    }
    
    public void turnCrank()
    {
    	if ( this.amount_of_coins >= 50 )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.amount_of_coins -= 50;
    			System.out.println( "Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs! " ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert 50 cents" ) ;
    	}        
    }

}
