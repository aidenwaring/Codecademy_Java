# Arrays

## Notes

Empty arrays have to be initialized with a fixed size:
```
String[] menuItems = new String[5];
```

Once you declare this size, it cannot be changed.
This array will always be of size 5.

When we use new to create an empty array, each element of the array is initialized with a specific value depending on 
what type the element is:

Data Type, Initialized Value

- int	    0
- double	0.0
- boolean	false
- Reference	null

Because a String is a reference to an Object, my_names will contain five nulls. 
my_ages will contain five 0s to begin with.