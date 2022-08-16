#include<iostream>
using namespace std;

int sumOfTwo(int x, int y){
    return x+y;
}
int main(){
    int a,b;
    cout<<"Enter a and b: ";
    cin>>a>>b;
    cout<<"Sum of two number is: "<<sumOfTwo(a,b)<<endl;
    return 0;
}