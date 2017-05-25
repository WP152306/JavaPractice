/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_DBTest
 *
 * 1. 개요:
 * 2. 작성일:2017. 5. 25.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class DBTest {
	public static void main(String[] args) {
		System.out.println("<변경 전>");
		IDBManager database = IDBManager.getDBObject("SYBASE");
		crud(database);
		System.out.println();
		System.out.println("<변경 후>");
		database = IDBManager.getDBObject("ORACLE");
		crud(database);
	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
