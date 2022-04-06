a = int(input())

for i in range(a):
    lst = list(input())
    score = 0
    c = 1
    for x in lst:
        if x == "O":
            score += c
            c += 1
        else:
            c = 1
    print(score)