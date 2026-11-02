package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.dnsoverhttps.DnsOverHttps;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class px {
    public static final ox b = new ox();
    public static final vz7 c = new vz7(nx.Z);
    public final List a = i21.L("com.asus.mobilemanager", "com.miui.securitycenter", "com.letv.android.letvsafe", "com.huawei.systemmanager", "com.coloros.safecenter", "com.oppo.safe", "com.iqoo.secure", "com.vivo.permissionmanager", "com.evenwell.powersaving.g3", "com.huawei.systemmanager", "com.samsung.android.lool", "com.oneplus.security");

    public static boolean a(Context context, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (e(context, (Intent) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context, List list, List list2, boolean z) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
                installedApplications.getClass();
                Iterator<ApplicationInfo> it2 = installedApplications.iterator();
                while (it2.hasNext()) {
                    if (dh3.f(it2.next().packageName, str)) {
                        return z ? f(context, list2) : a(context, list2);
                    }
                }
            }
        }
        return false;
    }

    public static boolean c(px pxVar, Context context, boolean z) {
        String str = Build.BRAND;
        str.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase.equals("asus")) {
            return b(context, i21.K("com.asus.mobilemanager"), i21.L(d("com.asus.mobilemanager", false, "com.asus.mobilemanager.powersaver.PowerSaverSettings"), d("com.asus.mobilemanager", false, "com.asus.mobilemanager.autostart.AutoStartActivity")), z);
        }
        if (lowerCase.equals("xiaomi") ? true : lowerCase.equals("poco") ? true : lowerCase.equals("redmi")) {
            return b(context, i21.K("com.miui.securitycenter"), i21.K(d("com.miui.securitycenter", false, "com.miui.permcenter.autostart.AutoStartManagementActivity")), z);
        }
        if (lowerCase.equals("letv")) {
            return b(context, i21.K("com.letv.android.letvsafe"), i21.K(d("com.letv.android.letvsafe", false, "com.letv.android.letvsafe.AutobootManageActivity")), z);
        }
        if (lowerCase.equals("honor")) {
            return b(context, i21.K("com.huawei.systemmanager"), i21.K(d("com.huawei.systemmanager", false, "com.huawei.systemmanager.optimize.process.ProtectActivity")), z);
        }
        if (lowerCase.equals("huawei")) {
            return b(context, i21.K("com.huawei.systemmanager"), i21.L(d("com.huawei.systemmanager", false, "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"), d("com.huawei.systemmanager", false, "com.huawei.systemmanager.optimize.process.ProtectActivity")), z);
        }
        if (!lowerCase.equals("oppo")) {
            if (lowerCase.equals("vivo")) {
                return b(context, i21.L("com.iqoo.secure", "com.vivo.permissionmanager"), i21.L(d("com.iqoo.secure", false, "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity"), d("com.vivo.permissionmanager", false, "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"), d("com.iqoo.secure", false, "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager")), z);
            }
            if (lowerCase.equals("nokia")) {
                return b(context, i21.K("com.evenwell.powersaving.g3"), i21.K(d("com.evenwell.powersaving.g3", false, "com.evenwell.powersaving.g3.exception.PowerSaverExceptionActivity")), z);
            }
            if (lowerCase.equals("samsung")) {
                return b(context, i21.K("com.samsung.android.lool"), i21.L(d("com.samsung.android.lool", false, "com.samsung.android.sm.ui.battery.BatteryActivity"), d("com.samsung.android.lool", false, "com.samsung.android.sm.battery.ui.usage.CheckableAppListActivity"), d("com.samsung.android.lool", false, "com.samsung.android.sm.battery.ui.BatteryActivity")), z);
            }
            if (lowerCase.equals("oneplus")) {
                if (!b(context, i21.K("com.oneplus.security"), i21.K(d("com.oneplus.security", false, "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity")), z)) {
                    Intent intent = new Intent();
                    intent.setAction("com.android.settings.action.BACKGROUND_OPTIMIZE");
                    List listK = i21.K(intent);
                    if (z ? f(context, listK) : a(context, listK)) {
                    }
                }
            }
            return false;
        }
        if (!b(context, i21.L("com.coloros.safecenter", "com.oppo.safe"), i21.L(d("com.coloros.safecenter", false, "com.coloros.safecenter.permission.startup.StartupAppListActivity"), d("com.oppo.safe", false, "com.oppo.safe.permission.startup.StartupAppListActivity"), d("com.coloros.safecenter", false, "com.coloros.safecenter.startupapp.StartupAppListActivity")), z)) {
            try {
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.setData(Uri.parse("package:" + ((Object) context.getPackageName())));
                if (!z) {
                    return e(context, intent2);
                }
                context.startActivity(intent2);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public static Intent d(String str, boolean z, String str2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        if (z) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public static boolean e(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, DnsOverHttps.MAX_RESPONSE_SIZE);
        listQueryIntentActivities.getClass();
        return !listQueryIntentActivities.isEmpty();
    }

    public static boolean f(Context context, List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Intent intent = (Intent) it.next();
            if (e(context, intent)) {
                try {
                    context.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }
            }
        }
        return false;
    }
}
