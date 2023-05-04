#include <bits/stdc++.h>
using namespace std;

void solution()
{
    long long n, m, x, y, pos;
    long long ans = 0;
    cin >> n >> m;
    map<long long, pair<long long, long long>> mp;
    vector<long long> v(n);
    for (long long i = 0; i < n; i++)
    {
        cin >> x;
        v[i] = x;
        mp[x] = make_pair(0, 0);
    }
    for (long long i = 1; i <= m; i++)
    {
        cin >> pos >> y;
        x = v[pos - 1];
        v[pos - 1] = y;
        mp[x].second += i - mp[x].first;
        mp[x].first = -1;
        if (mp.count(y) == 0)
        {
            mp[y] = make_pair(i, 0);
        }
        else
        {
            mp[y].first = i;
        }
    }
    for (auto i : mp)
    {
        if (i.second.first != -1)
        {
            i.second.second += m + 1 - i.second.first;
        }
        ans += (m * (m + 1) / 2) - ((m - i.second.second) * (m - i.second.second + 1) / 2);
    }
    cout << ans << "\n";
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