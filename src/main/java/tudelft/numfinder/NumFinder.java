package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(Integer[] nums) {
        for (Integer n : nums) {
            if (n == null) {
                throw new IllegalArgumentException("El array contiene valores nulos.");
            }
        }
        for(int n : nums) {
            if(n < smallest)
                smallest = n;
            if (n > largest)

                largest = n;
        }
    }
    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
