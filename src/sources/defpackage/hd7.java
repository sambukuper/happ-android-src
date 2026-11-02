package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hd7 extends qj6 implements rn2 {
    public long[] Z;
    public int f0;
    public int g0;
    public byte h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ id7 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd7(id7 id7Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = id7Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((hd7) n((q51) obj2, (v27) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        hd7 hd7Var = new hd7(this.j0, q51Var);
        hd7Var.i0 = obj;
        return hd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0095
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            id7 r1 = r0.j0
            long r2 = r1.X
            long r4 = r1.Z
            long r6 = r1.Y
            byte r8 = r0.h0
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            c71 r11 = defpackage.c71.X
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.f0
            java.lang.Object r6 = r0.i0
            v27 r6 = (defpackage.v27) r6
            defpackage.w39.n0(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r0)
            return r9
        L32:
            int r1 = r0.f0
            java.lang.Object r8 = r0.i0
            v27 r8 = (defpackage.v27) r8
            defpackage.w39.n0(r23)
            goto L93
        L3c:
            int r1 = r0.g0
            int r8 = r0.f0
            long[] r15 = r0.Z
            java.lang.Object r13 = r0.i0
            v27 r13 = (defpackage.v27) r13
            defpackage.w39.n0(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            defpackage.w39.n0(r23)
            java.lang.Object r8 = r0.i0
            r13 = r8
            v27 r13 = (defpackage.v27) r13
            long[] r15 = r1.f0
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.i0 = r13
            r0.Z = r15
            r0.f0 = r8
            r0.g0 = r1
            r0.h0 = r10
            r13.b(r0, r4)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.i0 = r8
            r0.Z = r9
            r0.f0 = r1
            r0.h0 = r14
            r8.b(r0, r2)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.i0 = r6
            r0.Z = r9
            r0.f0 = r15
            r7 = 3
            r0.h0 = r7
            r6.b(r0, r1)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            dn8 r0 = defpackage.dn8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd7.q(java.lang.Object):java.lang.Object");
    }
}
