package game;

public class scene {
  private int height;
  private int width;
  private String[][] terrain;
  private int[][][][] distance;

  public scene (int height, int width) {
      this.height = height;
      this.width = width;
      terrain = new String[height][width];
      distance = new int[width][height][width][height];
  }

  public void addTerrain(String terrainIn, int row, int column) {
      terrain[row][column] = terrainIn;
  }

  public String getTerrain(int row, int column) {
      return terrain[row][column];
  }

  public void addDistance (int row1, int column1, int row2, int column2){
      distance[row1][column1][row2][column2] = (int) (Math.sqrt((row2-row1)*(row2-row1) + (column2-column1)*(column2-column1)));
  }

  public int getDistance(int row1, int column1, int row2, int column2) {
    addDistance(row1, column1, row2, column2);
    return distance[row1][column1][row2][column2];
  }

  public int getHeight () {
      return height;
  }

  public int getWidth () {
    return width;
  } 

  /** Check if a given cell is empty */
  public boolean isEmpty(int row, int column) {
    return terrain[row][column] == null;
  }

  /** Count the cells which are not empty */
  public int countItems(int row, int column, int maxDistance) {
    int count = 0;
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            if (!isEmpty(i, j)) {
              int jr = getDistance(row, column, j, i);
                if ( jr <= maxDistance) {
                    count += 1;
                }
            }
        }
    }
    return count;
  }


}

