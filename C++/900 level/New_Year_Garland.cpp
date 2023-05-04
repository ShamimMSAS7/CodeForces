#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int a[3];
    for (int i = 0; i < 3; i++)
    {
        cin >> a[i];
    }
    int n = sizeof(a) / sizeof(a[0]);
    sort(a, a + n);
    if (a[2] - a[1] - a[0] > 1)
    {
        cout << "No\n";
    }
    else
    {
        cout << "Yes\n";
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