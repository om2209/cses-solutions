def beautiful_permutations(n: int):
    if n == 2 or n == 3:
        print('NO SOLUTION')
    else:
        evens = list(range(2, n+1, 2))
        odds = list(range(1, n+1, 2))
        print(' '.join(map(str,  evens + odds)))

if __name__ == '__main__':
    n = int(input())
    beautiful_permutations(n)
    