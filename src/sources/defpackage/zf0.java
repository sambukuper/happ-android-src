package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 {
    public final v06 a;
    public final s98 b;
    public final eg0 c;
    public final v06 d;
    public final m51 e;
    public final Object f;
    public ArrayList g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final int j;
    public final f76 k;
    public final vz7 l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public zf0(v06 v06Var, s98 s98Var, Context context, PackageManager packageManager, eg0 eg0Var, v06 v06Var2, wj0 wj0Var, bm3 bm3Var) {
        v06Var.getClass();
        s98Var.getClass();
        packageManager.getClass();
        eg0Var.getClass();
        v06Var2.getClass();
        wj0Var.getClass();
        bm3Var.getClass();
        this.a = v06Var;
        this.b = s98Var;
        this.c = eg0Var;
        this.d = v06Var2;
        m51 m51VarC = gv3.c(g33.K(new ow7(bm3Var), s98Var.h).B0(new x61("Camera2DeviceCache")));
        this.e = m51VarC;
        this.f = new Object();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        this.j = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        wj0Var.a(uj0.Y, new c1(this, (byte) 7));
        xe2 xe2VarT = w51.t(w51.n(new q0((Object) this, (q51) null, (byte) 11)));
        fh7 fh7Var = new fh7(Long.MAX_VALUE);
        eb9 eb9VarV = jm4.v(xe2VarT);
        u77 u77VarA = v77.a(1, eb9VarV.Y, (l90) eb9VarV.f0);
        this.k = new f76(u77VarA, w51.F(m51VarC, (s61) eb9VarV.g0, fh7Var.equals(h87.a) ? e71.X : e71.f0, new wu1(fh7Var, (xe2) eb9VarV.Z, u77VarA, v77.a, (q51) null)));
        this.l = new vz7(new o7((Object) this, (byte) 15));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, s51 s51Var) {
        wf0 wf0Var;
        xg1 xg1Var;
        if (s51Var instanceof wf0) {
            wf0Var = (wf0) s51Var;
            int i = wf0Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wf0Var.j0 = i - Integer.MIN_VALUE;
            } else {
                wf0Var = new wf0(this, s51Var);
            }
        } else {
            wf0Var = new wf0(this, s51Var);
        }
        Object objJ0 = wf0Var.h0;
        c71 c71Var = c71.X;
        int i2 = wf0Var.j0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objJ0);
            if (Build.VERSION.SDK_INT < 35) {
                return null;
            }
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.h;
                    vi0 vi0Var = new vi0(str);
                    Object objJ = linkedHashMap.get(vi0Var);
                    if (objJ == null) {
                        objJ = w51.j(this.e, this.b.f, new k(str, this, q51Var, (byte) 4), 2);
                        linkedHashMap.put(vi0Var, objJ);
                    }
                    xg1Var = (xg1) objJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            wf0Var.f0 = str;
            wf0Var.g0 = xg1Var;
            wf0Var.j0 = 1;
            objJ0 = xg1Var.J0(wf0Var);
            if (objJ0 == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xg1 xg1Var2 = wf0Var.g0;
            String str2 = wf0Var.f0;
            w39.n0(objJ0);
            xg1Var = xg1Var2;
            str = str2;
        }
        wh0 wh0Var = (wh0) objJ0;
        if (wh0Var != null) {
            return wh0Var;
        }
        vi0.b(str);
        synchronized (this.f) {
            this.h.remove(new vi0(str), xg1Var);
        }
        return wh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, s51 s51Var) {
        xf0 xf0Var;
        xg1 xg1Var;
        if (s51Var instanceof xf0) {
            xf0Var = (xf0) s51Var;
            int i = xf0Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                xf0Var.j0 = i - Integer.MIN_VALUE;
            } else {
                xf0Var = new xf0(this, s51Var);
            }
        } else {
            xf0Var = new xf0(this, s51Var);
        }
        Object objJ0 = xf0Var.h0;
        c71 c71Var = c71.X;
        int i2 = xf0Var.j0;
        if (i2 == 0) {
            w39.n0(objJ0);
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.i;
                    vi0 vi0Var = new vi0(str);
                    Object objJ = linkedHashMap.get(vi0Var);
                    if (objJ == null) {
                        objJ = w51.j(this.e, this.b.f, new yf0(str, this, null), 2);
                        linkedHashMap.put(vi0Var, objJ);
                    }
                    xg1Var = (xg1) objJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            xf0Var.f0 = str;
            xf0Var.g0 = xg1Var;
            xf0Var.j0 = 1;
            objJ0 = xg1Var.J0(xf0Var);
            if (objJ0 == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xg1 xg1Var2 = xf0Var.g0;
            String str2 = xf0Var.f0;
            w39.n0(objJ0);
            xg1Var = xg1Var2;
            str = str2;
        }
        dg0 dg0Var = (dg0) objJ0;
        if (dg0Var != null) {
            return dg0Var;
        }
        vi0.b(str);
        synchronized (this.f) {
            this.i.remove(new vi0(str), xg1Var);
        }
        return dg0Var;
    }

    public final void c(kv5 kv5Var, String str, boolean z) {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = this.g;
        }
        ArrayList arrayListD = null;
        if (z) {
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        arrayListD = d();
                        break;
                    }
                } while (!dh3.f(((vi0) it.next()).a, str));
            } else {
                arrayListD = d();
                break;
            }
        } else {
            if (z) {
                b61.c();
                return;
            }
            if (arrayList == null) {
                arrayListD = d();
                break;
            } else if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (dh3.f(((vi0) it2.next()).a, str)) {
                        arrayListD = d();
                        break;
                    }
                }
            }
        }
        if (arrayListD != null && (arrayListD.size() >= this.j || arrayList == null)) {
            arrayList = arrayListD;
        }
        if (arrayList != null) {
            Objects.toString(arrayList);
            if (jm4.c0(kv5Var, arrayList) instanceof tp0) {
                Objects.toString(arrayList);
            }
        }
    }

    public final ArrayList d() {
        try {
            String[] cameraIdList = ((CameraManager) this.a.get()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                str.getClass();
                vi0.a(str);
                arrayList.add(new vi0(str));
            }
            if (arrayList.size() < this.j) {
                arrayList.toString();
                return arrayList;
            }
            synchronized (this.f) {
                this.g = arrayList;
            }
            arrayList.toString();
            return arrayList;
        } catch (CameraAccessException | ArrayIndexOutOfBoundsException | NullPointerException unused) {
            return null;
        }
    }
}
