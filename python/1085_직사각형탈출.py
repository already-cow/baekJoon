x, y, w, h = list(map(int, input().split()))
answer = min(x, y, w-x, h-y)
print(answer)