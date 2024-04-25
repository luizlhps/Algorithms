import Search.SearchBinary;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //binary search
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6,7,8,9));
        int numberSelected = 1;

        SearchBinary sb = new SearchBinary(list, numberSelected);
        System.out.println(sb.searchBinary());
    }


}