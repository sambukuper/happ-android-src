package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pz1 extends yn0 {
    public final oz1 j;

    public pz1(TextView textView) {
        this.j = new oz1(textView);
    }

    @Override // defpackage.yn0
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        return !yy1.d() ? inputFilterArr : this.j.E(inputFilterArr);
    }

    @Override // defpackage.yn0
    public final boolean M() {
        return this.j.l;
    }

    @Override // defpackage.yn0
    public final void d0(boolean z) {
        if (yy1.d()) {
            this.j.d0(z);
        }
    }

    @Override // defpackage.yn0
    public final void f0(boolean z) {
        boolean zD = yy1.d();
        oz1 oz1Var = this.j;
        if (zD) {
            oz1Var.f0(z);
        } else {
            oz1Var.l = z;
        }
    }

    @Override // defpackage.yn0
    public final TransformationMethod i0(TransformationMethod transformationMethod) {
        return !yy1.d() ? transformationMethod : this.j.i0(transformationMethod);
    }
}
