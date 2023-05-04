#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string a, b, ans = "";
    cin >> a >> b;
    if (a[0] == b[0])
    {
        ans += a[0];
        ans += "*";
    }
    else if (a[size(a) - 1] == b[size(b) - 1])
    {
        ans += "*";
        ans += a[size(a) - 1];
    }
    else
    {
        for (int i = 0; i < size(a) - 1; i++)
        {
            for (int j = 0; j < size(b) - 1; j++)
            {
                if (a[i] == b[j] && a[i + 1] == b[j + 1])
                {
                    ans += "*";
                    ans += a[i];
                    ans += a[i + 1];
                    ans += "*";
                    break;
                }
            }
            if (ans != "")
            {
                break;
            }
        }
    }
    if (ans == "")
    {
        cout << "NO\n";
    }
    else
    {
        cout << "YES\n"
             << ans << "\n";
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