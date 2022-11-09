import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+ (i+1) +" of Array");
			a[i]=sc.nextInt();
		}
		int c=0;
		A1:{for(int i=0;i<n-1;i++) {
			int temp=a[i];
			for(int j=i+1;j<n;j++) {
				if(temp==a[j]) {
					break A1;
				}
			}
			c=i;
		}

		}
		if(c==n-2) {
			System.out.println("No Duplicate found");
		}
		else {
			System.out.println("Duplicate found");
		}

	}

}
