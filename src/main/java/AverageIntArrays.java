public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
//        return 0;
    }

    public int sum(int[] aa) {
        int sum = 0;
        for (int i = 0; i < aa.length; i++) {
            sum = sum + aa[i];
        }
        return sum;
//        return 0;
    }

    public int average(int[] aa) {
        if (aa.length == 0) {
            return 0;
        }
        return (sum(aa) / aa.length);
//        return 0;
    }

}
