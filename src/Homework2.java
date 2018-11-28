
public class Homework2 {

	public static void main(String[] args) {
		int [] a = {1,6,3,7,20,34,67,89,102};
		mergeSort(a);
		for(int x : a) {
			System.out.println(x);
		}
	}
	public static void mergeSort(int[] a) {
		if(a.length > 1) {
			int i, mid = a.length/2;
			int [] div1 = new int[mid];
			int [] div2 = new int[a.length - mid];
			for(i = 0; i < mid; i++) {
				div1[i] = a[i];
			}
			for(i = 0; i < a.length; i++) {
				div2[i-mid] = a[i];
			}
			mergeSort(div1);
			mergeSort(div2);

			int x = 0, y = 0;
			for(i = 0; x < div1.length && y < div2.length; i++) {
				if(div1[x] < div2[y]) {
					a[i] = div1[x];
					x++;
				}
				else {
					a[i] = div2[y];
					y++;
				}
				for(; x < div1.length; i++, x++) {
					a[i] = div1[x];
				}
				for(; y < div2.length; i++, y++) {
					a[i] = div2[y];
				}

			}
		}
	}

}
