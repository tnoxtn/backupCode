container1 = int(input("Enter No Of Container having 1 liter: "))
container2 = int(input("Enter No Of Container having more than 1 liter: "))

ans1 = container1*0.10
ans2 = container2*0.25

print(f"Refund of Container having 1L: ${ans1:.2f}\nRefund of Container having more than 1L: ${ans2:.2f}\nTotal Refund: ${(ans1+ans2):.2f}")

# Enter No Of Container having 1 liter: 2
# Enter No Of Container having more than 1 liter: 5
# Refund of Container having 1L: $0.20
# Refund of Container having more than 1L: $1.25
# Total Refund: $1.45