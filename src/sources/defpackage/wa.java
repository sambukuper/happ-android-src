package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.graphics.text.MeasuredText;
import android.media.ImageWriter;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsets;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wa {
    public static final void A(Activity activity, yu5.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void B(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void C(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void D(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void E(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static final void F(TextProcessor textProcessor, int i) {
        Object obj;
        Field fieldN;
        Object obj2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i, i});
            gradientDrawable.setSize((int) TypedValue.applyDimension(2, 2.0f, textProcessor.getResources().getDisplayMetrics()), (int) textProcessor.getTextSize());
            textProcessor.setTextCursorDrawable(gradientDrawable);
            return;
        }
        try {
            Field fieldN2 = n(TextView.class, "mEditor");
            Field field = null;
            if (fieldN2 != null) {
                obj2 = fieldN2.get(textProcessor);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = obj2;
                obj = textProcessor;
            }
            Class<?> cls = fieldN2 != null ? obj.getClass() : TextView.class;
            Field fieldN3 = n(TextView.class, "mCursorDrawableRes");
            Object obj3 = fieldN3 != null ? fieldN3.get(textProcessor) : null;
            Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
            if (num != null) {
                Drawable drawable = textProcessor.getContext().getDrawable(num.intValue());
                if (drawable != null) {
                    if (drawable instanceof eu8) {
                        ((eu8) drawable).setTintList(ColorStateList.valueOf(i));
                    } else if (drawable instanceof VectorDrawable) {
                        ((VectorDrawable) drawable).setTintList(ColorStateList.valueOf(i));
                    } else {
                        drawable.setTint(i);
                    }
                    if (i2 >= 28) {
                        fieldN = n(cls, "mDrawableForCursor");
                    }
                    if (field != null) {
                        field = fieldN;
                        field.set(obj, drawable);
                        return;
                    }
                    Field fieldN4 = n(cls, "mCursorDrawable", "mDrawableForCursor");
                    if (fieldN4 == null) {
                        field = fieldN;
                        return;
                    } else {
                        field = fieldN;
                        fieldN4.set(obj, new Drawable[]{drawable, drawable});
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void G(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void H(PopupWindow popupWindow) {
        popupWindow.setIsClippedToScreen(true);
    }

    public static void I(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }

    public static void J(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void K(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            lh4 lh4VarP0 = lh4.P0();
            int i3 = SystemForegroundService.g0;
            lh4VarP0.getClass();
        } catch (SecurityException unused2) {
            lh4 lh4VarP1 = lh4.P0();
            int i4 = SystemForegroundService.g0;
            lh4VarP1.getClass();
        }
    }

    public static final BlendMode L(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final ImageDecoder.Source M(d73 d73Var, pd5 pd5Var, boolean z) {
        oi5 oi5VarG0;
        if (d73Var.getFileSystem() == s92.SYSTEM && (oi5VarG0 = d73Var.G0()) != null) {
            return ImageDecoder.createSource(oi5VarG0.toFile());
        }
        ci8 ci8VarN = d73Var.N();
        if (ci8VarN instanceof su) {
            return ImageDecoder.createSource(pd5Var.a.getAssets(), ((su) ci8VarN).h);
        }
        if ((ci8VarN instanceof u41) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((u41) ci8VarN).h;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new x43(assetFileDescriptor, (byte) 1));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (ci8VarN instanceof sf6) {
            sf6 sf6Var = (sf6) ci8VarN;
            if (sf6Var.h.equals(pd5Var.a.getPackageName())) {
                return ImageDecoder.createSource(pd5Var.a.getResources(), sf6Var.i);
            }
        }
        if (!(ci8VarN instanceof ab0)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((ab0) ci8VarN).h.isDirect()) {
            return ImageDecoder.createSource(((ab0) ci8VarN).h);
        }
        return null;
    }

    public static final PorterDuff.Mode N(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final void O(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(Rect rect, Rect rect2, View view) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    public static void c(Canvas canvas) {
        canvas.disableZ();
    }

    public static void d(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void e(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void f(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void g(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void h(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void i(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void j(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void k(Canvas canvas) {
        canvas.enableZ();
    }

    public static void l(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static void m(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static final Field n(Class cls, String... strArr) {
        for (String str : strArr) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static ColorStateList o(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static ContentCaptureSession p(View view) {
        return view.getContentCaptureSession();
    }

    public static String q(Context context) {
        return context.getOpPackageName();
    }

    public static final void r(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static final long s(AndroidComposeView androidComposeView) {
        return androidComposeView.getUniqueDrawingId();
    }

    public static final ImageWriter t(int i, Surface surface) {
        ImageWriter imageWriterNewInstance = ImageWriter.newInstance(surface, 1, i);
        imageWriterNewInstance.getClass();
        return imageWriterNewInstance;
    }

    public static void u(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (km4.N(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            g28.l(null);
            return;
        }
        z18 z18Var = new z18();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                SharedPreferences.Editor editorEdit = km4.N(context).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                context.getPackageName();
            }
        } finally {
            z18Var.c(null);
        }
    }

    public static boolean v() {
        return Trace.isEnabled();
    }

    public static boolean w() {
        return Trace.isEnabled();
    }

    public static boolean x(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                return "com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate());
            }
            context.getPackageName();
        }
        return false;
    }

    public static Insets y(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void z(Resources.Theme theme) {
        theme.rebase();
    }
}
