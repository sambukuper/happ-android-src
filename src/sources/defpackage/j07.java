package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j07 extends qj6 implements rn2 {
    public final /* synthetic */ byte Z = 0;
    public long f0;
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j07(long j, da6 da6Var, q51 q51Var) {
        super(2, q51Var);
        this.f0 = j;
        this.i0 = da6Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Z;
        dn8 dn8Var = dn8.a;
        bz7 bz7Var = (bz7) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((j07) n(q51Var, bz7Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                j07 j07Var = new j07(this.f0, (da6) obj2, q51Var);
                j07Var.h0 = obj;
                return j07Var;
            default:
                j07 j07Var2 = new j07((hq5) obj2, q51Var);
                j07Var2.h0 = obj;
                return j07Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.Z
            java.lang.Object r1 = r9.i0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            c71 r4 = defpackage.c71.X
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.g0
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.f0
            java.lang.Object r2 = r9.h0
            bz7 r2 = (defpackage.bz7) r2
            defpackage.w39.n0(r10)
            goto L47
        L1d:
            defpackage.bt.i(r3)
            goto L50
        L21:
            defpackage.w39.n0(r10)
            java.lang.Object r10 = r9.h0
            bz7 r10 = (defpackage.bz7) r10
            hq5 r1 = (defpackage.hq5) r1
            long r0 = r1.b
            fw8 r2 = r10.c()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.h0 = r2
            r9.f0 = r0
            r9.g0 = r5
            r10 = 3
            java.lang.Object r10 = defpackage.q18.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            hq5 r10 = (defpackage.hq5) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            da6 r1 = (defpackage.da6) r1
            boolean r0 = r9.g0
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.h0
            bz7 r9 = (defpackage.bz7) r9
            defpackage.w39.n0(r10)
            goto L84
        L61:
            defpackage.bt.i(r3)
            goto Lb6
        L65:
            defpackage.w39.n0(r10)
            java.lang.Object r10 = r9.h0
            bz7 r10 = (defpackage.bz7) r10
            long r2 = r9.f0
            b1 r0 = new b1
            r6 = 19
            r0.<init>(r1, r6)
            r9.h0 = r10
            r9.g0 = r5
            java.lang.Object r9 = defpackage.qu1.c(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            hq5 r10 = (defpackage.hq5) r10
            if (r10 == 0) goto L9c
            long r0 = r1.X
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            ws1 r2 = defpackage.ws1.Y
            goto Lb6
        L9c:
            cz7 r9 = r9.g0
            aq5 r9 = r9.u0
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.wv0.r0(r9)
            hq5 r9 = (defpackage.hq5) r9
            boolean r10 = defpackage.vr3.m(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            ws1 r2 = defpackage.ws1.X
            goto Lb6
        Lb4:
            ws1 r2 = defpackage.ws1.f0
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j07.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j07(hq5 hq5Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = hq5Var;
    }
}
