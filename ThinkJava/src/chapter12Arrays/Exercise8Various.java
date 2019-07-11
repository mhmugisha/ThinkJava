package chapter12Arrays;

public class Exercise8Various {


	public static int[] make(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
		a[i] = i+1;
		}
		return a;
		}
		public static void dub(int[] jub) {
		for (int i = 0; i < jub.length; i++) {
		jub[i] *= 2;
		}
		}
		public static int mus(int[] zoo) {
		int fus = 0;
		for (int i = 0; i < zoo.length; i++) {
		fus = fus + zoo[i];
		}
		return fus;
		}
		
		public static void main(String[] args) {
		int[] bob = make(5); // bob = {1,2,3,4,5}
		dub(bob); //now bob is doubled, so bob = {2,4,6,8,10}.
		System.out.println(mus(bob)); //bob summed = 0+2+4+6+8+10 = 30.
		}
}
