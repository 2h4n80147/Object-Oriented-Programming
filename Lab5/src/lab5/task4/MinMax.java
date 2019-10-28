package lab5.task4;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MinMax {
    static class Pair {
        public int max;
        public int min;
        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return this.min + " " + this.max;
        }
    }
    static Pair minmax(int values[]) {
        int min = (int)1e9;
        int max = (int)-1e9;
        for (int i = 0; i < values.length; i++) {
            min = min(min, values[i]);
            max = max(max, values[i]);
        }
        return new Pair(min,max);
    }
}
class Test {
    public static void main(String[] args) {
        int a[] = {0,8,-3,20};
        MinMax m = new MinMax();
        System.out.println(m.minmax(a).toString());
    }
}
