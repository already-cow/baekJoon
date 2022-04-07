num = input().split()
lst = []

for i in num:
    lst.append(int(i[::-1]))

print(max(lst))