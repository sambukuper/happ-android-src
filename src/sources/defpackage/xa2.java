package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xa2 {
    public static final Object j = new Object();
    public static final vt k = new vt(0);
    public final Context a;
    public final String b;
    public final uc2 c;
    public final xy0 d;
    public final h44 g;
    public final w06 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public xa2(Context context, String str, uc2 uc2Var) {
        ?? arrayList;
        byte b = 0;
        ?? r1 = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        w45.q(str);
        this.b = str;
        this.c = uc2Var;
        gz gzVar = FirebaseInitProvider.X;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new qy0((String) it.next(), b));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        nl8 nl8Var = nl8.X;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        byte b2 = 1;
        arrayList3.add(new qy0(new FirebaseCommonRegistrar(), b2));
        arrayList3.add(new qy0(new ExecutorsRegistrar(), b2));
        arrayList4.add(cy0.b(context, Context.class, new Class[0]));
        arrayList4.add(cy0.b(this, xa2.class, new Class[0]));
        arrayList4.add(cy0.b(uc2Var, uc2.class, new Class[0]));
        ra raVar = new ra((byte) 12, r1 == true ? 1 : 0);
        if (us7.g(context) && FirebaseInitProvider.Y.get()) {
            arrayList4.add(cy0.b(gzVar, gz.class, new Class[0]));
        }
        xy0 xy0Var = new xy0(arrayList3, arrayList4, raVar);
        this.d = xy0Var;
        Trace.endSection();
        this.g = new h44(new wy0(this, context, (byte) 2));
        this.h = xy0Var.f(ue1.class);
        ua2 ua2Var = new ua2(this);
        a();
        if (this.e.get()) {
            w00.g0.X.get();
        }
        this.i.add(ua2Var);
        Trace.endSection();
    }

    public static xa2 b() {
        xa2 xa2Var;
        synchronized (j) {
            try {
                xa2Var = (xa2) k.get("[DEFAULT]");
                if (xa2Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + en.t() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((ue1) xa2Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return xa2Var;
    }

    public static xa2 e(Context context, uc2 uc2Var) {
        xa2 xa2Var;
        AtomicReference atomicReference = va2.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = va2.a;
            if (atomicReference2.get() == null) {
                va2 va2Var = new va2();
                do {
                    if (atomicReference2.compareAndSet(null, va2Var)) {
                        w00.a(application);
                        w00 w00Var = w00.g0;
                        w00Var.getClass();
                        synchronized (w00Var) {
                            w00Var.Z.add(va2Var);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            vt vtVar = k;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (vtVar.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(str);
            }
            w45.t(context, "Application context cannot be null.");
            xa2Var = new xa2(context, "[DEFAULT]", uc2Var);
            vtVar.put("[DEFAULT]", xa2Var);
        }
        xa2Var.d();
        return xa2Var;
    }

    public static void f(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    b();
                    return;
                }
                uc2 uc2VarA = uc2.a(context);
                if (uc2VarA == null) {
                    return;
                }
                e(context, uc2VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f.get()) {
            bt.i("FirebaseApp was deleted");
        }
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        HashMap map;
        if (!us7.g(this.a)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = wa2.b;
            if (atomicReference.get() == null) {
                wa2 wa2Var = new wa2(context);
                while (!atomicReference.compareAndSet(null, wa2Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(wa2Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        xy0 xy0Var = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) xy0Var.i0;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((ue1) this.h.get()).b();
            }
        }
        synchronized (xy0Var) {
            map = new HashMap((HashMap) xy0Var.Y);
        }
        xy0Var.d(map, zEquals);
        ((ue1) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xa2)) {
            return false;
        }
        xa2 xa2Var = (xa2) obj;
        xa2Var.a();
        return this.b.equals(xa2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        e93 e93Var = new e93(this);
        e93Var.a(this.b, "name");
        e93Var.a(this.c, "options");
        return e93Var.toString();
    }
}
