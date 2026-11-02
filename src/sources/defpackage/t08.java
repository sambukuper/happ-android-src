package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.system.Os;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class t08 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final dj8 a(rt8 rt8Var) {
        int iOrdinal = rt8Var.ordinal();
        if (iOrdinal == 0) {
            return dj8.f0;
        }
        if (iOrdinal == 1) {
            return dj8.Y;
        }
        if (iOrdinal == 2) {
            return dj8.Z;
        }
        b61.c();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String b(lh8 lh8Var) {
        StringBuilder sb = new StringBuilder("type: " + lh8Var);
        sb.append('\n');
        sb.append("hashCode: " + lh8Var.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + lh8Var.getClass().getCanonicalName());
        sb.append('\n');
        for (ed1 ed1VarX = lh8Var.x(); ed1VarX != null; ed1VarX = ed1VarX.p()) {
            sb.append("fqName: ".concat(wk1.c.n(ed1VarX)));
            sb.append('\n');
            sb.append("javaClass: " + ed1VarX.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List c(Context context) {
        d02 rj6Var;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        d02 d02Var = d02.X;
        if (connectivityManager == null) {
            return d02Var;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            try {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                if (linkProperties != null) {
                    linkProperties.getInterfaceName();
                    List<InetAddress> dnsServers = linkProperties.getDnsServers();
                    dnsServers.getClass();
                    ArrayList arrayList = new ArrayList(xv0.Z(dnsServers, 10));
                    Iterator<T> it = dnsServers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InetAddress) it.next()).getHostAddress());
                    }
                    Objects.toString(activeNetwork);
                    arrayList.toString();
                    List<InetAddress> dnsServers2 = linkProperties.getDnsServers();
                    dnsServers2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = dnsServers2.iterator();
                    while (it2.hasNext()) {
                        String hostAddress = ((InetAddress) it2.next()).getHostAddress();
                        if (hostAddress != null) {
                            arrayList2.add(hostAddress);
                        }
                    }
                    rj6Var = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((String) obj).length() > 0) {
                            rj6Var.add(obj);
                        }
                    }
                    if (sj6.a(rj6Var) == null) {
                        d02Var = rj6Var;
                    }
                    d02Var = (List) d02Var;
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            linkedHashSet.addAll(d02Var);
        }
        return wv0.Y0(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(xc8 xc8Var, Throwable th) throws Throwable {
        cv5 cv5Var = ((el5) xc8Var).c;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        db7 db7VarK = cv5Var.g0;
        db7 db7Var = cv5Var.h0;
        if (db7VarK == null || ((p98) db7VarK).f0 != id) {
            if (db7Var == null || ((p98) db7Var).f0 != id) {
                db7VarK = cv5Var.k(id, threadCurrentThread.getName(), Os.gettid());
                cv5Var.h0 = cv5Var.g0;
                cv5Var.g0 = db7VarK;
            } else {
                db7VarK = db7Var;
            }
        }
        o02 o02Var = db7VarK.X;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }
}
