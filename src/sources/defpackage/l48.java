package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l48 extends uy7 implements gn2 {
    public byte g0;
    public final /* synthetic */ n48 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l48(n48 n48Var, q51 q51Var) {
        super(1, q51Var);
        this.h0 = n48Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((l48) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new l48(this.h0, q51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r13 == r6) goto L26;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.g0
            r1 = 0
            dn8 r2 = defpackage.dn8.a
            r3 = 2
            r4 = 1
            n48 r5 = r13.h0
            c71 r6 = defpackage.c71.X
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L15
            defpackage.w39.n0(r14)
            goto L70
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r13)
            return r1
        L1b:
            defpackage.w39.n0(r14)
            goto L2c
        L1f:
            defpackage.w39.n0(r14)
            r68 r14 = r5.w0
            r13.g0 = r4
            r14.A()
            if (r2 != r6) goto L2c
            goto L6f
        L2c:
            ip5 r14 = r5.C0
            if (r14 == 0) goto L70
            r68 r0 = r5.w0
            kd8 r0 = r0.a
            h48 r0 = r0.d()
            java.lang.CharSequence r12 = r0.Z
            r68 r0 = r5.w0
            kd8 r0 = r0.a
            h48 r0 = r0.d()
            long r8 = r0.f0
            r13.g0 = r3
            r11 = r14
            op5 r11 = (defpackage.op5) r11
            int r14 = r12.length()
            if (r14 != 0) goto L50
            goto L56
        L50:
            boolean r14 = defpackage.f88.b(r8)
            if (r14 == 0) goto L58
        L56:
            r13 = r2
            goto L69
        L58:
            lp5 r7 = new lp5
            r10 = 0
            r7.<init>(r8, r10, r11, r12)
            s61 r14 = r11.a
            mp5 r0 = new mp5
            r0.<init>(r11, r7, r1)
            java.lang.Object r13 = defpackage.w51.W(r14, r0, r13)
        L69:
            if (r13 != r6) goto L6c
            goto L6d
        L6c:
            r13 = r2
        L6d:
            if (r13 != r6) goto L70
        L6f:
            return r6
        L70:
            r68 r13 = r5.w0
            rh5 r13 = r13.t
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.setValue(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l48.q(java.lang.Object):java.lang.Object");
    }
}
