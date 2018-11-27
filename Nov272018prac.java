import java.util.ArrayList;

public class Nov272018prac{



public static ArrayList<Integer> combine(ArrayList<Integer> l1, ArrayList<Integer> l2){
	ArrayList<Integer> list = new ArrayList<>();
	for(int i = 0;i < l1.size();i++)
		list.add(l1.get(i));
	for(int i = 0;i < l1.size();i++)
		list.add(l2.get(i));
	return list;
	}
}