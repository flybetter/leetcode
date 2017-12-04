package leetcode.array;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/12/4
 * Time: 下午9:54
 */
public class image_smoother {
    public int[][] imageSmoother(int[][] M) {

        int[][] result = new int[M.length][M[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int cellResult = this.reachableDomain(i, j, M);
                result[i][j] = cellResult;
            }
        }

        return result;
    }


    public int reachableDomain(int i, int j, int[][] M) {
        int dividend = 9;
        int divisor = 0;
        for (int k = i - 1; k < i + 2; k++) {
            for (int l = j - 1; l < j + 2; l++) {
                try {
                    tempFunction(k, l, M);
                } catch (Exception e) {
                    dividend-=1;
                    continue;
                }
                divisor += M[k][l];

            }
        }
        return Math.floorDiv(divisor, dividend);
    };


    public void tempFunction(int i, int j, int[][] M) throws Exception {
        int temp = M[i][j];
    }

    public static void main(String[] args) {
        int[][] M = {{1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};
        image_smoother image_smoother = new image_smoother();
        int[][] result = image_smoother.imageSmoother(M);
        for (int i = 0; i < result.length; i++) {
            System.out.println();
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }

        }

    }


}
