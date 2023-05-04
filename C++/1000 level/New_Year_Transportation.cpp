#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, p;
    cin >> n >> p;
    vector<int> v(n);
    for (int i = 0; i < n - 1; i++)
    {
        cin >> v[i];
    }
    string ans = "NO";
    int index = 0;
    while (index < n - 1)
    {
        if (index == p - 1)
        {
            ans = "YES";
            break;
        }
        index += v[index];
    }
    if (index == p - 1)
    {
        ans = "YES";
    }
    cout << ans << "\n";
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