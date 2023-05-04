#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n;
    cin >> n;
    vector<long long> v(n);
    for (int i = 0; i < n; i++)
    {
        cin >> v[i];
    }
    int k = 0;
    for (int i = 0; i < n; i++)
    {
        if (v[i] % 2 == 0)
        {
            v[i] /= 2;
            i--;
            k++;
        }
    }

    sort(v.begin(), v.end());
    v[n - 1] = v[n - 1] * pow(2, k);
    long long sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += v[i];
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