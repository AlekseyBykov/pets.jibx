package alekseybykov.portfolio.jibx;

import org.jibx.runtime.JiBXException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JiBXTest extends JiBXTestBase {

	@Test
	public void test() throws JiBXException {
		Book book = (Book) unmarshallingContext.unmarshalDocument(loadXml("book.xml"), null);
		assertNotNull(book);

		assertEquals("Name", book.getName());
		assertEquals("First Name", book.getAuthor().getFirstName());
		assertEquals("Last Name", book.getAuthor().getLastName());
	}
}
