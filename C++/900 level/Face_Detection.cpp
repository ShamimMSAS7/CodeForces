#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string temp = "";
    int m, n, count = 0;
    cin >> m >> n;
    vector<string> v(m);
    for (int i = 0; i < m; i++)
    {
        cin >> v[i];
    }
    for (int i = 1; i < m; i++)
    {
        for (int j = 1; j < n; j++)
        {
            temp = v[i - 1][j - 1];
            temp += v[i - 1][j];
            temp += v[i][j - 1];
            temp += v[i][j];
            sort(temp.begin(), temp.end());
            if (temp == "acef")
            {
                count++;
            }
        }
    }
    cout << count << "\n";
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