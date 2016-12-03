package SubSearch;

public class Mine
{
	// location 0 is unplaced

  private int x;
  private int y;
  private int location;
  private boolean used;
  
  public Mine()
  {
    this.location = 0;
    this.used = false;
  }
  
  public int getLocation()
  {
	return location;
  }
  
  public boolean isShipHit(int location)
  {
    if(!this.used && location == this.location)
    {
      this.used = true;
      return true;
    }
    return false;
  }

  public void setLocation(int location)
  {
	this.location = location;
  }
}
