#include <iostream>
#include <algorithm>
#include <fstream>
using namespace std;

class Rectangle {
//by deafult all attribute & method are private.
public: 
    int length, breadth;
    Rectangle(int length, int breadth);
    void display();
private:
    int y = 50;
}; //need this semicolon at the end.

Rectangle::Rectangle(int length, int breadth) {
    this->length = length;
    this->breadth = breadth;
}

//return_type class_name::method_name(argument) 
//:: is scope resolution operator
//signature of method need to declared inside class, but body of method can be inside or outside.
void Rectangle::display() { 
    cout << "length: " << length << "\nbreadth: " << breadth << "\n";
}

//Multilevel Inheritance is nested inheritance
//Multiple Inheritance is same class inheriting many class.
//we can use protected member of base class through getter & setter method.

class A {
public:
    string s = "class a";
    void start() {
        cout << "This is so cool!";
    }
};

class B : public A {
protected:
    int salary;
public:
    string s = "class b";
    void start() {
        cout << "Stop!!";
    }
};

class C : public B {
public:
    int bonus;
    string s = "class c";
    void setSalary(int s) {
        salary = s;
    }
    int getSalary() {
        return salary;
    }

    void start() {
        cout << "NICE CODE!\n";
    }
};
 

//C++ is partially object oriented. 
//Because 1) Main class is outside class 
//        2)Global varibale
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    Rectangle r(5, 14);//constructor argument pass like this. No new keyword in c++ oop.         
    r.display();

    C c;
    c.start();
    c.setSalary(500);
    c.bonus = 300;
    cout << c.getSalary() << " " << c.bonus << "\n" << c.s << "\n";

    // ofstream file("PractiseFile.txt");
    // file << "I am Sakib.\nI had a good time in school with my best buddies.\nI miss them so much.\n";
    // file.close();

    // ifstream file1("PractiseFile.txt");
    // string read;
    // while(getline(file1, read)) {
    //     cout << read << "\n";
    // }    
    // file1.close();

    try { //try and catch comes in pair. 
    //try to detect problems, catch to decide what to do if problems are found.
        int age = 16;
        if(age >= 18) {
            cout << "You are old enough.";
        }
        else {
            throw 505; // or throw(age);
            //throws exception if problems found to create custom errors.
        }
    }
    catch(...) { //if we do not know the throw type used in try block.
        cout << "Access denied- You must be at least 18 years old.\n";
    }
    return 0;
}

//class-attribute
    //class-method
    //constructor
    //access modifier
    //encapsulation.. use of get and set method to access restricted properties.
    //inhertiance
    //polymorphism
    //file
    //exception
