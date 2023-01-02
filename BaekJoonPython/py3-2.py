# BaekJoon 반복문 10950 A+B - 3
# 두 정수 A 와 B를 입력받은 다음, A+B를 출력하는 프로그램

n = int(input())

for i in range(1,n+1):
    a, b = map(int,input().split())
    print(a+b)
