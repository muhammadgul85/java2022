package practice.misc;

public class Leave {
	
	
	protected int s11, s12;
	public void setLeaves(int s11, int s12)
	{
		this.s11 = s11;
		this.s12 = s12;
		
	}
	
	public void getLeaves ()
	{
		System.out.println("Total Leaves taken: " + (s11 + s12));
	}
	

}
