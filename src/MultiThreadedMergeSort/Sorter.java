package MultiThreadedMergeSort;
import java.util.*;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrToSort;
    ExecutorService es;

    Sorter(List<Integer> arrToSort, ExecutorService es){
        this.arrToSort = arrToSort;
        this.es = es;
    }

    public List<Integer> call() throws ExecutionException, InterruptedException{

        if(arrToSort.size() <= 1){
            return arrToSort;
        }

        int size = arrToSort.size();
        int mid = size / 2;

        List<Integer> leftArray = new ArrayList<Integer>();
        List<Integer> rightArray = new ArrayList<Integer>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrToSort.get(i));
        }

        for(int i=mid;i<size;i++){
            rightArray.add(arrToSort.get(i));
        }


        //Define the task
        Sorter leftArraySorter = new Sorter(leftArray, this.es);
        Sorter rightArraySorter = new Sorter(rightArray, this.es);

//        ExecutorService es = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedArrayFuture = this.es.submit(leftArraySorter);
        Future<List<Integer>> rightSortedArrayFuture  = this.es.submit(rightArraySorter);

        List<Integer> sortedLeftArray = leftSortedArrayFuture.get();
        List<Integer> sortedRightArray = rightSortedArrayFuture.get();

        // Merging the two sorted arrays
        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
