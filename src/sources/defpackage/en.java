package defpackage;

import android.R;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class en {
    public static String a = "";
    public static String b;
    public static int c;
    public static Boolean d;

    public static int A(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int B(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int C(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int D(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int E(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params F(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int G(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri H(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean I(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean J(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }

    public static final void K(CameraManager cameraManager, String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException {
        executor.getClass();
        cameraManager.openCamera(str, executor, stateCallback);
    }

    public static boolean L(Handler handler, yl0 yl0Var, long j) {
        return handler.postDelayed(yl0Var, "retry_token", j);
    }

    public static final void M(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        cameraManager.getClass();
        executor.getClass();
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public static byte N(ce4 ce4Var) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(ce4Var.a).getDigitStrings()[0], 0));
    }

    public static int O(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int P(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int Q(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int R(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void S(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static final void T(SessionConfiguration sessionConfiguration, InputConfiguration inputConfiguration) {
        sessionConfiguration.setInputConfiguration(inputConfiguration);
    }

    public static void U(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void V(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void W(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static final void X(OutputConfiguration outputConfiguration, String str) {
        outputConfiguration.setPhysicalCameraId(str);
    }

    public static void Y(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void Z(SessionConfiguration sessionConfiguration, CaptureRequest captureRequest) {
        sessionConfiguration.getClass();
        sessionConfiguration.setSessionParameters(captureRequest);
    }

    public static void a(Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable) {
        byte b2 = 1;
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(drawable);
            menuItemAdd.setOnMenuItemClickListener(new zg(context, textClassification, b2));
            return;
        }
        b2 = i2 != 0 ? (byte) 0 : (byte) 1;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, b2 != 0 ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(b2 == 0 ? 0 : 2);
        if (drawable != null) {
            menuItemAdd2.setIcon(drawable);
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: r88
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                en.b(remoteAction);
                return true;
            }
        });
    }

    public static final void a0(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static final void b(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            u3.B(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static boolean b0(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static final void c(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static boolean c0() {
        Boolean boolValueOf = d;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new gb9(ln7.f("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static Typeface d(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler e(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static final void h(CameraDevice cameraDevice, SessionConfiguration sessionConfiguration) throws CameraAccessException {
        cameraDevice.createCaptureSession(sessionConfiguration);
    }

    public static final NetworkRequest i(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException unused) {
                lh4 lh4VarP0 = lh4.P0();
                int i2 = u35.b;
                int i3 = u35.b;
                lh4VarP0.getClass();
            }
        }
        int[] iArr3 = g33.b;
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr3[i4];
            if (!eu.a0(iArr, i5)) {
                try {
                    builder.removeCapability(i5);
                } catch (IllegalArgumentException unused2) {
                    lh4 lh4VarP1 = lh4.P0();
                    int i6 = u35.b;
                    int i7 = u35.b;
                    lh4VarP1.getClass();
                }
            }
        }
        for (int i8 : iArr2) {
            builder.addTransportType(i8);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return networkRequestBuild;
    }

    public static TextClassifier j(Context context, zz6 zz6Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = zz6Var.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [rj6] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static List k(HappApplication happApplication) {
        ?? rj6Var;
        d02 d02Var = d02.X;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = happApplication.getPackageManager().getPackageInfo(happApplication.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    rj6Var = d02Var;
                } else if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    apkContentsSigners.getClass();
                    rj6Var = new ArrayList(apkContentsSigners.length);
                    for (Signature signature : apkContentsSigners) {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                        messageDigest.update(signature.toByteArray());
                        rj6Var.add(Base64.encodeToString(messageDigest.digest(), 0));
                    }
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    signingCertificateHistory.getClass();
                    rj6Var = new ArrayList(signingCertificateHistory.length);
                    for (Signature signature2 : signingCertificateHistory) {
                        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA");
                        messageDigest2.update(signature2.toByteArray());
                        rj6Var.add(Base64.encodeToString(messageDigest2.digest(), 0));
                    }
                }
            } else {
                Signature[] signatureArr = happApplication.getPackageManager().getPackageInfo(happApplication.getPackageName(), 64).signatures;
                if (signatureArr == null) {
                    rj6Var = d02Var;
                } else {
                    rj6Var = new ArrayList(signatureArr.length);
                    for (Signature signature3 : signatureArr) {
                        MessageDigest messageDigest3 = MessageDigest.getInstance("SHA");
                        messageDigest3.update(signature3.toByteArray());
                        rj6Var.add(Base64.encodeToString(messageDigest3.digest(), 0));
                    }
                }
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        ?? r0 = d02Var;
        if (sj6.a(rj6Var) == null) {
            r0 = rj6Var;
        }
        return (List) r0;
    }

    public static final List l(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final List m(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    public static List n(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String o(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        int i = Build.VERSION.SDK_INT;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        String processName = i >= 28 ? Application.getProcessName() : _UrlKt.FRAGMENT_ENCODE_SET;
        a = processName;
        if (!TextUtils.isEmpty(processName)) {
            return a;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            str = objInvoke instanceof String ? (String) objInvoke : _UrlKt.FRAGMENT_ENCODE_SET;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        a = str;
        if (!TextUtils.isEmpty(str)) {
            return a;
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    str2 = runningAppProcessInfo.processName;
                    break;
                }
            }
        }
        a = str2;
        return str2;
    }

    public static final DisplayCutout p(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            b80.b.getClass();
            return null;
        }
    }

    public static String[] q(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor r(Context context) {
        return context.getMainExecutor();
    }

    public static final int s(OutputConfiguration outputConfiguration) {
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    public static String t() throws Throwable {
        BufferedReader bufferedReader;
        String str = b;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            b = processName;
            return processName;
        }
        int iMyPid = c;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            c = iMyPid;
        }
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        if (iMyPid > 0) {
            try {
                try {
                    StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                    sb.append("/proc/");
                    sb.append(iMyPid);
                    sb.append("/cmdline");
                    String string = sb.toString();
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(string));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        try {
                            String line = bufferedReader.readLine();
                            w45.s(line);
                            strTrim = line.trim();
                        } catch (IOException unused) {
                            if (bufferedReader != null) {
                            }
                            b = strTrim;
                            return strTrim;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
        b = strTrim;
        return strTrim;
    }

    public static Network u(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static final Set v(CameraCharacteristics cameraCharacteristics) {
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        physicalCameraIds.getClass();
        return physicalCameraIds;
    }

    public static final Map w(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraResults();
    }

    public static String x() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int y(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String z(Object obj) {
        return ((Icon) obj).getResPackage();
    }
}
