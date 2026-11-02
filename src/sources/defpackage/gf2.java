package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 1;
    public byte h0;
    public final /* synthetic */ long i0;
    public /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf2(long j, bz7 bz7Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = j;
        this.j0 = bz7Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((gf2) n((q51) obj2, (kv5) obj)).q(dn8Var);
                return c71.X;
            default:
                return ((gf2) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        long j = this.i0;
        switch (b) {
            case 0:
                gf2 gf2Var = new gf2(j, q51Var);
                gf2Var.j0 = obj;
                return gf2Var;
            default:
                return new gf2(j, (bz7) this.j0, q51Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0097 -> B:33:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.g0
            dn8 r1 = defpackage.dn8.a
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            c71 r4 = defpackage.c71.X
            r5 = 1
            r6 = 2
            long r7 = r11.i0
            switch(r0) {
                case 0: goto L55;
                default: goto L10;
            }
        L10:
            byte r0 = r11.h0
            r9 = 8
            if (r0 == 0) goto L27
            if (r0 == r5) goto L23
            if (r0 != r6) goto L1e
            defpackage.w39.n0(r12)
            goto L3f
        L1e:
            defpackage.bt.i(r3)
            r1 = r2
            goto L54
        L23:
            defpackage.w39.n0(r12)
            goto L35
        L27:
            defpackage.w39.n0(r12)
            long r2 = r7 - r9
            r11.h0 = r5
            java.lang.Object r12 = defpackage.u70.F(r2, r11)
            if (r12 != r4) goto L35
            goto L3d
        L35:
            r11.h0 = r6
            java.lang.Object r12 = defpackage.u70.F(r9, r11)
            if (r12 != r4) goto L3f
        L3d:
            r1 = r4
            goto L54
        L3f:
            java.lang.Object r11 = r11.j0
            bz7 r11 = (defpackage.bz7) r11
            mm0 r11 = r11.Z
            if (r11 == 0) goto L54
            cq5 r12 = new cq5
            r12.<init>(r7)
            rj6 r0 = new rj6
            r0.<init>(r12)
            r11.f(r0)
        L54:
            return r1
        L55:
            java.lang.Object r0 = r11.j0
            kv5 r0 = (defpackage.kv5) r0
            byte r9 = r11.h0
            r10 = 3
            if (r9 == 0) goto L71
            if (r9 == r5) goto L6d
            if (r9 == r6) goto L69
            if (r9 != r10) goto L65
            goto L6d
        L65:
            defpackage.bt.i(r3)
            goto L9a
        L69:
            defpackage.w39.n0(r12)
            goto L8f
        L6d:
            defpackage.w39.n0(r12)
            goto L7f
        L71:
            defpackage.w39.n0(r12)
            r11.j0 = r0
            r11.h0 = r5
            java.lang.Object r12 = defpackage.u70.F(r7, r11)
            if (r12 != r4) goto L7f
            goto L99
        L7f:
            r0.getClass()
            r11.j0 = r0
            r11.h0 = r6
            x90 r12 = r0.g0
            java.lang.Object r12 = r12.a(r11, r1)
            if (r12 != r4) goto L8f
            goto L99
        L8f:
            r11.j0 = r0
            r11.h0 = r10
            java.lang.Object r12 = defpackage.u70.F(r7, r11)
            if (r12 != r4) goto L7f
        L99:
            r2 = r4
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf2(long j, q51 q51Var) {
        super(2, q51Var);
        this.i0 = j;
    }
}
