package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t40 extends qj6 implements rn2 {
    public bq5 Z;
    public boolean f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ b71 h0;
    public final /* synthetic */ jc8 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(b71 b71Var, jc8 jc8Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = b71Var;
        this.i0 = jc8Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        ((t40) n((q51) obj2, (bz7) obj)).q(dn8.a);
        return c71.X;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        t40 t40Var = new t40(this.h0, this.i0, q51Var);
        t40Var.g0 = obj;
        return t40Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.f0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            bq5 r0 = r7.Z
            java.lang.Object r3 = r7.g0
            bz7 r3 = (defpackage.bz7) r3
            defpackage.w39.n0(r8)
            goto L31
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            return r1
        L18:
            defpackage.w39.n0(r8)
            java.lang.Object r8 = r7.g0
            bz7 r8 = (defpackage.bz7) r8
            bq5 r0 = defpackage.bq5.Y
            r3 = r8
        L22:
            r7.g0 = r3
            r7.Z = r0
            r7.f0 = r2
            java.lang.Object r8 = r3.a(r0, r7)
            c71 r4 = defpackage.c71.X
            if (r8 != r4) goto L31
            return r4
        L31:
            aq5 r8 = (defpackage.aq5) r8
            java.util.List r4 = r8.a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            hq5 r4 = (defpackage.hq5) r4
            int r4 = r4.i
            r5 = 2
            if (r4 != r5) goto L22
            int r8 = r8.f
            r4 = 4
            jc8 r6 = r7.i0
            if (r8 != r4) goto L54
            o40 r8 = new o40
            r8.<init>(r6, r1, r5)
            r4 = 3
            b71 r5 = r7.h0
            defpackage.w51.G(r5, r1, r1, r8, r4)
            goto L22
        L54:
            r4 = 5
            if (r8 != r4) goto L22
            r6.a()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t40.q(java.lang.Object):java.lang.Object");
    }
}
