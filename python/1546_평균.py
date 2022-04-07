cnt = int(input())
score = list(map(int, input().split()))

sum = 0
M = max(score)

for i in score:
    sum += i/M*100

print(sum/cnt)