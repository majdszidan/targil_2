import java.util.ArrayList;

/** Description of SharedData
 *  @author Majd zidan
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	

	/** constructor
	 * @param array arrayList for integers 
	 * @param b the number we are investigating
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * @return get the value of winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**set the value of winArray
	 * @param winArray stores the numbers that included in the solution for b
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return the value of array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return the value of b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return the value of flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** set the value of flag
	 * @param flag to let the other thread know he's found solution
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
