#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n;
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n; i++)
    {
        cin >> v[i];
    }
    string ans = "No";
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            int g = gcd(v[i], v[j]);
            if (g <= 2)
            {
                ans = "Yes";
                break;
            }
        }
    }
    cout << ans << "\n";
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