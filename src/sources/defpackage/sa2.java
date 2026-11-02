package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sa2 {
    public static final ra2 e = new ra2();
    public final Object a;
    public boolean b;
    public Object c;
    public Object d;

    public sa2(w50 w50Var, byte b) throws oj2 {
        switch (b) {
            case 1:
                int i = w50Var.Y;
                if (i < 21 || (i & 3) != 1) {
                    throw oj2.a();
                }
                this.a = w50Var;
                return;
            default:
                this.a = w50Var;
                this.c = new ArrayList();
                this.d = new int[5];
                return;
        }
    }

    public static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i >= 7) {
            float f = i / 7.0f;
            float f2 = f / 2.0f;
            if (Math.abs(f - iArr[0]) < f2 && Math.abs(f - iArr[1]) < f2 && Math.abs((f * 3.0f) - iArr[2]) < 3.0f * f2 && Math.abs(f - iArr[3]) < f2 && Math.abs(f - iArr[4]) < f2) {
                return true;
            }
        }
        return false;
    }

    public static double m(qa2 qa2Var, qa2 qa2Var2) {
        double d = qa2Var.a - qa2Var2.a;
        double d2 = qa2Var.b - qa2Var2.b;
        return (d2 * d2) + (d * d);
    }

    public void b(boolean z) {
        lp1 lp1Var = (lp1) this.d;
        synchronized (lp1Var.j0) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (dh3.f(((ip1) this.a).g, this)) {
                    lp1Var.g(this, z);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int c(int i, int i2, int i3) {
        boolean z = this.b;
        w50 w50Var = (w50) this.a;
        return z ? w50Var.b(i2, i) : w50Var.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public oi5 d(int i) {
        oi5 oi5Var;
        lp1 lp1Var = (lp1) this.d;
        synchronized (lp1Var.j0) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj = ((ip1) this.a).d.get(i);
            z39.p(lp1Var.s0, (oi5) obj);
            oi5Var = (oi5) obj;
        }
        return oi5Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113 A[ADDED_TO_REGION, LOOP:10: B:72:0x0113->B:77:0x011f, LOOP_START, PHI: r12
  0x0113: PHI (r12v5 int) = (r12v4 int), (r12v20 int) binds: [B:70:0x010d, B:77:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:72:0x0113
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public boolean f(int r20, int r21, int[] r22) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa2.f(int, int, int[]):boolean");
    }

    public boolean g() {
        ArrayList<qa2> arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        float fAbs = 0.0f;
        int i = 0;
        float f = 0.0f;
        for (qa2 qa2Var : arrayList) {
            if (qa2Var.d >= 2) {
                i++;
                f += qa2Var.c;
            }
        }
        if (i >= 3) {
            float f2 = f / size;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fAbs += Math.abs(((qa2) it.next()).c - f2);
            }
            if (fAbs <= f * 0.05f) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean h() {
        boolean z;
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (!this.b) {
                        Boolean boolI = i();
                        this.c = boolI;
                        if (boolI == null) {
                            ((b42) ((bq7) this.a)).a(new u52((byte) 10));
                        }
                        this.b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            throw th2;
        }
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            xa2 xa2Var = ((FirebaseMessaging) this.d).a;
            xa2Var.a();
            y91 y91Var = (y91) xa2Var.g.get();
            synchronized (y91Var) {
                z = y91Var.a;
            }
            zBooleanValue = z;
        }
        return zBooleanValue;
    }

    public Boolean i() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        xa2 xa2Var = ((FirebaseMessaging) this.d).a;
        xa2Var.a();
        Context context = xa2Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public pj2 j() {
        pj2 pj2Var = (pj2) this.d;
        if (pj2Var != null) {
            return pj2Var;
        }
        int iC = 0;
        int iC2 = 0;
        for (int i = 0; i < 6; i++) {
            iC2 = c(i, 8, iC2);
        }
        int iC3 = c(8, 7, c(8, 8, c(7, 8, iC2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iC3 = c(8, i2, iC3);
        }
        int i3 = ((w50) this.a).Y;
        int i4 = i3 - 7;
        for (int i5 = i3 - 1; i5 >= i4; i5--) {
            iC = c(8, i5, iC);
        }
        for (int i6 = i3 - 8; i6 < i3; i6++) {
            iC = c(i6, 8, iC);
        }
        pj2 pj2VarA = pj2.a(iC3, iC);
        if (pj2VarA == null) {
            pj2VarA = pj2.a(iC3 ^ 21522, iC ^ 21522);
        }
        this.d = pj2VarA;
        if (pj2VarA != null) {
            return pj2VarA;
        }
        throw oj2.a();
    }

    public av8 k() {
        av8 av8Var = (av8) this.c;
        if (av8Var != null) {
            return av8Var;
        }
        int i = ((w50) this.a).Y;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return av8.c(i2);
        }
        int i3 = i - 11;
        int iC = 0;
        int iC2 = 0;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i - 9; i5 >= i3; i5--) {
                iC2 = c(i5, i4, iC2);
            }
        }
        av8 av8VarB = av8.b(iC2);
        if (av8VarB != null && (av8VarB.a * 4) + 17 == i) {
            this.c = av8VarB;
            return av8VarB;
        }
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                iC = c(i6, i7, iC);
            }
        }
        av8 av8VarB2 = av8.b(iC);
        if (av8VarB2 == null || (av8VarB2.a * 4) + 17 != i) {
            throw oj2.a();
        }
        this.c = av8VarB2;
        return av8VarB2;
    }

    public void l() {
        if (((pj2) this.d) == null) {
            return;
        }
        int i = p61.G(8)[((pj2) this.d).b];
        w50 w50Var = (w50) this.a;
        int i2 = w50Var.Y;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (oi0.a(i, i3, i4)) {
                    w50Var.a(i4, i3);
                }
            }
        }
    }

    public sa2() {
        this.a = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = true;
    }

    public sa2(f64 f64Var, vp7 vp7Var, ws5 ws5Var) {
        this.a = f64Var;
        this.c = vp7Var;
        this.d = ws5Var;
        this.b = true;
    }

    public sa2(int i) {
        this.a = new ReentrantLock();
        this.c = new long[i];
        this.d = new boolean[i];
    }

    public sa2(lp1 lp1Var, ip1 ip1Var) {
        this.d = lp1Var;
        this.a = ip1Var;
        this.c = new boolean[2];
    }

    public sa2(FirebaseMessaging firebaseMessaging, bq7 bq7Var) {
        this.d = firebaseMessaging;
        this.a = bq7Var;
    }
}
