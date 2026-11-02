package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn1 extends no2 implements rn2 {
    public final /* synthetic */ byte X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.X = b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x023b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v25 java.lang.Object, still in use, count: 2, list:
          (r4v25 java.lang.Object) from 0x008d: PHI (r4 I:??) = (r4v19 java.lang.Object), (r4v25 java.lang.Object) binds: [B:20:0x008c, B:252:0x008d] A[DONT_GENERATE, DONT_INLINE]
          (r4v25 java.lang.Object) from 0x007f: CHECK_CAST (su.happ.proxyutility.dto.ConfigGroupCache) (r4v25 java.lang.Object)
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
    @Override // defpackage.rn2
    public final java.lang.Object K(java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn1.K(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
