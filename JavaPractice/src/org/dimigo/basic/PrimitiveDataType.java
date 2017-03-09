/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_PrimitiveDataType
 *
 * 1. 개요: 아이유 프로필 출력하기
 * 2. 작성일:2017. 3. 9.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class PrimitiveDataType {
	public static void main(String[] args) {
		String name = "아이유";
		Boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.printf("<<아이유 프로필>>\n");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %s\n", (isMale)?"남자":"여자");
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1f\n", height);
		System.out.printf("몸무게 : %.1f\n", weight);
		System.out.printf("혈액형 : %c\n", bloodType);
		
	}
}
