import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        double[] ts = {6.3, -6.2, 8.5, 9.4, 100.25, -300.25};
        ArrayList<Double> dNeg = new ArrayList<>();
        ArrayList<Double> dPos = new ArrayList<>();
        Arrays.sort(ts);

        for (double tss : ts) {
            if (tss < 0) {
                dNeg.add(tss);
            } else {
                dPos.add(tss);
            }
        }

        if (Math.abs(dNeg.get(dNeg.size() - 1)) == dPos.get(0)) {
            System.out.println(dPos.get(0));
        } else if (Math.abs(dNeg.get(dNeg.size() - 1)) < dPos.get(0)) {
            System.out.println(dNeg.get(dNeg.size() - 1));
        } else {
            System.out.println(dPos.get(0));
        }
    }
}
