/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 *
 * 1. 개요:
 * 2. 작성일:2017. 3. 31.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers = {"트와이스", "원빈", "응용 프로그래밍"};
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<3; i++){
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i])){
			System.out.println("정답입니다!");
			}
			else{
				System.out.println("틀렸습니다!");
			}
		}
		
		System.out.println("<<결과 출력>>");
		for(int i = 0; i<3; i++){
			StringBuilder sb = new StringBuilder(questions[i]);
			sb.append(" ").append(answers[i]).append("입니다.");
			System.out.println(sb);
		}
	}

}
