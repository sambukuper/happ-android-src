package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 implements zd7 {
    public final ch1 a;
    public zd7 b;

    public dh1(ch1 ch1Var) {
        this.a = ch1Var;
    }

    @Override // defpackage.zd7
    public final void a(SSLSocket sSLSocket, String str, List list) {
        zd7 zd7VarB = b(sSLSocket);
        if (zd7VarB != null) {
            zd7VarB.a(sSLSocket, str, list);
        }
    }

    public final synchronized zd7 b(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.matchesSocket(sSLSocket)) {
                this.b = this.a.create(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.zd7
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        zd7 zd7VarB = b(sSLSocket);
        if (zd7VarB != null) {
            return zd7VarB.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.zd7
    public final boolean isSupported() {
        return true;
    }

    @Override // defpackage.zd7
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.a.matchesSocket(sSLSocket);
    }
}
