package interview;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class mostfrequentelement {
	public static void main(String[] args)
	{
		int arr[]= {1,1,2,2,2,3,3,3,3};
//		list.stream()
//				.collect(Collectors.groupingBy(
//						Function.identity(),
//						Collectors.counting()));
		System.out.print(Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting())
						)
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.get()
				.getKey());
		
	}
}
