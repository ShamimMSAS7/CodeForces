#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int x, y, d, sum;
    cin >> x >> y;
    d = y - x + 1;
    sum = (-1) * pow(-1, x) * (d / 2) + pow(-1, y) * (d % 2) * y;
    cout << sum << "\n";
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