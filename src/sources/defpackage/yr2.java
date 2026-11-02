package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import androidx.drawerlayout.widget.DrawerLayout;
import io.sentry.c2;
import java.lang.annotation.Annotation;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yr2 implements hu4, tm, p95, rt4, v06, u06, jh4, u4 {
    public static volatile yr2 Z;
    public static final tp2 f0 = new tp2(1);
    public final /* synthetic */ byte X;
    public Object Y;

    public yr2(byte b) {
        nu4 nu4Var;
        this.X = b;
        switch (b) {
            case 1:
                l06 l06Var = l06.c;
                try {
                    nu4Var = (nu4) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    nu4Var = f0;
                }
                nu4[] nu4VarArr = {tp2.b, nu4Var};
                ep4 ep4Var = new ep4();
                ep4Var.a = nu4VarArr;
                Charset charset = eg3.a;
                this.Y = ep4Var;
                break;
            case 7:
                this.Y = new AtomicInteger(0);
                break;
            case 11:
                this.Y = new c15(0, new l41[16]);
                break;
            case 13:
                this.Y = e02.X;
                break;
            case 22:
                this.Y = z91.p(Looper.getMainLooper());
                break;
            case 24:
                this.Y = new he7(x97.a);
                break;
            case 25:
                this.Y = new ConcurrentHashMap(16);
                break;
            default:
                this.Y = new HashSet();
                break;
        }
    }

    public static yr2 j(Context context, int i) {
        mb6.o(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, v56.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(v56.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(v56.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(v56.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(v56.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListX = ys0.x(context, typedArrayObtainStyledAttributes, v56.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListX2 = ys0.x(context, typedArrayObtainStyledAttributes, v56.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListX3 = ys0.x(context, typedArrayObtainStyledAttributes, v56.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.MaterialCalendarItem_itemStrokeWidth, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendarItem_itemShapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendarItem_itemShapeAppearanceOverlay, 0);
        c0 c0Var = new c0(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        a77 a77VarA = a77.h(contextThemeWrapper.obtainStyledAttributes(v56.ShapeAppearance), c0Var).a();
        typedArrayObtainStyledAttributes.recycle();
        return new yr2(colorStateListX, colorStateListX2, colorStateListX3, dimensionPixelSize, a77VarA, rect);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    public static q82 p(ru2 ru2Var, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        boolean z4 = false;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((hq8) it.next()) instanceof x53) {
                z = true;
                break;
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    hq8 hq8Var = (hq8) it2.next();
                    if ((hq8Var instanceof lt5) || ts7.f(hq8Var)) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    hq8 hq8Var2 = (hq8) it3.next();
                    if ((hq8Var2 instanceof lt5) || (hq8Var2 instanceof k53) || ts7.f(hq8Var2)) {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            }
        } else {
            z3 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (ts7.f((hq8) it4.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        int iOrdinal = ru2Var.a().ordinal();
        qr8 qr8Var = qr8.PREVIEW;
        qr8 qr8Var2 = qr8.VIDEO_CAPTURE;
        if (iOrdinal != 0) {
            qr8 qr8Var3 = qr8.IMAGE_ANALYSIS;
            if (iOrdinal == 1) {
                string = qr8Var + " or " + qr8Var2 + " or " + qr8Var3;
                if (z3) {
                    string = null;
                }
            } else if (iOrdinal == 2) {
                int iOrdinal2 = ((mv8) ru2Var).a.ordinal();
                if (iOrdinal2 == 2) {
                    string = qr8Var2.toString();
                    if (z4) {
                        string = null;
                    }
                } else if (iOrdinal2 != 3) {
                    string = null;
                } else {
                    string = qr8Var + " or " + qr8Var2 + " or " + qr8Var3;
                    if (z3) {
                        string = null;
                    }
                }
            } else if (iOrdinal == 3) {
                string = qr8.IMAGE_CAPTURE.toString();
                if (z) {
                    string = null;
                }
            } else {
                if (iOrdinal != 4) {
                    b61.c();
                    return null;
                }
                string = qr8Var2.toString();
                if (z4) {
                    string = null;
                }
            }
        } else {
            string = qr8Var + " or " + qr8Var2;
            if (z2) {
                string = null;
            }
        }
        if (string != null) {
            return new q82(string, ru2Var);
        }
        return null;
    }

    public static yr2 q(yr2 yr2Var, yr2 yr2Var2) {
        HashMap map;
        HashMap map2;
        if (yr2Var == null || (map = (HashMap) yr2Var.Y) == null || map.isEmpty()) {
            return yr2Var2;
        }
        if (yr2Var2 == null || (map2 = (HashMap) yr2Var2.Y) == null || map2.isEmpty()) {
            return yr2Var;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : ((HashMap) yr2Var2.Y).values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : ((HashMap) yr2Var.Y).values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new yr2((Object) map3, (byte) 5);
    }

    public static void u(yr2 yr2Var, u06 u06Var) {
        if (((u06) yr2Var.Y) == null) {
            yr2Var.Y = u06Var;
        } else {
            c2.g();
        }
    }

    @Override // defpackage.p95
    public w19 C(View view, w19 w19Var) {
        switch (this.X) {
            case 9:
                v20 v20Var = (v20) this.Y;
                v20Var.m = w19Var.a();
                v20Var.n = w19Var.b();
                v20Var.o = w19Var.c();
                v20Var.f();
                break;
            default:
                t19 t19Var = w19Var.a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Y;
                if (!Objects.equals(coordinatorLayout.s0, w19Var)) {
                    coordinatorLayout.s0 = w19Var;
                    boolean z = w19Var.d() > 0;
                    coordinatorLayout.t0 = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!t19Var.r()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = cw8.a;
                            if (!childAt.getFitsSystemWindows() || ((b) childAt.getLayoutParams()).a == null || !t19Var.r()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
        }
        return w19Var;
    }

    @Override // defpackage.hu4
    public boolean N(nt4 nt4Var) {
        a aVar = (a) this.Y;
        if (nt4Var == aVar.Z) {
            return false;
        }
        st4 st4Var = ((gn7) nt4Var).A;
        hu4 hu4Var = aVar.g0;
        if (hu4Var != null) {
            return hu4Var.N(nt4Var);
        }
        return false;
    }

    @Override // defpackage.tm
    public Annotation a(Class cls) {
        HashMap map = (HashMap) this.Y;
        if (map == null) {
            return null;
        }
        return (Annotation) map.get(cls);
    }

    @Override // defpackage.hu4
    public void b(nt4 nt4Var, boolean z) {
        if (nt4Var instanceof gn7) {
            ((gn7) nt4Var).z.k().c(false);
        }
        hu4 hu4Var = ((a) this.Y).g0;
        if (hu4Var != null) {
            hu4Var.b(nt4Var, z);
        }
    }

    @Override // defpackage.rt4
    public void c(nt4 nt4Var, MenuItem menuItem) {
        ((qo0) this.Y).i0.removeCallbacksAndMessages(nt4Var);
    }

    public void d(LayoutNode layoutNode) {
        if (!layoutNode.K()) {
            wc3.b("DepthSortedSet.add called on an unattached node");
        }
        ((he7) this.Y).add(layoutNode);
    }

    public boolean e(int i, int i2) {
        gv gvVar = (gv) this.Y;
        Object obj = gvVar.X.get(i);
        Object obj2 = gvVar.Y.get(i2);
        if (obj != null && obj2 != null) {
            return ((nr4) gvVar.f0.b.Z).c(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.u4
    public boolean f(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.Y;
        if (!DrawerLayout.i(view) || drawerLayout.f(view) == 2) {
            return false;
        }
        drawerLayout.b(view);
        return true;
    }

    public boolean g(int i, int i2) {
        gv gvVar = (gv) this.Y;
        Object obj = gvVar.X.get(i);
        Object obj2 = gvVar.Y.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((nr4) gvVar.f0.b.Z).d(obj, obj2);
    }

    @Override // defpackage.v06
    public Object get() {
        switch (this.X) {
            case 18:
                return new lr((byte) 20, (Context) ((f4) this.Y).X, new f08((byte) 13), new f08((byte) 9), false);
            default:
                u06 u06Var = (u06) this.Y;
                if (u06Var != null) {
                    return u06Var.get();
                }
                c2.g();
                return null;
        }
    }

    public float h(qa2 qa2Var, qa2 qa2Var2) {
        int i = (int) qa2Var.a;
        int i2 = (int) qa2Var.b;
        int i3 = (int) qa2Var2.a;
        int i4 = (int) qa2Var2.b;
        float fX = x(i, i2, i3, i4);
        float fX2 = x((int) qa2Var2.a, i4, (int) qa2Var.a, i2);
        if (Float.isNaN(fX)) {
            return fX2 / 7.0f;
        }
        return Float.isNaN(fX2) ? fX / 7.0f : (fX + fX2) / 14.0f;
    }

    public void i(CancellationException cancellationException) {
        c15 c15Var = (c15) this.Y;
        int i = c15Var.Z;
        lm0[] lm0VarArr = new lm0[i];
        for (int i2 = 0; i2 < i; i2++) {
            lm0VarArr[i2] = ((l41) c15Var.X[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            lm0VarArr[i3].z(cancellationException);
        }
        if (c15Var.Z == 0) {
            return;
        }
        zc3.c("uncancelled requests present");
    }

    @Override // defpackage.rt4
    public void k(nt4 nt4Var, st4 st4Var) {
        qo0 qo0Var = (qo0) this.Y;
        Handler handler = qo0Var.i0;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = qo0Var.k0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (nt4Var == ((po0) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new oo0(this, i2 < arrayList.size() ? (po0) arrayList.get(i2) : null, st4Var, nt4Var, (byte) 0), nt4Var, SystemClock.uptimeMillis() + 200);
    }

    public void l() {
        ((m01) this.Y).getClass();
    }

    public w8 m(float f, float f2, int i, int i2) {
        w8 w8VarB;
        w8 w8VarB2;
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        w50 w50Var = (w50) this.Y;
        int iMin = Math.min(w50Var.X - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw f65.a();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(w50Var.Y - 1, i2 + i3) - iMax2;
        if (iMin2 < f3) {
            throw f65.a();
        }
        w50 w50Var2 = (w50) this.Y;
        x8 x8Var = new x8(w50Var2, iMax, iMax2, iMin, iMin2, f);
        int i4 = x8Var.e;
        int i5 = x8Var.c;
        int i6 = i4 + i5;
        int i7 = x8Var.f;
        int i8 = (i7 / 2) + x8Var.d;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !w50Var2.b(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!w50Var2.b(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (x8Var.a(iArr) && (w8VarB2 = x8Var.b(i10, i11, iArr)) != null) {
                        return w8VarB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (x8Var.a(iArr) && (w8VarB = x8Var.b(i10, i6, iArr)) != null) {
                return w8VarB;
            }
        }
        ArrayList arrayList = x8Var.b;
        if (arrayList.isEmpty()) {
            throw f65.a();
        }
        return (w8) arrayList.get(0);
    }

    public Object n(int i, int i2) {
        gv gvVar = (gv) this.Y;
        Object obj = gvVar.X.get(i);
        Object obj2 = gvVar.Y.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((nr4) gvVar.f0.b.Z).y(obj, obj2);
    }

    public r82 o(xy0 xy0Var, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            r82 r82VarO = o(xy0Var, arrayList, i2, wv0.I0(list, arrayList.get(i)));
            return r82VarO instanceof n82 ? r82VarO : o(xy0Var, arrayList, i2, list);
        }
        LinkedHashSet<ru2> linkedHashSetZ = q57.Z((Set) xy0Var.f0, list);
        linkedHashSetZ.toString();
        Objects.toString((List) xy0Var.h0);
        hi5.z0("DefaultFeatureGroupResolver");
        ArrayList arrayList2 = new ArrayList(xv0.Z(linkedHashSetZ, 10));
        Iterator it = linkedHashSetZ.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ru2) it.next()).a());
        }
        for (s82 s82Var : wv0.Y0(wv0.b1(arrayList2))) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : linkedHashSetZ) {
                if (((ru2) obj).a() == s82Var) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList3.size() > 1) {
                return o82.a;
            }
        }
        aj0 aj0Var = (aj0) this.Y;
        jf6 jf6Var = new jf6(linkedHashSetZ);
        for (ru2 ru2Var : linkedHashSetZ) {
            if (!ru2Var.b(aj0Var, xy0Var)) {
                ru2Var.toString();
                hi5.z0("CameraInfoInternal");
                return o82.a;
            }
        }
        try {
            bs7.e(aj0Var, xy0Var, jf6Var);
            return new n82(new jf6(linkedHashSetZ));
        } catch (IllegalArgumentException | nl0 unused) {
            hi5.z0("CameraInfoInternal");
        }
    }

    @Override // defpackage.jh4
    public void r(String str, DnsTTLogType dnsTTLogType) {
        byte b = this.X;
        dnsTTLogType.getClass();
        switch (b) {
            case 27:
                ((vr1) this.Y).c(str, false);
                break;
            default:
                ((gn2) this.Y).B(str);
                break;
        }
    }

    public boolean s(LayoutNode layoutNode) {
        if (!layoutNode.K()) {
            wc3.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((he7) this.Y).remove(layoutNode);
    }

    @Override // defpackage.tm
    public int size() {
        HashMap map = (HashMap) this.Y;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void t() {
        c15 c15Var = (c15) this.Y;
        kf3 kf3VarA0 = x97.a0(0, c15Var.Z);
        int i = kf3VarA0.X;
        int i2 = kf3VarA0.Y;
        if (i <= i2) {
            while (true) {
                ((l41) c15Var.X[i]).b.f(dn8.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c15Var.g();
    }

    public String toString() {
        switch (this.X) {
            case 5:
                HashMap map = (HashMap) this.Y;
                return map == null ? "[null]" : map.toString();
            case 24:
                return ((he7) this.Y).toString();
            default:
                return super.toString();
        }
    }

    public float w(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        double dSqrt;
        int i11 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int i12 = i8 - i6;
        int iAbs2 = Math.abs(i12);
        int i13 = 2;
        int i14 = (-iAbs) / 2;
        int i15 = i5 < i7 ? 1 : -1;
        int i16 = i6 < i8 ? 1 : -1;
        int i17 = i7 + i15;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 == i17) {
                i9 = i5;
                i10 = i13;
                break;
            }
            boolean z2 = z;
            i9 = i5;
            if ((i20 == i11 ? i11 : 0) == ((w50) this.Y).b(z ? i19 : i18, z ? i18 : i19)) {
                if (i20 == 2) {
                    double d = i18 - i9;
                    double d2 = i19 - i6;
                    dSqrt = Math.sqrt((d2 * d2) + (d * d));
                } else {
                    i20++;
                }
                return (float) dSqrt;
            }
            i14 += iAbs2;
            if (i14 > 0) {
                if (i19 == i8) {
                    i10 = 2;
                    break;
                }
                i19 += i16;
                i14 -= iAbs;
            }
            i18 += i15;
            i5 = i9;
            i6 = i6;
            z = z2;
            i11 = 1;
            i13 = 2;
        }
        if (i20 != i10) {
            return Float.NaN;
        }
        double d3 = i17 - i9;
        double d4 = i12;
        dSqrt = Math.sqrt((d4 * d4) + (d3 * d3));
        return (float) dSqrt;
    }

    public float x(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        w50 w50Var = (w50) this.Y;
        float fW = w(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = w50Var.X;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = w50Var.Y;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (w(i, i2, (int) (((i5 - i) * f2) + i), i6) + fW) - 1.0f;
    }

    public void y(int i, Object obj, bx6 bx6Var) {
        mv0 mv0Var = (mv0) this.Y;
        mv0Var.B(i, 3);
        bx6Var.h((e2) obj, mv0Var.a);
        mv0Var.B(i, 4);
    }

    public /* synthetic */ yr2(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public yr2(mv0 mv0Var) {
        this.X = (byte) 15;
        Charset charset = eg3.a;
        this.Y = mv0Var;
        mv0Var.a = this;
    }

    public /* synthetic */ yr2(byte b, boolean z) {
        this.X = b;
    }

    public yr2(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, a77 a77Var, Rect rect) {
        this.X = (byte) 12;
        mb6.q(rect.left);
        mb6.q(rect.top);
        mb6.q(rect.right);
        mb6.q(rect.bottom);
        this.Y = a77Var;
    }
}
