#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string x, st = "3141592653589793238462643383279";
    cin >> x;
    int i;
    for (i = 0; i < size(st); i++)
    {
        if (x[i] != st[i])
        {
            cout << i << "\n";
            break;
        }
    }
    if (i == size(st))
    {
        cout << size(st) << "\n";
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