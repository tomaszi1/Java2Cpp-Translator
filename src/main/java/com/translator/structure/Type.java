
package com.translator.structure;

public abstract class Type extends Rule {
    private int arrayDims = 0;

    public int getArrayDims() {
        return arrayDims;
    }

    public void setArrayDims(int arrayDims) {
        this.arrayDims = arrayDims;
    }
}
