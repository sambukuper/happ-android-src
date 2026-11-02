package defpackage;

import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pm4 {
    public final StateDownloadFileV2 a;
    public final boolean b;
    public final long c;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR 
  (r3v0 su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2)
  (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? false : (r4v0 boolean))
  (0 long)
 A[MD:(su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2, boolean, long):void (m)] (LINE:8) call: pm4.<init>(su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2, boolean, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pm4(StateDownloadFileV2 stateDownloadFileV2, boolean z, int i) {
        this(stateDownloadFileV2, (i & 2) != 0 ? false : z, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm4)) {
            return false;
        }
        pm4 pm4Var = (pm4) obj;
        return dh3.f(this.a, pm4Var.a) && this.b == pm4Var.b && this.c == pm4Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        StateDownloadFileV2 stateDownloadFileV2 = this.a;
        return Long.hashCode(this.c) + pc6.f((stateDownloadFileV2 == null ? 0 : stateDownloadFileV2.hashCode()) * 31, 31, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoFileCardState(downloadState=");
        sb.append(this.a);
        sb.append(", isEmpty=");
        sb.append(this.b);
        sb.append(", updateTimestamp=");
        return ie2.g(this.c, ")", sb);
    }

    public pm4(StateDownloadFileV2 stateDownloadFileV2, boolean z, long j) {
        this.a = stateDownloadFileV2;
        this.b = z;
        this.c = j;
    }
}
