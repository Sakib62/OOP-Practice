/*      BISMILLAHIR-RAHMANIR-RAHIM
        *******************************
        \                            ~~
         \                            ~~
          \     SAKIB-SUST-SWE'19      ~~
           \                            ~~
            \                            ~~
             ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
*/
#include <bits/stdc++.h>
using namespace std;

class cmplx {
private:
	int real;
	float imaginary;

public:
	cmplx(int real, float imaginary) {
		this->real = real;
		this->imaginary = imaginary;
	}

	int getReal() {
		return real;
	}
	float getImaginary() {
		return imaginary;
	}

	void display() {
		cout << "Complex " << real << "+" << imaginary << "i\n";
	}
};

cmplx addNumber(cmplx com1, cmplx com2) {
	int real = com1.getReal() + com2.getReal();
	float imaginary = com1.getImaginary() + com2.getImaginary();

	cmplx sum(real, imaginary);
	return sum;
}

int main() {

    ios::sync_with_stdio(false);
    cin.tie(0);
//start
    //complex is a keyword in c++.
//https://www.geeksforgeeks.org/complex-numbers-c-set-1/
    
    complex <double> mycom(3, 3);
    cout << "Real part: " << real(mycom) << "\n";
    cout << "Imaginary part: " << imag(mycom) << "\n";

    cout << "Absolute value: " << abs(mycom) << "\n";
    cout << "Argument: " << arg(mycom) << "\n";

    cout << polar(2.0, 0.5) << "\n";
    cout << norm(mycom) << "\n";
    cout << conj(mycom) << "\n";

	cout << "\n";
    //end
    
    cmplx a(4, 19);
    cmplx b(2, 9);
    a.display();
    b.display();

    cmplx tmp = addNumber(a, b);
    tmp.display();

    cmplx *indir;
    indir = &tmp;
    indir->display();
}