package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.google.gson.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.util.ErrorCodeJNIWrapper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i21 {
    public static final jw0 A;
    public static final jw0 B;
    public static final jw0 C;
    public static final jw0 D;
    public static final jw0 E;
    public static final jw0 F;
    public static final jw0 G;
    public static final jw0 H;
    public static final jw0 I;
    public static final jw0 J;
    public static final jw0 K;
    public static final jw0 L;
    public static final jw0 M;
    public static final jw0 N;
    public static final jw0 O;
    public static final jw0 P;
    public static final jw0 Q;
    public static final jw0 R;
    public static final int[][] S;
    public static final int[][] T;
    public static final int[][] U;
    public static final int[][] V;
    public static final jw0 W;
    public static final xj8 X;
    public static final jw0 Y;
    public static final float Z;
    public static final d77 a0;
    public static final jw0 b0;
    public static final xj8 c0;
    public static final jw0 d0;
    public static final xj8 e0;
    public static final Object f0;
    public static xz8 g0;
    public static final jw0 h;
    public static g73 h0;
    public static final jw0 i;
    public static final jw0 j;
    public static final d77 k;
    public static final jw0 l;
    public static final float m;
    public static final jw0 n;
    public static final float o;
    public static final jw0 p;
    public static final float q;
    public static final jw0 r;
    public static final float s;
    public static final jw0 t;
    public static final float u;
    public static final jw0 v;
    public static final float w;
    public static final jw0 x;
    public static final jw0 y;
    public static final jw0 z;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final zy0 g = new zy0(-109851710, false, new dx0(10));

    static {
        jw0 jw0Var = jw0.i0;
        h = jw0Var;
        jw0 jw0Var2 = jw0.k0;
        i = jw0Var2;
        j = jw0.r0;
        k = d77.f0;
        jw0 jw0Var3 = jw0.h0;
        l = jw0Var3;
        m = 0.38f;
        n = jw0Var3;
        o = 0.38f;
        p = jw0Var3;
        q = 0.38f;
        r = jw0Var3;
        s = 0.38f;
        t = jw0Var3;
        u = 0.38f;
        v = jw0Var3;
        w = 0.38f;
        jw0 jw0Var4 = jw0.X;
        x = jw0Var4;
        y = jw0Var4;
        z = jw0Var3;
        A = jw0Var4;
        B = jw0Var;
        C = jw0Var4;
        D = jw0Var4;
        E = jw0Var2;
        F = jw0Var3;
        G = jw0Var2;
        H = jw0Var;
        I = jw0Var;
        J = jw0Var;
        K = jw0Var3;
        L = jw0Var;
        M = jw0Var;
        N = jw0Var;
        O = jw0Var;
        P = jw0Var;
        Q = jw0Var;
        R = jw0Var;
        S = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
        T = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
        U = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, HttpStatusCodesKt.HTTP_PROCESSING, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
        V = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
        W = jw0.k0;
        X = xj8.f0;
        Y = jw0.p0;
        Z = 3.0f;
        a0 = d77.h0;
        jw0 jw0Var5 = jw0.i0;
        b0 = jw0Var5;
        c0 = xj8.h0;
        d0 = jw0Var5;
        e0 = xj8.X;
        f0 = new Object();
    }

    public static final float A(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = z78.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : kb3.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float B(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = z78.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? kb3.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static kf3 C(Collection collection) {
        collection.getClass();
        return new kf3(0, collection.size() - 1, 1);
    }

    public static final Constructor D(pv3 pv3Var) {
        wd0 wd0VarR;
        pv3Var.getClass();
        kb6 kb6VarA = ms8.a(pv3Var);
        Member memberB = (kb6VarA == null || (wd0VarR = kb6VarA.r()) == null) ? null : wd0VarR.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field E(nw3 nw3Var) {
        nw3Var.getClass();
        pb6 pb6VarC = ms8.c(nw3Var);
        if (pb6VarC != null) {
            return pb6VarC.w();
        }
        return null;
    }

    public static final Method F(pv3 pv3Var) {
        wd0 wd0VarR;
        pv3Var.getClass();
        kb6 kb6VarA = ms8.a(pv3Var);
        vk3 vk3Var = kb6VarA instanceof vk3 ? (vk3) kb6VarA : null;
        if (vk3Var != null) {
            return vk3Var.X();
        }
        Member memberB = (kb6VarA == null || (wd0VarR = kb6VarA.r()) == null) ? null : wd0VarR.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static int G(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final u84 H(d94 d94Var) {
        d94Var.getClass();
        return ys0.z(d94Var.getX());
    }

    public static boolean I(int i2) {
        return i2 == -1;
    }

    public static final boolean J(int i2, String str) {
        char cCharAt = str.charAt(i2);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static List K(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List L(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return d02.X;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List M(Object obj) {
        return obj != null ? K(obj) : d02.X;
    }

    public static ArrayList N(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new jt(objArr, true));
    }

    public static final void O(HappSpinnerField happSpinnerField, View view, gn2 gn2Var) {
        happSpinnerField.getClass();
        view.getClass();
        happSpinnerField.setOnSpinnerItemClickListener(new ry2(happSpinnerField, view, gn2Var, (byte) 0));
    }

    public static final List P(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : K(list.get(0));
        }
        return d02.X;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long Q(int i2, String str) {
        int iS = s(str, 0, i2, false);
        Matcher matcher = c61.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iM0 = -1;
        int i6 = -1;
        int i7 = -1;
        while (iS < i2) {
            int iS2 = s(str, iS + 1, i2, true);
            matcher.region(iS, iS2);
            if (i4 == -1 && matcher.usePattern(c61.m).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(c61.l).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i5 = Integer.parseInt(strGroup4);
            } else if (iM0 == -1) {
                Pattern pattern = c61.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iM0 = fm7.m0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i3 != -1 && matcher.usePattern(c61.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i3 = Integer.parseInt(strGroup6);
                }
            } else if (i3 != -1) {
            }
            iS = s(str, iS2 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            bt.q("Failed requirement.");
            return 0L;
        }
        if (iM0 == -1) {
            bt.q("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            bt.q("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            bt.q("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            bt.q("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            bt.q("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(ks8.d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iM0 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final void R(bq3 bq3Var, String str) {
        Object rj6Var;
        try {
            rj6Var = bq3Var.j(str) == null ? null : (bo3) bq3Var.X.remove(str);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    public static Object S(rn2 rn2Var) {
        return z51.R(b02.X, rn2Var);
    }

    public static void T(View view, gr4 gr4Var) {
        sy1 sy1Var = gr4Var.Y.b;
        if (sy1Var == null || !sy1Var.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        er4 er4Var = gr4Var.Y;
        if (er4Var.m != elevation) {
            er4Var.m = elevation;
            gr4Var.E();
        }
    }

    public static String U(String str) {
        ArrayList arrayList = new ArrayList();
        str.getClass();
        for (String str2 : fm7.T0(str, 6, 6, true)) {
            if (str2.length() > 5) {
                char cCharAt = str2.charAt(1);
                char cCharAt2 = str2.charAt(3);
                char cCharAt3 = str2.charAt(5);
                char cCharAt4 = str2.charAt(0);
                char cCharAt5 = str2.charAt(2);
                char cCharAt6 = str2.charAt(4);
                StringBuilder sb = new StringBuilder();
                sb.append(cCharAt);
                sb.append(cCharAt2);
                sb.append(cCharAt3);
                sb.append(cCharAt4);
                sb.append(cCharAt5);
                sb.append(cCharAt6);
                arrayList.add(sb.toString());
            } else {
                arrayList.add(str2);
            }
        }
        return wv0.y0(arrayList, _UrlKt.FRAGMENT_ENCODE_SET, null, null, null, 62);
    }

    public static ComponentName V(Context context, Intent intent) {
        synchronized (f0) {
            try {
                n(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    g0.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void W() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void X() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final String Y(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final void a(zy0 zy0Var, lp2 lp2Var, int i2) {
        lp2Var.X(-135321293);
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            q06 q06Var = pc.b;
            Context context = (Context) lp2Var.j(q06Var);
            q06 q06Var2 = yc4.a;
            Object objJ = lp2Var.j(q06Var2);
            Object obj = objJ instanceof ComponentActivity ? (ComponentActivity) objJ : null;
            q06 q06Var3 = pc.a;
            Configuration configuration = (Configuration) lp2Var.j(q06Var3);
            Object objK = lp2Var.K();
            Object obj2 = zz0.a;
            if (objK == obj2) {
                ss8 ss8Var = ss8.a;
                objK = ss8.n();
                lp2Var.g0(objK);
            }
            Locale locale = (Locale) objK;
            boolean zF = lp2Var.f(context);
            Object objK2 = lp2Var.K();
            if (zF || objK2 == obj2) {
                Locale.setDefault(locale);
                configuration.setLocale(locale);
                objK2 = context.createConfigurationContext(configuration);
                lp2Var.g0(objK2);
            }
            Context context2 = (Context) objK2;
            boolean zK = yn0.K(lp2Var);
            boolean zG = lp2Var.g(zK);
            Object objK3 = lp2Var.K();
            if (zG || objK3 == obj2) {
                objK3 = oc.j(zK);
                lp2Var.g0(objK3);
            }
            dp dpVar = (dp) objK3;
            Object objK4 = lp2Var.K();
            if (objK4 == obj2) {
                objK4 = new gr(sr.e);
                lp2Var.g0(objK4);
            }
            gr grVar = (gr) objK4;
            Object objK5 = lp2Var.K();
            if (objK5 == obj2) {
                objK5 = new tr(nr.b, fr.b, cp.b);
                lp2Var.g0(objK5);
            }
            tr trVar = (tr) objK5;
            Object objK6 = lp2Var.K();
            if (objK6 == obj2) {
                objK6 = w51.q();
                lp2Var.g0(objK6);
            }
            ds dsVar = (ds) objK6;
            Boolean boolValueOf = Boolean.valueOf(zK);
            boolean zG2 = lp2Var.g(zK) | lp2Var.h(obj);
            Object objK7 = lp2Var.K();
            if (zG2 || objK7 == obj2) {
                objK7 = new r5(obj, zK, null, (byte) 1);
                lp2Var.g0(objK7);
            }
            u70.j(obj, boolValueOf, (rn2) objK7, lp2Var);
            t06 t06VarA = q06Var2.a(obj);
            context2.getClass();
            t06 t06VarA2 = q06Var.a(context2);
            Object configuration2 = context2.getResources().getConfiguration();
            configuration2.getClass();
            mb6.b(new t06[]{t06VarA, t06VarA2, q06Var3.a(configuration2), ep.z.a(dpVar), hr.a.a(grVar), ur.a.a(trVar), es.a.a(dsVar)}, jm4.U(-1291215757, new h8(zy0Var, (byte) 1), lp2Var), lp2Var, 48);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new h8(zy0Var, i2, (byte) 2);
        }
    }

    public static ii1 b() {
        return new ii1(1.0f, 1.0f);
    }

    public static final void c(final um6 um6Var, final boolean z2, final boolean z3, final gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, final int i2) {
        lp2 lp2Var2;
        final kx4 kx4Var2;
        um6Var.getClass();
        gn2Var.getClass();
        lp2Var.X(499453224);
        int i3 = (lp2Var.f(um6Var) ? 4 : 2) | i2 | (lp2Var.g(z2) ? 32 : 16) | (lp2Var.g(z3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.h(gn2Var) ? 2048 : 1024) | (lp2Var.f(kx4Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (lp2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            lp2Var2 = lp2Var;
            ci8.a(kx4Var, vj8.j0(y46.sub_routing_list_json, lp2Var), jm4.U(-2142120164, new sn2() { // from class: mw5
                @Override // defpackage.sn2
                public final Object x(Object obj, Object obj2, Object obj3) {
                    lp2 lp2Var3 = (lp2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((uw0) obj).getClass();
                    if (lp2Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        u70.o(um6Var, z2, z3, gn2Var, b.a, lp2Var3, 24576);
                    } else {
                        lp2Var3.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var2, ((i3 >> 12) & 14) | 384, 0);
            kx4Var2 = kx4Var;
        } else {
            lp2Var2 = lp2Var;
            kx4Var2 = kx4Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(z2, z3, gn2Var, kx4Var2, i2) { // from class: nw5
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ gn2 f0;
                public final /* synthetic */ kx4 g0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(1);
                    i21.c(this.X, this.Y, this.Z, this.f0, this.g0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void d(int i2, gn2 gn2Var, lp2 lp2Var, kx4 kx4Var) {
        lp2 lp2Var2;
        kx4 kx4Var2;
        gn2Var.getClass();
        lp2Var.X(405148082);
        int i3 = (lp2Var.h(gn2Var) ? 4 : 2) | i2;
        if (lp2Var.N(i3 & 1, (i3 & 19) != 18)) {
            lp2Var2 = lp2Var;
            kx4Var2 = kx4Var;
            dh3.b(vj8.j0(y46.routing_settings_title, lp2Var), kx4Var2, null, jm4.U(-1838047371, new o90((Object) jm4.V(lp2Var), gn2Var, (byte) 10), lp2Var), lp2Var2, 3120, 4);
        } else {
            lp2Var2 = lp2Var;
            kx4Var2 = kx4Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new pn6(gn2Var, kx4Var2, i2);
        }
    }

    public static final void e(boolean z2, b83 b83Var, String str, String str2, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        kx4 kx4Var2;
        b83Var.getClass();
        gn2Var.getClass();
        lp2Var.X(1511041619);
        int i3 = i2 | (lp2Var.g(z2) ? 4 : 2) | (lp2Var.f(b83Var) ? 32 : 16) | (lp2Var.f(str != null ? new RouteProfileId(str) : null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.f(str2 != null ? new RouteProfileId(str2) : null) ? 2048 : 1024) | (lp2Var.h(gn2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (lp2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4Var2 = kx4Var;
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var2);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            if (z2) {
                lp2Var.W(1863000442);
                String strJ0 = vj8.j0(y46.sub_routing_server_list_description, lp2Var);
                FillElement fillElement = b.a;
                ox1 ox1Var = hr.a;
                kx4 kx4VarW = os4.w(fillElement, ((gr) lp2Var.j(ox1Var)).a.d);
                sr srVar = ((gr) lp2Var.j(ox1Var)).a;
                vj8.g(strJ0, os4.A(kx4VarW, 0.0f, 8.0f, 0.0f, 0.0f, 13), lp2Var, 0);
                lp2Var.p(false);
            } else {
                lp2Var.W(1863368505);
                lp2Var.p(false);
            }
            String strJ1 = vj8.j0(y46.sub_routing_list_all, lp2Var);
            FillElement fillElement2 = b.a;
            ox1 ox1Var2 = hr.a;
            sr srVar2 = ((gr) lp2Var.j(ox1Var2)).a;
            ((gr) lp2Var.j(ox1Var2)).getClass();
            ci8.a(os4.A(fillElement2, 0.0f, 24.0f, 0.0f, 48.0f, 5), strJ1, jm4.U(-495416899, new h64(b83Var, str, str2, gn2Var, (byte) 5), lp2Var), lp2Var, 384, 0);
            lp2Var.p(true);
        } else {
            kx4Var2 = kx4Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new vz6(z2, b83Var, str, str2, gn2Var, kx4Var2, i2, (byte) 0);
        }
    }

    public static ArrayList f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new jt(objArr, true));
    }

    public static final String g(bo3 bo3Var) {
        Object rj6Var;
        try {
            rj6Var = bo3Var.d();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        return (String) rj6Var;
    }

    public static final int h(long[] jArr, long j2) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = jArr[i3];
            if (j2 > j3) {
                i2 = i3 + 1;
            } else {
                if (j2 >= j3) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int i(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            bt.q(ie2.h("fromIndex (0) is greater than toIndex (", size, ")."));
            return 0;
        }
        if (size > size2) {
            kp5.k(pc6.k(size, "toIndex (", size2, ") is greater than size (", ")."));
            return 0;
        }
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iM = dh3.m((Comparable) arrayList.get(i4), comparable);
            if (iM < 0) {
                i2 = i4 + 1;
            } else {
                if (iM <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static gb4 j(gb4 gb4Var) {
        gb4Var.h();
        gb4Var.Z = true;
        return gb4Var.Y > 0 ? gb4Var : gb4.f0;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x022b  */
    public static void k(u50 u50Var, int i2, av8 av8Var, int i3, cb0 cb0Var) throws s59 {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte[][] bArr = (byte[][]) cb0Var.f0;
        int i12 = cb0Var.Y;
        int i13 = cb0Var.Z;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = S[0].length;
        x(0, 0, cb0Var);
        int i14 = i12 - length;
        x(i14, 0, cb0Var);
        x(0, i14, cb0Var);
        w(0, 7, cb0Var);
        int i15 = i12 - 8;
        w(i15, 7, cb0Var);
        w(0, i15, cb0Var);
        y(7, 0, cb0Var);
        int i16 = i13 - 8;
        y(i16, 0, cb0Var);
        int i17 = i13 - 7;
        y(7, i17, cb0Var);
        if (cb0Var.e(8, i16) == 0) {
            throw new s59();
        }
        cb0Var.t(8, i16, 1);
        byte b2 = av8Var.a;
        if (b2 < 2) {
            i4 = 0;
        } else {
            i4 = 0;
            int[] iArr = U[b2 - 1];
            int length2 = iArr.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = iArr[i18];
                if (i19 >= 0) {
                    int length3 = iArr.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = iArr[i20];
                        if (i21 >= 0 && I(cb0Var.e(i21, i19))) {
                            int i22 = i21 - 2;
                            int i23 = i19 - 2;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= 5) {
                                    break;
                                }
                                int[] iArr2 = T[i24];
                                int i25 = i24;
                                int i26 = 0;
                                for (int i27 = 5; i26 < i27; i27 = 5) {
                                    int i28 = i26;
                                    cb0Var.t(i22 + i26, i23 + i25, iArr2[i28]);
                                    i26 = i28 + 1;
                                    length3 = length3;
                                }
                                i24 = i25 + 1;
                            }
                        }
                        i20++;
                        bArr = bArr;
                        i12 = i12;
                        length3 = length3;
                    }
                }
                i18++;
                bArr = bArr;
                i12 = i12;
            }
        }
        byte[][] bArr3 = bArr;
        int i29 = i12;
        int i30 = 8;
        while (i30 < i15) {
            int i31 = i30 + 1;
            int i32 = i31 % 2;
            if (I(cb0Var.e(i30, 6))) {
                cb0Var.t(i30, 6, i32);
            }
            if (I(cb0Var.e(6, i30))) {
                cb0Var.t(6, i30, i32);
            }
            i30 = i31;
        }
        u50 u50Var2 = new u50();
        if (i3 < 0 || i3 >= 8) {
            throw new s59("Invalid mask pattern");
        }
        int iB = (p61.b(i2) << 3) | i3;
        u50Var2.b(iB, 5);
        u50Var2.b(l(iB, 1335), 10);
        u50 u50Var3 = new u50();
        u50Var3.b(21522, 15);
        if (u50Var2.Y != u50Var3.Y) {
            bt.q("Sizes don't match");
            return;
        }
        int i33 = i4;
        while (true) {
            int[] iArr3 = u50Var2.X;
            if (i33 >= iArr3.length) {
                break;
            }
            iArr3[i33] = iArr3[i33] ^ u50Var3.X[i33];
            i33++;
        }
        if (u50Var2.Y != 15) {
            throw new s59("should not happen but we got: " + u50Var2.Y);
        }
        int i34 = i4;
        while (true) {
            int i35 = u50Var2.Y;
            if (i34 >= i35) {
                break;
            }
            boolean zD = u50Var2.d((i35 - 1) - i34);
            int[] iArr4 = V[i34];
            int i36 = iArr4[i4];
            byte[] bArr4 = bArr3[iArr4[1]];
            byte b3 = zD ? (byte) 1 : (byte) 0;
            bArr4[i36] = b3;
            if (i34 < 8) {
                i11 = (i29 - i34) - 1;
                i10 = 8;
            } else {
                i10 = (i34 - 8) + i17;
                i11 = 8;
            }
            bArr3[i10][i11] = b3;
            i34++;
        }
        if (b2 >= 7) {
            u50 u50Var4 = new u50();
            u50Var4.b(b2, 6);
            u50Var4.b(l(b2, 7973), 12);
            if (u50Var4.Y != 18) {
                throw new s59("should not happen but we got: " + u50Var4.Y);
            }
            int i37 = 17;
            for (int i38 = i4; i38 < 6; i38++) {
                for (int i39 = i4; i39 < 3; i39++) {
                    boolean zD2 = u50Var4.d(i37);
                    i37--;
                    int i40 = (i13 - 11) + i39;
                    byte[] bArr5 = bArr3[i40];
                    byte b4 = zD2 ? (byte) 1 : (byte) 0;
                    bArr5[i38] = b4;
                    bArr3[i38][i40] = b4;
                }
            }
        }
        int i41 = i29 - 1;
        int i42 = i13 - 1;
        int i43 = i4;
        int i44 = -1;
        while (i41 > 0) {
            if (i41 == 6) {
                i41--;
            }
            while (i42 >= 0 && i42 < i13) {
                for (int i45 = i4; i45 < 2; i45++) {
                    int i46 = i41 - i45;
                    if (I(cb0Var.e(i46, i42))) {
                        if (i43 < u50Var.Y) {
                            boolean zD3 = u50Var.d(i43);
                            i43++;
                            i5 = zD3;
                        } else {
                            i5 = i4;
                        }
                        if (i3 != -1) {
                            switch (i3) {
                                case 0:
                                    i6 = i42 + i46;
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 1:
                                    i7 = i42 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 2:
                                    i7 = i46 % 3;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 3:
                                    i7 = (i42 + i46) % 3;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 4:
                                    i7 = ((i46 / 3) + (i42 / 2)) & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 5:
                                    int i47 = i42 * i46;
                                    i7 = (i47 % 3) + (i47 & 1);
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 6:
                                    int i48 = i42 * i46;
                                    i8 = i48 & 1;
                                    i9 = i48 % 3;
                                    i6 = i9 + i8;
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                case 7:
                                    i9 = (i42 * i46) % 3;
                                    i8 = (i42 + i46) & 1;
                                    i6 = i9 + i8;
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        i5 = ~i5;
                                    }
                                    break;
                                default:
                                    bt.q(pc6.j(i3, "Invalid mask pattern: "));
                                    return;
                            }
                        }
                        bArr3[i42][i46] = (byte) i5;
                    }
                }
                i42 += i44;
            }
            i44 = -i44;
            i42 += i44;
            i41 -= 2;
        }
        if (i43 == u50Var.Y) {
            return;
        }
        throw new s59("Not all bits consumed: " + i43 + '/' + u50Var.Y);
    }

    public static int l(int i2, int i3) {
        if (i3 == 0) {
            bt.q("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i2 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i4) {
            iNumberOfLeadingZeros2 ^= i3 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i4);
        }
        return iNumberOfLeadingZeros2;
    }

    public static final String m(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static void n(Context context) {
        if (g0 == null) {
            xz8 xz8Var = new xz8(context);
            g0 = xz8Var;
            synchronized (xz8Var.a) {
                xz8Var.g = true;
            }
        }
    }

    public static final y05 o(mh7 mh7Var, lp2 lp2Var) {
        d94 d94Var = (d94) lp2Var.j(rd4.a);
        Object value = mh7Var.getValue();
        Object objH = d94Var.getX();
        o84 o84Var = o84.f0;
        Object obj = b02.X;
        Object[] objArr = {mh7Var, objH, o84Var, obj};
        boolean zH = lp2Var.h(objH) | lp2Var.d(o84Var.ordinal()) | lp2Var.h(obj) | lp2Var.h(mh7Var);
        Object objK = lp2Var.K();
        Object obj2 = zz0.a;
        if (zH || objK == obj2) {
            Object cf2Var = new cf2(objH, o84Var, obj, mh7Var, null, (byte) 0);
            lp2Var.g0(cf2Var);
            objK = cf2Var;
        }
        rn2 rn2Var = (rn2) objK;
        Object objK2 = lp2Var.K();
        if (objK2 == obj2) {
            objK2 = z51.H(value);
            lp2Var.g0(objK2);
        }
        y05 y05Var = (y05) objK2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH2 = lp2Var.h(rn2Var);
        Object objK3 = lp2Var.K();
        if (zH2 || objK3 == obj2) {
            objK3 = new sd7(rn2Var, y05Var, null, (byte) 1);
            lp2Var.g0(objK3);
        }
        u70.k(objArrCopyOf, (rn2) objK3, lp2Var);
        return y05Var;
    }

    public static void p(Intent intent) {
        synchronized (f0) {
            try {
                if (g0 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    g0.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static z91 q(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? new lm6() : new q81();
        }
        return new lm6();
    }

    public static gb4 r() {
        return new gb4(10);
    }

    public static int s(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String t(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : fm7.T0(str, 2, 2, true)) {
            if (str2.length() > 1) {
                char cCharAt = str2.charAt(1);
                char cCharAt2 = str2.charAt(0);
                StringBuilder sb = new StringBuilder();
                sb.append(cCharAt);
                sb.append(cCharAt2);
                arrayList.add(sb.toString());
            } else {
                arrayList.add(str2);
            }
        }
        return wv0.y0(arrayList, _UrlKt.FRAGMENT_ENCODE_SET, null, null, null, 62);
    }

    public static String u(String str, b12 b12Var) {
        Object rj6Var;
        str.getClass();
        b12Var.getClass();
        try {
            if (b12Var != b12.g0) {
                rj6Var = new ErrorCodeJNIWrapper().b(b12Var.ordinal(), str);
            } else if (str.equals("LDhKyuZYdvtoxZ")) {
                bq3 bq3Var = new bq3();
                try {
                    bq3Var.i("platform", "Android");
                    bq3Var.i("packageName", "su.happ.proxyutility");
                    bq3Var.i("versionName", "4.9.0");
                    bq3Var.f(1721, "versionCode");
                    bq3Var.i("buildType", BuildConfig.BUILD_TYPE);
                    bq3Var.h("isDebuggable", Boolean.FALSE);
                    bq3Var.h("isEmulator", Boolean.valueOf(g33.E()));
                    bq3Var.i("brand", Build.BRAND);
                    bq3Var.i("manufacturer", Build.MANUFACTURER);
                    bq3Var.i("model", Build.MODEL);
                    bq3Var.i("device", Build.DEVICE);
                    bq3Var.i("product", Build.PRODUCT);
                    bq3Var.i("hardware", Build.HARDWARE);
                    bq3Var.i("board", Build.BOARD);
                    bq3Var.i("fingerprint", Build.FINGERPRINT);
                    bq3Var.i("bootloader", Build.BOOTLOADER);
                    String radioVersion = Build.getRadioVersion();
                    if (radioVersion == null) {
                        radioVersion = "unknown";
                    }
                    bq3Var.i("radio", radioVersion);
                    bq3Var.f(Integer.valueOf(Build.VERSION.SDK_INT), "sdkInt");
                    bq3Var.i(BuildConfig.BUILD_TYPE, Build.VERSION.RELEASE);
                    bq3Var.i("codename", Build.VERSION.CODENAME);
                    HappApplication happApplication = HappApplication.M0;
                    bq3Var.h("isRooted", Boolean.valueOf(new lr5((Object) k32.i(), (byte) 9).E()));
                    File file = new File("/proc/mounts");
                    Charset charset = iq0.a;
                    charset.getClass();
                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
                    try {
                        String strE = dt7.e(inputStreamReader);
                        inputStreamReader.close();
                        bq3Var.h("hasMagisk", Boolean.valueOf(fm7.d0(strE, "magisk", true)));
                        ss8 ss8Var = ss8.a;
                        bq3Var.i("HWID", ss8.j(k32.i()));
                        bq3Var.i("buildTags", Build.TAGS);
                        bq3Var.i("buildTypeTag", Build.TYPE);
                        String[] strArr = Build.SUPPORTED_ABIS;
                        strArr.getClass();
                        bq3Var.i("abi", eu.x0(strArr, ",", null, null, null, 62));
                        bq3Var.i("locale", Locale.getDefault().toString());
                        bq3Var.i("timezone", TimeZone.getDefault().getID());
                        bq3Var.i("language", Locale.getDefault().getLanguage());
                        bq3Var.i("country", Locale.getDefault().getCountry());
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            oc.h(inputStreamReader, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    if (th3 instanceof InterruptedException) {
                        throw th3;
                    }
                    if (th3 instanceof CancellationException) {
                        throw th3;
                    }
                }
                ss8 ss8Var2 = ss8.a;
                su2 su2Var = new su2();
                sj2 sj2Var = sj2.e;
                Objects.requireNonNull(sj2Var);
                su2Var.f = sj2Var;
                rj6Var = "https://yandex.ru/".concat(ss8.b(new a(su2Var).g(bq3Var)));
            } else {
                ss8 ss8Var3 = ss8.a;
                rj6Var = ss8.a(t(new ErrorCodeJNIWrapper().c(U(str))));
            }
        } catch (Throwable th4) {
            if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                throw th4;
            }
            rj6Var = new rj6(th4);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return (String) rj6Var;
    }

    public static final void v(sv1 sv1Var, xt2 xt2Var) {
        boolean z2;
        Canvas canvas;
        float f2;
        sm0 sm0VarK = sv1Var.n0().k();
        xt2 xt2Var2 = (xt2) sv1Var.n0().Z;
        zt2 zt2Var = xt2Var.a;
        if (xt2Var.s) {
            return;
        }
        long j2 = xt2Var.h;
        Canvas canvasB = fb.b(sm0VarK);
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j3 = xt2Var.t;
            float f3 = (int) (j3 >> 32);
            float f4 = f3 - xt2Var.v;
            float f5 = (int) (j3 & 4294967295L);
            float f6 = f5 - xt2Var.w;
            long j4 = xt2Var.u;
            float f7 = f3 + ((int) (j4 >> 32)) + xt2Var.x;
            float f8 = f5 + ((int) (j4 & 4294967295L)) + xt2Var.y;
            float fA = zt2Var.a();
            g60 g60VarN = zt2Var.n();
            int iP = zt2Var.P();
            if (fA >= 1.0f && iP == 3 && g60VarN == null) {
                canvas = canvasB;
                if (zt2Var.m() != 1) {
                    canvas.save();
                    f2 = f4;
                    canvasB = canvas;
                }
                canvasB.translate(f2, f6);
                Matrix matrixK = zt2Var.K();
                matrixK.preTranslate(xt2Var.v, xt2Var.w);
                canvasB.concat(matrixK);
                xt2Var.h = z85.e(xt2Var.h, (((long) Float.floatToRawIntBits(xt2Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(xt2Var.v)) << 32));
            } else {
                canvas = canvasB;
            }
            df dfVarC = xt2Var.p;
            if (dfVarC == null) {
                dfVarC = u15.c();
                xt2Var.p = dfVarC;
            }
            dfVarC.d(fA);
            dfVarC.e(iP);
            dfVarC.g(g60VarN);
            Paint paint = dfVarC.a;
            f2 = f4;
            canvasB = canvas;
            canvasB.saveLayer(f2, f6, f7, f8, paint);
            canvasB.translate(f2, f6);
            Matrix matrixK2 = zt2Var.K();
            matrixK2.preTranslate(xt2Var.v, xt2Var.w);
            canvasB.concat(matrixK2);
            xt2Var.h = z85.e(xt2Var.h, (((long) Float.floatToRawIntBits(xt2Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(xt2Var.v)) << 32));
        }
        xt2Var.a();
        if (!zt2Var.r()) {
            try {
                xt2Var.a.C(xt2Var.b, xt2Var.c, xt2Var, xt2Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = zt2Var.M() > 0.0f;
        if (z3) {
            sm0VarK.s();
        }
        boolean z4 = !zIsHardwareAccelerated && xt2Var.A;
        if (z4) {
            sm0VarK.g();
            mb6 mb6VarD = xt2Var.d();
            if (mb6VarD instanceof ae5) {
                sm0.q(sm0VarK, ((ae5) mb6VarD).j0);
            } else if (mb6VarD instanceof be5) {
                lf lfVarA = xt2Var.m;
                if (lfVarA != null) {
                    lfVarA.a.rewind();
                } else {
                    lfVarA = nf.a();
                    xt2Var.m = lfVarA;
                }
                lf.c(lfVarA, ((be5) mb6VarD).j0);
                sm0VarK.l(lfVarA);
            } else {
                if (!(mb6VarD instanceof zd5)) {
                    b61.c();
                    return;
                }
                sm0VarK.l(((zd5) mb6VarD).j0);
            }
        }
        if (xt2Var2 != null) {
            wg wgVar = xt2Var2.r;
            if (!wgVar.a) {
                vc3.a("Only add dependencies during a tracking");
            }
            t05 t05Var = (t05) wgVar.d;
            if (t05Var != null) {
                t05Var.a(xt2Var);
            } else if (((xt2) wgVar.b) != null) {
                t05 t05Var2 = vw6.a;
                t05 t05Var3 = new t05();
                xt2 xt2Var3 = (xt2) wgVar.b;
                xt2Var3.getClass();
                t05Var3.a(xt2Var3);
                t05Var3.a(xt2Var);
                wgVar.d = t05Var3;
                wgVar.b = null;
            } else {
                wgVar.b = xt2Var;
            }
            t05 t05Var4 = (t05) wgVar.e;
            if (t05Var4 != null) {
                z2 = !t05Var4.l(xt2Var);
            } else if (((xt2) wgVar.c) != xt2Var) {
                z2 = true;
            } else {
                wgVar.c = null;
                z2 = false;
            }
            if (z2) {
                xt2Var.q++;
            }
        }
        if (((eb) sm0VarK).a.isHardwareAccelerated()) {
            zt2Var.l(sm0VarK);
        } else {
            um0 um0Var = xt2Var.o;
            if (um0Var == null) {
                um0Var = new um0();
                xt2Var.o = um0Var;
            }
            lr lrVar = um0Var.Y;
            fi1 fi1Var = xt2Var.b;
            z24 z24Var = xt2Var.c;
            long jR = u15.R(xt2Var.u);
            fi1 fi1VarM = lrVar.m();
            z24 z24VarO = lrVar.o();
            sm0 sm0VarK2 = lrVar.k();
            long jP = lrVar.p();
            xt2 xt2Var4 = (xt2) lrVar.Z;
            lrVar.B(fi1Var);
            lrVar.C(z24Var);
            lrVar.A(sm0VarK);
            lrVar.D(jR);
            lrVar.Z = xt2Var;
            sm0VarK.g();
            try {
                xt2Var.c(um0Var);
                sm0VarK.p();
                lrVar.B(fi1VarM);
                lrVar.C(z24VarO);
                lrVar.A(sm0VarK2);
                lrVar.D(jP);
                lrVar.Z = xt2Var4;
            } catch (Throwable th) {
                sm0VarK.p();
                lrVar.B(fi1VarM);
                lrVar.C(z24VarO);
                lrVar.A(sm0VarK2);
                lrVar.D(jP);
                lrVar.Z = xt2Var4;
                throw th;
            }
        }
        if (z4) {
            sm0VarK.p();
        }
        if (z3) {
            sm0VarK.i();
        }
        if (!zIsHardwareAccelerated) {
            canvasB.restore();
        }
        xt2Var.h = j2;
    }

    public static void w(int i2, int i3, cb0 cb0Var) throws s59 {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!I(cb0Var.e(i5, i3))) {
                throw new s59();
            }
            cb0Var.t(i5, i3, 0);
        }
    }

    public static void x(int i2, int i3, cb0 cb0Var) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = S[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                cb0Var.t(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void y(int i2, int i3, cb0 cb0Var) throws s59 {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!I(cb0Var.e(i2, i5))) {
                throw new s59();
            }
            cb0Var.t(i2, i5, 0);
        }
    }

    public static s7 z(int i2) {
        Object next;
        Iterator it = s7.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((s7) next).a == i2) {
                return (s7) next;
            }
        }
        next = null;
        return (s7) next;
    }
}
