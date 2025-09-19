item = float(input("Enter the cost of the meal: "))

tax = item * 0.05
tip = item * 0.18
total = item + tax + tip

print(f"Tax is ${tax:.2f}")
print(f"Tip is ${tip:.2f}")
print(f"Item is ${item:.2f}")
print(f"Total is ${total:.2f}")


# Enter the cost of the meal: 23
# Tax is $1.15
# Tip is $4.14
# Item is $23.00
# Total is $28.29