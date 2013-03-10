public class MazeTest {

  // FILE NAME: MazeTest.java

  // PURPOSE: provides a main() method with code to test the methods in the 
  // Maze class, to find a path through a maze

  public static void main (String[] args) {
    // simple maze with only one new Place choice at each location
      
    int[][] array1 = {{0, 1, 1, 1, 1},
        {0, 0, 0, 1, 1},
        {1, 1, 0, 1, 1},
        {1, 1, 0, 0, 1},
        {1, 1, 1, 0, 0}};
    
     Maze newMaze = new Maze(array1);
     //This tests having a simple dead end
     int[][] array7 = {{0, 0, 1, 1, 1},
        {1, 1, 0, 1, 1},
        {1, 1, 0, 1, 1},
        {1, 1, 0, 0, 1},
        {1, 1, 1, 0, 0}};
     Maze nextMaze = new Maze(array7);
     nextMaze.searchMaze(0,0,4,4);
    

    // search the maze from the upper left corner (0,0) to the lower
    // right corner (4,4)
    newMaze.searchMaze(0, 0, 4, 4);
    array1[2][2] = 1;    // this makes the maze impossible to solve
     newMaze = new Maze(array1);
     newMaze.searchMaze(0, 0, 4, 4);


    // larger maze with multiple paths to explore
    int[][] array2 = {{0, 1, 0, 1, 1, 1, 0, 1, 0, 1},
        {0, 0, 1, 1, 0, 0, 1, 1, 0, 1},
        {0, 0, 1, 1, 0, 0, 1, 0, 0, 1},
        {0, 1, 1, 0, 0, 1, 0, 0, 0, 0},
        {0, 0, 1, 1, 0, 0, 0, 1, 1, 0},
        {1, 0, 1, 1, 0, 1, 1, 1, 0, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 1, 1, 0, 1, 1, 0, 1, 1},
        {0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
        {0, 1, 0, 1, 0, 0, 0, 1, 0, 0}};
    Maze largeMaze = new Maze(array2);


    largeMaze.searchMaze(0, 0, 9, 9);
    //teeny tiny array
    int[][] array3 = {{0, 0},
        {1, 0}};
    Maze testMaze= new Maze(array3);
    testMaze.searchMaze(0,0,1,1);

    //Tests multidirectional movement
    int[][] array4 = {{0, 0, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 0, 0},
        {0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0}};
    Maze maze4 = new Maze(array4);
     maze4.searchMaze(0,0,4,4);

    //Another big maze which crosses itself 
    int[][] array5 = {{0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
        {1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
        {0, 0, 0, 1, 1, 0, 0, 0, 0, 1},
        {1, 1, 1, 0, 0, 1, 0, 0, 0, 0},
        {0, 0, 1, 1, 0, 0, 0, 1, 1, 0},
        {1, 0, 1, 1, 0, 1, 1, 1, 0, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 1, 1, 0, 1, 1, 0, 1, 1},
        {0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
        {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
    Maze maz5 = new Maze(array5);
    maz5.searchMaze(0, 0, 9, 9);

    //Only the first value is zero
    int[][] array6 = {{0, 1, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 0, 0},
        {0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0}};
    Maze maze6 = new Maze(array6);
     maze6.searchMaze(0,0,4,4);

  }
  
}
