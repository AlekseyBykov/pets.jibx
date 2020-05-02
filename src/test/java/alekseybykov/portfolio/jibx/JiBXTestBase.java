package alekseybykov.portfolio.jibx;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import org.junit.BeforeClass;

public class JiBXTestBase {

	protected static IUnmarshallingContext unmarshallingContext;

	@BeforeClass
	public static void setUp() throws JiBXException {
		IBindingFactory bindingFactory = BindingDirectory.getFactory(Book.class);
		unmarshallingContext = bindingFactory.createUnmarshallingContext();
	}
}
