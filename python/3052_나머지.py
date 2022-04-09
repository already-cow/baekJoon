lst = []
for i in range(1, 11):
    lst.append(int(input()))
    
result = set()
for x in lst:
    result.add(x%42)
    
cnt = len(result)
print(cnt)