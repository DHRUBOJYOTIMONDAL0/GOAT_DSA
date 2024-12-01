def convertBinary(n):
    if n == 0:
        return '0'
    binary = ''
    while n > 0:
        binary = str(n % 2) + binary
        n = n // 2
    return binary

def clearbitBinary(binary_str, index):
   
    binary_str = binary_str.zfill(index + 1)
    
    binary_list = list(binary_str)
    binary_list[len(binary_list) - 1 - index] = '0'  
    return ''.join(binary_list)

decimal = int(input("Enter a decimal number: "))
binary_represent = convertBinary(decimal)
print(f"Binary representation of {decimal}: {binary_represent}")

any_index = int(input("Enter any number of index: "))
newBinary_represent = clearbitBinary(binary_represent, any_index)
print(f"Binary representation after clearing bit at index {any_index}: {newBinary_represent}")





def two_sum(number, target):
    num_dict = {}
    for index, num in enumerate(number):
        if (complement := target - num) in num_dict:
            return [num_dict[complement], index]
        num_dict[num] = index  

number = [2, 7, 11, 15]
target = 9
result = two_sum(number, target)
print(result)
