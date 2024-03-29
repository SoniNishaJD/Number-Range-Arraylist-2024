import java.util.ArrayList;
import java.util.List;

public class NumberRange {
	public static void main(String[] args) {
		int [] nums = {5, 7, 7, 7, 8,8,10};
		int target = 8;
		
		
		
		int start = findStartIndex(nums, target);
		int end = findEndIndex(nums, target);
		
		List<Integer> result = new ArrayList<>();
		result.add(start);
		result.add(end);
		
		System.out.println("RESULT : " + result);
		
	}

	private static int findStartIndex(int[] nums, int target) {
		int start = -1;
		int left = 0;
		int right = nums.length -1;
		
		while(left <= right) {
			int mid = left + (right - left) /2; 
			if(nums[mid] >= target) {
				right = mid -1;
			}else {
				left = mid +1;
			}
			if (nums[mid] == target) {
				start = mid;
			}
		}
		return start;
	}

	private static int findEndIndex(int[] nums, int target) {
		int end = -1;
		int left = 0;
		int right = nums.length -1;
		
		while (left <= right) {
			int mid = left + (right - left) /2;
			if(nums[mid] <= target) {
				left = mid +1;
			}else {
				right = mid -1;
			}
			if(nums[mid] == target) {
				end = mid;
			}
		}
		
		return end;
	}
	}
		