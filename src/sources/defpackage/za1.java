package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class za1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public final /* synthetic */ ib1 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za1(ib1 ib1Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = ib1Var;
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
        return ((za1) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ib1 ib1Var = this.i0;
        switch (b) {
            case 0:
                return new za1(ib1Var, q51Var, (byte) 0);
            default:
                return new za1(ib1Var, q51Var, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r10.a(r0, r9) == r4) goto L42;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            byte r0 = r9.g0
            r1 = -1
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            c71 r4 = defpackage.c71.X
            ib1 r5 = r9.i0
            r6 = 1
            r7 = 2
            switch(r0) {
                case 0: goto L55;
                default: goto Lf;
            }
        Lf:
            jb1 r0 = r5.j0
            byte r8 = r9.h0
            if (r8 == 0) goto L27
            if (r8 == r6) goto L21
            if (r8 != r7) goto L1d
            defpackage.w39.n0(r10)
            goto L4b
        L1d:
            defpackage.bt.i(r3)
            goto L54
        L21:
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L25
            goto L40
        L25:
            r9 = move-exception
            goto L4f
        L27:
            defpackage.w39.n0(r10)
            hh7 r10 = r0.b()
            boolean r10 = r10 instanceof defpackage.ma2
            if (r10 == 0) goto L37
            hh7 r2 = r0.b()
            goto L54
        L37:
            r9.h0 = r6     // Catch: java.lang.Throwable -> L25
            java.lang.Object r10 = r5.e(r9)     // Catch: java.lang.Throwable -> L25
            if (r10 != r4) goto L40
            goto L49
        L40:
            r9.h0 = r7
            r10 = 0
            java.lang.Object r10 = r5.f(r10, r9)
            if (r10 != r4) goto L4b
        L49:
            r2 = r4
            goto L54
        L4b:
            r2 = r10
            hh7 r2 = (defpackage.hh7) r2
            goto L54
        L4f:
            u66 r2 = new u66
            r2.<init>(r9, r1)
        L54:
            return r2
        L55:
            byte r0 = r9.h0
            dn8 r8 = defpackage.dn8.a
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L68
            if (r0 != r7) goto L64
            defpackage.w39.n0(r10)
        L62:
            r2 = r8
            goto L9b
        L64:
            defpackage.bt.i(r3)
            goto L9b
        L68:
            defpackage.w39.n0(r10)
            goto L82
        L6c:
            defpackage.w39.n0(r10)
            z47 r10 = r5.k0
            r9.h0 = r6
            java.lang.Object r10 = r10.Z
            ux0 r10 = (defpackage.ux0) r10
            java.lang.Object r10 = r10.h(r9)
            if (r10 != r4) goto L7e
            goto L7f
        L7e:
            r10 = r8
        L7f:
            if (r10 != r4) goto L82
            goto L9a
        L82:
            ja7 r10 = r5.b()
            j31 r10 = r10.c
            xe2 r10 = defpackage.zc1.o(r10, r1)
            mh r0 = new mh
            r1 = 3
            r0.<init>(r5, r1)
            r9.h0 = r7
            java.lang.Object r9 = r10.a(r0, r9)
            if (r9 != r4) goto L62
        L9a:
            r2 = r4
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za1.q(java.lang.Object):java.lang.Object");
    }
}
