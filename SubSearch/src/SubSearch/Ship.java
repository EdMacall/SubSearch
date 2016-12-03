package SubSearch;

public class Ship {
  // The ship class needs to have a method to tell
  // if there are any left

  // What to do about off board spaces for destroyers to resupply?

  // location 0 is unplaced

  // ports 1, 2, 3, and 4 are locations 37 - 40

  private int size;
  private int depthChargeCapacity;
  private int depthCharges;
  private int location;
  private int x;
  private int y;
  private boolean sunk;
  
  public Ship(int size)
  {
	this.size = size;
	this.depthCharges = size;
	this.depthChargeCapacity = size;
	this.location = 0;
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
  
  public boolean isSunk()
  {
    return sunk;
  }
}
