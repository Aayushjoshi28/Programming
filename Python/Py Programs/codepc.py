def pattern(n) :
    if n % 2 != 0:
        n = n + 1

    # For printing upper portion
    c1 = (n - 1) // 2

    # For printing lower portion
    c2 = 3 * n // 2 - 1

    # Loop denoting rows
    for i in range(0 , n) :
        # Loop denoting columns
        for j in range(0 , n) :

            # Checking conditions for
            # printing pattern
            if (i + j == c1 or i - j == c1 or
                j - i == c1 or i + j == c2) :
                print( "*",end = "")
            elif (i == c1 or j == c1):
                print("+",end = "")
            else :
                print(" ",end = "")

        print("")
n = 11
pattern(n)
