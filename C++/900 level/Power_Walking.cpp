#include <bits/stdc++.h>
using namespace std;

void solution()
{
    int n, x;
    cin >> n;
    set<int> st;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        st.insert(x);
    }
    int l = st.size();
    for (int i = 1; i < n; i++)
    {
        cout << max(i, l) << " ";
    }
    cout << n << "\n";
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