N, X = list(map(int, input().split()))
A = list(map(int,input().split()))

lst = []
for i in A:
    if i < X:
        lst.append(i)

for x in range(len(lst)):
    print(lst[x], end=" ")