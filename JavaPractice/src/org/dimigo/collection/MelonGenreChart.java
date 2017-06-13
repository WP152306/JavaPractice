/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 *
 * 1. 개요:
 * 2. 작성일:2017. 6. 13.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		List<Music> bList = new ArrayList<Music>();
		bList.add(new Music("팔레트", "아이유"));
		List<Music> dList = new ArrayList<Music>();
		dList.add(new Music("I LUV IT", "PSY"));
		dList.add(new Music("맞지?", "언니쓰"));
		Map<String, List<Music>> map = new HashMap<>();
		map.put("발라드", bList);
		map.put("댄스", dList);
		System.out.println("-- << 멜론 장르별 차트 >> --");
		printMap(map);
		
		dList.set(1, new Music("SIGNAL", "트와이스"));
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		printMap(map);
		
		dList.remove(0);
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		printMap(map);
		
		map.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for(Music m : map.get(key)) {
				System.out.println("" + (map.get(key).indexOf(m) + 1) + ". " + m);
			} 
		} System.out.println();
	}
}