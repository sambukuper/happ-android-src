package defpackage;

import su.happ.proxyutility.log_report.LogWorker;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class hh4 extends s51 {
    public String f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ LogWorker h0;
    public int i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh4(LogWorker logWorker, s51 s51Var) {
        super(s51Var);
        this.h0 = logWorker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        this.g0 = obj;
        this.i0 |= Integer.MIN_VALUE;
        return this.h0.e(this);
    }
}
