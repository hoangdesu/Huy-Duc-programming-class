def swap(x, y):
    tmp = x
    x = y
    y = tmp
    print('Inside swap:')
    print('x:', x)
    print('y:', y)
    # function ends
    
x = 1
y = 2

# tmp = x
# x = y
# y = tmp
swap(x, y)
# swap(1, 2)

print(x) # 2
print(y) # 1