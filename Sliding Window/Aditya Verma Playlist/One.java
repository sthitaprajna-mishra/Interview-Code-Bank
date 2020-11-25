class One{

	public static void main(String[] args){

		// Naive/Brute-force method
		int[] arr = new int[]{2, 3, 5, 2, 9, 7, 1};
		int sizeOfSubArray = 3;

		int sum = Integer.MIN_VALUE;

		for(int i = 0; i <= arr.length-sizeOfSubArray; i++){
			int tempSum = 0;
			for(int j = i; j < i+sizeOfSubArray; j++){
				tempSum += arr[j];
			}
			sum = tempSum > sum ? tempSum : sum;
		}

		System.out.println(sum);

		// O(1) method 
		int[] arr = new int[]{2, 3, 5, 2, 9, 7, 1};
		int sizeOfSubArray = 3;

		int sum = Integer.MIN_VALUE;
		
		int i = 0, j = 0;
		int tempSum = 0;

		while(j < arr.length){
			tempSum += arr[j];

			if((j-i+1) < sizeOfSubArray)
				j++;
			else if((j-i+1) == sizeOfSubArray){
				sum = tempSum > sum ? tempSum : sum;
				tempSum -= arr[i];
				j++;
				i++;
			}
		}

		System.out.println(sum);

	}
}
