package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l15 extends uy7 implements rn2 {
    public o15 g0;
    public Object h0;
    public Object i0;
    public m15 j0;
    public byte k0;
    public /* synthetic */ Object l0;
    public final /* synthetic */ f15 m0;
    public final /* synthetic */ m15 n0;
    public final /* synthetic */ rn2 o0;
    public final /* synthetic */ Object p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l15(f15 f15Var, m15 m15Var, rn2 rn2Var, Object obj, q51 q51Var) {
        super(2, q51Var);
        this.m0 = f15Var;
        this.n0 = m15Var;
        this.o0 = rn2Var;
        this.p0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((l15) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        l15 l15Var = new l15(this.m0, this.n0, this.o0, this.p0, q51Var);
        l15Var.l0 = obj;
        return l15Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.k0
            r1 = 2
            r2 = 1
            r3 = 0
            c71 r4 = defpackage.c71.X
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.h0
            m15 r0 = (defpackage.m15) r0
            o15 r1 = r8.g0
            java.lang.Object r8 = r8.l0
            j15 r8 = (defpackage.j15) r8
            defpackage.w39.n0(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r8)
            return r3
        L25:
            m15 r0 = r8.j0
            java.lang.Object r2 = r8.i0
            java.lang.Object r5 = r8.h0
            rn2 r5 = (defpackage.rn2) r5
            o15 r6 = r8.g0
            java.lang.Object r7 = r8.l0
            j15 r7 = (defpackage.j15) r7
            defpackage.w39.n0(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.w39.n0(r9)
            java.lang.Object r9 = r8.l0
            b71 r9 = (defpackage.b71) r9
            j15 r0 = new j15
            s61 r9 = r9.getCoroutineContext()
            oy1 r5 = defpackage.oy1.E0
            q61 r9 = r9.H0(r5)
            r9.getClass()
            bm3 r9 = (defpackage.bm3) r9
            f15 r5 = r8.m0
            r0.<init>(r5, r9)
            m15 r9 = r8.n0
            r9.a(r0)
            q15 r5 = r9.b
            r8.l0 = r0
            r8.g0 = r5
            rn2 r6 = r8.o0
            r8.h0 = r6
            java.lang.Object r7 = r8.p0
            r8.i0 = r7
            r8.j0 = r9
            r8.k0 = r2
            java.lang.Object r2 = r5.g(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.l0 = r0     // Catch: java.lang.Throwable -> La5
            r8.g0 = r5     // Catch: java.lang.Throwable -> La5
            r8.h0 = r9     // Catch: java.lang.Throwable -> La5
            r8.i0 = r3     // Catch: java.lang.Throwable -> La5
            r8.j0 = r3     // Catch: java.lang.Throwable -> La5
            r8.k0 = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.K(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.m(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.m(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l15.q(java.lang.Object):java.lang.Object");
    }
}
