#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string seq = "FBFFBFFB", ans = "NO", st;
    int l, start = 0;
    cin >> l;
    cin >> st;
    vector<int> b;
    if (st[0] == 'B')
    {
        b = {1, 4, 7};
    }
    else
    {
        b = {0, 2, 3, 5, 6};
    }
    for (int i = 0; i < size(b); i++)
    {
        int count = 0;
        for (int j = 0; j < size(st); j++)
        {
            if (st[j] != seq[(b[i] + j) % 8])
            {
                count++;
                break;
            }
        }
        if (count == 0)
        {
            ans = "YES";
            break;
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