import sys
input = sys.stdin.readline

N = int(input().rstrip())

namesSet = set()
for _ in range(N):
    name, code = input().rstrip().split(" ")
    if code == "enter": namesSet.add(name)
    else: namesSet.remove(name)

sorted_names = sorted(namesSet, reverse=True)
print("\n".join(sorted_names))