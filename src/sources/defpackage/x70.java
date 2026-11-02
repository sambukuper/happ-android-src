package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x70 implements zd7 {
    public static final w70 a = new w70();

    @Override // defpackage.zd7
    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            lo5 lo5Var = lo5.a;
            parameters.setApplicationProtocols((String[]) g55.o(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // defpackage.zd7
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.zd7
    public final boolean isSupported() {
        boolean z = v70.d;
        return v70.d;
    }

    @Override // defpackage.zd7
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return false;
    }
}
