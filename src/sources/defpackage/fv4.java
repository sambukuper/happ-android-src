package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fv4 {
    public final SparseArray a;
    public oj8 b;

    public fv4(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(oj8 oj8Var, int i, int i2) {
        int iA = oj8Var.a(i);
        SparseArray sparseArray = this.a;
        fv4 fv4Var = (fv4) sparseArray.get(iA);
        if (fv4Var == null) {
            fv4Var = new fv4(1);
            sparseArray.put(oj8Var.a(i), fv4Var);
        }
        if (i2 > i) {
            fv4Var.a(oj8Var, i + 1, i2);
        } else {
            fv4Var.b = oj8Var;
        }
    }
}
