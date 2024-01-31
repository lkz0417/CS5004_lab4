

public interface ListOfInts {

  /**
   * add data to front
   * @param data adds to front
   * @return ListOfInts after add
   */
  ListOfInts prepend(int data);

  /**
   * add data to back
   * @param data adds to back
   * @return ListOfInts after add
   */
  ListOfInts append(int data);

  /**
   * inserts data to become the index'th element, before rest
   * @param data to be inserted
   * @param index the position
   * @return ListOfInts after insert
   */
  ListOfInts insertAtIndex(int data, int index);

  /**
   * get data at index
   * @param  index of data
   * @return data at the index
   */
  int getDataAtIndex(int index);

  /**
   *return list of all but the first
   * @param lst
   * @return list of all but the first
   */
  ListOfInts getRest(ListOfInts lst);

  /**
   *
   * @return the length of the list
   */
  int getCount();

  /**
   *
   * @return the sum of the elements in the list
   */
  int getSum();

}
