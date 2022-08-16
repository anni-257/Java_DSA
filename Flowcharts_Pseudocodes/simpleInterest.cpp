#include<iostream>
using namespace std;

double simpleInterest(int p,int r,int t){
    return (p*r*t)/100;
}

int main(){
    double p,r,t;
    cout<<"Enter Principal amount: ";
    cin>>p;
    cout<<"Enter Rate: ";
    cin>>r;
    cout<<"Enter Time Period: ";
    cin>>t;

    cout<<"Simple Interest is: "<<simpleInterest(p,r,t)<<endl;



}