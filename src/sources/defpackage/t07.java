package defpackage;

import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t07 implements f17, Iterable, qv3 {
    public final s05 X;
    public up4 Y;
    public boolean Z;
    public boolean f0;

    public t07() {
        long[] jArr = uw6.a;
        this.X = new s05();
    }

    @Override // defpackage.f17
    public final void a(e17 e17Var, Object obj) {
        boolean z = obj instanceof q3;
        s05 s05Var = this.X;
        if (z && s05Var.c(e17Var)) {
            Object objG = s05Var.g(e17Var);
            objG.getClass();
            q3 q3Var = (q3) objG;
            q3 q3Var2 = (q3) obj;
            String str = q3Var2.a;
            if (str == null) {
                str = q3Var.a;
            }
            on2 on2Var = q3Var2.b;
            if (on2Var == null) {
                on2Var = q3Var.b;
            }
            s05Var.l(e17Var, new q3(str, on2Var));
        } else {
            s05Var.l(e17Var, obj);
        }
        e17Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    public final t07 b() {
        t07 t07Var = new t07();
        t07Var.Z = this.Z;
        t07Var.f0 = this.f0;
        s05 s05Var = this.X;
        Object[] objArr = s05Var.b;
        Object[] objArr2 = s05Var.c;
        long[] jArr = s05Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            t07Var.X.l(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return t07Var;
    }

    public final Object c(e17 e17Var) {
        Object objG = this.X.g(e17Var);
        if (objG != null) {
            return objG;
        }
        b61.k("Key not present: ", e17Var, " - consider getOrElse or getOrNull");
        return null;
    }

    public final void e(t07 t07Var) {
        s05 s05Var = t07Var.X;
        Object[] objArr = s05Var.b;
        Object[] objArr2 = s05Var.c;
        long[] jArr = s05Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        e17 e17Var = (e17) obj;
                        s05 s05Var2 = this.X;
                        Object objG = s05Var2.g(e17Var);
                        e17Var.getClass();
                        Object objK = e17Var.b.K(objG, obj2);
                        if (objK != null) {
                            s05Var2.l(e17Var, objK);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t07)) {
            return false;
        }
        t07 t07Var = (t07) obj;
        return this.X.equals(t07Var.X) && this.Z == t07Var.Z && this.f0 == t07Var.f0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f0) + pc6.f(this.X.hashCode() * 31, 31, this.Z);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        up4 up4Var = this.Y;
        if (up4Var == null) {
            s05 s05Var = this.X;
            up4 up4Var2 = s05Var.f;
            if (up4Var2 == null) {
                up4Var2 = new up4(s05Var);
                s05Var.f = up4Var2;
            }
            up4Var = up4Var2;
            this.Y = up4Var;
        }
        return ((i22) up4Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.Z) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (this.f0) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        s05 s05Var = this.X;
        Object[] objArr = s05Var.b;
        Object[] objArr2 = s05Var.c;
        long[] jArr = s05Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((e17) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return z91.P(this) + "{ " + ((Object) sb) + " }";
    }
}
