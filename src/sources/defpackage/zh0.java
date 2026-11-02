package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zh0 {
    public final og0 a;

    public zh0(og0 og0Var) {
        og0Var.getClass();
        this.a = og0Var;
    }

    public static ArrayList a(zh0 zh0Var) {
        ArrayList arrayListD;
        zf0 zf0Var = ((re0) zh0Var.d()).b;
        synchronized (zf0Var.f) {
            arrayListD = zf0Var.g;
        }
        if (arrayListD == null) {
            arrayListD = zf0Var.d();
        }
        if (arrayListD == null) {
            ng0.a("CXCP-Camera2");
        }
        return arrayListD;
    }

    public static jj0 b(zh0 zh0Var, String str) {
        zh0Var.getClass();
        str.getClass();
        return ((re0) zh0Var.d()).c.a(str);
    }

    public static Set c(zh0 zh0Var) {
        zf0 zf0Var = ((re0) zh0Var.d()).b;
        if (Build.VERSION.SDK_INT < 30) {
            zf0Var.getClass();
            return m02.X;
        }
        synchronized (zf0Var.f) {
        }
        CameraManager cameraManager = (CameraManager) zf0Var.a.get();
        try {
            cameraManager.getClass();
            Set setD = b4.d(cameraManager);
            setD.toString();
            Set<Set> set = setD;
            ArrayList arrayList = new ArrayList(xv0.Z(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(xv0.Z(set2, 10));
                for (String str : set2) {
                    vi0.a(str);
                    arrayList2.add(new vi0(str));
                }
                arrayList.add(wv0.c1(arrayList2));
            }
            return wv0.c1(arrayList);
        } catch (CameraAccessException unused) {
            return null;
        }
    }

    public final mg0 d() {
        og0 og0Var = this.a;
        try {
            Trace.beginSection("getCameraBackend");
            og0Var.d.getClass();
            mg0 mg0VarA = og0Var.a("CXCP-Camera2");
            if (mg0VarA != null) {
                Trace.endSection();
                return mg0VarA;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) ng0.a("CXCP-Camera2"))).toString());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
