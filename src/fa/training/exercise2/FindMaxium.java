package fa.training.exercise2;

public class FindMaxium {

	public static void main(String args[]) {
		int[] arr = {2, 5, 6, 8, 42, 12, 33};
		
		System.out.print("2 số lớn nhất trong dãy số sau là: ");
		printArray(arr);
		System.out.println(maximum(arr)+" "+secondMax(arr));
	}
	
	public static int maximum(int[] list) {
		int max = list[0];
		for(int i : list) {
			if(i > max) max = i;
		}
		return max;
	}
	
	public static int secondMax(int[] list) {
		int secondMax=-1;
		int max=maximum(list);
		for(int i : list) {
			if(i < max&&i>secondMax) secondMax = i;
		}
		return secondMax;
	}
	
	static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
}
