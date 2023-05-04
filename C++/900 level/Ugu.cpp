#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, count = 0;
    string bi;
    cin >> n;
    cin >> bi;
    bool b = false;
    char pre = bi[0];
    for (char ch : bi)
    {
        if (!b && ch == '1')
        {
            b = true;
        }
        else if (b && ch != pre)
        {
            count++;
        }
        pre = ch;
    }
    cout << count << "\n";
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