
public class Domino implements Comparable<Domino> {
  public int high;
  public int low;
  public int hx;
  public int hy;
  public int lx;
  public int ly;
  public boolean placed = false;

  public Domino(int high, int low) {
    super();
    this.high = high;
    this.low = low;
  }
  
  public void place(int hx, int hy, int lx, int ly) {
    this.hx = hx;
    this.hy = hy;
    this.lx = lx;
    this.ly = ly;
    placed = true;
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("[");
    result.append(Integer.toString(high));
    result.append(Integer.toString(low));
    result.append("]");
    if(!placed){
      result.append("unplaced");
    } else {
      result.append("(");
      result.append(Integer.toString(hx+1));
      result.append(",");
      result.append(Integer.toString(hy+1));
      result.append(")");
      result.append("(");
      result.append(Integer.toString(lx+1));
      result.append(",");
      result.append(Integer.toString(ly+1));
      result.append(")");
    }
    return result.toString();
  }

  /** turn the domino around 180 degrees clockwise*/
  
  public void invert() {
    int tx = hx;
    hx = lx;
    lx = tx;
    
    int ty = hy;
    hy = ly;
    ly = ty;    
  }

  public boolean ishl() {    
    return hy==ly;
  }


  public int compareTo(Domino arg0) {
    if(this.high < arg0.high){
      return 1;
    }
    return this.low - arg0.low;
  }
  
  
  
}
