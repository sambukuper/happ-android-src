package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u89 {
    public static final l97 a = new l97(0);
    public static Locale b;

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(f56.common_google_play_services_install_title);
            case 2:
                return resources.getString(f56.common_google_play_services_update_title);
            case 3:
                return resources.getString(f56.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                return e(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return null;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                new StringBuilder(String.valueOf(i).length() + 22);
                return null;
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String strC = c(context);
        if (i == 1) {
            return resources.getString(f56.common_google_play_services_install_text, strC);
        }
        if (i == 2) {
            return jm4.O(context) ? resources.getString(f56.common_google_play_services_wear_update_text) : resources.getString(f56.common_google_play_services_update_text, strC);
        }
        if (i == 3) {
            return resources.getString(f56.common_google_play_services_enable_text, strC);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strC);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", strC);
        }
        if (i == 9) {
            return resources.getString(f56.common_google_play_services_unsupported_text, strC);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strC);
        }
        switch (i) {
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return d(context, "common_google_play_services_api_unavailable_text", strC);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", strC);
            case 18:
                return resources.getString(f56.common_google_play_services_updating_text, strC);
            default:
                return resources.getString(g56.common_google_play_services_unknown_issue, strC);
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = n59.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(g56.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        l97 l97Var = a;
        synchronized (l97Var) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(b)) {
                    l97Var.clear();
                    b = locale;
                }
                String str2 = (String) l97Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = ss2.c;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        new StringBuilder(str.length() + 18);
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            l97Var.put(str, string);
                            return string;
                        }
                        new StringBuilder(str.length() + 20);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
