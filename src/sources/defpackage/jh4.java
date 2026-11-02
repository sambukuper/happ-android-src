package defpackage;

import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public interface jh4 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void v(jh4 jh4Var, String str, DnsTTLogType dnsTTLogType, int i) {
        if ((i & 2) != 0) {
            dnsTTLogType = DnsTTLogType.DEBUG;
        }
        jh4Var.r(str, dnsTTLogType);
    }

    void r(String str, DnsTTLogType dnsTTLogType);
}
