package su.happ.proxyutility.service;

import defpackage.ss8;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.dto.DownloadFilesData;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class c extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ DownloadFilesData h0;
    public final /* synthetic */ DownloadFilesService i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DownloadFilesData downloadFilesData, DownloadFilesService downloadFilesService, q51 q51Var) {
        super(2, q51Var);
        this.h0 = downloadFilesData;
        this.i0 = downloadFilesService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new c(this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object next;
        boolean z = this.g0;
        byte b = 1;
        q51 q51Var = null;
        if (!z) {
            w39.n0(obj);
            ss8 ss8Var = ss8.a;
            DownloadFilesData downloadFilesData = this.h0;
            boolean z2 = ss8.z(downloadFilesData.getUrl());
            byte b2 = 0;
            DownloadFilesService downloadFilesService = this.i0;
            if (z2) {
                d dVar = d.a;
                try {
                    d.g(1, downloadFilesService, null);
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
                String path = downloadFilesData.getPath();
                String url = downloadFilesData.getUrl();
                long id = downloadFilesData.getId();
                long rangeStart = downloadFilesData.getRangeStart();
                path.getClass();
                url.getClass();
                j31 j31Var = new j31(new it1(path, rangeStart, url, id, (q51) null), (byte) 7);
                nf1 nf1Var = tp1.a;
                ye1 ye1Var = ye1.Z;
                sf2 sf2Var = new sf2(new sf2(zc1.H(zc1.H(j31Var, ye1Var), ye1Var), new b(downloadFilesData, downloadFilesService, q51Var, b2), (byte) 2), new q5(2, (q51) null, (byte) 7), (byte) 1);
                be beVar = gx1.Y;
                long jS0 = u70.s0(vj8.l0(300, lx1.Z));
                if (jS0 <= 0) {
                    bt.q("Sample period should be positive");
                    return null;
                }
                j31 j31Var2 = new j31(new if2(jS0, sf2Var, (q51) null), (byte) 2);
                b bVar = new b(downloadFilesData, downloadFilesService, q51Var, b);
                this.g0 = true;
                Object objN = z91.n(j31Var2, bVar, this);
                c71 c71Var = c71.X;
                if (objN == c71Var) {
                    return c71Var;
                }
            } else {
                Iterator it = d.i.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((DownloadFilesManager$InternalDataDownloadFiles) next).getId() != downloadFilesData.getId());
                DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles = (DownloadFilesManager$InternalDataDownloadFiles) next;
                if (downloadFilesManager$InternalDataDownloadFiles != null) {
                    downloadFilesManager$InternalDataDownloadFiles.g(StateDownloadFile.LINK_NOT_CORRECT);
                    Iterator it2 = downloadFilesManager$InternalDataDownloadFiles.getListeners().iterator();
                    while (it2.hasNext()) {
                        ((hs) it2.next()).a(false);
                    }
                    d dVar2 = d.a;
                    try {
                        d.g(2, downloadFilesService, null);
                    } catch (Throwable th2) {
                        if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                            throw th2;
                        }
                    }
                    d.a(downloadFilesService, downloadFilesManager$InternalDataDownloadFiles);
                }
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
