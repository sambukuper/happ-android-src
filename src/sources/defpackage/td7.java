package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class td7 extends uy7 implements rn2 {
    public y45 g0;
    public jp0 h0;
    public Object i0;
    public byte j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ dn2 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td7(dn2 dn2Var, q51 q51Var) {
        super(2, q51Var);
        this.l0 = dn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        ((td7) n((q51) obj2, (ze2) obj)).q(dn8.a);
        return c71.X;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        td7 td7Var = new td7(this.l0, q51Var);
        td7Var.k0 = obj;
        return td7Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[Catch: all -> 0x0020, PHI: r0 r4 r7 r8
  0x0077: PHI (r0v4 java.lang.Object) = (r0v3 java.lang.Object), (r0v8 java.lang.Object) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r4v7 ??) = (r4v10 ??), (r4v11 ??) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r7v4 ??) = (r7v7 ??), (r7v8 ??) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r8v3 ze2) = (r8v2 ze2), (r8v7 ze2) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0020, blocks: (B:15:0x0033, B:25:0x0077, B:22:0x0066, B:27:0x0081, B:8:0x001c), top: B:42:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:15:0x0033, B:25:0x0077, B:22:0x0066, B:27:0x0081, B:8:0x001c), top: B:42:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [cw0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [jp0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [jp0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [jp0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [y45] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, y45] */
    /* JADX WARN: Type inference failed for: r7v3, types: [y45] */
    /* JADX WARN: Type inference failed for: r7v4, types: [y45] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007f -> B:22:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0092 -> B:22:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            byte r0 = r10.j0
            dn2 r1 = r10.l0
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            c71 r6 = defpackage.c71.X
            if (r0 == 0) goto L37
            if (r0 == r4) goto L12
            if (r0 == r3) goto L29
            if (r0 != r2) goto L23
        L12:
            java.lang.Object r0 = r10.i0
            jp0 r4 = r10.h0
            y45 r7 = r10.g0
            java.lang.Object r8 = r10.k0
            ze2 r8 = (defpackage.ze2) r8
            defpackage.w39.n0(r11)     // Catch: java.lang.Throwable -> L20
            goto L66
        L20:
            r10 = move-exception
            goto L96
        L23:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r10)
            return r5
        L29:
            java.lang.Object r0 = r10.i0
            jp0 r4 = r10.h0
            y45 r7 = r10.g0
            java.lang.Object r8 = r10.k0
            ze2 r8 = (defpackage.ze2) r8
            defpackage.w39.n0(r11)     // Catch: java.lang.Throwable -> L20
            goto L77
        L37:
            defpackage.w39.n0(r11)
            java.lang.Object r11 = r10.k0
            r8 = r11
            ze2 r8 = (defpackage.ze2) r8
            y45 r7 = new y45
            r7.<init>()
            na7 r11 = new na7
            r11.<init>()
            r7.X = r11
            r11 = 6
            x90 r11 = defpackage.gv3.b(r4, r5, r5, r11)
            java.lang.Object r0 = r7.M(r11, r1)     // Catch: java.lang.Throwable -> L94
            r10.k0 = r8     // Catch: java.lang.Throwable -> L94
            r10.g0 = r7     // Catch: java.lang.Throwable -> L94
            r10.h0 = r11     // Catch: java.lang.Throwable -> L94
            r10.i0 = r0     // Catch: java.lang.Throwable -> L94
            r10.j0 = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r4 = r8.l(r0, r10)     // Catch: java.lang.Throwable -> L94
            if (r4 != r6) goto L65
            goto L91
        L65:
            r4 = r11
        L66:
            r10.k0 = r8     // Catch: java.lang.Throwable -> L20
            r10.g0 = r7     // Catch: java.lang.Throwable -> L20
            r10.h0 = r4     // Catch: java.lang.Throwable -> L20
            r10.i0 = r0     // Catch: java.lang.Throwable -> L20
            r10.j0 = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r11 = r4.r(r10)     // Catch: java.lang.Throwable -> L20
            if (r11 != r6) goto L77
            goto L91
        L77:
            java.lang.Object r11 = r7.M(r4, r1)     // Catch: java.lang.Throwable -> L20
            boolean r9 = defpackage.dh3.f(r11, r0)     // Catch: java.lang.Throwable -> L20
            if (r9 != 0) goto L66
            r10.k0 = r8     // Catch: java.lang.Throwable -> L20
            r10.g0 = r7     // Catch: java.lang.Throwable -> L20
            r10.h0 = r4     // Catch: java.lang.Throwable -> L20
            r10.i0 = r11     // Catch: java.lang.Throwable -> L20
            r10.j0 = r2     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r8.l(r11, r10)     // Catch: java.lang.Throwable -> L20
            if (r0 != r6) goto L92
        L91:
            return r6
        L92:
            r0 = r11
            goto L66
        L94:
            r10 = move-exception
            r4 = r11
        L96:
            java.lang.Object r11 = r7.X
            cw0 r11 = (defpackage.cw0) r11
            if (r11 == 0) goto L9f
            r11.C0(r4)
        L9f:
            java.lang.Object r11 = r7.X
            cw0 r11 = (defpackage.cw0) r11
            if (r11 == 0) goto La6
            goto Lab
        La6:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.wr5.b(r0)
        Lab:
            r11.r0()
            r7.X = r5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td7.q(java.lang.Object):java.lang.Object");
    }
}
