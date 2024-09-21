import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class P3 {
    public static void main(String[] args) {
        List<Car> fleet = new P1().getCollection();

        ListIterator<Car> listIterator = fleet.listIterator(0);

        while (listIterator.hasNext()) {
            Car c = listIterator.next();
            System.out.println(c);
        }

    }

}
