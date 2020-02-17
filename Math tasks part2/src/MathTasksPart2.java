class solver {
    private int n;
    private int[] X;
    private int[] Y;


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getX() {
        return X;
    }

    public void setX(int[] x) {
        this.X = x;
    }

    public int[] getY() {
        return Y;
    }

    public void setY(int[] y) {
        this.Y = y;
    }


    void printer(int[] arr, int counter) {
        System.out.print("[");
        for (int j = 0; j < counter; j++) {
            arr[j] = arr[j];
            System.out.print(arr[j] + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }

    //exercise 281
    void ex281() {
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                Y[count] = X[i];
                count++;
            }
        }
        printer(Y, count);
    }

    //exercise 282
    void ex282() {
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] != 0) {
                Y[count] = X[i];
                count++;
            }
        }
        printer(Y, count);
    }

    //exercise 284
    void ex284() {
        int a = 4;
        int b = 10;
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] >= a && X[i] <= b) {
                Y[count] = X[i];
                count++;
            }
        }
        printer(Y, count);
    }

    //exercise 287
    void ex287() {
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            if(X[i]!=i){
                Y[count] = X[i];
                count++;
            }
        }

        printer(Y, count);
    }
}

public class MathTasksPart2 {
    public static void main(String[] args) {
        solver solverObj = new solver();
        solverObj.setN(7);
        solverObj.setX(new int[solverObj.getN()]);
        solverObj.setX(new int[]{1, 2, 0, 5, 0, -4, 8});
        solverObj.setY(new int[solverObj.getN()]);

	System.out.println();

        solverObj.ex281();
        solverObj.ex282();
        solverObj.ex284();
        solverObj.ex287();
    }

}
