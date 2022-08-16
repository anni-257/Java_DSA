#include<iostream>
using namespace std;

void printEven(int num1, int num2){
    cout<<"Prime numbers between "<<num1<<" and "<<num2<<endl;
    for(int i=num1+1;i<num2;i++){
        if(i%2==0){
            cout<<i<<" ";
        }
    }
    cout<<endl;
}

int main(){
    int num1,num2;
    cout<<"Enter num1 and num2: ";
    cin>>num1>>num2;
    printEven(num1,num2);
    return 0;
}