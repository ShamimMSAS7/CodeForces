#include <bits/stdc++.h>
using namespace std;

void solution()
{
    string current;
    int m;
    vector<string> v{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    cin >> current >> m;
    for (int i = 0; i < 12; i++)
    {
        if (v[i] == current)
        {
            m += i;
            m %= 12;
            break;
        }
    }
    cout << v[m] << "\n";
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