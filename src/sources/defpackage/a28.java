package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import io.sentry.c2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a28 {
    public static final int a(z00 z00Var) {
        z00Var.getClass();
        int iOrdinal = z00Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 1;
            }
            b61.c();
        }
        return 0;
    }

    public static final LinkedHashSet b(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new o31(z, uri));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                oc.h(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    public static final wd0 c(wd0 wd0Var, kb6 kb6Var, List list, boolean z) {
        List listG = kb6Var.g();
        if (listG == null || !listG.isEmpty()) {
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                if (ms8.i(((ob6) it.next()).B())) {
                }
            }
            if (!ms8.i(kb6Var.j())) {
                return wd0Var;
            }
        } else if (!ms8.i(kb6Var.j())) {
            return wd0Var;
        }
        return new et8(wd0Var, kb6Var, list, z);
    }

    public static final byte[] d(u35 u35Var) throws IOException {
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) u35Var.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrB = g33.B(networkRequest);
                int[] iArrU = g33.u(networkRequest);
                objectOutputStream.writeInt(iArrB.length);
                for (int i : iArrB) {
                    objectOutputStream.writeInt(i);
                }
                objectOutputStream.writeInt(iArrU.length);
                for (int i2 : iArrU) {
                    objectOutputStream.writeInt(i2);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                oc.h(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static int e(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static final Method f(Class cls, kb6 kb6Var) {
        kb6Var.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            om0.h("No unbox method found in inline class: ", cls, " (calling ", kb6Var);
            return null;
        }
    }

    public static ColorStateList g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (i(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i == 2) {
                em7.j(typedValue, "Failed to resolve attribute at index 1: ");
            } else {
                if (i >= 28 && i <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = ow0.a;
                try {
                    return ow0.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static ne h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ne neVarC;
        if (i(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ne((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                neVarC = ne.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                neVarC = null;
            }
            if (neVarC != null) {
                return neVarC;
            }
        }
        return new ne((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final z00 j(int i) {
        if (i == 0) {
            return z00.X;
        }
        if (i == 1) {
            return z00.Y;
        }
        bt.q(ie2.h("Could not convert ", i, " to BackoffPolicy"));
        return null;
    }

    public static final b45 k(int i) {
        if (i == 0) {
            return b45.X;
        }
        if (i == 1) {
            return b45.Y;
        }
        if (i == 2) {
            return b45.Z;
        }
        if (i == 3) {
            return b45.f0;
        }
        if (i == 4) {
            return b45.g0;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return b45.h0;
        }
        bt.q(ie2.h("Could not convert ", i, " to NetworkType"));
        return null;
    }

    public static final yd5 l(int i) {
        if (i == 0) {
            return yd5.X;
        }
        if (i == 1) {
            return yd5.Y;
        }
        bt.q(ie2.h("Could not convert ", i, " to OutOfQuotaPolicy"));
        return null;
    }

    public static final u39 m(int i) {
        if (i == 0) {
            return u39.X;
        }
        if (i == 1) {
            return u39.Y;
        }
        if (i == 2) {
            return u39.Z;
        }
        if (i == 3) {
            return u39.f0;
        }
        if (i == 4) {
            return u39.g0;
        }
        if (i == 5) {
            return u39.h0;
        }
        bt.q(ie2.h("Could not convert ", i, " to State"));
        return null;
    }

    public static final boolean n(pw3 pw3Var) {
        if (pw3Var.z()) {
            return false;
        }
        lv3 lv3VarM = pw3Var.M();
        zu3 zu3Var = lv3VarM instanceof zu3 ? (zu3) lv3VarM : null;
        Class clsO = zu3Var != null ? zc1.O(zu3Var) : null;
        return (clsO == null || clsO.equals(Void.TYPE)) ? false : true;
    }

    public static final boolean o(pb6 pb6Var) {
        yy3 yy3VarI0;
        List listL = pb6Var.l();
        if (listL == null || !listL.isEmpty()) {
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                if (((ob6) it.next()).x() != fw3.X) {
                    return false;
                }
            }
        }
        String name = pb6Var.getName();
        ov3 ov3VarD = pb6Var.D();
        String str = null;
        ev3 ev3Var = ov3VarD instanceof ev3 ? (ev3) ov3VarD : null;
        if (ev3Var != null && (yy3VarI0 = ev3Var.i0()) != null) {
            str = yy3VarI0.m;
        }
        return dh3.f(name, str);
    }

    public static final int p(b45 b45Var) {
        int iOrdinal = b45Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && b45Var == b45.h0) {
                            return 5;
                        }
                        c2.j("Could not convert ", b45Var, " to int");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static TypedArray q(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final int r(yd5 yd5Var) {
        yd5Var.getClass();
        int iOrdinal = yd5Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 1;
            }
            b61.c();
        }
        return 0;
    }

    public static final byte[] s(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    o31 o31Var = (o31) it.next();
                    objectOutputStream.writeUTF(o31Var.a.toString());
                    objectOutputStream.writeBoolean(o31Var.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                oc.h(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static final Object t(va8 va8Var, rn2 rn2Var) {
        u70.W(va8Var, true, new jq1(u70.M(va8Var.g0.w()).X(va8Var.h0, va8Var, va8Var.f0)));
        return z38.d(va8Var, false, va8Var, rn2Var);
    }

    public static final int u(u39 u39Var) {
        u39Var.getClass();
        int iOrdinal = u39Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        b61.c();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final Class v(pw3 pw3Var) {
        lv3 lv3VarM = pw3Var != null ? pw3Var.M() : null;
        zu3 zu3Var = lv3VarM instanceof zu3 ? (zu3) lv3VarM : null;
        if (zu3Var != null && zu3Var.C()) {
            if (!ms8.k(pw3Var)) {
                return zc1.M(zu3Var);
            }
            pw3 pw3VarS = ms8.s(pw3Var);
            if (pw3VarS != null && !ms8.k(pw3VarS) && !n(pw3VarS)) {
                return zc1.M(zu3Var);
            }
        }
        return null;
    }

    public static final u35 w(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new u35(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                u35 u35Var = new u35(en.i(iArr2, iArr));
                objectInputStream.close();
                byteArrayInputStream.close();
                return u35Var;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                oc.h(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(long j, rn2 rn2Var, s51 s51Var) {
        wa8 wa8Var;
        ea6 ea6Var;
        if (s51Var instanceof wa8) {
            wa8Var = (wa8) s51Var;
            int i = wa8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wa8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                wa8Var = new wa8(s51Var);
            }
        } else {
            wa8Var = new wa8(s51Var);
        }
        Object obj = wa8Var.g0;
        int i2 = wa8Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            if (j > 0) {
                ea6 ea6Var2 = new ea6();
                try {
                    wa8Var.f0 = ea6Var2;
                    wa8Var.h0 = 1;
                    va8 va8Var = new va8(j, wa8Var);
                    ea6Var2.X = va8Var;
                    Object objT = t(va8Var, rn2Var);
                    c71 c71Var = c71.X;
                    return objT == c71Var ? c71Var : objT;
                } catch (ua8 e) {
                    e = e;
                    ea6Var = ea6Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ea6Var = wa8Var.f0;
        try {
            w39.n0(obj);
            return obj;
        } catch (ua8 e2) {
            e = e2;
        }
        if (e.X != ea6Var.X) {
            throw e;
        }
        return null;
    }
}
