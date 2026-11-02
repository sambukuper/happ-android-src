package defpackage;

import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qq0 {
    public final vz7 a = new vz7(new w60(3));
    public final vz7 b = new vz7(new w60(4));

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(tn tnVar, s51 s51Var, String str, String str2, SubscriptionItem subscriptionItem) {
        nq0 nq0Var;
        if (s51Var instanceof nq0) {
            nq0Var = (nq0) s51Var;
            int i = nq0Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq0Var.h0 = i - Integer.MIN_VALUE;
            } else {
                nq0Var = new nq0(this, s51Var);
            }
        } else {
            nq0Var = new nq0(this, s51Var);
        }
        nq0 nq0Var2 = nq0Var;
        Object objB = nq0Var2.f0;
        int i2 = nq0Var2.h0;
        if (i2 == 0) {
            w39.n0(objB);
            tq0 tq0Var = (tq0) this.a.getValue();
            nq0Var2.h0 = 1;
            objB = tq0Var.b(tnVar, nq0Var2, str2, str, subscriptionItem);
            c71 c71Var = c71.X;
            if (objB == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objB);
        }
        x83 x83Var = (x83) objB;
        v83 v83Var = v83.a;
        return dh3.f(x83Var, v83Var) ? v83Var : x83Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r6.b(r9, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.tn r7, defpackage.yn1 r8, defpackage.yn1 r9, defpackage.s51 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.oq0
            if (r0 == 0) goto L13
            r0 = r10
            oq0 r0 = (defpackage.oq0) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            oq0 r0 = new oq0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.g0
            int r1 = r0.i0
            r2 = 2
            r3 = 1
            r4 = 0
            c71 r5 = defpackage.c71.X
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.w39.n0(r10)
            goto L60
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r6)
            return r4
        L31:
            yn1 r9 = r0.f0
            defpackage.w39.n0(r10)
            goto L4d
        L37:
            defpackage.w39.n0(r10)
            vz7 r10 = r6.a
            java.lang.Object r10 = r10.getValue()
            tq0 r10 = (defpackage.tq0) r10
            r0.f0 = r9
            r0.i0 = r3
            java.lang.Object r7 = r10.a(r7, r8, r0)
            if (r7 != r5) goto L4d
            goto L5f
        L4d:
            vz7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            ar0 r6 = (defpackage.ar0) r6
            r0.f0 = r4
            r0.i0 = r2
            java.lang.Object r6 = r6.b(r9, r0)
            if (r6 != r5) goto L60
        L5f:
            return r5
        L60:
            dn8 r6 = defpackage.dn8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.b(tn, yn1, yn1, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x021f  */
    /* JADX WARN: Code duplicated, block: B:117:0x022a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0230  */
    /* JADX WARN: Code duplicated, block: B:127:0x0241  */
    /* JADX WARN: Code duplicated, block: B:128:0x0246  */
    /* JADX WARN: Code duplicated, block: B:130:0x0249  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026e, code lost:
    
        if (r0 == r11) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(su.happ.proxyutility.dto.SubscriptionItem r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, defpackage.tn r22, boolean r23, defpackage.s51 r24) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.c(su.happ.proxyutility.dto.SubscriptionItem, java.lang.String, java.lang.String, java.lang.String, tn, boolean, s51):java.lang.Object");
    }
}
