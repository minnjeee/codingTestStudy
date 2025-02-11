xs = []
ys = []
for i in range(3):
    x, y = map(int, input().split(' '))
    xs.append(x)
    ys.append(y)

resultx = xs[0]
resulty = ys[0]

if resultx != xs[1] and resultx == xs[2]:
    resultx = xs[1]
elif resultx == xs[1] and resultx != xs[2]:
    resultx = xs[2]

if resulty != ys[1] and resulty == ys[2]:
    resulty = ys[1]
elif resulty == ys[1] and resulty != ys[2]:
    resulty = ys[2]

print(f"{resultx} {resulty}")