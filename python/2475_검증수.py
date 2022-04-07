lst = map(int, input().split())
sum = 0

for i in lst:
    a = i ** 2
    sum += a

print(sum%10)