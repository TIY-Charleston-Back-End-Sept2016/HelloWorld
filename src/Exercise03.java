import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by zach on 9/21/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "daniel", "andrew", "alex"};
        ArrayList<String> namesArr;
        // remove all names that start with "a"
        // ["bob", "charlie", "daniel"]

        // for each
        namesArr = new ArrayList<>(Arrays.asList(names));
        for (String name : names) {
            if (name.charAt(0) == 'a') {
                namesArr.remove(name);
            }
        }

        // old school for loop
        namesArr = new ArrayList<>(Arrays.asList(names));
        for (int i = namesArr.size() - 1; i >= 0; i--) {
            if (namesArr.get(i).charAt(0) == 'a') {
                namesArr.remove(i);
            }
        }

        // iterator
        namesArr = new ArrayList<>(Arrays.asList(names));
        Iterator<String> iter = namesArr.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.charAt(0) == 'a') {
                iter.remove();
            }
        }
    }
}
