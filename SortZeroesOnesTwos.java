package practice;

public class SortZeroesOnesTwos {

	public static void main(String[] args) {

		int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int low = 0;
		int mid = 0;
		int high = a.length-1;
		int temp = 0;
		while(mid <= high)
		{
			switch (a[mid]) {
			case 0:
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = a[high];
				a[high] = a[mid];
				a[mid] = temp;
				high--;
				break;
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
