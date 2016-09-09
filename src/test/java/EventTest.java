import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  private Event mEvent;

  @Before
  public void initialize() {
    mEvent = new Event("JavaMania - West", "October 17, 2017", "Oregon Convention Center", 1);
  }

  @Test
  public void getEventName_returnsName_String() {
    assertEquals("JavaMania - West", mEvent.getEventName());
  }

  @Test
  public void getEventDate_returnsDate_String() {
    assertEquals("October 17, 2017", mEvent.getEventDate());
  }

  @Test
  public void getEventVenue_returnsVenue_String() {
    assertEquals("Oregon Convention Center", mEvent.getEventVenue());
  }

  @Test
  public void getEventType_returnsType_String() {
    assertEquals("Conference", mEvent.getEventType());
  }

  @Test
  public void getEventTypeCost_returnsBaseEventCost_int() {
    assertEquals(1500, mEvent.getEventTypeCost());
  }
}
