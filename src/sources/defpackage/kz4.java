package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kz4 {
    public final s05 a;

    public /* synthetic */ kz4(s05 s05Var) {
        this.a = s05Var;
    }

    public static final Object a(s05 s05Var) {
        Object objG = s05Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof j05)) {
            s05Var.j(null);
            return objG;
        }
        j05 j05Var = (j05) objG;
        if (j05Var.i()) {
            em7.g("List is empty.");
            return null;
        }
        int i = j05Var.b - 1;
        Object objG2 = j05Var.g(i);
        j05Var.l(i);
        objG2.getClass();
        if (j05Var.i()) {
            s05Var.j(null);
        }
        if (j05Var.b == 1) {
            s05Var.l(null, j05Var.f());
        }
        return objG2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final j05 b(s05 s05Var) {
        if (s05Var.i()) {
            j05 j05Var = h85.b;
            j05Var.getClass();
            return j05Var;
        }
        j05 j05Var2 = new j05();
        Object[] objArr = s05Var.c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof j05) {
                                j05Var2.b((j05) obj);
                            } else {
                                obj.getClass();
                                j05Var2.a(obj);
                            }
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
        return j05Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kz4) {
            return this.a.equals(((kz4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
