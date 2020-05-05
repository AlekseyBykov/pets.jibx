package alekseybykov.portfolio.jibx;

import alekseybykov.portfolio.jibx.ex01.Book;
import alekseybykov.portfolio.jibx.ex02.Publisher;
import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import org.junit.BeforeClass;

import java.io.InputStream;

public class JiBXTestBase {

	protected static IUnmarshallingContext unmarshallingContext;
	private static ClassLoader classLoader;

	@BeforeClass
	public static void setUp() {
		classLoader = JiBXTestBase.class.getClassLoader();
	}

	protected static void buildUnmarshallingContext(Class<?> clazz) throws JiBXException {
		IBindingFactory bindingFactory = null;
		if (clazz == Book.class) {
			bindingFactory = BindingDirectory.getFactory(Book.class);
		} else if (clazz == Publisher.class) {
			bindingFactory = BindingDirectory.getFactory(Publisher.class);
		}
		unmarshallingContext = bindingFactory.createUnmarshallingContext();
	}

	protected InputStream loadXml(String xml) {
		return classLoader.getResourceAsStream(xml);
	}
}
