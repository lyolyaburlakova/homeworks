import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class symmetricdiff {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> fset = new HashSet<T>(set1);
        Set<T> sset = new HashSet<T>(set2);

        Set<T> vesset = new HashSet<>();
        vesset.addAll(fset);
        vesset.addAll(sset);

        Iterator<T> setIterator = vesset.iterator();
        while (setIterator.hasNext()){ //true if the iteration has more elements
            T i = setIterator.next(); //returns the next element in the iteration
            if(fset.contains(i) && sset.contains(i)){
                setIterator.remove();
            }
        }
        return vesset;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1, set2));
    }
}