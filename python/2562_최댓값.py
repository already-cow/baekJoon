list = []

for i in range(1, 10):
    i = int(input())  # list.append(input())
    list.append(i)

print(max(list))
print(list.index(max(list))+1)