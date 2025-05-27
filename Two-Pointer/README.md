# 🎯 Two Pointers Pattern

The **Two Pointers** technique is a powerful algorithmic approach used to solve a wide range of problems efficiently. This pattern involves using two pointers (or indices) to traverse or manipulate data structures like arrays, strings, or linked lists. By strategically moving these pointers, we can reduce time complexity and simplify solutions.

This folder contains Java-based solutions to problems that are commonly solved using the **Two Pointers** technique. Each solution is well-commented and optimized for clarity and efficiency.

---

## 📝 Table of Contents

1. [What is the Two Pointers Technique?](#what-is-the-two-pointers-technique)
2. [Why Use Two Pointers?](#why-use-two-pointers)
3. [Popular Problems Solved Using Two Pointers](#popular-problems-solved-using-two-pointers)
4. [How to Get Started as a Beginner](#how-to-get-started-as-a-beginner)
5. [Folder Structure](#folder-structure)
6. [Resources for Further Learning](#resources-for-further-learning)

---

## 🧠 What is the Two Pointers Technique?

The **Two Pointers** technique involves using two references (pointers) to iterate through a data structure. These pointers can move in the same direction or opposite directions, depending on the problem. The technique is especially useful for:

- **Searching pairs**: Finding elements that satisfy certain conditions (e.g., sum equals a target).
- **Sliding windows**: Solving subarray or substring problems.
- **Sorting-related problems**: Optimizing operations on sorted arrays.

### Example:
Given a sorted array, find two numbers whose sum equals a target value.

```java
int[] twoSum(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) {
            return new int[]{left, right};
        } else if (sum < target) {
            left++; // Move left pointer to increase the sum
        } else {
            right--; // Move right pointer to decrease the sum
        }
    }
    return new int[]{-1, -1}; // No solution found
}
```

---

## 🔍 Why Use Two Pointers?

- **Efficiency**: Reduces time complexity from O(n²) to O(n) for many problems.
- **Simplicity**: Simplifies logic by avoiding nested loops.
- **Versatility**: Applicable to a wide range of problems, including arrays, strings, and linked lists.

---

## 📌 Popular Problems Solved Using Two Pointers

Below is a list of **frequently asked interview problems** that can be solved using the Two Pointers technique. These problems are categorized by difficulty level:

### Easy Level
1. **Two Sum II - Input Array is Sorted**
   - Problem: Find two numbers in a sorted array that add up to a target value.
   - Companies: Amazon, Microsoft, Google
   - File: [`TwoSumII.java`](TwoSumII.java)

2. **Valid Palindrome**
   - Problem: Check if a string is a palindrome, ignoring non-alphanumeric characters.
   - Companies: Facebook, Apple
   - File: [`ValidPalindrome.java`](ValidPalindrome.java)

3. **Remove Duplicates from Sorted Array**
   - Problem: Remove duplicates from a sorted array in-place.
   - Companies: Adobe, Bloomberg
   - File: [`RemoveDuplicates.java`](RemoveDuplicates.java)

### Medium Level
4. **3Sum**
   - Problem: Find all unique triplets in an array that sum to zero.
   - Companies: Google, Facebook, Amazon
   - File: [`ThreeSum.java`](ThreeSum.java)

5. **Container With Most Water**
   - Problem: Find two lines that form a container with the most water.
   - Companies: Uber, LinkedIn
   - File: [`ContainerWithMostWater.java`](ContainerWithMostWater.java)

6. **Trapping Rain Water**
   - Problem: Calculate the amount of water trapped between bars.
   - Companies: Amazon, Microsoft
   - File: [`TrappingRainWater.java`](TrappingRainWater.java)

### Hard Level
7. **Minimum Window Substring**
   - Problem: Find the smallest substring containing all characters of another string.
   - Companies: Google, Facebook
   - File: [`MinimumWindowSubstring.java`](MinimumWindowSubstring.java)

8. **Subarray Product Less Than K**
   - Problem: Count subarrays where the product of all elements is less than `k`.
   - Companies: Amazon, Uber
   - File: [`SubarrayProductLessThanK.java`](SubarrayProductLessThanK.java)

---

## 🚶‍♂️ How to Get Started as a Beginner

If you’re new to the Two Pointers technique, here’s how you can get started:

1. **Understand the Basics**  
   - Learn how pointers work in arrays and strings.
   - Practice iterating through arrays using two indices.

2. **Start with Easy Problems**  
   - Solve simple problems like "Two Sum II" and "Valid Palindrome."
   - Focus on understanding how the pointers move and why they work.

3. **Move to Medium Problems**  
   - Tackle problems like "3Sum" and "Container With Most Water."
   - Pay attention to edge cases and optimizations.

4. **Challenge Yourself with Hard Problems**  
   - Attempt problems like "Minimum Window Substring" and "Trapping Rain Water."
   - Break down the problem into smaller parts and think about how pointers can help.

5. **Practice Regularly**  
   - Solve at least one problem per day to build confidence.
   - Use platforms like LeetCode, Codeforces, or HackerRank to practice.

---

## 📂 Folder Structure

```
Two-Pointer/
├── Easy/
│   ├── TwoSumII.java
│   ├── ValidPalindrome.java
│   └── RemoveDuplicates.java
├── Medium/
│   ├── ThreeSum.java
│   ├── ContainerWithMostWater.java
│   └── TrappingRainWater.java
├── Hard/
│   ├── MinimumWindowSubstring.java
│   └── SubarrayProductLessThanK.java
└── README.md          # This file
```

Each subfolder (`Easy`, `Medium`, `Hard`) contains Java files with solutions to problems of varying difficulty levels.

---

### Happy Coding! 🚀
