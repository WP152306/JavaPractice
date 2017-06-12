/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_Music
 *
 * 1. 개요:
 * 2. 작성일:2017. 6. 12.
 * </pre>
 *
 * @author : 김민준
 * @version : 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String toString() {
		return title + " ("+singer+")";
	}	
}