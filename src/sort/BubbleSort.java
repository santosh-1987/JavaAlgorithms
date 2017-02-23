package sort;

import java.util.Arrays;

/**
 * Created by mohantysan on 23/02/17.
 */
public class BubbleSort {

  public static int[] sortAsc(int[] crunchifyArr) {
    int temp;
    for (int i = 0; i < crunchifyArr.length - 1; i++) {
      for (int j = 1; j < crunchifyArr.length - i; j++) {
        if (crunchifyArr[j - 1] > crunchifyArr[j]) {
          temp = crunchifyArr[j - 1];
          crunchifyArr[j - 1] = crunchifyArr[j];
          crunchifyArr[j] = temp;
        }
      }
      Util.log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
    }
    return crunchifyArr;
  }

  // Bubble Sort Algorithm in Descending Order
  public  int[] sortDesc(int[] crunchifyArr) {
    int temp;
    for (int i = 0; i < crunchifyArr.length - 1; i++) {

      for (int j = 1; j < crunchifyArr.length - i; j++) {
        if (crunchifyArr[j - 1] < crunchifyArr[j]) {
          temp = crunchifyArr[j - 1];
          crunchifyArr[j - 1] = crunchifyArr[j];
          crunchifyArr[j] = temp;
        }
      }
      Util.log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
    }
    return crunchifyArr;
  }

}
