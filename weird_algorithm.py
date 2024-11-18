def weird_algorithm(n: int):
    while True:
        print(n, end=' ')
        if n == 1:
            break
        if n % 2 == 1:
            n = 3*n + 1
        else:
            n = n // 2
    
if __name__ == '__main__':
    n = input()
    weird_algorithm(int(n))