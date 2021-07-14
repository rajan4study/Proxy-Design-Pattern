/**
 * 
 */
package com.study.pattern;

/**
 * @author
 *
 */
public class ProxyDbManager implements DbExecuter {
	
	DbUser user;
	boolean isAdmin;

	public ProxyDbManager(String userTyp, String password) {
		if(userTyp=="admin" && password=="admin") {
			isAdmin=true;
		}
		this.user=new DbUser();
	}

	@Override
	public void excuteQuery(String query) throws Exception {
		if(isAdmin) {
			System.out.println("Welcome Admin");
			user.excuteQuery(query);
		}else {
			if(query.equals("DELETE")) {
				throw new Exception("Delete operation not allowed for normal user");
			}else {
				System.out.println("Welcome user");
				user.excuteQuery(query);
			}
		}

	}

}
