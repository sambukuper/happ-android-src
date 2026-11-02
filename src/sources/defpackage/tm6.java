package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tm6 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ tm6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170  */
    /* JADX WARN: Code duplicated, block: B:82:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x0180  */
    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0188  */
    /* JADX WARN: Code duplicated, block: B:88:0x018a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x019e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v40 java.lang.Object, still in use, count: 2, list:
          (r1v40 java.lang.Object) from 0x014b: PHI (r1 I:??) = (r1v26 java.lang.Object), (r1v40 java.lang.Object) binds: [B:65:0x014a, B:147:0x014b] A[DONT_GENERATE, DONT_INLINE]
          (r1v40 java.lang.Object) from 0x013f: CHECK_CAST (at1) (r1v40 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object B(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            byte r1 = r0.X
            r2 = 5
            r3 = 4
            java.lang.Object r5 = r0.Y
            java.lang.Object r7 = r0.g0
            java.lang.Object r8 = r0.f0
            java.lang.Object r0 = r0.Z
            r9 = 2
            r10 = 0
            r11 = 3
            switch(r1) {
                case 0: goto L1b1;
                case 1: goto L116;
                default: goto L14;
            }
        L14:
            b71 r0 = (b71) r0
            r1 = r19
            cx3 r1 = (cx3) r1
            android.view.KeyEvent r1 = r1.a
            gn2 r8 = (gn2) r8
            vo6 r7 = (defpackage.vo6) r7
            su.happ.proxyutility.domain.routing.entity.RouteProfile r2 = r7.a
            la r5 = (la) r5
            r1.getClass()
            int r3 = r1.getKeyCode()
            long r12 = pu.d(r3)
            long r14 = ax3.g
            boolean r3 = ax3.a(r12, r14)
            bv1 r7 = defpackage.bv1.X
            if (r3 == 0) goto L53
            int r3 = w39.S(r1)
            if (r3 != r9) goto L53
            rh5 r3 = r5.d
            java.lang.Object r3 = r3.getValue()
            if (r3 != r7) goto L53
            gf4 r1 = new gf4
            r2 = 7
            r1.<init>(r5, r10, r2)
            jm4.Q(r0, r10, r1, r11)
        L50:
            r4 = 1
            goto L111
        L53:
            boolean r3 = ax3.a(r12, r14)
            bv1 r4 = defpackage.bv1.Y
            if (r3 == 0) goto L7a
            int r3 = w39.S(r1)
            if (r3 != r9) goto L7a
            rh5 r3 = r5.d
            java.lang.Object r3 = r3.getValue()
            if (r3 != r4) goto L7a
            ko6 r0 = new ko6
            java.lang.String r1 = r2.d()
            java.lang.String r2 = r2.c()
            r0.<init>(r1, r2)
            r8.B(r0)
            goto L50
        L7a:
            r18 = r7
            long r6 = ax3.f
            boolean r3 = ax3.a(r12, r6)
            if (r3 == 0) goto L9d
            int r3 = w39.S(r1)
            if (r3 != r9) goto L9d
            rh5 r3 = r5.d
            java.lang.Object r3 = r3.getValue()
            if (r3 != r4) goto L9d
            gf4 r1 = new gf4
            r2 = 8
            r1.<init>(r5, r10, r2)
            jm4.Q(r0, r10, r1, r11)
            goto L50
        L9d:
            boolean r3 = ax3.a(r12, r6)
            if (r3 == 0) goto Lbe
            int r3 = w39.S(r1)
            if (r3 != r9) goto Lbe
            rh5 r3 = r5.d
            java.lang.Object r3 = r3.getValue()
            r4 = r18
            if (r3 != r4) goto Lbe
            gf4 r1 = new gf4
            r2 = 9
            r1.<init>(r5, r10, r2)
            jm4.Q(r0, r10, r1, r11)
            goto L50
        Lbe:
            boolean r3 = ax3.a(r12, r6)
            bv1 r4 = defpackage.bv1.Z
            if (r3 == 0) goto Lf0
            int r3 = w39.S(r1)
            if (r3 != r9) goto Lf0
            rh5 r3 = r5.d
            java.lang.Object r3 = r3.getValue()
            if (r3 != r4) goto Lf0
            gf4 r1 = new gf4
            r3 = 10
            r1.<init>(r5, r10, r3)
            jm4.Q(r0, r10, r1, r11)
            so6 r0 = new so6
            java.lang.String r1 = r2.d()
            java.lang.String r2 = r2.c()
            r0.<init>(r1, r2)
            r8.B(r0)
            goto L50
        Lf0:
            boolean r2 = ax3.a(r12, r14)
            if (r2 == 0) goto L110
            int r1 = w39.S(r1)
            if (r1 != r9) goto L110
            rh5 r1 = r5.d
            java.lang.Object r1 = r1.getValue()
            if (r1 != r4) goto L110
            gf4 r1 = new gf4
            r2 = 11
            r1.<init>(r5, r10, r2)
            jm4.Q(r0, r10, r1, r11)
            goto L50
        L110:
            r4 = 0
        L111:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L116:
            r1 = r19
            su.happ.proxyutility.domain.routing.entity.RouteProfileId r1 = (su.happ.proxyutility.domain.routing.entity.RouteProfileId) r1
            if (r1 == 0) goto L121
            java.lang.String r1 = r1.c()
            goto L122
        L121:
            r1 = r10
        L122:
            java.lang.String r5 = (java.lang.String) r5
            if (r1 != 0) goto L128
            r1 = 0
            goto L12c
        L128:
            boolean r1 = r1.equals(r5)
        L12c:
            if (r1 == 0) goto L1aa
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L134:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14a
            java.lang.Object r1 = r0.next()
            r4 = r1
            at1 r4 = (at1) r4
            java.lang.String r4 = r4.a
            boolean r4 = dh3.f(r4, r5)
            if (r4 == 0) goto L134
            goto L14b
        L14a:
            r1 = r10
        L14b:
            at1 r1 = (at1) r1
            if (r1 == 0) goto L154
            su.happ.proxyutility.domain.routing.entity.StateDownloadFile r0 = r1.d
            if (r0 == 0) goto L154
            goto L156
        L154:
            su.happ.proxyutility.domain.routing.entity.StateDownloadFile r0 = su.happ.proxyutility.domain.routing.entity.StateDownloadFile.SUCCESS
        L156:
            int[] r1 = defpackage.bn6.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L172
            if (r0 == r9) goto L170
            if (r0 == r11) goto L170
            if (r0 == r3) goto L16e
            if (r0 != r2) goto L16a
            goto L16e
        L16a:
            b61.c()
            goto L1b0
        L16e:
            r4 = 1
            goto L1ac
        L170:
            r4 = 0
            goto L1ac
        L172:
            mn6 r8 = (mn6) r8
            java.lang.String r7 = (java.lang.String) r7
            java.util.concurrent.ConcurrentLinkedDeque r0 = r8.e
            java.lang.Object r1 = wv0.s0(r0)
            su.happ.proxyutility.domain.routing.entity.RouteProfileId r1 = (su.happ.proxyutility.domain.routing.entity.RouteProfileId) r1
            if (r1 == 0) goto L185
            java.lang.String r1 = r1.c()
            goto L186
        L185:
            r1 = r10
        L186:
            if (r1 != 0) goto L18a
            r1 = 0
            goto L18e
        L18a:
            boolean r1 = r1.equals(r5)
        L18e:
            if (r1 == 0) goto L193
            r0.clear()
        L193:
            r1 = 1
            r8.F(r7, r1)
            r4 = 0
            java.lang.String r0 = r8.p(r7, r4)
            if (r0 != 0) goto L1a0
            r0 = r4
            goto L1a4
        L1a0:
            boolean r0 = r0.equals(r5)
        L1a4:
            if (r0 != 0) goto L1ac
            r8.B(r5, r10)
            goto L1ac
        L1aa:
            r1 = 1
            r4 = r1
        L1ac:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
        L1b0:
            return r10
        L1b1:
            r1 = 1
            r4 = 0
            b71 r0 = (b71) r0
            r6 = r19
            cx3 r6 = (cx3) r6
            android.view.KeyEvent r6 = r6.a
            um6 r7 = (defpackage.um6) r7
            gn2 r8 = (gn2) r8
            la r5 = (la) r5
            r6.getClass()
            int r12 = r6.getKeyCode()
            long r12 = pu.d(r12)
            long r14 = ax3.g
            boolean r16 = ax3.a(r12, r14)
            cv1 r1 = defpackage.cv1.X
            if (r16 == 0) goto L1ef
            int r4 = w39.S(r6)
            if (r4 != r9) goto L1ef
            rh5 r4 = r5.d
            java.lang.Object r4 = r4.getValue()
            if (r4 != r1) goto L1ef
            gf4 r1 = new gf4
            r1.<init>(r5, r10, r9)
            jm4.Q(r0, r10, r1, r11)
        L1ec:
            r4 = 1
            goto L2a2
        L1ef:
            boolean r4 = ax3.a(r12, r14)
            cv1 r2 = defpackage.cv1.Y
            if (r4 == 0) goto L213
            int r4 = w39.S(r6)
            if (r4 != r9) goto L213
            rh5 r4 = r5.d
            java.lang.Object r4 = r4.getValue()
            if (r4 != r2) goto L213
            java.lang.String r0 = r7.c
            r0.getClass()
            ro7 r1 = new ro7
            r1.<init>(r0)
            r8.B(r1)
            goto L1ec
        L213:
            long r3 = ax3.f
            boolean r17 = ax3.a(r12, r3)
            if (r17 == 0) goto L233
            int r10 = w39.S(r6)
            if (r10 != r9) goto L233
            rh5 r10 = r5.d
            java.lang.Object r10 = r10.getValue()
            if (r10 != r2) goto L233
            gf4 r1 = new gf4
            r2 = 0
            r1.<init>(r5, r2, r11)
            jm4.Q(r0, r2, r1, r11)
            goto L1ec
        L233:
            boolean r2 = ax3.a(r12, r3)
            if (r2 == 0) goto L252
            int r2 = w39.S(r6)
            if (r2 != r9) goto L252
            rh5 r2 = r5.d
            java.lang.Object r2 = r2.getValue()
            if (r2 != r1) goto L252
            gf4 r1 = new gf4
            r2 = 4
            r3 = 0
            r1.<init>(r5, r3, r2)
            jm4.Q(r0, r3, r1, r11)
            goto L1ec
        L252:
            boolean r1 = ax3.a(r12, r3)
            cv1 r2 = defpackage.cv1.Z
            if (r1 == 0) goto L281
            int r1 = w39.S(r6)
            if (r1 != r9) goto L281
            rh5 r1 = r5.d
            java.lang.Object r1 = r1.getValue()
            if (r1 != r2) goto L281
            gf4 r1 = new gf4
            r2 = 5
            r3 = 0
            r1.<init>(r5, r3, r2)
            jm4.Q(r0, r3, r1, r11)
            java.lang.String r0 = r7.c
            r0.getClass()
            vo7 r1 = new vo7
            r1.<init>(r0)
            r8.B(r1)
            goto L1ec
        L281:
            boolean r1 = ax3.a(r12, r14)
            if (r1 == 0) goto L2a1
            int r1 = w39.S(r6)
            if (r1 != r9) goto L2a1
            rh5 r1 = r5.d
            java.lang.Object r1 = r1.getValue()
            if (r1 != r2) goto L2a1
            gf4 r1 = new gf4
            r2 = 6
            r3 = 0
            r1.<init>(r5, r3, r2)
            jm4.Q(r0, r3, r1, r11)
            goto L1ec
        L2a1:
            r4 = 0
        L2a2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm6.B(java.lang.Object):java.lang.Object");
    }
}
