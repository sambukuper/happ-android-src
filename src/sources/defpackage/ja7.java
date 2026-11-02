package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ja7 {
    public final q15 a = r15.a();
    public final yr2 b = new yr2((byte) 7);
    public final j31 c = new j31(new vh(2, null, 5), 7);

    public ja7(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.Y).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ja7] */
    /* JADX WARN: Type inference failed for: r6v1, types: [o15] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [o15] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gn2 r7, defpackage.s51 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ha7
            if (r0 == 0) goto L13
            r0 = r8
            ha7 r0 = (defpackage.ha7) r0
            int r1 = r0.j0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j0 = r1
            goto L18
        L13:
            ha7 r0 = new ha7
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.h0
            int r1 = r0.j0
            r2 = 2
            r3 = 1
            r4 = 0
            c71 r5 = defpackage.c71.X
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.f0
            o15 r6 = (defpackage.o15) r6
            defpackage.w39.n0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r6)
            return r4
        L37:
            q15 r6 = r0.g0
            java.lang.Object r7 = r0.f0
            gn2 r7 = (defpackage.gn2) r7
            defpackage.w39.n0(r8)
            goto L53
        L41:
            defpackage.w39.n0(r8)
            r0.f0 = r7
            q15 r6 = r6.a
            r0.g0 = r6
            r0.j0 = r3
            java.lang.Object r8 = r6.g(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.f0 = r6     // Catch: java.lang.Throwable -> L2f
            r0.g0 = r4     // Catch: java.lang.Throwable -> L2f
            r0.j0 = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.B(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.m(r4)
            return r8
        L64:
            r6.m(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja7.b(gn2, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(rn2 rn2Var, s51 s51Var) throws Throwable {
        ia7 ia7Var;
        q15 q15Var;
        boolean z;
        Throwable th;
        if (s51Var instanceof ia7) {
            ia7Var = (ia7) s51Var;
            int i = ia7Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ia7Var.j0 = i - Integer.MIN_VALUE;
            } else {
                ia7Var = new ia7(this, s51Var);
            }
        } else {
            ia7Var = new ia7(this, s51Var);
        }
        Object obj = ia7Var.h0;
        int i2 = ia7Var.j0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ia7Var.g0;
            q15Var = ia7Var.f0;
            try {
                w39.n0(obj);
                if (z) {
                    q15Var.m(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    q15Var.m(null);
                }
                throw th;
            }
        }
        w39.n0(obj);
        q15 q15Var2 = this.a;
        boolean zD = q15Var2.d();
        try {
            Object objValueOf = Boolean.valueOf(zD);
            ia7Var.f0 = q15Var2;
            ia7Var.g0 = zD;
            ia7Var.j0 = 1;
            Object objK = rn2Var.K(objValueOf, ia7Var);
            Object obj2 = c71.X;
            if (objK == obj2) {
                return obj2;
            }
            q15Var = q15Var2;
            z = zD;
            obj = objK;
            if (z) {
                q15Var.m(null);
            }
            return obj;
        } catch (Throwable th3) {
            q15Var = q15Var2;
            z = zD;
            th = th3;
            if (z) {
                q15Var.m(null);
            }
            throw th;
        }
    }
}
