#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, x, g = 0;
    cin >> n;
    set<int> s;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        s.insert(x);
        g = gcd(g, x);
    }
    cout << *prev(s.end(), 1) / g << "\n";
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