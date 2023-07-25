package GenericChallenge2;

import java.util.Comparator;

public class LPAStudentComparator implements Comparator<LPAStudent> {

    @Override
    public int compare(LPAStudent s1, LPAStudent s2) {
        return (int) (s1.getPercentComplete() - s2.getPercentComplete());
    }
}
