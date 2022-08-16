#include<iostream>
using namespace std;
#define PI 3.1415

double area(double r){
    return PI*r*r;
}
int main(){
    double radius;
    cout<<"Area of circle"<<endl;
    cout<<"Enter radius of a circle"<<endl;
    cin>>radius;

    cout<<"Area of a circle: "<<area(radius)<<endl;
}