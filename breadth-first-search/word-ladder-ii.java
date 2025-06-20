class Solution {
    private List<List<String>> allPaths;  // List of paths from beginWord to endWord
    private Map<String, Set<String>> predecessorsMap;  // Map to track the predecessors of each word in the shortest paths

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        allPaths = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordList); // Convert word list to a set for efficient lookups
        if (!wordSet.contains(endWord)) {
            return allPaths; // If endWord is not in the word list, return empty list
        }
        wordSet.remove(beginWord); // Remove beginWord from the set to prevent cycles
        Map<String, Integer> distanceMap = new HashMap<>(); // Map to track the shortest path distances for words
        distanceMap.put(beginWord, 0); // Distance from beginWord to itself is 0
        predecessorsMap = new HashMap<>(); // Initialize the predecessors map
        Queue<String> queue = new ArrayDeque<>(); // Queue for BFS
        queue.offer(beginWord);
        boolean isEndWordFound = false; // Flag to check if endWord is found
        int steps = 0; // Step counter for BFS
        while (!queue.isEmpty() && !isEndWordFound) {
            ++steps;
            for (int i = queue.size(); i > 0; --i) {
                String currentWord = queue.poll();
                char[] currentChars = currentWord.toCharArray();
                for (int j = 0; j < currentChars.length; ++j) {
                    char originalChar = currentChars[j];
                    for (char c = 'a'; c <= 'z'; ++c) { // Try all possible one-letter mutations
                        currentChars[j] = c;
                        String newWord = new String(currentChars);
                        if (distanceMap.getOrDefault(newWord, 0) == steps) {
                            predecessorsMap.get(newWord).add(currentWord);
                        }
                        if (!wordSet.contains(newWord)) {
                            continue; // If the new word isn't in the set, skip it
                        }
                        // Update distance map and predecessors map for new words
                        predecessorsMap.computeIfAbsent(newWord, key -> new HashSet<>()).add(currentWord);
                        wordSet.remove(newWord); // Remove new word to prevent revisiting
                        queue.offer(newWord);
                        distanceMap.put(newWord, steps);
                        if (endWord.equals(newWord)) {
                            isEndWordFound = true; // Found the endWord; will finish after this level
                        }
                    }
                    currentChars[j] = originalChar; // Restore original character before next iteration
                }
            }
        }
        if (isEndWordFound) { // If the end word has been reached
            Deque<String> path = new ArrayDeque<>(); // Path stack for reconstructing paths
            path.add(endWord);
            backtrackPath(path, beginWord, endWord); // Perform DFS to build all shortest paths
        }
        return allPaths; // Return the list of all shortest paths
    }

    private void backtrackPath(Deque<String> path, String beginWord, String currentWord) {
        if (currentWord.equals(beginWord)) { // If the beginning of the path is reached, add it to allPaths
            allPaths.add(new ArrayList<>(path));
            return;
        }
        // Recursively go through all predecessors of the current word, adding them to the path
        for (String predecessor : predecessorsMap.get(currentWord)) {
            path.addFirst(predecessor); // Push the predecessor onto the path
            backtrackPath(path, beginWord, predecessor); // Continue backtracking
            path.removeFirst(); // Remove the predecessor to backtrack
        }
    }
}