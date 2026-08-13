 Collections Framework 

Array List   2) List      3)HashMap 

Growable in nature 

Homogeneous and Heterogenous data 

Implement data structure 

Collection (Interface) 

List.  2)Set.  3) queue 

Collection Interface Method 

Add  b) AddAll (collection Name).  c) Remove (object Name)      d) RemoveAll (Object Name)     e) RetainAll(collection name) 

 

 

Array: 

Size is fixed (not growable nature) 

Homogenious data 

Readymade methods are not there in array 

 

Here's the core difference: 

 

Array 

ArrayList 

Size 

Fixed at creation — can't grow or shrink 

Dynamic — grows/shrinks automatically 

Type 

Can hold primitives (int[], char[]) or objects 

Only objects (primitives get autoboxed, e.g. int → Integer) 

Performance 

Faster — no overhead, direct memory access 

Slightly slower — extra overhead from resizing, boxing 

Syntax 

int[] arr = new int[5]; 

ArrayList<Integer> list = new ArrayList<>(); 

Multi-dimensional 

Supports directly (int[][]) 

No direct support — need nested ArrayLists 

Methods 

Minimal — just length field 

Rich API — add(), remove(), contains(), indexOf(), etc. 

Adding/removing elements 

Not possible after creation (must create a new array) 

add() / remove() handle it for you 

 

LinkedList 

If Insertion/deletion are more than LinkedList is good 

More number of retiring happened then ArrayList is prefer 

LinkedList most of the time use for stack and queue operation (stack means LIFO concept) and Queue is FIFO concept 

 

Duplicate not allow 

Insertion order not allow 

HashCode 

Heterogions is allow 

Null is allow 

HashSet there is no index order 

 

When more operation for searching HashSet is suitable 

For new HashSet by default 16 location are created and load factor is 75%. When the 75% location is filled it will create new hashSet and copy the all element from old hashSet.  

In HashSet we can define the load factor also. The defult the load factor is 75% but we can define the load factor.  

 

Priority Queue 

Insertion order allow 

Duplicate data allow 

Heterogenous data not allow 

In Queue add new element from tail position 

Methods are available in queue 

Add-> if the add successful it will give True response but if not success then it will give exception 

Offer--> if the add successful it will give True response but if not success then it will give false 

Element --> return the element from the head. If the head is empty, it will give the exception.  

Peek-->return the element from the head. If the head is empty, it will give the null. 

Remove-->return the element from the head and remove the element from the queue. If queue empty, it will give the exception 

Poll-->return the element from the head and remove the element from the queue. If queue empty, it will give the null.  

 

 

Map 

When we need data key and data means key value pair we use the MAP. 

Every key is object and every value is the object 

Duplicate key is not allow but duplicate value is allowed 

Hashmap 

Underlaying data structure is Hash table 

Insertion order preserve 

Duplicate key does not allow 

Duplicate value is allowed 

Null key allow only once time 

Null value is allow multiple time 

Method in HashMap 

put 

PutAll 

Get 

Remove 

ContainKey 

ContainValue 

IsEmpty 

Size 

Clear 

Keyset (return all key 

Values (return all values) 

EntrySet (return all set) 

 

OOP 

Method: block or group statement which will perform certain task. We need to call the method through the object. 

No parameter             No return value 

No parameter	return value 

Takes para		No return value 

Takes para		return value 

When a method returns an output, we need to hold that result in a variable. Output can be a string or Int or Boolean,  

Ex: String s=gr. M2() 

 

How many ways we can store data into variables 

Using Object reference variables 

Create object in main method with class name then assign the value 

Student stu=new student();  here student is class name 

Stu.id=101 

Using method 

Create a method and assign variable in locally or can take parameter 

Void studentData (int ID) 

Using constructor 

Main purpose constructor is just assign value to variable 

Constructor name always same as class name 

Constructor never return any value 

Constructor can take parameter 

To invoke the contractor we do not need to call constructor. At the time of object create, the constructor invoke automatically.  

 

 

Constructor VS method 

Method name can be anything but Constructor name always same as class 

Method may or may not return value but Constructor never return any value 

Method can take parameter and Constructor also can take parameter 

Contractor only for initialize data but in method you can return data or specifying logic 

 

 

Polymorphism 

We can achieve polymorphism using overloading. 

We can create method with same name 

Note: We can create method overload for main method also with below 4 rules. But we need call the method in main method only by creating object.   

When we do overload 4 rules we need to follow 

Method names should be same 

Number of parameters should be different 

Data type of parameters should be different 

Order of parameter should be different 

Note: Return type is not considerable in method overloading. Name are same and parameters are then it will be considered as a duplicate.  

 

Encapsulation 

Wrapping up of data and methods into single unit(class) 

All variables should be private 

For every variable there should be 2 methods (Get and Set) 

Variables can be operated only through methods.  

Note: When we are using class variable and method variable same. To differentiate we need to use ‘This” key word. This key word refer to class level variable.  

This Keyword: This keyword represent class/object. 

2 types of variables 

Class variables/Instance variable 

Local variables 

Static 

Static key word we can apply in variable or method 

When a value common in multiple place we can use the static keywork for variable or method. 

Static methods can access static stuff directly (without creating object) 

Static methods can access non-static stuff through object 

Non-static methods can access everything directly 

System.out.println: System is predefine class in Java, out is a static variable, println method is belongs to PrintStream class.  

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 
