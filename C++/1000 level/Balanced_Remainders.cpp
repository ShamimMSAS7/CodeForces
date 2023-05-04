#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, x, moves = 0;
    vector<int> v(3, 0);
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        v[x % 3]++;
    }
    int count = 0;
    while (count != 3)
    {
        count = 0;
        for (int i = 0; i < 3; i++)
        {
            if (v[i] == n / 3)
            {
                count++;
            }
            else if (v[i] > n / 3)
            {
                moves += v[i] - n / 3;
                v[(i + 1) % 3] += v[i] - n / 3;
                v[i] = n / 3;
            }
        }
    }
    cout << moves << "\n";
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