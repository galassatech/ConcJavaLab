package Exercise2;

/**
 * The set of integers
 */
public interface IntegerSet {
	/**
	 * Adds an element to the set. Returns true if the element was added successfully,
	 * false if the element was already in the set
	 */
	boolean add(int i);

	/**
	 * Removes an element from the set. Returns true if the element was removed from the set,
	 * false if there was no element in the set
	 */
	boolean remove(int i);

	/**
	 * Returns true if the set contains the given element, false otherwise
	 */
	boolean contains(int i);
}
