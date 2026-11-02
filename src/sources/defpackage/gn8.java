package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gn8 {
    public hn8 a(Object obj) {
        cq2 cq2Var = (cq2) obj;
        hn8 hn8Var = cq2Var.unknownFields;
        if (hn8Var != hn8.f) {
            return hn8Var;
        }
        hn8 hn8Var2 = new hn8(0, new int[8], new Object[8], true);
        cq2Var.unknownFields = hn8Var2;
        return hn8Var2;
    }

    public final boolean b(int i, kv0 kv0Var, Object obj) throws qh3 {
        jv0 jv0Var = kv0Var.a;
        int i2 = kv0Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            kv0Var.w(0);
            ((hn8) obj).c(i3 << 3, Long.valueOf(jv0Var.r()));
            return true;
        }
        if (i4 == 1) {
            kv0Var.w(1);
            ((hn8) obj).c((i3 << 3) | 1, Long.valueOf(jv0Var.o()));
            return true;
        }
        if (i4 == 2) {
            ((hn8) obj).c((i3 << 3) | 2, kv0Var.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw qh3.b();
            }
            kv0Var.w(5);
            ((hn8) obj).c(5 | (i3 << 3), Integer.valueOf(jv0Var.n()));
            return true;
        }
        hn8 hn8Var = new hn8(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new qh3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kv0Var.a() != Integer.MAX_VALUE && b(i7, kv0Var, hn8Var)) {
        }
        if (i6 != kv0Var.b) {
            throw new qh3("Protocol message end-group tag did not match expected tag.");
        }
        if (hn8Var.e) {
            hn8Var.e = false;
        }
        ((hn8) obj).c(i5 | 3, hn8Var);
        return true;
    }
}
