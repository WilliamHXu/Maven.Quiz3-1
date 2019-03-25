package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private ArrayList<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(ArrayList<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (labName.equals(lab.getName())) return lab;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        boolean contains = false;
        for (Lab lab : labs) {
            if (labName.equals(lab.getName())) {
                lab.setStatus(labStatus);
                contains = true;
                break;
            }
        }
        if (!contains) throw new UnsupportedOperationException();
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab : labs) {
            if (labName.equals(lab.getName())) return lab.getStatus();
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        labs.sort(new LabComparator());
        for (int i = 0; i < labs.size(); i++) {
            Lab lab = labs.get(i);
            result += lab.getName() + " > " + lab.getStatus();
            if (i != labs.size() - 1) {
                result += "\n";
            }
        }
        return result;
    }
}
