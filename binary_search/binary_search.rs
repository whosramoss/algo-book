fn binary_search(array: &[i32], target: i32) -> i32 {
    let mut left = 0;
    let mut right = array.len() as i32 - 1;

    while left <= right {
        let mid = (left + right) / 2;
        let potential_match = array[mid as usize];

        if target > potential_match {
            left = mid + 1;
        } else if target < potential_match {
            right = mid - 1;
        } else {
            return mid;
        }
    }

    -1
}

fn main() {
    let numbers = vec![1, 2, 3, 4, 5, 6];
    let target = 6;
    let result = binary_search(&numbers, target);
    println!("{}", result);
}
