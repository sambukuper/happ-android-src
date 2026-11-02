package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bv3 implements dn2 {
    public final /* synthetic */ byte X;
    public final ev3 Y;
    public final cv3 Z;

    public /* synthetic */ bv3(cv3 cv3Var, ev3 ev3Var, byte b) {
        this.X = b;
        this.Z = cv3Var;
        this.Y = ev3Var;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x033a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:382:0x0856  */
    /* JADX WARN: Code duplicated, block: B:399:0x0898  */
    /* JADX WARN: Code duplicated, block: B:402:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:404:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:406:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:407:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:411:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:413:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:416:0x08fb A[LOOP:23: B:414:0x08f5->B:416:0x08fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:418:0x0912  */
    /* JADX WARN: Code duplicated, block: B:428:0x094a  */
    /* JADX WARN: Code duplicated, block: B:433:0x097a  */
    /* JADX WARN: Code duplicated, block: B:445:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:520:0x033d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0983 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0974 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [d02, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v27 java.lang.Object, still in use, count: 2, list:
          (r5v27 java.lang.Object) from 0x0875: PHI (r5 I:??) = (r5v11 java.lang.Object), (r5v27 java.lang.Object) binds: [B:389:0x0874, B:575:0x0875] A[DONT_GENERATE, DONT_INLINE]
          (r5v27 java.lang.Object) from 0x086d: CHECK_CAST (java.lang.annotation.Annotation) (r5v27 java.lang.Object)
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
            Method dump skipped, instruction units count: 2944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv3.invoke():java.lang.Object");
    }

    public /* synthetic */ bv3(ev3 ev3Var, cv3 cv3Var, byte b) {
        this.X = b;
        this.Y = ev3Var;
        this.Z = cv3Var;
    }
}
