#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int d;
    cin >> d;
    int mi = d / 7 * 2;
    int extra = d % 7;
    int ma = mi + min(2, extra);
    mi = mi + max(0, extra - 5);
    cout << mi << " " << ma << "\n";
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