import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args){
        ArrayList<Watch> watcheList=new ArrayList<>();
        watcheList.add(new Watch(1,"womenWatch",2000,"Sonata"));
        watcheList.add(new Watch(2,"MenWatch",2000,"wrong"));
        watcheList.add(new Watch(3,"MenWatch",1000,"wrong"));
        watcheList.add(new Watch(4,"MenWatch",5000,"wrong"));
        watcheList.add(new Watch(5,"MenWatch",600,"wrong"));

        List<Integer> obj=watcheList.stream().map(watch -> watch.getId()).collect(Collectors.toList());
        System.out.println(obj);

    }
}
