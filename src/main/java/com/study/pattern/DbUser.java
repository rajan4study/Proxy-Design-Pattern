/**
 * 
 */
package com.study.pattern;

/**
 * @author 
 *
 */
public class DbUser implements DbExecuter {

	@Override
	public void excuteQuery(String query) {
		System.out.println("Executing query...");

	}

}
