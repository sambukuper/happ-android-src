package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 implements u27, uw1 {
    public final u27 a;
    public final int b;

    public sw1(u27 u27Var, int i) {
        u27Var.getClass();
        this.a = u27Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.uw1
    public final u27 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new sw1(this, i) : new sw1(this.a, i2);
    }

    @Override // defpackage.u27
    public final Iterator iterator() {
        return new rw1(this);
    }
}
