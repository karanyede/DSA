# 🎯 Hashmap Pattern

The **Hashmap (or Hash Table)** is a fundamental data structure used to store key-value pairs. It provides efficient insertion, deletion, and lookup operations, making it a powerful tool for solving a wide range of problems. This folder contains Java-based solutions to problems that are commonly solved using the **Hashmap** technique.

---

## 📝 Table of Contents

1. [What is a Hashmap?](#what-is-a-hashmap)
2. [Why Use a Hashmap?](#why-use-a-hashmap)
3. [Popular Problems Solved Using Hashmaps](#popular-problems-solved-using-hashmaps)
4. [How to Get Started as a Beginner](#how-to-get-started-as-a-beginner)
5. [Folder Structure](#folder-structure)
6. [Resources for Further Learning](#resources-for-further-learning)

---

## 🧠 What is a Hashmap?

A **Hashmap** is a data structure that stores data in key-value pairs. It uses a hash function to map keys to their corresponding values, allowing for constant-time average complexity for insertions, deletions, and lookups.

### Example:
Find if there are two numbers in an array that sum up to a target value.

```java
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // No solution found
    }
}
```

---

## 🔍 Why Use a Hashmap?

- **Efficiency**: Provides O(1) average time complexity for search, insert, and delete operations.
- **Simplicity**: Simplifies problems involving frequency counting, tracking duplicates, or finding complements.
- **Versatility**: Applicable to a wide range of problems, including arrays, strings, and linked lists.

---

## 📌 Popular Problems Solved Using Hashmaps

Below is a list of **frequently asked interview problems** that can be solved using the Hashmap technique. These problems are categorized by difficulty level:

### Easy Level
1. **Two Sum**
   - Problem: Find two numbers in an array that add up to a target value.
   - Companies: Amazon, Microsoft, Google
   - File: [`TwoSum.java`](TwoSum.java)

2. **Contains Duplicate**
   - Problem: Check if an array contains any duplicate elements.
   - Companies: Facebook, Apple
   - File: [`ContainsDuplicate.java`](ContainsDuplicate.java)

3. **First Unique Character in a String**
   - Problem: Find the first non-repeating character in a string.
   - Companies: Adobe, Bloomberg
   - File: [`FirstUniqueCharacter.java`](FirstUniqueCharacter.java)

### Medium Level
4. **Group Anagrams**
   - Problem: Group words into anagrams.
   - Companies: Google, Facebook, Amazon
   - File: [`GroupAnagrams.java`](GroupAnagrams.java)

5. **Longest Substring Without Repeating Characters**
   - Problem: Find the length of the longest substring without repeating characters.
   - Companies: Uber, LinkedIn
   - File: [`LongestSubstringWithoutRepeatingCharacters.java`](LongestSubstringWithoutRepeatingCharacters.java)

6. **Subarray Sum Equals K**
   - Problem: Find the number of subarrays whose sum equals a given value `k`.
   - Companies: Amazon, Microsoft
   - File: [`SubarraySumEqualsK.java`](SubarraySumEqualsK.java)

### Hard Level
7. **Minimum Window Substring**
   - Problem: Find the smallest substring containing all characters of another string.
   - Companies: Google, Facebook
   - File: [`MinimumWindowSubstring.java`](MinimumWindowSubstring.java)

8. **LRU Cache**
   - Problem: Implement a Least Recently Used (LRU) Cache.
   - Companies: Amazon, Uber
   - File: [`LRUCache.java`](LRUCache.java)

---

## 🚶‍♂️ How to Get Started as a Beginner

If you’re new to the Hashmap technique, here’s how you can get started:

1. **Understand the Basics**  
   - Learn how hashmaps work and their time complexities.
   - Practice inserting, deleting, and retrieving values from a hashmap.

2. **Start with Easy Problems**  
   - Solve simple problems like "Two Sum" and "Contains Duplicate."
   - Focus on understanding how hashmaps help track frequencies or complements.

3. **Move to Medium Problems**  
   - Tackle problems like "Group Anagrams" and "Longest Substring Without Repeating Characters."
   - Pay attention to edge cases and optimizations.

4. **Challenge Yourself with Hard Problems**  
   - Attempt problems like "Minimum Window Substring" and "LRU Cache."
   - Break down the problem into smaller parts and think about how hashmaps can help.

5. **Practice Regularly**  
   - Solve at least one problem per day to build confidence.
   - Use platforms like LeetCode, Codeforces, or HackerRank to practice.

---

## 📂 Folder Structure

```
Hashmap/
├── Easy/
│   ├── TwoSum.java
│   ├── ContainsDuplicate.java
│   └── FirstUniqueCharacter.java
├── Medium/
│   ├── GroupAnagrams.java
│   ├── LongestSubstringWithoutRepeatingCharacters.java
│   └── SubarraySumEqualsK.java
├── Hard/
│   ├── MinimumWindowSubstring.java
│   └── LRUCache.java
└── README.md          # This file
```

Each subfolder (`Easy`, `Medium`, `Hard`) contains Java files with solutions to problems of varying difficulty levels.
---

### Happy Coding! 🚀
