hour, min = map(int,input().split())
set = int(input())

if hour < 23 and min+set >= 60:
    a = (min+set)//60
    b = (min+set)%60
    print(hour+a, b)
elif hour == 23 and min+set >= 60:
    a = (min+set)//60
    b = (min+set)%60
    print(a-1,b)
else:
    print(hour, min+set)