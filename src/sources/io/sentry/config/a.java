package io.sentry.config;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Process;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.view.ScrollingView;
import defpackage.b61;
import defpackage.bt;
import defpackage.dh3;
import defpackage.fm7;
import defpackage.g44;
import defpackage.i55;
import defpackage.oi0;
import defpackage.qg5;
import defpackage.s86;
import defpackage.v3;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.i;
import io.sentry.android.replay.h;
import io.sentry.android.replay.l0;
import io.sentry.android.replay.util.l;
import io.sentry.android.replay.viewhierarchy.g;
import io.sentry.android.replay.x;
import io.sentry.android.replay.y;
import io.sentry.protocol.d0;
import io.sentry.protocol.f;
import io.sentry.protocol.i0;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.q3;
import io.sentry.util.o;
import io.sentry.y4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Boolean a;
    public static io.sentry.internal.debugmeta.c b;

    public static String a(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10".concat(str), 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    public static boolean b(y4 y4Var, String str, q3 q3Var, ILogger iLogger) {
        byte b2 = 8;
        byte b3 = 2;
        byte b4 = 0;
        switch (str) {
            case "debug_meta":
                y4Var.p0 = (f) q3Var.y0(iLogger, new io.sentry.clientreport.a(b2));
                return true;
            case "server_name":
                y4Var.m0 = q3Var.K();
                return true;
            case "contexts":
                y4Var.Y.m(io.sentry.clientreport.a.c(q3Var, iLogger));
                return true;
            case "environment":
                y4Var.i0 = q3Var.K();
                return true;
            case "breadcrumbs":
                y4Var.o0 = q3Var.M0(iLogger, new io.sentry.f(b4));
                return true;
            case "sdk":
                y4Var.Z = (u) q3Var.y0(iLogger, new io.sentry.clientreport.a((byte) 21));
                return true;
            case "dist":
                y4Var.n0 = q3Var.K();
                return true;
            case "tags":
                y4Var.g0 = io.sentry.util.b.p((Map) q3Var.E0());
                return true;
            case "user":
                y4Var.k0 = (i0) q3Var.y0(iLogger, new d0(b3));
                return true;
            case "extra":
                y4Var.q0 = io.sentry.util.b.p((Map) q3Var.E0());
                return true;
            case "event_id":
                y4Var.X = (w) q3Var.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                return true;
            case "release":
                y4Var.h0 = q3Var.K();
                return true;
            case "request":
                y4Var.f0 = (r) q3Var.y0(iLogger, new io.sentry.clientreport.a((byte) 19));
                return true;
            case "platform":
                y4Var.j0 = q3Var.K();
                return true;
            default:
                return false;
        }
    }

    public static BigDecimal c(double d) {
        return BigDecimal.valueOf(d).setScale(6, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    public static io.sentry.internal.gestures.b d(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, io.sentry.internal.gestures.a aVar) {
        String strL;
        io.sentry.internal.gestures.b bVar;
        List<io.sentry.android.core.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new i(view, f, f2));
        io.sentry.internal.gestures.b bVar2 = null;
        while (!arrayDeque.isEmpty()) {
            i iVar = (i) arrayDeque.poll();
            View view2 = iVar.a;
            float f3 = iVar.c;
            float f4 = iVar.b;
            int width = view2.getWidth();
            int height = view2.getHeight();
            if (f4 >= 0.0f && f4 <= width && f3 >= 0.0f && f3 <= height) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int scrollX = viewGroup.getScrollX();
                    int scrollY = viewGroup.getScrollY();
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            float left = (scrollX + f4) - childAt.getLeft();
                            float top = (scrollY + f3) - childAt.getTop();
                            Matrix matrix = childAt.getMatrix();
                            if (matrix != null && !matrix.isIdentity()) {
                                Matrix matrix2 = new Matrix();
                                if (matrix.invert(matrix2)) {
                                    float[] fArr = {left, top};
                                    matrix2.mapPoints(fArr);
                                    float f5 = fArr[0];
                                    top = fArr[1];
                                    left = f5;
                                }
                            }
                            arrayDeque.add(new i(childAt, left, top));
                        }
                    }
                }
                for (int i2 = 0; i2 < gestureTargetLocators.size(); i2++) {
                    io.sentry.android.core.internal.gestures.a aVar2 = gestureTargetLocators.get(i2);
                    aVar2.getClass();
                    io.sentry.internal.gestures.a aVar3 = io.sentry.internal.gestures.a.CLICKABLE;
                    if (aVar == aVar3 && view2.isClickable() && view2.getVisibility() == 0) {
                        String strL2 = l(view2);
                        if (strL2 == null) {
                            bVar = null;
                        } else {
                            bVar = new io.sentry.internal.gestures.b(view2, g(view2), strL2);
                        }
                    } else if (aVar != io.sentry.internal.gestures.a.SCROLLABLE) {
                        bVar = null;
                    } else if (((!((Boolean) aVar2.a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view2.getClass())) || AbsListView.class.isAssignableFrom(view2.getClass()) || ScrollView.class.isAssignableFrom(view2.getClass())) && view2.getVisibility() == 0 && (strL = l(view2)) != null) {
                        bVar = new io.sentry.internal.gestures.b(view2, g(view2), strL);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        if (aVar == aVar3) {
                            bVar2 = bVar;
                        } else if (aVar == io.sentry.internal.gestures.a.SCROLLABLE) {
                            return bVar;
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0 A[LOOP:0: B:30:0x0093->B:34:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[LOOP:1: B:36:0x00ad->B:40:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    public static g e(View view, g gVar, v3 v3Var) {
        boolean z;
        Drawable drawable;
        Bitmap bitmap;
        int extendedPaddingTop;
        Object tag;
        String str;
        Class<?> superclass;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class<?> superclass2;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        String lowerCase;
        v3Var.getClass();
        qg5 qg5VarA = l.a(view);
        boolean zBooleanValue = ((Boolean) qg5VarA.X).booleanValue();
        Rect rect = (Rect) qg5VarA.Y;
        boolean z2 = true;
        if (zBooleanValue) {
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (fm7.d0(lowerCase2, "sentry-unmask", false)) {
                    v3Var.w();
                    z = false;
                } else {
                    if (dh3.f(view.getTag(h.sentry_privacy), "unmask")) {
                        v3Var.w();
                    } else {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (fm7.d0(lowerCase, "sentry-mask", false)) {
                                v3Var.w();
                            } else if (dh3.f(view.getTag(h.sentry_privacy), "mask")) {
                                v3Var.w();
                            } else {
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) v3Var.b;
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) v3Var.a;
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z = true;
                        } else {
                            if (dh3.f(view.getTag(h.sentry_privacy), "mask")) {
                                v3Var.w();
                            } else {
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) v3Var.b;
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) v3Var.a;
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
            } else {
                if (dh3.f(view.getTag(h.sentry_privacy), "unmask")) {
                    v3Var.w();
                } else {
                    tag = view.getTag();
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (fm7.d0(lowerCase, "sentry-mask", false)) {
                            v3Var.w();
                        } else if (dh3.f(view.getTag(h.sentry_privacy), "mask")) {
                            v3Var.w();
                        } else {
                            if (view.getParent() != null) {
                                view.getParent().getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) v3Var.b;
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) v3Var.a;
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z = true;
                    } else {
                        if (dh3.f(view.getTag(h.sentry_privacy), "mask")) {
                            v3Var.w();
                        } else {
                            if (view.getParent() != null) {
                                view.getParent().getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) v3Var.b;
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) v3Var.a;
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.d dVar = layout != null ? new io.sentry.d((Object) layout, (byte) 5) : null;
            int currentTextColor = textView.getCurrentTextColor() | (-16777216);
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            try {
                extendedPaddingTop = textView.getTotalPaddingTop();
            } catch (NullPointerException unused) {
                extendedPaddingTop = textView.getExtendedPaddingTop();
            }
            textView.getX();
            textView.getY();
            return new io.sentry.android.replay.viewhierarchy.f(dVar, Integer.valueOf(currentTextColor), totalPaddingLeft, extendedPaddingTop, textView.getWidth(), textView.getHeight(), textView.getElevation() + (gVar != null ? gVar.c : 0.0f), gVar, z, zBooleanValue, rect);
        }
        if (!(view instanceof ImageView)) {
            if (!(view instanceof SurfaceView)) {
                view.getX();
                view.getY();
                return new io.sentry.android.replay.viewhierarchy.c(view.getWidth(), view.getHeight(), view.getElevation() + (gVar != null ? gVar.c : 0.0f), gVar, z, zBooleanValue, rect);
            }
            WeakReference weakReference = new WeakReference(view);
            SurfaceView surfaceView = (SurfaceView) view;
            surfaceView.getX();
            surfaceView.getY();
            return new io.sentry.android.replay.viewhierarchy.e(weakReference, surfaceView.getWidth(), surfaceView.getHeight(), surfaceView.getElevation() + (gVar != null ? gVar.c : 0.0f), gVar, z, zBooleanValue, rect);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        float elevation = imageView.getElevation() + (gVar != null ? gVar.c : 0.0f);
        if (!z || (drawable = imageView.getDrawable()) == null) {
            z2 = false;
        } else {
            if ((drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) || ((drawable instanceof BitmapDrawable) && ((bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled() || bitmap.getHeight() <= 10 || bitmap.getWidth() <= 10))) {
                z2 = false;
            }
        }
        return new io.sentry.android.replay.viewhierarchy.d(width, height, elevation, gVar, z2, zBooleanValue, rect);
    }

    public static String f() {
        byte[] bArr = new byte[16];
        o.a().b(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return io.sentry.util.r.b(new UUID(j2, j));
    }

    public static String g(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }

    public static Date h(String str) {
        try {
            return new Date(io.sentry.vendor.a.i(str));
        } catch (IllegalArgumentException unused) {
            bt.q(oi0.l("timestamp is not ISO format ", str));
            return null;
        }
    }

    public static Date i(String str) {
        try {
            return new Date(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            bt.q(oi0.l("timestamp is not millis format ", str));
            return null;
        }
    }

    public static io.sentry.internal.debugmeta.c j() {
        Method declaredMethod;
        io.sentry.internal.debugmeta.c cVar = b;
        if (cVar != null) {
            return cVar;
        }
        Method method = null;
        try {
            declaredMethod = LayoutNode.class.getDeclaredMethod("getChildren$ui_release", null);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        try {
            Method declaredMethod2 = LayoutNode.class.getDeclaredMethod("getOuterCoordinator$ui_release", null);
            declaredMethod2.setAccessible(true);
            method = declaredMethod2;
        } catch (NoSuchMethodException unused2) {
        }
        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(declaredMethod, method);
        b = cVar2;
        return cVar2;
    }

    public static final Window k(View view) throws IllegalAccessException {
        Field field;
        view.getClass();
        g44 g44Var = l0.a;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) l0.a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) l0.b.getValue()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        obj.getClass();
        return (Window) obj;
    }

    public static String l(View view) {
        int id = view.getId();
        if (id != -1 && (((-16777216) & id) != 0 || (16777215 & id) == 0)) {
            Resources resources = view.getContext().getResources();
            if (resources == null) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            try {
                return resources.getResourceEntryName(id);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean n(Context context) {
        io.sentry.util.b.s(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static final boolean o(y yVar, y yVar2) {
        yVar.getClass();
        yVar2.getClass();
        switch (x.a[yVar.ordinal()]) {
            case 1:
                return yVar2 == y.STARTED || yVar2 == y.CLOSED;
            case 2:
                return yVar2 == y.PAUSED || yVar2 == y.STOPPED || yVar2 == y.CLOSED;
            case 3:
                return yVar2 == y.PAUSED || yVar2 == y.STOPPED || yVar2 == y.CLOSED;
            case 4:
                return yVar2 == y.RESUMED || yVar2 == y.STOPPED || yVar2 == y.CLOSED;
            case 5:
                return yVar2 == y.STARTED || yVar2 == y.CLOSED;
            default:
                b61.c();
            case 6:
                return false;
        }
    }

    public static boolean q(LayoutNode layoutNode) throws IllegalAccessException, InvocationTargetException {
        Boolean bool = a;
        Boolean bool2 = Boolean.FALSE;
        if (dh3.f(bool, bool2)) {
            return layoutNode.getOuterCoordinator$ui().e1();
        }
        if (dh3.f(bool, Boolean.TRUE)) {
            Method method = (Method) j().Z;
            method.getClass();
            Object objInvoke = method.invoke(layoutNode, null);
            objInvoke.getClass();
            return ((i55) objInvoke).e1();
        }
        if (bool != null) {
            b61.c();
            return false;
        }
        try {
            boolean zE1 = layoutNode.getOuterCoordinator$ui().e1();
            a = bool2;
            return zE1;
        } catch (NoSuchMethodError unused) {
            a = Boolean.TRUE;
            Method method2 = (Method) j().Z;
            method2.getClass();
            Object objInvoke2 = method2.invoke(layoutNode, null);
            objInvoke2.getClass();
            return ((i55) objInvoke2).e1();
        }
    }

    public static byte[] r(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void s(y4 y4Var, io.sentry.internal.debugmeta.c cVar, ILogger iLogger) throws IOException {
        if (y4Var.X != null) {
            cVar.p("event_id");
            cVar.v(iLogger, y4Var.X);
        }
        cVar.p("contexts");
        cVar.v(iLogger, y4Var.Y);
        if (y4Var.Z != null) {
            cVar.p("sdk");
            cVar.v(iLogger, y4Var.Z);
        }
        if (y4Var.f0 != null) {
            cVar.p("request");
            cVar.v(iLogger, y4Var.f0);
        }
        AbstractMap abstractMap = y4Var.g0;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.p("tags");
            cVar.v(iLogger, y4Var.g0);
        }
        if (y4Var.h0 != null) {
            cVar.p(BuildConfig.BUILD_TYPE);
            cVar.y(y4Var.h0);
        }
        if (y4Var.i0 != null) {
            cVar.p("environment");
            cVar.y(y4Var.i0);
        }
        if (y4Var.j0 != null) {
            cVar.p("platform");
            cVar.y(y4Var.j0);
        }
        if (y4Var.k0 != null) {
            cVar.p("user");
            cVar.v(iLogger, y4Var.k0);
        }
        if (y4Var.m0 != null) {
            cVar.p("server_name");
            cVar.y(y4Var.m0);
        }
        if (y4Var.n0 != null) {
            cVar.p("dist");
            cVar.y(y4Var.n0);
        }
        List list = y4Var.o0;
        if (list != null && !list.isEmpty()) {
            cVar.p("breadcrumbs");
            cVar.v(iLogger, y4Var.o0);
        }
        if (y4Var.p0 != null) {
            cVar.p("debug_meta");
            cVar.v(iLogger, y4Var.p0);
        }
        AbstractMap abstractMap2 = y4Var.q0;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        cVar.p("extra");
        cVar.v(iLogger, y4Var.q0);
    }

    public static final Rect t(s86 s86Var) {
        return new Rect((int) Math.floor(s86Var.a), (int) Math.floor(s86Var.b), (int) Math.ceil(s86Var.c), (int) Math.ceil(s86Var.d));
    }

    public int m() {
        return -1;
    }

    public boolean p() {
        return false;
    }
}
