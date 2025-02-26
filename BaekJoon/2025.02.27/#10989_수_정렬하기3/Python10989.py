import sys
stdin = sys.stdin.readline
stdout = sys.stdout.write

N = int(stdin())
arrs = [0]*10000
for _ in range(N):
    arrs[int(stdin())-1] += 1

for i in range(len(arrs)):
    if arrs[i] != 0 : 
        for _ in range(arrs[i]):
            stdout(str(i+1) + "\n")


# 메모리 초과 발생
# 수 정렬하기 이전 시리즈와 같이 배열에 입력받은 수들을 집어넣었더니 메모리 초과 발생
# 알아본 결과 int가 차지하는 메모리가 있는데 많은 수를 입력받아서 다 배열안에 넣으니 메모리 초과가 발생할 수 밖에 없음
# 입력받은 수에 해당하는 인덱스 자리에 1씩 증가시키는 방법을 사용하니 해결!!!

# 참고
# 지역함수가 글로벌함수보다 빨라서 sys.stdin.readline과 같은 글로벌 함수를 따로 변수로 선언해주면 더 빠르다고 함!