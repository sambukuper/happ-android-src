package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 extends uy7 implements rn2 {
    public ca6 g0;
    public byte h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ ca6 j0;
    public final /* synthetic */ ib1 k0;
    public final /* synthetic */ Object l0;
    public final /* synthetic */ boolean m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb1(ca6 ca6Var, ib1 ib1Var, Object obj, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.j0 = ca6Var;
        this.k0 = ib1Var;
        this.l0 = obj;
        this.m0 = z;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((hb1) n((q51) obj2, (ca2) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        hb1 hb1Var = new hb1(this.j0, this.k0, this.l0, this.m0, q51Var);
        hb1Var.i0 = obj;
        return hb1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r10 == r8) goto L21;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r10) throws java.io.IOException {
        /*
            r9 = this;
            byte r0 = r9.h0
            dn8 r1 = defpackage.dn8.a
            java.lang.Object r2 = r9.l0
            ib1 r3 = r9.k0
            ca6 r4 = r9.j0
            r5 = 2
            r6 = 1
            r7 = 0
            c71 r8 = defpackage.c71.X
            if (r0 == 0) goto L29
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L19
            defpackage.w39.n0(r10)
            goto L78
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r9)
            return r7
        L1f:
            ca6 r0 = r9.g0
            java.lang.Object r6 = r9.i0
            ca2 r6 = (defpackage.ca2) r6
            defpackage.w39.n0(r10)
            goto L50
        L29:
            defpackage.w39.n0(r10)
            java.lang.Object r10 = r9.i0
            ca2 r10 = (defpackage.ca2) r10
            ja7 r0 = r3.b()
            r9.i0 = r10
            r9.g0 = r4
            r9.h0 = r6
            yr2 r0 = r0.b
            java.lang.Object r0 = r0.Y
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            if (r6 != r8) goto L4c
            goto L77
        L4c:
            r0 = r6
            r6 = r10
            r10 = r0
            r0 = r4
        L50:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0.X = r10
            r9.i0 = r7
            r9.g0 = r7
            r9.h0 = r5
            java.util.concurrent.atomic.AtomicBoolean r10 = r6.b
            boolean r10 = r10.get()
            if (r10 != 0) goto L91
            java.io.File r10 = r6.a
            ba2 r0 = new ba2
            r0.<init>(r6, r2, r7)
            java.lang.Object r10 = defpackage.w39.k0(r10, r0, r9)
            if (r10 != r8) goto L74
            goto L75
        L74:
            r10 = r1
        L75:
            if (r10 != r8) goto L78
        L77:
            return r8
        L78:
            boolean r9 = r9.m0
            if (r9 == 0) goto L90
            jb1 r9 = r3.j0
            v91 r10 = new v91
            if (r2 == 0) goto L87
            int r0 = r2.hashCode()
            goto L88
        L87:
            r0 = 0
        L88:
            int r3 = r4.X
            r10.<init>(r0, r3, r2)
            r9.c(r10)
        L90:
            return r1
        L91:
            java.lang.String r9 = "This scope has already been closed."
            defpackage.bt.i(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb1.q(java.lang.Object):java.lang.Object");
    }
}
