largest = None
smallest = None
while True:
    num = input("Enter a number: ")
    if num == "done":
        break
    try:
        fnum = float(num)
    except:
        print("invalid input")
        continue
    if largest is None:
        largest = fnum
    elif fnum > largest:
        largest = fnum

    if smallest is None:
        smallest = fnum
    elif fnum < smallest:
        smallest = fnum
print("Maximum",largest)
print("Minimum",smallest)
