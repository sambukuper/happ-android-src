package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q80 {
    public final c15 a = new c15(0, new r80[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.s86 r8, defpackage.s51 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.p80
            if (r0 == 0) goto L13
            r0 = r9
            p80 r0 = (defpackage.p80) r0
            int r1 = r0.l0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l0 = r1
            goto L18
        L13:
            p80 r0 = new p80
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j0
            int r1 = r0.l0
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.i0
            int r8 = r0.h0
            java.lang.Object[] r1 = r0.g0
            s86 r3 = r0.f0
            defpackage.w39.n0(r9)
            r9 = r3
            goto L63
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            r7 = 0
            return r7
        L35:
            defpackage.w39.n0(r9)
            c15 r7 = r7.a
            java.lang.Object[] r9 = r7.X
            int r7 = r7.Z
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L43:
            if (r8 >= r7) goto L65
            r3 = r1[r8]
            r80 r3 = (defpackage.r80) r3
            o7 r4 = new o7
            r5 = 13
            r4.<init>(r9, r5)
            r0.f0 = r9
            r0.g0 = r1
            r0.h0 = r8
            r0.i0 = r7
            r0.l0 = r2
            java.lang.Object r3 = defpackage.yn0.s(r3, r4, r0)
            c71 r4 = defpackage.c71.X
            if (r3 != r4) goto L63
            return r4
        L63:
            int r8 = r8 + r2
            goto L43
        L65:
            dn8 r7 = defpackage.dn8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q80.a(s86, s51):java.lang.Object");
    }
}
