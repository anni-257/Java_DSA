#include<iostream>
using namespace std;

void isprime(int n){
    if(n<=1){
        cout<<"not a prime"<<endl;
    }else{
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                cout<<"not a prime"<<endl;
                return;;
            }
        }

        cout<<"it is prime"<<endl;
    }
}

int main(){
    cout<<"Check prime or not prime"<<endl;
    int a;
    cin>>a;
    cout<<"Enter a number: "<<a<<endl;
    isprime(a);
    return 0;
}