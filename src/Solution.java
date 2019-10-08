import java.util.Scanner;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(sc.nextLine());
			
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int[] nums = new int[N];
			for (int i = 0; i < N; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0;
			
			for (int num : nums) {
				if (result > 1) {
					if (num > 1) {
						result *= num;
					} else {
						result += num;
					}
					
				} else {
					result += num;
				}
			}
			
			System.out.println("#"+test_case+" "+result);

		}
	}
}