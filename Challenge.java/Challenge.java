import java.util.Arrays;

public class Challenge {
	
	public static int[] selReverse(int[] num1, int num2) {
			if(num1.length < 1) {
				return num1;
			}
			int[] sortedArr = new int[num1.length]; 
			if(num1.length <= num2) {
				for(int i = 0; i < num1.length; i++) {
					sortedArr[i] = num1[num1.length-i-1];
				}
				
			}
			else {
				for(int i = 0; i < num1.length; i++) {
					int revMax = i+num2;
					if(revMax >= num1.length) {
						revMax = num1.length;
					}
					for(int j = 0; j < num2; j++) {
						if(i+j > num1.length-1) {
							break;
						}
						sortedArr[i+j] = num1[revMax-j-1];
						sortedArr[revMax-j-1] = num1[i+j];
						
					}
					i += num2-1;
				}
			}
			return sortedArr;
		}
		public static void main(String[] args) {
			int [] num1 = {1,2,3,4,5,6};
			int[] num2 = {2,4,6,8,10,12,14,16};
			int[] num3 = {5,7,2,6,0,4,6};
			System.out.println(Arrays.toString(selReverse(num1, 2)));
			System.out.println(Arrays.toString(selReverse(num2, 3)));
			System.out.println(Arrays.toString(selReverse(num3, 100)));
		}
	}
