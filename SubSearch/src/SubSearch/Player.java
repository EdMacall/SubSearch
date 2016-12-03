package SubSearch;

public class Player {
  private Mine mine;
  private Ship[] ships;
  private Submarine[] submarines;
  private HitMap hitmap;
  
  public Player()
  {
    mine = new Mine();
    hitmap = new HitMap();
    submarines = new Submarine[3];
    ships = new Ship[3];
    
    for(int i = 0; i < 3; i++)
    {
      submarines[i] = new Submarine();
      ships[i] = new Ship(i + 2);
    }
  }
  
  public int getMineLocation()
  {
    return mine.getLocation();
  }
  
  public boolean landedOnMine(int location)
  {
    return (location == mine.getLocation());
  }
  
  public int dropDepthCharge(int location, int depth)
  {
    // returns 1 for a direct hit
	// returns 2 for a near miss
	// returns 3 for a complete miss
    int result = 3;
    int temp = 3;
	for(int i = 0; i < 3; i++)
	{
      temp = submarines[i].dropDepthCharge(location, depth);
      if(temp < result)
      {
    	result = temp;
      }
	}
	
    return result;
  }
}
