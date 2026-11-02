package defpackage;

import java.util.Arrays;
import java.util.ListIterator;
import su.happ.proxyutility.dto.ServerCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class om5 extends j2 {
    public final Object[] X;
    public final Object[] Y;
    public final int Z;
    public final int f0;

    public om5(Object[] objArr, Object[] objArr2, int i, int i2) {
        objArr.getClass();
        objArr2.getClass();
        this.X = objArr;
        this.Y = objArr2;
        this.Z = i;
        this.f0 = i2;
        if (a() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + a()).toString());
    }

    @Override // defpackage.z0
    public final int a() {
        return this.Z;
    }

    @Override // defpackage.j2
    public final j2 b(ServerCache serverCache) {
        int i = this.Z;
        int i2 = i - ((i - 1) & (-32));
        int i3 = this.f0;
        Object[] objArr = this.X;
        Object[] objArr2 = this.Y;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = serverCache;
            return new om5(objArr, objArrCopyOf, i + 1, i3);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = serverCache;
        if ((i >> 5) <= (1 << i3)) {
            return new om5(e(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new om5(e(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.j2
    public final qm5 c() {
        return new qm5(this, this.X, this.Y, this.f0);
    }

    public final Object[] e(int i, Object[] objArr, Object[] objArr2) {
        int iH = y08.h(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iH] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iH] = e(i - 5, (Object[]) objArrCopyOf[iH], objArr2);
        return objArrCopyOf;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.Z;
        g33.f(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.Y;
        } else {
            Object[] objArr2 = this.X;
            for (int i3 = this.f0; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[y08.h(i, i3)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.z1, java.util.List
    public final ListIterator listIterator(int i) {
        g33.g(i, this.Z);
        return new sm5(this.X, this.Y, i, this.Z, (this.f0 / 5) + 1);
    }
}
