#using right shift
def countBinaryNumbers(num):
    count = 0
    while num > 0:
        count += (num & 1)
        num >>=1
    return count
num = int(input("Enter the number: "))
count = countBinaryNumbers(num) 
print(f" binary representation of{num} is {count}.")