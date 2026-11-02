package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends qj6 implements rn2 {
    public final /* synthetic */ byte Z = 1;
    public Object f0;
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s92 s92Var, oi5 oi5Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = s92Var;
        this.i0 = oi5Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Z;
        dn8 dn8Var = dn8.a;
        v27 v27Var = (v27) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((d) n(q51Var, v27Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                d dVar = new d((s92) this.h0, (oi5) obj2, q51Var);
                dVar.f0 = obj;
                return dVar;
            default:
                d dVar2 = new d((dn2) obj2, q51Var);
                dVar2.h0 = obj;
                return dVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.Z
            dn8 r1 = defpackage.dn8.a
            java.lang.Object r2 = r13.i0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            c71 r4 = defpackage.c71.X
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r13.g0
            if (r0 == 0) goto L24
            if (r0 != r5) goto L1f
            java.lang.Object r0 = r13.f0
            java.lang.Object r3 = r13.h0
            v27 r3 = (defpackage.v27) r3
            defpackage.w39.n0(r14)
            goto L41
        L1f:
            defpackage.bt.i(r3)
            r1 = r6
            goto L43
        L24:
            defpackage.w39.n0(r14)
            java.lang.Object r14 = r13.h0
            v27 r14 = (defpackage.v27) r14
            r3 = r14
        L2c:
            r14 = r2
            dn2 r14 = (defpackage.dn2) r14
            java.lang.Object r14 = r14.invoke()
            if (r14 == 0) goto L40
            r13.h0 = r3
            r13.f0 = r14
            r13.g0 = r5
            r3.b(r13, r14)
            r1 = r4
            goto L43
        L40:
            r0 = r6
        L41:
            if (r0 != 0) goto L2c
        L43:
            return r1
        L44:
            boolean r0 = r13.g0
            if (r0 == 0) goto L53
            if (r0 != r5) goto L4e
            defpackage.w39.n0(r14)
            goto L74
        L4e:
            defpackage.bt.i(r3)
            r1 = r6
            goto L74
        L53:
            defpackage.w39.n0(r14)
            java.lang.Object r14 = r13.f0
            r6 = r14
            v27 r6 = (defpackage.v27) r6
            java.lang.Object r14 = r13.h0
            r7 = r14
            s92 r7 = (defpackage.s92) r7
            kt r8 = new kt
            r8.<init>()
            r9 = r2
            oi5 r9 = (defpackage.oi5) r9
            r13.g0 = r5
            r10 = 0
            r11 = 1
            r12 = r13
            java.lang.Object r13 = defpackage.jm4.u(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r4) goto L74
            r1 = r4
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dn2 dn2Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = dn2Var;
    }
}
