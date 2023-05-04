#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string x, y;
    cin >> x >> y;
    int l = size(x);
    bool b = true;
    for (int i = 0; i < l; i++)
    {
        if (x[i] < y[i])
        {
            cout << -1 << "\n";
            b = false;
            break;
        }
    }
    if (b)
    {
        cout << y << "\n";
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