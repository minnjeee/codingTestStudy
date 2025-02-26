import sys
sys.setrecursionlimit(1000000)

N = int(sys.stdin.readline())
numbers = [int(sys.stdin.readline()) for i in range(N)]

numbers = sorted(numbers)

# result = ""
# for num in numbers: 
#     result += str(num) + "\n"
# sys.stdout.write(result)
print("\n".join(map(str, numbers)))

# 1. for문으로 numbers 배열의 각 요소를 print() 하니 시간 초과 발생
#   print()는 매번 개행을 하는 데 시간이 오래 걸린다고 함
# 2. print()를 한 번만 사용하도록 하나의 문자열을 만들어 출력해도 시간 초과 발생
# 3. sys.stdout.write()를 사용해도 시간 초과 발생
# 4. join() 메소드를 이용해서 배열의 각 요소를 개행으로 이어주어 출력하였더니 해결!!!