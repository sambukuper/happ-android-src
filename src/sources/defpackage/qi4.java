package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qi4 implements Cloneable {
    public /* synthetic */ boolean X;
    public /* synthetic */ long[] Y;
    public /* synthetic */ Object[] Z;
    public /* synthetic */ int f0;

    public qi4(int i) {
        if (i == 0) {
            this.Y = w45.c;
            this.Z = w45.d;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.Y = new long[i5];
        this.Z = new Object[i5];
    }

    public final void a() {
        int i = this.f0;
        Object[] objArr = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f0 = 0;
        this.X = false;
    }

    public final Object b(long j) {
        Object obj;
        int iL = w45.l(this.Y, this.f0, j);
        if (iL < 0 || (obj = this.Z[iL]) == u70.d) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.X) {
            int i = this.f0;
            long[] jArr = this.Y;
            Object[] objArr = this.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != u70.d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.X = false;
            this.f0 = i2;
        }
        return w45.l(this.Y, this.f0, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        qi4 qi4Var = (qi4) objClone;
        qi4Var.Y = (long[]) this.Y.clone();
        qi4Var.Z = (Object[]) this.Z.clone();
        return qi4Var;
    }

    public final boolean d() {
        return h() == 0;
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f0)) {
            bt.q(pc6.j(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.X) {
            long[] jArr = this.Y;
            Object[] objArr = this.Z;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != u70.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.X = false;
            this.f0 = i3;
        }
        return this.Y[i];
    }

    public final void f(long j, Object obj) {
        Object obj2 = u70.d;
        int iL = w45.l(this.Y, this.f0, j);
        if (iL >= 0) {
            this.Z[iL] = obj;
            return;
        }
        int i = ~iL;
        int i2 = this.f0;
        if (i < i2) {
            Object[] objArr = this.Z;
            if (objArr[i] == obj2) {
                this.Y[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.X) {
            long[] jArr = this.Y;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.Z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.X = false;
                this.f0 = i3;
                i = ~w45.l(this.Y, i3, j);
            }
        }
        int i5 = this.f0;
        if (i5 >= this.Y.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.Y = Arrays.copyOf(this.Y, i9);
            this.Z = Arrays.copyOf(this.Z, i9);
        }
        int i10 = this.f0;
        if (i10 - i != 0) {
            long[] jArr2 = this.Y;
            int i11 = i + 1;
            eu.f0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.Z;
            eu.g0(objArr3, objArr3, i11, i, this.f0);
        }
        this.Y[i] = j;
        this.Z[i] = obj;
        this.f0++;
    }

    public final void g(long j) {
        int iL = w45.l(this.Y, this.f0, j);
        if (iL >= 0) {
            Object[] objArr = this.Z;
            Object obj = objArr[iL];
            Object obj2 = u70.d;
            if (obj != obj2) {
                objArr[iL] = obj2;
                this.X = true;
            }
        }
    }

    public final int h() {
        if (this.X) {
            int i = this.f0;
            long[] jArr = this.Y;
            Object[] objArr = this.Z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != u70.d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.X = false;
            this.f0 = i2;
        }
        return this.f0;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f0)) {
            bt.q(pc6.j(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.X) {
            long[] jArr = this.Y;
            Object[] objArr = this.Z;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != u70.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.X = false;
            this.f0 = i3;
        }
        return this.Z[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f0 * 28);
        sb.append('{');
        int i = this.f0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ qi4(Object obj) {
        this(10);
    }
}
