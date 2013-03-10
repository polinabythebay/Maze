public class Place {

  // FILE NAME: Place.java
  // PURPOSE: new class for storing a row and column corresponding to a single
  // location in a 2D maze, used for searching for a path through a maze

  // instance variables

  private int row;
  private int col;
  
  // constructor
  
  public Place (int r, int c) {
    row = r;
    col = c;
  }

  // methods to access the instance variables
  
  public int getRow() {
    return row;
  }
  
  public int getCol () {
    return col;
  }

  // instance method that returns true if the input Place has the same
  // contents as the Place used to invoke this method
  
  public boolean equals (Place p) {
    return ((this.row == p.row) && (this.col == p.col));
  }
  
  public String toString () {
    return "[" + row + ", " + col + "]";
  }

}


