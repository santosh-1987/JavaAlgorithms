import java.util.Arrays;
import sort.BubbleSort;
import sort.Util;

public class Sort {

  public static void main(String[] args) {
    System.out.println("Welcome to Java Algorithms !!!");
    int unsortedArray[] = {15, 3, 9, 7, 19, 8, 1, 5};
    Util.log(Arrays.toString(unsortedArray));
    Util.log("Bubble Sort for ASC");
    BubbleSort.sortAsc(unsortedArray);
    Util.log("Bubble Sort for Desc");
    BubbleSort sort = new BubbleSort();
    sort.sortDesc(unsortedArray);
  }
}