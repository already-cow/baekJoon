hour, min = map(int,input().split())
set = int(input())

if min+set >= 60:
    a = (min+set) // 60
    b = (min+set) % 60
    if hour+a >= 24:
        print(hour+a-24,b)
    elif hour+a < 24:
        print(hour+a,b)
else:
    print(hour, min+set)
