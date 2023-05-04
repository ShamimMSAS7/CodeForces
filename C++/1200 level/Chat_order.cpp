#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n;
    cin >> n;
    vector<string> st(n);
    map<string, bool> visit;
    for (int i = 0; i < n; i++)
    {
        cin >> st[i];
    }
    for (int i = n - 1; i >= 0; i--)
    {
        if (!visit[st[i]])
        {
            cout << st[i] << "\n";
        }
        visit[st[i]] = true;
    }
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