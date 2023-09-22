import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int ele : list) {
            System.out.println(ele);
        }

        Comparator  com = new Comparator<Integer>() {
            
            @Override
            public int compare(Integer arg0, Integer arg1) {
                if(arg0%10 > arg1%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(list, com);

        Set<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(4);
        nums.add(5);
        nums.add(2);
        nums.add(1);
        for (int i : nums) {
            System.out.println(i);
        }

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {

            System.out.println(values.next());
        }

        Map<String,Integer> students = new HashMap<>();
        students.put("Sanyam", 401);
        students.put("Lokesh", 368);
        students.put("Vinit", 420);

        System.out.println(students.get("Lokesh"));




    }
}
