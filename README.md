# DataStructuresFinalProject

For the final project we desided to just implement all data structure consepts. especially, we will take a deep look at search algorithms since this is one of the most important data structures/algorithms concept. 

## Team members

Bakytbek uulu Zhanbolot </br>
Alisher Kachykeev



# Linear search 

Linear or Sequential Search is the simplest of search algorithms. While it most certainly is the simplest, it's most definitely not the most common, due to its inefficiency. It's a brute-force algorithm. Very rarely is it used in production, and in most cases, it's outperformed by other algorithms.

![6](https://user-images.githubusercontent.com/57888663/117495858-d9d09e00-af7e-11eb-9dfa-6a02473dd842.PNG)

Linear Search has no pre-requisites for the state of the underlying data structure

## Implementation

Now let's see how to implement Linear Search in Java:

![1](https://user-images.githubusercontent.com/57888663/117490154-1c8e7800-af77-11eb-9321-5ff71e9e65c0.PNG)


## Time complexty

Here we are iterating through the entire set of N elements sequentially to get the location of the element being searched. The worst case for this algorithm will be if the element we are searching for is the last element in the array.

In this case, we will iterate N times before we find the element.

Hence, the Time Complexity of Linear search is **O(N)**.

**The advantage of linear search is that the array may not be sorted**

# Binary Search

Binary or Logarithmic Search is one of the most commonly used search algorithms primarily due to its quick search time.
This kind of search uses the Divide and Conquer methodology and requires the data set to be sorted beforehand.

It divides the input collection into equal halves, and with each iteration compares the goal element with the element in the middle.

If the element is found, the search ends. Else, we continue looking for the element by dividing and selecting the appropriate partition of the array, based on if the goal element is smaller or bigger than the middle element.

This is why it's important to have a **sorted collection** for Binary Search.

The search terminates when the **left** (our pointer) goes past **right** (last element), which implies we have searched the whole array and the element is not present.

### 1 step
![3](https://user-images.githubusercontent.com/57888663/117492481-544aef00-af7a-11eb-898f-ee1c4e7511dc.PNG)

We compared middle elemet which is 5 with the searching number and our number is bigger than middle element. consequently the left side from middle are all smaller than 
our number. And there is no need to search from left side so we shift our left point to middle + 1 because middle is also is also smaller than searching number

### 2 step
![4](https://user-images.githubusercontent.com/57888663/117493434-a7717180-af7b-11eb-8a81-729dad5d6c7a.PNG)

Now midle element is array[(5 + 7)/2 = 6.5 and thats 6] ==> 7 . searching number is bigger than middle element and we shift left to middle + 1.

### 3 step

![5](https://user-images.githubusercontent.com/57888663/117494222-b4db2b80-af7c-11eb-8466-d7f151344075.PNG)

Now left point is 7 and right point is 8 array[(7 + 8) / 2 == 7.5 and that is 7 because we are using ing data type] 

and array[7] == n then **iteration** because  return stops the program 

as you see we made 3 iteration to find the index of searching element  **Log2(9) = 3.xxxxxxx** O(log2(N)) while in linear search we made 8 iterations O(N).
## Implementation

Now let's see how to implement Binary search in Java

![2](https://user-images.githubusercontent.com/57888663/117491898-81e36880-af79-11eb-9c98-f51813a7fca4.PNG)

## Time Complexity
Since Binary Search divides the array into half each time its time complexity is **O(log2(N))** where n is the size of the array. This time complexity is a marked improvement on the O(N) time complexity of Linear Search.


# Ternary Search

Ternary search is a divide and conquer algorithm that can be used to find an element in an array. It is similar to binary search where we divide the array into two parts but in this algorithm, we divide the given array into three parts and determine which has the key (searched element). We can divide the array into three parts by taking mid1 and mid2 which can be calculated as shown below. Initially, l and r will be equal to 0 and n-1 respectively, where n is the length of the array. 

lets visualize we have an array consisting 10 numbers arr[1.2.3.4.5 ..... 10]

mid1 = l + (r-l)/3 </br>
mid2 = r – (r-l)/3 </br>
</br>
mid1 = 0 + (9 - 0) / 3 == > 3 </br>
mid2 = 9  - (9-0) / 3 == > 6 </br>

![8](https://user-images.githubusercontent.com/57888663/117500032-be689180-af84-11eb-9828-ca2fe63e28ae.PNG)

 **if** searching number 6 < arr[mid1 == 3] = 4 - not true statment </br>
 **if** searcjing number 6 > arr[mid2 == 6] = 7 - not true statment </br>
 **else** 
 l = mid1 + 1 ==> l = 4
 r = mid2 - 1 ==> r = 6
 
 and we are iterating **while r>=l**
 
 ## Implementation

Now let's see how to implement Ternary Search in Java:

![9](https://user-images.githubusercontent.com/57888663/117501038-31bed300-af86-11eb-90ab-d0829d94e443.PNG)


## Time Complexity: 

**O(log3(n))** where n is the size of the array,
and its a little bit faster than binary search.

# Java Collections API

Now that we have seen the implementation of multiple algorithms in Java, let's also take a brief look at the way searching is performed in different Java Collections.

## Arrays
Arrays in Java can be searched using one of the **java.util.BinarySearch methods**. The binary Search in the Open JDK version uses the iterative form of the search.

Let's take a quick look at how we can use this method:
 ### Implementation
 
 ![10](https://user-images.githubusercontent.com/57888663/117502879-d80bd800-af88-11eb-8fc4-b2fda6e0845f.PNG)
