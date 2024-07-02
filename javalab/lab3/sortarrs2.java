import java.util.Arrays;

public class sortarrs2 {

    public static void mergeArrays(int[] A, int[] B) {
        int p = A.length;
        int q = B.length;
        int[] merged = new int[p + q];
        int i = 0, j = 0, k = 0;

        while (i < p && j < q) {
            if (A[i] <= B[j]) {
                merged[k] = A[i];
                i++;
            } else {
                merged[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < p) {
            merged[k] = A[i];
            i++;
            k++;
        }

        while (j < q) {
            merged[k] = B[j];
            j++;
            k++;
        }

        System.arraycopy(merged, 0, A, 0, p);
        System.arraycopy(merged, p, B, 0, q);
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};

        System.out.println("Original A: " + Arrays.toString(A));
        System.out.println("Original B: " + Arrays.toString(B));

        mergeArrays(A, B);

        System.out.println("Modified A: " + Arrays.toString(A));
        System.out.println("Modified B: " + Arrays.toString(B));
    }
}
