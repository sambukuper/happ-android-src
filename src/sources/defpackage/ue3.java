package defpackage;

import android.animation.AnimatorSet;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.provider.Settings;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.sentry.c2;
import j$.time.Instant;
import j$.util.DesugarDate;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.function.DoubleUnaryOperator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ue3 {
    public static Context a;
    public static Boolean b;

    public static synchronized boolean A(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (zc1.T()) {
            boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            b = boolValueOf;
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                boolValueOf = Boolean.TRUE;
                b = boolValueOf;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                b = boolValueOf;
            }
        }
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean B(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void C(CameraCaptureSession cameraCaptureSession, tv tvVar) {
        Iterator it = ((List) tvVar.a).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    public static final void D(ta taVar, SparseArray sparseArray) {
        xz xzVar = taVar.b;
        if (xzVar.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueA = c42.a(sparseArray.get(iKeyAt));
            if (autofillValueA.isText()) {
                autofillValueA.getTextValue().toString();
                if (xzVar.a.get(Integer.valueOf(iKeyAt)) != null) {
                    c2.m();
                    return;
                }
            } else {
                if (autofillValueA.isDate()) {
                    throw new g65("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueA.isList()) {
                    throw new g65("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueA.isToggle()) {
                    throw new g65("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final boolean E(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().canRequestPackageInstalls();
        }
        return Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1;
    }

    public static void F(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static Intent G(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent H(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    public static final Intent I(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Integer num) {
        context.getClass();
        broadcastReceiver.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, num != null ? num.intValue() : 4);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void J(Throwable th) {
        if ((th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof ClassCircularityError) || (th instanceof ClassFormatError) || (th instanceof IncompatibleClassChangeError) || (th instanceof BootstrapMethodError) || (th instanceof VerifyError)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            u52.q(th);
        }
    }

    public static void K(AnimatorSet animatorSet) {
        animatorSet.getClass();
        animatorSet.reverse();
    }

    public static void L(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            u3.B(activity);
        } else {
            activity.send();
        }
    }

    public static void M(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void N(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void O(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void P(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void Q(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void R(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void S(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void T(AnimatorSet animatorSet, long j) {
        animatorSet.getClass();
        animatorSet.setCurrentPlayTime(j);
    }

    public static void U(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static void V(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void W(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        if (Build.VERSION.SDK_INT >= 26 || !z2 || z) {
            checkableImageButton.setLongClickable(z);
        }
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void X(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void Y(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void Z(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }

    public static final void a(OutputConfiguration outputConfiguration, Surface surface) {
        surface.getClass();
        outputConfiguration.addSurface(surface);
    }

    public static final void a0(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void b0(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static final Bitmap c(je jeVar) {
        if (jeVar instanceof je) {
            return jeVar.a;
        }
        u52.k("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static void c0(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static boolean d(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static void d0(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static boolean e(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static void e0(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static boolean f(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static void f0(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static boolean g(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static void g0(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static boolean h(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static void h0(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static ImageView.ScaleType i(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x0241  */
    /* JADX WARN: Code duplicated, block: B:196:0x033c A[PHI: r13
  0x033c: PHI (r13v15 long) = (r13v12 long), (r13v13 long) binds: [B:195:0x033a, B:198:0x0345] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae A[PHI: r8
  0x00ae: PHI (r8v24 java.lang.String) = (r8v6 java.lang.String), (r8v8 java.lang.String), (r8v10 java.lang.String) binds: [B:48:0x00ac, B:51:0x00bc, B:53:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    public static String i0(int i, long j) {
        Object rj6Var;
        nd4 nd4Var;
        int iIndexOf;
        int i2;
        qa8 jl3Var;
        boolean z = (i & 1) == 0;
        try {
            xc2 xc2Var = pa8.b;
            rj6Var = c18.b();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Object obj = pa8.b;
        if (rj6Var instanceof rj6) {
            rj6Var = obj;
        }
        pa8 pa8Var = (pa8) rj6Var;
        boolean z2 = (i & 4) != 0;
        pa8Var.getClass();
        ss8 ss8Var = ss8.a;
        Locale localeN = ss8.n();
        String language = localeN.getLanguage();
        if (!dh3.f(language, "fa")) {
            if (dh3.f(language, "zh")) {
                ld4.Companion.getClass();
                md4 md4Var = new md4(new ps((byte) 0));
                String strConcat = _UrlKt.FRAGMENT_ENCODE_SET;
                if (z2) {
                    if (z) {
                        strConcat = ":ss";
                    }
                    strConcat = " HH:mm".concat(strConcat);
                }
                vm8.a(md4Var, "yyyy-MM-dd".concat(strConcat));
                nd4Var = new nd4(md4Var.build());
            } else {
                ld4.Companion.getClass();
                md4 md4Var2 = new md4(new ps((byte) 0));
                String strConcat2 = _UrlKt.FRAGMENT_ENCODE_SET;
                if (z2) {
                    if (z) {
                        strConcat2 = ":ss";
                    }
                    strConcat2 = " HH:mm".concat(strConcat2);
                }
                vm8.a(md4Var2, "dd.MM.yyyy".concat(strConcat2));
                nd4Var = new nd4(md4Var2.build());
            }
            te3 te3Var = te3.Z;
            return nd4Var.a(v18.d(km4.E(j), pa8Var));
        }
        te3 te3Var2 = te3.Z;
        te3 te3VarE = km4.E(j);
        te3VarE.getClass();
        Instant instantOfEpochSecond = Instant.ofEpochSecond(te3VarE.X, te3VarE.Y);
        instantOfEpochSecond.getClass();
        Date dateFrom = DesugarDate.from(instantOfEpochSecond);
        qa8 qa8Var = qa8.f0;
        if (qa8Var == null) {
            synchronized (TimeZone.class) {
                synchronized (qa8.class) {
                    try {
                        jl3Var = qa8.f0;
                        if (jl3Var == null) {
                            jl3Var = qa8.g0 ? new jl3(TimeZone.getDefault(), null) : qa8.c(TimeZone.getDefault().getID());
                            qa8.f0 = jl3Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            qa8Var = jl3Var;
        }
        qa8 qa8VarA = qa8Var.a();
        sk8 sk8VarD = sk8.d();
        il5 il5Var = new il5();
        il5Var.j0 = qa8VarA;
        String strH = sk8.h(sk8VarD, "rg");
        if (strH == null) {
            strH = sk8VarD.b().c;
            if (strH.length() == 0 && (strH = sk8.h(sk8VarD, "sd")) == null) {
                String str = sk8VarD.Y;
                fe4 fe4Var = new fe4(str);
                fe4Var.m();
                fe4Var.j();
                fe4Var.c.substring(0);
                fe4Var.m();
                if (fe4Var.e()) {
                    fe4Var.b = 2;
                }
                while (!fe4.f(fe4Var.g())) {
                }
                fe4Var.b--;
                String strSubstring = fe4Var.c.substring(fe4Var.k());
                fe4Var.m();
                if (fe4Var.e()) {
                    fe4Var.b = 2;
                }
                while (!fe4.f(fe4Var.g())) {
                }
                fe4Var.b--;
                fe4Var.n();
                String strSubstring2 = fe4Var.c.substring(fe4Var.i());
                strSubstring.equals("Zzzz");
                strSubstring2.equals("ZZ");
                String strD = fe4Var.d();
                if (sk8.i(strD)) {
                    iIndexOf = str.indexOf(64);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                } else {
                    iIndexOf = str.indexOf(strD);
                    if (iIndexOf > 0) {
                        iIndexOf--;
                    }
                }
                String strSubstring3 = iIndexOf < str.length() ? str.substring(iIndexOf) : null;
                r94 r94Var = r94.i;
                String str2 = sk8VarD.b().a;
                String str3 = sk8VarD.b().b;
                String str4 = sk8VarD.b().c;
                sk8 sk8Var = new sk8();
                sk8Var.Y = sk8.g(sk8.j(str2, str3, str4, _UrlKt.FRAGMENT_ENCODE_SET));
                d24 d24VarA = r94Var.a(sk8Var);
                String str5 = d24VarA.a;
                String str6 = d24VarA.b;
                String str7 = d24VarA.c;
                StringBuilder sb = new StringBuilder();
                if (sk8.i(str5)) {
                    sk8.a(sb, "und");
                } else {
                    sk8.a(sb, str5);
                }
                if (!sk8.i(str6)) {
                    sk8.a(sb, str6);
                }
                if (!sk8.i(str7)) {
                    sk8.a(sb, str7);
                }
                if (strSubstring3 != null && strSubstring3.length() > 1) {
                    char c = strSubstring3.charAt(0) == '_' ? strSubstring3.charAt(1) == '_' ? (char) 2 : (char) 0 : (char) 1;
                    if (sk8.i(str7)) {
                        if (c == 1) {
                            sb.append('_');
                        }
                        sb.append(strSubstring3);
                    } else if (c == 2) {
                        sb.append(strSubstring3.substring(1));
                    } else {
                        sb.append(strSubstring3);
                    }
                }
                strH = new sk8(sb.toString()).b().c;
            }
        }
        if (strH.length() == 0) {
            strH = "001";
        }
        xc0 xc0Var = (xc0) zc0.n0.v0(strH, strH);
        int i3 = xc0Var.a;
        if (il5Var.k0 != i3) {
            if (i3 < 1 || i3 > 7) {
                bt.q("Invalid day of week");
                return 0;
            }
            il5Var.k0 = i3;
            il5Var.g0 = false;
        }
        int i4 = xc0Var.b;
        if (i4 < 1) {
            i4 = 1;
        } else if (i4 > 7) {
            i4 = 7;
        }
        if (il5Var.l0 != i4) {
            il5Var.l0 = i4;
            il5Var.g0 = false;
        }
        String strE = sk8VarD.e("fw");
        if (strE != null) {
            switch (strE) {
                case "fri":
                    i2 = 6;
                    break;
                case "mon":
                    i2 = 2;
                    break;
                case "sat":
                    i2 = 7;
                    break;
                case "sun":
                    i2 = 1;
                    break;
                case "thu":
                    i2 = 5;
                    break;
                case "tue":
                    i2 = 3;
                    break;
                case "wed":
                    i2 = 4;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            if (i2 != -1 && il5Var.k0 != i2) {
                if (i2 < 1) {
                    bt.q("Invalid day of week");
                    return r9;
                }
                il5Var.k0 = i2;
                il5Var.g0 = false;
            }
        }
        if (sk8VarD.b().d.length() != 0 || sk8VarD.f() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sk8VarD.b().a);
            String str8 = sk8VarD.b().b;
            if (str8.length() > 0) {
                sb2.append("_");
                sb2.append(str8);
            }
            String str9 = sk8VarD.b().c;
            if (str9.length() > 0) {
                sb2.append("_");
                sb2.append(str9);
            }
            String strE2 = sk8VarD.e("calendar");
            if (strE2 != null) {
                sb2.append("@calendar=");
                sb2.append(strE2);
            }
            new sk8(sb2.toString());
        }
        il5Var.X = new int[24];
        il5Var.Y = new byte[24];
        int i5 = 13107303;
        for (int i6 = 24; i6 < il5Var.X.length; i6++) {
            i5 |= 1 << i6;
        }
        il5Var.m0 = i5;
        long time = dateFrom.getTime();
        long j2 = 183882168921600000L;
        if (time > 183882168921600000L) {
            time = j2;
        } else {
            j2 = -184303902528000000L;
            if (time < -184303902528000000L) {
                time = j2;
            }
        }
        il5Var.Z = time;
        il5Var.h0 = false;
        il5Var.g0 = false;
        il5Var.i0 = true;
        il5Var.f0 = true;
        Arrays.fill(il5Var.X, 0);
        Arrays.fill(il5Var.Y, (byte) 0);
        return String.format(localeN, "%d.%d.%d ".concat(z2 ? " %d:%d".concat(z ? ":%d" : _UrlKt.FRAGMENT_ENCODE_SET) : _UrlKt.FRAGMENT_ENCODE_SET), Arrays.copyOf(new Object[]{Integer.valueOf(il5Var.c(5)), Integer.valueOf(il5Var.c(2) + 1), Integer.valueOf(il5Var.c(1)), Integer.valueOf(il5Var.c(11)), Integer.valueOf(il5Var.c(12)), Integer.valueOf(il5Var.c(13))}, 6));
    }

    public static final Bitmap j(int i, int i2, int i3, lw0 lw0Var) {
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace colorSpaceF;
        ColorSpace colorSpaceW;
        ColorSpace colorSpace;
        Bitmap.Config configJ0 = j0(i3);
        if (dh3.f(lw0Var, nw0.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (dh3.f(lw0Var, nw0.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (dh3.f(lw0Var, nw0.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (dh3.f(lw0Var, nw0.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (dh3.f(lw0Var, nw0.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (dh3.f(lw0Var, nw0.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (dh3.f(lw0Var, nw0.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (dh3.f(lw0Var, nw0.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (dh3.f(lw0Var, nw0.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (dh3.f(lw0Var, nw0.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (dh3.f(lw0Var, nw0.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (dh3.f(lw0Var, nw0.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (dh3.f(lw0Var, nw0.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (dh3.f(lw0Var, nw0.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!dh3.f(lw0Var, nw0.p)) {
                if (dh3.f(lw0Var, nw0.n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 34 && (colorSpaceW = u3.w(lw0Var)) != null) {
                        rgb2 = colorSpaceW;
                    } else if (i4 < 36 || (colorSpaceF = d4.f(lw0Var)) == null) {
                        if (lw0Var instanceof wk6) {
                            String str = lw0Var.a;
                            wk6 wk6Var = (wk6) lw0Var;
                            float[] fArrA = wk6Var.d.a();
                            fd8 fd8Var = wk6Var.g;
                            ColorSpace.Rgb.TransferParameters transferParameters = fd8Var != null ? new ColorSpace.Rgb.TransferParameters(fd8Var.b, fd8Var.c, fd8Var.d, fd8Var.e, fd8Var.f, fd8Var.g, fd8Var.a) : null;
                            float[] fArr = wk6Var.i;
                            final byte b2 = 0;
                            if (transferParameters != null) {
                                dn.d();
                                ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, wk6Var.h, fArrA, transferParameters);
                                if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                                    rgb2 = rgb3;
                                } else {
                                    dn.d();
                                    rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                            } else {
                                dn.d();
                                float[] fArr2 = wk6Var.h;
                                final vk6 vk6Var = wk6Var.l;
                                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: mw0
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b3 = b2;
                                        gn2 gn2Var = vk6Var;
                                        switch (b3) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) gn2Var.B(Double.valueOf(d))).doubleValue();
                                    }
                                };
                                final vk6 vk6Var2 = wk6Var.o;
                                final byte b3 = 1;
                                rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: mw0
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b4 = b3;
                                        gn2 gn2Var = vk6Var2;
                                        switch (b4) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) gn2Var.B(Double.valueOf(d))).doubleValue();
                                    }
                                }, wk6Var.e, wk6Var.f);
                            }
                        } else {
                            configJ0 = configJ0;
                            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        rgb2 = rgb;
                    } else {
                        rgb2 = colorSpaceF;
                    }
                    configJ0 = configJ0;
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configJ0, true, rgb2);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb2 = colorSpace;
        configJ0 = configJ0;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configJ0, true, rgb2);
    }

    public static final Bitmap.Config j0(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i != 3) {
            return (i2 < 26 || i != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static Notification.Builder k(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static final int k0(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }

    public static final yd l(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new yd(AutofillValue.forToggle(z));
        }
        return null;
    }

    public static final void l0(fg0 fg0Var, y53 y53Var) {
        k05 k05Var = fg0Var.Y;
        if (((ImageCapturePixelHDRPlusQuirk) um1.a().b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        zx zxVar = y53.Y;
        if (y53Var.h(zxVar)) {
            int iIntValue = ((Integer) y53Var.d(zxVar)).intValue();
            if (iIntValue == 0) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                key.getClass();
                k05Var.o(w45.B(key), Boolean.TRUE);
                return;
            }
            if (iIntValue != 1) {
                return;
            }
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
            key2.getClass();
            k05Var.o(w45.B(key2), Boolean.FALSE);
        }
    }

    public static final yd m(h48 h48Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new yd(AutofillValue.forText(w45.W(h48Var)));
        }
        return null;
    }

    public static void m0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            checkableImageButton.setTooltipText(charSequence);
        } else if (onLongClickListener == null) {
            a38.f(checkableImageButton, charSequence);
        }
    }

    public static void n(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static Icon o(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static final void p(OutputConfiguration outputConfiguration) {
        outputConfiguration.enableSurfaceSharing();
    }

    public static final void q(CameraCaptureSession cameraCaptureSession, ArrayList arrayList) throws CameraAccessException {
        cameraCaptureSession.finalizeOutputConfigurations(arrayList);
    }

    public static void r(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static final int s(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
                }
                return height * i;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static AutofillId t(View view) {
        return view.getAutofillId();
    }

    public static AutofillValue u(String str) {
        return AutofillValue.forText(w45.W(str));
    }

    public static AutofillValue v(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static final String w(Context context, int i, Object... objArr) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        ss8 ss8Var = ss8.a;
        configuration.setLocale(ss8.n());
        String string = context.createConfigurationContext(configuration).getString(i, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    public static TextClassifier x(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public static final boolean y(Context context) {
        context.getClass();
        if (pz7.a()) {
            return true;
        }
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        return ((UiModeManager) systemService).getCurrentModeType() == 4;
    }

    public static final boolean z(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }
}
