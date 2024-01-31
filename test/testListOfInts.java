import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class testListOfInts {

  
  @Test
  public void testPrepend() {
    // Test  EmptyNode
    ListOfInts emptyNode = new EmptyNode();
    ListOfInts listOfInts = emptyNode.prepend(10);
    assertEquals("ElementNode{data=10, rest=EmptyNode}", listOfInts.toString());

    // Test  ElementNode
    ListOfInts ElementList = new ElementNode(10, new EmptyNode());
    ElementList = ElementList.prepend(5);
    assertEquals("ElementNode{data=5, rest=ElementNode{data=10, rest=EmptyNode}}", ElementList.toString());
  }
  @Test
  public void testAppend(){
    // Test EmptyNode
    ListOfInts emptyNode = new EmptyNode();
    ListOfInts listOfInts = emptyNode.append(10);
    assertEquals("ElementNode{data=10, rest=EmptyNode}", listOfInts.toString());

    // Test ElementNode
    ListOfInts ElementList = new ElementNode(10, new EmptyNode());
    ElementList = ElementList.append(5);
    assertEquals("ElementNode{data=10, rest=ElementNode{data=5, rest=EmptyNode}}", ElementList.toString());
  }
  @Test
  public void testInsertAtIndex() {
    ListOfInts ElementList = new ElementNode(10,new EmptyNode());
    ElementList = ElementList.insertAtIndex(5,0);

    assertEquals("ElementNode{data=5, rest=ElementNode{data=10, rest=EmptyNode}}", ElementList.toString());
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testInsertIndexWithException() throws Exception{
    ListOfInts ElementList = new ElementNode(10,new EmptyNode());
    ElementList.insertAtIndex(5,5);
  }

  @Test
  public void testGetDataAtIndex() {
    ListOfInts ElementList = new ElementNode(10,new EmptyNode());
    ElementList = ElementList.prepend(5);
    int target = ElementList.getDataAtIndex(1);
    assertEquals(10, target);
  }

  @Test(expected = NullPointerException.class)
  public void testGetDataAtIndexWithException() {
    ListOfInts ElementList = new ElementNode(10,new EmptyNode());
    int target = ElementList.getDataAtIndex(5);
  }
  @Test
  public void testGetRest() {
    ListOfInts ElementList = new ElementNode(10,new EmptyNode());
    ElementList = ElementList.prepend(5);
    assertEquals("ElementNode{data=10, rest=EmptyNode}", ElementList.getRest(ElementList).toString());
  }

  @Test(expected = NullPointerException.class)
  public void testGetRestWithException() {
    ListOfInts emptyNode = new EmptyNode();
    ListOfInts rest = emptyNode.getRest(emptyNode);
  }

  @Test
  public void testGetCount() {
    ListOfInts ElementList = new ElementNode(10,new EmptyNode());
    ElementList = ElementList.prepend(5);
    assertEquals(2, ElementList.getCount());
  }

  @Test
  public void testGetSum() {
    ListOfInts ElementList = new ElementNode(10,new EmptyNode());
    ElementList = ElementList.prepend(5);
    assertEquals(15, ElementList.getSum());
  }

}
