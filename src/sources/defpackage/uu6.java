package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uu6 extends xu6 implements Iterator {
    public vu6 X;
    public vu6 Y;

    @Override // defpackage.xu6
    public final void a(vu6 vu6Var) {
        vu6 vu6Var2 = this.X;
        vu6 vu6Var3 = null;
        if (vu6Var2 == vu6Var && vu6Var == this.Y) {
            this.Y = null;
            this.X = null;
            vu6Var2 = null;
        }
        vu6 vu6Var4 = vu6Var2;
        if (vu6Var2 == vu6Var) {
            vu6Var4 = vu6Var2.f0;
            this.X = vu6Var4;
        }
        vu6 vu6Var5 = this.Y;
        if (vu6Var5 == vu6Var) {
            if (vu6Var5 != vu6Var4 && vu6Var4 != null) {
                vu6Var3 = vu6Var5.Z;
            }
            this.Y = vu6Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        vu6 vu6Var = this.Y;
        vu6 vu6Var2 = this.X;
        this.Y = (vu6Var == vu6Var2 || vu6Var2 == null) ? null : vu6Var.Z;
        return vu6Var;
    }
}
