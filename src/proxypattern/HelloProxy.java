package proxypattern;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by yongchang.li on 2017/3/24.
 */
public class HelloProxy implements IHello {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private IHello helloObject;

    public HelloProxy(IHello helloObject) {
        this.helloObject = helloObject;
    }

    @Override
    public void hello(String name) {
        log("hello method starts..");
        helloObject.hello(name);
        log("hello method ends..");


    }

    public void log(String msg) {
        logger.log(Level.INFO, msg);
    }
}
