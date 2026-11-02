package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.j;
import com.google.android.material.appbar.MaterialToolbar;
import io.sentry.c2;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yn0 {
    public static Method f;
    public static boolean g;
    public static g73 i;
    public static final q51[] a = new q51[0];
    public static final zy0 b = new zy0(520354115, false, new cz0(1));
    public static final w73 c = new w73(false);
    public static final int[] d = {1, 10, 100, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
    public static final Object e = new Object();
    public static final mv4 h = new mv4(12);

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static kj5[] B(String str) {
        int i2;
        String strTrim;
        float[] fArrZ;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i4, i5).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArrZ = new float[i3];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i6 = i3;
                                    int i7 = 1;
                                    while (i7 < length) {
                                        int i8 = i3;
                                        int i9 = i8;
                                        int i10 = i9;
                                        int i11 = i10;
                                        for (int i12 = i7; i12 < strTrim.length(); i12++) {
                                            char cCharAt2 = strTrim.charAt(i12);
                                            if (cCharAt2 == ' ') {
                                                i8 = 0;
                                                i10 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i8 = 0;
                                                        i10 = 1;
                                                        break;
                                                    case '-':
                                                        if (i12 == i7 || i8 != 0) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i9 == 0) {
                                                            i8 = 0;
                                                            i9 = 1;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                            } else {
                                                i8 = 1;
                                            }
                                            if (i10 != 0) {
                                                if (i7 < i12) {
                                                    fArr[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                                    i6++;
                                                }
                                                if (i11 != 0) {
                                                    i7 = i12;
                                                } else {
                                                    i7 = i12 + 1;
                                                }
                                                i3 = 0;
                                            }
                                        }
                                        if (i7 < i12) {
                                            fArr[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                            i6++;
                                        }
                                        if (i11 != 0) {
                                            i7 = i12;
                                        } else {
                                            i7 = i12 + 1;
                                        }
                                        i3 = 0;
                                    }
                                    fArrZ = z(fArr, i6);
                                    i3 = 0;
                                } catch (NumberFormatException e2) {
                                    xw3.o(pc6.p("error in parsing \"", strTrim, "\""), e2);
                                    return null;
                                }
                            }
                            arrayList.add(new kj5(strTrim.charAt(i3), fArrZ));
                        }
                        i4 = i5;
                        i5++;
                        i3 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i5++;
            }
            strTrim = str.substring(i4, i5).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    fArrZ = new float[i3];
                } else {
                    fArrZ = new float[i3];
                }
                arrayList.add(new kj5(strTrim.charAt(i3), fArrZ));
            }
            i4 = i5;
            i5++;
            i3 = 0;
        }
        if (i5 - i4 != 1 || i4 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new kj5(str.charAt(i4), new float[0]));
        }
        return (kj5[]) arrayList.toArray(new kj5[i2]);
    }

    public static int C(Context context, int i2, int i3) {
        TypedValue typedValueE0 = u70.e0(context.getTheme(), i2);
        Integer numValueOf = typedValueE0 != null ? Integer.valueOf(b0(context, typedValueE0)) : null;
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static dd7 D() {
        return (dd7) kd7.b.get();
    }

    public static Intent F(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strH = H(appCompatActivity, appCompatActivity.getComponentName());
            if (strH == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strH);
            try {
                return H(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent G(AppCompatActivity appCompatActivity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strH = H(appCompatActivity, componentName);
        if (strH == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strH);
        return H(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String H(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static ArrayList J(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final boolean K(lp2 lp2Var) {
        boolean z = false;
        boolean z2 = (((Configuration) lp2Var.j(pc.a)).uiMode & 48) == 32;
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            ss8 ss8Var = ss8.a;
            objK = ss8.e();
            lp2Var.g0(objK);
        }
        zr zrVar = (zr) objK;
        boolean zG = lp2Var.g(z2);
        Object objK2 = lp2Var.K();
        if (zG || objK2 == beVar) {
            int i2 = or.a[zrVar.ordinal()];
            if (i2 == 1) {
                z = z2;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    b61.c();
                    return false;
                }
                z = true;
            }
            objK2 = Boolean.valueOf(z);
            lp2Var.g0(objK2);
        }
        return ((Boolean) objK2).booleanValue();
    }

    public static boolean L(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = qw0.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        if (dArr.length != 3) {
            bt.q("outXyz must have a length of 3.");
            return false;
        }
        double d2 = ((double) iRed) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iGreen) / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) iBlue) / 255.0d;
        double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static int N(int i2, float f2, int i3) {
        return qw0.b(qw0.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static final aa7 O(t14 t14Var) {
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        if (mo8VarQ0 instanceof ce2) {
            return ((ce2) mo8VarQ0).Y;
        }
        if (mo8VarQ0 instanceof aa7) {
            return (aa7) mo8VarQ0;
        }
        b61.c();
        return null;
    }

    public static dd7 P(dd7 dd7Var) {
        if (dd7Var instanceof pe8) {
            pe8 pe8Var = (pe8) dd7Var;
            if (pe8Var.t == ry7.f()) {
                pe8Var.r = null;
                return dd7Var;
            }
        }
        if (dd7Var instanceof qe8) {
            qe8 qe8Var = (qe8) dd7Var;
            if (qe8Var.i == ry7.f()) {
                qe8Var.h = null;
                return dd7Var;
            }
        }
        dd7 dd7VarE = kd7.e(dd7Var, null, false);
        dd7VarE.j();
        return dd7VarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(kj5[] kj5VarArr, Path path) {
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        kj5[] kj5VarArr2 = kj5VarArr;
        float[] fArr = new float[6];
        int length = kj5VarArr2.length;
        int i3 = 0;
        int i4 = 0;
        char c2 = 'm';
        while (i4 < length) {
            kj5 kj5Var = kj5VarArr2[i4];
            char c3 = kj5Var.a;
            float[] fArr2 = kj5Var.b;
            float f12 = fArr[i3];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            int i5 = i3;
            float f17 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i2 = 2;
                    break;
            }
            float f18 = f16;
            float f19 = f17;
            float f20 = f12;
            float f21 = f13;
            int i6 = i5;
            while (i6 < fArr2.length) {
                if (c3 == 'A') {
                    fArr2 = fArr2;
                    i6 = i6;
                    kj5Var = kj5Var;
                    float f22 = f21;
                    i4 = i4;
                    int i7 = i6 + 5;
                    int i8 = i6 + 6;
                    kj5.a(path, f20, f22, fArr2[i7], fArr2[i8], fArr2[i6], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f ? 1 : i5, fArr2[i6 + 4] != 0.0f ? 1 : i5);
                    f14 = fArr2[i7];
                    f2 = fArr2[i8];
                    f15 = f2;
                    f3 = f14;
                } else if (c3 == 'C') {
                    fArr2 = fArr2;
                    i6 = i6;
                    i4 = i4;
                    kj5Var = kj5Var;
                    int i9 = i6 + 2;
                    int i10 = i6 + 3;
                    int i11 = i6 + 4;
                    int i12 = i6 + 5;
                    path.cubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                    float f23 = fArr2[i11];
                    float f24 = fArr2[i12];
                    f14 = fArr2[i9];
                    f15 = fArr2[i10];
                    f2 = f24;
                    f3 = f23;
                } else if (c3 == 'H') {
                    fArr2 = fArr2;
                    i6 = i6;
                    kj5Var = kj5Var;
                    f2 = f21;
                    i4 = i4;
                    path.lineTo(fArr2[i6], f2);
                    f3 = fArr2[i6];
                } else if (c3 == 'Q') {
                    fArr2 = fArr2;
                    i6 = i6;
                    i4 = i4;
                    kj5Var = kj5Var;
                    int i13 = i6 + 1;
                    int i14 = i6 + 2;
                    int i15 = i6 + 3;
                    path.quadTo(fArr2[i6], fArr2[i13], fArr2[i14], fArr2[i15]);
                    float f25 = fArr2[i6];
                    float f26 = fArr2[i13];
                    float f27 = fArr2[i14];
                    float f28 = fArr2[i15];
                    f14 = f25;
                    f15 = f26;
                    f3 = f27;
                    f2 = f28;
                } else if (c3 == 'V') {
                    fArr2 = fArr2;
                    i6 = i6;
                    i4 = i4;
                    kj5Var = kj5Var;
                    f3 = f20;
                    path.lineTo(f3, fArr2[i6]);
                    f2 = fArr2[i6];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr2 = fArr2;
                        i6 = i6;
                        int i16 = i6 + 2;
                        int i17 = i6 + 3;
                        int i18 = i6 + 4;
                        int i19 = i6 + 5;
                        path.rCubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                        float f29 = fArr2[i16] + f20;
                        float f30 = fArr2[i17] + f21;
                        f20 += fArr2[i18];
                        f21 += fArr2[i19];
                        f14 = f29;
                        f15 = f30;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr2 = fArr2;
                                    i6 = i6;
                                    int i20 = i6 + 1;
                                    path.lineTo(fArr2[i6], fArr2[i20]);
                                    f3 = fArr2[i6];
                                    f2 = fArr2[i20];
                                } else if (c3 == 'M') {
                                    fArr2 = fArr2;
                                    i6 = i6;
                                    f3 = fArr2[i6];
                                    f2 = fArr2[i6 + 1];
                                    if (i6 > 0) {
                                        path.lineTo(f3, f2);
                                    } else {
                                        path.moveTo(f3, f2);
                                        f18 = f3;
                                        f19 = f2;
                                    }
                                } else if (c3 == 'S') {
                                    fArr2 = fArr2;
                                    i6 = i6;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f20 = (f20 * 2.0f) - f14;
                                        f21 = (f21 * 2.0f) - f15;
                                    }
                                    float f31 = f20;
                                    float f32 = f21;
                                    int i21 = i6 + 1;
                                    int i22 = i6 + 2;
                                    int i23 = i6 + 3;
                                    path.cubicTo(f31, f32, fArr2[i6], fArr2[i21], fArr2[i22], fArr2[i23]);
                                    f14 = fArr2[i6];
                                    f15 = fArr2[i21];
                                    f3 = fArr2[i22];
                                    f2 = fArr2[i23];
                                } else if (c3 == 'T') {
                                    fArr2 = fArr2;
                                    i6 = i6;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f20 = (f20 * 2.0f) - f14;
                                        f21 = (f21 * 2.0f) - f15;
                                    }
                                    int i24 = i6 + 1;
                                    path.quadTo(f20, f21, fArr2[i6], fArr2[i24]);
                                    f3 = fArr2[i6];
                                    f2 = fArr2[i24];
                                    kj5Var = kj5Var;
                                    f14 = f20;
                                    f15 = f21;
                                } else if (c3 == 'l') {
                                    fArr2 = fArr2;
                                    i6 = i6;
                                    int i25 = i6 + 1;
                                    path.rLineTo(fArr2[i6], fArr2[i25]);
                                    f20 += fArr2[i6];
                                    f7 = fArr2[i25];
                                } else if (c3 == 'm') {
                                    fArr2 = fArr2;
                                    i6 = i6;
                                    float f33 = fArr2[i6];
                                    f20 += f33;
                                    float f34 = fArr2[i6 + 1];
                                    f21 += f34;
                                    if (i6 > 0) {
                                        path.rLineTo(f33, f34);
                                    } else {
                                        path.rMoveTo(f33, f34);
                                        kj5Var = kj5Var;
                                        f3 = f20;
                                        f18 = f3;
                                        f2 = f21;
                                        f19 = f2;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 != 't') {
                                        f3 = f20;
                                    } else {
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f10 = f20 - f14;
                                            f11 = f21 - f15;
                                        } else {
                                            f11 = 0.0f;
                                            f10 = 0.0f;
                                        }
                                        int i26 = i6 + 1;
                                        path.rQuadTo(f10, f11, fArr2[i6], fArr2[i26]);
                                        float f35 = f10 + f20;
                                        float f36 = f11 + f21;
                                        float f37 = f20 + fArr2[i6];
                                        f21 += fArr2[i26];
                                        f15 = f36;
                                        f3 = f37;
                                        f14 = f35;
                                    }
                                    f2 = f21;
                                } else {
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f8 = f21 - f15;
                                        f9 = f20 - f14;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i27 = i6;
                                    int i28 = i27 + 1;
                                    int i29 = i27 + 2;
                                    int i30 = i27 + 3;
                                    fArr2 = fArr2;
                                    i6 = i27;
                                    path.rCubicTo(f9, f8, fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                    f4 = fArr2[i6] + f20;
                                    f5 = fArr2[i28] + f21;
                                    f20 += fArr2[i29];
                                    f6 = fArr2[i30];
                                }
                                kj5Var = kj5Var;
                            } else {
                                fArr2 = fArr2;
                                i6 = i6;
                                path.rLineTo(0.0f, fArr2[i6]);
                                f7 = fArr2[i6];
                            }
                            f21 += f7;
                        } else {
                            fArr2 = fArr2;
                            i6 = i6;
                            int i31 = i6 + 1;
                            int i32 = i6 + 2;
                            int i33 = i6 + 3;
                            path.rQuadTo(fArr2[i6], fArr2[i31], fArr2[i32], fArr2[i33]);
                            f4 = fArr2[i6] + f20;
                            f5 = fArr2[i31] + f21;
                            f20 += fArr2[i32];
                            f6 = fArr2[i33];
                        }
                        f21 += f6;
                        f14 = f4;
                        f15 = f5;
                    } else {
                        fArr2 = fArr2;
                        i6 = i6;
                        path.rLineTo(fArr2[i6], 0.0f);
                        f20 += fArr2[i6];
                    }
                    kj5Var = kj5Var;
                    f3 = f20;
                    f2 = f21;
                } else {
                    fArr2 = fArr2;
                    i6 = i6;
                    int i34 = i6 + 5;
                    float f38 = fArr2[i34] + f20;
                    int i35 = i6 + 6;
                    float f39 = fArr2[i35] + f21;
                    kj5Var = kj5Var;
                    float f40 = f20;
                    float f41 = f21;
                    i4 = i4;
                    kj5.a(path, f40, f41, f38, f39, fArr2[i6], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f ? 1 : i5, fArr2[i6 + 4] != 0.0f ? 1 : i5);
                    f3 = f40 + fArr2[i34];
                    f2 = f41 + fArr2[i35];
                    f14 = f3;
                    f15 = f2;
                }
                i6 += i2;
                path = path;
                kj5Var = kj5Var;
                c3 = c3;
                i4 = i4;
                f20 = f3;
                f21 = f2;
                c2 = c3;
                fArr2 = fArr2;
            }
            fArr[i5] = f20;
            fArr[1] = f21;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f18;
            fArr[5] = f19;
            c2 = kj5Var.a;
            i4++;
            kj5VarArr2 = kj5VarArr;
            i3 = i5;
        }
    }

    public static Object R(k8 k8Var, dn2 dn2Var) {
        dd7 pe8Var;
        dd7 dd7Var = (dd7) kd7.b.get();
        if (dd7Var instanceof pe8) {
            pe8 pe8Var2 = (pe8) dd7Var;
            if (pe8Var2.t == ry7.f()) {
                gn2 gn2Var = pe8Var2.r;
                gn2 gn2Var2 = pe8Var2.s;
                try {
                    ((pe8) dd7Var).r = kd7.i(k8Var, gn2Var, true);
                    ((pe8) dd7Var).s = gn2Var2;
                    return dn2Var.invoke();
                } finally {
                    pe8Var2.r = gn2Var;
                    pe8Var2.s = gn2Var2;
                }
            }
        }
        if (dd7Var == null || (dd7Var instanceof x05)) {
            pe8Var = new pe8(dd7Var instanceof x05 ? (x05) dd7Var : null, k8Var, null, true, false);
        } else {
            pe8Var = dd7Var.u(k8Var);
        }
        try {
            dd7 dd7VarJ = pe8Var.j();
            try {
                Object objInvoke = dn2Var.invoke();
                dd7.q(dd7VarJ);
                pe8Var.c();
                return objInvoke;
            } catch (Throwable th) {
                dd7.q(dd7VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            pe8Var.c();
            throw th2;
        }
    }

    public static final jx4 T(c15 c15Var) {
        int i2;
        if (c15Var == null || (i2 = c15Var.Z) == 0) {
            return null;
        }
        return (jx4) c15Var.k(i2 - 1);
    }

    public static void U(k04 k04Var, Annotation annotation) throws InvocationTargetException {
        Class clsM = zc1.M(zc1.K(annotation));
        i04 i04VarF = k04Var.f(ia6.a(clsM), new ga6(annotation));
        if (i04VarF != null) {
            V(i04VarF, annotation, clsM);
        }
    }

    public static void V(i04 i04Var, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                v15 v15VarE = v15.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    i04Var.n(v15VarE, u((Class) objInvoke));
                } else if (rb6.a.contains(enclosingClass)) {
                    i04Var.g(v15VarE, objInvoke);
                } else {
                    List list = ia6.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        i04Var.t(v15VarE, ia6.a(enclosingClass), v15.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) eu.D0(interfaces);
                        cls2.getClass();
                        i04 i04VarW = i04Var.w(ia6.a(cls2), v15VarE);
                        if (i04VarW != null) {
                            V(i04VarW, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        j04 j04VarR = i04Var.r(v15VarE);
                        if (j04VarR != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                qs0 qs0VarA = ia6.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    j04VarR.e(qs0VarA, v15.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    j04VarR.h(u((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    i04 i04VarA = j04VarR.a(ia6.a(componentType));
                                    if (i04VarA != null) {
                                        obj3.getClass();
                                        V(i04VarA, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    j04VarR.b(obj4);
                                }
                            }
                            j04VarR.c();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        i04Var.c();
    }

    public static final void W(nh1 nh1Var) {
        ua autofillManager;
        LayoutNode layoutNodeZ = Z(nh1Var);
        if (layoutNodeZ.v0) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) q34.a(layoutNodeZ);
        if (!AndroidComposeView.b() || (autofillManager = androidComposeView.getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.h0;
        u86 u86Var = autofillManager.f0;
        LayoutNode layoutNode = (LayoutNode) u86Var.a.b(layoutNodeZ.Y);
        if (layoutNode == null || layoutNode.i0 == -4) {
            return;
        }
        ne neVar = u86Var.c;
        int iD = u86Var.d(layoutNode);
        long[] jArr = (long[]) neVar.c;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        autofillManager.X.g(autofillManager.Z, layoutNodeZ.Y, rect);
    }

    public static final i55 X(nh1 nh1Var, int i2) {
        i55 i55Var = ((jx4) nh1Var).X.j0;
        i55Var.getClass();
        if (i55Var.V0() != nh1Var || !j55.g(i2)) {
            return i55Var;
        }
        i55 i55Var2 = i55Var.x0;
        i55Var2.getClass();
        return i55Var2;
    }

    public static final i55 Y(nh1 nh1Var) {
        if (!((jx4) nh1Var).X.p0) {
            wc3.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        i55 i55VarX = X(nh1Var, 2);
        if (!i55VarX.V0().p0) {
            wc3.b("LayoutCoordinates is not attached.");
        }
        return i55VarX;
    }

    public static final LayoutNode Z(nh1 nh1Var) {
        i55 i55Var = ((jx4) nh1Var).X.j0;
        if (i55Var != null) {
            return i55Var.w0;
        }
        throw p61.j("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final void a(zo8 zo8Var, final boolean z, final gn2 gn2Var, final kx4 kx4Var, lp2 lp2Var, final int i2) {
        int i3;
        kx4 kx4Var2;
        lp2 lp2Var2;
        int i4;
        d44 d44Var;
        y05 y05Var;
        be beVar;
        boolean z2;
        byte b2;
        final zo8 zo8Var2 = zo8Var;
        lp2 lp2Var3 = lp2Var;
        lp2Var3.X(2012454552);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var3.f(zo8Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var3.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var3.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            kx4Var2 = kx4Var;
            i3 |= lp2Var3.f(kx4Var2) ? 2048 : 1024;
        } else {
            kx4Var2 = kx4Var;
        }
        if (lp2Var3.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object objK = lp2Var3.K();
            be beVar2 = zz0.a;
            if (objK == beVar2) {
                objK = z51.H(Boolean.FALSE);
                lp2Var3.g0(objK);
            }
            y05 y05Var2 = (y05) objK;
            kx4 kx4VarF0 = hi5.f0(kx4Var2);
            wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var3, 54);
            int iHashCode = Long.hashCode(lp2Var3.T);
            kl5 kl5VarL = lp2Var3.l();
            kx4 kx4VarQ = w45.Q(lp2Var3, kx4VarF0);
            uz0.j.getClass();
            lp2Var3.Z();
            if (lp2Var3.S) {
                lp2Var3.k();
            } else {
                lp2Var3.j0();
            }
            pn7.m(pz2.B0, lp2Var3, wq6VarA);
            pn7.m(pz2.A0, lp2Var3, kl5VarL);
            pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode));
            pn7.l(lp2Var3);
            pn7.m(pz2.z0, lp2Var3, kx4VarQ);
            d44 d44Var2 = new d44(1.0f, true);
            if (z) {
                lp2Var2 = lp2Var3;
                i4 = i3;
                d44Var = d44Var2;
                y05Var = y05Var2;
                beVar = beVar2;
                z2 = false;
                lp2Var2.W(-81400570);
                lp2Var2.p(false);
            } else {
                lp2Var3.W(-82063009);
                String strJ0 = vj8.j0(y46.later, lp2Var3);
                o88 o88VarA = o88.a(((ds) lp2Var3.j(es.a)).a.d, 0L, 0L, dj2.f0, null, 0L, 0L, null, 16777211);
                ig5 ig5Var = new ig5(12.0f, 12.0f, 12.0f, 12.0f);
                ox1 ox1Var = ep.z;
                long j = ((dp) lp2Var3.j(ox1Var)).g.f;
                long j2 = ((dp) lp2Var3.j(ox1Var)).g.f;
                long j3 = ((dp) lp2Var3.j(ox1Var)).g.j;
                long j4 = ((dp) lp2Var3.j(ox1Var)).g.j;
                dw0 dw0Var = new dw0(j);
                dw0 dw0Var2 = new dw0(j2);
                dw0 dw0Var3 = new dw0(j3);
                dw0 dw0Var4 = new dw0(j4);
                boolean z3 = (i3 & 896) == 256;
                Object objK2 = lp2Var3.K();
                if (z3 || objK2 == beVar2) {
                    b2 = 1;
                    objK2 = new ba3(gn2Var, b2);
                    lp2Var3.g0(objK2);
                } else {
                    b2 = 1;
                }
                dn2 dn2Var = (dn2) objK2;
                int i5 = i3;
                d44Var = d44Var2;
                beVar = beVar2;
                i4 = i5;
                y05Var = y05Var2;
                z2 = false;
                km4.e(strJ0, d44Var, false, false, o88VarA, 0, 0, 0, 0, false, ig5Var, null, dw0Var, dw0Var2, dw0Var3, dw0Var4, dn2Var, lp2Var3, 0, 412652);
                lp2Var2 = lp2Var3;
                lp2Var2.p(false);
            }
            String strJ1 = vj8.j0(y46.update, lp2Var2);
            o88 o88VarA2 = o88.a(((ds) lp2Var2.j(es.a)).a.d, 0L, 0L, dj2.f0, null, 0L, 0L, null, 16777211);
            ig5 ig5Var2 = new ig5(12.0f, 12.0f, 12.0f, 12.0f);
            boolean zBooleanValue = ((Boolean) y05Var.getValue()).booleanValue();
            boolean z4 = (i4 & 896) == 256 ? true : z2;
            if ((i4 & 14) == 4) {
                z2 = true;
            }
            boolean z5 = z2 | z4;
            Object objK3 = lp2Var2.K();
            if (z5 || objK3 == beVar) {
                zo8Var2 = zo8Var;
                objK3 = new g00((Object) gn2Var, (Object) zo8Var2, (Object) y05Var, (byte) 8);
                lp2Var2.g0(objK3);
            } else {
                zo8Var2 = zo8Var;
            }
            km4.e(strJ1, d44Var, false, zBooleanValue, o88VarA2, 0, 0, 0, 0, false, ig5Var2, null, null, null, null, null, (dn2) objK3, lp2Var, 0, 523236);
            lp2Var3 = lp2Var;
            lp2Var3.p(true);
        } else {
            lp2Var3.Q();
        }
        j86 j86VarR = lp2Var3.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: ca3
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yn0.a(zo8Var2, z, gn2Var, kx4Var, (lp2) obj, w79.P(i2 | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final mf5 a0(nh1 nh1Var) {
        mf5 mf5Var = Z(nh1Var).q0;
        if (mf5Var != null) {
            return mf5Var;
        }
        throw p61.j("This node does not have an owner.");
    }

    public static final void b(int i2, gn2 gn2Var, lp2 lp2Var, kx4 kx4Var) {
        int i3;
        lp2Var.X(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if (lp2Var.N(i3 & 1, (i3 & 19) != 18)) {
            ch3.f(lp2Var, w79.r(kx4Var, gn2Var));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wm0(kx4Var, gn2Var, i2);
        }
    }

    public static int b0(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValue.data;
    }

    public static final void c(r68 r68Var, boolean z, zy0 zy0Var, lp2 lp2Var, int i2) {
        int i3;
        lp2Var.X(-579239002);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.h(r68Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.h(zy0Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ch3.b(r68Var, z, zy0Var, lp2Var, i3 & 1022);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new mx0(r68Var, z, zy0Var, i2, (byte) 1);
        }
    }

    public static void c0(dd7 dd7Var, dd7 dd7Var2, gn2 gn2Var) {
        if (dd7Var != dd7Var2) {
            dd7Var2.getClass();
            dd7.q(dd7Var);
            dd7Var2.c();
        } else if (dd7Var instanceof pe8) {
            ((pe8) dd7Var).r = gn2Var;
        } else if (dd7Var instanceof qe8) {
            ((qe8) dd7Var).h = gn2Var;
        } else {
            b61.o(dd7Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void d(by2 by2Var, ky2 ky2Var, dn2 dn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        kx4 kx4Var2;
        ky2 ky2Var2;
        lp2Var.X(-354854627);
        int i3 = i2 | (lp2Var.f(by2Var) ? 4 : 2) | (lp2Var.f(ky2Var) ? 32 : 16) | (lp2Var.h(dn2Var) ? 256 : 128);
        byte b2 = 1;
        if (lp2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (objK == obj) {
                objK = u70.D(lp2Var);
                lp2Var.g0(objK);
            }
            b71 b71Var = (b71) objK;
            float fH0 = ((fi1) lp2Var.j(y01.h)).h0((int) (((y74) ((t09) lp2Var.j(y01.u))).a() >> 32));
            boolean zC = lp2Var.c(fH0);
            Object objK2 = lp2Var.K();
            if (zC || objK2 == obj) {
                objK2 = Float.valueOf(fH0 / 2.0f);
                lp2Var.g0(objK2);
            }
            float fFloatValue = ((Number) objK2).floatValue();
            Object objK3 = lp2Var.K();
            if (objK3 == obj) {
                objK3 = z51.b(0.0f);
                lp2Var.g0(objK3);
            }
            oi oiVar = (oi) objK3;
            float fM = x97.m(1.0f - (Math.abs(((Number) oiVar.d()).floatValue()) / fFloatValue), 0.0f, 1.0f);
            jm6 jm6VarA = km6.a(10.0f);
            boolean zH = ((i3 & 896) == 256) | lp2Var.h(oiVar) | lp2Var.c(fM);
            Object objK4 = lp2Var.K();
            if (zH || objK4 == obj) {
                objK4 = new cd(oiVar, fM, dn2Var, b2);
                lp2Var.g0(objK4);
            }
            kx4 kx4VarI = jm4.I(hx4.X, (gn2) objK4);
            boolean zH2 = lp2Var.h(b71Var) | ((i3 & 112) == 32) | lp2Var.h(oiVar) | lp2Var.c(fFloatValue) | lp2Var.c(fH0);
            Object objK5 = lp2Var.K();
            if (zH2 || objK5 == obj) {
                ky2Var2 = ky2Var;
                Object hy2Var = new hy2(ky2Var2, b71Var, oiVar, fFloatValue, fH0);
                lp2Var.g0(hy2Var);
                objK5 = hy2Var;
            } else {
                ky2Var2 = ky2Var;
            }
            kx4Var2 = kx4Var;
            f(by2Var, ky2Var2, u15.e(mb6.a0(yy7.a(kx4VarI, dn8.a, (PointerInputEventHandler) objK5), 4.0f, jm6VarA), ((dp) lp2Var.j(ep.z)).n.a, jm6VarA).y(kx4Var2), lp2Var, i3 & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            kx4Var2 = kx4Var;
            ky2Var2 = ky2Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new j30(by2Var, ky2Var2, dn2Var, kx4Var2, i2, (byte) 2);
        }
    }

    public static final void e(by2 by2Var, ky2 ky2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        int i3;
        ky2 ky2Var2;
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(1516593646);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var2.f(by2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ky2Var2 = ky2Var;
            i3 |= lp2Var2.f(ky2Var2) ? 32 : 16;
        } else {
            ky2Var2 = ky2Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var2.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var2.N(i3 & 1, (i3 & 147) != 146)) {
            o50 o50Var = pz2.o0;
            be beVar = ht.d;
            wq6 wq6VarA = vq6.a(beVar, o50Var, lp2Var2, 54);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var2, wq6VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var2, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var2, numValueOf);
            pn7.l(lp2Var2);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var2, kx4VarQ);
            kx4 kx4VarK = w39.k(new d44(1.0f, true), km6.a(12.0f));
            hx4 hx4Var = hx4.X;
            b.g(hx4Var, 12.0f);
            b.k(hx4Var, 6.0f);
            u15.g(((dp) lp2Var2.j(ep.z)).n.b, b.b(b.k(hx4Var, 0.5f), 20.0f));
            lp2Var2 = lp2Var;
            lp2Var2.W(-1256529435);
            Iterator it = by2Var.c.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    c2.m();
                    return;
                }
                boolean zF = lp2Var2.f(null) | ((i3 & 112) == 32);
                Object objK = lp2Var2.K();
                if (zF || objK == zz0.a) {
                    objK = new tv2((byte) 15);
                    lp2Var2.g0(objK);
                }
                kx4 kx4VarZ = os4.z(vj8.x(kx4VarK, false, null, null, null, (dn2) objK, lp2Var2, 31), 0.0f, 12.0f, 1);
                wq6 wq6VarA2 = vq6.a(beVar, o50Var, lp2Var2, 54);
                int iHashCode2 = Long.hashCode(lp2Var2.T);
                kl5 kl5VarL2 = lp2Var2.l();
                kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarZ);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, wq6VarA2);
                pn7.m(dx0Var2, lp2Var2, kl5VarL2);
                oi0.u(iHashCode2, lp2Var2, dx0Var3, lp2Var2);
                pn7.m(dx0Var4, lp2Var2, kx4VarQ2);
                throw null;
            }
            lp2Var2.p(false);
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new dy2(by2Var, ky2Var2, kx4Var, i2, (byte) 1);
        }
    }

    public static final void e0(h4 h4Var, y07 y07Var) {
        Object objG = y07Var.k().X.g(c17.f);
        if (objG == null) {
            objG = null;
        }
        sv0 sv0Var = (sv0) objG;
        if (sv0Var != null) {
            h4Var.n(f4.a(sv0Var.a, sv0Var.b, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = y07Var.k().X.g(c17.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                y07 y07Var2 = (y07) listI.get(i2);
                if (y07Var2.k().X.c(c17.K)) {
                    arrayList.add(y07Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zT = t(arrayList);
        h4Var.n(f4.a(zT ? 1 : arrayList.size(), zT ? arrayList.size() : 1, 0));
    }

    public static final void f(by2 by2Var, ky2 ky2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        int i3;
        ky2 ky2Var2;
        boolean z;
        int i4;
        by2 by2Var2 = by2Var;
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(2086731882);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var2.f(by2Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var2.f(ky2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var2.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i3;
        if (lp2Var2.N(i5 & 1, (i5 & 147) != 146)) {
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var2, 0);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var2, tw0VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var2, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var2, numValueOf);
            pn7.l(lp2Var2);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var2, kx4VarQ);
            kx4 kx4VarZ = os4.z(b.a, 32.0f, 0.0f, 2);
            hx4 hx4Var = hx4.X;
            ch3.f(lp2Var2, b.b(hx4Var, 12.0f));
            wq6 wq6VarA = vq6.a(ht.d, pz2.o0, lp2Var2, 54);
            int iHashCode2 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL2 = lp2Var2.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarZ);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var, lp2Var2, wq6VarA);
            pn7.m(dx0Var2, lp2Var2, kl5VarL2);
            oi0.u(iHashCode2, lp2Var2, dx0Var3, lp2Var2);
            pn7.m(dx0Var4, lp2Var2, kx4VarQ2);
            kx4 kx4VarK = b.k(hx4Var, 12.0f);
            int iOrdinal = by2Var2.b.ordinal();
            if (iOrdinal != 0) {
                z = true;
                if (iOrdinal == 1) {
                    i4 = q36.ic_snackbar_negative;
                } else {
                    if (iOrdinal != 2) {
                        b61.c();
                        return;
                    }
                    i4 = q36.ic_snackbar_info;
                }
            } else {
                z = true;
                i4 = q36.ic_snackbar_positive;
            }
            boolean z2 = z;
            os4.a(u28.p(i4, lp2Var2), kx4VarK, null, 0L, lp2Var2, 48, 12);
            ch3.f(lp2Var2, b.k(hx4Var, 12.0f));
            String str = by2Var2.a;
            o88 o88Var = ((ds) lp2Var2.j(es.a)).d;
            ox1 ox1Var = ep.z;
            o88 o88VarA = o88.a(o88Var, ((dp) lp2Var2.j(ox1Var)).c.a, 0L, dj2.f0, null, 0L, 0L, null, 16777210);
            lp2Var2 = lp2Var;
            zc1.g(str, null, o88VarA, 3, 0, 0, 0, false, null, lp2Var2, 0, 498);
            lp2Var2.p(z2);
            ch3.f(lp2Var2, b.b(hx4Var, 12.0f));
            ch3.f(lp2Var2, u15.f(b.b(kx4VarZ, 0.5f), ((dp) lp2Var2.j(ox1Var)).n.b, u70.e));
            by2Var2 = by2Var;
            ky2Var2 = ky2Var;
            e(by2Var2, ky2Var2, kx4VarZ, lp2Var2, (i5 & 14) | 384 | (i5 & 112));
            lp2Var2.p(z2);
        } else {
            ky2Var2 = ky2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new dy2(by2Var2, ky2Var2, kx4Var, i2, (byte) 0);
        }
    }

    public static final void g(ky2 ky2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        ky2Var.getClass();
        lp2Var.X(-751332875);
        int i3 = (lp2Var.f(kx4Var) ? 32 : 16) | i2;
        byte b2 = 18;
        if (lp2Var.N(i3 & 1, (i3 & 19) != 18)) {
            by2 by2Var = (by2) ky2Var.b.getValue();
            Object objK = lp2Var.K();
            q51 q51Var = null;
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = z51.H(null);
                lp2Var.g0(objK);
            }
            y05 y05Var = (y05) objK;
            boolean zF = lp2Var.f(by2Var);
            Object objK2 = lp2Var.K();
            if (zF || objK2 == beVar) {
                objK2 = new k(by2Var, y05Var, q51Var, (byte) 13);
                lp2Var.g0(objK2);
            }
            u70.h((rn2) objK2, lp2Var, by2Var);
            boolean z = by2Var != null;
            Object objK3 = lp2Var.K();
            if (objK3 == beVar) {
                objK3 = new ya2((byte) 17);
                lp2Var.g0(objK3);
            }
            ug8 ug8Var = b22.a;
            Map map = iz8.a;
            long j = 4294967297L;
            g22 g22Var = new g22(new be8((u72) null, new eb7(new a22((gn2) objK3, (byte) 4), wl7.V(0.0f, 400.0f, new hf3(j), 1)), (fp0) null, (qw6) null, (LinkedHashMap) null, 125));
            Object objK4 = lp2Var.K();
            if (objK4 == beVar) {
                objK4 = new ya2(b2);
                lp2Var.g0(objK4);
            }
            zc1.c(z, kx4Var, g22Var, new h62(new be8((u72) null, new eb7(new a22((gn2) objK4, (byte) 5), wl7.V(0.0f, 400.0f, new hf3(j), 1)), (fp0) null, (qw6) null, (LinkedHashMap) null, 125)), null, jm4.U(-1945215283, new o90((Object) y05Var, (Object) ky2Var, (byte) 4), lp2Var), lp2Var, 200064 | (i3 & 112), 16);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 14, i2, ky2Var, kx4Var);
        }
    }

    public static final String g0(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final void h(ha3 ha3Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        ha3 ha3Var2;
        y05 y05Var;
        float f2;
        lp2 lp2Var2 = lp2Var;
        zo8 zo8Var = ha3Var.a;
        gn2Var.getClass();
        lp2Var2.X(-922452338);
        int i3 = i2 | (lp2Var2.f(ha3Var) ? 4 : 2) | (lp2Var2.h(gn2Var) ? 32 : 16);
        if (lp2Var2.N(i3 & 1, (i3 & 147) != 146)) {
            ox1 ox1Var = ep.z;
            kx4 kx4VarF = u15.f(kx4Var, ((dp) lp2Var2.j(ox1Var)).b.a, u70.e);
            n50 n50Var = pz2.q0;
            dt dtVar = ht.c;
            tw0 tw0VarA = rw0.a(dtVar, n50Var, lp2Var2, 0);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4VarF);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var2, tw0VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var2, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var2, numValueOf);
            pn7.l(lp2Var2);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var2, kx4VarQ);
            Object objK = lp2Var2.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = z51.H(Boolean.FALSE);
                lp2Var2.g0(objK);
            }
            y05 y05Var2 = (y05) objK;
            Object objK2 = lp2Var2.K();
            if (objK2 == beVar) {
                objK2 = z51.H(Boolean.FALSE);
                lp2Var2.g0(objK2);
            }
            y05 y05Var3 = (y05) objK2;
            FillElement fillElement = b.a;
            kx4 kx4VarZ = os4.z(fillElement, 16.0f, 0.0f, 2);
            hx4 hx4Var = hx4.X;
            ch3.f(lp2Var2, b.b(hx4Var, 16.0f));
            wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var2, 54);
            int iHashCode2 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL2 = lp2Var2.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarZ);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var, lp2Var2, wq6VarA);
            pn7.m(dx0Var2, lp2Var2, kl5VarL2);
            oi0.u(iHashCode2, lp2Var2, dx0Var3, lp2Var2);
            pn7.m(dx0Var4, lp2Var2, kx4VarQ2);
            os4.a(u28.p(q36.ic_info, lp2Var2), null, null, ((dp) lp2Var2.j(ox1Var)).c.a, lp2Var2, 0, 6);
            mn7.b(zo8Var, xq6.a(), lp2Var2, 0);
            lp2Var2.p(true);
            ch3.f(lp2Var2, b.b(hx4Var, 16.0f));
            kx4 kx4VarV = dh3.V(g33.e(b.c(hx4Var, 0.0f, 1)), dh3.G(lp2Var2));
            tw0 tw0VarA2 = rw0.a(dtVar, n50Var, lp2Var2, 0);
            int iHashCode3 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL3 = lp2Var2.l();
            kx4 kx4VarQ3 = w45.Q(lp2Var2, kx4VarV);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var, lp2Var2, tw0VarA2);
            pn7.m(dx0Var2, lp2Var2, kl5VarL3);
            oi0.u(iHashCode3, lp2Var2, dx0Var3, lp2Var2);
            pn7.m(dx0Var4, lp2Var2, kx4VarQ3);
            String str = zo8Var.g0;
            int i4 = ((Boolean) y05Var2.getValue()).booleanValue() ? Integer.MAX_VALUE : 3;
            ox1 ox1Var2 = es.a;
            o88 o88VarA = o88.a(((ds) lp2Var2.j(ox1Var2)).d, ((dp) lp2Var2.j(ox1Var)).c.c, 0L, null, null, 0L, 0L, null, 16777214);
            Object objK3 = lp2Var2.K();
            if (objK3 == beVar) {
                y05Var = y05Var3;
                objK3 = new gh(y05Var, (byte) 7);
                lp2Var2.g0(objK3);
            } else {
                y05Var = y05Var3;
            }
            lp2Var2 = lp2Var;
            zc1.g(str, kx4VarZ, o88VarA, 0, 1, i4, 0, false, (gn2) objK3, lp2Var2, 113270832, 72);
            lp2Var2.p(true);
            if (((Boolean) y05Var.getValue()).booleanValue()) {
                lp2Var2.W(-935106622);
                ch3.f(lp2Var2, b.b(hx4Var, 8.0f));
                wq6 wq6VarA2 = vq6.a(ht.a, pz2.n0, lp2Var2, 0);
                int iHashCode4 = Long.hashCode(lp2Var2.T);
                kl5 kl5VarL4 = lp2Var2.l();
                kx4 kx4VarQ4 = w45.Q(lp2Var2, fillElement);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, wq6VarA2);
                pn7.m(dx0Var2, lp2Var2, kl5VarL4);
                oi0.u(iHashCode4, lp2Var2, dx0Var3, lp2Var2);
                pn7.m(dx0Var4, lp2Var2, kx4VarQ4);
                ch3.f(lp2Var2, xq6.a());
                String strJ0 = vj8.j0(((Boolean) y05Var2.getValue()).booleanValue() ? y46.less : y46.more, lp2Var2);
                o88 o88VarA2 = o88.a(((ds) lp2Var2.j(ox1Var2)).d, ((dp) lp2Var2.j(ox1Var)).c.b, 0L, null, null, 0L, 0L, null, 16777214);
                Object objK4 = lp2Var2.K();
                if (objK4 == beVar) {
                    objK4 = new eh(y05Var2, (byte) 4);
                    lp2Var2.g0(objK4);
                }
                kx4 kx4VarY = os4.y(vj8.x(hx4Var, false, null, null, null, (dn2) objK4, lp2Var2, 31), 8.0f, 4.0f);
                lp2Var2 = lp2Var;
                zc1.g(strJ0, kx4VarY, o88VarA2, 0, 0, 1, 0, false, null, lp2Var2, 196608, 472);
                f2 = 16.0f;
                ch3.f(lp2Var2, b.k(hx4Var, 16.0f));
                lp2Var2.p(true);
                lp2Var2.p(false);
            } else {
                f2 = 16.0f;
                lp2Var2.W(-934403170);
                lp2Var2.p(false);
            }
            ch3.f(lp2Var2, b.b(hx4Var, f2));
            ha3Var2 = ha3Var;
            a(zo8Var, ha3Var2.b, gn2Var, kx4VarZ, lp2Var2, ((i3 << 3) & 896) | 3072);
            ch3.f(lp2Var2, b.b(hx4Var, f2));
            lp2Var2.p(true);
        } else {
            ha3Var2 = ha3Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) ha3Var2, (Object) gn2Var, kx4Var, i2, (byte) 7);
        }
    }

    public static final aa7 h0(t14 t14Var) {
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        if (mo8VarQ0 instanceof ce2) {
            return ((ce2) mo8VarQ0).Z;
        }
        if (mo8VarQ0 instanceof aa7) {
            return (aa7) mo8VarQ0;
        }
        b61.c();
        return null;
    }

    public static final void i(n84 n84Var, d94 d94Var, dn2 dn2Var, lp2 lp2Var, int i2) {
        lp2Var.X(-709389590);
        int i3 = i2 | 16 | (lp2Var.h(dn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                d94Var = (d94) lp2Var.j(rd4.a);
            } else {
                lp2Var.Q();
            }
            lp2Var.q();
            if (n84Var == n84.ON_DESTROY) {
                bt.q("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            y05 y05VarP = z51.P(dn2Var, lp2Var);
            boolean zF = lp2Var.f(y05VarP) | lp2Var.h(d94Var);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                objK = new sn((Object) d94Var, (Object) n84Var, (Object) y05VarP, (byte) 13);
                lp2Var.g0(objK);
            }
            u70.a(d94Var, (gn2) objK, lp2Var);
        } else {
            lp2Var.Q();
        }
        d94 d94Var2 = d94Var;
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) n84Var, (Object) d94Var2, (on2) dn2Var, i2, (byte) 9);
        }
    }

    public static final void j(Boolean bool, Object obj, d94 d94Var, gn2 gn2Var, lp2 lp2Var, int i2) {
        int i3;
        lp2Var.X(696924721);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.h(gn2Var) ? 2048 : 1024;
        }
        if (lp2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                d94Var = (d94) lp2Var.j(rd4.a);
            } else {
                lp2Var.Q();
            }
            int i4 = i3 & (-897);
            lp2Var.q();
            boolean zF = lp2Var.f(bool) | lp2Var.f(obj) | lp2Var.f(d94Var);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                objK = new l94(d94Var.getH0());
                lp2Var.g0(objK);
            }
            k(d94Var, (l94) objK, gn2Var, lp2Var, (i4 >> 3) & 896);
        } else {
            lp2Var.Q();
        }
        d94 d94Var2 = d94Var;
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i40(bool, obj, d94Var2, gn2Var, i2, (byte) 3);
        }
    }

    public static final void k(d94 d94Var, l94 l94Var, gn2 gn2Var, lp2 lp2Var, int i2) {
        int i3;
        lp2Var.X(228371534);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.h(d94Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(l94Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.h(gn2Var) ? 256 : 128;
        }
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = lp2Var.h(l94Var) | ((i3 & 896) == 256) | lp2Var.h(d94Var);
            Object objK = lp2Var.K();
            if (zH || objK == zz0.a) {
                objK = new sn((Object) d94Var, (Object) l94Var, (Object) gn2Var, (byte) 14);
                lp2Var.g0(objK);
            }
            u70.b(d94Var, l94Var, (gn2) objK, lp2Var);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) d94Var, (Object) l94Var, (Object) gn2Var, i2, (byte) 12);
        }
    }

    public static final void l(gw5 gw5Var, dn2 dn2Var, dn2 dn2Var2, lp2 lp2Var, int i2, int i3) {
        gw5Var.getClass();
        dn2Var.getClass();
        lp2Var.X(603732892);
        dn2 dn2Var3 = (i3 & 8) != 0 ? null : dn2Var2;
        boolean z = (((i2 & 14) ^ 6) > 4 && lp2Var.h(gw5Var)) || (i2 & 6) == 4;
        Object objK = lp2Var.K();
        if (z || objK == zz0.a) {
            al5 al5Var = new al5(1, gw5Var, gw5.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/duplicated_name/ProfileDuplicatedNameUiIntent;)V", 0, (byte) 3);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        ch3.c(dn2Var, vj8.j0(y46.warning_text, lp2Var), false, null, jm4.U(495553431, new fh((Object) dn2Var, objK, (Object) dn2Var3, (byte) 15), lp2Var), z91.a, lp2Var, ((i2 >> 3) & 14) | 1772544 | (i2 & 896), 16);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new tx2(gw5Var, dn2Var, dn2Var3, i2, i3);
        }
    }

    public static final void m(b83 b83Var, String str, String str2, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        b83Var.getClass();
        gn2Var.getClass();
        lp2Var.X(-560236253);
        int i3 = i2 | (lp2Var.f(b83Var) ? 4 : 2) | (lp2Var.f(str != null ? new RouteProfileId(str) : null) ? 32 : 16) | (lp2Var.f(str2 != null ? new RouteProfileId(str2) : null) ? 256 : 128) | (lp2Var.h(gn2Var) ? 2048 : 1024);
        if (lp2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            FillElement fillElement = b.a;
            kx4 kx4VarE = g33.e(kx4Var);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objK = lp2Var.K();
            if (z || objK == zz0.a) {
                vf vfVar = new vf(b83Var, str, str2, gn2Var, fillElement);
                lp2Var.g0(vfVar);
                objK = vfVar;
            }
            jb5.a(kx4VarE, null, 0.0f, null, null, null, null, false, null, false, (gn2) objK, lp2Var, 0, 2046);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new no5(b83Var, str, str2, gn2Var, kx4Var, i2, (byte) 1);
        }
    }

    public static final void n(c15 c15Var, jx4 jx4Var) {
        c15 c15VarC = Z(jx4Var).C();
        int i2 = c15VarC.Z - 1;
        Object[] objArr = c15VarC.X;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                c15Var.b((jx4) ((LayoutNode) objArr[i2]).H0.i0);
                i2--;
            }
        }
    }

    public static final List o(zu3 zu3Var) {
        zu3Var.getClass();
        return w27.n0(new sd2(w27.i0(zu3Var, ag.m0), ag.n0, z27.X));
    }

    public static final tn3 p(rd1 rd1Var) {
        rd1Var.getClass();
        tn3 tn3Var = rd1Var instanceof tn3 ? (tn3) rd1Var : null;
        if (tn3Var != null) {
            return tn3Var;
        }
        bt.i(oi0.j(yb6.a, rd1Var.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final void q(ol7 ol7Var) {
        ol7Var.getClass();
        if ((ol7Var instanceof ol7 ? ol7Var : null) != null) {
            return;
        }
        bt.i(oi0.j(yb6.a, ol7Var.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g34 r(jx4 jx4Var) {
        if ((jx4Var.Z & 2) != 0) {
            if (jx4Var instanceof g34) {
                return (g34) jx4Var;
            }
            if (jx4Var instanceof oh1) {
                jx4 jx4Var2 = ((oh1) jx4Var).r0;
                while (jx4Var2 != 0) {
                    if (jx4Var2 instanceof g34) {
                        return (g34) jx4Var2;
                    }
                    jx4Var2 = (!(jx4Var2 instanceof oh1) || (jx4Var2.Z & 2) == 0) ? jx4Var2.h0 : ((oh1) jx4Var2).r0;
                }
            }
        }
        return null;
    }

    public static final Object s(nh1 nh1Var, dn2 dn2Var, s51 s51Var) {
        Object obj;
        i55 i55VarY;
        Object objT;
        t6 t6Var;
        if (((jx4) nh1Var).X.p0) {
            jx4 jx4Var = (jx4) nh1Var;
            if (!jx4Var.X.p0) {
                wc3.b("visitAncestors called on an unattached node");
            }
            jx4 jx4Var2 = jx4Var.X.g0;
            LayoutNode layoutNodeZ = Z(nh1Var);
            loop0: while (true) {
                obj = null;
                if (layoutNodeZ == null) {
                    break;
                }
                if ((((jx4) layoutNodeZ.H0.i0).f0 & 524288) != 0) {
                    while (jx4Var2 != null) {
                        if ((jx4Var2.Z & 524288) != 0) {
                            jx4 jx4VarT = jx4Var2;
                            c15 c15Var = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof n80) {
                                    obj = jx4VarT;
                                    break loop0;
                                }
                                if ((jx4VarT.Z & 524288) != 0 && (jx4VarT instanceof oh1)) {
                                    int i2 = 0;
                                    for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                        if ((jx4Var3.Z & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                jx4VarT = jx4Var3;
                                            } else {
                                                if (c15Var == null) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var.b(jx4Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                jx4VarT = T(c15Var);
                            }
                        }
                        jx4Var2 = jx4Var2.g0;
                    }
                }
                layoutNodeZ = layoutNodeZ.w();
                jx4Var2 = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
            }
            n80 n80Var = (n80) obj;
            if (n80Var != null && (objT = n80Var.T((i55VarY = Y(nh1Var)), new p5(dn2Var, i55VarY, (byte) 11), s51Var)) == c71.X) {
                return objT;
            }
        }
        return dn8.a;
    }

    public static final boolean t(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = d02.X;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    y07 y07Var = (y07) obj2;
                    y07 y07Var2 = (y07) obj;
                    arrayList2.add(new z85((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (y07Var2.g().d() >> 32)) - Float.intBitsToFloat((int) (y07Var.g().d() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (y07Var2.g().d() & 4294967295L)) - Float.intBitsToFloat((int) (y07Var.g().d() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((z85) wv0.r0(list)).a;
            } else {
                if (list.isEmpty()) {
                    tb4.c("Empty collection can't be reduced.");
                }
                Object objR0 = wv0.r0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objR0 = new z85(z85.f(((z85) objR0).a, ((z85) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j = ((z85) objR0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static vs0 u(Class cls) {
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            qs0 qs0VarA = ia6.a(cls);
            String str = ll3.a;
            qs0 qs0VarG = ll3.g(qs0VarA.a());
            if (qs0VarG != null) {
                qs0VarA = qs0VarG;
            }
            return new vs0(qs0VarA, i2);
        }
        if (cls.equals(Void.TYPE)) {
            fk2 fk2VarI = tg7.d.i();
            return new vs0(new qs0(fk2VarI.b(), fk2VarI.a.g()), i2);
        }
        du5 du5VarC = ut3.b(cls.getName()).c();
        du5VarC.getClass();
        if (i2 > 0) {
            fk2 fk2Var = (fk2) du5VarC.f0.getValue();
            fk2Var.getClass();
            return new vs0(new qs0(fk2Var.b(), fk2Var.a.g()), i2 - 1);
        }
        fk2 fk2Var2 = (fk2) du5VarC.Z.getValue();
        fk2Var2.getClass();
        return new vs0(new qs0(fk2Var2.b(), fk2Var2.a.g()), i2);
    }

    public static int v(int i2, int i3) {
        return qw0.d(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static int w(q96 q96Var, td5 td5Var, View view, View view2, j jVar, boolean z) {
        if (jVar.I() == 0 || q96Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(j.T(view) - j.T(view2)) + 1;
        }
        return Math.min(td5Var.n(), td5Var.d(view2) - td5Var.g(view));
    }

    public static int x(q96 q96Var, td5 td5Var, View view, View view2, j jVar, boolean z, boolean z2) {
        if (jVar.I() == 0 || q96Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (q96Var.b() - Math.max(j.T(view), j.T(view2))) - 1) : Math.max(0, Math.min(j.T(view), j.T(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(td5Var.d(view2) - td5Var.g(view)) / (Math.abs(j.T(view) - j.T(view2)) + 1))) + (td5Var.m() - td5Var.g(view)));
        }
        return iMax;
    }

    public static int y(q96 q96Var, td5 td5Var, View view, View view2, j jVar, boolean z) {
        if (jVar.I() == 0 || q96Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return q96Var.b();
        }
        return (int) (((td5Var.d(view2) - td5Var.g(view)) / (Math.abs(j.T(view) - j.T(view2)) + 1)) * q96Var.b());
    }

    public static float[] z(float[] fArr, int i2) {
        if (i2 < 0) {
            kp5.e();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public abstract Intent A(Context context, Object obj);

    public abstract InputFilter[] E(InputFilter[] inputFilterArr);

    public g4 I(Context context, Object obj) {
        return null;
    }

    public abstract boolean M();

    public abstract Object S(Intent intent, int i2);

    public abstract void d0(boolean z);

    public abstract void f0(boolean z);

    public abstract TransformationMethod i0(TransformationMethod transformationMethod);
}
