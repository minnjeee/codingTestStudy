num = int(input())
prices = []
for i in range(num):
    prices.append(int(input()))

ps = [25, 10, 5, 1]

for price in prices:
    for p in ps:
        print(price//p, end=" ")
        price = price%p
    print()