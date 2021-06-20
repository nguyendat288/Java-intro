package day10.btvn;

import java.util.Comparator;

public class SortCanBo implements  Comparator<CanBo> {
    @Override
    public int compare(CanBo o1,CanBo o2){
        return o1.getName().compareTo(o2.getName());
    }
}
