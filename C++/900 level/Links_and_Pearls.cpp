#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string st;
    cin >> st;
    int l = 0, p = 0;
    for (char c : st)
    {
        if (c == 'o')
        {
            p += 1;
        }
        else
        {
            l += 1;
        }
    }
    if (p == 0 || l % p == 0)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int t = 1;
    while (t--)
    {
        solution();
    }
    return 0;
}