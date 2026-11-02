package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class id7 implements Iterable, qv3 {
    public static final id7 g0 = new id7(0, 0, 0, null);
    public final long X;
    public final long Y;
    public final long Z;
    public final long[] f0;

    public id7(long j, long j2, long j3, long[] jArr) {
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.f0 = jArr;
    }

    public final id7 a(id7 id7Var) {
        long[] jArr;
        id7 id7VarB = this;
        id7 id7Var2 = g0;
        if (id7Var == id7Var2) {
            return id7VarB;
        }
        if (id7VarB == id7Var2) {
            return id7Var2;
        }
        long j = id7Var.Z;
        long j2 = id7Var.Z;
        long[] jArr2 = id7Var.f0;
        long j3 = id7Var.Y;
        long j4 = id7Var.X;
        long j5 = id7VarB.Z;
        if (j == j5 && jArr2 == (jArr = id7VarB.f0)) {
            return new id7(id7VarB.X & (~j4), id7VarB.Y & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                id7VarB = id7VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    id7VarB = id7VarB.b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    id7VarB = id7VarB.b(((long) i2) + j2 + 64);
                }
            }
        }
        return id7VarB;
    }

    public final id7 b(long j) {
        long[] jArr;
        int iH;
        long[] jArr2;
        long j2 = j - this.Z;
        if (dh3.l(j2, 0L) >= 0 && dh3.l(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.Y;
            if ((j4 & j3) != 0) {
                return new id7(this.X, j4 & (~j3), this.Z, this.f0);
            }
        } else if (dh3.l(j2, 64L) >= 0 && dh3.l(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.X;
            if ((j6 & j5) != 0) {
                return new id7(j6 & (~j5), this.Y, this.Z, this.f0);
            }
        } else if (dh3.l(j2, 0L) < 0 && (jArr = this.f0) != null && (iH = i21.h(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iH > 0) {
                    eu.f0(jArr, jArr3, 0, 0, iH);
                }
                if (iH < i) {
                    eu.f0(jArr, jArr3, iH, iH + 1, length);
                }
                jArr2 = jArr3;
            }
            return new id7(this.X, this.Y, this.Z, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.Z;
        if (dh3.l(j2, 0L) >= 0 && dh3.l(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.Y) != 0;
        }
        if (dh3.l(j2, 64L) < 0 || dh3.l(j2, 128L) >= 0) {
            return dh3.l(j2, 0L) <= 0 && (jArr = this.f0) != null && i21.h(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.X) != 0;
    }

    public final id7 e(id7 id7Var) {
        id7 id7VarF;
        long[] jArr;
        id7 id7VarF2 = this;
        id7 id7Var2 = g0;
        if (id7Var == id7Var2) {
            return id7VarF2;
        }
        if (id7VarF2 == id7Var2) {
            return id7Var;
        }
        long j = id7Var.Z;
        long j2 = id7Var.Z;
        long[] jArr2 = id7Var.f0;
        long j3 = id7Var.Y;
        long j4 = id7Var.X;
        long j5 = id7VarF2.Z;
        long j6 = id7VarF2.Y;
        long j7 = id7VarF2.X;
        if (j == j5 && jArr2 == (jArr = id7VarF2.f0)) {
            return new id7(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = id7VarF2.f0;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    id7VarF2 = id7VarF2.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        id7VarF2 = id7VarF2.f(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        id7VarF2 = id7VarF2.f(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return id7VarF2;
        }
        if (jArr3 != null) {
            id7VarF = id7Var;
            for (long j9 : jArr3) {
                id7VarF = id7VarF.f(j9);
            }
        } else {
            id7VarF = id7Var;
        }
        long j10 = id7VarF2.Z;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    id7VarF = id7VarF.f(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    id7VarF = id7VarF.f(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return id7VarF;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    public final id7 f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.Z;
        long j5 = j - j4;
        long j6 = 0;
        int iL = dh3.l(j5, 0L);
        long j7 = this.Y;
        if (iL < 0 || dh3.l(j5, 64L) >= 0) {
            int iL2 = dh3.l(j5, 64L);
            long j8 = this.X;
            int i2 = 64;
            if (iL2 < 0 || dh3.l(j5, 128L) >= 0) {
                int iL3 = dh3.l(j5, 128L);
                long[] jArr3 = this.f0;
                if (iL3 < 0) {
                    if (jArr3 == null) {
                        return new id7(this.X, this.Y, this.Z, new long[]{j});
                    }
                    int iH = i21.h(jArr3, j);
                    if (iH < 0) {
                        int i3 = -(iH + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        eu.f0(jArr3, jArr4, 0, 0, i3);
                        eu.f0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new id7(this.X, this.Y, this.Z, jArr4);
                    }
                } else if (!c(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (dh3.l(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    lr5 lr5Var = null;
                    while (true) {
                        if (dh3.l(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (lr5Var == null) {
                                lr5Var = new lr5(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    ((zz4) lr5Var.Y).a(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (lr5Var == null) {
                        jArr = jArr3;
                    } else {
                        zz4 zz4Var = (zz4) lr5Var.Y;
                        int i5 = zz4Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = zz4Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new id7(j10, j3, j2, jArr).f(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new id7(j8 | j12, this.Y, this.Z, this.f0);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new id7(this.X, j7 | j13, this.Z, this.f0);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return jm4.P(new hd7(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(xv0.Z(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET);
        return string + " [" + sb.toString() + "]";
    }
}
