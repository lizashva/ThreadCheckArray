import java.util.ArrayList;

/**
 * <h2>Description</h2>
 * class for share array data
 * </br>methods: getter and setter for all members
 * @author liza 
 * @param array - input array
 * </br> winArray - boolean array that present the numbers to choose
 * </br> flag - true if sum if compatible
 * </br> b - number to check
 *  */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
