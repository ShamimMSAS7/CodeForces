#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, m;
    cin >> n >> m;
    if (n == 1 && m == 1)
    {
        cout << 0 << "\n";
    }
    else if (n == 1 || m == 1)
    {
        cout << 1 << "\n";
    }
    else
    {
        cout << 2 << "\n";
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