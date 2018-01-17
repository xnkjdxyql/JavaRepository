public class arraytest {
	public static void main(String[] args) {
		int[][] arr=new int[4][];
		int[] a={11,12,13};
		arr[0]=a;
		int[] b={21,22,23,24};
		arr[1]=b;
		int[] c={31,32,33,34,35};
		arr[2]=c;
		int[] d={41,42,43,44,45,46};
		arr[3]=d;
		System.out.print(String.valueOf(arr[1]));
		
/*		for (int[] i : arr) {
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
			
		}   */
	
	}

}
