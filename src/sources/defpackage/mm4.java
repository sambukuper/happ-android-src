package defpackage;

import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class mm4 implements gn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ String Y;
    public final /* synthetic */ MainViewModel Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mm4(String str, MainViewModel mainViewModel) {
        this.Y = str;
        this.Z = mainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public final Object B(Object obj) {
        Object value;
        xm4 xm4Var;
        byte b = this.X;
        boolean zEquals = true;
        MainViewModel mainViewModel = this.Z;
        String str = this.Y;
        switch (b) {
            case 0:
                mainViewModel.V(((Long) obj).longValue(), str);
                oh7 oh7Var = mainViewModel.w;
                do {
                    value = oh7Var.getValue();
                    xm4Var = (xm4) value;
                    xm4Var.getClass();
                } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f - 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                return dn8.a;
            default:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                GuId guId = (GuId) qg5Var.X;
                String strB = guId != null ? guId.b() : null;
                ServerConfig serverConfig = (ServerConfig) qg5Var.Y;
                if (strB == null) {
                    if (str != null) {
                        zEquals = false;
                    }
                } else if (str == null) {
                    zEquals = false;
                } else {
                    zEquals = strB.equals(str);
                }
                (strB != null ? new GuId(strB) : null).getClass();
                (strB != null ? new GuId(strB) : null).getClass();
                strB.getClass();
                return new ServerCache(strB, serverConfig, mainViewModel.o().c(strB), zEquals);
        }
    }

    public /* synthetic */ mm4(MainViewModel mainViewModel, String str) {
        this.Z = mainViewModel;
        this.Y = str;
    }
}
