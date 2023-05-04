#include <bits/stdc++.h>
using namespace std;

void solution()
{
    char start, end;
    int t, start_index = 0, cw;
    vector<char> v{'^', '>', 'v', '<'};
    cin >> start >> end >> t;
    if (t % 2 == 0)
    {
        cout << "undefined\n";
    }
    else
    {
        t = t % 4;
        for (int i = 0; i < 4; i++)
        {
            if (start == v[i])
            {
                start_index = i;
                break;
            }
        }
        cw = (start_index + t) % 4;
        if (v[cw] == end)
        {
            cout << "cw\n";
        }
        else
        {
            cout << "ccw\n";
        }
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