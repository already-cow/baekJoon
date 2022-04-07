num1 = int(input())
num2 = int(input())
num3 = int(input())

multi = num1 * num2 * num3
lst = []
for i in str(multi):
    lst.append(i)

for x in range(0, 10):
    print(lst.count(str(x)))