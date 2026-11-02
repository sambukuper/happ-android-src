package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m48 extends uy7 implements rn2 {
    public float g0;
    public byte h0;
    public final /* synthetic */ float i0;
    public final /* synthetic */ n48 j0;
    public final /* synthetic */ boolean k0;
    public final /* synthetic */ long l0;
    public final /* synthetic */ s86 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m48(float f, n48 n48Var, boolean z, long j, s86 s86Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = f;
        this.j0 = n48Var;
        this.k0 = z;
        this.l0 = j;
        this.m0 = s86Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((m48) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new m48(this.i0, this.j0, this.k0, this.l0, this.m0, q51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r9.a(r6, r8) == r5) goto L36;
     */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.h0
            n48 r1 = r8.j0
            r2 = 0
            r3 = 2
            r4 = 1
            c71 r5 = defpackage.c71.X
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L14
            defpackage.w39.n0(r9)
            goto L91
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r8)
            r8 = 0
            return r8
        L1b:
            float r0 = r8.g0
            defpackage.w39.n0(r9)
            goto L52
        L21:
            defpackage.w39.n0(r9)
            float r9 = r8.i0
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L3d
            boolean r0 = java.lang.Float.isInfinite(r9)
            if (r0 == 0) goto L33
            goto L3d
        L33:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
            double r6 = (double) r9
            double r6 = java.lang.Math.ceil(r6)
        L3c:
            float r9 = (float) r6
        L3d:
            r0 = r9
            goto L45
        L3f:
            double r6 = (double) r9
            double r6 = java.lang.Math.floor(r6)
            goto L3c
        L45:
            ay6 r9 = r1.z0
            r8.g0 = r0
            r8.h0 = r4
            java.lang.Object r9 = defpackage.oc.E(r9, r0, r8)
            if (r9 != r5) goto L52
            goto L90
        L52:
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            boolean r4 = r8.k0
            if (r4 == 0) goto L91
            long r6 = r8.l0
            boolean r4 = defpackage.f88.b(r6)
            s86 r6 = r8.m0
            if (r4 == 0) goto L84
            float r4 = r6.c
            float r7 = r6.a
            float r4 = r4 - r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L84
            float r0 = r0 - r9
            float r9 = java.lang.Math.abs(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L7b
            goto L84
        L7b:
            float r9 = r6.c
            float r9 = r9 + r0
            r0 = 11
            s86 r6 = defpackage.s86.b(r6, r2, r9, r0)
        L84:
            y78 r9 = r1.u0
            q80 r9 = r9.g
            r8.h0 = r3
            java.lang.Object r8 = r9.a(r6, r8)
            if (r8 != r5) goto L91
        L90:
            return r5
        L91:
            dn8 r8 = defpackage.dn8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m48.q(java.lang.Object):java.lang.Object");
    }
}
