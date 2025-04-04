public class copyArray{
	public static void main(String[] args){
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[arr1.length];

		for (int i=0; i<arr1.length; i++){
			arr2[i] = arr1[i];
		}
		
		System.out.println("Elements in arr1: ");
		for (int j:arr1){
			System.out.println(j);
		}
		System.out.println("Elements in arr2:");
		for (int j:arr2){
			System.out.println(j);
		}
	}
}