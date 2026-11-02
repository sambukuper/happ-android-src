package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ic8 extends uy7 implements gn2 {
    public byte g0;
    public final /* synthetic */ jc8 h0;
    public final /* synthetic */ rf0 i0;
    public final /* synthetic */ f15 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic8(jc8 jc8Var, rf0 rf0Var, f15 f15Var, q51 q51Var) {
        super(1, q51Var);
        this.h0 = jc8Var;
        this.i0 = rf0Var;
        this.j0 = f15Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((ic8) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new ic8(this.h0, this.i0, this.j0, q51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (defpackage.a28.t(new defpackage.va8(1500, r8), r9) == r7) goto L21;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.g0
            r1 = 0
            f15 r2 = defpackage.f15.Z
            f15 r3 = r8.j0
            r4 = 2
            r5 = 1
            jc8 r6 = r8.h0
            if (r0 == 0) goto L1d
            if (r0 == r5) goto L11
            if (r0 != r4) goto L17
        L11:
            defpackage.w39.n0(r9)     // Catch: java.lang.Throwable -> L15
            goto L48
        L15:
            r8 = move-exception
            goto L50
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r8)
            return r1
        L1d:
            defpackage.w39.n0(r9)
            boolean r9 = r6.a     // Catch: java.lang.Throwable -> L15
            rf0 r0 = r8.i0
            c71 r7 = defpackage.c71.X
            if (r9 == 0) goto L31
            r8.g0 = r5     // Catch: java.lang.Throwable -> L15
            java.lang.Object r8 = r0.B(r8)     // Catch: java.lang.Throwable -> L15
            if (r8 != r7) goto L48
            goto L47
        L31:
            ym7 r9 = new ym7     // Catch: java.lang.Throwable -> L15
            r5 = 8
            r9.<init>(r0, r1, r5)     // Catch: java.lang.Throwable -> L15
            r8.g0 = r4     // Catch: java.lang.Throwable -> L15
            va8 r0 = new va8     // Catch: java.lang.Throwable -> L15
            r4 = 1500(0x5dc, double:7.41E-321)
            r0.<init>(r4, r8)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r8 = defpackage.a28.t(r0, r9)     // Catch: java.lang.Throwable -> L15
            if (r8 != r7) goto L48
        L47:
            return r7
        L48:
            if (r3 == r2) goto L4d
            r6.a()
        L4d:
            dn8 r8 = defpackage.dn8.a
            return r8
        L50:
            if (r3 == r2) goto L55
            r6.a()
        L55:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic8.q(java.lang.Object):java.lang.Object");
    }
}
