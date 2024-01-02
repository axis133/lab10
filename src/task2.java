import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static Set<Point> findIntersection(Set<Point> set1, Set<Point> set2) {
        Set<Point> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
    public static Set<Point> findDifference(Set<Point> set1, Set<Point> set2) {
        Set<Point> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    public static void main(String[] args) {

        Set<Point> set1 = new HashSet<>();
        set1.add(new Point(1, 1));
        set1.add(new Point(2, 2));

        Set<Point> set2 = new HashSet<>();
        set2.add(new Point(2, 2));
        set2.add(new Point(3, 3));

        Set<Point> intersection = findIntersection(set1, set2);
        Set<Point> difference = findDifference(set1, set2);

        System.out.println("Пересечение: " + intersection);
        System.out.println("Разность: " + difference);
    }
}