package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gs extends uy7 implements rn2 {
    public byte g0;
    public final /* synthetic */ boolean h0;
    public final /* synthetic */ ms i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(boolean z, ms msVar, q51 q51Var) {
        super(2, q51Var);
        this.h0 = z;
        this.i0 = msVar;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((gs) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new gs(this.h0, this.i0, q51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r0.d(r4) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r3.d(r4) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return r5;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r5) {
        /*
            r4 = this;
            byte r0 = r4.g0
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r4)
            r4 = 0
            return r4
        L12:
            defpackage.w39.n0(r5)
            goto L35
        L16:
            defpackage.w39.n0(r5)
            c71 r5 = defpackage.c71.X
            boolean r0 = r4.h0
            ms r3 = r4.i0
            if (r0 == 0) goto L2c
            rp8 r0 = r3.b
            r4.g0 = r2
            java.lang.Object r4 = r0.d(r4)
            if (r4 != r5) goto L35
            goto L34
        L2c:
            r4.g0 = r1
            java.lang.Object r4 = r3.d(r4)
            if (r4 != r5) goto L35
        L34:
            return r5
        L35:
            dn8 r4 = defpackage.dn8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs.q(java.lang.Object):java.lang.Object");
    }
}
