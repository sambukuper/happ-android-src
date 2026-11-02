package su.happ.proxyutility.domain.routing.entity;

import defpackage.dq2;
import defpackage.e37;
import defpackage.f01;
import defpackage.fn8;
import defpackage.g44;
import defpackage.nf3;
import defpackage.oi4;
import defpackage.ol7;
import defpackage.ow3;
import defpackage.rd1;
import defpackage.ti1;
import defpackage.zp5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"su/happ/proxyutility/domain/routing/entity/DownloadFilesInfo.$serializer", "Ldq2;", "Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;", "Le37;", "descriptor", "Le37;", "d", "()Le37;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
@ti1
public final /* synthetic */ class DownloadFilesInfo$$serializer implements dq2 {
    public static final int $stable = 0;
    public static final DownloadFilesInfo$$serializer INSTANCE;
    private static final e37 descriptor;

    static {
        DownloadFilesInfo$$serializer downloadFilesInfo$$serializer = new DownloadFilesInfo$$serializer();
        INSTANCE = downloadFilesInfo$$serializer;
        zp5 zp5Var = new zp5("su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo", downloadFilesInfo$$serializer, 5);
        zp5Var.k("id", false);
        zp5Var.k("state", false);
        zp5Var.k("downloadBytes", false);
        zp5Var.k("totalBytes", false);
        zp5Var.k("progress", false);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) obj;
        downloadFilesInfo.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        DownloadFilesInfo.i(downloadFilesInfo, ol7VarA, e37Var);
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        g44[] g44VarArr = DownloadFilesInfo.$childSerializers;
        int i = 0;
        int iR = 0;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        StateDownloadFile stateDownloadFile = null;
        boolean z = true;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                jD = f01VarT.D(e37Var, 0);
                i |= 1;
            } else if (iE == 1) {
                stateDownloadFile = (StateDownloadFile) f01VarT.q(e37Var, 1, (ow3) g44VarArr[1].getValue(), stateDownloadFile);
                i |= 2;
            } else if (iE == 2) {
                jD2 = f01VarT.D(e37Var, 2);
                i |= 4;
            } else if (iE == 3) {
                jD3 = f01VarT.D(e37Var, 3);
                i |= 8;
            } else {
                if (iE != 4) {
                    throw new fn8(iE);
                }
                iR = f01VarT.r(e37Var, 4);
                i |= 16;
            }
        }
        f01VarT.n(e37Var);
        return new DownloadFilesInfo(i, jD, stateDownloadFile, jD2, jD3, iR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dq2
    public final ow3[] c() {
        g44[] g44VarArr = DownloadFilesInfo.$childSerializers;
        oi4 oi4Var = oi4.a;
        return new ow3[]{oi4Var, g44VarArr[1].getValue(), oi4Var, oi4Var, nf3.a};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
