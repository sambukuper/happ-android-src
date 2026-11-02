package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.tencent.mmkv.MMKV;
import io.sentry.i1;
import io.sentry.n0;
import io.sentry.v4;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.IDN;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import libxray.XRayPoint;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.AppVersion;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.HashedDomain;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.VersionOS;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.error.CoreRoutingError;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ss8 {
    public static final ss8 a = new ss8();
    public static final boolean b;
    public static final kc6 c;
    public static final kc6 d;
    public static final vz7 e;
    public static final vz7 f;
    public static final vz7 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        b = ca0.a() >= 3600001;
        c = new kc6("failed to check code ([\\w-]+) from");
        d = new kc6("common/geodata: error unmarshal (?:Site|IP) in (geosite\\.dat|geoip\\.dat):([\\w-]+) > (.*)");
        e = new vz7(new ng8((byte) 11));
        f = new vz7(new ng8((byte) 12));
        g = new vz7(new ng8((byte) 13));
        new vz7(new ng8((byte) 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean A(String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        char[] cArr = {'!'};
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int i2 = 0;
            while (true) {
                if (i2 >= 1) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return u(charSequenceSubSequence.toString());
            }
        }
        charSequenceSubSequence = "";
        return u(charSequenceSubSequence.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object B(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int C(int i, String str) {
        Integer numB0;
        return (str == null || (numB0 = mm7.b0(str)) == null) ? i : numB0.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String D(Context context, String str) throws IOException {
        context.getClass();
        InputStream inputStreamOpen = context.getAssets().open(str);
        inputStreamOpen.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, iq0.a), 8192);
        try {
            String strE = dt7.e(bufferedReader);
            bufferedReader.close();
            return strE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oc.h(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void E(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void F() {
        String strJ = ((MMKV) f.getValue()).j("pref_ui_mode_night", "0");
        if (strJ != null) {
            switch (strJ.hashCode()) {
                case 48:
                    if (strJ.equals("0")) {
                        mp.j(-1);
                        break;
                    }
                    break;
                case 49:
                    if (strJ.equals("1")) {
                        mp.j(1);
                        break;
                    }
                    break;
                case 50:
                    if (strJ.equals("2")) {
                        mp.j(2);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void G(Context context, String str) {
        yf8 rj6Var;
        String rj6Var2;
        String str2;
        cq4 cq4VarB;
        String strP;
        String string;
        String string2;
        String strN = null;
        try {
            fq4 fq4VarA = kc6.a(d, str);
            if (fq4VarA != null) {
                eq4 eq4Var = fq4VarA.c;
                cq4 cq4VarB2 = eq4Var.b(1);
                String str3 = cq4VarB2 != null ? cq4VarB2.a : null;
                mr2 mr2Var = mr2.GEOIP;
                if (!dh3.f(str3, "geoip.dat")) {
                    mr2Var = mr2.GEOSITE;
                }
                cq4 cq4VarB3 = eq4Var.b(2);
                if (cq4VarB3 == null || (string = fm7.R0(cq4VarB3.a).toString()) == null) {
                    string = "?";
                }
                cq4 cq4VarB4 = eq4Var.b(3);
                if (cq4VarB4 == null || (string2 = fm7.R0(cq4VarB4.a).toString()) == null) {
                    string2 = "";
                }
                rj6Var = new yf8(mr2Var, string, string2);
            } else {
                rj6Var = null;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        yf8 yf8Var = rj6Var;
        if (yf8Var != null) {
            strN = ((mr2) yf8Var.X).X;
            String str4 = (String) yf8Var.Y;
            str2 = str4;
            str = ue3.w(context, y46.core_fail_corrupted_geofile, new Object[]{str4, strN});
        } else if (fm7.d0(str, "code not found", false) || fm7.d0(str, "list not found", false) || fm7.d0(str, "wire-format", false) || fm7.d0(str, "geodata: failed to check code", false)) {
            if (fm7.d0(str, "wire-format", false)) {
                HappApplication happApplication = HappApplication.M0;
                mn6 mn6VarF = k32.i().f();
                mn6VarF.getClass();
                String strI = kw4.h().i("SELECTED_SERVER");
                if (strI == null) {
                    strI = null;
                }
                ServerConfig serverConfigB = strI != null ? kw4.b(strI) : null;
                if (serverConfigB != null && (strP = mn6VarF.p(serverConfigB.getSubscriptionId(), true)) != null) {
                    strN = mn6VarF.n(strP, (String) null);
                }
                i61 i61Var = new i61("Error with profile: " + ((Object) strN));
                i1 i1VarB = v4.b();
                i1VarB.getClass();
                i1VarB.p(i61Var, new n0());
            }
            String str5 = fm7.d0(str, "geoip.dat", false) ? "geoip.dat" : "geosite.dat";
            try {
                fq4 fq4VarA2 = kc6.a(c, str);
                if (fq4VarA2 == null || (cq4VarB = fq4VarA2.c.b(1)) == null || (rj6Var2 = fm7.R0(cq4VarB.a).toString()) == null) {
                    rj6Var2 = "?";
                }
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
                rj6Var2 = new rj6(th2);
            }
            String str6 = rj6Var2 instanceof rj6 ? "?" : rj6Var2;
            str = ue3.w(context, y46.core_fail_missing_geofile, new Object[]{str6, str5});
            str2 = str6;
            strN = str5;
        } else {
            if (fm7.d0(str, "address already in use", false)) {
                int i = y46.core_fail_port_used;
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (str.charAt(i2) == '>') {
                        str = str.substring(0, i2);
                        break;
                    }
                }
                str = ue3.w(context, i, new Object[]{wv0.A0(fm7.E0(fm7.R0(str).toString(), new char[]{' '}))});
            }
            str2 = null;
        }
        if (strN == null) {
            try {
                Intent intent = new Intent();
                intent.setAction("su.happ.proxyutility.action.activity");
                intent.setPackage("su.happ.proxyutility");
                intent.putExtra("key", 122);
                intent.putExtra("content", (Serializable) str);
                context.sendBroadcast(intent);
                return;
            } catch (Throwable th3) {
                if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                    throw th3;
                }
                return;
            }
        }
        if (str2 != null) {
            CoreRoutingError coreRoutingError = new CoreRoutingError(str, strN, str2);
            try {
                Intent intent2 = new Intent();
                intent2.setAction("su.happ.proxyutility.action.activity");
                intent2.setPackage("su.happ.proxyutility");
                intent2.putExtra("key", 125);
                intent2.putExtra("content", coreRoutingError);
                context.sendBroadcast(intent2);
            } catch (Throwable th4) {
                if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                    throw th4;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void H(Context context) {
        String strI = ((MMKV) e.getValue()).i("SELECTED_SERVER");
        if (strI == null || strI.length() == 0) {
            x79.h(context, y46.app_tile_first_use);
        } else {
            XRayPoint xRayPoint = n69.a;
            n69.b(context, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void I(Context context) {
        context.getClass();
        x79.h(context, y46.toast_services_stop);
        qe4.L0(context, "su.happ.proxyutility.action.service", 4, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String J(String str) {
        str.getClass();
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            bArrDecode.getClass();
            return new String(bArrDecode, iq0.a);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            Throwable thA = sj6.a(new rj6(th));
            if (thA != null) {
                thA.toString();
            }
            try {
                byte[] bArrDecode2 = Base64.decode(str, 10);
                bArrDecode2.getClass();
                return new String(bArrDecode2, iq0.a);
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
                Throwable thA2 = sj6.a(new rj6(th2));
                if (thA2 == null) {
                    return null;
                }
                thA2.toString();
                return null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String K(String str) {
        String rj6Var;
        try {
            rj6Var = URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (!(rj6Var instanceof rj6)) {
            str = rj6Var;
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String L(Context context) {
        File dir;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 36) {
            dir = context.getFilesDir();
        } else {
            File externalFilesDir = context.getExternalFilesDir("assets");
            dir = externalFilesDir == null ? context.getDir("assets", 0) : externalFilesDir;
        }
        String absolutePath = dir.getAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        String strJ = J(str);
        if (strJ != null) {
            return strJ;
        }
        if (fm7.h0(str, '=')) {
            char[] cArr = {'='};
            int length = str.length() - 1;
            if (length < 0) {
                charSequenceSubSequence = "";
                break;
            }
            while (true) {
                int i = length - 1;
                char cCharAt = str.charAt(length);
                int i2 = 0;
                while (true) {
                    if (i2 >= 1) {
                        i2 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (i2 < 0) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    charSequenceSubSequence = "";
                    break;
                }
                length = i;
            }
            String strJ2 = J(charSequenceSubSequence.toString());
            if (strJ2 != null) {
                return strJ2;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(String str) {
        String rj6Var;
        str.getClass();
        try {
            byte[] bytes = str.getBytes(iq0.a);
            bytes.getClass();
            rj6Var = Base64.encodeToString(bytes, 2);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        String str2 = rj6Var;
        return str2 == null ? "" : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(String str) {
        str.getClass();
        return fm7.R0(mm7.W(mm7.W(str, " ", "%20", false), "|", "%7C", false)).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(String str) {
        return fm7.R0(mm7.W(mm7.W(mm7.W(mm7.W(str, "%7C", "|", false), "%2F", "/", false), "%5C", "\\", false), "a_n_d", "&", false)).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zr e() {
        Integer numB0;
        String strJ = ((MMKV) f.getValue()).j("pref_ui_mode_night", "0");
        if (strJ != null && (numB0 = mm7.b0(strJ)) != null) {
            zr zrVar = (zr) wv0.u0(numB0.intValue(), zr.getEntries());
            if (zrVar != null) {
                return zrVar;
            }
        }
        return zr.AUTO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AppVersion f() {
        AppVersion rj6Var;
        try {
            List listF0 = fm7.F0("4.9.0", new String[]{"."}, 6);
            ArrayList arrayList = new ArrayList(xv0.Z(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            rj6Var = new AppVersion(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList.get(2)).intValue());
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        AppVersion appVersion = new AppVersion(1, 0, 0);
        if (rj6Var instanceof rj6) {
            rj6Var = appVersion;
        }
        return rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(Context context) {
        String rj6Var;
        ClipData.Item itemAt;
        CharSequence text;
        context.getClass();
        try {
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            rj6Var = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) ? null : text.toString();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        String str = rj6Var instanceof rj6 ? null : rj6Var;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String h() {
        String strI = ((MMKV) f.getValue()).i("pref_delay_test_url");
        return (strI == null || strI.length() == 0) ? "https://www.gstatic.com/generate_204" : strI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List i() {
        String domesticDnsIp;
        RouteSettingsCache routeSettingsCacheB;
        RouteSettings routeSettings;
        RouteProfile routeProfileK = mn6.k((mn6) g.getValue());
        if (routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB.getRouteSettings()) == null || (domesticDnsIp = routeSettings.getDomesticDnsIp()) == null) {
            domesticDnsIp = RouteSettings.DEFAULT_DOMESTIC_DNS_IP;
        }
        List listF0 = fm7.F0(domesticDnsIp, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            if (y((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList == null ? i21.K(RouteSettings.DEFAULT_DOMESTIC_DNS_IP) : arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String j(Context context) {
        context.getClass();
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yf8 k(Context context) {
        context.getClass();
        HWID hwid = new HWID(j(context));
        Build.VERSION.RELEASE.getClass();
        VersionOS versionOS = new VersionOS();
        Build.MODEL.getClass();
        return new yf8(hwid, versionOS, new DeviceModel());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String l() {
        rj6 rj6Var;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            networkInterfaces.getClass();
            ArrayList list = Collections.list(networkInterfaces);
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String name = ((NetworkInterface) obj).getName();
                name.getClass();
                if (fm7.d0(name, "wlan0", false)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    rj6Var = null;
                    break;
                }
                Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
                inetAddresses.getClass();
                ArrayList list2 = Collections.list(inetAddresses);
                list2.getClass();
                ka2 ka2Var = new ka2(w27.m0(new la2(new hu(list2, (byte) 1), true, new b58((byte) 21)), qs8.X));
                do {
                    if (!ka2Var.hasNext()) {
                        rj6Var = null;
                        break;
                    }
                    rj6Var = (String) ka2Var.next();
                    if (fm7.l0(rj6Var, ':', 0, 6) >= 0) {
                        rj6Var = null;
                    }
                } while (rj6Var == null);
            } while (rj6Var == null);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return (String) (rj6Var instanceof rj6 ? null : rj6Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String m(String str) {
        str.getClass();
        return (!v(str) || fm7.e0(str, '[') || fm7.e0(str, ']')) ? str : String.format("[%s]", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Locale n() {
        String strI = ((MMKV) f.getValue()).i("pref_language");
        if (strI == null) {
            strI = "auto";
        }
        int iHashCode = strI.hashCode();
        if (iHashCode != -704712386) {
            if (iHashCode != -704711850) {
                if (iHashCode != 3241) {
                    if (iHashCode != 3259) {
                        if (iHashCode != 3651) {
                            if (iHashCode != 3763) {
                                if (iHashCode == 3005871 && strI.equals("auto")) {
                                    Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
                                    locale.getClass();
                                    return locale;
                                }
                            } else if (strI.equals("vi")) {
                                return new Locale("vi");
                            }
                        } else if (strI.equals("ru")) {
                            return new Locale("ru");
                        }
                    } else if (strI.equals("fa")) {
                        return new Locale("fa");
                    }
                } else if (strI.equals("en")) {
                    return new Locale("en");
                }
            } else if (strI.equals("zh-rTW")) {
                return new Locale("zh", "TW");
            }
        } else if (strI.equals("zh-rCN")) {
            return new Locale("zh", "CN");
        }
        Locale locale2 = Resources.getSystem().getConfiguration().getLocales().get(0);
        locale2.getClass();
        return locale2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List o() {
        String remoteDnsIp;
        RouteSettingsCache routeSettingsCacheB;
        RouteSettings routeSettings;
        RouteProfile routeProfileK = mn6.k((mn6) g.getValue());
        if (routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB.getRouteSettings()) == null || (remoteDnsIp = routeSettings.getRemoteDnsIp()) == null) {
            remoteDnsIp = RouteSettings.DEFAULT_REMOTE_DNS_IP;
        }
        List listF0 = fm7.F0(remoteDnsIp, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            String str = (String) obj;
            if (y(str) || mm7.Z(str, false, "https") || mm7.Z(str, false, EConfigNetworkType.TCP.getType()) || mm7.Z(str, false, EConfigNetworkType.QUIC.getType())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList == null ? i21.K(RouteSettings.DEFAULT_REMOTE_DNS_IP) : arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object q(SubscriptionItem subscriptionItem) {
        String strM0;
        subscriptionItem.getClass();
        try {
            MetaParams metaParamsP = subscriptionItem.getMetaParams();
            if (metaParamsP == null || (strM0 = metaParamsP.getHost()) == null) {
                String strC = c(subscriptionItem.m());
                strM0 = fm7.M0('/', strC.substring(fm7.m0(strC, "://", 0, false, 6) + 3));
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = strM0.getBytes(iq0.a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            return new HashedDomain(a03.d(bArrDigest));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] r(String str) {
        str.getClass();
        String strX0 = fm7.x0("0x", fm7.R0(str).toString());
        if (strX0.length() % 2 != 0) {
            bt.q("hex string must have even length");
            return null;
        }
        int length = strX0.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(strX0.charAt(i2 + 1), 16) | (Character.digit(strX0.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String s(String str) {
        str.getClass();
        URL url = new URL(str);
        String externalForm = new URL(url.getProtocol(), IDN.toASCII(url.getHost(), 1), url.getPort(), url.getFile()).toExternalForm();
        externalForm.getClass();
        return externalForm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean t() {
        return mm7.R("su.happ.proxyutility", false, ".dev");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean u(String str) {
        Boolean rj6Var;
        str.getClass();
        try {
            if (str.length() != 0 && !fm7.o0(str)) {
                if (fm7.m0(str, "/", 0, false, 6) > 0) {
                    List listF0 = fm7.F0(str, new String[]{"/"}, 6);
                    if (listF0.size() == 2 && Integer.parseInt((String) listF0.get(1)) > -1) {
                        str = (String) listF0.get(0);
                    }
                }
                if (mm7.Z(str, false, "::ffff:") && fm7.e0(str, '.')) {
                    str = fm7.f0(7, str);
                } else if (mm7.Z(str, false, "[::ffff:") && fm7.e0(str, '.')) {
                    str = mm7.W(fm7.f0(8, str), "]", "", false);
                }
                String[] strArr = (String[]) fm7.E0(str, new char[]{'.'}).toArray(new String[0]);
                if (strArr.length != 4) {
                    rj6Var = Boolean.valueOf(v(str));
                    if (sj6.a(rj6Var) == null) {
                        return rj6Var.booleanValue();
                    }
                    return false;
                }
                if (fm7.m0(strArr[3], ":", 0, false, 6) > 0) {
                    str = str.substring(0, fm7.m0(str, ":", 0, false, 6));
                }
                Pattern patternCompile = Pattern.compile("^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$");
                patternCompile.getClass();
                return patternCompile.matcher(str).matches();
            }
            return false;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean v(String str) {
        str.getClass();
        if (fm7.m0(str, "[", 0, false, 6) == 0 && fm7.r0(str, "]", 0, 6) > 0) {
            String strF0 = fm7.f0(1, str);
            str = fm7.g0(strF0.length() - fm7.r0(strF0, "]", 0, 6), strF0);
        }
        Pattern patternCompile = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*::((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*|((?:[0-9A-Fa-f]{1,4}))((?::[0-9A-Fa-f]{1,4})){7}$");
        patternCompile.getClass();
        return patternCompile.matcher(str).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean w() {
        return !dh3.f(n().getLanguage(), "fa");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean x() {
        Boolean rj6Var;
        NetworkCapabilities networkCapabilities;
        try {
            HappApplication happApplication = HappApplication.M0;
            Object systemService = k32.i().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                rj6Var = Boolean.valueOf(networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2));
                Boolean bool = Boolean.FALSE;
                if (rj6Var instanceof rj6) {
                    rj6Var = bool;
                }
                return rj6Var.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean y(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile("^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$");
        patternCompile.getClass();
        return patternCompile.matcher(str).matches() || v(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public static boolean z(String str) {
        Boolean rj6Var;
        boolean z;
        if (str != null) {
            try {
                if (Patterns.WEB_URL.matcher(str).matches()) {
                    z = true;
                } else if (URLUtil.isValidUrl(str)) {
                    z = true;
                } else {
                    z = false;
                }
                rj6Var = Boolean.valueOf(z);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
        } else {
            if (URLUtil.isValidUrl(str)) {
                z = true;
            } else {
                z = false;
            }
            rj6Var = Boolean.valueOf(z);
        }
        if (sj6.a(rj6Var) == null) {
            return rj6Var.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r6 == r4) goto L25;
     */
    /* JADX WARN: Type inference failed for: r6v11, types: [int, short] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int, short] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, final long j, s51 s51Var) {
        rs8 rs8Var;
        if (s51Var instanceof rs8) {
            rs8Var = (rs8) s51Var;
            int i = rs8Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                rs8Var.i0 = i - Integer.MIN_VALUE;
            } else {
                rs8Var = new rs8(this, s51Var);
            }
        } else {
            rs8Var = new rs8(this, s51Var);
        }
        Object objW = rs8Var.g0;
        int i2 = rs8Var.i0;
        String str2 = null;
        c71 c71Var = c71.X;
        if (i2 != 0) {
            if (i2 == 1) {
                j = rs8Var.f0;
                w39.n0(objW);
            } else {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(objW);
            }
            str2 = (String) objW;
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        w39.n0(objW);
        Request.Builder builderHeader = new Request.Builder().url(new URL(str)).header("Connection", "close");
        String language = n().getLanguage();
        language.getClass();
        final Request.Builder builderHeader2 = builderHeader.header("X-Device-Locale", language);
        dn2 dn2Var = new dn2(j, builderHeader2) { // from class: ps8
            public final /* synthetic */ short X;
            public final /* synthetic */ Request.Builder Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
            {
                this.X = (int) j;
                this.Y = builderHeader2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                long j2 = this.X;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                OkHttpClient.Builder builderCache = builder.callTimeout(j2, timeUnit).readTimeout(j2, timeUnit).writeTimeout(j2, timeUnit).connectTimeout(j2, timeUnit).cache((Cache) null);
                HappApplication happApplication = HappApplication.M0;
                return k32.i().e().a(builderCache, (int) j2).build().newCall(this.Y.build()).execute();
            }
        };
        nf1 nf1Var = tp1.a;
        ye1 ye1Var = ye1.Z;
        l40 l40Var = new l40(dn2Var, (q51) null, (byte) 18);
        rs8Var.f0 = (int) j;
        rs8Var.i0 = 1;
        objW = w51.W(ye1Var, l40Var, rs8Var);
        if (objW != c71Var) {
        }
        return c71Var;
        Response response = (Response) objW;
        if (response != null) {
            if (response.isSuccessful()) {
                nf1 nf1Var2 = tp1.a;
                ye1 ye1Var2 = ye1.Z;
                c72 c72Var = new c72(response, (q51) null, (byte) 1);
                rs8Var.f0 = (int) j;
                rs8Var.i0 = 2;
                objW = w51.W(ye1Var2, c72Var, rs8Var);
            }
            if (str2 == null) {
                return "";
            }
        }
        return str2;
    }
}
