a, b = input().split()
a = int(a)
b = int(b)

if a > b:
    print(">")
else:
    if a < b:
        print("<")
    else:
        print("==")