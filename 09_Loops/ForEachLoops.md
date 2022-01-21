# For Each Loops

## Notes

For-each loops, which are also referred to as enhanced loops, allow us to directly loop through each item in a list of items (like an array or ArrayList) and perform some action with each item.

```java
for (String item : itemList) {
    System.out.println(item);
}
```

First element is loop variable, second is a list to traverse through.

Note: if we try assign a new value to the enhanced loop variable, it will not change.
Each iteration is assigned a copy of the list element.

## Removing Elements During Traversal

When an element is removed from an ArrayList, all the items that appear after the removed element will have their index value shift by negative one.

When using a while loop and removing elements from an ArrayList, we should not increment the while loop’s counter whenever we remove an element. We don’t need to increase the counter because all of the other elements have now shifted to the left.

```java
int i = 0;
 
while (i < lst.size()) {
  // if value is odd, remove value
  if (lst.get(i) % 2 != 0){
    lst.remove(i);
  } else {
    // if value is even, increment counter
    i++;
  }
}
```