package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g24 implements bo2, Serializable {
    public final byte X;

    /* JADX WARN: Multi-variable type inference failed */
    public g24(int i) {
        this.X = i;
    }

    @Override // defpackage.bo2
    public final int t() {
        return this.X;
    }

    public final String toString() {
        String strJ = yb6.a.j(this);
        strJ.getClass();
        return strJ;
    }
}
