package Search;

import java.util.List;

public class SearchBinary {
    private final List<Integer> list;
    private final int numberSelected;

    private int found;

    public SearchBinary(List<Integer> list, int numberSelected) {
        this.list = list;
        this.numberSelected = numberSelected;
    }

    public Integer searchBinary() {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            System.out.println("exec");
            int middle = (low + high) / 2;
            int kick = list.get(middle);
            System.out.println("j: " + middle + " low " + low + " high " + high);
            if (kick == numberSelected) {
                return found = kick;
            }

            if (kick > numberSelected) {
                high = middle - 1;
                System.out.println(high);
            }
            if (kick < numberSelected) {
                low = middle + 1;

            }
        }
        System.out.println(found);
        return null;
    }}