package leetcode.array;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/26
 * Time: 下午9:25
 * 没有做出来
 * 我觉得这个算法没有做出来的，最主要的原因是没有想好如何计数的问题
 */
public class Max_area_of_island {

    public boolean seen[][];
    public int top = 0;
    public int[][] grid;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        seen = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
//                System.out.println();
//                System.out.println("array i" + i + "j" + j);
//                System.out.println("top:" + top);

                this.search(i, j);
            }
        }

        return top;
    }

    //迭代

    public int search(int i, int j) {
//        System.out.println("");
//        System.out.println("i:" + i + "j:" + j);
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || seen[i][j] == true || grid[i][j] == 0) {
//            System.out.println("result 0");
            return 0;
        }
        seen[i][j] = true;

        int temp = 1;
        temp += search(i - 1, j);
        temp += search(i + 1, j);
        temp += search(i, j - 1);
        temp += search(i, j + 1);
//        System.out.println("*********temp:" + temp);
        top = Math.max(top, temp);
//        System.out.println("result 1");
        return temp;

    }

    public static void main(String[] args) {
        Max_area_of_island max = new Max_area_of_island();
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
                         {0,1,1,0,1,0,0,0,0,0,0,0,0},
                         {0,1,0,0,1,1,0,0,1,0,1,0,0},
                         {0,1,0,0,1,1,0,0,1,1,1,0,0},
                         {0,0,0,0,0,0,0,0,0,0,1,0,0},
                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
                         {0,0,0,0,0,0,0,1,1,0,0,0,0}};
//        int[][] grid = {{1, 1,1}};
        System.out.println(max.maxAreaOfIsland(grid));
        for (int i = 0; i < max.seen.length; i++) {
            System.out.println();
            for (int j = 0; j < max.seen[0].length; j++) {
                System.out.print(max.seen[i][j] + " ");
            }

        }
    }


}
