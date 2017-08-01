#ifndef ADPATER_H_INCLUDED
#define ADPATER_H_INCLUDED

//interface to bird
class Bird
{
public:
    virtual void fly() =0;
    virtual void makeSound() = 0;
};
class Sparrow : public Bird
{
public:
    Sparrow();
    ~Sparrow();
    void makeSound();
    void fly();
};
//second interface
class ToyBird
{
public:
    virtual void squeak() = 0;
};

class ImplementToyBird : public ToyBird
{
public:
    ImplementToyBird();
    ~ImplementToyBird();
    void squeak();
};
//Adapting ToyBird interface to Bird Interface
class BirdAdaptor : public ToyBird
{
public:
    Sparrow bird;
    BirdAdaptor(Sparrow &bird){
    this->bird = bird;
    }
    void squeak()
    {
        bird.makeSound();
    }
};


#endif // ADPATER_H_INCLUDED
