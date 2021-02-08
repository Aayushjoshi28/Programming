import re
handle = open('actual.txt')
numlist = list()
for line in handle:
    line = line.rstrip()
    stuff = re.findall('[0-9]+',line)
    for num in stuff:
        num = int(num)
        numlist.append(num)
print(sum(numlist))
