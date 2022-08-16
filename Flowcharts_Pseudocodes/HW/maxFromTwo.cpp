#include<iostream>
using namespace std;

int maxOfTwo(int a, int b){
    if(a>b){
        return a;
    }

    return b;
}

int main(){
    int num1, num2;
    cout<<"Enter two Number: ";
    cin>>num1>>num2;

    cout<<"Max of Two: "<<maxOfTwo(num1,num2);


    return 0;
}