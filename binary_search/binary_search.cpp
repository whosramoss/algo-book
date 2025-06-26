#include <iostream>
#include <vector>

int binarySearch(const std::vector<int>& array, int target) {
  int left = 0;
  int right = array.size() - 1;

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
    std::vector<int> numbers = {1, 2, 3, 4, 5, 6};
    int target = 6;

    int result = binarySearch(numbers, target);
    std::cout << result << std::endl;

    return 0;
}
