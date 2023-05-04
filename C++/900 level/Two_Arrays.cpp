#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int l;
    cin >> l;
    vector<int> a(l), b(l);
    for (int i = 0; i < l; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i < l; i++)
    {
        cin >> b[i];
    }
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    string ans = "YES";
    for (int i = 0; i < l; i++)
    {
        if (b[i] - a[i] != 0 && b[i] - a[i] != 1)
        {
            ans = "NO";
            break;
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