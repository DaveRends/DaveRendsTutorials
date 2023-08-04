# print("Type 'Python fileName.py' from the correct cmd context to run a python file")
# print("Or, since you have python installed on your machine, you can write and run Python directly in the terminal. Enter 'Python' to begin")

# Python uses indentation to indicate a block of code. Indentation like this must be consistent.

if 5 > 2:
  print("Five is greater than two!")

# Create a vaiable by assigning a value to it. They don't need an assigned type, and can even change type later

y = "Hello, World!" # String
print(y)
y = 8008135 # To an int
print(y)

# If you want to specify the data type of a variable, this can be done with casting.

x = str(3)    # x will be '3'
y = int(3)    # y will be 3
z = float(3)  # z will be 3.0

# You can get the data type of a variable with the type() function.

print(type(y))

# Python allows you to assign values to multiple variables in one line:

x, y, z = "Orange", "Banana", "Cherry"

# If you have a collection of values in a list, tuple etc. Python allows you to extract the values into variables. This is called unpacking.

fruits = ["apple", "banana", "cherry"]
x, y, z = fruits

# The best way to output multiple variables in the print() function is to separate them with commas, which even support different data types:

x = 5
y = "John"
print(x, y)

# If you create a variable with the same name inside a function, this variable will be local, and can only be used inside the function. 
# The global variable with the same name will remain as it was, global and with the original value.

x = "awesome" # Global variable

def myfunc():
  x = "fantastic" # Local variable
  print("Python is " + x)

myfunc()
print("Python is " + x)

# The global keyword before a local variable declaration can make it global

# Python datatypes - https://www.w3schools.com/python/python_datatypes.asp

