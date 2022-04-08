a, b = list(map(int, input().split()))

# 최대공약수
for i in range(min(a, b), 0, -1):
    if a%i == 0 and b%i == 0:
        print(i)
        break

# 최소공배수
for x in range(max(a, b), (a*b)+1):
    if x%a == 0 and x%b == 0:
        print(x)
        break

# 약수
N = int(input())
answer = []
for i in range(2, int(N ** 0.5) + 1):
	if N % i == 0:
		answer.append(i)
		if N // i != i:
			answer.append(N // i)
        
answer.append(N)
answer.sort()
print(answer)