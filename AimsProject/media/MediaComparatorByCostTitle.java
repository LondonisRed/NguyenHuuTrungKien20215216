package media;

import java.util.*;
public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media s1, Media s2) {
        if(s1.getTitle().compareTo(s2.getTitle()) == 1){
            if (s1.getCost() == s2.getCost())
                return 0;
            else if (s1.getCost() > s2.getCost())
                return 1;
        }
        return -1;
    }
}


