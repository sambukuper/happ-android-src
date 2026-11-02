package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wd implements mn0 {
    public final s98 a;
    public final hi0 b;
    public final cl7 c;
    public final ig0 d;
    public final tl7 e;

    public wd(s98 s98Var, hi0 hi0Var, cl7 cl7Var, ig0 ig0Var, tl7 tl7Var) {
        s98Var.getClass();
        ig0Var.getClass();
        tl7Var.getClass();
        this.a = s98Var;
        this.b = hi0Var;
        this.c = cl7Var;
        this.d = ig0Var;
        this.e = tl7Var;
    }

    @Override // defpackage.mn0
    public final ln0 a(yh0 yh0Var, Map map, sn0 sn0Var) throws Exception {
        ei0 ei0VarB;
        sn0Var.getClass();
        hi0 hi0Var = this.b;
        if (hi0Var.h != 2) {
            u52.m("Unsupported session mode: ", wl7.g0(this.b.h), " for Extension CameraGraph");
            return null;
        }
        Object obj = hi0Var.g.get(sj0.a);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            bt.i("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int iIntValue = num.intValue();
        if (this.b.d != null) {
            bt.i("Reprocessing is not supported for Extensions");
            return null;
        }
        lf0 lf0Var = (lf0) ((hg0) this.d).a(yh0Var.m());
        Set set = (Set) lf0Var.i0.getValue();
        tl7 tl7Var = this.e;
        if (!set.contains(Integer.valueOf(iIntValue))) {
            StringBuilder sb = new StringBuilder();
            sb.append(yh0Var);
            sb.append(" does not support extension mode ");
            sb.append(iIntValue);
            sb.append(". Supported extensions are ");
            sb.append(set);
            tl7Var.getClass();
        }
        if (this.b.e != null) {
            synchronized (lf0Var.h0) {
                ei0VarB = (ei0) lf0Var.h0.get(Integer.valueOf(iIntValue));
            }
            if (ei0VarB == null) {
                hg0 hg0Var = lf0Var.Z;
                String str = lf0Var.X;
                str.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    throw new Exception(pc6.j(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                }
                try {
                    Trace.beginSection(((Object) vi0.b(str)) + "#awaitExtensionMetadata");
                    synchronized (hg0Var.g) {
                        ei0 ei0VarB2 = (ei0) hg0Var.g.get(str);
                        if (ei0VarB2 != null) {
                            ei0VarB = ei0VarB2;
                        } else if (hg0Var.e()) {
                            ei0VarB = hg0Var.b(iIntValue, str, true);
                        } else {
                            ei0VarB2 = hg0Var.b(iIntValue, str, false);
                            hg0Var.g.put(str, ei0VarB2);
                            ei0VarB = ei0VarB2;
                        }
                    }
                    Trace.endSection();
                    synchronized (lf0Var.h0) {
                        lf0Var.h0.put(Integer.valueOf(iIntValue), ei0VarB);
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            tl7 tl7Var2 = this.e;
            if (!((Boolean) ((if0) ei0VarB).f0.getValue()).booleanValue()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(yh0Var);
                sb2.append(" does not support Postview streams");
                tl7Var2.getClass();
            }
            if (this.b.e.a.size() != 1) {
                bt.i("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        le5 le5VarL = w51.l(this.b, this.c, map);
        if (le5VarL.a.isEmpty()) {
            Objects.toString(this.b);
            sn0Var.a();
            return oy1.k0;
        }
        if (!le5VarL.b.isEmpty()) {
            bt.i("Deferred output is not supported for Extensions");
            return null;
        }
        x62 x62Var = new x62(sn0Var);
        ArrayList arrayList = le5VarL.a;
        hv hvVar = new hv(this.a.a());
        hi0 hi0Var2 = this.b;
        if (yh0Var.H0(new w62(arrayList, hvVar, sn0Var, hi0Var2.f, hi0Var2.g, Integer.valueOf(iIntValue), x62Var, le5VarL.c))) {
            return new kn0(le5VarL.b, le5VarL.d);
        }
        yh0Var.toString();
        sn0Var.toString();
        sn0Var.a();
        return oy1.k0;
    }
}
