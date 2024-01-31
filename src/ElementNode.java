public class ElementNode implements ListOfInts{
  int data;
  ListOfInts rest;

  /**
   * constructor
   * @param data in currentNode
   * @param rest of list
   */
  public ElementNode(int data, ListOfInts rest) {
    this.data = data;
    this.rest = rest;
  }

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
    this.rest = this.rest.append(data);
    return this;
  }

  /**
   * inserts data to become the index'th element, before rest
   * @param data to be inserted
   * @param index the position
   * @return ListOfInts after insert
   */
  @Override
  public ListOfInts insertAtIndex(int data, int index) {
    if(index == 0) {
      return new ElementNode(data, this);
    }
      rest = rest.insertAtIndex(data, index -1);
      return this;
  }

  /**
   * get data at index
   * @param  index of data
   * @return data at the index
   */
  @Override
  public int getDataAtIndex(int index) {
    if(index == 0){
      return this.data;
    }
    return this.rest.getDataAtIndex(index - 1);
  }

  /**
   *return list of all but the first
   * @param lst
   * @return list of all but the first
   */
  @Override
  public ListOfInts getRest(ListOfInts lst) {
    return this.rest;
  }

  /**
   *
   * @return the length of the list
   */
  @Override
  public int getCount() {
    return 1 + this.rest.getCount();
  }

  /**
   *
   * @return the sum of the elements in the list
   */
  @Override
  public int getSum() {
    return this.data + this.rest.getSum();
  }

  @Override
  public String toString() {
    return "ElementNode{" +
        "data=" + data +
        ", rest=" + rest +
        '}';
  }
}
