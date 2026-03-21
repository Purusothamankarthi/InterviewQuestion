package interview;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class nonrepeatingelementusingstream {
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(4,5,6,7,4,5,8);
		Set<Integer> ans=new HashSet<>();
		
		int num= list.stream()
	            .collect(Collectors.groupingBy(
	                    Function.identity(),
	                    LinkedHashMap::new,   // 🔥 maintain order
	                    Collectors.counting()
	                ))
	                .entrySet().stream()
	                .filter(e -> e.getValue() == 1) // only unique
	                .findFirst()
	                .get()
	                .getKey();
		System.out.print(num);
	}
}
