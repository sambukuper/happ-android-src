package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 extends yn0 {
    public final TextView j;
    public final iz1 k;
    public boolean l = true;

    public oz1(TextView textView) {
        this.j = textView;
        this.k = new iz1(textView);
    }

    @Override // defpackage.yn0
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        if (!this.l) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof iz1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            iz1 iz1Var = this.k;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = iz1Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == iz1Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.yn0
    public final boolean M() {
        return this.l;
    }

    @Override // defpackage.yn0
    public final void d0(boolean z) {
        if (z) {
            TextView textView = this.j;
            textView.setTransformationMethod(i0(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.yn0
    public final void f0(boolean z) {
        this.l = z;
        TextView textView = this.j;
        textView.setTransformationMethod(i0(textView.getTransformationMethod()));
        textView.setFilters(E(textView.getFilters()));
    }

    @Override // defpackage.yn0
    public final TransformationMethod i0(TransformationMethod transformationMethod) {
        if (this.l) {
            return ((transformationMethod instanceof sz1) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new sz1(transformationMethod);
        }
        return transformationMethod instanceof sz1 ? ((sz1) transformationMethod).X : transformationMethod;
    }
}
