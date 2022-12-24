import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class Learn13 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Learn13.class.getName());
        logger.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            // TODO: 使用logger.severe()打印异常
            logger.severe(e.toString());
        }
        logger.info("Process end.");
    }
}
