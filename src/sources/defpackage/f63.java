package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleService;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import io.sentry.c2;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f63 implements md3, ov8, r85, g83, f91, xo2, v06 {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;

    public f63(y53 y53Var, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int iIntValue;
        boolean z2;
        q63 y45Var;
        bn0 bn0Var;
        cv4 cv4Var;
        boolean z3;
        boolean z4;
        cv4 cv4Var2;
        this.X = (byte) 1;
        s08.b();
        this.Y = y53Var;
        ql0 ql0Var = (ql0) y53Var.a(er8.O, null);
        if (ql0Var == null) {
            bt.p((String) y53Var.a(u18.I, y53Var.toString()), "Implementation is missing option unpacker for ");
            throw null;
        }
        xm0 xm0Var = new xm0();
        ql0Var.a(y53Var, xm0Var);
        xm0Var.e();
        boolean z5 = false;
        lr lrVar = new lr((byte) 16, false ? 1 : 0);
        this.Z = lrVar;
        Executor executor = (Executor) y53Var.a(ji3.C, ki3.a());
        Objects.requireNonNull(executor);
        o8 o8Var = new o8(executor, cameraCharacteristics);
        ArrayList arrayList = new ArrayList();
        if (((Integer) y53Var.a(e63.q, 0)).intValue() != 0) {
            arrayList.add(32);
            arrayList.add(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        } else {
            Integer num = (Integer) y53Var.a(y53.f0, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = (Integer) y53Var.a(e63.p, null);
                if (num2 == null || num2.intValue() != 4101) {
                    iIntValue = (num2 == null || num2.intValue() != 32) ? 256 : 32;
                } else {
                    iIntValue = 4101;
                }
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        int iN = y53Var.n();
        if (y53Var.a(y53.h0, null) != null) {
            c2.m();
            throw null;
        }
        ay1 ay1Var = new ay1();
        ay1 ay1Var2 = new ay1();
        xx xxVar = new xx(size, iN, arrayList, z, ay1Var, ay1Var2);
        this.f0 = xxVar;
        mb6.s("CaptureNode does not support recreation yet.", ((xx) lrVar.f0) == null && ((z76) lrVar.Y) == null);
        lrVar.f0 = xxVar;
        dn0 dn0Var = new dn0();
        boolean z6 = arrayList.size() > 1;
        byte b = 2;
        if (z) {
            z2 = true;
            y45Var = new y45(z68.x(size.getWidth(), size.getHeight(), iN, 4));
            bn0Var = new bn0(lrVar, true ? (byte) 1 : (byte) 0);
            cv4Var = null;
        } else {
            if (z6) {
                z3 = true;
                z4 = false;
                cv4 cv4Var3 = new cv4(size.getWidth(), size.getHeight(), PSKKeyManager.MAX_KEY_LENGTH_BYTES, 4);
                jb5.j(dn0Var, cv4Var3.Y);
                cv4Var = new cv4(size.getWidth(), size.getHeight(), 32, 4);
                jb5.j(dn0Var, cv4Var.Y);
                cv4Var2 = cv4Var3;
            } else {
                z3 = true;
                z4 = false;
                cv4 cv4Var4 = new cv4(size.getWidth(), size.getHeight(), iN, 4);
                jb5.j(dn0Var, cv4Var4.Y);
                cv4Var2 = cv4Var4;
                cv4Var = null;
            }
            z5 = z4;
            bn0Var = new bn0(lrVar, z5 ? (byte) 1 : (byte) 0);
            z2 = z3;
            y45Var = cv4Var2;
        }
        Surface surface = y45Var.getSurface();
        Objects.requireNonNull(surface);
        mb6.s("The surface is already set.", xxVar.a == null ? z2 ? 1 : 0 : z5);
        xxVar.a = new v73(surface, size, iN);
        lrVar.Y = new z76(y45Var);
        y45Var.p(new om0(lrVar), km4.J());
        if (z6 && cv4Var != null) {
            Surface surface2 = cv4Var.getSurface();
            mb6.s("The secondary surface is already set.", xxVar.b != null ? false : z2);
            xxVar.b = new v73(surface2, size, iN);
            lrVar.Z = new z76(cv4Var);
            cv4Var.p(new om0(lrVar), km4.J());
        }
        ay1Var.b = bn0Var;
        ay1Var2.b = new bn0(lrVar, b);
    }

    public static f63 n(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        f63 f63Var = new f63(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) f63Var.Z)) {
            try {
                ((ArrayDeque) f63Var.Z).clear();
                String string = ((SharedPreferences) f63Var.Y).getString("topic_operation_queue", _UrlKt.FRAGMENT_ENCODE_SET);
                if (!TextUtils.isEmpty(string) && string.contains(",")) {
                    String[] strArrSplit = string.split(",", -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) f63Var.Z).add(str);
                        }
                    }
                    return f63Var;
                }
                return f63Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static et6 p(ct6 ct6Var, String str) {
        et6 et6VarP;
        et6 et6Var = (et6) ct6Var;
        if (str.equals(et6Var.c)) {
            return et6Var;
        }
        for (Object obj : ct6Var.g()) {
            if (obj instanceof et6) {
                et6 et6Var2 = (et6) obj;
                if (str.equals(et6Var2.c)) {
                    return et6Var2;
                }
                if ((obj instanceof ct6) && (et6VarP = p((ct6) obj, str)) != null) {
                    return et6VarP;
                }
            }
        }
        return null;
    }

    public void A(Object obj) {
        long jF = ry7.f();
        if (jF == q98.a) {
            this.f0 = obj;
            return;
        }
        synchronized (this.Z) {
            l98 l98Var = (l98) ((AtomicReference) this.Y).get();
            int iA = l98Var.a(jF);
            if (iA < 0) {
                ((AtomicReference) this.Y).set(l98Var.b(jF, obj));
            } else {
                l98Var.c[iA] = obj;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public mo8 B(na6 na6Var, nl3 nl3Var, boolean z) {
        du5 du5VarC;
        z47 z47Var = (z47) this.Y;
        c6 c6Var = (c6) z47Var.Y;
        boolean z2 = nl3Var.d;
        gb6 gb6Var = na6Var.b;
        eb6 eb6Var = gb6Var instanceof eb6 ? (eb6) gb6Var : null;
        if (eb6Var != null) {
            Class cls = eb6Var.a;
            if (cls.equals(Void.TYPE)) {
                du5VarC = null;
            } else {
                du5VarC = ut3.b(cls.getName()).c();
            }
        } else {
            du5VarC = null;
        }
        n44 n44Var = new n44(z47Var, na6Var, true);
        if (du5VarC != null) {
            aa7 aa7VarR = ((wx4) c6Var.n0).h0.r(du5VarC);
            t14 t14VarM = y08.m(aa7VarR, new vm(new sm[]{aa7VarR.getAnnotations(), n44Var}));
            t14VarM.getClass();
            aa7 aa7Var = (aa7) t14VarM;
            return z2 ? aa7Var : dh3.s(aa7Var, aa7Var.r0(true));
        }
        t14 t14VarC = C(gb6Var, pu.U(zi8.Y, z2, null, 6));
        rt8 rt8Var = rt8.INVARIANT;
        rt8 rt8Var2 = rt8.OUT_VARIANCE;
        if (!z2) {
            return dh3.s(((wx4) c6Var.n0).h0.i(rt8Var, t14VarC, n44Var), ((wx4) c6Var.n0).h0.i(rt8Var2, t14VarC, n44Var).r0(true));
        }
        if (z) {
            rt8Var = rt8Var2;
        }
        return ((wx4) c6Var.n0).h0.i(rt8Var, t14VarC, n44Var);
    }

    public t14 C(gb6 gb6Var, nl3 nl3Var) {
        c6 c6Var = (c6) ((z47) this.Y).Y;
        if (gb6Var instanceof eb6) {
            Class cls = ((eb6) gb6Var).a;
            du5 du5VarC = cls.equals(Void.TYPE) ? null : ut3.b(cls.getName()).c();
            return du5VarC != null ? ((wx4) c6Var.n0).h0.t(du5VarC) : ((wx4) c6Var.n0).h0.x();
        }
        boolean z = false;
        if (!(gb6Var instanceof va6)) {
            if (gb6Var instanceof na6) {
                return B((na6) gb6Var, nl3Var, false);
            }
            if (gb6Var instanceof jb6) {
                gb6 gb6VarC = ((jb6) gb6Var).c();
                return gb6VarC != null ? C(gb6VarC, nl3Var) : ((wx4) c6Var.n0).h0.n();
            }
            if (gb6Var == null) {
                return ((wx4) c6Var.n0).h0.n();
            }
            em7.j(gb6Var, "Unsupported type: ");
            return null;
        }
        va6 va6Var = (va6) gb6Var;
        Type type = va6Var.a;
        if (!nl3Var.d && nl3Var.a != zi8.X) {
            z = true;
        }
        boolean zD = va6Var.d();
        s32 s32Var = s32.UNRESOLVED_JAVA_CLASS;
        if (!zD && !z) {
            aa7 aa7VarM = m(va6Var, nl3Var, null);
            return aa7VarM != null ? aa7VarM : u32.c(s32Var, type.toString());
        }
        aa7 aa7VarM2 = m(va6Var, nl3.a(nl3Var, ol3.Z, false, null, null, 61), null);
        if (aa7VarM2 == null) {
            return u32.c(s32Var, type.toString());
        }
        aa7 aa7VarM3 = m(va6Var, nl3.a(nl3Var, ol3.Y, false, null, null, 61), aa7VarM2);
        if (aa7VarM3 == null) {
            return u32.c(s32Var, type.toString());
        }
        if (!zD) {
            return dh3.s(aa7VarM2, aa7VarM3);
        }
        r66 r66Var = new r66(aa7VarM2, aa7VarM3);
        v14.a.b(aa7VarM2, aa7VarM3);
        return r66Var;
    }

    public void D() {
        s05 s05Var = (s05) this.Y;
        String str = (String) this.Z;
        List list = (List) s05Var.j(str);
        if (list != null) {
            list.remove((dn2) this.f0);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        s05Var.l(str, list);
    }

    @Override // defpackage.md3
    public ClipDescription a() {
        return (ClipDescription) this.Z;
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
        ((qt5) this.f0).e = null;
    }

    @Override // defpackage.r85
    public void c(Executor executor, n85 n85Var) {
        synchronized (((HashMap) this.Z)) {
            boolean zIsEmpty = ((HashMap) this.Z).isEmpty();
            ((HashMap) this.Z).put(n85Var, executor);
            if (zIsEmpty) {
                ((lv2) km4.J()).execute(new rc4(this, (byte) 0));
            } else {
                executor.execute(new sc4((Object) this, (Object) n85Var, (byte) 1));
            }
        }
    }

    @Override // defpackage.g91
    public void d() {
        switch (this.X) {
            case 17:
                ((qi3) this.Y).Z.setFocusableInTouchMode(ue3.y(hi5.a0(this)));
                break;
            default:
                boolean zY = ue3.y(hi5.a0(this));
                c6 c6Var = (c6) this.Y;
                ((ConstraintLayout) c6Var.j0).setFocusableInTouchMode(zY);
                ((RelativeLayout) c6Var.f0).setFocusableInTouchMode(zY);
                ((RelativeLayout) c6Var.n0).setFocusableInTouchMode(zY);
                break;
        }
    }

    @Override // defpackage.md3
    public Uri e() {
        return (Uri) this.Y;
    }

    @Override // defpackage.md3
    public Uri g() {
        return (Uri) this.f0;
    }

    @Override // defpackage.v06
    public Object get() {
        switch (this.X) {
            case 24:
                return new f63(((v06) this.Y).get(), ((v06) this.Z).get(), ((g55) this.f0).get(), (byte) 7);
            default:
                long jF = ry7.f();
                if (jF == q98.a) {
                    return this.f0;
                }
                l98 l98Var = (l98) ((AtomicReference) this.Y).get();
                int iA = l98Var.a(jF);
                if (iA >= 0) {
                    return l98Var.c[iA];
                }
                return null;
        }
    }

    @Override // defpackage.ov8
    public View getRoot() {
        return (RelativeLayout) this.Y;
    }

    @Override // defpackage.md3
    public Object h() {
        return null;
    }

    @Override // defpackage.r85
    public void i(n85 n85Var) {
        synchronized (((HashMap) this.Z)) {
            ((HashMap) this.Z).remove(n85Var);
            if (((HashMap) this.Z).isEmpty()) {
                ((lv2) km4.J()).execute(new rc4(this, (byte) 1));
            }
        }
    }

    @Override // defpackage.g91
    public void j() {
        switch (this.X) {
            case 17:
                ConstraintLayout constraintLayout = ((qi3) this.Y).Z;
                constraintLayout.getClass();
                x97.U(constraintLayout, new i81(this, (byte) 6));
                break;
            default:
                c6 c6Var = (c6) this.Y;
                x97.U((ConstraintLayout) c6Var.j0, new v47(this, (byte) 0));
                x97.U((RelativeLayout) c6Var.f0, new v47(this, (byte) 1));
                x97.U((RelativeLayout) c6Var.n0, new v47(this, (byte) 2));
                break;
        }
    }

    public v76 k() {
        Context context = (Context) this.Y;
        t63 t63VarA = t63.a((t63) this.Z, new s72(w51.P(((r72) this.f0).a)), 8191);
        vz7 vz7Var = new vz7(new tv2((byte) 19));
        vz7 vz7Var2 = new vz7(new tb2(this, (byte) 9));
        vz7 vz7Var3 = new vz7(new tv2((byte) 20));
        d02 d02Var = d02.X;
        return new v76(new s76(context, t63VarA, vz7Var, vz7Var2, vz7Var3, new uy0(d02Var, d02Var, d02Var, d02Var, d02Var)));
    }

    public void l() {
        v73 v73Var;
        s08.b();
        lr lrVar = (lr) this.Z;
        s08.b();
        xx xxVar = (xx) lrVar.f0;
        Objects.requireNonNull(xxVar);
        z76 z76Var = (z76) lrVar.Y;
        Objects.requireNonNull(z76Var);
        z76 z76Var2 = (z76) lrVar.Z;
        v73 v73Var2 = xxVar.a;
        Objects.requireNonNull(v73Var2);
        v73Var2.a();
        v73 v73Var3 = xxVar.a;
        Objects.requireNonNull(v73Var3);
        vr3.P(v73Var3.e).a(new cn0(z76Var, (byte) 0), km4.J());
        v73 v73Var4 = xxVar.c;
        byte b = 1;
        if (v73Var4 != null) {
            v73Var4.a();
            vr3.P(xxVar.c.e).a(new cn0(null, b), km4.J());
        }
        if (xxVar.f.size() <= 1 || (v73Var = xxVar.b) == null) {
            return;
        }
        v73Var.a();
        vr3.P(xxVar.b.e).a(new cn0(z76Var2, (byte) 2), km4.J());
    }

    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [lh8] */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    public aa7 m(va6 va6Var, nl3 nl3Var, aa7 aa7Var) {
        ch8 ch8VarJ;
        z47 z47Var;
        ch8 ch8Var;
        aa7 aa7Var2;
        lh8 lh8VarL;
        lh8 lh8Var;
        Iterator it;
        List list;
        z47 z47Var2;
        byte b;
        bh8 wg7Var;
        Object next;
        List listY0;
        f63 f63Var;
        lh8 lh8Var2;
        ni8 ni8VarE;
        sx4 sx4VarJ;
        rt8 rt8VarD;
        f63 f63Var2 = this;
        va6 va6Var2 = va6Var;
        nl3 nl3Var2 = nl3Var;
        zi8 zi8Var = nl3Var2.a;
        ol3 ol3Var = nl3Var2.b;
        boolean z = nl3Var2.d;
        z47 z47Var3 = (z47) f63Var2.Y;
        c6 c6Var = (c6) z47Var3.Y;
        if (aa7Var == null || (ch8VarJ = aa7Var.m0()) == null) {
            ch8VarJ = bt7.j(new n44(z47Var3, va6Var2, false));
        }
        zj3 zj3Var = va6Var2.b;
        boolean z2 = zj3Var instanceof ta6;
        rt8 rt8Var = rt8.OUT_VARIANCE;
        zi8 zi8Var2 = zi8.X;
        byte b2 = 0;
        ol3 ol3Var2 = ol3.Z;
        if (z2) {
            ta6 ta6Var = (ta6) zj3Var;
            aa7Var2 = null;
            fk2 fk2VarC = ta6Var.c();
            if (fk2VarC == null) {
                om0.f(zj3Var, "Class type should have a FQ name: ");
                return null;
            }
            if (z && fk2VarC.equals(tl3.a)) {
                hc6 hc6Var = (hc6) c6Var.o0;
                nw3 nw3Var = hc6.d[0];
                nw3Var.getClass();
                v15 v15VarE = v15.e(i21.m(nw3Var.getName()));
                ch8Var = ch8VarJ;
                z47Var = z47Var3;
                ot0 ot0VarE = ((et4) hc6Var.b.getValue()).e(v15VarE, x45.Y);
                sx4 sx4Var = ot0VarE instanceof sx4 ? (sx4) ot0VarE : null;
                sx4VarJ = sx4Var == null ? hc6Var.a.E(new qs0(ug7.i, v15VarE), i21.K(1)) : sx4Var;
            } else {
                z47Var = z47Var3;
                ch8Var = ch8VarJ;
                zz3 zz3Var = ((wx4) c6Var.n0).h0;
                zz3Var.getClass();
                qs0 qs0VarG = ll3.g(fk2VarC);
                sx4VarJ = qs0VarG != null ? zz3Var.j(qs0VarG.a()) : null;
                if (sx4VarJ == null) {
                    sx4VarJ = null;
                } else {
                    gk2 gk2VarF = bl1.f(sx4VarJ);
                    HashMap map = ll3.k;
                    if (map.containsKey(gk2VarF)) {
                        if (ol3Var == ol3Var2 || zi8Var == zi8Var2) {
                            sx4VarJ = pz2.h(sx4VarJ);
                        } else {
                            gb6 gb6Var = (gb6) wv0.B0(va6Var2.c());
                            jb6 jb6Var = gb6Var instanceof jb6 ? (jb6) gb6Var : null;
                            if (jb6Var != null && jb6Var.c() != null) {
                                Type[] upperBounds = jb6Var.a.getUpperBounds();
                                upperBounds.getClass();
                                if (dh3.f(upperBounds.length == 0 ? null : upperBounds[0], Object.class)) {
                                    gk2 gk2VarF2 = bl1.f(sx4VarJ);
                                    String str = ll3.a;
                                    fk2 fk2Var = (fk2) map.get(gk2VarF2);
                                    if (fk2Var == null) {
                                        c2.j("Given class ", sx4VarJ, " is not a read-only collection");
                                        return null;
                                    }
                                    List listG = el1.e(sx4VarJ).j(fk2Var).l().g();
                                    listG.getClass();
                                    hi8 hi8Var = (hi8) wv0.B0(listG);
                                    if (hi8Var != null && (rt8VarD = hi8Var.D()) != null && rt8VarD != rt8Var) {
                                        sx4VarJ = pz2.h(sx4VarJ);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (sx4VarJ == null) {
                q02 q02Var = (q02) ((lr5) c6Var.l0).Y;
                if (q02Var == null) {
                    dh3.T("resolver");
                    throw null;
                }
                sx4VarJ = q02Var.R(ta6Var);
            }
            if (sx4VarJ == null || (lh8VarL = sx4VarJ.l()) == null) {
                throw new UnsupportedOperationException("Type not found: " + va6Var2.a);
            }
        } else {
            z47Var = z47Var3;
            ch8Var = ch8VarJ;
            aa7Var2 = null;
            if (!(zj3Var instanceof hb6)) {
                u52.r(zj3Var, "Unknown classifier kind: ");
                return null;
            }
            hi8 hi8VarM = ((ki8) f63Var2.Z).M((hb6) zj3Var);
            lh8VarL = hi8VarM != null ? hi8VarM.l() : null;
        }
        if (lh8VarL == null) {
            return aa7Var2;
        }
        boolean z3 = (ol3Var == ol3Var2 || z || zi8Var == zi8Var2) ? false : true;
        if (dh3.f(aa7Var != null ? aa7Var.n0() : aa7Var2, lh8VarL) && !va6Var2.d() && z3) {
            return aa7Var.r0(true);
        }
        boolean z4 = true;
        if (!va6Var2.d()) {
            if (va6Var2.c().isEmpty()) {
                List listG2 = lh8VarL.g();
                listG2.getClass();
                if (listG2.isEmpty()) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        }
        List<hi8> listG3 = lh8VarL.g();
        listG3.getClass();
        if (z4) {
            ArrayList arrayList = new ArrayList(xv0.Z(listG3, 10));
            for (hi8 hi8Var2 : listG3) {
                if (y08.g(hi8Var2, aa7Var2, nl3Var2.e)) {
                    ni8VarE = cj8.k(hi8Var2, nl3Var2);
                    lh8Var2 = lh8VarL;
                    f63Var = f63Var2;
                } else {
                    lh8 lh8Var3 = lh8VarL;
                    f63Var = f63Var2;
                    lh8Var2 = lh8Var3;
                    ni8VarE = we5.e(hi8Var2, nl3.a(nl3Var, null, va6Var.d(), null, null, 59), (xd6) f63Var.f0, new z74((ve4) c6Var.f0, new sl3(f63Var2, hi8Var2, nl3Var, lh8Var3, va6Var2)));
                }
                arrayList.add(ni8VarE);
                va6Var2 = va6Var;
                nl3Var2 = nl3Var;
                f63Var2 = f63Var;
                lh8VarL = lh8Var2;
                aa7Var2 = null;
            }
            lh8Var = lh8VarL;
            listY0 = arrayList;
        } else {
            lh8Var = lh8VarL;
            if (listG3.size() != va6Var.c().size()) {
                ArrayList arrayList2 = new ArrayList(xv0.Z(listG3, 10));
                Iterator it2 = listG3.iterator();
                while (it2.hasNext()) {
                    String strB = ((hi8) it2.next()).getName().b();
                    strB.getClass();
                    arrayList2.add(new wg7(u32.c(s32.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, strB)));
                }
                listY0 = wv0.Y0(arrayList2);
            } else {
                gu guVarD1 = wv0.d1(va6Var.c());
                ArrayList arrayList3 = new ArrayList(xv0.Z(guVarD1, 10));
                Iterator it3 = guVarD1.iterator();
                while (true) {
                    rw1 rw1Var = (rw1) it3;
                    if (rw1Var.Y.hasNext()) {
                        pb3 pb3Var = (pb3) rw1Var.next();
                        int i = pb3Var.a;
                        gb6 gb6Var2 = (gb6) pb3Var.b;
                        listG3.size();
                        hi8 hi8Var3 = (hi8) listG3.get(i);
                        zi8 zi8Var3 = zi8.Y;
                        nl3 nl3VarU = pu.U(zi8Var3, b2, null, 7);
                        hi8Var3.getClass();
                        boolean z5 = gb6Var2 instanceof jb6;
                        rt8 rt8Var2 = rt8.INVARIANT;
                        if (z5) {
                            jb6 jb6Var2 = (jb6) gb6Var2;
                            gb6 gb6VarC = jb6Var2.c();
                            Type[] upperBounds2 = jb6Var2.a.getUpperBounds();
                            upperBounds2.getClass();
                            rt8 rt8Var3 = !dh3.f(upperBounds2.length == 0 ? null : upperBounds2[0], Object.class) ? rt8Var : rt8.IN_VARIANCE;
                            if (gb6VarC == null || !(hi8Var3.D() == rt8Var2 || rt8Var3 == hi8Var3.D())) {
                                it = it3;
                                list = listG3;
                                z47Var2 = z47Var;
                                b = 0;
                                wg7Var = cj8.k(hi8Var3, nl3VarU);
                            } else {
                                if (jb6Var2.c() == null) {
                                    bt.q("Nullability annotations on unbounded wildcards aren't supported");
                                    return null;
                                }
                                z47Var2 = z47Var;
                                Iterator it4 = new n44(z47Var2, jb6Var2, false).iterator();
                                while (true) {
                                    ka2 ka2Var = (ka2) it4;
                                    if (!ka2Var.hasNext()) {
                                        it = it3;
                                        list = listG3;
                                        next = null;
                                        break;
                                    }
                                    next = ka2Var.next();
                                    gm gmVar = (gm) next;
                                    it = it3;
                                    fk2[] fk2VarArr = el3.b;
                                    list = listG3;
                                    int length = fk2VarArr.length;
                                    int i2 = 0;
                                    while (i2 < length) {
                                        int i3 = i2;
                                        int i4 = length;
                                        if (dh3.f(gmVar.d(), fk2VarArr[i3])) {
                                            break;
                                        }
                                        i2 = i3 + 1;
                                        length = i4;
                                    }
                                    it3 = it;
                                    listG3 = list;
                                }
                                gm gmVar2 = (gm) next;
                                b = 0;
                                t14 t14VarC = f63Var2.C(gb6VarC, pu.U(zi8Var3, false, null, 7));
                                if (gmVar2 != null) {
                                    ArrayList arrayListG0 = wv0.G0(t14VarC.getAnnotations(), gmVar2);
                                    t14VarC = y08.m(t14VarC, arrayListG0.isEmpty() ? oy1.f0 : new vm(arrayListG0, b));
                                }
                                wg7Var = y08.b(t14VarC, rt8Var3, hi8Var3);
                            }
                        } else {
                            it = it3;
                            list = listG3;
                            z47Var2 = z47Var;
                            b = 0;
                            wg7Var = new wg7(f63Var2.C(gb6Var2, nl3VarU), rt8Var2);
                        }
                        arrayList3.add(wg7Var);
                        it3 = it;
                        b2 = b;
                        z47Var = z47Var2;
                        listG3 = list;
                    } else {
                        listY0 = wv0.Y0(arrayList3);
                    }
                }
            }
        }
        return dh3.N(ch8Var, lh8Var, listY0, z3);
    }

    public r05 o() {
        int i;
        float fA;
        int i2;
        zs6 zs6Var = (zs6) this.Y;
        ks6 ks6Var = zs6Var.r;
        ks6 ks6Var2 = zs6Var.s;
        if (ks6Var == null || ks6Var.g() || (i = ks6Var.Y) == 9 || i == 2 || i == 3) {
            return new r05(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fA2 = ks6Var.a();
        if (ks6Var2 == null) {
            r05 r05Var = ((zs6) this.Y).o;
            fA = r05Var != null ? (r05Var.e * fA2) / r05Var.d : fA2;
        } else {
            if (ks6Var2.g() || (i2 = ks6Var2.Y) == 9 || i2 == 2 || i2 == 3) {
                return new r05(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fA = ks6Var2.a();
        }
        return new r05(0.0f, 0.0f, fA2, fA);
    }

    @Override // defpackage.f91
    public ov8 q() {
        switch (this.X) {
            case 17:
                return (qi3) this.Y;
            default:
                return (c6) this.Y;
        }
    }

    public int r(av8 av8Var) {
        int i = 0;
        for (wv4 wv4Var : (ArrayList) this.Y) {
            int i2 = wv4Var.d;
            gx4 gx4Var = wv4Var.a;
            int iA = gx4Var.a(av8Var);
            int iA2 = iA + 4;
            int iOrdinal = gx4Var.ordinal();
            if (iOrdinal == 1) {
                int i3 = ((i2 / 3) * 10) + iA2;
                int i4 = i2 % 3;
                iA2 = i3 + (i4 != 1 ? i4 == 2 ? 7 : 0 : 4);
            } else if (iOrdinal == 2) {
                iA2 = ((i2 / 2) * 11) + iA2 + (i2 % 2 != 1 ? 0 : 6);
            } else if (iOrdinal == 4) {
                iA2 += wv4Var.a() * 8;
            } else if (iOrdinal == 5) {
                iA2 = iA + 12;
            } else if (iOrdinal == 6) {
                iA2 += i2 * 13;
            }
            i += iA2;
        }
        return i;
    }

    public boolean s() {
        boolean zRequestFocus;
        ck4 ck4Var = ((dw7) this.Z).n;
        if (ck4Var != null) {
            int iB = ((yv7) this.f0).b();
            b6 b6Var = ck4Var.X;
            l lVarI = ((RecyclerView) b6Var.A0).I(iB + 2);
            if (lVarI instanceof aw7) {
                zRequestFocus = ((si3) ((aw7) lVarI).w.X).h0.requestFocus();
            } else if (lVarI instanceof yv7) {
                zRequestFocus = ((ConstraintLayout) ((c6) ((yv7) lVarI).v.Y).j0).requestFocus();
            } else {
                l lVarI2 = ((RecyclerView) b6Var.A0).I(iB);
                yv7 yv7Var = lVarI2 instanceof yv7 ? (yv7) lVarI2 : null;
                zRequestFocus = yv7Var == null ? false : ((ConstraintLayout) ((c6) yv7Var.v.Y).j0).requestFocus();
            }
            if (zRequestFocus) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g83
    public Object t(boolean z, s51 s51Var) {
        MainActivity mainActivity = (MainActivity) this.Y;
        u84 u84VarZ = ys0.z(mainActivity.getH0());
        nf1 nf1Var = tp1.a;
        jm4.Q(u84VarZ, dm4.a, new qk4(mainActivity, z, (String) this.Z, (gn2) this.f0, (q51) null), 2);
        return dn8.a;
    }

    public String toString() {
        switch (this.X) {
            case 14:
                StringBuilder sb = new StringBuilder();
                wv4 wv4Var = null;
                for (wv4 wv4Var2 : (ArrayList) this.Y) {
                    if (wv4Var != null) {
                        sb.append(",");
                    }
                    sb.append(wv4Var2.toString());
                    wv4Var = wv4Var2;
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xo2
    public void u(Throwable th) {
        ((qt5) this.f0).e = null;
        ArrayList arrayList = (ArrayList) this.Y;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((aj0) ((xi0) this.Z)).y((xg0) it.next());
        }
        arrayList.clear();
    }

    public boolean v() {
        ck4 ck4Var = ((dw7) this.Z).n;
        return ck4Var != null && ck4Var.X.i0.requestFocus();
    }

    public boolean w() {
        boolean zRequestFocus;
        f63 f63Var;
        ck4 ck4Var = ((dw7) this.Z).n;
        if (ck4Var == null) {
            return false;
        }
        b6 b6Var = ck4Var.X;
        int iB = ((yv7) this.f0).b();
        l lVarI = ((RecyclerView) b6Var.A0).I(iB - 1);
        if (lVarI instanceof aw7) {
            zRequestFocus = ((si3) ((aw7) lVarI).w.X).h0.requestFocus();
        } else {
            l lVarI2 = ((RecyclerView) b6Var.A0).I(iB - 2);
            yv7 yv7Var = lVarI2 instanceof yv7 ? (yv7) lVarI2 : null;
            zRequestFocus = (yv7Var == null || (f63Var = yv7Var.v) == null) ? b6Var.i0.requestFocus() : ((ConstraintLayout) ((c6) f63Var.Y).j0).requestFocus();
        }
        return zRequestFocus;
    }

    public void x(n84 n84Var) {
        x47 x47Var = (x47) this.f0;
        if (x47Var != null) {
            x47Var.run();
        }
        x47 x47Var2 = new x47((g94) this.Y, n84Var);
        this.f0 = x47Var2;
        ((Handler) this.Z).postAtFrontOfQueue(x47Var2);
    }

    public et6 y(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String strReplace = str.replace("\\\n", _UrlKt.FRAGMENT_ENCODE_SET).replace("\\A", "\n");
            if (strReplace.length() > 1 && strReplace.startsWith("#")) {
                String strSubstring = strReplace.substring(1);
                HashMap map = (HashMap) this.f0;
                if (strSubstring.length() == 0) {
                    return null;
                }
                if (strSubstring.equals(((zs6) this.Y).c)) {
                    return (zs6) this.Y;
                }
                if (map.containsKey(strSubstring)) {
                    return (et6) map.get(strSubstring);
                }
                et6 et6VarP = p((zs6) this.Y, strSubstring);
                map.put(strSubstring, et6VarP);
                return et6VarP;
            }
        }
        return null;
    }

    public void z(qz qzVar, int i, boolean z) {
        dz dzVar = (dz) this.f0;
        Context context = (Context) this.Y;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = qzVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        fu5 fu5Var = qzVar.c;
        adler32.update(byteBufferAllocate.putInt(hu5.a(fu5Var)).array());
        byte[] bArr = qzVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    mb6.x(qzVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((wr6) this.Z).g().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(hu5.a(fu5Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(dzVar.a(fu5Var, jLongValue, i));
            Set set = ((ez) dzVar.b.get(fu5Var)).c;
            if (set.contains(yw6.X)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(yw6.Z)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(yw6.Y)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", hu5.a(fu5Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {qzVar, Integer.valueOf(value), Long.valueOf(dzVar.a(fu5Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable(mb6.F("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.md3
    public void f() {
    }

    public /* synthetic */ f63(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }

    public f63(zl1 zl1Var, y45 y45Var) {
        this.X = (byte) 16;
        this.Y = zl1Var;
        this.Z = y45Var;
        this.f0 = new ConcurrentHashMap();
    }

    public f63(k86 k86Var) {
        this.X = (byte) 15;
        this.Y = new rv(0);
        this.Z = new y5((byte) 4);
        this.f0 = new a23((Object) this, (Object) k86Var, (byte) 9);
    }

    public f63(LifecycleService lifecycleService) {
        this.X = (byte) 25;
        this.Y = new g94(lifecycleService, true);
        this.Z = new Handler(Looper.getMainLooper());
    }

    public f63(byte b) {
        this.X = b;
        switch (b) {
            case 9:
                this.Y = new yz4();
                this.Z = new HashMap();
                break;
            case 20:
                long[] jArr = uw6.a;
                this.Y = new s05();
                break;
            case 22:
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                this.Y = new AtomicReference(mb6.i0);
                this.Z = new Object();
                break;
            default:
                this.Y = new mi3(1);
                mi3 mi3Var = new mi3(0);
                this.Z = mi3Var;
                this.f0 = mi3Var;
                break;
        }
    }

    public f63(qe5 qe5Var) {
        this.X = (byte) 27;
        this.Y = qe5Var;
        this.Z = nr4.f(1);
        this.f0 = nr4.g(zu0.a);
    }

    public f63(z47 z47Var, ki8 ki8Var) {
        this.X = (byte) 6;
        ki8Var.getClass();
        this.Y = z47Var;
        this.Z = ki8Var;
        this.f0 = new xd6(new we5((byte) 9));
    }

    public f63(iq4 iq4Var, View view) {
        Object jq4Var;
        this.X = (byte) 12;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            jq4Var = new lq4();
        } else {
            jq4Var = i >= 33 ? new jq4() : null;
        }
        this.Y = jq4Var;
        this.Z = iq4Var;
        this.f0 = view;
    }

    public f63(View view) {
        this.X = (byte) 3;
        this.Y = view;
        this.Z = x97.P(w74.Y, new tb2(this, (byte) 14));
        this.f0 = new lr5(view);
    }

    public f63(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.X = (byte) 26;
        this.Z = new ArrayDeque();
        this.Y = sharedPreferences;
        this.f0 = scheduledThreadPoolExecutor;
    }

    public f63(pt0 pt0Var, List list, f63 f63Var) {
        this.X = (byte) 19;
        pt0Var.getClass();
        list.getClass();
        this.Y = pt0Var;
        this.Z = list;
        this.f0 = f63Var;
    }

    public f63(Runnable runnable) {
        this.X = (byte) 13;
        this.Z = new CopyOnWriteArrayList();
        this.f0 = new HashMap();
        this.Y = runnable;
    }

    public f63(Context context) {
        this.X = (byte) 0;
        this.Y = context.getApplicationContext();
        this.Z = t63.o;
        this.f0 = new r72();
    }

    public f63(Context context, View view, int i, int i2, int i3) {
        this.X = (byte) 18;
        nt4 nt4Var = new nt4(context);
        this.Y = nt4Var;
        nt4Var.e = new lr5((Object) this, (byte) 0);
        du4 du4Var = new du4(i2, i3, nt4Var, context, view, false);
        this.Z = du4Var;
        du4Var.g = i;
        du4Var.k = new mr5();
    }

    public /* synthetic */ f63(ov8 ov8Var, byte b) {
        this.X = b;
        this.Y = ov8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f63(in5 in5Var, hn5 hn5Var, qi3 qi3Var) {
        this((ov8) qi3Var, (byte) 17);
        this.X = (byte) 17;
        this.Z = in5Var;
        this.f0 = hn5Var;
    }

    public f63(qt5 qt5Var, ArrayList arrayList, xi0 xi0Var) {
        this.X = (byte) 21;
        this.f0 = qt5Var;
        this.Y = arrayList;
        this.Z = xi0Var;
    }

    public f63(m70 m70Var, av8 av8Var, vv4 vv4Var) {
        gx4 gx4Var;
        int i;
        int i2;
        this.X = (byte) 14;
        this.f0 = m70Var;
        this.Y = new ArrayList();
        vv4 vv4Var2 = vv4Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            gx4Var = gx4.ECI;
            i = 1;
            if (vv4Var2 == null) {
                break;
            }
            int i5 = vv4Var2.c;
            int i6 = i3 + vv4Var2.d;
            vv4 vv4Var3 = vv4Var2.e;
            int i7 = i4;
            gx4 gx4Var2 = vv4Var2.a;
            boolean z = (gx4Var2 == gx4.BYTE && vv4Var3 == null && i5 != 0) || !(vv4Var3 == null || i5 == vv4Var3.c);
            i = z ? 1 : i7;
            if (vv4Var3 == null || vv4Var3.a != gx4Var2 || z) {
                ((ArrayList) this.Y).add(0, new wv4(this, gx4Var2, vv4Var2.b, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                ((ArrayList) this.Y).add(0, new wv4(this, gx4Var, vv4Var2.b, vv4Var2.c, 0));
            }
            i4 = i;
            vv4Var2 = vv4Var3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = m70Var.c;
        int i9 = m70Var.b;
        if (z2) {
            wv4 wv4Var = (wv4) ((ArrayList) this.Y).get(0);
            if (wv4Var != null && wv4Var.a != gx4Var && i8 != 0) {
                ((ArrayList) this.Y).add(0, new wv4(this, gx4Var, 0, 0, 0));
            }
            ((ArrayList) this.Y).add(((wv4) ((ArrayList) this.Y).get(0)).a == gx4Var ? 1 : 0, new wv4(this, gx4.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i10 = av8Var.a;
        int i11 = 26;
        int iB = p61.B(i10 <= 9 ? 1 : i10 <= 26 ? 2 : 3);
        if (iB == 0) {
            i11 = 9;
        } else if (iB != 1) {
            i = 27;
            i11 = 40;
        } else {
            i = 10;
        }
        int iR = r(av8Var);
        while (i10 < i11 && !t02.c(iR, av8.c(i10), i9)) {
            i10++;
        }
        while (i10 > i && t02.c(iR, av8.c(i10 - 1), i9)) {
            i10--;
        }
        this.Z = av8.c(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f63(dw7 dw7Var, yv7 yv7Var, c6 c6Var) {
        this((ov8) c6Var, (byte) 29);
        this.X = (byte) 29;
        this.Z = dw7Var;
        this.f0 = yv7Var;
    }
}
