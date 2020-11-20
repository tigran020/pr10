package complex;

import complex.Complex;

public interface ComplexAbstractFactory {
    Complex createComplex();

    Complex createComplex(int real, int image);
}
