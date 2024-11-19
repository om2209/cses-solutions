from typing import List


def increasing_array(n: int, numbers: List[int]) -> int:
    moves = 0
    for i in range(1, n):
        if numbers[i] < numbers[i-1]:
            moves += (numbers[i-1] - numbers[i])
            numbers[i] = numbers[i-1]
    
    return moves

if __name__ == '__main__':
    n: int = int(input())
    numbers: List[int] = list(map(int, input().strip().split()))
    print(increasing_array(n, numbers))