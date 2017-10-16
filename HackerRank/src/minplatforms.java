import java.util.ArrayList;
import java.util.Arrays;

public class minplatforms {
	public int minplatform(int[] arr, int[] dep){
//		Arrays.sort(arr);
		Arrays.sort(dep);
		int min=1,glob=1,i=1,j=0;
		int n = arr.length;
		while(i<n && j<n){
			if(arr[i]<=dep[j]){
				min++;
				i++;
				if(glob<min){
					glob=min;
				}
			}else{
				min--;
				j++;
			}
		}
		return glob;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {940,950,1100,1500,1800,900};
		int[] dep = {1200,1120,1130,1900,2000,910};
		System.out.println(new minplatforms().minplatform(arr, dep));
	}

}
