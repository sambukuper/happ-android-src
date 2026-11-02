package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.tencent.mmkv.MMKV;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.FaqSettingsActivity;
import su.happ.proxyutility.ui.WebViewActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class mj4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mj4(MainActivity mainActivity, byte b) {
        this.X = b;
        this.Y = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:44:0x0147  */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        String str = null;
        FragmentActivity fragmentActivity = this.Y;
        switch (b) {
            case 0:
                int i = MainActivity.y1;
                MainActivity mainActivity = this.Y;
                return new dw7(null, new yn1(2, mainActivity, MainActivity.class, "onConfigSelected", "onConfigSelected-jqnfO9s(Ljava/lang/String;Ljava/lang/String;)V", 0, (byte) 6), null, null, new uj4(mainActivity, (byte) 0), new d0(1, mainActivity, MainActivity.class, "onChangeExpanded", "onChangeExpanded-qwfqlqI(Ljava/lang/String;)V", 0, (byte) 24), new sb(mainActivity, (byte) 3), 27);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                b6 b6Var = fragmentActivity.Q0;
                if (b6Var != null) {
                    return new ck4(b6Var);
                }
                dh3.T("binding");
                throw null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                int i2 = MainActivity.y1;
                Object systemService = fragmentActivity.getSystemService("connectivity");
                systemService.getClass();
                return (ConnectivityManager) systemService;
            case 3:
                int i3 = MainActivity.y1;
                try {
                    ss8 ss8Var = ss8.a;
                    String language = ss8.n().getLanguage();
                    Map map = FaqSettingsActivity.R0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (dh3.f(entry.getKey(), language)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) ((Map.Entry) it.next()).getValue();
                        if (str2 != null) {
                            str = str2;
                            if (str == null) {
                                str = "https://www.happ.su/main/faq";
                            }
                            fragmentActivity.startActivity(new Intent((Context) fragmentActivity, (Class<?>) WebViewActivity.class).putExtra("urlInIntent", str));
                            return dn8Var;
                        }
                    }
                    if (str == null) {
                        str = "https://www.happ.su/main/faq";
                    }
                    fragmentActivity.startActivity(new Intent((Context) fragmentActivity, (Class<?>) WebViewActivity.class).putExtra("urlInIntent", str));
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
                return dn8Var;
            case 4:
                int i4 = MainActivity.y1;
                int i5 = e46.fragment_container_view;
                ml2 ml2VarN = fragmentActivity.n();
                ku0 ku0Var = new ku0();
                ku0Var.V();
                r00 r00Var = new r00(ml2VarN);
                r00Var.o = true;
                r00Var.g(i5, ku0Var, (String) null, 1);
                r00Var.e();
                return dn8Var;
            case 5:
                int i6 = MainActivity.y1;
                fragmentActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", fragmentActivity.getPackageName(), null)).addFlags(268435456));
                return dn8Var;
            case 6:
                int i7 = MainActivity.y1;
                return new yj4(fragmentActivity);
            case 7:
                int i8 = MainActivity.y1;
                ss8 ss8Var2 = ss8.a;
                ss8.B(fragmentActivity, "https://www.happ.su/main/ru/vacancies");
                return dn8Var;
            case 8:
                int i9 = MainActivity.y1;
                ((MMKV) pz7.a.getValue()).putBoolean("pref_tv_ui", true);
                fragmentActivity.y();
                return dn8Var;
            case 9:
                b6 b6Var2 = fragmentActivity.Q0;
                if (b6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                tf7 tf7Var = new tf7(b6Var2.A0, tf7.p);
                uf7 uf7Var = new uf7();
                uf7Var.i = 0.0d;
                uf7Var.a(0.75f);
                uf7Var.b(150.0f);
                tf7Var.m = uf7Var;
                return tf7Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                int i10 = MainActivity.y1;
                fragmentActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", fragmentActivity.getPackageName(), null)).addFlags(268435456));
                return dn8Var;
            case 11:
                int i11 = MainActivity.y1;
                fragmentActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", fragmentActivity.getPackageName(), null)).addFlags(268435456));
                return dn8Var;
            case 12:
                int i12 = MainActivity.y1;
                return new vj4(fragmentActivity);
            default:
                int i13 = MainActivity.y1;
                Context applicationContext = fragmentActivity.getApplicationContext();
                applicationContext.getClass();
                return new ak7(applicationContext);
        }
    }
}
