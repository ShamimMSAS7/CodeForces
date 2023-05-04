#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n;
    cin >> n;
    string st;
    cin >> st;
    int count = 0;
    bool b = true;
    for (int i = 0; i <= n / 2; i++)
    {
        if (st[i] == st[n - 1 - i])
        {
            b = true;
        }
        else if (b)
        {
            count += 1;
            b = false;
        }
    }
    if (count <= 1)
    {
        cout << "Yes\n";
    }
    else
    {
        cout << "No\n";
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