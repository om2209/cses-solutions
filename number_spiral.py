def number_spiral(y: int, x: int) -> int:
    if x <= y:
        if y % 2 == 0:
            return y**2 - (x - 1)
        else:
            return (y-1)**2 + x
    else:
        if x % 2 == 1:
            return x**2 - (y - 1)
        else:
            return (x-1)**2 + y
        
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        y, x = list(map(int, input().strip().split()))
        print(number_spiral(y, x))