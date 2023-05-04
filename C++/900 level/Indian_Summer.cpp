#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, count = 0;
    string tree, color;
    set<string> st;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> tree >> color;
        tree += " " + color;
        if (st.find(tree) == st.end())
        {
            count += 1;
            st.insert(tree);
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