import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by WangSong on 2018/7/16.
 */
public class TestErrorMessage {
    private static final Logger log = LoggerFactory.getLogger(TestErrorMessage.class);

    public static void main(String[] args) {

        try{
            Exception exception=new Exception("Exception messages!!!!");
            throw exception;
        }catch (Exception e){
//            log.error("打印的异常信息：{}",e.getMessage());
            log.error("打印的异常信息：",e.getMessage());
        }
    }
}
