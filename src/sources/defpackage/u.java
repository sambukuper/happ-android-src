package defpackage;

import android.content.Intent;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.feature.about_settings.AboutSettingsActivity;
import su.happ.proxyutility.feature.settings.AboutSettingsFragment;
import su.happ.proxyutility.log_report.LogWorker;
import su.happ.proxyutility.ui.FaqSettingsActivity;
import su.happ.proxyutility.ui.UrlSchemesSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ AboutSettingsFragment Y;

    public /* synthetic */ u(AboutSettingsFragment aboutSettingsFragment, byte b) {
        this.X = b;
        this.Y = aboutSettingsFragment;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        String str = null;
        dn8 dn8Var = dn8.a;
        AboutSettingsFragment aboutSettingsFragment = this.Y;
        switch (b) {
            case 0:
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
                            ss8 ss8Var2 = ss8.a;
                            ss8.B(aboutSettingsFragment.N(), str);
                            return dn8Var;
                        }
                    }
                    if (str == null) {
                        str = "https://www.happ.su/main/faq";
                    }
                    ss8 ss8Var3 = ss8.a;
                    ss8.B(aboutSettingsFragment.N(), str);
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
                return dn8Var;
            case 1:
                aboutSettingsFragment.N().startActivity(new Intent(aboutSettingsFragment.N(), (Class<?>) UrlSchemesSettingsActivity.class));
                return dn8Var;
            case 2:
                aboutSettingsFragment.N().startActivity(new Intent(aboutSettingsFragment.N(), (Class<?>) AboutSettingsActivity.class));
                return dn8Var;
            default:
                pd6 pd6VarC = pd6.c(aboutSettingsFragment.N().getApplicationContext());
                List listSingletonList = Collections.singletonList((fb5) new eb5(LogWorker.class).a());
                RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) pd6VarC;
                x39 x39Var = remoteWorkManagerClient.c;
                x39Var.getClass();
                if (listSingletonList.isEmpty()) {
                    bt.q("beginUniqueWork needs at least one OneTimeWorkRequest.");
                    return null;
                }
                km4.d0(remoteWorkManagerClient.e(new lr5(new l39(x39Var, "Log report", g62.Y, listSingletonList, null), (byte) 7)), RemoteWorkManagerClient.j, remoteWorkManagerClient.d);
                return dn8Var;
        }
    }
}
