package 백크준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 단어뒤집기_9093 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			
			Stack<String> stack = new Stack<>();
			
			for(int j=0; j<str.length(); j++) {
				if(j==str.length()-1) {
					stack.push(str.substring(j,j+1));
					
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					break;
				}
				else if(str.substring(j,j+1).equals(" ")) {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(" ");
					continue;
				}
				stack.push(str.substring(j,j+1));
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}