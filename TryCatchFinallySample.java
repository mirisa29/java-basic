
import java.util.logging.Logger;

public class TryCatchFinallySample {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TryCatchFinallySample.class.getName());
		try {
			logger.warning("WARNING");
			throw new NullPointerException();
		} catch (Exception e) {
			logger.severe("SEVERE");
		} finally {
			logger.info("INFO");
		}
	}

}
