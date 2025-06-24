#include <stdio.h>

int binarySearch(int array[], int length, int target) {
    int left = 0;
    int right = length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;
        int potentialMatch = array[mid];

        if (target > potentialMatch) {
            left = mid + 1;
        } else if (target < potentialMatch) {
            right = mid - 1;
        } else {
            return mid;
        }
    }

    return -1;
}

int main() {
    int numbers[] = {1, 2, 3, 4, 5, 6};
    int length = sizeof(numbers) / sizeof(numbers[0]);
    int target = 6;

    int result = binarySearch(numbers, length, target);
    printf("%d\n", result);

    return 0;
}
