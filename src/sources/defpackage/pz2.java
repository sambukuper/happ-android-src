package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.work.WorkerParameters;
import io.sentry.c2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pz2 implements ax, b80, r61, ea0, m22, ry0, de2, dk6, d91 {
    public static final dx0 A0;
    public static final dx0 B0;
    public static final dx0 C0;
    public static final h80 D0;
    public static final pz2 O0;
    public static final pz2 P0;
    public static final pz2 Q0;
    public static final pz2 R0;
    public static mj3 V0;
    public static final pz2 w0;
    public static final dx0 z0;
    public final /* synthetic */ byte X;
    public static final pz2 Y = new pz2(1);
    public static final p50 Z = new p50(-1.0f, -1.0f);
    public static final p50 f0 = new p50(0.0f, -1.0f);
    public static final p50 g0 = new p50(1.0f, -1.0f);
    public static final p50 h0 = new p50(-1.0f, 0.0f);
    public static final p50 i0 = new p50(0.0f, 0.0f);
    public static final p50 j0 = new p50(1.0f, 0.0f);
    public static final p50 k0 = new p50(-1.0f, 1.0f);
    public static final p50 l0 = new p50(0.0f, 1.0f);
    public static final p50 m0 = new p50(1.0f, 1.0f);
    public static final o50 n0 = new o50(-1.0f);
    public static final o50 o0 = new o50(0.0f);
    public static final o50 p0 = new o50(1.0f);
    public static final n50 q0 = new n50(-1.0f);
    public static final n50 r0 = new n50(0.0f);
    public static final n50 s0 = new n50(1.0f);
    public static final pz2 t0 = new pz2(3);
    public static final pz2 u0 = new pz2(4);
    public static final /* synthetic */ pz2 v0 = new pz2(5);
    public static final om0 x0 = new om0((byte) 0);
    public static final /* synthetic */ pz2 y0 = new pz2(8);
    public static final /* synthetic */ pz2 E0 = new pz2(10);
    public static final pz2 F0 = new pz2(11);
    public static final pz2 G0 = new pz2(12);
    public static final pz2 H0 = new pz2(13);
    public static final pz2 I0 = new pz2(14);
    public static final pz2 J0 = new pz2(15);
    public static final pz2 K0 = new pz2(16);
    public static final z24 L0 = z24.X;
    public static final ii1 M0 = new ii1(1.0f, 1.0f);
    public static final pz2 N0 = new pz2(17);
    public static final pz2 S0 = new pz2(22);
    public static final /* synthetic */ pz2 T0 = new pz2(23);
    public static final pz2 U0 = new pz2(24);
    public static final pz2 W0 = new pz2(26);
    public static final pz2 X0 = new pz2(27);
    public static final pz2 Y0 = new pz2(29);

    static {
        byte b = 6;
        w0 = new pz2(b);
        byte b2 = 18;
        z0 = new dx0(b2);
        byte b3 = 19;
        A0 = new dx0(b3);
        byte b4 = 20;
        B0 = new dx0(b4);
        byte b5 = 21;
        C0 = new dx0(b5);
        D0 = new h80(b);
        O0 = new pz2(b2);
        P0 = new pz2(b3);
        Q0 = new pz2(b4);
        R0 = new pz2(b5);
    }

    public /* synthetic */ pz2(byte b) {
        this.X = b;
    }

    public static sx4 h(sx4 sx4Var) {
        gk2 gk2VarF = bl1.f(sx4Var);
        String str = ll3.a;
        fk2 fk2Var = (fk2) ll3.k.get(gk2VarF);
        if (fk2Var != null) {
            return el1.e(sx4Var).j(fk2Var);
        }
        c2.j("Given class ", sx4Var, " is not a read-only collection");
        return null;
    }

    public static du i(List list, vx4 vx4Var, du5 du5Var) {
        List listY0 = wv0.Y0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            s21 s21VarJ = j(null, it.next());
            if (s21VarJ != null) {
                arrayList.add(s21VarJ);
            }
        }
        return vx4Var != null ? new gj8(arrayList, vx4Var.f().r(du5Var)) : new du(arrayList, new f0(du5Var, (byte) 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [d02] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static s21 j(wx4 wx4Var, Object obj) {
        if (obj instanceof Byte) {
            return new lb0(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new t87(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new rf3(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new ri4(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new gq0((Character) obj);
        }
        if (obj instanceof Float) {
            return new v60(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new v60(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new v60((Boolean) obj);
        }
        if (obj instanceof String) {
            return new bm7((String) obj);
        }
        boolean z = obj instanceof byte[];
        ?? K = d02.X;
        int i = 0;
        if (z) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    K = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i < length2) {
                        K.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                } else {
                    K = i21.K(Byte.valueOf(bArr[0]));
                }
            }
            return i(K, wx4Var, du5.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    K = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i < length4) {
                        K.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    K = i21.K(Short.valueOf(sArr[0]));
                }
            }
            return i(K, wx4Var, du5.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    K = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i < length6) {
                        K.add(Integer.valueOf(iArr[i]));
                        i++;
                    }
                } else {
                    K = i21.K(Integer.valueOf(iArr[0]));
                }
            }
            return i(K, wx4Var, du5.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    K = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i < length8) {
                        K.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    K = i21.K(Long.valueOf(jArr[0]));
                }
            }
            return i(K, wx4Var, du5.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    K = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i < length10) {
                        K.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    K = i21.K(Character.valueOf(cArr[0]));
                }
            }
            return i(K, wx4Var, du5.CHAR);
        }
        if (obj instanceof float[]) {
            return i(eu.J0((float[]) obj), wx4Var, du5.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length11 = dArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    K = new ArrayList(dArr.length);
                    int length12 = dArr.length;
                    while (i < length12) {
                        K.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    K = i21.K(Double.valueOf(dArr[0]));
                }
            }
            return i(K, wx4Var, du5.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new e75(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length13 = zArr.length;
        if (length13 != 0) {
            if (length13 != 1) {
                K = new ArrayList(zArr.length);
                int length14 = zArr.length;
                while (i < length14) {
                    K.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                K = i21.K(Boolean.valueOf(zArr[0]));
            }
        }
        return i(K, wx4Var, du5.BOOLEAN);
    }

    public static su3 k(String str) {
        ut3 ut3Var;
        char cCharAt = str.charAt(0);
        ut3[] ut3VarArrValues = ut3.values();
        int length = ut3VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ut3Var = null;
                break;
            }
            ut3Var = ut3VarArrValues[i];
            if (ut3Var.Z.charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (ut3Var != null) {
            return new ru3(ut3Var);
        }
        if (cCharAt == 'V') {
            return new ru3(null);
        }
        if (cCharAt == '[') {
            return new pu3(k(str.substring(1)));
        }
        if (cCharAt == 'L') {
            fm7.h0(str, ';');
        }
        return new qu3(str.substring(1, str.length() - 1));
    }

    public static ke7 n(jd0 jd0Var) {
        while (jd0Var instanceof ld0) {
            ld0 ld0Var = (ld0) jd0Var;
            if (ld0Var.r() != 2) {
                break;
            }
            Collection collectionQ = ld0Var.q();
            collectionQ.getClass();
            jd0Var = (ld0) wv0.P0(collectionQ);
            if (jd0Var == null) {
                return null;
            }
        }
        return jd0Var.getSource();
    }

    public static String p(su3 su3Var) {
        su3Var.getClass();
        if (su3Var instanceof pu3) {
            return "[".concat(p(((pu3) su3Var).i));
        }
        if (su3Var instanceof ru3) {
            ut3 ut3Var = ((ru3) su3Var).i;
            return ut3Var != null ? ut3Var.Z : "V";
        }
        if (su3Var instanceof qu3) {
            return oi0.o(new StringBuilder("L"), ((qu3) su3Var).i, ';');
        }
        b61.c();
        return null;
    }

    @Override // defpackage.ax
    public int M() {
        return 1;
    }

    @Override // defpackage.d91
    public Iterable a(Object obj) {
        nw3[] nw3VarArr = us3.j0;
        return ((ld0) obj).a().q();
    }

    @Override // defpackage.de2
    public t14 b(nz5 nz5Var, String str, aa7 aa7Var, aa7 aa7Var2) {
        nz5Var.getClass();
        str.getClass();
        aa7Var.getClass();
        aa7Var2.getClass();
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // defpackage.b80
    public Rect c(Activity activity) throws Exception {
        DisplayCutout displayCutoutP;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            b80.b.getClass();
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (displayCutoutP = en.p(defaultDisplay)) != null) {
            if (rect.left == en.P(displayCutoutP)) {
                rect.left = 0;
            }
            if (point.x - rect.right == en.Q(displayCutoutP)) {
                rect.right = en.Q(displayCutoutP) + rect.right;
            }
            if (rect.top == en.R(displayCutoutP)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == en.O(displayCutoutP)) {
                rect.bottom = en.O(displayCutoutP) + rect.bottom;
            }
        }
        return rect;
    }

    @Override // defpackage.ry0
    public Object d(y5 y5Var) {
        switch (this.X) {
            case 19:
                Object objK = y5Var.k(new e26(u00.class, Executor.class));
                objK.getClass();
                return nr4.x((Executor) objK);
            default:
                Object objK2 = y5Var.k(new e26(l60.class, Executor.class));
                objK2.getClass();
                return nr4.x((Executor) objK2);
        }
    }

    @Override // defpackage.ea0
    public long e() {
        return 9205357640488583168L;
    }

    public boolean f(ed1 ed1Var, ed1 ed1Var2, boolean z) {
        if ((ed1Var instanceof sx4) && (ed1Var2 instanceof sx4)) {
            return dh3.f(((sx4) ed1Var).l(), ((sx4) ed1Var2).l());
        }
        if ((ed1Var instanceof hi8) && (ed1Var2 instanceof hi8)) {
            return g((hi8) ed1Var, (hi8) ed1Var2, z, g0.k0);
        }
        if (!(ed1Var instanceof jd0) || !(ed1Var2 instanceof jd0)) {
            return ((ed1Var instanceof tf5) && (ed1Var2 instanceof tf5)) ? dh3.f(((uf5) ((tf5) ed1Var)).i0, ((uf5) ((tf5) ed1Var2)).i0) : dh3.f(ed1Var, ed1Var2);
        }
        jd0 jd0Var = (jd0) ed1Var;
        jd0 jd0Var2 = (jd0) ed1Var2;
        if (!jd0Var.equals(jd0Var2)) {
            if (dh3.f(jd0Var.getName(), jd0Var2.getName()) && ((!(jd0Var instanceof ts4) || !(jd0Var2 instanceof ts4) || ((ts4) jd0Var).C() == ((ts4) jd0Var2).C()) && ((!dh3.f(jd0Var.p(), jd0Var2.p()) || (z && dh3.f(n(jd0Var), n(jd0Var2)))) && !bl1.m(jd0Var) && !bl1.m(jd0Var2)))) {
                ed1 ed1VarP = jd0Var.p();
                ed1 ed1VarP2 = jd0Var2.p();
                if (((ed1VarP instanceof ld0) || (ed1VarP2 instanceof ld0)) ? false : f(ed1VarP, ed1VarP2, z)) {
                    hf5 hf5Var = new hf5(new o8((byte) 3, jd0Var, jd0Var2, z));
                    if (hf5Var.m(jd0Var, jd0Var2, null, true).b() != 1 || hf5Var.m(jd0Var2, jd0Var, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean g(hi8 hi8Var, hi8 hi8Var2, boolean z, rn2 rn2Var) {
        if (hi8Var.equals(hi8Var2)) {
            return true;
        }
        if (dh3.f(hi8Var.p(), hi8Var2.p())) {
            return false;
        }
        ed1 ed1VarP = hi8Var.p();
        ed1 ed1VarP2 = hi8Var2.p();
        return (((ed1VarP instanceof ld0) || (ed1VarP2 instanceof ld0)) ? ((Boolean) rn2Var.K(ed1VarP, ed1VarP2)).booleanValue() : f(ed1VarP, ed1VarP2, z)) && hi8Var.getIndex() == hi8Var2.getIndex();
    }

    @Override // defpackage.ea0
    public fi1 getDensity() {
        return M0;
    }

    @Override // defpackage.ea0
    public z24 getLayoutDirection() {
        return L0;
    }

    public ec4 l(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(ec4.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                ec4 ec4Var = (ec4) objNewInstance;
                if (!ec4Var.d) {
                    return ec4Var;
                }
                bt.i(pc6.q("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                return null;
            } catch (Throwable th) {
                lh4 lh4VarP0 = lh4.P0();
                int i = q49.a;
                lh4VarP0.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            lh4 lh4VarP1 = lh4.P0();
            int i2 = q49.a;
            lh4VarP1.getClass();
            throw th2;
        }
    }

    public ArrayList m(Member member) throws IllegalAccessException, InvocationTargetException {
        Method method;
        mj3 mj3Var;
        member.getClass();
        mj3 mj3Var2 = V0;
        if (mj3Var2 == null) {
            synchronized (this) {
                mj3Var2 = V0;
                if (mj3Var2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        mj3Var = new mj3(cls.getMethod("getParameters", null), ia6.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        mj3Var = new mj3(null, null);
                    }
                    V0 = mj3Var;
                    mj3Var2 = mj3Var;
                }
            }
        }
        Method method2 = mj3Var2.a;
        if (method2 == null || (method = mj3Var2.b) == null) {
            return null;
        }
        Object objInvoke = method2.invoke(member, null);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = method.invoke(obj, null);
            objInvoke2.getClass();
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }

    @Override // defpackage.m22
    public Boolean o() {
        return null;
    }
}
