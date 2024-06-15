#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class TwoSum
{
public:
    vector<int> findPair(vector<int> &nums, int target)
    {
        unordered_map<int, int> numMap;
        vector<int> result;

        for (int i = 0; i < nums.size(); ++i)
        {
            int complement = target - nums[i];
            if (numMap.find(complement) != numMap.end())
            {
                result.push_back(numMap[complement]);
                result.push_back(i);
                return result;
            }
            numMap[nums[i]] = i;
        }

        return result; // If no valid pair found
    }
};

int main()
{
    TwoSum ts;
    vector<int> nums = {8, 7, 2, 5, 3, 1};
    int target = 10;

    vector<int> indices = ts.findPair(nums, target);

    if (indices.size() == 2)
    {
        cout << "Pair found at indices: " << indices[0] << ", " << indices[1] << endl;
        cout << "Values: " << nums[indices[0]] << ", " << nums[indices[1]] << endl;
    }
    else
    {
        cout << "Pair not found." << endl;
    }

    return 0;
}
