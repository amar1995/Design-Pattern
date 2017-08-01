#include "Adpater..h"
#include <iostream>

using namespace std;
Sparrow::Sparrow(){
    cout << "First Interface Constructor" << endl;
}
Sparrow::~Sparrow()
{

}
void Sparrow::fly(){
    cout << "Sparrow Can fly" << endl;
}

void Sparrow::makeSound(){
    cout << "Chrip Chrip" << endl;
}

ImplementToyBird::ImplementToyBird(){
    cout << "Second Interface is called" << endl;
}

ImplementToyBird::~ImplementToyBird()
{
}

void ImplementToyBird::squeak()
{
    cout << "Squeak" << endl;
}

