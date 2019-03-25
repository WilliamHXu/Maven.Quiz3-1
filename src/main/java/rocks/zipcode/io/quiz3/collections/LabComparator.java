package rocks.zipcode.io.quiz3.collections;

import java.util.Comparator;

public class LabComparator implements Comparator<Lab> {
    @Override
    public int compare(Lab o1, Lab o2) {
        return o1.compareTo(o2);
    }
}
