#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int x;
    cin >> x;
    for (int i = 0; i < x; i++)
    {
        vector<int> a(3);
        cin >> a[0] >> a[1] >> a[2];
        if (a[0] == a[1] && a[1] == a[2])
        {
            cout << 0 << "\n";
            continue;
        }

        sort(a.begin(), a.end());
        if (a[0] == a[1])
        {
            a[0]++;
            a[1]++;
        }
        else
        {
            a[0]++;
        }
        if (a[0] == a[1] && a[1] == a[2])
        {
            cout << 0 << "\n";
            continue;
        }
        if (a[1] == a[2])
        {
            a[1]--;
            a[2]--;
        }
        else
        {
            a[2]--;
        }
        cout << a[2] - a[1] + a[2] - a[0] + a[1] - a[0] << "\n";
    }
    return 0;
}