#include<iostream>
using namespace std;

int maxOfThree(int a,int b,int c){
    if(a>b){
        if(a>c){
            return a;
        }else{
            return c;
        }
    }else{
        if(b>c){
            return b;
        }else{
            return c;
        }
    }

    return -1;
}

int main(){
    int a,b,c;
    cout<<"Enter Three numbers: ";
    cin>>a>>b>>c;
    cout<<"Max of Three is: "<<maxOfThree(a,b,c)<<endl;

    return 0;
}
