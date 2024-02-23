public class Pattern {

    /*
     ******
     *    *
     *    *
     ******
     */

    private void patternHollowRectangle(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < col; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j < col - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     ******
      ******
       ******
        ******
     */

    private void patternParallogram(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        ****
       ****
      ****
     ****
    */

    private void mirroRombusPattern(int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*-------------
     *
     **
     ***
     ****
    --------------*/
    private void trianglePattern(int row){
        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < row - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        *
       ***
      *****
     *******
    */

    private void pyramidPattern(int row){
        for (int i = 0; i < row; i++) {
            for (int j = i; j <row-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(i+1)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
        *
       * *
      *   *
     *******
    */
    private void hollowPyramidPattern(int row){
        for (int i = 0; i < row; i++) {
            for (int j = i; j <row-1 ; j++) {
                System.out.print(" ");
            }
            if (i==0) {
                System.out.print("*");
            }
            else if (i==row-1) {
                for (int j = 0; j < 2 * (i + 1) - 1; j++) {
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
                for (int j = 0; j < 2*i-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Pattern p1 = new Pattern();
        System.out.println("hollow rectangle :");
        p1.patternHollowRectangle(4, 5);
        System.out.println("parallogram pattern :");
        p1.patternParallogram(5,6);
        System.out.println("mirror rombus pattern:");
        p1.mirroRombusPattern(5);
        System.out.println("triangle pattern :");
        p1.trianglePattern(5);
        System.out.println("pyramid pattern : ");
        p1.pyramidPattern(4);
        System.out.println("Hollow pyramid pattern");
        p1.hollowPyramidPattern(5);
    }
}

