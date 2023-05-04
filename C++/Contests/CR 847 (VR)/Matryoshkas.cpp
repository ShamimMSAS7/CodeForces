#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, ans = 0;
    long long x;
    cin >> n;
    map<long long, long long> m;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        m[x]++;
    }
    int ms = size(m);
    int count = 0;
    while (count != ms)
    {
        count = 0;
        auto it = m.begin();
        int mn = it->second;
        long long prev = 0;
        for (auto i : m)
        {
            if (i.second != 0)
            {
                if (i.first == 1 || i.first - prev != 1)
                {
                    mn = i.second;
                    ans += mn;
                }
                if (i.second < mn)
                {
                    mn = i.second;
                }
                m[i.first] -= mn;
                prev = i.first;
            }
            else
            {
                count++;
            }
        }
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