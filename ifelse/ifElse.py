import math
import os
import random
import re
import sys

n = int(input("enter your number: ").strip())

if (n % 2 !=0) or (n>=6 and n<  20 and n%2==0):
    print ("Weird")
elif (n >2 and n<5 and n%2 ==0) or (n>20 and n%2 ==0):
    print ("Not Weird")

