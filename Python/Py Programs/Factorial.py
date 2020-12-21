# @Author: Aayush Joshi SE4_14
# @Date:   2020-09-22T18:55:27+05:30
# @Email:  aayush.joshi_19@sakec.ac.in
# @Project: Programming
# @Filename: Factorial.py
# @Last modified by:   Aayush Joshi SE4_14
# @Last modified time: 2020-09-23T00:39:24+05:30
# Python program to find the factorial of a number provided by the user.
import time
# change the value for a different result
num = 1000

# To take input from the user
#num = int(input("Enter a number: "))

factorial = 1

# check if the number is negative, positive or zero
if num < 0:
   print("Sorry, factorial does not exist for negative numbers")
elif num == 0:
   print("The factorial of 0 is 1")
else:
   for i in range(1,num + 1):
       factorial = factorial*i
   print("The factorial of",num,"is",factorial)
