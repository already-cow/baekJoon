a = int(input())
b = list(map(int, input().split()))
cnt = 0  # 소수의 개수

for i in b:
    c = 0
    if i > 1:
        for x in range(2, i):
            if i % x == 0:
                c += 1
            
        if c == 0:
            cnt += 1

print(cnt)