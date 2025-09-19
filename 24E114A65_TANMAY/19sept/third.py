import math

a = float(input("Enter Value of A: "))
b = float(input("Enter Value of B: "))
c = float(input("Enter Value of C: "))


d = b**2 - 4*a*c
if d > 0:
    root1 = (-b + math.sqrt(d))/ (2*a)
    root2 = (-b - math.sqrt(d))/ (2*a)
    print(f"Two Roots Are: {root1} And {root2}")
elif d == 0:
    root = -b / (2*a)
    print(f"Roots is: {root}")
else:
    print("No roots")