package interfacess.comparator;

import java.util.Arrays;

import static com.kursk.Util.println;
import java.util.Comparator;

public class LengthComparator implements java.util.Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }

    public static void main(String[] args) {
        String[] friends = {"Peter" , "Paul" , "Mary"};
        Arrays.sort(friends , new LengthComparator() );
    }

}
