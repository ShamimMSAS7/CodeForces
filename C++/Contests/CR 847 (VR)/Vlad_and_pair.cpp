#include <bits/stdc++.h>
using namespace std;

void solution()
{
    long long x;
    cin >> x;
    int m = (log2(x)) + 1;
    long long s = pow(2, m) - 1;
    long long o = x ^ s;
    if ((s + o) / 2 == x)
    {
        cout << s << " " << o << "\n";
    }
    else
    {
        cout << -1 << "\n";
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