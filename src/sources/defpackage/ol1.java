package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ol1 implements dn2 {
    public final /* synthetic */ byte X;
    public final vl1 Y;

    public /* synthetic */ ol1(vl1 vl1Var, byte b) {
        this.X = b;
        this.Y = vl1Var;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 java.lang.Object, still in use, count: 2, list:
          (r0v6 java.lang.Object) from 0x02e3: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v6 java.lang.Object) binds: [B:125:0x02e2, B:148:0x02e3] A[DONT_GENERATE, DONT_INLINE]
          (r0v6 java.lang.Object) from 0x02d1: CHECK_CAST (iy5) (r0v6 java.lang.Object)
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
    @Override // defpackage.dn2
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol1.invoke():java.lang.Object");
    }
}
