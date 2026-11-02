package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s68 extends uy7 implements rn2 {
    public byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ dt5 i0;
    public final /* synthetic */ r68 j0;
    public final /* synthetic */ long k0;
    public final /* synthetic */ xz4 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s68(dt5 dt5Var, r68 r68Var, long j, xz4 xz4Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = dt5Var;
        this.j0 = r68Var;
        this.k0 = j;
        this.l0 = xz4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((s68) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        s68 s68Var = new s68(this.i0, this.j0, this.k0, this.l0, q51Var);
        s68Var.h0 = obj;
        return s68Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r13.l0.a(r14, r13) == r5) goto L20;
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
            r68 r2 = r13.j0
            r3 = 2
            r4 = 1
            c71 r5 = defpackage.c71.X
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.w39.n0(r14)
            goto L62
        L13:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r13)
            return r1
        L19:
            defpackage.w39.n0(r14)
            goto L40
        L1d:
            defpackage.w39.n0(r14)
            java.lang.Object r14 = r13.h0
            b71 r14 = (defpackage.b71) r14
            s0 r6 = new s0
            r11 = 0
            r12 = 3
            r68 r7 = r13.j0
            long r8 = r13.k0
            xz4 r10 = r13.l0
            r6.<init>(r7, r8, r10, r11, r12)
            r0 = 3
            defpackage.w51.G(r14, r1, r1, r6, r0)
            r13.g0 = r4
            dt5 r14 = r13.i0
            java.lang.Object r14 = r14.d(r13)
            if (r14 != r5) goto L40
            goto L61
        L40:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            ft5 r0 = r2.w
            if (r0 == 0) goto L62
            if (r14 == 0) goto L52
            gt5 r14 = new gt5
            r14.<init>(r0)
            goto L57
        L52:
            et5 r14 = new et5
            r14.<init>(r0)
        L57:
            r13.g0 = r3
            xz4 r0 = r13.l0
            java.lang.Object r13 = r0.a(r14, r13)
            if (r13 != r5) goto L62
        L61:
            return r5
        L62:
            r2.w = r1
            dn8 r13 = defpackage.dn8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s68.q(java.lang.Object):java.lang.Object");
    }
}
