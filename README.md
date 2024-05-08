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
