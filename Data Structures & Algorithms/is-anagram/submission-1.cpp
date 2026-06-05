class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size() != t.size()) return false;

        unordered_map<char, int> anagram;
        for (char c : s) anagram[c]++;
        for (char c : t) anagram[c]--;

        for (auto pair : anagram) {
            if (pair.second != 0)
                return false;
        }
        return true;
    }
};
