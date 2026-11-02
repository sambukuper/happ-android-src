package su.happ.proxyutility.service;

import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.dto.DownloadFilesData;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class b extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ DownloadFilesData i0;
    public final /* synthetic */ DownloadFilesService j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DownloadFilesData downloadFilesData, DownloadFilesService downloadFilesService, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = downloadFilesData;
        this.j0 = downloadFilesService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, downloadFilesInfo).q(dn8Var);
                break;
            default:
                n(q51Var, downloadFilesInfo).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final java.lang.Object q(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.g0
            dn8 r1 = dn8.a
            r2 = 3
            r3 = 2
            su.happ.proxyutility.service.DownloadFilesService r4 = r11.j0
            su.happ.proxyutility.dto.DownloadFilesData r5 = r11.i0
            r6 = 0
            java.lang.Object r11 = r11.h0
            su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo r11 = (su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo) r11
            switch(r0) {
                case 0: goto L134;
                default: goto L12;
            }
        L12:
            w39.n0(r12)
            java.util.ArrayList r12 = su.happ.proxyutility.service.d.i
            java.util.Iterator r12 = r12.iterator()
        L1b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r12.next()
            r7 = r0
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r7 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r7
            long r7 = r7.getId()
            long r9 = r5.getId()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L1b
            goto L36
        L35:
            r0 = r6
        L36:
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r0 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r0
            if (r0 == 0) goto L133
            su.happ.proxyutility.domain.routing.entity.StateDownloadFile r12 = su.happ.proxyutility.domain.routing.entity.StateDownloadFile.PROGRESS
            r0.g(r12)
            java.util.List r12 = r0.getListeners()
            java.util.Iterator r12 = r12.iterator()
        L47:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r12.next()
            hs r0 = (hs) r0
            r0.getClass()
            r11.getClass()
            ms r0 = r0.a
            m51 r5 = r0.c
            nf1 r7 = tp1.a
            ye1 r7 = ye1.Z
            q0 r8 = new q0
            r9 = 5
            r8.<init>(r0, r11, r6, r9)
            jm4.Q(r5, r7, r8, r3)
            goto L47
        L6b:
            su.happ.proxyutility.service.d r12 = su.happ.proxyutility.service.d.a
            com.google.gson.a r12 = yw2.b
            java.lang.String r12 = r12.h(r11)
            su.happ.proxyutility.service.d.g(r2, r4, r12)     // Catch: java.lang.Throwable -> L77
            goto L80
        L77:
            r12 = move-exception
            boolean r0 = r12 instanceof java.lang.InterruptedException
            if (r0 != 0) goto L132
            boolean r0 = r12 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L132
        L80:
            r65 r12 = su.happ.proxyutility.service.d.h
            if (r12 == 0) goto L133
            java.util.ArrayList r12 = su.happ.proxyutility.service.d.i
            java.util.Iterator r12 = r12.iterator()
        L8a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r12.next()
            r2 = r0
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r2 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r2
            long r2 = r2.getId()
            long r4 = r11.d()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L8a
            goto La5
        La4:
            r0 = r6
        La5:
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r0 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r0
            if (r0 == 0) goto Lae
            java.lang.String r12 = r0.getFileName()
            goto Laf
        Lae:
            r12 = r6
        Laf:
            long r2 = r11.c()
            java.lang.String r0 = defpackage.x79.g(r2)
            long r2 = r11.g()
            java.lang.String r2 = defpackage.x79.g(r2)
            int r3 = r11.e()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r12 = " "
            r4.append(r12)
            r4.append(r0)
            java.lang.String r12 = "/"
            r4.append(r12)
            r4.append(r2)
            java.lang.String r12 = " - "
            r4.append(r12)
            r4.append(r3)
            java.lang.String r12 = "%"
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r65 r0 = su.happ.proxyutility.service.d.h
            if (r0 == 0) goto Lf6
            int r2 = q36.ic_stat_name
            android.app.Notification r3 = r0.v
            r3.icon = r2
        Lf6:
            if (r0 == 0) goto L106
            q65 r2 = new q65
            r2.<init>()
            java.lang.CharSequence r3 = r65.c(r12)
            r2.e = r3
            r0.f(r2)
        L106:
            r65 r0 = su.happ.proxyutility.service.d.h
            if (r0 == 0) goto L110
            java.lang.CharSequence r12 = r65.c(r12)
            r0.f = r12
        L110:
            r65 r12 = su.happ.proxyutility.service.d.h
            if (r12 == 0) goto L11e
            int r11 = r11.e()
            r0 = 100
            r12.m = r0
            r12.n = r11
        L11e:
            android.app.NotificationManager r11 = su.happ.proxyutility.service.d.b()
            if (r11 == 0) goto L133
            r65 r12 = su.happ.proxyutility.service.d.h
            if (r12 == 0) goto L12c
            android.app.Notification r6 = r12.b()
        L12c:
            r12 = 2009(0x7d9, float:2.815E-42)
            r11.notify(r12, r6)
            goto L133
        L132:
            throw r12
        L133:
            return r1
        L134:
            w39.n0(r12)
            su.happ.proxyutility.domain.routing.entity.StateDownloadFile r11 = r11.f()
            int[] r12 = defpackage.xs1.a
            int r11 = r11.ordinal()
            r11 = r12[r11]
            r12 = 1
            if (r11 == r12) goto L194
            if (r11 == r3) goto L14c
            if (r11 == r2) goto L14c
            goto L1da
        L14c:
            java.util.ArrayList r11 = su.happ.proxyutility.service.d.i
            java.util.Iterator r11 = r11.iterator()
        L152:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L16c
            java.lang.Object r12 = r11.next()
            r0 = r12
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r0 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r0
            long r2 = r0.getId()
            long r7 = r5.getId()
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L152
            r6 = r12
        L16c:
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r6 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r6
            if (r6 == 0) goto L1da
            su.happ.proxyutility.domain.routing.entity.StateDownloadFile r11 = su.happ.proxyutility.domain.routing.entity.StateDownloadFile.FAILURE
            r6.g(r11)
            java.util.List r11 = r6.getListeners()
            java.util.Iterator r11 = r11.iterator()
        L17d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L18e
            java.lang.Object r12 = r11.next()
            hs r12 = (hs) r12
            r0 = 0
            r12.a(r0)
            goto L17d
        L18e:
            su.happ.proxyutility.service.d r11 = su.happ.proxyutility.service.d.a
            su.happ.proxyutility.service.d.a(r4, r6)
            goto L1da
        L194:
            java.util.ArrayList r11 = su.happ.proxyutility.service.d.i
            java.util.Iterator r11 = r11.iterator()
        L19a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L1b4
            java.lang.Object r0 = r11.next()
            r2 = r0
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r2 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r2
            long r2 = r2.getId()
            long r7 = r5.getId()
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L19a
            r6 = r0
        L1b4:
            su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles r6 = (su.happ.proxyutility.service.DownloadFilesManager$InternalDataDownloadFiles) r6
            if (r6 == 0) goto L1da
            su.happ.proxyutility.domain.routing.entity.StateDownloadFile r11 = su.happ.proxyutility.domain.routing.entity.StateDownloadFile.SUCCESS
            r6.g(r11)
            java.util.List r11 = r6.getListeners()
            java.util.Iterator r11 = r11.iterator()
        L1c5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L1d5
            java.lang.Object r0 = r11.next()
            hs r0 = (hs) r0
            r0.a(r12)
            goto L1c5
        L1d5:
            su.happ.proxyutility.service.d r11 = su.happ.proxyutility.service.d.a
            su.happ.proxyutility.service.d.a(r4, r6)
        L1da:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.service.b.q(java.lang.Object):java.lang.Object");
    }
}
