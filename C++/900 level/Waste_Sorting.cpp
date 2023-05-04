#include <bits/stdc++.h>
using namespace std;

void solution()
{
    vector<int> c(3), a(5);
    for (int i = 0; i < 3; i++)
    {
        cin >> c[i];
    }
    for (int i = 0; i < 5; i++)
    {
        cin >> a[i];
        if (i < 3)
        {
            c[i] -= a[i];
        }
        else
        {
            a[i] -= max(0, c[i - 3]);
            c[2] -= max(0, a[i]);
        }
    }
    if (c[0] >= 0 && c[1] >= 0 && c[2] >= 0)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
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