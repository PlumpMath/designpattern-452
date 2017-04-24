package proxypattern;

import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * Created by yongchang.li on 2017/3/24.
 */
public class ProxyDemoTest {
	// 静态代理
	@Test
	public void staticProxyTest() {
		HelloSpeaker helloSpeaker = new HelloSpeaker();
		IHello helloProxy = new HelloProxy(helloSpeaker);
		helloProxy.hello("lyc");

	}

	// 动态代理
	@Test
	public void dynamicProxyTest() {

		HelloSpeaker helloSpeaker = new HelloSpeaker();
		LogHandler logHandler = new LogHandler(helloSpeaker);
		Class aClass = helloSpeaker.getClass();
		IHello iHello = (IHello) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), logHandler);
		iHello.hello("tt");

	}

}
