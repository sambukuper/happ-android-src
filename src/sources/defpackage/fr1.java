package defpackage;

import android.net.Uri;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.dnsoverhttps.DnsOverHttps;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fr1 {
    public static DnsOverHttps a() {
        Object rj6Var;
        Object rj6Var2;
        ArrayList arrayListC;
        List<? extends InetAddress> listK;
        try {
            String strI = n67.c().i("pref_resolve_server_before_start_dns_domain");
            if (strI != null) {
                String strI2 = n67.c().i("pref_resolve_server_before_start_dns_ip");
                OkHttpClient okHttpClient = new OkHttpClient();
                if (strI2 != null) {
                    listK = i21.K(InetAddress.getByName(strI2));
                } else {
                    try {
                        rj6Var2 = Uri.parse(strI).getHost();
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var2 = new rj6(th);
                    }
                    if (rj6Var2 instanceof rj6) {
                        rj6Var2 = null;
                    }
                    String str = (String) rj6Var2;
                    if (str != null && (arrayListC = c(str, false)) != null) {
                        ArrayList arrayList = new ArrayList(xv0.Z(arrayListC, 10));
                        Iterator it = arrayListC.iterator();
                        while (it.hasNext()) {
                            arrayList.add(InetAddress.getByName((String) it.next()));
                        }
                        listK = arrayList;
                    }
                }
                rj6Var = new DnsOverHttps.Builder().client(okHttpClient).url(HttpUrl.INSTANCE.get(strI)).bootstrapDnsHosts(listK).build();
                return (DnsOverHttps) (rj6Var instanceof rj6 ? null : rj6Var);
            }
            return null;
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            rj6Var = new rj6(th2);
        }
    }

    public static List b(String str) {
        Object rj6Var;
        d02 d02Var = d02.X;
        try {
            DnsOverHttps dnsOverHttpsA = a();
            if (dnsOverHttpsA == null) {
                return d02Var;
            }
            List<InetAddress> listLookup = dnsOverHttpsA.lookup(str);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listLookup.iterator();
            while (it.hasNext()) {
                String hostAddress = ((InetAddress) it.next()).getHostAddress();
                if (hostAddress != null) {
                    arrayList.add(hostAddress);
                }
            }
            rj6Var = wv0.Y0(arrayList);
            ss8 ss8Var = ss8.a;
            if (ss8.t()) {
                rj6Var.toString();
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Object obj = d02Var;
        if (sj6.a(rj6Var) == null) {
            obj = rj6Var;
        }
        return (List) obj;
    }

    public static ArrayList c(String str, boolean z) {
        str.getClass();
        try {
            ss8 ss8Var = ss8.a;
            if (!ss8.y(str)) {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                allByName.getClass();
                if (allByName.length != 0) {
                    List listH0 = z ? eu.H0(allByName, new l71((byte) 20)) : eu.H0(allByName, new l71((byte) 19));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listH0.iterator();
                    while (it.hasNext()) {
                        String hostAddress = ((InetAddress) it.next()).getHostAddress();
                        if (hostAddress != null) {
                            arrayList.add(hostAddress);
                        }
                    }
                    ss8 ss8Var2 = ss8.a;
                    if (ss8.t()) {
                        wv0.y0(arrayList, null, null, null, null, 63);
                    }
                    return arrayList;
                }
            }
            return null;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            Throwable thA = sj6.a(new rj6(th));
            if (thA != null) {
                thA.toString();
                return null;
            }
            b61.n();
            return null;
        }
    }
}
