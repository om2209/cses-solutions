def repetitions(sequence: str) -> int:
    max_length, current_length = 1, 1
    n = len(sequence)
    for i in range(1, n):
        if sequence[i] == sequence[i-1]:
            current_length += 1
        else:
            max_length = max(max_length, current_length)
            current_length = 1
    
    return max(max_length, current_length)

if __name__ == '__main__':
    sequence = input().strip()
    print(repetitions(sequence))
        