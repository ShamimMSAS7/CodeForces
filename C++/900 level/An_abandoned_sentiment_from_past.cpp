#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int la, lb;
    cin >> la >> lb;
    string ans = "No";
    vector<int> va(la), vb(lb);
    for (int i = 0; i < la; i++)
    {
        cin >> va[i];
    }
    for (int i = 0; i < lb; i++)
    {
        cin >> vb[i];
    }
    if (lb > 1)
    {
        ans = "Yes";
    }
    else
    {
        if (va[0] == 0)
        {
            va[0] = vb[0];
        }
        for (int i = 1; i < la; i++)
        {
            if (va[i] == 0)
            {
                va[i] = vb[0];
            }
            if (va[i] - va[i - 1] < 0)
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

    int t = 1;
    while (t--)
    {
        solution();
    }
    return 0;
}