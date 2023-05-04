#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, k, x;
    cin >> n >> k;
    set<int> s;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        s.insert(x);
    }
    if (k > n)
    {
        cout << -1 << "\n";
    }
    else
    {
        cout << *prev(s.end(), k) << " " << 0 << "\n";
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