package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import defpackage.h70;
import defpackage.rl6;
import io.sentry.ILogger;
import io.sentry.s5;
import io.sentry.s6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final Context a;
    public final SentryAndroidOptions b;
    public final n0 c;
    public final Boolean d;
    public final rl6 e;
    public final h70 f;
    public final io.sentry.protocol.q g;
    public final Long h;

    public r0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        rl6 rl6Var;
        h70 h70Var;
        Bundle bundle;
        this.a = context;
        this.b = sentryAndroidOptions;
        this.c = new n0(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.g.c.a();
        io.sentry.protocol.q qVar = new io.sentry.protocol.q();
        qVar.X = "Android";
        qVar.Y = Build.VERSION.RELEASE;
        qVar.f0 = Build.DISPLAY;
        ILogger logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    property = line;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                logger.e(s5.ERROR, "Exception while attempting to read kernel information", e);
            }
        }
        if (property != null) {
            qVar.g0 = property;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            qVar.h0 = Boolean.valueOf(new io.sentry.android.core.internal.util.l(this.a, sentryAndroidOptions.getLogger(), this.c).a());
        }
        this.g = qVar;
        this.d = this.c.b();
        ILogger logger2 = sentryAndroidOptions.getLogger();
        boolean z = false;
        try {
            PackageInfo packageInfoD = m0.d(context, this.c);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoD == null || packageManager == null) {
                rl6Var = null;
            } else {
                str = packageInfoD.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    rl6Var = new rl6(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    logger2.h(s5.DEBUG, "%s package isn't installed.", str);
                    rl6Var = null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        this.e = rl6Var;
        n0 n0Var = this.c;
        n0Var.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) m0.d.a(context) : (ApplicationInfo) m0.e.a(context);
        PackageInfo packageInfoD2 = m0.d(context, n0Var);
        if (packageInfoD2 != null) {
            String[] strArr = packageInfoD2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z = bundle.getBoolean("com.android.vending.splits.required");
            }
            h70Var = new h70(z, (Object) strArr, (byte) 11);
        } else {
            h70Var = null;
        }
        this.f = h70Var;
        ActivityManager.MemoryInfo memoryInfoB = m0.b(context, sentryAndroidOptions.getLogger());
        if (memoryInfoB != null) {
            this.h = Long.valueOf(memoryInfoB.totalMem);
        } else {
            this.h = null;
        }
    }

    public static Float b(Intent intent, s6 s6Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            s6Var.getLogger().e(s5.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static Boolean c(Intent intent, s6 s6Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            s6Var.getLogger().e(s5.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:103:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0253 A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0258  */
    /* JADX WARN: Code duplicated, block: B:108:0x025d A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0261  */
    /* JADX WARN: Code duplicated, block: B:111:0x0262  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278 A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[Catch: all -> 0x0292, TRY_LEAVE, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:124:0x029f  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0193  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8 A[Catch: all -> 0x01b1, TRY_LEAVE, TryCatch #1 {all -> 0x01b1, blocks: (B:68:0x019f, B:70:0x01a8), top: B:142:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da  */
    /* JADX WARN: Code duplicated, block: B:88:0x0200  */
    public final io.sentry.protocol.h a(boolean z, boolean z2) {
        io.sentry.protocol.g gVar;
        Boolean bool;
        ILogger logger;
        DisplayMetrics displayMetrics;
        Date date;
        TimeZone timeZone;
        String strA;
        Locale locale;
        ArrayList arrayListA;
        boolean zIsCollectExternalStorageContext;
        IntentFilter intentFilter;
        Intent intentRegisterReceiver;
        int i;
        Boolean bool2;
        ActivityManager.MemoryInfo memoryInfoB;
        File dataDirectory;
        File externalFilesDir;
        StatFs statFs;
        Long lValueOf;
        File[] externalFilesDirs;
        File file;
        String absolutePath;
        int length;
        int i2;
        Long lValueOf2;
        Long lValueOf3;
        Float fValueOf;
        int intExtra;
        LocaleList locales;
        Locale locale2;
        io.sentry.protocol.g gVar2;
        Context context = this.a;
        io.sentry.protocol.h hVar = new io.sentry.protocol.h();
        hVar.Y = Build.MANUFACTURER;
        hVar.Z = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        hVar.f0 = m0.a(sentryAndroidOptions.getLogger());
        hVar.g0 = Build.MODEL;
        hVar.h0 = Build.ID;
        hVar.i0 = Build.SUPPORTED_ABIS;
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            hVar.J0 = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Long lValueOf4 = null;
        try {
            int i3 = context.getResources().getConfiguration().orientation;
            try {
                try {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            gVar = null;
                        } else {
                            gVar2 = io.sentry.protocol.g.LANDSCAPE;
                        }
                        if (gVar == null) {
                            try {
                                sentryAndroidOptions.getLogger().h(s5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                gVar = null;
                            } catch (Throwable th) {
                                th = th;
                                sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting device orientation.", th);
                            }
                        }
                        hVar.m0 = gVar;
                        bool = this.d;
                        if (bool != null) {
                            hVar.n0 = bool;
                        }
                        logger = sentryAndroidOptions.getLogger();
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            hVar.w0 = Integer.valueOf(displayMetrics.widthPixels);
                            hVar.x0 = Integer.valueOf(displayMetrics.heightPixels);
                            hVar.y0 = Float.valueOf(displayMetrics.density);
                            hVar.z0 = Integer.valueOf(displayMetrics.densityDpi);
                        }
                        date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        hVar.A0 = date;
                        if (Build.VERSION.SDK_INT >= 33) {
                            locales = context.getResources().getConfiguration().getLocales();
                            if (locales.isEmpty()) {
                                timeZone = TimeZone.getDefault();
                            } else {
                                locale2 = locales.get(0);
                                if (locale2.getUnicodeLocaleType("tz") != null) {
                                    timeZone = Calendar.getInstance(locale2).getTimeZone();
                                } else {
                                    timeZone = TimeZone.getDefault();
                                }
                            }
                        } else {
                            timeZone = TimeZone.getDefault();
                        }
                        hVar.B0 = timeZone;
                        if (hVar.C0 == null) {
                            try {
                                strA = x0.a(context);
                            } catch (Throwable th2) {
                                sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting installationId.", th2);
                                strA = null;
                            }
                            hVar.C0 = strA;
                        }
                        locale = Locale.getDefault();
                        if (hVar.D0 == null) {
                            hVar.D0 = locale.toString();
                        }
                        arrayListA = io.sentry.android.core.internal.util.g.c.a();
                        if (!arrayListA.isEmpty()) {
                            hVar.H0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                            hVar.G0 = Integer.valueOf(arrayListA.size());
                        }
                        hVar.o0 = this.h;
                        if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
                            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                            if (Build.VERSION.SDK_INT >= 33) {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                            } else {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                            }
                            if (intentRegisterReceiver != null) {
                                hVar.j0 = b(intentRegisterReceiver, sentryAndroidOptions);
                                hVar.k0 = c(intentRegisterReceiver, sentryAndroidOptions);
                                try {
                                    intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                    if (intExtra != -1) {
                                        fValueOf = Float.valueOf(intExtra / 10.0f);
                                    } else {
                                        fValueOf = null;
                                    }
                                } catch (Throwable th3) {
                                    sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting battery temperature.", th3);
                                }
                                hVar.F0 = fValueOf;
                            }
                            i = q0.a[sentryAndroidOptions.getConnectionStatusProvider().n0().ordinal()];
                            if (i != 1) {
                                bool2 = Boolean.FALSE;
                            } else if (i != 2) {
                                bool2 = null;
                            } else {
                                bool2 = Boolean.TRUE;
                            }
                            hVar.l0 = bool2;
                            memoryInfoB = m0.b(context, sentryAndroidOptions.getLogger());
                            if (memoryInfoB != null && z2) {
                                hVar.p0 = Long.valueOf(memoryInfoB.availMem);
                                hVar.r0 = Boolean.valueOf(memoryInfoB.lowMemory);
                            }
                            dataDirectory = Environment.getDataDirectory();
                            if (dataDirectory != null) {
                                StatFs statFs2 = new StatFs(dataDirectory.getPath());
                                try {
                                    lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th4) {
                                    sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting total internal storage amount.", th4);
                                    lValueOf2 = null;
                                }
                                hVar.s0 = lValueOf2;
                                try {
                                    lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th5) {
                                    sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting unused internal storage amount.", th5);
                                    lValueOf3 = null;
                                }
                                hVar.t0 = lValueOf3;
                            }
                            if (zIsCollectExternalStorageContext) {
                                externalFilesDir = context.getExternalFilesDir(null);
                                try {
                                    externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs != null) {
                                        if (externalFilesDir != null) {
                                            absolutePath = externalFilesDir.getAbsolutePath();
                                        } else {
                                            absolutePath = null;
                                        }
                                        length = externalFilesDirs.length;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                file = externalFilesDirs[i2];
                                                if (file != null) {
                                                    if (absolutePath != null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                                        break;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                i2++;
                                            }
                                        }
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            statFs = null;
                                        }
                                        if (statFs != null) {
                                            try {
                                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th6) {
                                                sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting total external storage amount.", th6);
                                                lValueOf = null;
                                            }
                                            hVar.u0 = lValueOf;
                                            try {
                                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th7) {
                                                sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting unused external storage amount.", th7);
                                            }
                                            hVar.v0 = lValueOf4;
                                        }
                                    } else {
                                        sentryAndroidOptions.getLogger().h(s5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                    }
                                    file = null;
                                    if (file != null) {
                                        statFs = new StatFs(file.getPath());
                                    } else {
                                        statFs = null;
                                    }
                                } catch (Throwable unused) {
                                    sentryAndroidOptions.getLogger().h(s5.INFO, "Not possible to read external files directory", new Object[0]);
                                }
                                if (statFs != null) {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    hVar.u0 = lValueOf;
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    hVar.v0 = lValueOf4;
                                }
                            }
                            if (hVar.E0 == null) {
                                hVar.E0 = sentryAndroidOptions.getConnectionStatusProvider().y();
                            }
                        }
                        return hVar;
                    }
                    gVar2 = io.sentry.protocol.g.PORTRAIT;
                    displayMetrics = context.getResources().getDisplayMetrics();
                } catch (Throwable th8) {
                    logger.e(s5.ERROR, "Error getting DisplayMetrics.", th8);
                    displayMetrics = null;
                }
                date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            } catch (IllegalArgumentException e) {
                sentryAndroidOptions.getLogger().d(s5.ERROR, e, "Error getting the device's boot time.", new Object[0]);
                date = null;
            }
            gVar = gVar2;
            if (gVar == null) {
                sentryAndroidOptions.getLogger().h(s5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                gVar = null;
            }
        } catch (Throwable th9) {
            th = th9;
            gVar = null;
        }
        hVar.m0 = gVar;
        bool = this.d;
        if (bool != null) {
            hVar.n0 = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            hVar.w0 = Integer.valueOf(displayMetrics.widthPixels);
            hVar.x0 = Integer.valueOf(displayMetrics.heightPixels);
            hVar.y0 = Float.valueOf(displayMetrics.density);
            hVar.z0 = Integer.valueOf(displayMetrics.densityDpi);
        }
        hVar.A0 = date;
        if (Build.VERSION.SDK_INT >= 33) {
            locales = context.getResources().getConfiguration().getLocales();
            if (locales.isEmpty()) {
                locale2 = locales.get(0);
                if (locale2.getUnicodeLocaleType("tz") != null) {
                    timeZone = Calendar.getInstance(locale2).getTimeZone();
                } else {
                    timeZone = TimeZone.getDefault();
                }
            } else {
                timeZone = TimeZone.getDefault();
            }
        } else {
            timeZone = TimeZone.getDefault();
        }
        hVar.B0 = timeZone;
        if (hVar.C0 == null) {
            strA = x0.a(context);
            hVar.C0 = strA;
        }
        locale = Locale.getDefault();
        if (hVar.D0 == null) {
            hVar.D0 = locale.toString();
        }
        arrayListA = io.sentry.android.core.internal.util.g.c.a();
        if (!arrayListA.isEmpty()) {
            hVar.H0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
            hVar.G0 = Integer.valueOf(arrayListA.size());
        }
        hVar.o0 = this.h;
        if (z) {
            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
            } else {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
            }
            if (intentRegisterReceiver != null) {
                hVar.j0 = b(intentRegisterReceiver, sentryAndroidOptions);
                hVar.k0 = c(intentRegisterReceiver, sentryAndroidOptions);
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                hVar.F0 = fValueOf;
            }
            i = q0.a[sentryAndroidOptions.getConnectionStatusProvider().n0().ordinal()];
            if (i != 1) {
                bool2 = Boolean.FALSE;
            } else if (i != 2) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            hVar.l0 = bool2;
            memoryInfoB = m0.b(context, sentryAndroidOptions.getLogger());
            if (memoryInfoB != null) {
                hVar.p0 = Long.valueOf(memoryInfoB.availMem);
                hVar.r0 = Boolean.valueOf(memoryInfoB.lowMemory);
            }
            dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                StatFs statFs3 = new StatFs(dataDirectory.getPath());
                lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                hVar.s0 = lValueOf2;
                lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                hVar.t0 = lValueOf3;
            }
            if (zIsCollectExternalStorageContext) {
                externalFilesDir = context.getExternalFilesDir(null);
                externalFilesDirs = context.getExternalFilesDirs(null);
                if (externalFilesDirs != null) {
                    if (externalFilesDir != null) {
                        absolutePath = externalFilesDir.getAbsolutePath();
                    } else {
                        absolutePath = null;
                    }
                    length = externalFilesDirs.length;
                    i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            file = externalFilesDirs[i2];
                            if (file != null) {
                                if (absolutePath != null) {
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    if (file != null) {
                        statFs = new StatFs(file.getPath());
                    } else {
                        statFs = null;
                    }
                    if (statFs != null) {
                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        hVar.u0 = lValueOf;
                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        hVar.v0 = lValueOf4;
                    }
                } else {
                    sentryAndroidOptions.getLogger().h(s5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                }
                file = null;
                if (file != null) {
                    statFs = new StatFs(file.getPath());
                } else {
                    statFs = null;
                }
                if (statFs != null) {
                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                    hVar.u0 = lValueOf;
                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                    hVar.v0 = lValueOf4;
                }
            }
            if (hVar.E0 == null) {
                hVar.E0 = sentryAndroidOptions.getConnectionStatusProvider().y();
            }
        }
        return hVar;
    }
}
