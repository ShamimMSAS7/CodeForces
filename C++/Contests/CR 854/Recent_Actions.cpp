#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int x, n, m;
    cin >> n >> m;
    vector<int> v;
    set<int> s;
    for (int i = 1; i <= m; i++)
    {
        cin >> x;
        if (s.count(x) == 0)
        {
            v.push_back(i);
            s.insert(x);
        }
    }
    for (int i = size(v); i < n; i++)
    {
        v.push_back(-1);
    }
    for (int i = n - 1; i > 0; i--)
    {
        cout << v[i] << " ";
    }
    cout << v[0] << "\n";
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