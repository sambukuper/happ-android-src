package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y54 extends uy7 implements rn2 {
    public byte g0;
    public final /* synthetic */ boolean h0;
    public final /* synthetic */ z54 i0;
    public final /* synthetic */ ta2 j0;
    public final /* synthetic */ xt2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y54(boolean z, z54 z54Var, ta2 ta2Var, xt2 xt2Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = z;
        this.i0 = z54Var;
        this.j0 = ta2Var;
        this.k0 = xt2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((y54) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new y54(this.h0, this.i0, this.j0, this.k0, q51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r10 == r8) goto L22;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            z54 r0 = r9.i0
            rh5 r1 = r0.i
            oi r2 = r0.q
            byte r3 = r9.g0
            r4 = 2
            r5 = 1
            c71 r8 = defpackage.c71.X
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L19
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L16
            goto L58
        L16:
            r0 = move-exception
            r9 = r0
            goto L62
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r9)
            r9 = 0
            return r9
        L20:
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L16
            goto L3a
        L24:
            defpackage.w39.n0(r10)
            boolean r10 = r9.h0     // Catch: java.lang.Throwable -> L16
            if (r10 == 0) goto L3a
            java.lang.Float r10 = new java.lang.Float     // Catch: java.lang.Throwable -> L16
            r3 = 0
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L16
            r9.g0 = r5     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r2.e(r9, r10)     // Catch: java.lang.Throwable -> L16
            if (r10 != r8) goto L3a
            goto L57
        L3a:
            java.lang.Float r3 = new java.lang.Float     // Catch: java.lang.Throwable -> L16
            r10 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L16
            r10 = r4
            ta2 r4 = r9.j0     // Catch: java.lang.Throwable -> L16
            xt2 r5 = r9.k0     // Catch: java.lang.Throwable -> L16
            r6 = r5
            x54 r5 = new x54     // Catch: java.lang.Throwable -> L16
            r7 = 0
            r5.<init>(r6, r0, r7)     // Catch: java.lang.Throwable -> L16
            r9.g0 = r10     // Catch: java.lang.Throwable -> L16
            r7 = 4
            r6 = r9
            java.lang.Object r10 = defpackage.oi.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L16
            if (r10 != r8) goto L58
        L57:
            return r8
        L58:
            nk r10 = (defpackage.nk) r10     // Catch: java.lang.Throwable -> L16
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r1.setValue(r9)
            dn8 r9 = defpackage.dn8.a
            return r9
        L62:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r1.setValue(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y54.q(java.lang.Object):java.lang.Object");
    }
}
