# Collections  Notes
_Java List_
- Ordered collection of elements.
- Allows duplicate elements.
- Implements dynamic arrays.
- **ArrayList**: Backed by an array, provides fast random access but slower insertion/deletion.
- **LinkedList**: Implements a doubly linked list, allowing fast insertion/deletion but slower random access.
- **Vector:** Similar to ArrayList but synchronized, ensuring thread safety at the cost of performance.

_Java Queue_
- Collection used to hold elements prior to processing.
**- Follows FIFO (First In, First Out) order.**
- Common implementations:
- **LinkedList:** Doubly linked list implementation, providing efficient insertion and removal from both ends.
- **PriorityQueue:** Orders elements based on a priority queueing scheme.
  

_Java Map_
- Stores key-value pairs.
- Keys are unique; values can be duplicated.
- Common implementations:
- **HashMap:** Offers constant-time performance for basic operations, with no guarantee of order.
- **TreeMap:** Implements a Red-Black tree, providing sorted order based on keys.
- **LinkedHashMap:** Preserves insertion order or access order, depending on the constructor used.


_Java Set_
- Collection that does not allow duplicate elements.
- Ensures uniqueness of elements.
- Common implementations:
- **HashSet:** Uses hashing to store elements, providing constant-time performance for basic operations.
- **TreeSet:** Maintains elements in sorted order using a Red-Black tree.
- **LinkedHashSet:** Preserves insertion order, combining features of HashSet and LinkedList.

_Java Iterator_
- Interface used to iterate through collections.
- Allows traversal of elements sequentially.
- Common methods:
- **hasNext()**: Checks if there are more elements to iterate over.
- **next()**: Retrieves the next element in the iteration.
- **remove()**: Removes the last element returned by the iterator (optional operation).
-Usage: Commonly used in loops to iterate through collections without exposing their internal structure.
-------------------------------------------------------------------------------
# 12A NOTES
- Collection is a object that holds references to other objects - known as data structures
- Object within the collection are known as elements
- Consists of interfaces, classes, and methods to store and manipulate data
- Some collections are ordered and not
- Collections itself is an interface
_Common Frameworks:_
- **Set**: unordered unique elements
- **Lists:** Ordered elements which can be accessed by posistions
-** Queue:** Ordered elements for processing Access in the order elements  were added "FIFO"
- **Map:** Unordered unique key - value pairs.

_-Set:_
Examples: HashSet, LinkedHashSet, and TreeSet**
- Use the add method to add
- Duplicates will not be stores

**Methods for set:**
- .add : Adds objects
- .clear : removes objects
- .contains : returns true if the collections has
- .isEmpty : retures true if  the collection has no objects
- .iterator: Returns an iterator objects for the collections, which may be used to retrieve an object
- .remove : Removes a specified object from the collection
- .size : Returns the number of elements in the collection
- - List.Of - you can add multiple objects, but it becoomes unchangeable list

_**- Lists: **_
- Lists are ordered
- Just like arrays the index starts at zero
- Elemts stay in the order you add them



**Methods for lists:**
- Add - inserts object into a list at position of index
- addAll - insters all elements of c into the list at position of index
- get - Returns the object stored at the specific index within the invoking collection
- indexOf - Returns true icf the collection has no elements
- lastIndexOf - returns the index of the first instance of obj in the list
- listIterator - returns the index of the last instance of obj in the list
- remove - removes the elements at position index and returns deleted element.
- Set - assigns obj to the location specified by index within the invoking list
- subList - Returns a list containing elements from start to end


_Queue:_
- Collections are ordered
- LinkedList and Priority Queue
- FIFO
- When you call a method the first one will be removed (Heaad)

**Methods for Queue:**
- add - adds elements to the tail of the queue
- peek - used to view the  head of the queue without removing it. returns false if queue is empty
- element - similar to peek but throws exception if queue is empty
- remove- removes and returns the head of thequeue . Throws exception if que is empty
- poll - similar to remove  but returns null if queue is empty

_Maps_
- Has unique keys but not values
- HashMap, treeMap, LinkedHashMap
- Map is technically not a collection
- When you put a new object with the same key the map will update it with new key
- entrySet will view

**Methods for Maps: **
- Clear - removes all key/value pairs from the map
- containsKeu - returns true if the map contains an element that has key
- contains Value -retruns true if the map contains an element that has that value
- entrySet - returns a set that contains the entries in the map.
- get - returns the value associated with that key
- isEmpty -  returns true if the map is empty. Otherwise returns false.
- keyset - returns a  set that contains the keys in  the map
- put - Puts an entry in the map, overwriting any previous value aassociated with the key
- putAll - puts all the entries from m into this  map
- putIfAbsent - puts an entry in the map if the  key does not already exist
- remove - removes the entry whose key equals key


----------------------------------------------------------------------------------------------------------------
# 12B NOTES
