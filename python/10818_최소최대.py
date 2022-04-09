cnt = int(input())
num = list(map(int, input().split()))

lst = []
lst.append(min(num))
lst.append(max(num))

for i in range(len(lst)):
    print(lst[i], end=" ")