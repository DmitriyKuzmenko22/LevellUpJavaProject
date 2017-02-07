import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Дмитрий on 04.02.2017.
 */
public class ArraysTest {

    ArrayList<Integer> arlst = new ArrayList<>();


    void sortMethod() {
        Collections.sort(arlst);
    }

    void copyOfRangt() {
        ArrayList<Integer> al2 = new ArrayList<Integer>(arlst.subList(0, 5));
        System.out.println(al2.toString());
    }

    void CopyOf() {
        ArrayList<Integer> dest = new ArrayList<Integer>();
        dest.addAll(arlst);
        System.out.println("Copy of " + dest);
    }

    void binarySearch() {
        int index = Collections.binarySearch(arlst, 22222);
        int index2 = Collections.binarySearch(arlst, 89);

    }

    void fillMethods() {
        Collections.fill(arlst, 990);
        System.out.println(arlst);

    }
}