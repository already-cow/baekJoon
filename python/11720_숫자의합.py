a = int(input())
b = input()
list = []

for i in range(0, a):
    list.append(int(b[i]))

b = sum(list)
print(b)