
def digitCount(digits):
    if(digits == 0):
        return 0
    return digitCount(int(digits/10)) + 1

digits = 4666
digitCount = len(str(digits))
print(digitCount) 