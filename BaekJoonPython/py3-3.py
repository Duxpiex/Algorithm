# n이 주어졌을 때 1부터 n까지의 합을 구하는 프로그램

n = int(input())
sum = 0

for i in range(1,n+1):
    sum += i

print(sum)