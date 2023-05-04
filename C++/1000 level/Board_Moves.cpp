#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n;
    cin >> n;
    long long sum = 0;
    for (long long i = 1; i <= n / 2; i++)
    {
        sum += i * i * 8;
    }
    cout << sum << "\n";
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