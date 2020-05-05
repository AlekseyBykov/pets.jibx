package alekseybykov.portfolio.jibx;

import alekseybykov.portfolio.jibx.ex01.Book;
import alekseybykov.portfolio.jibx.ex02.Owner;
import alekseybykov.portfolio.jibx.ex02.Publisher;
import org.jibx.runtime.JiBXException;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JiBXTest extends JiBXTestBase {

	@Test
	public void testUnmarshalBook() throws JiBXException {
		buildUnmarshallingContext(Book.class);
		Book book = (Book) unmarshallingContext.unmarshalDocument(loadXml("book.xml"), null);
		assertNotNull(book);

		assertEquals("Name", book.getName());
		assertEquals("First Name", book.getAuthor().getFirstName());
		assertEquals("Last Name", book.getAuthor().getLastName());
	}

	@Test
	public void testUnmarshalPublisher() throws JiBXException {
		buildUnmarshallingContext(Publisher.class);
		Publisher publisher = (Publisher) unmarshallingContext.unmarshalDocument(loadXml("publisher.xml"), null);
		assertNotNull(publisher);

		assertEquals("City", publisher.getCity());
		assertEquals("State", publisher.getState());
		assertEquals("Street", publisher.getStreet());
		assertEquals("123-456-789", publisher.getPhone());
		assertNull(publisher.getZip());

		Owner owner = publisher.getOwner();
		assertNotNull(owner);

		assertEquals(123456789, owner.getId());
		assertEquals("First Name", owner.getFirstName());
		assertEquals("Last Name", owner.getLastName());
	}
}
