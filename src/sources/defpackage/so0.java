package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class so0 implements se8 {
    public final q02 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final f08 e;
    public final f08 f;

    public so0(Context context, f08 f08Var, f08 f08Var2) {
        sn3 sn3Var = new sn3();
        tw twVar = tw.a;
        sn3Var.a(v40.class, twVar);
        sn3Var.a(tx.class, twVar);
        ww wwVar = ww.a;
        sn3Var.a(qf4.class, wwVar);
        sn3Var.a(uy.class, wwVar);
        uw uwVar = uw.a;
        sn3Var.a(eu0.class, uwVar);
        sn3Var.a(yx.class, uwVar);
        sw swVar = sw.a;
        sn3Var.a(jb.class, swVar);
        sn3Var.a(qx.class, swVar);
        vw vwVar = vw.a;
        sn3Var.a(af4.class, vwVar);
        sn3Var.a(ty.class, vwVar);
        xw xwVar = xw.a;
        sn3Var.a(i35.class, xwVar);
        sn3Var.a(wy.class, xwVar);
        sn3Var.d = true;
        this.a = new q02((Object) sn3Var, (byte) 11);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(ob0.c);
        this.e = f08Var2;
        this.f = f08Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(oi0.l("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x0108  */
    public final jy a(jy jyVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        fu6 fu6VarC = jyVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) fu6VarC.i0;
        if (map2 == null) {
            bt.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        fu6VarC.s("model", Build.MODEL);
        fu6VarC.s("hardware", Build.HARDWARE);
        fu6VarC.s("device", Build.DEVICE);
        fu6VarC.s("product", Build.PRODUCT);
        fu6VarC.s("os-uild", Build.ID);
        fu6VarC.s("manufacturer", Build.MANUFACTURER);
        fu6VarC.s("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
        HashMap map3 = (HashMap) fu6VarC.i0;
        if (map3 == null) {
            bt.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = h35.X;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) fu6VarC.i0;
        if (map4 == null) {
            bt.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = g35.X;
                subtype = 100;
            } else if (((g35) g35.X.get(subtype)) == null) {
            }
            map = (HashMap) fu6VarC.i0;
            if (map != null) {
                bt.i("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            fu6VarC.s("country", Locale.getDefault().getCountry());
            fu6VarC.s("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            fu6VarC.s("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                mb6.F("CctTransportBackend");
            }
            fu6VarC.s("application_build", Integer.toString(i2));
            return fu6VarC.v();
        }
        SparseArray sparseArray3 = g35.X;
        subtype = 0;
        map = (HashMap) fu6VarC.i0;
        if (map != null) {
            bt.i("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        fu6VarC.s("country", Locale.getDefault().getCountry());
        fu6VarC.s("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        fu6VarC.s("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        fu6VarC.s("application_build", Integer.toString(i2));
        return fu6VarC.v();
    }
}
