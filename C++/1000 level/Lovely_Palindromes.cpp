#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string st;
    cin >> st;
    cout << st;
    reverse(st.begin(), st.end());
    cout << st << "\n";
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