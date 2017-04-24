package proxypattern;

/**
 * Created by yongchang.li on 2017/3/24.
 */
public class HelloSpeaker implements IHello{
    @Override
    public void hello(String name) {
        System.out.println("hello,"+name);
    }
}
