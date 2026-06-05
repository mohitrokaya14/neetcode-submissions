class Solution {
public:
    int trap(vector<int>& height) {
        int left = 0, right = height.size() - 1, g = 0, area = 0, sub = 0;

        while (left < right) {
            if (min(height[right], height[left]) > g) {
                area += (right - 1 - left) * (min(height[right], height[left]) - g);
                sub = min(height[right], height[left]);
            }

            g = max(min(height[right], height[left]), sub);

            if (height[left] < height[right]) {
                left++;
                if (left < right) {
                    if (height[left] > g && left < right) {
                        area -= sub;
                    } else {
                        area -= height[left];
                    }
                }
            } else {
                right--;
                if (left < right) {
                    if (height[right] > g) {
                        area -= sub;
                    } else {
                        area -= height[right];
                    }
                }
            }
        }

        return area;
    }
};
