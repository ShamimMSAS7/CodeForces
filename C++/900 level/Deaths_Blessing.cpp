#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int x;
        long long r = 0;
        vector<int> b;
        int hi, bi;
        cin >> x;
        for (int j = 0; j < x; j++)
        {
            cin >> hi;
            r += hi;
        }
        for (int j = 0; j < x; j++)
        {
            cin >> bi;
            b.push_back(bi);
            r += bi;
        }
        int max = b[0];
        for (int j = 0; j < x; j++)
        {
            if (max < b[j])
            {
                max = b[j];
            }
        }
        cout << r - max << "\n";
    }

    return 0;
}