package alekseybykov.portfolio.jibx;

import org.jibx.runtime.JiBXException;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JiBXTest extends JiBXTestBase {

	@Test
	public void test() throws FileNotFoundException, JiBXException {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("book.xml");
		Book book = (Book) unmarshallingContext.unmarshalDocument(inputStream, null);
		assertNotNull(book);

		assertEquals("Name", book.getName());
		assertEquals("First Name", book.getAuthor().getFirstName());
		assertEquals("Last Name", book.getAuthor().getLastName());
	}
}
