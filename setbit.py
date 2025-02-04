def convertBinary(n):
    if n == 0:
        return 0
    binary = ''
    while n > 0:
        binary = str(n % 2) + binary
        n = n // 2
    return binary

def setbitBinary(binary_str, index):
    if index < 0:
        return binary_str
    binary_str = binary_str.zfill(index + 1)
    binary_list = list(binary_str)
    binary_list[(index + 1)] = '1'
    return ''.join(binary_list) 

decimal = 4
binary_represent = convertBinary(decimal)
print(f"binary represent of {decimal}: {binary_represent}")

any_index = 1
newBinary_represent = setbitBinary(binary_represent, any_index)
print(f"binary represent after setting bit at index {any_index} to 1: {newBinary_represent}")


