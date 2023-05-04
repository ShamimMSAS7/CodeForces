#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int l;
    cin >> l;
    vector<int> v(l);
    for (int i = 0; i < l; i++)
    {
        cin >> v[i];
    }
    sort(v.begin(), v.end());
    long long sum = 0;
    for (int i = 0; i < l / 2; i++)
    {
        sum += pow(v[i] + v[l - 1 - i], 2);
    }
    cout << sum << "\n";
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