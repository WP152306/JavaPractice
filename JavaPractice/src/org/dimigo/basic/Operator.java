/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 *
 * 1. 개요:디미베네 연간 인건비 계산
 * 2. 작성일:2017. 3. 13.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int money = 1700000;
		int j = 3;
		int jumpo = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d\n원", money);
		System.out.printf("점포 내 직원 수 : %,d\n", j);
		System.out.printf("점포 수 : %,d개\n", jumpo);
		System.out.printf("연간 인건비 : %,d", (long)money*12*j*jumpo);
	}

}
