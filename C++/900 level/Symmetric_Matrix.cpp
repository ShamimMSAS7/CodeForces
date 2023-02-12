#include <bits/stdc++.h>
using namespace std;
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int x;
    cin >> x;
    for (int i = 0; i < x; i++)
    {
        int count = 0;
        int n, m;
        cin >> n >> m;
        int a, b, c, d;
        for (int j = 0; j < n; j++)
        {
            cin >> a >> b >> c >> d;
            if (b == c)
            {
                count++;
            }
        }
        if (count > 0 && m % 2 != 1)
        {
            cout << "YES" << '\n';
        }
        else
        {
            cout << "NO" << '\n';
        }
    }

    return 0;
}