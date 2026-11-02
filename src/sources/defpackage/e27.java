package defpackage;

import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.SocketServerInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class e27 {
    public final SocketServerInfo a;
    public final b83 b;
    public final c83 c;
    public final c83 d;
    public final boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = ConfigGroupCache.$stable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e27(SocketServerInfo socketServerInfo, b83 b83Var, c83 c83Var, c83 c83Var2) {
        b83Var.getClass();
        c83Var.getClass();
        this.a = socketServerInfo;
        this.b = b83Var;
        this.c = c83Var;
        this.d = c83Var2;
        this.e = !c83Var.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e27 a(e27 e27Var, b83 b83Var, km5 km5Var, c83 c83Var, int i) {
        SocketServerInfo socketServerInfo = e27Var.a;
        if ((i & 2) != 0) {
            b83Var = e27Var.b;
        }
        if ((i & 4) != 0) {
            km5Var = e27Var.c;
        }
        if ((i & 8) != 0) {
            c83Var = e27Var.d;
        }
        e27Var.getClass();
        b83Var.getClass();
        km5Var.getClass();
        return new e27(socketServerInfo, b83Var, km5Var, c83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e27)) {
            return false;
        }
        e27 e27Var = (e27) obj;
        return this.a.equals(e27Var.a) && dh3.f(this.b, e27Var.b) && dh3.f(this.c, e27Var.c) && dh3.f(this.d, e27Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        c83 c83Var = this.d;
        return iHashCode + (c83Var == null ? 0 : c83Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SendToTVState(socketServerInfo=" + this.a + ", configList=" + this.b + ", checkedList=" + this.c + ", dataToSend=" + this.d + ")";
    }
}
