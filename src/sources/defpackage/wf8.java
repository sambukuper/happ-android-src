package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wf8 extends uy7 implements rn2 {
    public s85[] g0;
    public xf8 h0;
    public ed8 i0;
    public int j0;
    public int k0;
    public int l0;
    public byte m0;
    public final /* synthetic */ s85[] n0;
    public final /* synthetic */ xf8 o0;
    public final /* synthetic */ ed8 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf8(s85[] s85VarArr, xf8 xf8Var, ed8 ed8Var, q51 q51Var) {
        super(2, q51Var);
        this.n0 = s85VarArr;
        this.o0 = xf8Var;
        this.p0 = ed8Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((wf8) n((q51) obj2, (vq5) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new wf8(this.n0, this.o0, this.p0, q51Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
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
            byte r0 = r11.m0
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.l0
            int r4 = r11.k0
            int r5 = r11.j0
            ed8 r6 = r11.i0
            xf8 r7 = r11.h0
            s85[] r8 = r11.g0
            defpackage.w39.n0(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r11)
            return r1
        L21:
            defpackage.w39.n0(r12)
            s85[] r12 = r11.n0
            int r0 = r12.length
            r4 = 0
            xf8 r5 = r11.o0
            ed8 r6 = r11.p0
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            c71 r10 = defpackage.c71.X
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.g0 = r8
            r11.h0 = r7
            r11.i0 = r6
            r11.j0 = r9
            r11.k0 = r4
            r11.l0 = r0
            r11.m0 = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.b61.c()
            return r1
        L5d:
            r11.g0 = r8
            r11.h0 = r7
            r11.i0 = r6
            r11.j0 = r9
            r11.k0 = r4
            r11.l0 = r0
            r11.m0 = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            dn8 r11 = defpackage.dn8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf8.q(java.lang.Object):java.lang.Object");
    }
}
