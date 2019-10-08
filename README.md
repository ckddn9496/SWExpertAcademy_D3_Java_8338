# SWExpertAcademy_D3_Java_8338

## SW Expert Academy D3 8338. 계산기

### 1. 문제설명

출처: https://swexpertacademy.com/main/code/problem/problemList.do

N개의 수가 있을때, 차례대로 입력하여 계산하려고한다. 수 사이사이 중간연산자로 `+` 또는 `*`를 사용한다고 할때 계산기에 계산된 결과로 나올 수 있는 값중 최대값을 구하는 문제

[입력]

> 첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
> 각 테스트 케이스의 첫 번째 줄에는 하나의 정수 N( 1 ≤N ≤ 9 )이 주어진다.
> 두 번째 줄에는 N개의 정수 a1, a2, , ⋯, aN ( 0 ≤ ai ≤ 9 )이 공백 하나로 구분되어 주어진다.

[출력]

> 각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고,
> 각 테스트 케이스마다 계산기에 계산된 결과로 나올 수 있는 값 중 최대값을 출력한다.

### 2. 풀이

계산 결과를 담기 위해 변수 `result`를 선언하였다. `result`가 `0`또는 `1`일 경우, 추가되는 숫자를 곱하는것보다 더할때 더 큰 `result`를 만들 수 있다. `result`가 `2`이상일 경우, 추가되는 숫자가 `0`또는 `1`일 때는 곱셈 보다 덧셈이 더 큰수를 만들 수 있으며, `2`이상일 경우 곱셈이 가장 큰 숫자를 만들 수 있다. 이를 그대로 구현하여 완료하였다.
```java
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
```
