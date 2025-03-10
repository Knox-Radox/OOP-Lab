//Frequency Counter CH.SC.U4CSE24028
public class frequencyCounter{
	public static void main(String[] args){
		int[] arr = {1,1,2,3,4,5,5};
		boolean[] visited = new boolean[arr.length];

		for (int i=0; i<arr.length; i++){
			if (visited[i]){
				continue;
			}

		int count = 1;
		for (int j=i+1; j<arr.length; j++){
			if (arr[j]==arr[i]){
				count++;
				visited[j] = true;
			}
		}
		System.out.println(arr[i]+"|"+count);
		}
	}	
}
