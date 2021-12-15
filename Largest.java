public class Main
{
	public static void main(String[] args) {
int[] nums = {1,5,2,7,4,0,3};
int largest =0;
for (int index = 0; index < nums.length; index++){
    if (nums[index] > largest){
        largest = nums[index];
    }
}
System.out.println(largest);
	}
}
