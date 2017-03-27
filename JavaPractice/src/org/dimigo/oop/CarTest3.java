/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 *
 * 1. 개요:
 * 2. 작성일:2017. 3. 23.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 car = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		
		System.out.println("<<자동차 목록>>");
		
		System.out.println("제조사명 : "+car.getCompnay());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n\n", car.getPrice());
		
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		
		System.out.println("제조사명 : "+car2.getCompnay());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도 : " + car2.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n\n", car2.getPrice());
	
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
	
		System.out.println("제조사명 : "+car3.getCompnay());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.println("최대속도 : " + car3.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원", car3.getPrice());
	
	}

}
