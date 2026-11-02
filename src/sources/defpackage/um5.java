package defpackage;

import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class um5 extends a2 {
    public final qm5 f0;
    public int g0;
    public gf8 h0;
    public int i0;

    public um5(qm5 qm5Var, int i) {
        super(i, qm5Var.h0, (byte) 0);
        this.f0 = qm5Var;
        this.g0 = qm5Var.f();
        this.i0 = -1;
        b();
    }

    public final void a() {
        if (this.g0 == this.f0.f()) {
            return;
        }
        bt.c();
    }

    @Override // defpackage.a2, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.Y;
        qm5 qm5Var = this.f0;
        qm5Var.add(i, obj);
        this.Y++;
        this.Z = qm5Var.a();
        this.g0 = qm5Var.f();
        this.i0 = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        qm5 qm5Var = this.f0;
        Object[] objArr = qm5Var.f0;
        if (objArr == null) {
            this.h0 = null;
            return;
        }
        int i = (qm5Var.h0 - 1) & (-32);
        int i2 = this.Y;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (qm5Var.X / 5) + 1;
        gf8 gf8Var = this.h0;
        if (gf8Var == null) {
            this.h0 = new gf8(objArr, i2, i, i3);
            return;
        }
        gf8Var.Y = i2;
        gf8Var.Z = i;
        gf8Var.f0 = i3;
        Object[] objArr2 = gf8Var.g0;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            gf8Var.g0 = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        gf8Var.h0 = r0;
        gf8Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            bt.n();
            return null;
        }
        int i = this.Y;
        this.i0 = i;
        gf8 gf8Var = this.h0;
        qm5 qm5Var = this.f0;
        if (gf8Var == null) {
            Object[] objArr = qm5Var.g0;
            this.Y = i + 1;
            return objArr[i];
        }
        if (gf8Var.hasNext()) {
            this.Y++;
            return gf8Var.next();
        }
        Object[] objArr2 = qm5Var.g0;
        int i2 = this.Y;
        this.Y = i2 + 1;
        return objArr2[i2 - gf8Var.Z];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            bt.n();
            return null;
        }
        int i = this.Y;
        this.i0 = i - 1;
        gf8 gf8Var = this.h0;
        qm5 qm5Var = this.f0;
        if (gf8Var == null) {
            Object[] objArr = qm5Var.g0;
            int i2 = i - 1;
            this.Y = i2;
            return objArr[i2];
        }
        int i3 = gf8Var.Z;
        if (i <= i3) {
            this.Y = i - 1;
            return gf8Var.previous();
        }
        Object[] objArr2 = qm5Var.g0;
        int i4 = i - 1;
        this.Y = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.a2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.i0;
        if (i == -1) {
            c2.g();
            return;
        }
        qm5 qm5Var = this.f0;
        qm5Var.b(i);
        int i2 = this.i0;
        if (i2 < this.Y) {
            this.Y = i2;
        }
        this.Z = qm5Var.a();
        this.g0 = qm5Var.f();
        this.i0 = -1;
        b();
    }

    @Override // defpackage.a2, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.i0;
        if (i == -1) {
            c2.g();
            return;
        }
        qm5 qm5Var = this.f0;
        qm5Var.set(i, obj);
        this.g0 = qm5Var.f();
        b();
    }
}
