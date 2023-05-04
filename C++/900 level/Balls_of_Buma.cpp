#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string st;
    cin >> st;
    vector<pair<char, int>> v;
    v.push_back(make_pair(st[0], 1));
    int count = 0;
    for (int i = 1; i < size(st); i++)
    {
        if (st[i] == v[count].first)
        {
            v[count].second += 1;
        }
        else
        {
            v.push_back(make_pair(st[i], 1));
            count += 1;
        }
    }
    bool b = true;
    int m = size(v) / 2;
    if (size(v) % 2 == 0 || v[m].second < 2)
    {
        b = false;
    }
    else
    {
        for (int i = 1; i <= m; i++)
        {
            if (v[m - i].first != v[m + i].first || v[m - i].second + v[m + i].second < 3)
            {
                b = false;
                break;
            }
        }
    }
    if (b)
    {
        cout << v[m].second + 1 << "\n";
    }
    else
    {
        cout << 0 << "\n";
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