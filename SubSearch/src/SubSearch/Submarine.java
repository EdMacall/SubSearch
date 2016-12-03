package SubSearch;

public class Submarine {
  // The submarine class needs to have a method to answer
  // which submarine was hit by a depth charge
  // The submarine class needs to have a method to tell
  // if there are any left
	
	// location 0 is unplaced
	
  private int x;
  private int y;
  private int location;
  private int depth;
  private boolean sunk;
  
  public Submarine()
  {
    this.location = 0;
    this.depth = 0;
    this.sunk = false;
  }

  public int getLocation()
  {
	return location;
  }

  public void setLocation(int location)
  {
	this.location = location;
  }

  public int getDepth()
  {
	return depth;
  }

  public void setDepth(int depth)
  {
	this.depth = depth;
  }
  
  public boolean isSunk()
  {
    return sunk;
  }
  
  public int dropDepthCharge(int location, int depth)
  {
	if(location == this.location && depth == this.depth)
	{
      this.sunk = true;
      return 1;
	}
	if((depth == this.depth) &&
       ((location == this.location + 1) || (location == this.location - 1)  ||
        (location == this.location + 6) || (location == this.location - 6)) ||
       (location == this.location) &&
       ((depth == this.depth + 100) || (depth == this.depth - 100)))
	{
      return 2;
	}
    return 3;
  }
}
