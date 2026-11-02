package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p40 extends qj6 implements rn2 {
    public final /* synthetic */ byte Z;
    public boolean f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p40(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.Z = b;
        this.h0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Z;
        dn8 dn8Var = dn8.a;
        bz7 bz7Var = (bz7) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return ((p40) n(q51Var, bz7Var)).q(dn8Var);
            default:
                ((p40) n(q51Var, bz7Var)).q(dn8Var);
                return c71.X;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                p40 p40Var = new p40((bq5) obj2, q51Var, (byte) 0);
                p40Var.g0 = obj;
                return p40Var;
            default:
                p40 p40Var2 = new p40((r68) obj2, q51Var, (byte) 1);
                p40Var2.g0 = obj;
                return p40Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.Z
            java.lang.Object r1 = r6.h0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            c71 r4 = defpackage.c71.X
            r5 = 1
            switch(r0) {
                case 0: goto L43;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r6.f0
            if (r0 == 0) goto L1f
            if (r0 != r5) goto L1b
            java.lang.Object r0 = r6.g0
            bz7 r0 = (defpackage.bz7) r0
            defpackage.w39.n0(r7)
            goto L35
        L1b:
            defpackage.bt.i(r3)
            goto L34
        L1f:
            defpackage.w39.n0(r7)
            java.lang.Object r7 = r6.g0
            bz7 r7 = (defpackage.bz7) r7
            r0 = r7
        L27:
            r6.g0 = r0
            r6.f0 = r5
            bq5 r7 = defpackage.bq5.X
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r4) goto L35
            r2 = r4
        L34:
            return r2
        L35:
            aq5 r7 = (defpackage.aq5) r7
            r2 = r1
            r68 r2 = (defpackage.r68) r2
            boolean r7 = defpackage.k07.a(r7)
            r7 = r7 ^ r5
            r2.w(r7)
            goto L27
        L43:
            boolean r0 = r6.f0
            if (r0 == 0) goto L52
            if (r0 != r5) goto L4d
            defpackage.w39.n0(r7)
            goto L64
        L4d:
            defpackage.bt.i(r3)
            r7 = r2
            goto L64
        L52:
            defpackage.w39.n0(r7)
            java.lang.Object r7 = r6.g0
            bz7 r7 = (defpackage.bz7) r7
            bq5 r1 = (defpackage.bq5) r1
            r6.f0 = r5
            java.lang.Object r7 = defpackage.q18.i(r7, r1, r6)
            if (r7 != r4) goto L64
            r7 = r4
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p40.q(java.lang.Object):java.lang.Object");
    }
}
