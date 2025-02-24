n = int(input())

result = 0 # 봉지 개수
num5 = n // 5 # 5킬로그램 봉지 (가능한 최대) 개수

# 5킬로그램 봉지 최대 개수 부터 0개 까지 차례대로 판단
for i in range(num5, -1, -1):
    n_copy = n
    n_copy -= 5 * i # 5킬로봉지 i개(사용한 개수)를 제외한 나머지 설탕 킬로그램

    if (n_copy == 0) :
        # 5로 나눠어 떨어진 경우 (3킬로그램 봉지 필요 없으므로 break)
        result = i
        break
    elif n_copy % 3 != 0 :
        # 3으로 나누어 떨어지지 않는 경우 (5킬로그램 봉지 개수를 줄여서 다시 판단하도록 continue)
        continue
    else :
        # 3으로 나누어 떨어진 경우 (3킬로그램 봉지도 사용한 경우)
        num3 = n_copy // 3
        result = i + num3
        break

if result == 0 : print(-1)
else : print(result)