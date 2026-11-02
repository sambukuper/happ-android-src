package defpackage;

import com.tencent.mmkv.MMKV;
import su.happ.proxyutility.dto.enums.EIpType;
import su.happ.proxyutility.dto.enums.FragmentationType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class n67 {
    public static final vz7 a = new vz7(new r47((byte) 4));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a() {
        ss8 ss8Var = ss8.a;
        return ss8.C(Integer.parseInt("10810"), c().i("pref_antifilter_socks_port"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b() {
        ss8 ss8Var = ss8.a;
        return ss8.C(Integer.parseInt("10809"), c().i("pref_http_port"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV c() {
        return (MMKV) a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d() {
        ss8 ss8Var = ss8.a;
        return ss8.C(Integer.parseInt("10808"), c().i("pref_socks_port"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean e() {
        if (c().c("pref_fragment_enabled", false)) {
            FragmentationType.Companion companion = FragmentationType.INSTANCE;
            String strJ = c().j("pref_fragment_type", (String) null);
            companion.getClass();
            if (FragmentationType.Companion.a(strJ) == FragmentationType.ADVANCED) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean f() {
        return c().c("pref_xray_tun_enabled", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g() {
        EIpType.Companion companion = EIpType.INSTANCE;
        String strI = c().i("pref_ip_type");
        companion.getClass();
        int i = m67.a[EIpType.Companion.a(strI).ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        b61.c();
        return false;
    }
}
