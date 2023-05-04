#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string s;
    cin >> s;
    bool b = true;
    for (int i = 1; i < s.size(); i++)
    {
        if (s[i] != s[0])
        {
            b = false;
            char c = s[s.size() - 1];
            s[s.size() - 1] = s[i];
            s[i] = c;
            cout << s << "\n";
            break;
        }
    }
    if (b)
    {
        cout << -1 << "\n";
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int t;
    cin >> t;
    while (t--)
    {
        solution();
    }
    return 0;
}