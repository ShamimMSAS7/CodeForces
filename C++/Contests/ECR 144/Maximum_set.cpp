#include <bits/stdc++.h>
using namespace std;

void solution()
{
    long long l, r, ans = 0;
    cin >> l >> r;
    int m = log2(r / l);
    if (m == 0)
    {
        cout << m + 1 << " " << r - l + 1 << "\n";
    }
    else
    {
        long long div = pow(2, m);
        ans = r / div - l + 1;
        div = div / 2 * 3;
        if (r / div - l + 1 > 0)
        {
            ans += (r / div - l + 1) * m;
        }
        cout << m + 1 << " " << ans % 998244353 << "\n";
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