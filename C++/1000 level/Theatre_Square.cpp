#include <bits/stdc++.h>
using namespace std;

void solution()
{
    long long n, m, a, r;
    cin >> n >> m >> a;
    r = ceil(n * 1.0 / a) * ceil(m * 1.0 / a);
    cout << r << "\n";
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