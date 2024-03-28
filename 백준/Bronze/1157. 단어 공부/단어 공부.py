alph = input().upper()
alph_set = list(set(alph))
list = []

for i in alph_set:
    cnt = alph.count(i)
    list.append(cnt)

if list.count(max(list)) > 1:
    print("?")
else:
    print(alph_set[list.index(max(list))])