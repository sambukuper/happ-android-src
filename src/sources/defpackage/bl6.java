package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bl6 extends z1 implements RandomAccess {
    public final Object[] X;
    public final int Y;
    public int Z;
    public int f0;

    public bl6(int i, Object[] objArr) {
        this.X = objArr;
        if (i < 0) {
            em7.c(pc6.j(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.Y = objArr.length;
            this.f0 = i;
        } else {
            StringBuilder sbL = ie2.l("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            sbL.append(objArr.length);
            throw new IllegalArgumentException(sbL.toString().toString());
        }
    }

    @Override // defpackage.z0
    public final int a() {
        return this.f0;
    }

    public final void b() {
        if (2 > this.f0) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 2, size = " + this.f0).toString());
        }
        int i = this.Z;
        int i2 = this.Y;
        int i3 = (i + 2) % i2;
        Object[] objArr = this.X;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.Z = i3;
        this.f0 -= 2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f0;
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return null;
        }
        return this.X[(this.Z + i) % this.Y];
    }

    @Override // defpackage.z1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new al6(this);
    }

    @Override // defpackage.z0, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.f0;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f0;
        int i3 = this.Z;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.X;
            if (i5 >= i2 || i3 >= this.Y) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.z0, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
