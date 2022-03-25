package sqlbaglanti;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class deneme {

	public static void main(String[] args) {
		List<Integer> liste = Arrays.asList(1,0,3,2,5,6,9,7,0);

		List<Integer> l1 = liste.stream().map(p->p+2).collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> l2 = liste.stream().filter(p->p>1 && p<7).collect(Collectors.toList());
		System.out.println(l2);

		List<Integer> l3 = liste.stream().map(p->p%2==0?p/2:p+1).collect(Collectors.toList());
		System.out.println(l3);

		List<Integer> z = Arrays.asList(1,0,3,2,5,6,9,7,0);
		List<Integer> a = z.stream().map(p->p%2==0 && p>=2?p/2:p+1).
				collect(Collectors.toList());
		System.out.println(a);

		List<Integer> b = z.stream().filter(
				p->(p%5<4 && p%8>2)).collect(Collectors.toList());
		System.out.println(b);

		Optional<Integer> c = z.stream().
				reduce((p1, p2)->p2%5<3 || p1%3==0?p1:p2);
		System.out.println(c.get());






	}

}
