//WAP to demonstrate the use of enumeration in Java.

import java.util.*;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class enumeration {
    public static void main(String[] args) {
        Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);
        Iterator<Days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}

