hour, min = map(int, input().split())

if 45 <= min:
    print(hour, min-45)
elif hour == 0 and min < 45:
    print(23, min+15)
else:
    print(hour-1, min+15)