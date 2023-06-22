package media;

import java.util.*;

public class MediaComparatorByTitleCost implements Comparator<Media>{

    @Override
    public int compare(Media s1, Media s2) {
        return s1.getTitle().compareTo(s2.getTitle());
    }

    
}