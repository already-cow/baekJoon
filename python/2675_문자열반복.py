N = int(input())

for i in range(N):
    cnt, word = input().split()
    for x in word:
        print(x*int(cnt), end="")
    print()