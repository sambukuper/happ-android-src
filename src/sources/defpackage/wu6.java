package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wu6 extends xu6 implements Iterator {
    public vu6 X;
    public boolean Y = true;
    public final /* synthetic */ yu6 Z;

    public wu6(yu6 yu6Var) {
        this.Z = yu6Var;
    }

    @Override // defpackage.xu6
    public final void a(vu6 vu6Var) {
        vu6 vu6Var2 = this.X;
        if (vu6Var == vu6Var2) {
            vu6 vu6Var3 = vu6Var2.f0;
            this.X = vu6Var3;
            this.Y = vu6Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.Y) {
            return this.Z.X != null;
        }
        vu6 vu6Var = this.X;
        return (vu6Var == null || vu6Var.Z == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.Y) {
            this.Y = false;
            vu6 vu6Var = this.Z.X;
            this.X = vu6Var;
            return vu6Var;
        }
        vu6 vu6Var2 = this.X;
        vu6 vu6Var3 = vu6Var2 != null ? vu6Var2.Z : null;
        this.X = vu6Var3;
        return vu6Var3;
    }
}
