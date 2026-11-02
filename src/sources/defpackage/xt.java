package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xt extends ut {
    public Object[] X;
    public int Y;

    @Override // defpackage.ut
    public final int a() {
        return this.Y;
    }

    @Override // defpackage.ut
    public final void b(int i, wm wmVar) {
        Object[] objArrCopyOf = this.X;
        if (objArrCopyOf.length <= i) {
            int length = objArrCopyOf.length;
            do {
                length *= 2;
            } while (length <= i);
            objArrCopyOf = Arrays.copyOf(this.X, length);
            this.X = objArrCopyOf;
        }
        if (objArrCopyOf[i] == null) {
            this.Y++;
        }
        objArrCopyOf[i] = wmVar;
    }

    @Override // defpackage.ut
    public final Object get(int i) {
        return eu.u0(i, this.X);
    }

    @Override // defpackage.ut, java.lang.Iterable
    public final Iterator iterator() {
        return new wt(this);
    }
}
