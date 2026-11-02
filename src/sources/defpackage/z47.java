package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.IconCompat;
import io.sentry.c2;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z47 implements k04, ov8, i04, j04, yd7, g91, is0 {
    public static z47 h0;
    public static final Object i0 = new Object();
    public static volatile z47 j0;
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;
    public Object g0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [android.graphics.drawable.Icon] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.app.Notification$Builder] */
    public z47(r65 r65Var) {
        Notification.Builder builder;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i;
        ArrayList arrayList2;
        ?? r16;
        ?? Q;
        int i2;
        int i3;
        this.X = (byte) 27;
        this.g0 = new Bundle();
        this.f0 = r65Var;
        Context context = r65Var.a;
        ArrayList arrayList3 = r65Var.w;
        ArrayList arrayList4 = r65Var.c;
        ArrayList arrayList5 = r65Var.d;
        this.Y = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = ue3.k(context, r65Var.t);
            this.Z = builder;
        } else {
            builder = new Notification.Builder(context);
            this.Z = builder;
        }
        Notification notification = r65Var.v;
        ?? r11 = 0;
        int i4 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(r65Var.e).setContentText(r65Var.f).setContentInfo(null).setContentIntent(r65Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(r65Var.i).setProgress(r65Var.m, r65Var.n, false);
        IconCompat iconCompat = r65Var.h;
        builder.setLargeIcon(iconCompat == null ? null : jb5.Q(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(r65Var.j);
        for (n65 n65Var : r65Var.b) {
            IconCompat iconCompatB = n65Var.b;
            if (iconCompatB == null && (i3 = n65Var.f) != 0) {
                iconCompatB = IconCompat.b(r11, _UrlKt.FRAGMENT_ENCODE_SET, i3);
                n65Var.b = iconCompatB;
            }
            boolean z = n65Var.d;
            Bundle bundle = n65Var.a;
            if (iconCompatB != null) {
                r16 = r11;
                Q = jb5.Q(iconCompatB, r11);
            } else {
                ?? r15 = r11;
                r16 = r15;
                Q = r15;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder((Icon) Q, n65Var.g, n65Var.h);
            fd6[] fd6VarArr = n65Var.c;
            if (fd6VarArr != null) {
                int length = fd6VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                i2 = i4;
                if (fd6VarArr.length > 0) {
                    fd6 fd6Var = fd6VarArr[i2];
                    throw r16;
                }
                for (int i5 = i2; i5 < length; i5++) {
                    builder2.addRemoteInput(remoteInputArr[i5]);
                }
            } else {
                i2 = i4;
            }
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i2);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                en.Y(builder2);
            }
            if (i6 >= 29) {
                wa.D(builder2);
            }
            if (i6 >= 31) {
                tc.w(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", n65Var.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.Z).addAction(builder2.build());
            r11 = r16;
            i4 = 0;
        }
        ?? r17 = r11;
        Bundle bundle3 = r65Var.q;
        if (bundle3 != null) {
            ((Bundle) this.g0).putAll(bundle3);
        }
        ((Notification.Builder) this.Z).setShowWhen(r65Var.k);
        ((Notification.Builder) this.Z).setLocalOnly(r65Var.o);
        ((Notification.Builder) this.Z).setGroup(r17);
        ((Notification.Builder) this.Z).setSortKey(r17);
        ((Notification.Builder) this.Z).setGroupSummary(false);
        ((Notification.Builder) this.Z).setCategory(r65Var.p);
        ((Notification.Builder) this.Z).setColor(r65Var.r);
        ((Notification.Builder) this.Z).setVisibility(r65Var.s);
        ((Notification.Builder) this.Z).setPublicVersion(null);
        ((Notification.Builder) this.Z).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    bu buVar = new bu(arrayList3.size() + arrayList2.size());
                    buVar.addAll(arrayList2);
                    buVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(buVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) this.Z).addPerson((String) it2.next());
            }
        }
        if (arrayList5.size() > 0) {
            Bundle bundle4 = r65Var.q;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                r65Var.q = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList5.size()) {
                String string = Integer.toString(i7);
                n65 n65Var2 = (n65) arrayList5.get(i7);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatB2 = n65Var2.b;
                if (iconCompatB2 == null && (i = n65Var2.f) != 0) {
                    iconCompatB2 = IconCompat.b(null, _UrlKt.FRAGMENT_ENCODE_SET, i);
                    n65Var2.b = iconCompatB2;
                }
                Bundle bundle9 = n65Var2.a;
                bundle8.putInt("icon", iconCompatB2 != null ? iconCompatB2.c() : 0);
                bundle8.putCharSequence("title", n65Var2.g);
                bundle8.putParcelable("actionIntent", n65Var2.h);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean("android.support.allowGeneratedReplies", n65Var2.d);
                bundle8.putBundle("extras", bundle10);
                fd6[] fd6VarArr2 = n65Var2.c;
                if (fd6VarArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[fd6VarArr2.length];
                    if (fd6VarArr2.length > 0) {
                        fd6 fd6Var2 = fd6VarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", n65Var2.e);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i7++;
                arrayList4 = arrayList4;
            }
            arrayList = arrayList4;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle11 = r65Var.q;
            if (bundle11 == null) {
                bundle11 = new Bundle();
                r65Var.q = bundle11;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.g0).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList4;
        }
        ((Notification.Builder) this.Z).setExtras(r65Var.q);
        ((Notification.Builder) this.Z).setRemoteInputHistory(null);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            ue3.R((Notification.Builder) this.Z);
            ue3.c0((Notification.Builder) this.Z);
            ue3.d0((Notification.Builder) this.Z);
            ue3.e0((Notification.Builder) this.Z);
            ue3.V((Notification.Builder) this.Z);
            if (!TextUtils.isEmpty(r65Var.t)) {
                ((Notification.Builder) this.Z).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                throw p61.k(it3);
            }
        }
        if (i8 >= 29) {
            wa.B((Notification.Builder) this.Z, r65Var.u);
            wa.C((Notification.Builder) this.Z);
        }
        if (i8 >= 36) {
            d4.g((Notification.Builder) this.Z);
        }
    }

    public static synchronized z47 H() {
        z47 z47Var;
        z47Var = h0;
        if (z47Var == null) {
            z47Var = new z47((byte) 0);
            h0 = z47Var;
        }
        return z47Var;
    }

    public static z47 I(Context context) {
        if (j0 == null) {
            synchronized (i0) {
                try {
                    if (j0 == null) {
                        j0 = new z47(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j0;
    }

    public static void k(z47 z47Var, k25 k25Var) {
        z47Var.getClass();
        k25Var.getClass();
        if (((LinkedHashSet) z47Var.f0).add(k25Var)) {
            n25 n25Var = (n25) z47Var.Z;
            if (k25Var.c != null) {
                em7.h("Handler '", k25Var, "' is already registered with a dispatcher");
                return;
            }
            n25Var.e.addFirst(k25Var);
            k25Var.c = z47Var;
            n25Var.b();
        }
    }

    public qk2 A(String str) {
        for (wl2 wl2Var : ((HashMap) this.Z).values()) {
            if (wl2Var != null) {
                qk2 qk2VarA = wl2Var.c;
                if (!str.equals(qk2VarA.g0)) {
                    qk2VarA = qk2VarA.x0.c.A(str);
                }
                if (qk2VarA != null) {
                    return qk2VarA;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #1 {, blocks: (B:30:0x0062, B:32:0x0068), top: B:56:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0068, please report this as an issue */
    public void B(m76 m76Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f0;
        synchronized (this) {
            if (!arrayDeque.remove(m76Var)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = ks8.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.g0).iterator();
                it.getClass();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.Z).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.Z).size();
                    ((ArrayDeque) this.f0).size();
                }
                if (arrayList.size() > 0) {
                    if (arrayList.get(0) == null) {
                        c2.m();
                        return;
                    }
                    synchronized (this) {
                        if (((ThreadPoolExecutor) this.Y) == null) {
                            this.Y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new js8(ks8.f + " Dispatcher", false, (byte) 0));
                        }
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.size() > 0) {
            if (arrayList.get(0) == null) {
                c2.m();
                return;
            }
            synchronized (this) {
                if (((ThreadPoolExecutor) this.Y) == null) {
                    this.Y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new js8(ks8.f + " Dispatcher", false, (byte) 0));
                }
                throw null;
            }
        }
    }

    public ArrayList C() {
        ArrayList arrayList = new ArrayList();
        for (wl2 wl2Var : ((HashMap) this.Z).values()) {
            if (wl2Var != null) {
                arrayList.add(wl2Var);
            }
        }
        return arrayList;
    }

    public ArrayList D() {
        ArrayList arrayList = new ArrayList();
        for (wl2 wl2Var : ((HashMap) this.Z).values()) {
            if (wl2Var != null) {
                arrayList.add(wl2Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public sx4 E(qs0 qs0Var, List list) {
        qs0Var.getClass();
        return (sx4) ((pe4) this.g0).B(new d65(qs0Var, list));
    }

    public b71 F() {
        b71 b71Var = (b71) ((dn2) this.f0).invoke();
        if (b71Var != null) {
            return b71Var;
        }
        bt.i("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public List G() {
        ArrayList arrayList;
        if (((ArrayList) this.Y).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.Y)) {
            arrayList = new ArrayList((ArrayList) this.Y);
        }
        return arrayList;
    }

    public Enum J(nw3 nw3Var, Object obj) {
        nw3Var.getClass();
        return (Enum) ((n22) ((l22) this.f0)).get(((bg3) ((ld2) this.Z).e(((Number) ((yv3) this.Y).get(obj)).intValue())).a());
    }

    public boolean K(Context context) {
        if (((Boolean) this.f0) == null) {
            this.f0 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.Z).booleanValue();
        return ((Boolean) this.f0).booleanValue();
    }

    public boolean L(Context context) {
        Boolean boolValueOf = (Boolean) this.Z;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.Z = boolValueOf;
        }
        boolValueOf.booleanValue();
        return ((Boolean) this.Z).booleanValue();
    }

    public void M(String str, String str2) {
        str2.getClass();
        ps psVar = (ps) this.f0;
        psVar.getClass();
        dh3.i(str);
        dh3.j(str2, str);
        psVar.e(str);
        str2.getClass();
        ArrayList arrayList = psVar.b;
        arrayList.add(str);
        arrayList.add(fm7.R0(str2).toString());
    }

    public void N(wl2 wl2Var) {
        qk2 qk2Var = wl2Var.c;
        String str = qk2Var.g0;
        HashMap map = (HashMap) this.Z;
        if (map.get(str) != null) {
            return;
        }
        map.put(qk2Var.g0, wl2Var);
        if (qk2Var.F0) {
            boolean z = qk2Var.E0;
            pl2 pl2Var = (pl2) this.g0;
            if (z) {
                pl2Var.e(qk2Var);
            } else {
                pl2Var.g(qk2Var);
            }
            qk2Var.F0 = false;
        }
        if (ml2.K(2)) {
            qk2Var.toString();
        }
    }

    public void O(wl2 wl2Var) {
        HashMap map = (HashMap) this.Z;
        qk2 qk2Var = wl2Var.c;
        if (qk2Var.E0) {
            ((pl2) this.g0).g(qk2Var);
        }
        if (map.get(qk2Var.g0) == wl2Var && ((wl2) map.put(qk2Var.g0, null)) != null && ml2.K(2)) {
            qk2Var.toString();
        }
    }

    public void P(String str, w45 w45Var) {
        str.getClass();
        if (str.length() <= 0) {
            bt.q("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            em7.c(pc6.p("method ", str, " must have a request body."));
        } else {
            this.Y = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object Q(s51 s51Var) throws Throwable {
        cr6 cr6Var;
        o15 o15Var;
        Throwable th;
        o15 o15Var2;
        ux0 ux0Var = (ux0) this.Z;
        if (s51Var instanceof cr6) {
            cr6Var = (cr6) s51Var;
            int i = cr6Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                cr6Var.i0 = i - Integer.MIN_VALUE;
            } else {
                cr6Var = new cr6(this, s51Var);
            }
        } else {
            cr6Var = new cr6(this, s51Var);
        }
        Object obj = cr6Var.g0;
        int i2 = cr6Var.i0;
        dn8 dn8Var = dn8.a;
        Object obj2 = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                if (ux0Var.S()) {
                    return dn8Var;
                }
                o15Var = (q15) this.Y;
                cr6Var.f0 = o15Var;
                cr6Var.i0 = 1;
                if (o15Var.g(cr6Var) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o15Var2 = cr6Var.f0;
                try {
                    w39.n0(obj);
                    ux0Var.V(dn8Var);
                    o15Var2.m(null);
                    return dn8Var;
                } catch (Throwable th2) {
                    th = th2;
                    o15Var2.m(null);
                    throw th;
                }
            }
            o15 o15Var3 = cr6Var.f0;
            w39.n0(obj);
            o15Var = o15Var3;
            if (ux0Var.S()) {
                o15Var.m(null);
                return dn8Var;
            }
            cr6Var.f0 = o15Var;
            cr6Var.i0 = 2;
            if (x(cr6Var) != obj2) {
                o15Var2 = o15Var;
                ux0Var.V(dn8Var);
                o15Var2.m(null);
                return dn8Var;
            }
            return obj2;
        } catch (Throwable th3) {
            o15 o15Var4 = o15Var;
            th = th3;
            o15Var2 = o15Var4;
            o15Var2.m(null);
            throw th;
        }
    }

    public Bundle R(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f0;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void S(Object obj, nw3 nw3Var, Enum r5) {
        nw3Var.getClass();
        yv3 yv3Var = (yv3) this.Y;
        id2 id2Var = (id2) ((ArrayList) this.g0).get(r5.ordinal());
        int iIntValue = ((Number) yv3Var.get(obj)).intValue();
        int i = (1 << id2Var.b) - 1;
        int i2 = id2Var.a;
        yv3Var.H(obj, Integer.valueOf((iIntValue & (~(i << i2))) + (id2Var.c << i2)));
    }

    public fc8 T(int i, qs0 qs0Var, ga6 ga6Var) {
        gt4 gt4Var = new gt4(((gt4) this.Y).a + '@' + i);
        dq dqVar = (dq) this.g0;
        HashMap map = (HashMap) dqVar.Z;
        List arrayList = (List) map.get(gt4Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(gt4Var, arrayList);
        }
        return ((fu6) dqVar.Y).b0(qs0Var, ga6Var, arrayList);
    }

    @Override // defpackage.j04
    public i04 a(qs0 qs0Var) {
        ArrayList arrayList = new ArrayList();
        return new z47(((fu6) this.Z).a0(qs0Var, ke7.G, arrayList), this, arrayList);
    }

    @Override // defpackage.j04
    public void b(Object obj) {
        ArrayList arrayList = (ArrayList) this.Y;
        fu6 fu6Var = (fu6) this.Z;
        v15 v15Var = (v15) this.f0;
        Object objJ = pz2.j((wx4) fu6Var.f0, obj);
        if (objJ == null) {
            objJ = new v32("Unsupported annotation argument: " + v15Var);
        }
        arrayList.add(objJ);
    }

    @Override // defpackage.i04
    public void c() {
        switch (this.X) {
            case 2:
                ArrayList arrayList = (ArrayList) this.Z;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((dq) this.f0).Z).put((gt4) this.Y, arrayList);
                }
                break;
            case 6:
                ((fc8) this.Z).c();
                ((ArrayList) ((z47) this.f0).Y).add(new qm((gm) wv0.O0((ArrayList) this.g0)));
                break;
            default:
                fc8 fc8Var = (fc8) this.g0;
                v15 v15Var = (v15) this.f0;
                ArrayList arrayList2 = (ArrayList) this.Y;
                ot8 ot8VarX = ch3.x(v15Var, (sx4) fc8Var.g0);
                if (ot8VarX != null) {
                    HashMap map = (HashMap) fc8Var.Z;
                    List listM = ys0.m(arrayList2);
                    t14 t14VarC = ot8VarX.c();
                    t14VarC.getClass();
                    map.put(v15Var, new gj8(listM, t14VarC));
                    break;
                } else if (((fu6) fc8Var.f0).Y((qs0) fc8Var.h0) && dh3.f(v15Var.b(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof qm) {
                            arrayList3.add(obj);
                        }
                    }
                    List list = (List) fc8Var.i0;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        list.add((gm) ((qm) it.next()).a);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yd7
    public void cancel() throws IOException {
        ((Socket) this.Y).close();
    }

    @Override // defpackage.g91
    public void d() {
        EditText editText = (EditText) this.Y;
        editText.getClass();
        x97.U(editText, new td3(this, (byte) 0));
        Button button = (Button) this.Z;
        button.getClass();
        x97.U(button, new td3(this, (byte) 1));
        Button button2 = (Button) this.f0;
        button2.getClass();
        x97.U(button2, new td3(this, (byte) 2));
        Button button3 = (Button) this.g0;
        button3.getClass();
        x97.U(button3, new td3(this, (byte) 3));
    }

    @Override // defpackage.j04
    public void e(qs0 qs0Var, v15 v15Var) {
        ((ArrayList) this.Y).add(new x22(qs0Var, v15Var));
    }

    @Override // defpackage.k04
    public i04 f(qs0 qs0Var, ga6 ga6Var) {
        return ((fu6) ((dq) this.f0).Y).b0(qs0Var, ga6Var, (ArrayList) this.Z);
    }

    @Override // defpackage.i04
    public void g(v15 v15Var, Object obj) {
        ((fc8) this.Y).g(v15Var, obj);
    }

    @Override // defpackage.ov8
    public View getRoot() {
        switch (this.X) {
            case 3:
                break;
        }
        return (LinearLayout) this.Y;
    }

    @Override // defpackage.yd7
    public sa7 getSink() {
        return (wf1) this.g0;
    }

    @Override // defpackage.yd7
    public je7 getSource() {
        return (xf1) this.f0;
    }

    @Override // defpackage.j04
    public void h(vs0 vs0Var) {
        ((ArrayList) this.Y).add(new kv3(new iv3(vs0Var)));
    }

    public void i(qk2 qk2Var) {
        if (((ArrayList) this.Y).contains(qk2Var)) {
            u52.r(qk2Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.Y)) {
            ((ArrayList) this.Y).add(qk2Var);
        }
        qk2Var.m0 = true;
    }

    @Override // defpackage.g91
    public void j() {
        EditText editText = (EditText) this.Y;
        Context context = editText.getContext();
        context.getClass();
        boolean zY = ue3.y(context);
        editText.setFocusableInTouchMode(true);
        ((Button) this.Z).setFocusableInTouchMode(zY);
        ((Button) this.f0).setFocusableInTouchMode(zY);
        ((Button) this.g0).setFocusableInTouchMode(zY);
    }

    public void l(m25 m25Var) {
        if (((LinkedHashSet) this.g0).add(m25Var)) {
            ((n25) this.Z).a(this, m25Var, -1);
        }
    }

    public void m(s95 s95Var, int i) {
        if (i != 1 && i != 0) {
            em7.c(pc6.j(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.g0).add(s95Var)) {
            ((n25) this.Z).a(this, s95Var, i);
        }
    }

    @Override // defpackage.i04
    public void n(v15 v15Var, vs0 vs0Var) {
        ((fc8) this.Y).n(v15Var, vs0Var);
    }

    public y5 o() {
        Map mapUnmodifiableMap;
        u23 u23Var = (u23) this.Z;
        if (u23Var == null) {
            bt.i("url == null");
            return null;
        }
        String str = (String) this.Y;
        nz2 nz2VarD = ((ps) this.f0).d();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.g0;
        byte[] bArr = ks8.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = e02.X;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            mapUnmodifiableMap.getClass();
        }
        return new y5(u23Var, str, nz2VarD, (w45) null, mapUnmodifiableMap);
    }

    public void p(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            kp5.t("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((l97) this.Z).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                p(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.i04
    public j04 r(v15 v15Var) {
        return ((fc8) this.Y).r(v15Var);
    }

    public void s(m25 m25Var, i25 i25Var) {
        n25 n25Var = (n25) this.Z;
        if (n25Var.g != 0) {
            return;
        }
        k25 k25VarC = n25Var.c(-1);
        n25Var.f = k25VarC;
        n25Var.g = -1;
        n25Var.h = m25Var;
        if (i25Var != null) {
            if (k25VarC != null) {
                k25VarC.d(i25Var);
            }
            n25Var.a.n(null, new p25(i25Var));
        }
    }

    @Override // defpackage.i04
    public void t(v15 v15Var, qs0 qs0Var, v15 v15Var2) {
        ((fc8) this.Y).t(v15Var, qs0Var, v15Var2);
    }

    public String toString() {
        switch (this.X) {
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                String string = ((Socket) this.Y).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(long r8, long r10, defpackage.s51 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.u25
            if (r0 == 0) goto L14
            r0 = r12
            u25 r0 = (defpackage.u25) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h0 = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            u25 r0 = new u25
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.f0
            int r1 = r12.h0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.w39.n0(r0)
            goto L74
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r7)
            return r2
        L31:
            defpackage.w39.n0(r0)
            goto L59
        L35:
            defpackage.w39.n0(r0)
            java.lang.Object r0 = r7.Y
            z25 r0 = (defpackage.z25) r0
            if (r0 == 0) goto L43
            z25 r0 = r0.Z0()
            goto L44
        L43:
            r0 = r2
        L44:
            r5 = 0
            c71 r1 = defpackage.c71.X
            if (r0 != 0) goto L5e
            java.lang.Object r7 = r7.Z
            z25 r7 = (defpackage.z25) r7
            if (r7 == 0) goto L78
            r12.h0 = r4
            java.lang.Object r0 = r7.B(r8, r10, r12)
            if (r0 != r1) goto L59
            goto L73
        L59:
            tu8 r0 = (defpackage.tu8) r0
            long r5 = r0.a
            goto L78
        L5e:
            java.lang.Object r7 = r7.Y
            z25 r7 = (defpackage.z25) r7
            if (r7 == 0) goto L68
            z25 r2 = r7.Z0()
        L68:
            r7 = r2
            if (r7 == 0) goto L78
            r12.h0 = r3
            java.lang.Object r0 = r7.B(r8, r10, r12)
            if (r0 != r1) goto L74
        L73:
            return r1
        L74:
            tu8 r0 = (defpackage.tu8) r0
            long r5 = r0.a
        L78:
            tu8 r7 = new tu8
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z47.u(long, long, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(long j, s51 s51Var) {
        v25 v25Var;
        long j2;
        if (s51Var instanceof v25) {
            v25Var = (v25) s51Var;
            int i = v25Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                v25Var.h0 = i - Integer.MIN_VALUE;
            } else {
                v25Var = new v25(this, s51Var);
            }
        } else {
            v25Var = new v25(this, s51Var);
        }
        Object objZ0 = v25Var.f0;
        int i2 = v25Var.h0;
        if (i2 == 0) {
            w39.n0(objZ0);
            z25 z25Var = (z25) this.Y;
            z25 z25VarZ0 = z25Var != null ? z25Var.Z0() : null;
            if (z25VarZ0 != null) {
                v25Var.h0 = 1;
                objZ0 = z25VarZ0.z0(j, v25Var);
                c71 c71Var = c71.X;
                if (objZ0 == c71Var) {
                    return c71Var;
                }
            } else {
                j2 = 0;
            }
            return new tu8(j2);
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(objZ0);
        j2 = ((tu8) objZ0).a;
        return new tu8(j2);
    }

    @Override // defpackage.i04
    public i04 w(qs0 qs0Var, v15 v15Var) {
        return ((fc8) this.Y).w(qs0Var, v15Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(defpackage.s51 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.g0
            ib1 r0 = (defpackage.ib1) r0
            boolean r1 = r7 instanceof defpackage.pa1
            if (r1 == 0) goto L17
            r1 = r7
            pa1 r1 = (defpackage.pa1) r1
            int r2 = r1.h0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.h0 = r2
            goto L1c
        L17:
            pa1 r1 = new pa1
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f0
            int r2 = r1.h0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.w39.n0(r7)
            goto L5b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r6)
            return r3
        L33:
            defpackage.w39.n0(r7)
            goto L68
        L37:
            defpackage.w39.n0(r7)
            java.lang.Object r7 = r6.f0
            java.util.List r7 = (java.util.List) r7
            c71 r2 = defpackage.c71.X
            if (r7 == 0) goto L5e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5e
        L49:
            ja7 r7 = r0.b()
            sa1 r5 = new sa1
            r5.<init>(r0, r6, r3)
            r1.h0 = r4
            java.lang.Object r7 = r7.b(r5, r1)
            if (r7 != r2) goto L5b
            goto L67
        L5b:
            v91 r7 = (defpackage.v91) r7
            goto L6a
        L5e:
            r1.h0 = r5
            r6 = 0
            java.lang.Object r7 = r0.g(r6, r1)
            if (r7 != r2) goto L68
        L67:
            return r2
        L68:
            v91 r7 = (defpackage.v91) r7
        L6a:
            jb1 r6 = r0.j0
            r6.c(r7)
            dn8 r6 = defpackage.dn8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z47.x(s51):java.lang.Object");
    }

    @Override // defpackage.is0
    public hs0 y(qs0 qs0Var) {
        qs0Var.getClass();
        fy5 fy5Var = (fy5) ((LinkedHashMap) this.g0).get(qs0Var);
        if (fy5Var == null) {
            return null;
        }
        return new hs0((x15) this.Y, fy5Var, (s50) this.Z, (ke7) ((ve7) this.f0).B(qs0Var));
    }

    public qk2 z(String str) {
        wl2 wl2Var = (wl2) ((HashMap) this.Z).get(str);
        if (wl2Var != null) {
            return wl2Var.c;
        }
        return null;
    }

    public /* synthetic */ z47(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    public /* synthetic */ z47(boolean z) {
        this.X = (byte) 29;
    }

    public z47(View view) {
        this.X = (byte) 20;
        view.getClass();
        this.Y = (EditText) view.findViewById(e46.et_text);
        this.Z = (Button) view.findViewById(e46.btn_negative);
        this.f0 = (Button) view.findViewById(e46.btn_neutral);
        this.g0 = (Button) view.findViewById(e46.btn_positive);
    }

    public z47(yv3 yv3Var, ld2 ld2Var, l22 l22Var, ArrayList arrayList) {
        this.X = (byte) 18;
        l22Var.getClass();
        this.Y = yv3Var;
        this.Z = ld2Var;
        this.f0 = l22Var;
        this.g0 = arrayList;
    }

    public z47(ve4 ve4Var, vx4 vx4Var) {
        this.X = (byte) 26;
        vx4Var.getClass();
        this.Y = ve4Var;
        this.Z = vx4Var;
        this.f0 = ve4Var.b(new c65(this, (byte) 0));
        this.g0 = ve4Var.b(new c65(this, (byte) 1));
    }

    public z47(az5 az5Var, x15 x15Var, s50 s50Var, ve7 ve7Var) {
        this.X = (byte) 28;
        this.Y = x15Var;
        this.Z = s50Var;
        this.f0 = ve7Var;
        List list = az5Var.i0;
        list.getClass();
        int iG = aq4.G(xv0.Z(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG < 16 ? 16 : iG);
        for (Object obj : list) {
            linkedHashMap.put(u70.L((x15) this.Y, ((fy5) obj).g0), obj);
        }
        this.g0 = linkedHashMap;
    }

    public z47(eq2 eq2Var) {
        this.X = (byte) 16;
        this.Z = eq2Var;
    }

    public z47(Socket socket) {
        this.X = (byte) 12;
        this.Y = socket;
        this.Z = new AtomicInteger();
        this.f0 = new xf1(this);
        this.g0 = new wf1(this);
    }

    public z47(o61 o61Var) {
        this.X = (byte) 24;
        this.Y = o61Var;
        this.Z = new n25();
        new LinkedHashSet();
        this.f0 = new LinkedHashSet();
        this.g0 = new LinkedHashSet();
    }

    public /* synthetic */ z47(byte b, boolean z) {
        this.X = b;
    }

    public z47(jk0 jk0Var, vh0 vh0Var, ul0 ul0Var, xd6 xd6Var) {
        this.X = (byte) 9;
        jk0Var.getClass();
        vh0Var.getClass();
        ul0Var.getClass();
        xd6Var.getClass();
        this.Y = jk0Var;
        this.Z = vh0Var;
        this.f0 = ul0Var;
        this.g0 = xd6Var;
    }

    public z47(Context context) {
        x39 x39Var;
        xy0 xy0Var;
        this.X = (byte) 1;
        synchronized (x39.v0) {
            try {
                x39Var = x39.t0;
                if (x39Var == null) {
                    x39Var = x39.u0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (x39Var != null) {
            this.Y = x39Var.j0;
            this.Z = x39Var.l0;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof HappApplication) {
                xy0Var = ((HappApplication) applicationContext).j();
                this.Y = xy0Var;
            } else {
                mj0 mj0Var = new mj0((byte) 7, false);
                String packageName = applicationContext.getPackageName();
                packageName.getClass();
                mj0Var.Z = packageName;
                xy0Var = new xy0(mj0Var);
                this.Y = xy0Var;
            }
            this.Z = new y5((Executor) xy0Var.f0);
        }
        this.f0 = new we5((byte) 13);
        this.g0 = new we5((byte) 12);
    }

    public z47(Typeface typeface, ev4 ev4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.X = (byte) 23;
        this.g0 = typeface;
        this.Y = ev4Var;
        this.f0 = new fv4(1024);
        int iA = ev4Var.a(6);
        if (iA != 0) {
            int i5 = iA + ev4Var.X;
            i = ((ByteBuffer) ev4Var.f0).getInt(((ByteBuffer) ev4Var.f0).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.Z = new char[i * 2];
        int iA2 = ev4Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + ev4Var.X;
            i2 = ((ByteBuffer) ev4Var.f0).getInt(((ByteBuffer) ev4Var.f0).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            oj8 oj8Var = new oj8(this, i7);
            dv4 dv4VarB = oj8Var.b();
            int iA3 = dv4VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) dv4VarB.f0).getInt(iA3 + dv4VarB.X) : 0, (char[]) this.Z, i7 * 2);
            dv4 dv4VarB2 = oj8Var.b();
            int iA4 = dv4VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + dv4VarB2.X;
                i3 = ((ByteBuffer) dv4VarB2.f0).getInt(((ByteBuffer) dv4VarB2.f0).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            mb6.o(i3 > 0, "invalid metadata codepoint length");
            fv4 fv4Var = (fv4) this.f0;
            dv4 dv4VarB3 = oj8Var.b();
            int iA5 = dv4VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + dv4VarB3.X;
                i4 = ((ByteBuffer) dv4VarB3.f0).getInt(((ByteBuffer) dv4VarB3.f0).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            fv4Var.a(oj8Var, 0, i4 - 1);
        }
    }

    public z47(dq dqVar, gt4 gt4Var) {
        this.X = (byte) 2;
        this.g0 = dqVar;
        this.X = (byte) 2;
        this.f0 = dqVar;
        this.Y = gt4Var;
        this.Z = new ArrayList();
    }

    public z47(c6 c6Var, ki8 ki8Var, g44 g44Var) {
        this.X = (byte) 22;
        ki8Var.getClass();
        this.Y = c6Var;
        this.Z = ki8Var;
        this.f0 = g44Var;
        this.g0 = new f63(this, ki8Var);
    }

    public z47(byte b) {
        this.X = b;
        switch (b) {
            case 14:
                this.Y = new er5(10);
                this.Z = new l97(0);
                this.f0 = new ArrayList();
                this.g0 = new HashSet();
                break;
            case 15:
                this.g0 = new ArrayDeque();
                this.Z = new ArrayDeque();
                this.f0 = new ArrayDeque();
                break;
            case 17:
                this.Y = new int[10];
                this.Z = new int[10];
                this.f0 = new int[10];
                this.g0 = new int[10];
                break;
            case 19:
                this.Y = new ArrayList();
                this.Z = new HashMap();
                this.f0 = new HashMap();
                break;
            case 25:
                this.f0 = new tb2(this, (byte) 23);
                break;
            case 29:
                this.g0 = new LinkedHashMap();
                this.Y = "GET";
                this.f0 = new ps((byte) 1);
                break;
            default:
                this.Y = null;
                this.Z = null;
                this.f0 = null;
                this.g0 = new ArrayDeque();
                break;
        }
    }

    public z47(v06 v06Var, s98 s98Var, bm3 bm3Var) {
        this.X = (byte) 8;
        v06Var.getClass();
        s98Var.getClass();
        bm3Var.getClass();
        this.Y = v06Var;
        this.Z = s98Var;
        this.f0 = bm3Var;
        this.g0 = w51.n(new q0((Object) this, (q51) null, (byte) 9));
    }

    public z47(fu6 fu6Var, v15 v15Var, fc8 fc8Var) {
        this.X = (byte) 7;
        this.Z = fu6Var;
        this.f0 = v15Var;
        this.g0 = fc8Var;
        this.Y = new ArrayList();
    }

    public z47(fc8 fc8Var, z47 z47Var, ArrayList arrayList) {
        this.X = (byte) 6;
        this.Z = fc8Var;
        this.f0 = z47Var;
        this.g0 = arrayList;
        this.Y = fc8Var;
    }

    public z47(vl1 vl1Var) {
        this.X = (byte) 13;
        this.g0 = vl1Var;
        List list = vl1Var.g0.v0;
        list.getClass();
        int iG = aq4.G(xv0.Z(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG < 16 ? 16 : iG);
        for (Object obj : list) {
            linkedHashMap.put(u70.S((w15) vl1Var.n0.Y, ((qy5) obj).f0), obj);
        }
        this.Y = linkedHashMap;
        vl1 vl1Var2 = (vl1) this.g0;
        this.Z = ((hl1) vl1Var2.n0.X).a.c(new d3(this, vl1Var2, (byte) 6));
        ve4 ve4Var = ((hl1) ((vl1) this.g0).n0.X).a;
        f3 f3Var = new f3(this, (byte) 17);
        ve4Var.getClass();
        this.f0 = new te4(ve4Var, f3Var);
    }

    public z47(ib1 ib1Var, List list) {
        this.X = (byte) 11;
        this.g0 = ib1Var;
        this.Y = r15.a();
        this.Z = new ux0();
        this.f0 = wv0.Y0(list);
    }
}
