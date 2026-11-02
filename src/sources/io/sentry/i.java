package io.sentry;

import defpackage.bt;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator {
    public int X;
    public int Y = -1;
    public boolean Z;
    public final /* synthetic */ j f0;

    public i(j jVar) {
        this.f0 = jVar;
        this.X = jVar.Y;
        this.Z = jVar.f0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z || this.X != this.f0.Z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        this.Z = false;
        int i = this.X;
        this.Y = i;
        int i2 = i + 1;
        j jVar = this.f0;
        this.X = i2 < jVar.g0 ? i2 : 0;
        return jVar.X[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        j jVar = this.f0;
        int i2 = jVar.g0;
        Object[] objArr = jVar.X;
        int i3 = this.Y;
        if (i3 == -1) {
            c2.g();
            return;
        }
        int i4 = jVar.Y;
        if (i3 == i4) {
            jVar.remove();
            this.Y = -1;
            return;
        }
        int i5 = i3 + 1;
        if (i4 >= i3 || i5 >= (i = jVar.Z)) {
            while (i5 != jVar.Z) {
                if (i5 >= i2) {
                    objArr[i5 - 1] = objArr[0];
                } else {
                    int i6 = i5 - 1;
                    if (i6 < 0) {
                        i6 = i2 - 1;
                    }
                    objArr[i6] = objArr[i5];
                    i5++;
                    if (i5 >= i2) {
                    }
                }
                i5 = 0;
            }
        } else {
            System.arraycopy(objArr, i5, objArr, i3, i - i5);
        }
        this.Y = -1;
        int i7 = jVar.Z - 1;
        if (i7 < 0) {
            i7 = i2 - 1;
        }
        jVar.Z = i7;
        objArr[i7] = null;
        jVar.f0 = false;
        int i8 = this.X - 1;
        if (i8 < 0) {
            i8 = i2 - 1;
        }
        this.X = i8;
    }
}
