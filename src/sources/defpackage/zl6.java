package defpackage;

import io.sentry.c2;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zl6 extends jb0 {
    public static final int[] j0;
    public final int Y;
    public final jb0 Z;
    public final jb0 f0;
    public final int g0;
    public final int h0;
    public int i0 = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        j0 = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = j0;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public zl6(jb0 jb0Var, jb0 jb0Var2) {
        this.Z = jb0Var;
        this.f0 = jb0Var2;
        int size = jb0Var.size();
        this.g0 = size;
        this.Y = jb0Var2.size() + size;
        this.h0 = Math.max(jb0Var.e(), jb0Var2.e()) + 1;
    }

    @Override // defpackage.jb0
    public final void d(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        jb0 jb0Var = this.Z;
        int i5 = this.g0;
        if (i4 <= i5) {
            jb0Var.d(bArr, i, i2, i3);
            return;
        }
        jb0 jb0Var2 = this.f0;
        if (i >= i5) {
            jb0Var2.d(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        jb0Var.d(bArr, i, i2, i6);
        jb0Var2.d(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // defpackage.jb0
    public final int e() {
        return this.h0;
    }

    public final boolean equals(Object obj) {
        int iN;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jb0) {
            jb0 jb0Var = (jb0) obj;
            int size = jb0Var.size();
            int i = this.Y;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.i0 == 0 || (iN = jb0Var.n()) == 0 || this.i0 == iN) {
                    bv0 bv0Var = new bv0(this);
                    mc4 mc4VarA = bv0Var.a();
                    bv0 bv0Var2 = new bv0(jb0Var);
                    mc4 mc4VarA2 = bv0Var2.a();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = mc4VarA.Y.length - i2;
                        int length2 = mc4VarA2.Y.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? mc4VarA.t(mc4VarA2, i3, iMin) : mc4VarA2.t(mc4VarA, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            c2.g();
                            return false;
                        }
                        if (iMin == length) {
                            mc4VarA = bv0Var.a();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            mc4VarA2 = bv0Var2.a();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jb0
    public final boolean f() {
        return this.Y >= j0[this.h0];
    }

    @Override // defpackage.jb0
    public final boolean h() {
        int iL = this.Z.l(0, 0, this.g0);
        jb0 jb0Var = this.f0;
        return jb0Var.l(iL, 0, jb0Var.size()) == 0;
    }

    public final int hashCode() {
        int iJ = this.i0;
        if (iJ == 0) {
            int i = this.Y;
            iJ = j(i, 0, i);
            if (iJ == 0) {
                iJ = 1;
            }
            this.i0 = iJ;
        }
        return iJ;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yl6(this);
    }

    @Override // defpackage.jb0
    public final int j(int i, int i2, int i3) {
        int i4 = i2 + i3;
        jb0 jb0Var = this.Z;
        int i5 = this.g0;
        if (i4 <= i5) {
            return jb0Var.j(i, i2, i3);
        }
        jb0 jb0Var2 = this.f0;
        if (i2 >= i5) {
            return jb0Var2.j(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return jb0Var2.j(jb0Var.j(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.jb0
    public final int l(int i, int i2, int i3) {
        int i4 = i2 + i3;
        jb0 jb0Var = this.Z;
        int i5 = this.g0;
        if (i4 <= i5) {
            return jb0Var.l(i, i2, i3);
        }
        jb0 jb0Var2 = this.f0;
        if (i2 >= i5) {
            return jb0Var2.l(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return jb0Var2.l(jb0Var.l(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.jb0
    public final int n() {
        return this.i0;
    }

    @Override // defpackage.jb0
    public final void s(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        jb0 jb0Var = this.Z;
        int i4 = this.g0;
        if (i3 <= i4) {
            jb0Var.s(outputStream, i, i2);
            return;
        }
        jb0 jb0Var2 = this.f0;
        if (i >= i4) {
            jb0Var2.s(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        jb0Var.s(outputStream, i, i5);
        jb0Var2.s(outputStream, 0, i2 - i5);
    }

    @Override // defpackage.jb0
    public final int size() {
        return this.Y;
    }
}
