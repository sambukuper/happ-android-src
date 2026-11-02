package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.Dns;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 implements Dns {
    public final Map a;

    public g72() {
        Map mapSingletonMap = Collections.singletonMap("google.com", "drive.usercontent.google.com");
        mapSingletonMap.getClass();
        this.a = mapSingletonMap;
    }

    @Override // okhttp3.Dns
    public final List lookup(String str) {
        str.getClass();
        Dns dns = Dns.SYSTEM;
        String str2 = (String) this.a.get(str);
        if (str2 != null) {
            str = str2;
        }
        return dns.lookup(str);
    }
}
