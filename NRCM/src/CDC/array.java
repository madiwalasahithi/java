package CDC;

public class array {
	public static void main(String[] args) {
		int arr[]= {2,4,1,9};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("min:"+min);
	}

}
