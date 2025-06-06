package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> revFirst = new ArrayList<>(first);
        ArrayList<Integer> revSecond = new ArrayList<>(second);
        Collections.reverse(revFirst);
        Collections.reverse(revSecond);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < Math.max(revFirst.size(), revSecond.size()); i++){
            int firstVal = i < revFirst.size() ? revFirst.get(i) : 0;
            int secondVal = i < revSecond.size() ? revSecond.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = total / 10;
            result.add(total % 10);
        }

        if (complement > 0) {
            result.add(complement);
        }

        Collections.reverse(result);
        return result;
    }

}
