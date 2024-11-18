from typing import List

def missing_number(n: int, numbers: List[int]) -> int:
    xor: int = 0
    for i in range(1, n+1):
        xor ^= i
    
    for number in numbers:
        xor ^= number
    
    return xor

if __name__ == '__main__':
    n = int(input())
    numbers: List[int] = list(map(int, input().split()))
    print(missing_number(n, numbers))