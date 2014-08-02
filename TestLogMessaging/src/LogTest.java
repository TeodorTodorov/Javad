import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class LogTest {
	  private static Logger LOGGER = Logger.getLogger("InfoLogging");

	public static void main(String[] args) {
		
		
		final InputStream inputStream = LogTest.class.getResourceAsStream("logging.properties");
		try
		{
		 
			LogManager.getLogManager().readConfiguration(inputStream);
		}
		catch (final IOException e)
		{
		    Logger.getAnonymousLogger().severe("Could not load default logging.properties file");
		    Logger.getAnonymousLogger().severe(e.getMessage());
		}
		
		LogTest logTest = new LogTest();
		logTest.doSomething();
		
	}
	private void doSomething  () {
		LOGGER.fine("helloFine");
		LOGGER.warning("warning");
		
		

	}

}
