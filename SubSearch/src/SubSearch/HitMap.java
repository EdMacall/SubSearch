package SubSearch;

public class HitMap {
  // Hit maps serve to remind players which spaces depth charges
  // have been dropped on and what the results were
	
  // 0 indicates that a depth charge has not been dropped here
  // 1 indicates that a depth charge was dropped here resulting in a direct hit
  // 2 indicates that a depth charge was dropped here resulting in a near miss
  // 3 indicates that a depth charge was dropped here resulting in a complete miss
	
  public int[][] hitmap = new int[36][3];
  
  public HitMap()
  {
    for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < 35; j++)
      {
    	hitmap[j][i] = 0;
      }
    }
  }
  
  public int getHitMapLocation(int location, int depth)
  {
    return hitmap[location - 1][(depth / 100) - 1];
  }
  
  public void setHitMapLocation(int location, int depth, int call)
  {
    hitmap[location - 1][(depth / 100) - 1] = call;
  }
}
