package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import io.sentry.c2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ml2 {
    public final gl2 A;
    public final k42 B;
    public r6 C;
    public r6 D;
    public r6 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public pl2 O;
    public final xb P;
    public boolean b;
    public ArrayList e;
    public z95 g;
    public final ArrayList n;
    public final mj0 o;
    public final CopyOnWriteArrayList p;
    public final dl2 q;
    public final dl2 r;
    public final dl2 s;
    public final dl2 t;
    public final fl2 u;
    public int v;
    public tk2 w;
    public vj8 x;
    public qk2 y;
    public qk2 z;
    public final ArrayList a = new ArrayList();
    public final z47 c = new z47((byte) 19);
    public ArrayList d = new ArrayList();
    public final bl2 f = new bl2(this);
    public r00 h = null;
    public boolean i = false;
    public final l00 j = new l00(this, 1);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [dl2] */
    /* JADX WARN: Type inference failed for: r0v17, types: [dl2] */
    /* JADX WARN: Type inference failed for: r0v18, types: [dl2] */
    /* JADX WARN: Type inference failed for: r0v19, types: [dl2] */
    public ml2() {
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new mj0(this);
        this.p = new CopyOnWriteArrayList();
        final byte b = 0;
        this.q = new d41(this) { // from class: dl2
            public final /* synthetic */ ml2 b;

            {
                this.b = this;
            }

            @Override // defpackage.d41
            public final void accept(Object obj) {
                byte b2 = b;
                ml2 ml2Var = this.b;
                switch (b2) {
                    case 0:
                        if (ml2Var.M()) {
                            ml2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ml2Var.M() && num.intValue() == 80) {
                            ml2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        lz4 lz4Var = (lz4) obj;
                        if (ml2Var.M()) {
                            boolean z = lz4Var.a;
                            ml2Var.o(false);
                        }
                        break;
                    default:
                        en5 en5Var = (en5) obj;
                        if (ml2Var.M()) {
                            boolean z2 = en5Var.a;
                            ml2Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.r = new d41(this) { // from class: dl2
            public final /* synthetic */ ml2 b;

            {
                this.b = this;
            }

            @Override // defpackage.d41
            public final void accept(Object obj) {
                byte b3 = b2;
                ml2 ml2Var = this.b;
                switch (b3) {
                    case 0:
                        if (ml2Var.M()) {
                            ml2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ml2Var.M() && num.intValue() == 80) {
                            ml2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        lz4 lz4Var = (lz4) obj;
                        if (ml2Var.M()) {
                            boolean z = lz4Var.a;
                            ml2Var.o(false);
                        }
                        break;
                    default:
                        en5 en5Var = (en5) obj;
                        if (ml2Var.M()) {
                            boolean z2 = en5Var.a;
                            ml2Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.s = new d41(this) { // from class: dl2
            public final /* synthetic */ ml2 b;

            {
                this.b = this;
            }

            @Override // defpackage.d41
            public final void accept(Object obj) {
                byte b4 = b3;
                ml2 ml2Var = this.b;
                switch (b4) {
                    case 0:
                        if (ml2Var.M()) {
                            ml2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ml2Var.M() && num.intValue() == 80) {
                            ml2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        lz4 lz4Var = (lz4) obj;
                        if (ml2Var.M()) {
                            boolean z = lz4Var.a;
                            ml2Var.o(false);
                        }
                        break;
                    default:
                        en5 en5Var = (en5) obj;
                        if (ml2Var.M()) {
                            boolean z2 = en5Var.a;
                            ml2Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.t = new d41(this) { // from class: dl2
            public final /* synthetic */ ml2 b;

            {
                this.b = this;
            }

            @Override // defpackage.d41
            public final void accept(Object obj) {
                byte b5 = b4;
                ml2 ml2Var = this.b;
                switch (b5) {
                    case 0:
                        if (ml2Var.M()) {
                            ml2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (ml2Var.M() && num.intValue() == 80) {
                            ml2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        lz4 lz4Var = (lz4) obj;
                        if (ml2Var.M()) {
                            boolean z = lz4Var.a;
                            ml2Var.o(false);
                        }
                        break;
                    default:
                        en5 en5Var = (en5) obj;
                        if (ml2Var.M()) {
                            boolean z2 = en5Var.a;
                            ml2Var.t(false);
                        }
                        break;
                }
            }
        };
        this.u = new fl2(this);
        this.v = -1;
        this.A = new gl2(this);
        this.B = new k42();
        this.F = new ArrayDeque();
        this.P = new xb(this, (byte) 9);
    }

    public static HashSet G(r00 r00Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < r00Var.a.size(); i++) {
            qk2 qk2Var = ((cm2) r00Var.a.get(i)).b;
            if (qk2Var != null && r00Var.g) {
                hashSet.add(qk2Var);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean L(qk2 qk2Var) {
        boolean zL = false;
        for (qk2 qk2Var2 : qk2Var.x0.c.D()) {
            if (qk2Var2 != null) {
                zL = L(qk2Var2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(qk2 qk2Var) {
        if (qk2Var == null) {
            return true;
        }
        if (qk2Var.G0) {
            return qk2Var.v0 == null || N(qk2Var.y0);
        }
        return false;
    }

    public static boolean O(qk2 qk2Var) {
        if (qk2Var == null) {
            return true;
        }
        ml2 ml2Var = qk2Var.v0;
        return qk2Var == ml2Var.z && O(ml2Var.y);
    }

    public final boolean A(boolean z) {
        boolean zA;
        ArrayList arrayList;
        r00 r00Var;
        z(z);
        if (!this.i && (r00Var = this.h) != null) {
            r00Var.r = false;
            r00Var.d();
            if (K(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.f(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                qk2 qk2Var = ((cm2) it.next()).b;
                if (qk2Var != null) {
                    qk2Var.o0 = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((jl2) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.w.D0.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.w.D0.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                W(this.L, this.M);
                e();
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        g0();
        if (this.K) {
            this.K = false;
            e0();
        }
        ((HashMap) this.c.Z).values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void B(r00 r00Var, boolean z) {
        if (z && (this.w == null || this.J)) {
            return;
        }
        z(z);
        r00 r00Var2 = this.h;
        if (r00Var2 != null) {
            r00Var2.r = false;
            r00Var2.d();
            if (K(3)) {
                Objects.toString(this.h);
                Objects.toString(r00Var);
            }
            this.h.f(false, false);
            this.h.a(this.L, this.M);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                qk2 qk2Var = ((cm2) it.next()).b;
                if (qk2Var != null) {
                    qk2Var.o0 = false;
                }
            }
            this.h = null;
        }
        r00Var.a(this.L, this.M);
        this.b = true;
        try {
            W(this.L, this.M);
            e();
            g0();
            if (this.K) {
                this.K = false;
                e0();
            }
            ((HashMap) this.c.Z).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x023a A[PHI: r15
  0x023a: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:105:0x0227, B:109:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    public final void C(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        Object objPrevious;
        String str;
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5 = i;
        z47 z47Var = this.c;
        ArrayList arrayList4 = this.n;
        boolean z3 = ((r00) arrayList.get(i5)).o;
        ArrayList arrayList5 = this.N;
        if (arrayList5 == null) {
            this.N = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.N.addAll(z47Var.G());
        qk2 qk2Var = this.z;
        int i6 = i5;
        boolean z4 = false;
        while (i6 < i2) {
            r00 r00Var = (r00) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.N;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z3;
                i3 = i6;
                z2 = z4;
                int i7 = 1;
                ArrayList arrayList7 = r00Var.a;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    cm2 cm2Var = (cm2) arrayList7.get(size);
                    int i8 = cm2Var.a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(cm2Var.b);
                                    break;
                                case 8:
                                    qk2Var = null;
                                    break;
                                case 9:
                                    qk2Var = cm2Var.b;
                                    break;
                                case 10:
                                    cm2Var.i = cm2Var.h;
                                    break;
                            }
                        } else {
                            arrayList6.add(cm2Var.b);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(cm2Var.b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = r00Var.a;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    cm2 cm2Var2 = (cm2) arrayList8.get(i9);
                    boolean z5 = z3;
                    int i10 = cm2Var2.a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                z4 = z4;
                                arrayList6.remove(cm2Var2.b);
                                qk2 qk2Var2 = cm2Var2.b;
                                if (qk2Var2 == qk2Var) {
                                    arrayList8.add(i9, new cm2(9, qk2Var2));
                                    i9++;
                                    qk2Var = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 != 8) {
                                z4 = z4;
                            } else {
                                z4 = z4;
                                arrayList8.add(i9, new cm2(9, qk2Var, 0));
                                cm2Var2.c = true;
                                i9++;
                                qk2Var = cm2Var2.b;
                            }
                            i12 = 1;
                        } else {
                            z4 = z4;
                            qk2 qk2Var3 = cm2Var2.b;
                            int i13 = qk2Var3.A0;
                            int size2 = arrayList6.size() - 1;
                            boolean z6 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                qk2 qk2Var4 = (qk2) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (qk2Var4.A0 != i13) {
                                    i13 = i13;
                                } else if (qk2Var4 == qk2Var3) {
                                    i13 = i13;
                                    z6 = true;
                                } else {
                                    if (qk2Var4 == qk2Var) {
                                        arrayList8.add(i9, new cm2(9, qk2Var4, 0));
                                        i9++;
                                        i4 = 0;
                                        qk2Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    cm2 cm2Var3 = new cm2(3, qk2Var4, i4);
                                    cm2Var3.d = cm2Var2.d;
                                    cm2Var3.f = cm2Var2.f;
                                    cm2Var3.e = cm2Var2.e;
                                    cm2Var3.g = cm2Var2.g;
                                    arrayList8.add(i9, cm2Var3);
                                    arrayList6.remove(qk2Var4);
                                    i9++;
                                    qk2Var = qk2Var;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z6) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                cm2Var2.a = 1;
                                cm2Var2.c = true;
                                arrayList6.add(qk2Var3);
                            }
                        }
                        i9 += i12;
                        z3 = z5;
                        i6 = i11;
                        z4 = z4;
                        arrayList4 = arrayList4;
                    }
                    arrayList6.add(cm2Var2.b);
                    i9 += i12;
                    z3 = z5;
                    i6 = i11;
                    z4 = z4;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z3;
                i3 = i6;
                z2 = z4;
            }
            z4 = z2 || r00Var.g;
            i6 = i3 + 1;
            z3 = z;
            arrayList4 = arrayList3;
        }
        ArrayList arrayList10 = arrayList4;
        boolean z7 = z3;
        boolean z8 = z4;
        this.N.clear();
        if (!z7 && this.v >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((r00) arrayList.get(i15)).a.iterator();
                while (it.hasNext()) {
                    qk2 qk2Var5 = ((cm2) it.next()).b;
                    if (qk2Var5 != null && qk2Var5.v0 != null) {
                        z47Var.N(h(qk2Var5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i16 = i5;
        while (i16 < i2) {
            r00 r00Var2 = (r00) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                r00Var2.c(-1);
                ml2 ml2Var = r00Var2.q;
                ArrayList arrayList11 = r00Var2.a;
                boolean z9 = true;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    cm2 cm2Var4 = (cm2) arrayList11.get(size3);
                    qk2 qk2Var6 = cm2Var4.b;
                    if (qk2Var6 != null) {
                        if (qk2Var6.M0 != null) {
                            qk2Var6.g().a = z9;
                        }
                        int i17 = r00Var2.f;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (qk2Var6.M0 != null || i18 != 0) {
                            qk2Var6.g();
                            qk2Var6.M0.f = i18;
                        }
                        qk2Var6.g();
                        qk2Var6.M0.getClass();
                    }
                    switch (cm2Var4.a) {
                        case 1:
                            qk2Var6.P(cm2Var4.d, cm2Var4.e, cm2Var4.f, cm2Var4.g);
                            z9 = true;
                            ml2Var.a0(qk2Var6, true);
                            ml2Var.V(qk2Var6);
                            break;
                        case 2:
                        default:
                            xw3.h(cm2Var4.a, str2);
                            return;
                        case 3:
                            qk2Var6.P(cm2Var4.d, cm2Var4.e, cm2Var4.f, cm2Var4.g);
                            ml2Var.a(qk2Var6);
                            z9 = true;
                            break;
                        case 4:
                            qk2Var6.P(cm2Var4.d, cm2Var4.e, cm2Var4.f, cm2Var4.g);
                            ml2Var.getClass();
                            if (K(2)) {
                                Objects.toString(qk2Var6);
                            }
                            if (qk2Var6.C0) {
                                qk2Var6.C0 = false;
                                qk2Var6.N0 = !qk2Var6.N0;
                            }
                            z9 = true;
                            break;
                        case 5:
                            qk2Var6.P(cm2Var4.d, cm2Var4.e, cm2Var4.f, cm2Var4.g);
                            ml2Var.a0(qk2Var6, true);
                            if (K(2)) {
                                Objects.toString(qk2Var6);
                            }
                            if (!qk2Var6.C0) {
                                qk2Var6.C0 = true;
                                qk2Var6.N0 = !qk2Var6.N0;
                                ml2Var.d0(qk2Var6);
                            }
                            z9 = true;
                            break;
                        case 6:
                            qk2Var6.P(cm2Var4.d, cm2Var4.e, cm2Var4.f, cm2Var4.g);
                            ml2Var.c(qk2Var6);
                            z9 = true;
                            break;
                        case 7:
                            qk2Var6.P(cm2Var4.d, cm2Var4.e, cm2Var4.f, cm2Var4.g);
                            ml2Var.a0(qk2Var6, true);
                            ml2Var.i(qk2Var6);
                            z9 = true;
                            break;
                        case 8:
                            ml2Var.c0(null);
                            z9 = true;
                            break;
                        case 9:
                            ml2Var.c0(qk2Var6);
                            z9 = true;
                            break;
                        case 10:
                            cm2Var4.i = qk2Var6.R0;
                            ml2Var.b0(qk2Var6, cm2Var4.h);
                            z9 = true;
                            break;
                    }
                }
            } else {
                r00Var2.c(1);
                ml2 ml2Var2 = r00Var2.q;
                ArrayList arrayList12 = r00Var2.a;
                int size4 = arrayList12.size();
                int i20 = 0;
                while (i20 < size4) {
                    cm2 cm2Var5 = (cm2) arrayList12.get(i20);
                    qk2 qk2Var7 = cm2Var5.b;
                    if (qk2Var7 != null) {
                        if (qk2Var7.M0 != null) {
                            qk2Var7.g().a = false;
                        }
                        int i21 = r00Var2.f;
                        if (qk2Var7.M0 != null || i21 != 0) {
                            qk2Var7.g();
                            qk2Var7.M0.f = i21;
                        }
                        qk2Var7.g();
                        qk2Var7.M0.getClass();
                    }
                    switch (cm2Var5.a) {
                        case 1:
                            str = str2;
                            qk2Var7.P(cm2Var5.d, cm2Var5.e, cm2Var5.f, cm2Var5.g);
                            ml2Var2.a0(qk2Var7, false);
                            ml2Var2.a(qk2Var7);
                            i20++;
                            str2 = str;
                            break;
                        case 2:
                        default:
                            xw3.h(cm2Var5.a, str2);
                            return;
                        case 3:
                            str = str2;
                            qk2Var7.P(cm2Var5.d, cm2Var5.e, cm2Var5.f, cm2Var5.g);
                            ml2Var2.V(qk2Var7);
                            i20++;
                            str2 = str;
                            break;
                        case 4:
                            str = str2;
                            qk2Var7.P(cm2Var5.d, cm2Var5.e, cm2Var5.f, cm2Var5.g);
                            ml2Var2.getClass();
                            if (K(2)) {
                                Objects.toString(qk2Var7);
                            }
                            if (!qk2Var7.C0) {
                                qk2Var7.C0 = true;
                                qk2Var7.N0 = !qk2Var7.N0;
                                ml2Var2.d0(qk2Var7);
                            }
                            i20++;
                            str2 = str;
                            break;
                        case 5:
                            str = str2;
                            qk2Var7.P(cm2Var5.d, cm2Var5.e, cm2Var5.f, cm2Var5.g);
                            ml2Var2.a0(qk2Var7, false);
                            if (K(2)) {
                                Objects.toString(qk2Var7);
                            }
                            if (qk2Var7.C0) {
                                qk2Var7.C0 = false;
                                qk2Var7.N0 = !qk2Var7.N0;
                            }
                            i20++;
                            str2 = str;
                            break;
                        case 6:
                            str = str2;
                            qk2Var7.P(cm2Var5.d, cm2Var5.e, cm2Var5.f, cm2Var5.g);
                            ml2Var2.i(qk2Var7);
                            i20++;
                            str2 = str;
                            break;
                        case 7:
                            str = str2;
                            qk2Var7.P(cm2Var5.d, cm2Var5.e, cm2Var5.f, cm2Var5.g);
                            ml2Var2.a0(qk2Var7, false);
                            ml2Var2.c(qk2Var7);
                            i20++;
                            str2 = str;
                            break;
                        case 8:
                            ml2Var2.c0(qk2Var7);
                            str = str2;
                            i20++;
                            str2 = str;
                            break;
                        case 9:
                            ml2Var2.c0(null);
                            str = str2;
                            i20++;
                            str2 = str;
                            break;
                        case 10:
                            cm2Var5.h = qk2Var7.R0;
                            ml2Var2.b0(qk2Var7, cm2Var5.i);
                            str = str2;
                            i20++;
                            str2 = str;
                            break;
                    }
                }
            }
            i16++;
            str2 = str2;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z8 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(G((r00) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = arrayList10.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        c2.m();
                        return;
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        c2.m();
                        return;
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i22 = i5; i22 < i2; i22++) {
            r00 r00Var3 = (r00) arrayList.get(i22);
            if (zBooleanValue2) {
                for (int size5 = r00Var3.a.size() - 1; size5 >= 0; size5--) {
                    qk2 qk2Var8 = ((cm2) r00Var3.a.get(size5)).b;
                    if (qk2Var8 != null) {
                        h(qk2Var8).k();
                    }
                }
            } else {
                Iterator it7 = r00Var3.a.iterator();
                while (it7.hasNext()) {
                    qk2 qk2Var9 = ((cm2) it7.next()).b;
                    if (qk2Var9 != null) {
                        h(qk2Var9).k();
                    }
                }
            }
        }
        Q(this.v, true);
        for (fg1 fg1Var : g(arrayList, i5, i2)) {
            fg1Var.e = zBooleanValue2;
            synchronized (fg1Var.b) {
                try {
                    fg1Var.l();
                    ArrayList arrayList13 = fg1Var.b;
                    ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            xe7 xe7Var = (xe7) objPrevious;
                            we5 we5Var = ze7.X;
                            View view = xe7Var.c.J0;
                            view.getClass();
                            we5Var.getClass();
                            ze7 ze7VarD = we5.d(view);
                            ze7 ze7Var = xe7Var.a;
                            ze7 ze7Var2 = ze7.Z;
                            if (ze7Var != ze7Var2 || ze7VarD == ze7Var2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    fg1Var.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            fg1Var.e();
        }
        while (i5 < i2) {
            r00 r00Var4 = (r00) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && r00Var4.s >= 0) {
                r00Var4.s = -1;
            }
            if (r00Var4.p != null) {
                for (int i23 = 0; i23 < r00Var4.p.size(); i23++) {
                    ((Runnable) r00Var4.p.get(i23)).run();
                }
                r00Var4.p = null;
            }
            i5++;
        }
        if (!z8 || arrayList10.size() <= 0) {
            return;
        }
        arrayList10.get(0).getClass();
        c2.m();
    }

    public final qk2 D(int i) {
        z47 z47Var = this.c;
        ArrayList arrayList = (ArrayList) z47Var.Y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qk2 qk2Var = (qk2) arrayList.get(size);
            if (qk2Var != null && qk2Var.z0 == i) {
                return qk2Var;
            }
        }
        for (wl2 wl2Var : ((HashMap) z47Var.Z).values()) {
            if (wl2Var != null) {
                qk2 qk2Var2 = wl2Var.c;
                if (qk2Var2.z0 == i) {
                    return qk2Var2;
                }
            }
        }
        return null;
    }

    public final qk2 E(String str) {
        z47 z47Var = this.c;
        ArrayList arrayList = (ArrayList) z47Var.Y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qk2 qk2Var = (qk2) arrayList.get(size);
            if (qk2Var != null && str.equals(qk2Var.B0)) {
                return qk2Var;
            }
        }
        for (wl2 wl2Var : ((HashMap) z47Var.Z).values()) {
            if (wl2Var != null) {
                qk2 qk2Var2 = wl2Var.c;
                if (str.equals(qk2Var2.B0)) {
                    return qk2Var2;
                }
            }
        }
        return null;
    }

    public final void F() {
        for (fg1 fg1Var : f()) {
            if (fg1Var.f) {
                fg1Var.f = false;
                fg1Var.e();
            }
        }
    }

    public final ViewGroup H(qk2 qk2Var) {
        ViewGroup viewGroup = qk2Var.I0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (qk2Var.A0 <= 0 || !this.x.X()) {
            return null;
        }
        View viewW = this.x.W(qk2Var.A0);
        if (viewW instanceof ViewGroup) {
            return (ViewGroup) viewW;
        }
        return null;
    }

    public final gl2 I() {
        qk2 qk2Var = this.y;
        return qk2Var != null ? qk2Var.v0.I() : this.A;
    }

    public final k42 J() {
        qk2 qk2Var = this.y;
        return qk2Var != null ? qk2Var.v0.J() : this.B;
    }

    public final boolean M() {
        qk2 qk2Var = this.y;
        if (qk2Var == null) {
            return true;
        }
        return qk2Var.s() && this.y.n().M();
    }

    public final boolean P() {
        return this.H || this.I;
    }

    public final void Q(int i, boolean z) {
        tk2 tk2Var;
        if (this.w == null && i != -1) {
            bt.i("No activity");
            return;
        }
        if (z || i != this.v) {
            this.v = i;
            z47 z47Var = this.c;
            HashMap map = (HashMap) z47Var.Z;
            Iterator it = ((ArrayList) z47Var.Y).iterator();
            while (it.hasNext()) {
                wl2 wl2Var = (wl2) map.get(((qk2) it.next()).g0);
                if (wl2Var != null) {
                    wl2Var.k();
                }
            }
            for (wl2 wl2Var2 : map.values()) {
                if (wl2Var2 != null) {
                    wl2Var2.k();
                    qk2 qk2Var = wl2Var2.c;
                    if (qk2Var.n0 && !qk2Var.u()) {
                        z47Var.O(wl2Var2);
                    }
                }
            }
            e0();
            if (this.G && (tk2Var = this.w) != null && this.v == 7) {
                tk2Var.F0.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.g = false;
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null) {
                qk2Var.x0.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i, int i2) {
        A(false);
        z(true);
        qk2 qk2Var = this.z;
        if (qk2Var != null && i < 0 && qk2Var.j().S()) {
            return true;
        }
        boolean zU = U(i, i2, this.L, this.M);
        if (zU) {
            this.b = true;
            try {
                W(this.L, this.M);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        g0();
        if (this.K) {
            this.K = false;
            e0();
        }
        ((HashMap) this.c.Z).values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    r00 r00Var = (r00) this.d.get(size2);
                    if (i >= 0 && i == r00Var.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        r00 r00Var2 = (r00) this.d.get(size - 1);
                        if (i < 0 || i != r00Var2.s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((r00) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(qk2 qk2Var) {
        if (K(2)) {
            Objects.toString(qk2Var);
        }
        boolean zU = qk2Var.u();
        if (qk2Var.D0 && zU) {
            return;
        }
        z47 z47Var = this.c;
        synchronized (((ArrayList) z47Var.Y)) {
            ((ArrayList) z47Var.Y).remove(qk2Var);
        }
        qk2Var.m0 = false;
        if (L(qk2Var)) {
            this.G = true;
        }
        qk2Var.n0 = true;
        d0(qk2Var);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            bt.i("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((r00) arrayList.get(i)).o) {
                if (i2 != i) {
                    C(i2, i, arrayList, arrayList2);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((r00) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                C(i, i2, arrayList, arrayList2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            C(i2, size, arrayList, arrayList2);
        }
    }

    public final void X(Bundle bundle) {
        mj0 mj0Var;
        int i;
        int i2;
        wl2 wl2Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.w.C0.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.w.C0.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        z47 z47Var = this.c;
        HashMap map2 = (HashMap) z47Var.f0;
        HashMap map3 = (HashMap) z47Var.Z;
        map2.clear();
        map2.putAll(map);
        nl2 nl2Var = (nl2) bundle.getParcelable("state");
        if (nl2Var == null) {
            return;
        }
        map3.clear();
        Iterator it = nl2Var.X.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mj0Var = this.o;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleR = z47Var.R((String) it.next(), null);
            if (bundleR != null) {
                qk2 qk2Var = (qk2) this.O.b.get(((tl2) bundleR.getParcelable("state")).Y);
                if (qk2Var != null) {
                    if (K(2)) {
                        qk2Var.toString();
                    }
                    wl2Var = new wl2(mj0Var, z47Var, qk2Var, bundleR);
                } else {
                    wl2Var = new wl2(this.o, this.c, this.w.C0.getClassLoader(), I(), bundleR);
                }
                qk2 qk2Var2 = wl2Var.c;
                qk2Var2.Y = bundleR;
                qk2Var2.v0 = this;
                if (K(2)) {
                    qk2Var2.toString();
                }
                wl2Var.m(this.w.C0.getClassLoader());
                z47Var.N(wl2Var);
                wl2Var.e = this.v;
            }
        }
        pl2 pl2Var = this.O;
        pl2Var.getClass();
        for (qk2 qk2Var3 : new ArrayList(pl2Var.b.values())) {
            if (map3.get(qk2Var3.g0) == null) {
                if (K(2)) {
                    qk2Var3.toString();
                    Objects.toString(nl2Var.X);
                }
                this.O.g(qk2Var3);
                qk2Var3.v0 = this;
                wl2 wl2Var2 = new wl2(mj0Var, z47Var, qk2Var3);
                wl2Var2.e = 1;
                wl2Var2.k();
                qk2Var3.n0 = true;
                wl2Var2.k();
            }
        }
        ArrayList<String> arrayList = nl2Var.Y;
        ((ArrayList) z47Var.Y).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                qk2 qk2VarZ = z47Var.z(str3);
                if (qk2VarZ == null) {
                    bt.i(pc6.p("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (K(2)) {
                        qk2VarZ.toString();
                    }
                    z47Var.i(qk2VarZ);
                }
            }
        }
        if (nl2Var.Z != null) {
            this.d = new ArrayList(nl2Var.Z.length);
            int i3 = 0;
            while (true) {
                s00[] s00VarArr = nl2Var.Z;
                if (i3 >= s00VarArr.length) {
                    break;
                }
                s00 s00Var = s00VarArr[i3];
                ArrayList arrayList2 = s00Var.Y;
                r00 r00Var = new r00(this);
                int[] iArr = s00Var.X;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    cm2 cm2Var = new cm2();
                    int i6 = i4 + 1;
                    cm2Var.a = iArr[i4];
                    if (K(i)) {
                        Objects.toString(r00Var);
                        int i7 = iArr[i6];
                    }
                    int i8 = i;
                    cm2Var.h = o84.values()[s00Var.Z[i5]];
                    cm2Var.i = o84.values()[s00Var.f0[i5]];
                    int i9 = i4 + 2;
                    cm2Var.c = iArr[i6] != 0;
                    int i10 = iArr[i9];
                    cm2Var.d = i10;
                    int i11 = iArr[i4 + 3];
                    cm2Var.e = i11;
                    int i12 = i4 + 5;
                    int i13 = iArr[i4 + 4];
                    cm2Var.f = i13;
                    i4 += 6;
                    int i14 = iArr[i12];
                    cm2Var.g = i14;
                    r00Var.b = i10;
                    r00Var.c = i11;
                    r00Var.d = i13;
                    r00Var.e = i14;
                    r00Var.b(cm2Var);
                    i5++;
                    i = i8;
                }
                int i15 = i;
                r00Var.f = s00Var.g0;
                r00Var.h = s00Var.h0;
                r00Var.g = true;
                r00Var.i = s00Var.j0;
                r00Var.j = s00Var.k0;
                r00Var.k = s00Var.l0;
                r00Var.l = s00Var.m0;
                r00Var.m = s00Var.n0;
                r00Var.n = s00Var.o0;
                r00Var.o = s00Var.p0;
                r00Var.s = s00Var.i0;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    String str4 = (String) arrayList2.get(i16);
                    if (str4 != null) {
                        ((cm2) r00Var.a.get(i16)).b = z47Var.z(str4);
                    }
                }
                r00Var.c(1);
                if (K(i15)) {
                    r00Var.toString();
                    PrintWriter printWriter = new PrintWriter(new ih4());
                    r00Var.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(r00Var);
                i3++;
                i = i15;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.k.set(nl2Var.f0);
        String str5 = nl2Var.g0;
        if (str5 != null) {
            qk2 qk2VarZ2 = z47Var.z(str5);
            this.z = qk2VarZ2;
            s(qk2VarZ2);
        }
        ArrayList arrayList3 = nl2Var.h0;
        if (arrayList3 != null) {
            for (int i17 = i2; i17 < arrayList3.size(); i17++) {
                this.l.put((String) arrayList3.get(i17), (t00) nl2Var.i0.get(i17));
            }
        }
        this.F = new ArrayDeque(nl2Var.j0);
    }

    public final Bundle Y() {
        ArrayList arrayList;
        s00[] s00VarArr;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        z47 z47Var = this.c;
        z47Var.getClass();
        HashMap map = (HashMap) z47Var.Z;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (wl2 wl2Var : map.values()) {
            if (wl2Var != null) {
                qk2 qk2Var = wl2Var.c;
                z47Var.R(qk2Var.g0, wl2Var.o());
                arrayList2.add(qk2Var.g0);
                if (K(2)) {
                    qk2Var.toString();
                    Objects.toString(qk2Var.Y);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.f0;
        if (!map2.isEmpty()) {
            z47 z47Var2 = this.c;
            synchronized (((ArrayList) z47Var2.Y)) {
                try {
                    if (((ArrayList) z47Var2.Y).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) z47Var2.Y).size());
                        for (qk2 qk2Var2 : (ArrayList) z47Var2.Y) {
                            arrayList.add(qk2Var2.g0);
                            if (K(2)) {
                                qk2Var2.toString();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.d.size();
            if (size > 0) {
                s00VarArr = new s00[size];
                for (int i = 0; i < size; i++) {
                    s00VarArr[i] = new s00((r00) this.d.get(i));
                    if (K(2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            } else {
                s00VarArr = null;
            }
            nl2 nl2Var = new nl2();
            nl2Var.g0 = null;
            ArrayList arrayList3 = new ArrayList();
            nl2Var.h0 = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            nl2Var.i0 = arrayList4;
            nl2Var.X = arrayList2;
            nl2Var.Y = arrayList;
            nl2Var.Z = s00VarArr;
            nl2Var.f0 = this.k.get();
            qk2 qk2Var3 = this.z;
            if (qk2Var3 != null) {
                nl2Var.g0 = qk2Var3.g0;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            nl2Var.j0 = new ArrayList(this.F);
            bundle.putParcelable("state", nl2Var);
            for (String str : this.m.keySet()) {
                bundle.putBundle(oi0.l("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(oi0.l("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.D0.removeCallbacks(this.P);
                    this.w.D0.post(this.P);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wl2 a(qk2 qk2Var) {
        String str = qk2Var.Q0;
        if (str != null) {
            am2.c(qk2Var, str);
        }
        if (K(2)) {
            qk2Var.toString();
        }
        wl2 wl2VarH = h(qk2Var);
        qk2Var.v0 = this;
        z47 z47Var = this.c;
        z47Var.N(wl2VarH);
        if (!qk2Var.D0) {
            z47Var.i(qk2Var);
            qk2Var.n0 = false;
            if (qk2Var.J0 == null) {
                qk2Var.N0 = false;
            }
            if (L(qk2Var)) {
                this.G = true;
            }
        }
        return wl2VarH;
    }

    public final void a0(qk2 qk2Var, boolean z) {
        ViewGroup viewGroupH = H(qk2Var);
        if (viewGroupH == null || !(viewGroupH instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupH).setDrawDisappearingViewsLast(!z);
    }

    public final void b(tk2 tk2Var, vj8 vj8Var, qk2 qk2Var) {
        pl2 pl2Var;
        if (this.w != null) {
            bt.i("Already attached");
            return;
        }
        this.w = tk2Var;
        this.x = vj8Var;
        this.y = qk2Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (qk2Var != null) {
            copyOnWriteArrayList.add(new hl2(qk2Var));
        } else if (tk2Var != null) {
            copyOnWriteArrayList.add(tk2Var);
        }
        if (this.y != null) {
            g0();
        }
        if (tk2Var != null) {
            z95 z95VarB = tk2Var.F0.b();
            this.g = z95VarB;
            z95VarB.a(qk2Var != null ? qk2Var : tk2Var, this.j);
        }
        byte b = 0;
        if (qk2Var != null) {
            pl2 pl2Var2 = qk2Var.v0.O;
            HashMap map = pl2Var2.c;
            pl2Var = (pl2) map.get(qk2Var.g0);
            if (pl2Var == null) {
                pl2Var = new pl2(pl2Var2.e);
                map.put(qk2Var.g0, pl2Var);
            }
            this.O = pl2Var;
        } else if (tk2Var != null) {
            ex8 ex8VarE = tk2Var.F0.e();
            n71 n71Var = n71.b;
            n71Var.getClass();
            yr6 yr6Var = new yr6(ex8VarE, pl2.h, n71Var);
            zu3 zu3VarB = yb6.a.b(pl2.class);
            String strP = zu3VarB.p();
            if (strP == null) {
                bt.q("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                pl2Var = (pl2) yr6Var.g(zu3VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
                this.O = pl2Var;
            }
        } else {
            pl2Var = new pl2(false);
            this.O = pl2Var;
        }
        pl2Var.g = P();
        this.c.g0 = this.O;
        tk2 tk2Var2 = this.w;
        byte b2 = 3;
        if (tk2Var2 != null && qk2Var == null) {
            xd6 xd6VarF = tk2Var2.f();
            xd6VarF.D("android:support:fragments", new hy0(this, b2));
            Bundle bundleI = xd6VarF.i("android:support:fragments");
            if (bundleI != null) {
                X(bundleI);
            }
        }
        tk2 tk2Var3 = this.w;
        if (tk2Var3 != null) {
            ly0 ly0Var = tk2Var3.F0.k0;
            String strConcat = "FragmentManager:".concat(qk2Var != null ? oi0.p(new StringBuilder(), qk2Var.g0, ":") : _UrlKt.FRAGMENT_ENCODE_SET);
            this.C = ly0Var.c(strConcat.concat("StartActivityForResult"), new n6((byte) 2), new vk1((Object) this, (byte) 10));
            byte b3 = 1;
            this.D = ly0Var.c(strConcat.concat("StartIntentSenderForResult"), new n6(b2), new el2(this, b3));
            this.E = ly0Var.c(strConcat.concat("RequestPermissions"), new n6(b3), new el2(this, b));
        }
        tk2 tk2Var4 = this.w;
        if (tk2Var4 != null) {
            AppCompatActivity appCompatActivity = tk2Var4.F0;
            dl2 dl2Var = this.q;
            dl2Var.getClass();
            appCompatActivity.l0.add(dl2Var);
        }
        tk2 tk2Var5 = this.w;
        if (tk2Var5 != null) {
            AppCompatActivity appCompatActivity2 = tk2Var5.F0;
            dl2 dl2Var2 = this.r;
            dl2Var2.getClass();
            appCompatActivity2.m0.add(dl2Var2);
        }
        tk2 tk2Var6 = this.w;
        if (tk2Var6 != null) {
            AppCompatActivity appCompatActivity3 = tk2Var6.F0;
            dl2 dl2Var3 = this.s;
            dl2Var3.getClass();
            appCompatActivity3.o0.add(dl2Var3);
        }
        tk2 tk2Var7 = this.w;
        if (tk2Var7 != null) {
            AppCompatActivity appCompatActivity4 = tk2Var7.F0;
            dl2 dl2Var4 = this.t;
            dl2Var4.getClass();
            appCompatActivity4.p0.add(dl2Var4);
        }
        tk2 tk2Var8 = this.w;
        if (tk2Var8 == null || qk2Var != null) {
            return;
        }
        AppCompatActivity appCompatActivity5 = tk2Var8.F0;
        fl2 fl2Var = this.u;
        fl2Var.getClass();
        f63 f63Var = appCompatActivity5.Z;
        ((CopyOnWriteArrayList) f63Var.Z).add(fl2Var);
        ((Runnable) f63Var.Y).run();
    }

    public final void b0(qk2 qk2Var, o84 o84Var) {
        if (qk2Var == this.c.z(qk2Var.g0) && (qk2Var.w0 == null || qk2Var.v0 == this)) {
            qk2Var.R0 = o84Var;
        } else {
            b61.l("Fragment ", qk2Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void c(qk2 qk2Var) {
        if (K(2)) {
            Objects.toString(qk2Var);
        }
        if (qk2Var.D0) {
            qk2Var.D0 = false;
            if (qk2Var.m0) {
                return;
            }
            this.c.i(qk2Var);
            if (K(2)) {
                qk2Var.toString();
            }
            if (L(qk2Var)) {
                this.G = true;
            }
        }
    }

    public final void c0(qk2 qk2Var) {
        if (qk2Var != null) {
            if (qk2Var != this.c.z(qk2Var.g0) || (qk2Var.w0 != null && qk2Var.v0 != this)) {
                b61.l("Fragment ", qk2Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        qk2 qk2Var2 = this.z;
        this.z = qk2Var;
        s(qk2Var2);
        s(this.z);
    }

    public final void d() {
        if (K(3)) {
            Objects.toString(this.h);
        }
        r00 r00Var = this.h;
        if (r00Var != null) {
            r00Var.r = false;
            r00Var.d();
            r00 r00Var2 = this.h;
            c1 c1Var = new c1(this, (byte) 21);
            ArrayList arrayList = r00Var2.p;
            if (arrayList == null) {
                arrayList = new ArrayList();
                r00Var2.p = arrayList;
            }
            arrayList.add(c1Var);
            this.h.e();
            this.i = true;
            A(true);
            F();
            this.i = false;
            this.h = null;
        }
    }

    public final void d0(qk2 qk2Var) {
        ViewGroup viewGroupH = H(qk2Var);
        if (viewGroupH != null) {
            nk2 nk2Var = qk2Var.M0;
            if ((nk2Var == null ? 0 : nk2Var.e) + (nk2Var == null ? 0 : nk2Var.d) + (nk2Var == null ? 0 : nk2Var.c) + (nk2Var == null ? 0 : nk2Var.b) > 0) {
                if (viewGroupH.getTag(t36.visible_removing_fragment_view_tag) == null) {
                    viewGroupH.setTag(t36.visible_removing_fragment_view_tag, qk2Var);
                }
                qk2 qk2Var2 = (qk2) viewGroupH.getTag(t36.visible_removing_fragment_view_tag);
                nk2 nk2Var2 = qk2Var.M0;
                boolean z = nk2Var2 != null ? nk2Var2.a : false;
                if (qk2Var2.M0 == null) {
                    return;
                }
                qk2Var2.g().a = z;
            }
        }
    }

    public final void e() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void e0() {
        for (wl2 wl2Var : this.c.C()) {
            qk2 qk2Var = wl2Var.c;
            if (qk2Var.K0) {
                if (this.b) {
                    this.K = true;
                } else {
                    qk2Var.K0 = false;
                    wl2Var.k();
                }
            }
        }
    }

    public final HashSet f() {
        fg1 fg1Var;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.C().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((wl2) it.next()).c.I0;
            if (viewGroup != null) {
                J().getClass();
                Object tag = viewGroup.getTag(t36.special_effects_controller_view_tag);
                if (tag instanceof fg1) {
                    fg1Var = (fg1) tag;
                } else {
                    fg1Var = new fg1(viewGroup);
                    viewGroup.setTag(t36.special_effects_controller_view_tag, fg1Var);
                }
                hashSet.add(fg1Var);
            }
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new ih4());
        tk2 tk2Var = this.w;
        try {
            if (tk2Var != null) {
                tk2Var.F0.dump("  ", null, printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final HashSet g(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((r00) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                qk2 qk2Var = ((cm2) it.next()).b;
                if (qk2Var != null && (viewGroup = qk2Var.I0) != null) {
                    hashSet.add(fg1.i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void g0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (K(3)) {
                        toString();
                    }
                } else {
                    boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.y);
                    if (K(3)) {
                        toString();
                    }
                    this.j.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wl2 h(qk2 qk2Var) {
        String str = qk2Var.g0;
        z47 z47Var = this.c;
        wl2 wl2Var = (wl2) ((HashMap) z47Var.Z).get(str);
        if (wl2Var != null) {
            return wl2Var;
        }
        wl2 wl2Var2 = new wl2(this.o, z47Var, qk2Var);
        wl2Var2.m(this.w.C0.getClassLoader());
        wl2Var2.e = this.v;
        return wl2Var2;
    }

    public final void i(qk2 qk2Var) {
        if (K(2)) {
            Objects.toString(qk2Var);
        }
        if (qk2Var.D0) {
            return;
        }
        qk2Var.D0 = true;
        if (qk2Var.m0) {
            if (K(2)) {
                qk2Var.toString();
            }
            z47 z47Var = this.c;
            synchronized (((ArrayList) z47Var.Y)) {
                ((ArrayList) z47Var.Y).remove(qk2Var);
            }
            qk2Var.m0 = false;
            if (L(qk2Var)) {
                this.G = true;
            }
            d0(qk2Var);
        }
    }

    public final void j(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null) {
                qk2Var.H0 = true;
                if (z) {
                    qk2Var.x0.j(true);
                }
            }
        }
    }

    public final boolean k() {
        if (this.v >= 1) {
            for (qk2 qk2Var : this.c.G()) {
                if (qk2Var != null) {
                    if (!qk2Var.C0 ? qk2Var.x0.k() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean l() {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null && N(qk2Var)) {
                if (!qk2Var.C0 ? qk2Var.x0.l() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(qk2Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                qk2 qk2Var2 = (qk2) this.e.get(i);
                if (arrayList == null || !arrayList.contains(qk2Var2)) {
                    qk2Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void m() {
        this.J = true;
        A(true);
        x();
        tk2 tk2Var = this.w;
        z47 z47Var = this.c;
        if (tk2Var != null ? ((pl2) z47Var.g0).f : true ^ tk2Var.C0.isChangingConfigurations()) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((t00) it.next()).X.iterator();
                while (it2.hasNext()) {
                    ((pl2) z47Var.g0).f((String) it2.next(), false);
                }
            }
        }
        v(-1);
        tk2 tk2Var2 = this.w;
        if (tk2Var2 != null) {
            AppCompatActivity appCompatActivity = tk2Var2.F0;
            dl2 dl2Var = this.r;
            dl2Var.getClass();
            appCompatActivity.m0.remove(dl2Var);
        }
        tk2 tk2Var3 = this.w;
        if (tk2Var3 != null) {
            AppCompatActivity appCompatActivity2 = tk2Var3.F0;
            dl2 dl2Var2 = this.q;
            dl2Var2.getClass();
            appCompatActivity2.l0.remove(dl2Var2);
        }
        tk2 tk2Var4 = this.w;
        if (tk2Var4 != null) {
            AppCompatActivity appCompatActivity3 = tk2Var4.F0;
            dl2 dl2Var3 = this.s;
            dl2Var3.getClass();
            appCompatActivity3.o0.remove(dl2Var3);
        }
        tk2 tk2Var5 = this.w;
        if (tk2Var5 != null) {
            AppCompatActivity appCompatActivity4 = tk2Var5.F0;
            dl2 dl2Var4 = this.t;
            dl2Var4.getClass();
            appCompatActivity4.p0.remove(dl2Var4);
        }
        tk2 tk2Var6 = this.w;
        if (tk2Var6 != null && this.y == null) {
            AppCompatActivity appCompatActivity5 = tk2Var6.F0;
            fl2 fl2Var = this.u;
            fl2Var.getClass();
            f63 f63Var = appCompatActivity5.Z;
            ((CopyOnWriteArrayList) f63Var.Z).remove(fl2Var);
            if (((HashMap) f63Var.f0).remove(fl2Var) == null) {
                ((Runnable) f63Var.Y).run();
            } else {
                c2.m();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        r6 r6Var = this.C;
        if (r6Var != null) {
            r6Var.i0();
            this.D.i0();
            this.E.i0();
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null) {
                qk2Var.H0 = true;
                if (z) {
                    qk2Var.x0.n(true);
                }
            }
        }
    }

    public final void o(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null && z) {
                qk2Var.x0.o(true);
            }
        }
    }

    public final void p() {
        for (qk2 qk2Var : this.c.D()) {
            if (qk2Var != null) {
                qk2Var.t();
                qk2Var.x0.p();
            }
        }
    }

    public final boolean q() {
        if (this.v >= 1) {
            for (qk2 qk2Var : this.c.G()) {
                if (qk2Var != null) {
                    if (!qk2Var.C0 ? qk2Var.x0.q() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void r() {
        if (this.v < 1) {
            return;
        }
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null && !qk2Var.C0) {
                qk2Var.x0.r();
            }
        }
    }

    public final void s(qk2 qk2Var) {
        if (qk2Var != null) {
            if (qk2Var != this.c.z(qk2Var.g0)) {
                return;
            }
            qk2Var.v0.getClass();
            boolean zO = O(qk2Var);
            Boolean bool = qk2Var.l0;
            if (bool == null || bool.booleanValue() != zO) {
                qk2Var.l0 = Boolean.valueOf(zO);
                ml2 ml2Var = qk2Var.x0;
                ml2Var.g0();
                ml2Var.s(ml2Var.z);
            }
        }
    }

    public final void t(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null && z) {
                qk2Var.x0.t(true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        qk2 qk2Var = this.y;
        if (qk2Var != null) {
            sb.append(qk2Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            tk2 tk2Var = this.w;
            if (tk2Var != null) {
                sb.append(tk2Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final boolean u() {
        if (this.v < 1) {
            return false;
        }
        boolean z = false;
        for (qk2 qk2Var : this.c.G()) {
            if (qk2Var != null && N(qk2Var)) {
                if (!qk2Var.C0 ? qk2Var.x0.u() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void v(int i) {
        try {
            this.b = true;
            for (wl2 wl2Var : ((HashMap) this.c.Z).values()) {
                if (wl2Var != null) {
                    wl2Var.e = i;
                }
            }
            Q(i, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((fg1) it.next()).h();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strO = pc6.o(str, "    ");
        z47 z47Var = this.c;
        ArrayList arrayList = (ArrayList) z47Var.Y;
        String strO2 = pc6.o(str, "    ");
        HashMap map = (HashMap) z47Var.Z;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (wl2 wl2Var : map.values()) {
                printWriter.print(str);
                if (wl2Var != null) {
                    qk2 qk2Var = wl2Var.c;
                    printWriter.println(qk2Var);
                    printWriter.print(strO2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(qk2Var.z0));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(qk2Var.A0));
                    printWriter.print(" mTag=");
                    printWriter.println(qk2Var.B0);
                    printWriter.print(strO2);
                    printWriter.print("mState=");
                    printWriter.print(qk2Var.X);
                    printWriter.print(" mWho=");
                    printWriter.print(qk2Var.g0);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(qk2Var.u0);
                    printWriter.print(strO2);
                    printWriter.print("mAdded=");
                    printWriter.print(qk2Var.m0);
                    printWriter.print(" mRemoving=");
                    printWriter.print(qk2Var.n0);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(qk2Var.p0);
                    printWriter.print(" mInLayout=");
                    printWriter.println(qk2Var.q0);
                    printWriter.print(strO2);
                    printWriter.print("mHidden=");
                    printWriter.print(qk2Var.C0);
                    printWriter.print(" mDetached=");
                    printWriter.print(qk2Var.D0);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(qk2Var.G0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strO2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(qk2Var.E0);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(qk2Var.L0);
                    if (qk2Var.v0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(qk2Var.v0);
                    }
                    if (qk2Var.w0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mHost=");
                        printWriter.println(qk2Var.w0);
                    }
                    if (qk2Var.y0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(qk2Var.y0);
                    }
                    if (qk2Var.h0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mArguments=");
                        printWriter.println(qk2Var.h0);
                    }
                    if (qk2Var.Y != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(qk2Var.Y);
                    }
                    if (qk2Var.Z != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(qk2Var.Z);
                    }
                    if (qk2Var.f0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(qk2Var.f0);
                    }
                    Object objZ = qk2Var.i0;
                    if (objZ == null) {
                        ml2 ml2Var = qk2Var.v0;
                        objZ = (ml2Var == null || (str2 = qk2Var.j0) == null) ? null : ml2Var.c.z(str2);
                    }
                    if (objZ != null) {
                        printWriter.print(strO2);
                        printWriter.print("mTarget=");
                        printWriter.print(objZ);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(qk2Var.k0);
                    }
                    printWriter.print(strO2);
                    printWriter.print("mPopDirection=");
                    nk2 nk2Var = qk2Var.M0;
                    printWriter.println(nk2Var == null ? false : nk2Var.a);
                    nk2 nk2Var2 = qk2Var.M0;
                    if ((nk2Var2 == null ? 0 : nk2Var2.b) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getEnterAnim=");
                        nk2 nk2Var3 = qk2Var.M0;
                        printWriter.println(nk2Var3 == null ? 0 : nk2Var3.b);
                    }
                    nk2 nk2Var4 = qk2Var.M0;
                    if ((nk2Var4 == null ? 0 : nk2Var4.c) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getExitAnim=");
                        nk2 nk2Var5 = qk2Var.M0;
                        printWriter.println(nk2Var5 == null ? 0 : nk2Var5.c);
                    }
                    nk2 nk2Var6 = qk2Var.M0;
                    if ((nk2Var6 == null ? 0 : nk2Var6.d) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getPopEnterAnim=");
                        nk2 nk2Var7 = qk2Var.M0;
                        printWriter.println(nk2Var7 == null ? 0 : nk2Var7.d);
                    }
                    nk2 nk2Var8 = qk2Var.M0;
                    if ((nk2Var8 == null ? 0 : nk2Var8.e) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getPopExitAnim=");
                        nk2 nk2Var9 = qk2Var.M0;
                        printWriter.println(nk2Var9 == null ? 0 : nk2Var9.e);
                    }
                    if (qk2Var.I0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mContainer=");
                        printWriter.println(qk2Var.I0);
                    }
                    if (qk2Var.J0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mView=");
                        printWriter.println(qk2Var.J0);
                    }
                    if (qk2Var.k() != null) {
                        ex8 ex8VarE = qk2Var.e();
                        ol2 ol2Var = xc4.c;
                        ex8VarE.getClass();
                        n71 n71Var = n71.b;
                        n71Var.getClass();
                        yr6 yr6Var = new yr6(ex8VarE, ol2Var, n71Var);
                        zu3 zu3VarB = yb6.a.b(xc4.class);
                        String strP = zu3VarB.p();
                        if (strP != null) {
                            ue7 ue7Var = ((xc4) yr6Var.g(zu3VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP))).b;
                            if (ue7Var.Z > 0) {
                                printWriter.print(strO2);
                                printWriter.println("Loaders:");
                                if (ue7Var.Z > 0) {
                                    if (ue7Var.e(0) == null) {
                                        printWriter.print(strO2);
                                        printWriter.print("  #");
                                        printWriter.print(ue7Var.c(0));
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    c2.m();
                                }
                            }
                        } else {
                            bt.q("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(strO2);
                    printWriter.println("Child " + qk2Var.x0 + ":");
                    qk2Var.x0.w(strO2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                qk2 qk2Var2 = (qk2) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(qk2Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                qk2 qk2Var3 = (qk2) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(qk2Var3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                r00 r00Var = (r00) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(r00Var.toString());
                r00Var.h(strO, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (jl2) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((fg1) it.next()).h();
        }
    }

    public final void y(jl2 jl2Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    bt.i("FragmentManager has been destroyed");
                    return;
                } else {
                    bt.i("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (P()) {
                bt.i("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(jl2Var);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            bt.i("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                bt.i("FragmentManager has been destroyed");
                return;
            } else {
                bt.i("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.w.D0.getLooper()) {
            bt.i("Must be called from main thread of fragment host");
            return;
        }
        if (!z && P()) {
            bt.i("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
