package defpackage;

import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class qs8 extends no2 implements gn2 {
    public static final qs8 X = new qs8(1, InetAddress.class, "getHostAddress", "getHostAddress()Ljava/lang/String;", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        inetAddress.getClass();
        return inetAddress.getHostAddress();
    }
}
