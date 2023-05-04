#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, mi = 0, ma = 0;
    cin >> n;
    vector<long long> v(n);
    for (int i = 0; i < n; i++)
    {
        cin >> v[i];
        if (v[i] < v[mi])
        {
            mi = i;
        }
        if (v[i] > v[ma])
        {
            ma = i;
        }
    }
    if (v[ma] == v[mi])
    {
        cout << 0 << "\n";
    }
    else if (v[mi] == 1)
    {
        cout << -1 << "\n";
    }
    else
    {
        vector<pair<int, int>> ans;
        int next = mi;
        for (int i = 0; i <= 30 * n; i++)
        {
            int count = 0;
            mi = next;
            for (int j = 0; j < n; j++)
            {
                if (v[j] != v[mi])
                {
                    ans.push_back(make_pair(j + 1, mi + 1));
                    v[j] = ceil(1.0 * v[j] / v[mi]);
                    if (v[j] < v[next])
                    {
                        next = j;
                    }
                    count++;
                }
            }
            if (count == 0)
            {
                break;
            }
        }
        cout << size(ans) << "\n";
        for (auto p : ans)
        {
            cout << p.first << " " << p.second << "\n";
        }
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