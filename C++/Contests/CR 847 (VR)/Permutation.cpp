#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, x;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - 1; j++)
        {
            cin >> x;
            a[x - 1] += j;
        }
    }
    vector<pair<int, int>> v;
    for (int i = 0; i < n; i++)
    {
        v.push_back(make_pair(a[i], i + 1));
    }
    sort(v.begin(), v.end());
    for (auto i : v)
    {
        cout << i.second << " ";
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