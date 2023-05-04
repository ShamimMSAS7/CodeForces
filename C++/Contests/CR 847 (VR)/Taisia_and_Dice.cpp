#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, s, r;
    cin >> n >> s >> r;
    r = s - r;
    vector<int> v(n);
    for (int i = 0; i < n; i++)
    {
        if (s - r < n - 1 - i)
        {
            r--;
            i--;
            continue;
        }
        v[i] = r;
        s -= r;
    }
    for (int i : v)
    {
        cout << i << " ";
    }
    cout << "\n";
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