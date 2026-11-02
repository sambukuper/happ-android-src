package defpackage;

import android.R;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class y45 implements q63, bq1, iv5, fz6, na1, kt5, hw5, i04, bd6, qe2, v17, u4, lt4 {
    public Object X;

    public y45(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.X = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public static s57 y(n63 n63Var) {
        Object obj = null;
        if (n63Var == null) {
            return null;
        }
        return new s57(n63Var, new Size(n63Var.b(), n63Var.a()), new eh0(new gj4(n63Var.r0().getTimestamp(), obj, d18.b)));
    }

    public int A(int[] iArr, int i) throws z96 {
        int[] iArr2;
        int[] iArr3;
        int iC;
        int i2;
        jq2 jq2Var = (jq2) this.X;
        if (iArr.length == 0) {
            kp5.e();
            return 0;
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i3 = 1;
            while (i3 < length && iArr[i3] == 0) {
                i3++;
            }
            if (i3 == length) {
                iArr2 = new int[]{0};
            } else {
                int i4 = length - i3;
                int[] iArr4 = new int[i4];
                System.arraycopy(iArr, i3, iArr4, 0, i4);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        int i5 = 0;
        boolean z = true;
        while (i5 < i) {
            int i6 = jq2Var.a[(jq2Var.g ? 1 : 0) + i5];
            if (i6 == 0) {
                i2 = iArr2[iArr2.length - 1];
            } else {
                if (i6 == 1) {
                    iC = 0;
                    for (int i7 : iArr2) {
                        jq2 jq2Var2 = jq2.h;
                        iC ^= i7;
                    }
                } else {
                    iC = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i8 = 1; i8 < length2; i8++) {
                        iC = jq2Var.c(i6, iC) ^ iArr2[i8];
                    }
                }
                i2 = iC;
            }
            iArr5[(i - 1) - i5] = i2;
            if (i2 != 0) {
                z = false;
            }
            i5++;
            z = z;
        }
        if (z) {
            return 0;
        }
        kq2 kq2Var = new kq2(jq2Var, iArr5);
        kq2 kq2VarA = jq2Var.a(i, 1);
        kq2 kq2Var2 = jq2Var.c;
        if (kq2VarA.d() >= kq2Var.d()) {
            kq2VarA = kq2Var;
            kq2Var = kq2VarA;
        }
        kq2 kq2Var3 = jq2Var.d;
        kq2 kq2Var4 = kq2VarA;
        kq2 kq2VarA2 = kq2Var;
        kq2 kq2Var5 = kq2Var4;
        kq2 kq2Var6 = kq2Var2;
        while (kq2Var5.d() * 2 >= i) {
            if (kq2Var5.e()) {
                throw new z96("r_{i-1} was zero");
            }
            int iB = jq2Var.b(kq2Var5.c(kq2Var5.d()));
            kq2 kq2VarA3 = kq2Var2;
            while (kq2VarA2.d() >= kq2Var5.d() && !kq2VarA2.e()) {
                int iD = kq2VarA2.d() - kq2Var5.d();
                int iC2 = jq2Var.c(kq2VarA2.c(kq2VarA2.d()), iB);
                kq2VarA3 = kq2VarA3.a(jq2Var.a(iD, iC2));
                kq2VarA2 = kq2VarA2.a(kq2Var5.h(iD, iC2));
            }
            kq2 kq2VarA4 = kq2VarA3.g(kq2Var3).a(kq2Var6);
            if (kq2VarA2.d() >= kq2Var5.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + kq2VarA2 + ", rLast: " + kq2Var5);
            }
            kq2 kq2Var7 = kq2VarA2;
            kq2VarA2 = kq2Var5;
            kq2Var5 = kq2Var7;
            kq2Var6 = kq2Var3;
            kq2Var3 = kq2VarA4;
        }
        int iC3 = kq2Var3.c(0);
        if (iC3 == 0) {
            throw new z96("sigmaTilde(0) was zero");
        }
        int iB2 = jq2Var.b(iC3);
        kq2[] kq2VarArr = {kq2Var3.f(iB2), kq2Var5.f(iB2)};
        kq2 kq2Var8 = kq2VarArr[0];
        kq2 kq2Var9 = kq2VarArr[1];
        int iD2 = kq2Var8.d();
        if (iD2 == 1) {
            iArr3 = new int[]{kq2Var8.c(1)};
        } else {
            int[] iArr6 = new int[iD2];
            int i9 = 0;
            for (int i10 = 1; i10 < jq2Var.e && i9 < iD2; i10++) {
                if (kq2Var8.b(i10) == 0) {
                    iArr6[i9] = jq2Var.b(i10);
                    i9++;
                }
            }
            if (i9 != iD2) {
                throw new z96("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            int iB3 = jq2Var.b(iArr3[i11]);
            int iC4 = 1;
            for (int i12 = 0; i12 < length3; i12++) {
                if (i11 != i12) {
                    int iC5 = jq2Var.c(iArr3[i12], iB3);
                    iC4 = jq2Var.c(iC4, (iC5 & 1) == 0 ? iC5 | 1 : iC5 & (-2));
                }
            }
            int iC6 = jq2Var.c(kq2Var9.b(iB3), jq2Var.b(iC4));
            iArr7[i11] = iC6;
            if (jq2Var.g) {
                iArr7[i11] = jq2Var.c(iC6, iB3);
            }
        }
        for (int i13 = 0; i13 < iArr3.length; i13++) {
            int length4 = iArr.length - 1;
            int i14 = iArr3[i13];
            if (i14 == 0) {
                kp5.e();
                return 0;
            }
            int i15 = length4 - jq2Var.b[i14];
            if (i15 < 0) {
                throw new z96("Bad error location");
            }
            iArr[i15] = iArr[i15] ^ iArr7[i13];
        }
        return iArr3.length;
    }

    public void B(jb0 jb0Var) {
        if (!jb0Var.f()) {
            if (!(jb0Var instanceof zl6)) {
                String strValueOf = String.valueOf(jb0Var.getClass());
                bt.q(oi0.p(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                return;
            } else {
                zl6 zl6Var = (zl6) jb0Var;
                B(zl6Var.Z);
                B(zl6Var.f0);
                return;
            }
        }
        int size = jb0Var.size();
        int[] iArr = zl6.j0;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.X;
        if (stack.isEmpty() || ((jb0) stack.peek()).size() >= i) {
            stack.push(jb0Var);
            return;
        }
        int i2 = iArr[iBinarySearch];
        jb0 zl6Var2 = (jb0) stack.pop();
        while (!stack.isEmpty() && ((jb0) stack.peek()).size() < i2) {
            zl6Var2 = new zl6((jb0) stack.pop(), zl6Var2);
        }
        zl6 zl6Var3 = new zl6(zl6Var2, jb0Var);
        while (!stack.isEmpty()) {
            int[] iArr2 = zl6.j0;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, zl6Var3.Y);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((jb0) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                zl6Var3 = new zl6((jb0) stack.pop(), zl6Var3);
            }
        }
        stack.push(zl6Var3);
    }

    public vk1 C(String str) {
        Class<?> cls;
        qb6 qb6VarO;
        ClassLoader classLoader = (ClassLoader) this.X;
        str.getClass();
        try {
            cls = Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (qb6VarO = z91.o(cls)) == null) {
            return null;
        }
        return new vk1((Object) qb6VarO, (byte) 20);
    }

    @Override // defpackage.lt4
    public void D(nt4 nt4Var) {
        Toolbar toolbar = (Toolbar) this.X;
        a aVar = toolbar.f0.y0;
        if (aVar == null || !aVar.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L0.Z).iterator();
            while (it.hasNext()) {
                ((fl2) it.next()).a.u();
            }
        }
        rb8 rb8Var = toolbar.T0;
        if (rb8Var != null) {
            rb8Var.D(nt4Var);
        }
    }

    public Integer[] E() {
        int[] outputFormats;
        Integer[] numArr = null;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.X;
            outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        } catch (IllegalArgumentException unused) {
            hi5.z0("StreamConfigurationMapCompatBaseImpl");
        } catch (NullPointerException unused2) {
            hi5.z0("StreamConfigurationMapCompatBaseImpl");
        }
        if (outputFormats != null) {
            numArr = new Integer[outputFormats.length];
            int length = outputFormats.length;
            for (int i = 0; i < length; i++) {
                numArr[i] = Integer.valueOf(outputFormats[i]);
            }
        }
        return numArr;
    }

    public long F(int i, Size size) {
        size.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.X;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    public Size[] G(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.X;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    public void H() {
        View view = (View) this.X;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public zz2 I(zz2 zz2Var, AndroidComposeView androidComposeView) {
        long j;
        boolean z;
        long jE;
        qi4 qi4Var = (qi4) this.X;
        ArrayList arrayList = (ArrayList) zz2Var.Y;
        qi4 qi4Var2 = new qi4(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            jq5 jq5Var = (jq5) arrayList.get(i);
            long j2 = jq5Var.a;
            iq5 iq5Var = (iq5) qi4Var.b(j2);
            if (iq5Var == null) {
                j = jq5Var.b;
                jE = jq5Var.d;
                z = false;
            } else {
                long j3 = iq5Var.a;
                j = j3;
                z = iq5Var.c;
                jE = androidComposeView.E(iq5Var.b);
            }
            long j4 = jq5Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            qi4Var2.f(j4, new hq5(j4, jq5Var.b, jq5Var.d, jq5Var.e, jq5Var.f, j, jE, z, jq5Var.g, jq5Var.i, jq5Var.j, jq5Var.k, jq5Var.l, jq5Var.m));
            boolean z2 = jq5Var.e;
            if (z2) {
                qi4Var.f(j2, new iq5(jq5Var.b, jq5Var.c, z2));
            } else {
                qi4Var.g(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new zz2(qi4Var2, zz2Var, (byte) 1);
    }

    public void J() {
        if (((tv) this.X).b(l57.Z) == l57.Y) {
            throw null;
        }
    }

    @Override // defpackage.bd6
    public void K(Object obj, ed6 ed6Var) {
        d43 d43Var = (d43) obj;
        d43Var.getClass();
        RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = (RemoteListenableDelegatingWorker) this.X;
        String strA = remoteListenableDelegatingWorker.b.b.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        if (strA == null) {
            bt.q("Need to specify a class name for the RemoteListenableWorker to delegate to.");
            return;
        }
        byte[] bArrK = w79.K(new kh5(strA, remoteListenableDelegatingWorker.f));
        bArrK.getClass();
        d43Var.e(ed6Var, bArrK);
    }

    public q85 L(String... strArr) {
        return (q85) new nr6(this, strArr, (byte) 0).a(new ow6(null));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[LOOP:0: B:22:0x0051->B:34:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[EDGE_INSN: B:53:0x0099->B:35:0x0099 BREAK  A[LOOP:0: B:22:0x0051->B:34:0x0096], SYNTHETIC] */
    public Object M(jp0 jp0Var, dn2 dn2Var) {
        na7 na7Var;
        n17 n17Var;
        if (((cw0) this.X) == null) {
            wr5.b("Called runAndWatch on a manager that has been disposed of");
        }
        cw0 cw0Var = (cw0) this.X;
        if ((cw0Var instanceof na7) && (n17Var = (na7Var = (na7) cw0Var).j0) != null && !n17Var.equals(jp0Var)) {
            jz4 jz4Var = new jz4();
            n17 n17Var2 = na7Var.j0;
            if (n17Var2 == null) {
                wr5.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            t05 t05Var = na7Var.h0;
            ArrayList arrayList = jz4Var.g0;
            if (t05Var != null) {
                Object[] objArr = t05Var.b;
                long[] jArr = t05Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new gz4(n17Var2, objArr[(i << 3) + i4]));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = na7Var.f0;
                obj.getClass();
                arrayList.add(new gz4(n17Var2, obj));
            }
            jz4Var.p0();
            na7Var.r0();
            this.X = jz4Var;
        }
        cw0 cw0Var2 = (cw0) this.X;
        cw0Var2.getClass();
        dd7 dd7VarU = kd7.h().u(cw0Var2.B0(jp0Var));
        cw0Var2.g0(jp0Var);
        try {
            dd7 dd7VarJ = dd7VarU.j();
            try {
                Object objInvoke = dn2Var.invoke();
                dd7.q(dd7VarJ);
                dd7VarU.c();
                cw0Var2.p0();
                return objInvoke;
            } catch (Throwable th) {
                dd7.q(dd7VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            dd7VarU.c();
            throw th2;
        }
    }

    @Override // defpackage.qe2
    public float N(float f, long j) {
        long j2 = j / 1000000;
        je2 je2VarA = ((nx1) this.X).a(f);
        long j3 = je2VarA.c;
        return (((Math.signum(je2VarA.a) * ae.a(j3 > 0 ? j2 / j3 : 1.0f).b) * je2VarA.b) / j3) * 1000.0f;
    }

    public void O() {
        View viewFindViewById;
        View view = (View) this.X;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new ce7(viewFindViewById, (byte) 0));
    }

    @Override // defpackage.qe2
    public float T(float f, float f2, long j) {
        long j2 = j / 1000000;
        je2 je2VarA = ((nx1) this.X).a(f2);
        long j3 = je2VarA.c;
        return (Math.signum(je2VarA.a) * je2VarA.b * ae.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.q63
    public int a() {
        return ((o8) this.X).a();
    }

    @Override // defpackage.q63
    public int b() {
        return ((o8) this.X).b();
    }

    @Override // defpackage.q63
    public void close() {
        ((o8) this.X).close();
    }

    @Override // defpackage.q63
    public n63 d() {
        return y(((o8) this.X).d());
    }

    @Override // defpackage.q63
    public int e() {
        return ((o8) this.X).e();
    }

    @Override // defpackage.u4
    public boolean f(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.X;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        byte b = swipeDismissBehavior.e;
        int width = (!(b == 0 && z) && (b != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = cw8.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        wl6 wl6Var = swipeDismissBehavior.b;
        if (wl6Var != null) {
            wl6Var.R(view);
        }
        return true;
    }

    @Override // defpackage.i04
    public void g(v15 v15Var, Object obj) {
        x66 x66Var = (x66) this.X;
        String strB = v15Var.b();
        if ("k".equals(strB)) {
            if (obj instanceof Integer) {
                a04.Y.getClass();
                a04 a04Var = (a04) a04.Z.get((Integer) obj);
                if (a04Var == null) {
                    a04Var = a04.UNKNOWN;
                }
                x66Var.i0 = a04Var;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                x66Var.X = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    x66Var.Y = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                x66Var.Z = ((Integer) obj).intValue();
            }
        }
    }

    @Override // defpackage.q63
    public Surface getSurface() {
        return ((o8) this.X).getSurface();
    }

    @Override // defpackage.q63
    public void h() {
        ((o8) this.X).h();
    }

    @Override // defpackage.hw5
    public void i(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.X).setResultCode(i);
    }

    @Override // defpackage.na1
    public xe2 j() {
        return ((na1) this.X).j();
    }

    @Override // defpackage.v17
    public void k() {
        uu7 uu7Var = ((wu7) this.X).w1;
        if (uu7Var != null) {
            MainActivity mainActivity = (MainActivity) uu7Var;
            u84 u84VarZ = ys0.z(mainActivity.X);
            nf1 nf1Var = tp1.a;
            jm4.Q(u84VarZ, dm4.a, new nk4(mainActivity, null, (byte) 2), 2);
        }
    }

    @Override // defpackage.lt4
    public boolean l(nt4 nt4Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.bq1
    public xg1 m() {
        return (yg1) this.X;
    }

    @Override // defpackage.qe2
    public long m0(float f) {
        return ((long) (Math.exp(((nx1) this.X).b(f) / (((double) ke2.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.kt5
    public void o(hy7 hy7Var) {
        s65 ly7Var;
        if (!s08.c()) {
            w79.y(((PreviewView) this.X).getContext()).execute(new sc4((Object) this, (Object) hy7Var, (byte) 6));
            return;
        }
        hi5.z0("PreviewView");
        cj0 cj0Var = hy7Var.d;
        ((PreviewView) this.X).n0 = cj0Var.s();
        vt5 vt5Var = ((PreviewView) this.X).m0;
        Rect rectH = cj0Var.s().h();
        vt5Var.getClass();
        new Rational(rectH.width(), rectH.height());
        synchronized (vt5Var) {
            vt5Var.b = rectH;
        }
        hy7Var.b(w79.y(((PreviewView) this.X).getContext()), new mf1((Object) this, (Object) cj0Var, (Object) hy7Var, (byte) 4));
        PreviewView previewView = (PreviewView) this.X;
        s65 s65Var = previewView.g0;
        st5 st5Var = previewView.f0;
        if (!(s65Var instanceof ly7) || PreviewView.b(hy7Var, st5Var)) {
            PreviewView previewView2 = (PreviewView) this.X;
            boolean zB = PreviewView.b(hy7Var, previewView2.f0);
            PreviewView previewView3 = (PreviewView) this.X;
            rt5 rt5Var = previewView3.i0;
            if (zB) {
                b98 b98Var = new b98(previewView3, rt5Var);
                b98Var.i = false;
                b98Var.k = new AtomicReference();
                ly7Var = b98Var;
            } else {
                ly7Var = new ly7(previewView3, rt5Var);
            }
            previewView2.g0 = ly7Var;
        }
        aj0 aj0VarS = cj0Var.s();
        PreviewView previewView4 = (PreviewView) this.X;
        qt5 qt5Var = new qt5(aj0VarS, previewView4.k0, previewView4.g0);
        ((PreviewView) this.X).l0.set(qt5Var);
        cj0Var.b().c(w79.y(((PreviewView) this.X).getContext()), qt5Var);
        ((PreviewView) this.X).g0.g(hy7Var, new mf1((Object) this, (Object) qt5Var, (Object) cj0Var, (byte) 5));
        PreviewView previewView5 = (PreviewView) this.X;
        if (previewView5.indexOfChild(previewView5.h0) == -1) {
            PreviewView previewView6 = (PreviewView) this.X;
            previewView6.addView(previewView6.h0);
        }
    }

    @Override // defpackage.q63
    public void p(p63 p63Var, Executor executor) {
        ((o8) this.X).p(new jn0(this, p63Var, (byte) 6), executor);
    }

    @Override // defpackage.v17
    public void q(String str) {
        str.getClass();
        uu7 uu7Var = ((wu7) this.X).w1;
        if (uu7Var != null) {
            MainActivity mainActivity = (MainActivity) uu7Var;
            u84 u84VarZ = ys0.z(mainActivity.X);
            nf1 nf1Var = tp1.a;
            jm4.Q(u84VarZ, ye1.Z, new fk4(mainActivity, str, null, (byte) 4), 2);
        }
    }

    @Override // defpackage.i04
    public j04 r(v15 v15Var) {
        String strB = v15Var.b();
        if ("d1".equals(strB)) {
            return new v66(this, (byte) 0);
        }
        if ("d2".equals(strB)) {
            return new v66(this, (byte) 1);
        }
        return null;
    }

    @Override // defpackage.qe2
    public float r0(float f, float f2) {
        nx1 nx1Var = (nx1) this.X;
        double dB = nx1Var.b(f2);
        double d = ke2.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (nx1Var.a * nx1Var.b))))) + f;
    }

    @Override // defpackage.iv5
    public void request(long j) {
        xc5 xc5Var = (xc5) this.X;
        if (j < 0) {
            bt.q(ie2.f(j, "n >= required but it was "));
        } else if (j != 0) {
            xc5Var.e(mb6.Q(j, xc5Var.h0));
        }
    }

    @Override // defpackage.q63
    public int s() {
        return ((o8) this.X).s();
    }

    @Override // defpackage.na1
    public Object u(rn2 rn2Var, s51 s51Var) {
        return ((na1) this.X).u(new hs5(rn2Var, null, (byte) 0), s51Var);
    }

    @Override // defpackage.q63
    public n63 v() {
        return y(((o8) this.X).v());
    }

    @Override // defpackage.i04
    public i04 w(qs0 qs0Var, v15 v15Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(s51 s51Var) {
        m57 m57Var;
        if (s51Var instanceof m57) {
            m57Var = (m57) s51Var;
            int i = m57Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                m57Var.h0 = i - Integer.MIN_VALUE;
            } else {
                m57Var = new m57(this, s51Var);
            }
        } else {
            m57Var = new m57(this, s51Var);
        }
        Object obj = m57Var.f0;
        int i2 = m57Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            throw null;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        if (((tv) this.X).a(l57.X, l57.Y)) {
            return dn8.a;
        }
        throw null;
    }

    @Override // defpackage.qe2
    public float z() {
        return 0.0f;
    }

    @Override // defpackage.i04
    public void c() {
    }

    @Override // defpackage.i04
    public void n(v15 v15Var, vs0 vs0Var) {
    }

    public y45(fi1 fi1Var) {
        float f = sf7.a;
        nx1 nx1Var = new nx1();
        nx1Var.a = f;
        float density = fi1Var.getDensity();
        float f2 = ke2.a;
        nx1Var.b = density * 386.0878f * 160.0f * 0.84f;
        this.X = nx1Var;
    }

    public y45(BaseActivity baseActivity) {
        or6 or6Var = (or6) baseActivity.getFragmentManager().findFragmentByTag("RxPermissions");
        if (or6Var == null) {
            or6Var = new or6();
            FragmentManager fragmentManager = baseActivity.getFragmentManager();
            fragmentManager.beginTransaction().add(or6Var, "RxPermissions").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        this.X = or6Var;
    }

    @Override // defpackage.i04
    public void t(v15 v15Var, qs0 qs0Var, v15 v15Var2) {
    }

    public /* synthetic */ y45(Object obj) {
        this.X = obj;
    }

    public y45(byte b) {
        switch (b) {
            case 14:
                this.X = new Stack();
                break;
            case 26:
                this.X = new vz7(new mq7(this));
                break;
            default:
                this.X = new qi4((Object) null);
                break;
        }
    }
}
