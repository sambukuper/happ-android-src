package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.system.Os;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q02 implements go2, zl8, sd0, xo2, f91, tx6, oq4, iv5 {
    public final /* synthetic */ byte X;
    public Object Y;

    public q02(az5 az5Var) {
        this.X = (byte) 13;
        ps psVar = new ps((byte) 2);
        iz5 iz5Var = az5Var.f0;
        iz5Var.getClass();
        gz5 gz5Var = az5Var.g0;
        gz5Var.getClass();
        x15 x15Var = new x15(iz5Var, gz5Var);
        if ((az5Var.Z & 4) == 4) {
            zy5 zy5Var = az5Var.h0;
            zy5Var.getClass();
            vj8.q0(zy5Var, x15Var, false, 6);
        }
        List<fy5> list = az5Var.i0;
        list.getClass();
        for (fy5 fy5Var : list) {
            fy5Var.getClass();
            psVar.b.add(vj8.n0(fy5Var, x15Var, false, 6));
        }
        this.Y = psVar;
    }

    public static boolean N(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList P(defpackage.q02 r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q02.P(q02, java.lang.String):java.util.ArrayList");
    }

    public static void T(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public void A(Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        mu2 mu2Var;
        int i7;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.Y;
        yr6 yr6Var = gridLayoutManager.Z0;
        View view = (View) obj;
        if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
            if (gridLayoutManager.X0.c) {
                m09 m09Var = (m09) yr6Var.f0;
                i4 = m09Var.i - m09Var.k;
            } else {
                i4 = ((m09) yr6Var.f0).j;
            }
        }
        if (gridLayoutManager.X0.c) {
            i5 = i4 - i2;
            i6 = i4;
        } else {
            i6 = i2 + i4;
            i5 = i4;
        }
        int iJ1 = (gridLayoutManager.j1(i3) + ((m09) yr6Var.g0).j) - gridLayoutManager.L0;
        cb0 cb0Var = gridLayoutManager.e1;
        if (((ej4) cb0Var.f0) != null) {
            SparseArray<Parcelable> sparseArray = (SparseArray) ((ej4) cb0Var.f0).c(Integer.toString(i));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
        gridLayoutManager.o1(view, i3, i5, i6, iJ1);
        if (!gridLayoutManager.x0.g) {
            gridLayoutManager.K1();
        }
        if ((gridLayoutManager.E0 & 3) == 1 || (mu2Var = gridLayoutManager.I0) == null) {
            return;
        }
        GridLayoutManager gridLayoutManager2 = mu2Var.t;
        if (mu2Var.r && (i7 = mu2Var.s) != 0) {
            mu2Var.s = gridLayoutManager2.u1(i7, true);
        }
        int i8 = mu2Var.s;
        if (i8 != 0 && (i8 <= 0 || !gridLayoutManager2.m1())) {
            if (mu2Var.s >= 0) {
                return;
            }
            if (gridLayoutManager2.S() != 0 && gridLayoutManager2.t0.I(0) == null) {
                return;
            }
        }
        mu2Var.a = gridLayoutManager2.G0;
        mu2Var.e();
    }

    public int B(int i, boolean z, Object[] objArr, boolean z2) {
        int i2;
        View viewD;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.Y;
        View viewD2 = gridLayoutManager.D0.d(i - gridLayoutManager.y0);
        lu2 lu2Var = (lu2) viewD2.getLayoutParams();
        gridLayoutManager.t0.M(viewD2);
        lu2Var.getClass();
        if (!((lu2) viewD2.getLayoutParams()).X.i()) {
            if (z2) {
                if (z) {
                    gridLayoutManager.m(viewD2, -1, true);
                } else {
                    gridLayoutManager.m(viewD2, 0, true);
                }
            } else if (z) {
                gridLayoutManager.l(viewD2);
            } else {
                gridLayoutManager.m(viewD2, 0, false);
            }
            int i3 = gridLayoutManager.K0;
            if (i3 != -1) {
                viewD2.setVisibility(i3);
            }
            mu2 mu2Var = gridLayoutManager.I0;
            if (mu2Var != null) {
                GridLayoutManager gridLayoutManager2 = mu2Var.t;
                if (!mu2Var.r && (i2 = mu2Var.s) != 0) {
                    int i4 = gridLayoutManager2.G0;
                    int i5 = i2 > 0 ? i4 + gridLayoutManager2.V0 : i4 - gridLayoutManager2.V0;
                    View view = null;
                    while (mu2Var.s != 0 && (viewD = mu2Var.b.s0.D(i5)) != null) {
                        if (viewD.getVisibility() == 0 && (!gridLayoutManager2.X() || viewD.hasFocusable())) {
                            gridLayoutManager2.G0 = i5;
                            int i6 = mu2Var.s;
                            if (i6 > 0) {
                                mu2Var.s = i6 - 1;
                            } else {
                                mu2Var.s = i6 + 1;
                            }
                            view = viewD;
                        }
                        int i7 = mu2Var.s;
                        int i8 = gridLayoutManager2.V0;
                        i5 = i7 > 0 ? i5 + i8 : i5 - i8;
                    }
                    if (view != null && gridLayoutManager2.X()) {
                        gridLayoutManager2.E0 |= 32;
                        view.requestFocus();
                        gridLayoutManager2.E0 &= -33;
                    }
                }
            }
            if (viewD2.findFocus() != null) {
                ((lu2) viewD2.getLayoutParams()).getClass();
            }
            int i9 = gridLayoutManager.E0;
            if ((i9 & 3) != 1) {
                if (i == gridLayoutManager.G0 && gridLayoutManager.I0 == null) {
                    gridLayoutManager.b1();
                }
            } else if ((i9 & 4) == 0) {
                int i10 = i9 & 16;
                if (i10 == 0 && i == gridLayoutManager.G0) {
                    gridLayoutManager.b1();
                } else if (i10 != 0 && i >= gridLayoutManager.G0 && viewD2.hasFocusable()) {
                    gridLayoutManager.G0 = i;
                    gridLayoutManager.E0 &= -17;
                    gridLayoutManager.b1();
                }
            }
            gridLayoutManager.q1(viewD2);
        }
        objArr[0] = viewD2;
        return !gridLayoutManager.u0 ? GridLayoutManager.g1(viewD2) : GridLayoutManager.f1(viewD2);
    }

    public void C(byte b) {
        ((Parcel) this.Y).writeByte(b);
    }

    public void D(float f) {
        ((Parcel) this.Y).writeFloat(f);
    }

    public void E(long j) {
        long jB = v88.b(j);
        byte b = 0;
        if (!w88.a(jB, 0L)) {
            if (w88.a(jB, 4294967296L)) {
                b = 1;
            } else if (w88.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        C(b);
        if (w88.a(v88.b(j), 0L)) {
            return;
        }
        D(v88.c(j));
    }

    public boolean F(String str) {
        String strM = M(str);
        return "1".equals(strM) || Boolean.parseBoolean(strM);
    }

    public int G() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.Y;
        return gridLayoutManager.x0.b() + gridLayoutManager.y0;
    }

    public int H(int i) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.Y;
        View viewD = gridLayoutManager.D(i - gridLayoutManager.y0);
        int i2 = gridLayoutManager.E0 & 262144;
        td5 td5Var = gridLayoutManager.v0;
        return i2 != 0 ? td5Var.d(viewD) : td5Var.g(viewD);
    }

    public Integer I(String str) {
        String strM = M(str);
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM));
        } catch (NumberFormatException unused) {
            T(str);
            return null;
        }
    }

    public JSONArray J(String str) {
        String strM = M(str);
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        try {
            return new JSONArray(strM);
        } catch (JSONException unused) {
            T(str);
            return null;
        }
    }

    public String K(Resources resources, String str, String str2) {
        String[] strArr;
        String strM = M(str2);
        if (!TextUtils.isEmpty(strM)) {
            return strM;
        }
        String strM2 = M(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strM2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM2, "string", str);
        if (identifier == 0) {
            T(str2.concat("_loc_key"));
            return null;
        }
        JSONArray jSONArrayJ = J(str2.concat("_loc_args"));
        if (jSONArrayJ == null) {
            strArr = null;
        } else {
            int length = jSONArrayJ.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayJ.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            T(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public int L(int i) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.Y;
        View viewD = gridLayoutManager.D(i - gridLayoutManager.y0);
        Rect rect = GridLayoutManager.h1;
        gridLayoutManager.M(viewD, rect);
        return !gridLayoutManager.u0 ? rect.width() : rect.height();
    }

    public String M(String str) {
        Bundle bundle = (Bundle) this.Y;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle O() {
        Bundle bundle = (Bundle) this.Y;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void Q(int i) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.Y;
        View viewD = gridLayoutManager.D(i - gridLayoutManager.y0);
        int i2 = gridLayoutManager.E0 & 3;
        k kVar = gridLayoutManager.D0;
        if (i2 == 1) {
            gridLayoutManager.L0(kVar, gridLayoutManager.X.j(viewD), viewD);
        } else {
            gridLayoutManager.G0(viewD, kVar);
        }
    }

    public sx4 R(ta6 ta6Var) {
        v44 v44Var;
        fk2 fk2VarC = ta6Var.c();
        Class<?> declaringClass = ta6Var.a.getDeclaringClass();
        ta6 ta6Var2 = declaringClass != null ? new ta6(declaringClass) : null;
        if (ta6Var2 != null) {
            sx4 sx4VarR = R(ta6Var2);
            et4 et4VarQ0 = sx4VarR != null ? sx4VarR.q0() : null;
            ot0 ot0VarE = et4VarQ0 != null ? et4VarQ0.e(ta6Var.e(), x45.j0) : null;
            if (ot0VarE instanceof sx4) {
                return (sx4) ot0VarE;
            }
        } else if (fk2VarC != null && (v44Var = (v44) wv0.t0(i21.K(((w44) this.Y).c(fk2VarC.b())))) != null) {
            b54 b54Var = v44Var.n0.d;
            b54Var.getClass();
            return b54Var.v(ta6Var.e(), ta6Var);
        }
        return null;
    }

    public void S(Runnable runnable, String str) {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        Object obj = zz1.X;
        TimeUnit timeUnit = TimeUnit.DAYS;
        el5 el5Var = xc8.a;
        h80 h80Var = el5Var.b;
        if (Boolean.FALSE.booleanValue()) {
            cv5 cv5Var = el5Var.c;
            Thread threadCurrentThread = Thread.currentThread();
            long id = threadCurrentThread.getId();
            p98 p98VarK = cv5Var.g0;
            p98 p98Var = cv5Var.h0;
            if (p98VarK == null || p98VarK.f0 != id) {
                if (p98Var == null || p98Var.f0 != id) {
                    p98VarK = cv5Var.k(id, threadCurrentThread.getName(), Os.gettid());
                    cv5Var.h0 = cv5Var.g0;
                    cv5Var.g0 = p98VarK;
                } else {
                    p98VarK = p98Var;
                }
            }
            p98VarK.Z.getClass();
            p98VarK.Z.getClass();
            qk2 qk2Var = (qk2) this.Y;
            qk2Var.g0.getClass();
            int i = qk2Var.z0;
            if (i != 0) {
                Integer.toHexString(i);
            }
        }
        boolean z = false;
        try {
            runnable.run();
            if (obj instanceof AutoCloseable) {
                return;
            }
            if (!(obj instanceof ExecutorService)) {
                kp5.e();
                return;
            }
            ExecutorService executorService = (ExecutorService) obj;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated2 = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            while (!zIsTerminated2) {
                try {
                    zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                str.concat(".exception");
                t08.e(el5Var, th);
                throw null;
            } catch (Throwable th2) {
                if (obj instanceof AutoCloseable) {
                    throw th2;
                }
                if (!(obj instanceof ExecutorService)) {
                    kp5.e();
                    return;
                }
                ExecutorService executorService2 = (ExecutorService) obj;
                if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                    throw th2;
                }
                executorService2.shutdown();
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused2) {
                        if (!z) {
                            executorService2.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    throw th2;
                }
                Thread.currentThread().interrupt();
                throw th2;
            }
        }
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
        switch (this.X) {
            case 6:
                qd0 qd0Var = (qd0) this.Y;
                try {
                    qd0Var.b(obj);
                } catch (Throwable th) {
                    qd0Var.d(th);
                    return;
                }
                break;
            case 7:
            default:
                break;
            case 8:
                break;
        }
    }

    @Override // defpackage.go2
    public ho2 build() {
        return (h32) this.Y;
    }

    @Override // defpackage.go2
    public go2 c(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    @Override // defpackage.g91
    public void d() {
        ConstraintLayout constraintLayout = ((qi3) this.Y).Z;
        Context context = constraintLayout.getContext();
        context.getClass();
        constraintLayout.setFocusableInTouchMode(ue3.y(context));
    }

    @Override // defpackage.tx6
    public int e() {
        j74 j74Var = (j74) this.Y;
        j74Var.d().getClass();
        return ((oh5) j74Var.g0.c).l() + (j74Var.c() * z39.K(j74Var.d()));
    }

    @Override // defpackage.g91
    public void j() {
        ConstraintLayout constraintLayout = ((qi3) this.Y).Z;
        constraintLayout.getClass();
        x97.U(constraintLayout, new i81(this, (byte) 4));
    }

    @Override // defpackage.go2
    public go2 k(fl1 fl1Var) {
        fl1Var.getClass();
        return this;
    }

    @Override // defpackage.go2
    public go2 n(sm smVar) {
        smVar.getClass();
        return this;
    }

    @Override // defpackage.tx6
    public int p() {
        return z39.j(((j74) this.Y).d());
    }

    @Override // defpackage.f91
    public ov8 q() {
        return (qi3) this.Y;
    }

    @Override // defpackage.go2
    public go2 r(t14 t14Var) {
        t14Var.getClass();
        return this;
    }

    @Override // defpackage.iv5
    public void request(long j) {
        ua5 ua5Var = (ua5) this.Y;
        if (j > 0) {
            ua5Var.i0.request(j);
        } else {
            if (j >= 0) {
                return;
            }
            bt.q(ie2.f(j, "n >= 0 required but it was "));
        }
    }

    @Override // defpackage.tx6
    public int s() {
        e74 e74VarD = ((j74) this.Y).d();
        return (int) (e74VarD.p == sd5.X ? e74VarD.i() & 4294967295L : e74VarD.i() >> 32);
    }

    @Override // defpackage.sd0
    public Object t(qd0 qd0Var) {
        switch (this.X) {
            case 5:
                yo2 yo2Var = (yo2) this.Y;
                mb6.s("The result can only set once!", yo2Var.Y == null);
                yo2Var.Y = qd0Var;
                return "FutureChain[" + yo2Var + "]";
            default:
                kb4 kb4Var = (kb4) this.Y;
                mb6.s("The result can only set once!", kb4Var.h0 == null);
                kb4Var.h0 = qd0Var;
                return "ListFuture[" + this + "]";
        }
    }

    @Override // defpackage.xo2
    public void u(Throwable th) throws Exception {
        Object obj;
        switch (this.X) {
            case 6:
                ((qd0) this.Y).d(th);
                return;
            case 7:
            default:
                d6 d6Var = (d6) this.Y;
                c1 c1Var = new c1(d6Var, (byte) 24);
                if (s08.c()) {
                    c1Var.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    mb6.s("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new sc4((Object) c1Var, (Object) countDownLatch, (byte) 16)));
                    try {
                        if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e) {
                        throw new og3(e);
                    }
                }
                zl0 zl0Var = (zl0) d6Var.i0;
                if (zl0Var != null) {
                    zl0Var.getClass();
                    ek0 ek0Var = zl0Var.n;
                    ek0Var.getClass();
                    bw0.h0(ek0Var.n, new y0((Object) d6Var, (byte) 15));
                    zl0 zl0Var2 = (zl0) d6Var.i0;
                    zl0Var2.getClass();
                    synchronized (zl0Var2.b) {
                        try {
                            zl0Var2.e.removeCallbacksAndMessages("retry_token");
                            int iB = p61.B(zl0Var2.p);
                            byte b = 5;
                            if (iB == 0) {
                                zl0Var2.p = 5;
                                obj = u73.Z;
                            } else {
                                if (iB == 1) {
                                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                                }
                                if (iB == 2 || iB == 3) {
                                    zl0Var2.p = 5;
                                    zl0.a(zl0Var2.r);
                                    zl0Var2.q = u15.u(new o61(zl0Var2, b));
                                }
                                obj = zl0Var2.q;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    obj = u73.Z;
                }
                obj.getClass();
                synchronized (d6Var.Y) {
                    d6Var.g0 = null;
                    d6Var.h0 = obj;
                    ((HashMap) d6Var.k0).clear();
                    ((HashSet) d6Var.f0).clear();
                }
                d6Var.d(null, null);
                return;
            case 8:
                ((n63) this.Y).close();
                return;
        }
    }

    @Override // defpackage.zl8
    public void y(int i) {
        ExcludedRoutesActivity excludedRoutesActivity = (ExcludedRoutesActivity) this.Y;
        ExcludeSettingsCache excludeSettingsCache = (ExcludeSettingsCache) ((j52) excludedRoutesActivity.T0.getValue()).c.f.get(i);
        int i2 = 0;
        int i3 = 0;
        Class<ExcludedRoutesActivity> cls = ExcludedRoutesActivity.class;
        excludedRoutesActivity.B().g(excludeSettingsCache.getValue(), new ub(i3, excludedRoutesActivity, cls, "showSuccessSnackbar", "showSuccessSnackbar()V", i2, (byte) 5), new ub(i3, excludedRoutesActivity, cls, "showFailureSnackbar", "showFailureSnackbar()V", i2, (byte) 6));
    }

    @Override // defpackage.go2
    public go2 g() {
        return this;
    }

    @Override // defpackage.go2
    public go2 h() {
        return this;
    }

    @Override // defpackage.go2
    public go2 i() {
        return this;
    }

    @Override // defpackage.go2
    public go2 l() {
        return this;
    }

    @Override // defpackage.go2
    public go2 o() {
        return this;
    }

    @Override // defpackage.go2
    public go2 v() {
        return this;
    }

    @Override // defpackage.go2
    public go2 z() {
        return this;
    }

    @Override // defpackage.go2
    public go2 a(List list) {
        return this;
    }

    @Override // defpackage.go2
    public go2 f(i44 i44Var) {
        return this;
    }

    @Override // defpackage.go2
    public go2 m(fx4 fx4Var) {
        return this;
    }

    @Override // defpackage.go2
    public go2 w(ed1 ed1Var) {
        return this;
    }

    @Override // defpackage.go2
    public go2 x(v15 v15Var) {
        return this;
    }

    public /* synthetic */ q02(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public q02(byte[] bArr, int i) {
        this.X = (byte) 12;
        byte[] bArr2 = new byte[i];
        this.Y = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public q02() {
        Object g55Var;
        this.X = (byte) 29;
        if (Build.VERSION.SDK_INT >= 28) {
            g55Var = new ts2();
        } else {
            g55Var = new g55((byte) 5);
        }
        this.Y = g55Var;
    }

    public /* synthetic */ q02(byte b) {
        this.X = b;
    }

    public q02(Bundle bundle) {
        this.X = (byte) 25;
        this.Y = new Bundle(bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q02(o24 o24Var, n24 n24Var, qi3 qi3Var) {
        this((Object) qi3Var, (byte) 14);
        this.X = (byte) 14;
    }

    public q02(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.X = (byte) 9;
        if (Build.VERSION.SDK_INT >= 25) {
            this.Y = new ld3(uri, clipDescription, uri2);
        } else {
            this.Y = new f63((Object) uri, (Object) clipDescription, (Object) uri2, (byte) 2);
        }
    }
}
