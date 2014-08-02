/*
 * 
 * 
 */
package smtphandler;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

class UsernamePasswordAuthenticator extends Authenticator
{
	private PasswordAuthentication auth = null;
	
	public UsernamePasswordAuthenticator(String user, String password)
	{
		auth = new PasswordAuthentication(user, password);
	}
	
	public PasswordAuthentication getPasswordAuthentication()
	{
		return auth;
	}
	

}
