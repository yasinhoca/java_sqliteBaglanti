package sqlbaglanti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ggg {

	public static void main(String[] args) {
		ArrayList<Integer> z = new ArrayList<>(Arrays.asList(4,1,0,3,2,5,6,9,7,6));
		
		Optional<Integer> c = z.stream().
			       reduce((p1, p2)->p2%6<3?p1:p2);
			System.out.println(c.get());







	}

}
