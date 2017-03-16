/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Loop
 *
 * 1. 개요:조건문 게임
 * 2. 작성일:2017. 3. 15.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class Loop {
	public static void main(String[] args) {
		
		int choice, strong = 100;
		String[] set = {"마법사", "영주", "기사", "농민"};
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("\n------------\n");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.printf("\n------------\n");
			System.out.printf("메뉴 입력 => ");
			
			choice = scanner.nextInt();
			
			switch (choice){
			case 1: 
				strong += 10;
				System.out.printf("\n공격력이 증가되었습니다. 현재 공격력 : %d", strong);
				break;
			case 2: 
				strong -= 10;
				System.out.printf("\n공격력이 감소되었습니다. 현재 공격력 : %d", strong);
				break;
			case 3: 
				int job = new Random().nextInt(4);
				System.out.println(set[job]+"(으)로 설정되었습니다. ");
			case 9: 
				System.out.println("이제 공부하세요!");
				break;
			default : 
				System.out.println("없는 메뉴입니다!!");
			}
		} while (choice != 9);
		scanner.close();
	}
}
