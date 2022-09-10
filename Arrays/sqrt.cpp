#include<iostream>
using namespace std;

int sqrt(int num){
    int l=0,h=num;
    int mid=l+(h-l)/2;
    int ans=0;
    while(l<=h){
        int square=mid*mid;
        if(square==num){
            return mid;
        }else if(square<num){
            ans=mid;
            l=mid+1;
        }else{
            h=mid-1;
        }

        mid=l+(h-l)/2;
    }

    return ans;
}

double precision(int ans,int pre,int num){
    double dec=1;
    double ans1=0;
    while(pre--){
        dec=dec/10;
    }

    for(double j=ans;j*j<=num;j=j+dec){
        ans1=j;
    }

    return ans1;
}

int main(){
    int num,pre;
    cout<<"----- Square Root of a Number -----"<<endl;
    cout<<"Enter number: ";
    cin>>num;

    int tempAns=sqrt(num);
    cout<<"TempAns: "<<tempAns<<endl;
    cout<<"No. of precision: ";
    cin>>pre;
    double AccurateAns=precision(tempAns,pre,num);
    cout<<"Accurate Ans: "<<AccurateAns<<endl;

    return 0;

}