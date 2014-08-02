
import java.util.logging.Logger;
import java.util.logging.LogManager;
import java.util.logging.Level;
import java.util.logging.Handler;
import java.io.*;

/**
 * 
 * @author Sean C. Sullivan
 *
 * 
 */
public class SimpleLoggingApp
{
	private static final Logger log = Logger.getLogger(SimpleLoggingApp.class.getName());
	private static final Logger root = Logger.getLogger("");
	
	public static void main(String[] args) throws java.io.IOException
	{
		// For ease of development, this application will directly  
		// configure the LogManager
		// 
		LogManager.getLogManager().readConfiguration(getLoggingConfiguration());
		
		log.finest("This is a finest message");
		log.finer("This is a finer message");
		log.fine("This is a fine message");
		log.config("This is a config message");
		
		Handler[] handlers = root.getHandlers();
		StringBuffer sbHandlers = new StringBuffer();
		sbHandlers.append("Root logger handlers: ");
		
		if (handlers.length < 1)
		{
			sbHandlers.append("none");
		}
		else
		{
			for (int i = 0; i < handlers.length; i++)
			{
				sbHandlers.append(handlers[i].getClass().getName());
				if (i < (handlers.length - 1))
				{
					sbHandlers.append(", ");
				}
			}
		}
		log.config(sbHandlers.toString());
		
		log.info("This is an info message");
		log.warning("This is a warning message");
		log.severe("This is a severe message");
		
		try
		{
			String nullObject = null;
			nullObject.toString();
		}
		catch (Exception ex)
		{
			log.log(Level.SEVERE, "caught an exception", ex);
		}
	}
	
	static private java.io.InputStream getLoggingConfiguration()
	{
		StringBuffer sb = new StringBuffer();
		
		sb.append("handlers=java.util.logging.ConsoleHandler,smtphandler.SMTPHandler");
		sb.append("\n");
		sb.append(".level= FINEST");
		sb.append("\n");

		// properties for the ConsoleHandler
		sb.append("java.util.logging.ConsoleHandler.level=FINEST");
		sb.append("\n");
		sb.append("java.util.logging.ConsoleHandler.formatter=java.util.logging.SimpleFormatter");
		sb.append("\n");

		// properties for SMTPHandler
		sb.append("smtphandler.SMTPHandler.level=WARNING");
		sb.append("\n");
		sb.append("smtphandler.SMTPHandler.smtpHost=127.0.0.1");
		sb.append("\n");
		sb.append("smtphandler.SMTPHandler.to=neo@localhost");
		sb.append("\n");
		sb.append("smtphandler.SMTPHandler.from=appserver@server3");
		sb.append("\n");
		sb.append("smtphandler.SMTPHandler.subject=[SMTPHandler] Message from SimpleApp");
		sb.append("\n");
		sb.append("smtphandler.SMTPHandler.bufferSize=512");
		sb.append("\n");
		sb.append("smtphandler.SMTPHandler.formatter=java.util.logging.SimpleFormatter");
		sb.append("\n");
		
		InputStream is = new ByteArrayInputStream(sb.toString().getBytes());
		
		return is;
	}
}
