package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p21 implements zd7 {
    public static final ra a = new ra((byte) 15, false);

    @Override // defpackage.zd7
    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            lo5 lo5Var = lo5.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) g55.o(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.zd7
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.zd7
    public final boolean isSupported() {
        boolean z = o21.d;
        return o21.d;
    }

    @Override // defpackage.zd7
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
