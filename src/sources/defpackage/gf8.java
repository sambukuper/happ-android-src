package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gf8 extends a2 {
    public int f0;
    public Object[] g0;
    public boolean h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public gf8(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, (byte) 0);
        objArr.getClass();
        this.f0 = i3;
        Object[] objArr2 = new Object[i3];
        this.g0 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.h0 = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.Y & 31;
        Object obj = this.g0[this.f0 - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.f0 - i2) * 5;
        while (i2 < this.f0) {
            Object[] objArr = this.g0;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[y08.h(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (y08.h(this.Y, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.Y, ((this.f0 - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        Object objA = a();
        int i = this.Y + 1;
        this.Y = i;
        if (i == this.Z) {
            this.h0 = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            bt.n();
            return null;
        }
        this.Y--;
        if (this.h0) {
            this.h0 = false;
            return a();
        }
        c(31);
        return a();
    }
}
