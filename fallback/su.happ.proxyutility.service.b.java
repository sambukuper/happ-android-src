package su.happ.proxyutility.service;

import defpackage.dn8;
import defpackage.q51;
import defpackage.rn2;
import defpackage.uy7;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.dto.DownloadFilesData;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ DownloadFilesData i0;
    public final /* synthetic */ DownloadFilesService j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DownloadFilesData downloadFilesData, DownloadFilesService downloadFilesService, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = downloadFilesData;
        this.j0 = downloadFilesService;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                ((b) n(q51Var, downloadFilesInfo)).q(dn8Var);
                break;
            default:
                ((b) n(q51Var, downloadFilesInfo)).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        DownloadFilesService downloadFilesService = this.j0;
        DownloadFilesData downloadFilesData = this.i0;
        switch (b) {
            case 0:
                b bVar = new b(downloadFilesData, downloadFilesService, q51Var, (byte) 0);
                bVar.h0 = obj;
                return bVar;
            default:
                b bVar2 = new b(downloadFilesData, downloadFilesService, q51Var, (byte) 1);
                bVar2.h0 = obj;
                return bVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d A[LOOP:1: B:14:0x0047->B:16:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[LOOP:4: B:71:0x017d->B:73:0x0183, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb A[LOOP:6: B:84:0x01c5->B:86:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [r65] */
    /* JADX WARN: Type inference failed for: r6v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v29 java.lang.Object, still in use, count: 2, list:
          (r0v29 java.lang.Object) from 0x0036: PHI (r0 I:??) = (r0v11 java.lang.Object), (r0v29 java.lang.Object) binds: [B:10:0x0035, B:92:0x0036] A[DONT_GENERATE, DONT_INLINE]
          (r0v29 java.lang.Object) from 0x0026: CHECK_CAST (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) (r0v29 java.lang.Object)
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
    public final java.lang.Object q(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.service.b.q(java.lang.Object):java.lang.Object");
    }
}
