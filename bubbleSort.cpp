



#include <bits/stdc++.h>
using namespace std;
 
void bubbleSort(int arr[], int n)
{
    int i, j, temp;
    for (i = 0; i < n - 1; i++){
        for (j = 0; j < n - i - 1; j++){
            if (arr[j] > arr[j + 1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}







void display(int arr[], int  size)
{
    int i;
    for (i = 0; i < size;  i++)
        cout << arr[i] << " ";
    cout << endl;
}
 

int main()
{
    int arr[] = { 5, 1, 4,  2, 8};
    int N = sizeof(arr) / sizeof(arr[0]);
    bubbleSort(arr, N);
    cout << "Sorted array: "<<endl;
    display(arr, N);
    return 0;
}