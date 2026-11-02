package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public final /* synthetic */ xz4 i0;
    public final /* synthetic */ ft5 j0;
    public final /* synthetic */ x0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(xz4 xz4Var, ft5 ft5Var, x0 x0Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = xz4Var;
        this.j0 = ft5Var;
        this.k0 = x0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((u0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new u0(this.i0, this.j0, this.k0, q51Var, (byte) 0);
            default:
                return new u0(this.i0, this.j0, this.k0, q51Var, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.g0
            dn8 r1 = defpackage.dn8.a
            x0 r2 = r10.k0
            xz4 r3 = r10.i0
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            c71 r6 = defpackage.c71.X
            r7 = 1
            r8 = 2
            ft5 r9 = r10.j0
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            byte r0 = r10.h0
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.w39.n0(r11)
            goto L41
        L20:
            defpackage.bt.i(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.w39.n0(r11)
            goto L37
        L29:
            defpackage.w39.n0(r11)
            long r4 = defpackage.cu0.a
            r10.h0 = r7
            java.lang.Object r11 = defpackage.u70.F(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.h0 = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.E0 = r9
        L43:
            return r1
        L44:
            byte r0 = r10.h0
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            defpackage.w39.n0(r11)
            goto L71
        L50:
            defpackage.bt.i(r5)
            r1 = r4
            goto L73
        L55:
            defpackage.w39.n0(r11)
            goto L67
        L59:
            defpackage.w39.n0(r11)
            long r4 = defpackage.cu0.a
            r10.h0 = r7
            java.lang.Object r11 = defpackage.u70.F(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.h0 = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.I0 = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0.q(java.lang.Object):java.lang.Object");
    }
}
