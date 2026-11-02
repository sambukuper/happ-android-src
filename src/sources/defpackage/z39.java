package defpackage;

import android.animation.TimeInterpolator;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import io.sentry.c2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z39 implements hb7 {
    public static final zy0 X = new zy0(614164583, false, new l4(3));
    public static final zy0 Y = new zy0(575287914, false, new dx0(4));
    public static final ii1 Z = new ii1(1.0f, 1.0f);
    public static final cg f0 = new cg((byte) 5);
    public static final byte[] g0 = {48, 49, 53, 0};
    public static final byte[] h0 = {48, 49, 48, 0};
    public static final byte[] i0 = {48, 48, 57, 0};
    public static final byte[] j0 = {48, 48, 53, 0};
    public static final byte[] k0 = {48, 48, 49, 0};
    public static final byte[] l0 = {48, 48, 49, 0};
    public static final byte[] m0 = {48, 48, 50, 0};
    public static final int n0 = 9;
    public static final int o0 = 10;
    public static final int p0 = 12;

    public static final oc7 A(ArrayList arrayList) {
        oc7 oc7Var = new oc7();
        for (Object obj : arrayList) {
            et4 et4Var = (et4) obj;
            if (et4Var != null && et4Var != dt4.b) {
                oc7Var.add(obj);
            }
        }
        return oc7Var;
    }

    public static final int B(f74 f74Var) {
        return f74Var.o + f74Var.p;
    }

    public static float C(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return by1.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static TimeInterpolator D(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            bt.q("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!z(strValueOf, "cubic-bezier") && !z(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (z(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(x(strArrSplit, 0), x(strArrSplit, 1), x(strArrSplit, 2), x(strArrSplit, 3));
            }
            xw3.h(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!z(strValueOf, "path")) {
            bt.q("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            yn0.Q(yn0.B(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            xw3.o("Error in parsing ".concat(strSubstring), e);
            return null;
        }
    }

    public static uf7 E(Context context, int i, int i2) {
        TypedValue typedValueE0 = u70.e0(context.getTheme(), i);
        TypedArray typedArrayObtainStyledAttributes = typedValueE0 == null ? context.obtainStyledAttributes(null, v56.MaterialSpring, 0, i2) : context.obtainStyledAttributes(typedValueE0.resourceId, v56.MaterialSpring);
        uf7 uf7Var = new uf7();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(v56.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(v56.MaterialSpring_damping, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            uf7Var.b(f);
            uf7Var.a(f2);
            typedArrayObtainStyledAttributes.recycle();
            return uf7Var;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean F(int i, boolean z) {
        int i2;
        if (!z || 29 > (i2 = Build.VERSION.SDK_INT) || i2 >= 33) {
            return false;
        }
        return i == 1 || i == 2 || i == 6;
    }

    public static final kx4 G(rn2 rn2Var) {
        return new j38(rn2Var);
    }

    public static boolean H(xi8 xi8Var, zk6 zk6Var, zk6 zk6Var2) {
        if (xi8Var.c(zk6Var) == xi8Var.c(zk6Var2) && xi8Var.C0(zk6Var) == xi8Var.C0(zk6Var2) && xi8Var.J(zk6Var) == xi8Var.J(zk6Var2) && xi8Var.i0(xi8Var.E(zk6Var), xi8Var.E(zk6Var2))) {
            if (xi8Var.g0(zk6Var, zk6Var2)) {
                return true;
            }
            int iC = xi8Var.c(zk6Var);
            for (int i = 0; i < iC; i++) {
                bh8 bh8VarA0 = xi8Var.A0(zk6Var, i);
                bh8 bh8VarA1 = xi8Var.A0(zk6Var2, i);
                if (xi8Var.j(bh8VarA0) == xi8Var.j(bh8VarA1)) {
                    if (!xi8Var.j(bh8VarA0)) {
                        if (xi8Var.l(bh8VarA0) == xi8Var.l(bh8VarA1)) {
                            x14 x14VarP = xi8Var.p(bh8VarA0);
                            x14VarP.getClass();
                            x14 x14VarP2 = xi8Var.p(bh8VarA1);
                            x14VarP2.getClass();
                            if (!I(xi8Var, x14VarP, x14VarP2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean I(xi8 xi8Var, x14 x14Var, x14 x14Var2) {
        if (x14Var == x14Var2) {
            return true;
        }
        zk6 zk6VarT0 = xi8Var.t0(x14Var);
        zk6 zk6VarT1 = xi8Var.t0(x14Var2);
        if (zk6VarT0 != null && zk6VarT1 != null) {
            return H(xi8Var, zk6VarT0, zk6VarT1);
        }
        fe2 fe2VarO0 = xi8Var.o0(x14Var);
        fe2 fe2VarO1 = xi8Var.o0(x14Var2);
        return fe2VarO0 != null && fe2VarO1 != null && H(xi8Var, xi8Var.i(fe2VarO0), xi8Var.i(fe2VarO1)) && H(xi8Var, xi8Var.h(fe2VarO0), xi8Var.h(fe2VarO1));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    public static final gu0 J(ql qlVar) {
        List list = qlVar.Z;
        d02 d02Var = d02.X;
        List list2 = list == null ? d02Var : list;
        CharSequence charSequence = qlVar.Y;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            q02 q02Var = new q02((byte) 0);
            q02Var.Y = Parcel.obtain();
            if (list == null) {
                list = d02Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                pl plVar = (pl) list.get(i);
                qe7 qe7Var = (qe7) plVar.a;
                int i2 = plVar.b;
                int i3 = plVar.c;
                ((Parcel) q02Var.Y).recycle();
                q02Var.Y = Parcel.obtain();
                f78 f78Var = qe7Var.a;
                long j = qe7Var.l;
                long j2 = qe7Var.h;
                int i4 = i;
                long j3 = qe7Var.b;
                List list3 = list;
                int i5 = size;
                long jB = f78Var.b();
                long j4 = dw0.g;
                if (!tk8.a(jB, j4)) {
                    q02Var.C((byte) 1);
                    ((Parcel) q02Var.Y).writeLong(qe7Var.a.b());
                }
                long j5 = v88.c;
                byte b = 2;
                if (!v88.a(j3, j5)) {
                    q02Var.C((byte) 2);
                    q02Var.E(j3);
                }
                dj2 dj2Var = qe7Var.c;
                if (dj2Var != null) {
                    q02Var.C((byte) 3);
                    ((Parcel) q02Var.Y).writeInt(dj2Var.X);
                }
                bj2 bj2Var = qe7Var.d;
                if (bj2Var != null) {
                    int i6 = bj2Var.a;
                    q02Var.C((byte) 4);
                    q02Var.C((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                cj2 cj2Var = qe7Var.e;
                if (cj2Var != null) {
                    int i7 = cj2Var.a;
                    q02Var.C((byte) 5);
                    if (i7 == 0) {
                        b = 0;
                    } else if (i7 == 65535) {
                        b = 1;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    q02Var.C(b);
                }
                String str = qe7Var.g;
                if (str != null) {
                    q02Var.C((byte) 6);
                    ((Parcel) q02Var.Y).writeString(str);
                }
                if (!v88.a(j2, j5)) {
                    q02Var.C((byte) 7);
                    q02Var.E(j2);
                }
                x20 x20Var = qe7Var.i;
                if (x20Var != null) {
                    float f = x20Var.a;
                    q02Var.C((byte) 8);
                    q02Var.D(f);
                }
                g78 g78Var = qe7Var.j;
                if (g78Var != null) {
                    q02Var.C((byte) 9);
                    q02Var.D(g78Var.a);
                    q02Var.D(g78Var.b);
                }
                if (!tk8.a(j, j4)) {
                    q02Var.C((byte) 10);
                    ((Parcel) q02Var.Y).writeLong(j);
                }
                x38 x38Var = qe7Var.m;
                if (x38Var != null) {
                    q02Var.C((byte) 11);
                    ((Parcel) q02Var.Y).writeInt(x38Var.a);
                }
                t67 t67Var = qe7Var.n;
                if (t67Var != null) {
                    q02Var.C((byte) 12);
                    ((Parcel) q02Var.Y).writeLong(t67Var.a);
                    long j6 = t67Var.b;
                    q02Var.D(Float.intBitsToFloat((int) (j6 >> 32)));
                    q02Var.D(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    q02Var.D(t67Var.c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) q02Var.Y).marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i5;
            }
            charSequence = spannableString;
        }
        return new gu0(ClipData.newPlainText("plain text", charSequence));
    }

    public static final int K(e74 e74Var) {
        List list = e74Var.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((f74) list.get(i2)).n;
        }
        return (i / list.size()) + e74Var.r;
    }

    public static final int L(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final void c(kx4 kx4Var, lp2 lp2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kx4Var = hx4.X;
        }
        jb5.b(kx4Var, 1.0f, ((dp) lp2Var.j(ep.z)).d.a, lp2Var, (i & 14) | 48);
    }

    public static void d(bc7 bc7Var, List list, r01 r01Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = bc7Var.c((gp2) list.get(i));
            int iM = bc7Var.M(bc7Var.b, bc7Var.q(iC));
            Object obj = iM < bc7Var.f(bc7Var.b, bc7Var.q(iC + 1)) ? bc7Var.c[bc7Var.g(iM)] : zz0.a;
            j86 j86Var = obj instanceof j86 ? (j86) obj : null;
            if (j86Var != null) {
                j86Var.a = r01Var;
            }
        }
    }

    public static void e(Appendable appendable, Object obj, gn2 gn2Var) {
        if (gn2Var != null) {
            appendable.append((CharSequence) gn2Var.B(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final Drawable g(d53 d53Var, Resources resources) {
        if (d53Var instanceof yv1) {
            return ((yv1) d53Var).a;
        }
        return d53Var instanceof d60 ? new BitmapDrawable(resources, ((d60) d53Var).a) : new x4(d53Var, (byte) 1);
    }

    public static final d53 h(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new d60(((BitmapDrawable) drawable).getBitmap()) : new yv1(drawable);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(kv5 kv5Var, dn2 dn2Var, s51 s51Var) {
        gv5 gv5Var;
        if (s51Var instanceof gv5) {
            gv5Var = (gv5) s51Var;
            int i = gv5Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                gv5Var.h0 = i - Integer.MIN_VALUE;
            } else {
                gv5Var = new gv5(s51Var);
            }
        } else {
            gv5Var = new gv5(s51Var);
        }
        Object obj = gv5Var.g0;
        int i2 = gv5Var.h0;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                s61 s61Var = gv5Var.Y;
                s61Var.getClass();
                if (s61Var.H0(oy1.E0) != kv5Var) {
                    bt.i("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                gv5Var.f0 = dn2Var;
                gv5Var.h0 = 1;
                mm0 mm0Var = new mm0(1, mb6.H(gv5Var));
                mm0Var.s();
                kv5Var.o0(new f0(mm0Var, (byte) 27));
                Object objQ = mm0Var.q();
                c71 c71Var = c71.X;
                if (objQ == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dn2Var = gv5Var.f0;
                w39.n0(obj);
            }
            dn2Var.invoke();
            return dn8.a;
        } catch (Throwable th) {
            dn2Var.invoke();
            throw th;
        }
    }

    public static final int j(e74 e74Var) {
        int i = (-e74Var.m) + e74Var.q;
        int i2 = e74Var.o;
        if (i2 == 0) {
            return i;
        }
        int iK = K(e74Var);
        int i3 = e74Var.r;
        return ((i2 - 1) * i3) + ((iK - i3) * i2) + i;
    }

    public static final float k(bd1 bd1Var, float f, float f2) {
        qe2 qe2Var = bd1Var.a;
        sk skVar = new sk(0.0f);
        int iB = skVar.b();
        int i = 0;
        while (i < iB) {
            skVar.e(i, qe2Var.r0(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f));
            i++;
        }
        return skVar.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public static final gb4 l(qk3 qk3Var) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        ArrayList arrayList;
        String strJ;
        qk3 qk3Var2 = qk3Var;
        yu3 yu3Var = qk3Var2.X;
        gb4 gb4VarR = i21.r();
        Member member = qk3Var2.Z;
        if (member instanceof Constructor) {
            Class declaringClass = ((Constructor) member).getDeclaringClass();
            declaringClass.getClass();
            if (declaringClass.getDeclaringClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Map mapP = zp4.P(eu.M0(qk3Var2.U(), qk3Var2.getTypeParameters()));
        boolean zC = yu3Var.c();
        List list = yu3Var.f;
        fw3 fw3Var = fw3.f0;
        if (zC && list.size() == 1) {
            List listG = ((kb6) wv0.O0(list)).g();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listG) {
                if (((ob6) obj).x() == fw3Var) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(xv0.Z(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ob6) it.next()).B());
            }
        } else {
            Type[] typeArrT = qk3Var2.T();
            ArrayList arrayList3 = new ArrayList(typeArrT.length);
            for (Type type : typeArrT) {
                arrayList3.add(w51.Q(type, mapP, w51.D(member) ? gi8.X : gi8.Z, false, false, null, 28));
            }
            arrayList = arrayList3;
        }
        ArrayList<pw3> arrayList4 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(mb6.c0(qk3Var2, (pw3) it2.next()));
        }
        if (z) {
            Class<?> declaringClass2 = ((Constructor) member).getDeclaringClass().getDeclaringClass();
            declaringClass2.getClass();
            gb4VarR.add(new se3(qk3Var2, yb6.a.b(declaringClass2)));
        } else if ((member instanceof Method) && !Modifier.isStatic(((Method) member).getModifiers())) {
            ov3 ov3Var = qk3Var2.Y;
            ov3Var.getClass();
            gb4VarR.add(new se3(qk3Var2, (ev3) ov3Var));
        }
        ArrayList arrayListM = pz2.U0.m(member);
        int size = arrayListM != null ? arrayListM.size() - arrayList4.size() : 0;
        int i = 0;
        for (pw3 pw3Var : arrayList4) {
            int i2 = i + 1;
            if ((i != 0 || !z || arrayList4.size() != qk3Var2.V().length) && (i >= 2 || !member.getDeclaringClass().isEnum() || !(member instanceof Constructor) || arrayList4.size() != qk3Var2.V().length)) {
                if (arrayListM != null) {
                    strJ = (String) wv0.u0(i + size, arrayListM);
                    if (strJ == null) {
                        u52.e(i, size, qk3Var2.getName(), pw3Var, member);
                        return null;
                    }
                } else {
                    strJ = pc6.j(i, "arg");
                }
                gb4VarR.add(new wk3(qk3Var2, strJ, pw3Var, gb4VarR.a(), fw3Var, i == arrayList4.size() - 1 && qk3Var2.W()));
            }
            qk3Var2 = qk3Var;
            i = i2;
        }
        return i21.j(gb4VarR);
    }

    public static final Collection m(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final boolean n(Map map, Map.Entry entry) {
        Object obj = map.get(entry.getKey());
        if (obj != null) {
            return obj.equals(entry.getValue());
        }
        return entry.getValue() == null && map.containsKey(entry.getKey());
    }

    public static ko2 o(do2 do2Var, boolean z) {
        String lowerCase;
        do2Var.getClass();
        List list = do2Var.m0;
        ko2 ko2Var = new ko2(do2Var, null, 1, z);
        i44 i44VarP0 = do2Var.p0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((hi8) obj).D() != rt8.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        gu guVarD1 = wv0.d1(arrayList);
        ArrayList arrayList2 = new ArrayList(xv0.Z(guVarD1, 10));
        Iterator it = guVarD1.iterator();
        while (true) {
            rw1 rw1Var = (rw1) it;
            if (!rw1Var.Y.hasNext()) {
                aa7 aa7VarX = ((hi8) wv0.A0(list)).X();
                fx4 fx4Var = fx4.g0;
                fl1 fl1Var = gl1.e;
                d02 d02Var = d02.X;
                ko2Var.L0(null, i44VarP0, d02Var, d02Var, arrayList2, aa7VarX, fx4Var, fl1Var);
                ko2 ko2Var2 = ko2Var;
                ko2Var2.A0 = true;
                return ko2Var2;
            }
            pb3 pb3Var = (pb3) rw1Var.next();
            int i = pb3Var.a;
            hi8 hi8Var = (hi8) pb3Var.b;
            String strB = hi8Var.getName().b();
            strB.getClass();
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            ko2 ko2Var3 = ko2Var;
            rm rmVar = oy1.f0;
            v15 v15VarE = v15.e(lowerCase);
            aa7 aa7VarX2 = hi8Var.X();
            aa7VarX2.getClass();
            arrayList2.add(new ot8(ko2Var3, null, i, rmVar, v15VarE, aa7VarX2, false, false, false, null, ke7.G));
            ko2Var = ko2Var3;
        }
    }

    public static void p(s92 s92Var, oi5 oi5Var) {
        if (s92Var.exists(oi5Var)) {
            return;
        }
        try {
            s92Var.sink(oi5Var).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final x39 q(Context context, xy0 xy0Var) {
        nl6 nl6Var;
        String name;
        td5 td5VarE;
        ax7 ax7Var;
        boolean zContainsKey;
        context.getClass();
        y5 y5Var = new y5((Executor) xy0Var.f0);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        h37 h37Var = (h37) y5Var.Y;
        h37Var.getClass();
        Object obj = xy0Var.g0;
        byte b = 6;
        if (context.getResources().getBoolean(x26.workmanager_test_configuration)) {
            nl6Var = new nl6(applicationContext, null);
            nl6Var.i = true;
        } else {
            if (fm7.o0("androidx.work.workdb")) {
                bt.q("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            nl6 nl6Var2 = new nl6(applicationContext, "androidx.work.workdb");
            nl6Var2.h = new j78(applicationContext, b);
            nl6Var = nl6Var2;
        }
        nl6Var.f = h37Var;
        rt0 rt0Var = new rt0();
        ArrayList arrayList = nl6Var.d;
        arrayList.add(rt0Var);
        nl6Var.a(qv4.h);
        nl6Var.a(new xe6(applicationContext, 2, 3));
        nl6Var.a(qv4.i);
        nl6Var.a(qv4.j);
        nl6Var.a(new xe6(applicationContext, 5, 6));
        nl6Var.a(qv4.k);
        nl6Var.a(qv4.l);
        nl6Var.a(qv4.m);
        nl6Var.a(new xe6(applicationContext));
        nl6Var.a(new xe6(applicationContext, 10, 11));
        nl6Var.a(qv4.d);
        nl6Var.a(qv4.e);
        nl6Var.a(qv4.f);
        nl6Var.a(qv4.g);
        nl6Var.a(new xe6(applicationContext, 21, 22));
        nl6Var.n = false;
        nl6Var.o = true;
        nl6Var.p = true;
        Executor executor = nl6Var.f;
        if (executor == null && nl6Var.g == null) {
            nd ndVar = ys.c;
            nl6Var.g = ndVar;
            nl6Var.f = ndVar;
        } else if (executor != null && nl6Var.g == null) {
            nl6Var.g = executor;
        } else if (executor == null) {
            nl6Var.f = nl6Var.g;
        }
        LinkedHashSet linkedHashSet = nl6Var.l;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = nl6Var.k;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    em7.c(pc6.j(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        zw7 k32Var = nl6Var.h;
        if (k32Var == null) {
            k32Var = new k32();
        }
        zw7 zw7Var = k32Var;
        boolean z = nl6Var.i;
        Context context2 = nl6Var.b;
        Object systemService = context2.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        pl6 pl6Var = (activityManager == null || activityManager.isLowRamDevice()) ? pl6.X : pl6.Y;
        Executor executor2 = nl6Var.f;
        if (executor2 == null) {
            bt.q("Required value was null.");
            return null;
        }
        Executor executor3 = nl6Var.g;
        if (executor3 == null) {
            bt.q("Required value was null.");
            return null;
        }
        lb1 lb1Var = new lb1(context2, nl6Var.c, zw7Var, nl6Var.j, arrayList, z, pl6Var, executor2, executor3, null, nl6Var.n, nl6Var.o, linkedHashSet2, null, null, null, nl6Var.e, nl6Var.m, nl6Var.p, null, null);
        Class clsM = zc1.M(nl6Var.a);
        Package r0 = clsM.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String canonicalName = clsM.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsM.getClassLoader());
            cls.getClass();
            ql6 ql6Var = (ql6) cls.getDeclaredConstructor(null).newInstance(null);
            ql6Var.getClass();
            ql6Var.j = true;
            try {
                td5VarE = ql6Var.e();
                td5VarE.getClass();
            } catch (g65 unused) {
                td5VarE = null;
            }
            if (td5VarE == null) {
                new by0(lb1Var, new zw5(ql6Var));
                throw null;
            }
            ql6Var.d = new by0(lb1Var, td5VarE);
            ql6Var.e = ql6Var.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setH = ql6Var.h();
            int size = setH.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                int i = -1;
                List list = lb1Var.n;
                if (zHasNext) {
                    zu3 zu3Var = (zu3) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (zu3Var.O(list.get(size2))) {
                                zArr[size2] = true;
                                i = size2;
                                break;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    if (i < 0) {
                        em7.h("A required auto migration spec (", zu3Var.p(), ") is missing in the database configuration.");
                        return null;
                    }
                    linkedHashMap.put(zu3Var, list.get(i));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i3 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                bt.q("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size3 = i3;
                        }
                    }
                    for (pv4 pv4Var : ql6Var.c(linkedHashMap)) {
                        byte b2 = pv4Var.a;
                        byte b3 = pv4Var.b;
                        t91 t91Var = lb1Var.d;
                        LinkedHashMap linkedHashMap2 = t91Var.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(b2))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b2));
                            if (map == null) {
                                map = e02.X;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(b3));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            t91Var.a(pv4Var);
                        }
                    }
                    LinkedHashMap linkedHashMapI = ql6Var.i();
                    boolean[] zArr2 = new boolean[linkedHashMapI.size()];
                    Iterator it3 = linkedHashMapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        List list2 = lb1Var.m;
                        if (!zHasNext2) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i4 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        c2.j("Unexpected type converter ", list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        return null;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size4 = i4;
                                }
                            }
                            ql6Var.b = lb1Var.h;
                            ql6Var.c = new lp(lb1Var.i);
                            Executor executor4 = ql6Var.b;
                            if (executor4 == null) {
                                dh3.T("internalQueryExecutor");
                                throw null;
                            }
                            m51 m51VarC = gv3.c(g33.K(nr4.x(executor4), pw7.b()));
                            ql6Var.a = m51VarC;
                            s61 s61Var = m51VarC.Y;
                            lp lpVar = ql6Var.c;
                            if (lpVar == null) {
                                dh3.T("internalTransactionExecutor");
                                throw null;
                            }
                            s61Var.B0(nr4.x(lpVar));
                            ql6Var.g = lb1Var.f;
                            by0 by0Var = ql6Var.d;
                            if (by0Var == null) {
                                dh3.T("connectionManager");
                                throw null;
                            }
                            ax7 ax7VarE = by0Var.e();
                            if (ax7VarE == null) {
                                ax7VarE = null;
                                break;
                            }
                            while (!(ax7VarE instanceof rr5)) {
                                if (!(ax7VarE instanceof ph1)) {
                                    ax7VarE = null;
                                    break;
                                }
                                ax7VarE = ((ph1) ax7VarE).g();
                            }
                            by0 by0Var2 = ql6Var.d;
                            if (by0Var2 == null) {
                                dh3.T("connectionManager");
                                throw null;
                            }
                            ax7 ax7VarE2 = by0Var2.e();
                            if (ax7VarE2 == null) {
                                ax7Var = null;
                                break;
                            }
                            while (true) {
                                if (ax7VarE2 instanceof zw) {
                                    ax7Var = ax7VarE2;
                                    break;
                                }
                                if (!(ax7VarE2 instanceof ph1)) {
                                    ax7Var = null;
                                    break;
                                }
                                ax7VarE2 = ((ph1) ax7VarE2).g();
                            }
                            WorkDatabase workDatabase = (WorkDatabase) ql6Var;
                            Context applicationContext2 = context.getApplicationContext();
                            applicationContext2.getClass();
                            y5 y5Var2 = new y5(applicationContext2, y5Var);
                            fv5 fv5Var = new fv5(context.getApplicationContext(), xy0Var, y5Var, workDatabase);
                            int i5 = y39.X;
                            gb4 gb4VarR = i21.r();
                            int i6 = ax6.a;
                            p08 p08Var = new p08(context, workDatabase, xy0Var);
                            HashMap map2 = zf5.a;
                            PackageManager packageManager = context.getPackageManager();
                            packageManager.getClass();
                            zf5.a(packageManager, new ComponentName(context, (Class<?>) SystemJobService.class), true, yf5.X);
                            lh4.P0().getClass();
                            gb4VarR.add(p08Var);
                            gb4VarR.add(new hu2(context, xy0Var, y5Var2, fv5Var, new xd6(fv5Var, y5Var), y5Var));
                            return new x39(context.getApplicationContext(), xy0Var, y5Var, workDatabase, i21.j(gb4VarR), fv5Var, y5Var2);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        zu3 zu3Var2 = (zu3) entry.getKey();
                        for (zu3 zu3Var3 : (List) entry.getValue()) {
                            int size5 = list2.size() - 1;
                            if (size5 < 0) {
                                size5 = -1;
                                break;
                            }
                            while (true) {
                                int i7 = size5 - 1;
                                if (zu3Var3.O(list2.get(size5))) {
                                    zArr2[size5] = true;
                                    break;
                                }
                                if (i7 < 0) {
                                    size5 = -1;
                                    break;
                                }
                                size5 = i7;
                            }
                            if (size5 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + zu3Var3.p() + ") for " + zu3Var2.p() + " is missing in the database configuration.").toString());
                            }
                            Object obj2 = list2.get(size5);
                            zu3Var3.getClass();
                            obj2.getClass();
                            ql6Var.i.put(zu3Var3, obj2);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsM.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsM.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsM.getCanonicalName(), e3);
        }
    }

    public static String r(zh0 zh0Var, Integer num) {
        if (num != null) {
            try {
                if (num.intValue() == 1) {
                    vi0.a("0");
                    jj0 jj0VarB = zh0.b(zh0Var, "0");
                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                    key.getClass();
                    Integer num2 = (Integer) ((lf0) jj0VarB).c(key);
                    if (num2 != null && num2.intValue() == 1) {
                        return "1";
                    }
                } else if (num.intValue() == 0) {
                    vi0.a("1");
                    jj0 jj0VarB2 = zh0.b(zh0Var, "1");
                    CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                    key2.getClass();
                    Integer num3 = (Integer) ((lf0) jj0VarB2).c(key2);
                    if (num3 != null && num3.intValue() == 0) {
                        return "0";
                    }
                }
            } catch (ms1 unused) {
                hi5.j0();
                return null;
            }
        }
        return null;
    }

    public static final void s(s92 s92Var, oi5 oi5Var) throws IOException {
        try {
            IOException iOException = null;
            for (oi5 oi5Var2 : s92Var.list(oi5Var)) {
                try {
                    if (s92Var.metadata(oi5Var2).b) {
                        s(s92Var, oi5Var2);
                    }
                    s92Var.delete(oi5Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static gm t(sm smVar, fk2 fk2Var) {
        Object next;
        fk2Var.getClass();
        Iterator it = smVar.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (dh3.f(((gm) next).d(), fk2Var)) {
                return (gm) next;
            }
        }
        next = null;
        return (gm) next;
    }

    public static final zu3 u(e37 e37Var) {
        e37Var.getClass();
        if (e37Var instanceof f37) {
            return u(((f37) e37Var).a);
        }
        return null;
    }

    public static float v(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return by1.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final boolean w(o88 o88Var) {
        fp5 fp5Var;
        up5 up5Var = o88Var.c;
        nz1 nz1Var = (up5Var == null || (fp5Var = up5Var.b) == null) ? null : new nz1(fp5Var.b);
        boolean z = false;
        if (nz1Var != null && nz1Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static float x(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean y(sm smVar, fk2 fk2Var) {
        fk2Var.getClass();
        return smVar.p(fk2Var) != null;
    }

    public static boolean z(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    @Override // defpackage.hb7
    public float b(View view) {
        return view.getTranslationY();
    }

    @Override // defpackage.hb7
    public Property f() {
        return View.TRANSLATION_Y;
    }
}
