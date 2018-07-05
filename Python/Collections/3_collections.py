"""
Collections

1. List
2. Tuple
3. Set
4. Dictionary

List is a collection which is ordered and changeable. Allows duplicate members.
Tuple is a collection which is ordered and unchangeable. Allows duplicate members.
Set is a collection which is unordered and unindexed. No duplicate members.
Dictionary is a collection which is unordered, changeable and indexed. No duplicate members.


"""


# List


# Initialize
thislist = ["apple", "banana", "cherry"]

# Using Constructor
thislist = list(("apple", "banana", "cherry"))

# Tuple 

# Initialize
thistuple = ("apple", "banana", "cherry")

# Using Constructor
thistuple = tuple(("apple", "banana", "cherry"))

# Set 

#Initialize 
thisset = {"apple", "banana", "cherry"}

# Using Constructor
thisset = set(("apple", "banana", "cherry")) # note the double round-brackets

# Collection

# Initialize
thisdict =    {
  "apple": "green",
  "banana": "yellow",
  "cherry": "red"
}

# Using Constructor
thisdict =    dict(apple="green", banana="yellow", cherry="red")
# note that keywords are not string literals
# note the use of equals rather than colon for the assignment
