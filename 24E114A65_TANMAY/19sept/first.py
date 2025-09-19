sc = int(input("Enter The Value: "))
x = 0
if sc > 0 :
    if sc <= 2:
        x = sc*10.5
    else:
        x = (2*10.5) + ((sc-2)*4) # first two : *2 , for next(-before) *4

    print(f"Ans is {x}")

else:
    print("Write a valid number")
