#include <iostream>
#include <unordered_map>
using namespace std;

bool isIsomorphic(string s, string t) {
    if (s.size() != t.size()) {
        return false;
    }

    unordered_map<char, char> sToT;
    unordered_map<char, char> tToS;

    for (int i = 0; i < s.size(); ++i) {
        char charS = s[i];
        char charT = t[i];

        if (sToT.find(charS) != sToT.end()) {
            if (sToT[charS] != charT) {
                return false;
            }
        } else {
            sToT[charS] = charT;
        }

        if (tToS.find(charT) != tToS.end()) {
            if (tToS[charT] != charS) {
                return false;
            }
        } else {
            tToS[charT] = charS;
        }
    }

    return true;
}

int main() {
    // Test cases
    cout << std::boolalpha;  // Print boolean values as true/false
    cout << isIsomorphic("egg", "add") << endl;        // true
    return 0;
}
