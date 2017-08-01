#include <iostream>
#include "Adpater..h"
using namespace std;

int main()
{
    Sparrow sparrow;
    ImplementToyBird toybird;
    BirdAdaptor bird(sparrow);
    sparrow.fly();
    sparrow.makeSound();
    toybird.squeak();

    bird.squeak();
    return 0;
}
