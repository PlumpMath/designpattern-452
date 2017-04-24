package proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yongchang.li on 2017/3/24.
 */
public class LogHandler implements InvocationHandler {
	public Object sub;

	public LogHandler() {

	}

	public LogHandler(Object obj) {
		sub = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before you do thing");
		method.invoke(sub, args);
		System.out.println("after you do thing");
		return null;
	}
}
