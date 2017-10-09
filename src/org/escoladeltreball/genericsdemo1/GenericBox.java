/**
 * 
 */
package org.escoladeltreball.genericsdemo1;

/**
 * @author iaw21752927
 *
 */
public class GenericBox<T> {
	private T content;

	/**
	 * @param content
	 */
	public GenericBox(T content) {
		this.content = content;
	}

	/**
	 * @return the content
	 */
	public T getContent() {
		return content;
	}
	
	
	
}
