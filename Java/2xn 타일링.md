# 2xn 타일링

## 문제
- 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

- 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

## 입력
- 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

## 풀이
``` Java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class xn타일링 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 형 변환
		
		int[] arr = new int[n+1]; // 메모이제이션에 활용할 배열
		
		// 점화
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < n+1; i++) {
			if(n == 1) 
				break;
			arr[i] = arr[i - 2] + arr[i - 1];
			arr[i] %= 10007;
		}
		
		bw.flush();
		bw.write(arr[n] + " ");
		br.close();
		bw.close();
	}

}
```

