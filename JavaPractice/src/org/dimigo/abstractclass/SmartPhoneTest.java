/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1. 개요:
 * 2. 작성일:2017. 5. 12.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone smartPhones[] = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone s : smartPhones){
			System.out.println(s.toString());
			s.turnOn();
			s.pay();
			s.useSpecialFunction();
			s.turnOff();
			System.out.println();
		}
	}

}
