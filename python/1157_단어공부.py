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

"""
max(self, key=self.count)
--> self의 리스트 값 하나하나를 데려와서 key = 몇개인지 세고 가장 큰 값을 출력
같은 값은 무조건 먼저 오는 문자 출력
"""