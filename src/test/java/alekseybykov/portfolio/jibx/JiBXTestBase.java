package alekseybykov.portfolio.jibx;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import org.junit.BeforeClass;

import java.io.InputStream;

public class JiBXTestBase {

	private static ClassLoader classLoader;
	protected static IUnmarshallingContext unmarshallingContext;

	@BeforeClass
	public static void setUp() throws JiBXException {
		IBindingFactory bindingFactory = BindingDirectory.getFactory(Book.class);
		unmarshallingContext = bindingFactory.createUnmarshallingContext();
		classLoader = JiBXTestBase.class.getClassLoader();
	}

	protected InputStream loadXml(String xml) {
		return classLoader.getResourceAsStream(xml);
	}
}
