package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eh7 extends uy7 implements sn2 {
    public byte g0;
    public /* synthetic */ ze2 h0;
    public /* synthetic */ int i0;
    public final /* synthetic */ fh7 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh7(fh7 fh7Var, q51 q51Var) {
        super(3, q51Var);
        this.j0 = fh7Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r2.l(defpackage.g87.X, r14) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r2.l(defpackage.g87.Z, r14) == r13) goto L34;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r15) {
        /*
            r14 = this;
            fh7 r0 = r14.j0
            long r0 = r0.X
            ze2 r2 = r14.h0
            int r3 = r14.i0
            byte r4 = r14.g0
            r5 = 0
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            c71 r13 = defpackage.c71.X
            if (r4 == 0) goto L37
            if (r4 == r12) goto L33
            if (r4 == r11) goto L2f
            if (r4 == r10) goto L2b
            if (r4 == r9) goto L27
            if (r4 != r8) goto L21
            goto L33
        L21:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r14)
            return r7
        L27:
            defpackage.w39.n0(r15)
            goto L78
        L2b:
            defpackage.w39.n0(r15)
            goto L6b
        L2f:
            defpackage.w39.n0(r15)
            goto L58
        L33:
            defpackage.w39.n0(r15)
            goto L87
        L37:
            defpackage.w39.n0(r15)
            if (r3 <= 0) goto L4b
            r14.h0 = r7
            r14.i0 = r3
            r14.g0 = r12
            g87 r15 = defpackage.g87.X
            java.lang.Object r14 = r2.l(r15, r14)
            if (r14 != r13) goto L87
            goto L86
        L4b:
            r14.h0 = r2
            r14.i0 = r3
            r14.g0 = r11
            java.lang.Object r15 = defpackage.u70.F(r5, r14)
            if (r15 != r13) goto L58
            goto L86
        L58:
            int r15 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r15 <= 0) goto L78
            r14.h0 = r2
            r14.i0 = r3
            r14.g0 = r10
            g87 r15 = defpackage.g87.Y
            java.lang.Object r15 = r2.l(r15, r14)
            if (r15 != r13) goto L6b
            goto L86
        L6b:
            r14.h0 = r2
            r14.i0 = r3
            r14.g0 = r9
            java.lang.Object r15 = defpackage.u70.F(r0, r14)
            if (r15 != r13) goto L78
            goto L86
        L78:
            r14.h0 = r7
            r14.i0 = r3
            r14.g0 = r8
            g87 r15 = defpackage.g87.Z
            java.lang.Object r14 = r2.l(r15, r14)
            if (r14 != r13) goto L87
        L86:
            return r13
        L87:
            dn8 r14 = defpackage.dn8.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh7.q(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        eh7 eh7Var = new eh7(this.j0, (q51) obj3);
        eh7Var.h0 = (ze2) obj;
        eh7Var.i0 = iIntValue;
        return eh7Var.q(dn8.a);
    }
}
