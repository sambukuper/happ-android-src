package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.android.core.n0;
import io.sentry.s5;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final Charset g = Charset.forName("UTF-8");
    public final Context a;
    public final n0 b;
    public final ILogger c;
    public final String[] d;
    public final String[] e;
    public final Runtime f;

    public l(Context context, ILogger iLogger, n0 n0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.a = context;
        io.sentry.util.b.s(n0Var, "The BuildInfoProvider is required.");
        this.b = n0Var;
        io.sentry.util.b.s(iLogger, "The Logger is required.");
        this.c = iLogger;
        this.d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.util.b.s(runtime, "The Runtime is required.");
        this.f = runtime;
    }

    /* JADX INFO: Removed unreachable split cross block B:64:0x00c1 */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    public final boolean a() {
        boolean z;
        this.b.getClass();
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = this.d;
        int length = strArr.length;
        int i = 0;
        while (true) {
            ILogger iLogger = this.c;
            if (i < length) {
                String str2 = strArr[i];
                try {
                    if (new File(str2).exists()) {
                        return true;
                    }
                    i++;
                } catch (RuntimeException e) {
                    iLogger.d(s5.ERROR, e, "Error when trying to check if root file %s exists.", str2);
                }
            } else {
                Process process = null;
                try {
                    try {
                        try {
                            Process processExec = this.f.exec(new String[]{"/system/xbin/which", "su"});
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), g));
                            try {
                                z = bufferedReader.readLine() != null;
                                bufferedReader.close();
                                processExec.destroy();
                                if (z) {
                                    return true;
                                }
                                io.sentry.util.b.s(iLogger, "The ILogger object is required.");
                                PackageManager packageManager = this.a.getPackageManager();
                                if (packageManager != null) {
                                    for (String str3 : this.e) {
                                        try {
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                packageManager.getPackageInfo(str3, PackageManager.PackageInfoFlags.of(0L));
                                                return true;
                                            }
                                            packageManager.getPackageInfo(str3, 0);
                                            return true;
                                        } catch (PackageManager.NameNotFoundException unused) {
                                        }
                                    }
                                }
                                return false;
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            iLogger.h(s5.DEBUG, "SU isn't found on this Device.", new Object[0]);
                            if (0 != 0) {
                                process.destroy();
                            }
                            z = false;
                        }
                    } catch (Throwable th3) {
                        iLogger.e(s5.DEBUG, "Error when trying to check if SU exists.", th3);
                        if (0 != 0) {
                            process.destroy();
                        }
                        z = false;
                    }
                } catch (Throwable th4) {
                    if (0 != 0) {
                        process.destroy();
                    }
                    throw th4;
                }
            }
        }
    }
}
