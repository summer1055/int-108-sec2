
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i = 0 ; i<nums.length;i++) {
			System.out.println("nums["+i+"]="+nums[i]);
		}
		System.out.println("Using foreach to display value from array nums ");
		int t=0;
		for (int num : nums) {
			
			System.out.println("nums["+t+"]="+num);
			t++;
		}
		printArray(nums);
	}
	public static void printArray(int[] _num) {
		System.out.println("");

		for(int i = 0 ; i<_num.length;i++) {
			System.out.println("nums["+i+"]="+_num[i]);
		}
	}

}
