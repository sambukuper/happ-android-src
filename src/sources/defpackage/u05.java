package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u05 extends qj6 implements rn2 {
    public fq2 Z;
    public v05 f0;
    public long[] g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public long l0;
    public boolean m0;
    public /* synthetic */ Object n0;
    public final /* synthetic */ v05 o0;
    public final /* synthetic */ fq2 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u05(v05 v05Var, fq2 fq2Var, q51 q51Var) {
        super(2, q51Var);
        this.o0 = v05Var;
        this.p0 = fq2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((u05) n((q51) obj2, (v27) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        u05 u05Var = new u05(this.o0, this.p0, q51Var);
        u05Var.n0 = obj;
        return u05Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.m0
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.k0
            int r5 = r0.j0
            long r6 = r0.l0
            int r8 = r0.i0
            int r9 = r0.h0
            long[] r10 = r0.g0
            v05 r11 = r0.f0
            fq2 r12 = r0.Z
            java.lang.Object r13 = r0.n0
            v27 r13 = (defpackage.v27) r13
            defpackage.w39.n0(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.w39.n0(r21)
            java.lang.Object r1 = r0.n0
            v27 r1 = (defpackage.v27) r1
            v05 r5 = r0.o0
            t05 r6 = r5.Y
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            fq2 r8 = r0.p0
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.Y = r2
            t05 r3 = r11.Y
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.n0 = r13
            r0.Z = r12
            r0.f0 = r11
            r0.g0 = r10
            r0.h0 = r9
            r0.i0 = r8
            r0.l0 = r6
            r0.j0 = r5
            r0.k0 = r1
            r0.m0 = r4
            r13.b(r0, r2)
            c71 r0 = defpackage.c71.X
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            dn8 r0 = defpackage.dn8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u05.q(java.lang.Object):java.lang.Object");
    }
}
