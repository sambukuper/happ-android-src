package defpackage;

import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l40 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l40(q51 q51Var, Object obj, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws IOException {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 1:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 2:
                ((l40) n((q51) obj2, (x31) obj)).q(dn8Var);
                return dn8Var;
            case 3:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 4:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((l40) n((q51) obj2, bool)).q(dn8Var);
                return dn8Var;
            case 9:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 10:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 11:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 13:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 14:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 15:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ((l40) n((q51) obj2, (dn8) obj)).q(dn8Var);
                return dn8Var;
            case 17:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 18:
                return ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 19:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            default:
                ((l40) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                return new l40(obj2, q51Var, (byte) 0);
            case 1:
                return new l40(obj2, q51Var, (byte) 1);
            case 2:
                return new l40(obj2, q51Var, (byte) 2);
            case 3:
                return new l40(q51Var, obj2, (byte) 3);
            case 4:
                return new l40(obj2, q51Var, (byte) 4);
            case 5:
                return new l40(obj2, q51Var, (byte) 5);
            case 6:
                return new l40(obj2, q51Var, (byte) 6);
            case 7:
                return new l40(obj2, q51Var, (byte) 7);
            case 8:
                return new l40(obj2, q51Var, (byte) 8);
            case 9:
                return new l40(obj2, q51Var, (byte) 9);
            case 10:
                return new l40(obj2, q51Var, (byte) 10);
            case 11:
                return new l40(obj2, q51Var, (byte) 11);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new l40(obj2, q51Var, (byte) 12);
            case 13:
                return new l40(obj2, q51Var, (byte) 13);
            case 14:
                return new l40(obj2, q51Var, (byte) 14);
            case 15:
                return new l40(obj2, q51Var, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new l40(obj2, q51Var, (byte) 16);
            case 17:
                return new l40(q51Var, obj2, (byte) 17);
            case 18:
                return new l40(obj2, q51Var, (byte) 18);
            case 19:
                return new l40(obj2, q51Var, (byte) 19);
            default:
                return new l40(obj2, q51Var, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v31 java.lang.Object, still in use, count: 2, list:
          (r2v31 java.lang.Object) from 0x0176: PHI (r2 I:??) = (r2v28 java.lang.Object), (r2v31 java.lang.Object) binds: [B:65:0x0175, B:339:0x0176] A[DONT_GENERATE, DONT_INLINE]
          (r2v31 java.lang.Object) from 0x016c: CHECK_CAST (wg1) (r2v31 java.lang.Object)
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
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l40.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l40(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = obj;
    }
}
