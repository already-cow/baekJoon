N = int(input())

lst = []
for i in range(N):
    lst.append(input())

lst = list(set(lst))

array = []
for x in lst:
    array.append((len(x),x))

result = sorted(array)
for a, b in result:
    print(b)