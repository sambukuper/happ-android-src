package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 {
    public static final be b = new be((byte) 5);
    public static volatile b50 c;
    public final List a = i21.L("com.htc.pitroad", "com.huawei.systemmanager", "com.letv.android.letvsafe", "com.meizu.safe", "com.coloros.oppoguardelf", "com.samsung.android.lool", "com.miui.powerkeeper", "com.zte.heartyservice");

    public static boolean a(HappApplication happApplication, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!c4.f(happApplication, (Intent) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static Intent b(String str, boolean z, String str2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        if (z) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public static Intent c(String str, boolean z) {
        Intent intent = new Intent();
        intent.setAction(str);
        if (z) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public static boolean d(HappApplication happApplication, boolean z, boolean z2) {
        try {
            String str = Build.BRAND;
            str.getClass();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.equals("htc")) {
                return e(happApplication, i21.K("com.htc.pitroad"), i21.K(b("com.htc.pitroad", z2, "com.htc.pitroad.landingpage.activity.LandingPageActivity")), z);
            }
            if (lowerCase.equals("huawei")) {
                List listK = i21.K(c("huawei.intent.action.HSM_PROTECTED_APPS", z2));
                return z ? j(happApplication, listK) : a(happApplication, listK);
            }
            boolean zEquals = true;
            if (lowerCase.equals("meizu")) {
                if (!e(happApplication, i21.K("com.meizu.safe"), i21.K(b("com.meizu.safe", z2, "com.meizu.safe.powerui.PowerAppPermissionActivity")), z)) {
                    List listK2 = i21.K(c("com.meizu.power.PowerAppKilledNotification", z2));
                    if (!(z ? j(happApplication, listK2) : a(happApplication, listK2))) {
                        return false;
                    }
                }
                return true;
            }
            if (lowerCase.equals("oppo")) {
                return g(happApplication, z, z2);
            }
            if (lowerCase.equals("samsung")) {
                return h(happApplication, z, z2);
            }
            if (!(lowerCase.equals("xiaomi") ? true : lowerCase.equals("poco"))) {
                zEquals = lowerCase.equals("redmi");
            }
            if (zEquals) {
                return i(happApplication, z, z2);
            }
            if (lowerCase.equals("zte")) {
                return e(happApplication, i21.K("com.zte.heartyservice"), i21.K(b("com.zte.heartyservice", z2, "com.zte.heartyservice.setting.ClearAppSettingsActivity")), z);
            }
            return lowerCase.equals("letv") ? e(happApplication, i21.K("com.letv.android.letvsafe"), i21.K(b("com.letv.android.letvsafe", z2, "com.letv.android.letvsafe.BackgroundAppManageActivity")), z) : f(happApplication, z, z2);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(HappApplication happApplication, List list, List list2, boolean z) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List<ApplicationInfo> installedApplications = happApplication.getPackageManager().getInstalledApplications(0);
                installedApplications.getClass();
                Iterator<ApplicationInfo> it2 = installedApplications.iterator();
                while (it2.hasNext()) {
                    if (dh3.f(it2.next().packageName, str)) {
                        return z ? j(happApplication, list2) : a(happApplication, list2);
                    }
                }
            }
        }
        return false;
    }

    public static boolean f(HappApplication happApplication, boolean z, boolean z2) {
        Intent intentC;
        Object systemService = happApplication.getSystemService("power");
        systemService.getClass();
        if (((PowerManager) systemService).isIgnoringBatteryOptimizations(happApplication.getPackageName())) {
            intentC = null;
        } else {
            intentC = c("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", z2);
            intentC.setData(Uri.parse("package:" + happApplication.getPackageName()));
        }
        if (intentC == null) {
            return false;
        }
        List listK = i21.K(intentC);
        return z ? j(happApplication, listK) : a(happApplication, listK);
    }

    public static boolean g(HappApplication happApplication, boolean z, boolean z2) {
        if (e(happApplication, i21.K("com.coloros.oppoguardelf"), i21.L(b("com.coloros.oppoguardelf", z2, "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"), b("com.coloros.oppoguardelf", z2, "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity")), z)) {
            return true;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + happApplication.getPackageName()));
            if (!z) {
                return !c4.f(happApplication, intent).isEmpty();
            }
            happApplication.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean h(HappApplication happApplication, boolean z, boolean z2) {
        List listK = i21.K(c("com.samsung.android.sm.ACTION_BATTERY", z2));
        return (z ? j(happApplication, listK) : a(happApplication, listK)) || e(happApplication, i21.L("com.samsung.android.lool", "com.samsung.android.sm_cn"), i21.L(b("com.samsung.android.lool", z2, "com.samsung.android.sm.ui.battery.BatteryActivity"), b("com.samsung.android.lool", z2, "com.samsung.android.sm.ui.battery.BatteryActivity")), z);
    }

    public static boolean i(HappApplication happApplication, boolean z, boolean z2) {
        String string;
        List listK = i21.K("com.miui.powerkeeper");
        qg5 qg5Var = new qg5("package_name", happApplication.getPackageName());
        ApplicationInfo applicationInfo = happApplication.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = happApplication.getString(i);
            string.getClass();
        }
        Map mapJ = zp4.J(qg5Var, new qg5("package_label", string));
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"));
        if (z2) {
            intent.addFlags(268435456);
        }
        for (Map.Entry entry : mapJ.entrySet()) {
            intent.putExtra((String) entry.getKey(), (String) entry.getValue());
        }
        return e(happApplication, listK, i21.K(intent), z);
    }

    public static boolean j(HappApplication happApplication, List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Intent intent = (Intent) it.next();
            if (!c4.f(happApplication, intent).isEmpty()) {
                try {
                    happApplication.startActivity(intent);
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
