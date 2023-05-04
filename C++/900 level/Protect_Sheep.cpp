#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int m, n;
    cin >> m >> n;
    vector<string> v(m);
    for (int i = 0; i < m; i++)
    {
        cin >> v[i];
    }
    bool ans = true;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (v[i][j] == 'W')
            {
                if ((i != 0 && v[i - 1][j] == 'S') || (j != 0 && v[i][j - 1] == 'S') || (i != m - 1 && v[i + 1][j] == 'S') || (j != n - 1 && v[i][j + 1] == 'S'))
                {
                    ans = false;
                    break;
                }
            }
            if (v[i][j] == '.')
            {
                v[i][j] = 'D';
            }
        }
    }
    if (ans)
    {
        cout << "Yes\n";
        for (int i = 0; i < m; i++)
        {
            cout << v[i] << "\n";
        }
    }
    else
    {
        cout << "No\n";
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