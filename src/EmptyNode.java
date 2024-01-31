public class EmptyNode implements ListOfInts{

  /**
   * Constructor
   */
  public EmptyNode() {
  }

  /**
   * add data to front
   * @param data adds to front
   * @return ListOfInts after add
   */
  @Override
  public ListOfInts prepend(int data) {
    return new ElementNode(data, this);
  }

  /**
   * add data to back
   * @param data adds to back
   * @return ListOfInts after add
   */
  @Override
  public ListOfInts append(int data) {
    return new ElementNode(data, this);
  }

  /**
   * inserts data to become the index'th element, before rest
   * @param data to be inserted
   * @param index the position
   * @return ListOfInts after insert
   */
  @Override
  public ListOfInts insertAtIndex(int data, int index) {
    if(index != 0){
      throw new IndexOutOfBoundsException("Index out of bounds ");
    }
    return new ElementNode(data, this);
  }

  /**
   * get data at index
   * @param  index of data
   * @return data at the index
   */
  @Override
  public int getDataAtIndex(int index) {
    throw new NullPointerException("Index is null");
  }

  /**
   *return list of all but the first
   * @param lst
   * @return list of all but the first
   */
  @Override
  public ListOfInts getRest(ListOfInts lst) {
    throw new NullPointerException("The rest is null");
  }

  /**
   *
   * @return the length of the list
   */
  @Override
  public int getCount() {
    return 0;
  }

  /**
   *
   * @return the sum of the elements in the list
   */
  @Override
  public int getSum() {
    return 0;
  }

  @Override
  public String toString() {
    return "EmptyNode";
  }
}
