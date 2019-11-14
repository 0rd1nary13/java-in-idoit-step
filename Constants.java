/*
	A progream to demonstrate constant variables.
*/
class Constants
{
	public static void main( String args[] )
	{
		//Constant score values.
		final int TOUCHDOWN = 6 ;
		final int CONVERSION = 1 ;
		final int FIRLDGOAL = 3 ;
		//Caluate poiints scored.
		int td , pat , fg , total ;
		td = 4 * TOUCHDOWN ;		//4*6=24
		pat = 3 * CONVERSION ;		//3*1=3
		fg = 2 *  FIRLDGOAL ;		//2*3=6	
		total = (td + pat + fg ) ;		//total=33
		//Output calculated total
		System.out.println( "Score: " + total ) ;
	}
}
		