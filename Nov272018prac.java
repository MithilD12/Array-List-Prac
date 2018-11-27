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
	public static ArrayList<Integer> print(ArrayList<Integer> listy){
		for(int i = 0;i<listy.size();i++)
			System.out.print(listy.get(i)+",");
		return listy;
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> listx){
		for(int i = listx.size()-1;i <= 0;i--){
			for(int j = i-1; j <=0; j--){
				if(listx.get(i)==listx.get(j))
					listx.remove(i);
			}
		}
		return listx;
	}

}