package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fg implements p79 {
    public final qj0 X;
    public final Range Y;

    public fg(qj0 qj0Var, Range range) {
        this.X = qj0Var;
        this.Y = range;
    }

    @Override // defpackage.p79
    public final float a() {
        Object upper = this.Y.getUpper();
        upper.getClass();
        return ((Number) upper).floatValue();
    }

    @Override // defpackage.p79
    public final float c() {
        Object lower = this.Y.getLower();
        lower.getClass();
        return ((Number) lower).floatValue();
    }

    @Override // defpackage.p79
    public final xg1 m(qq8 qq8Var) {
        qq8Var.getClass();
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        key.getClass();
        ArrayList arrayListN = i21.N(key);
        if (Build.VERSION.SDK_INT >= 34) {
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            key2.getClass();
            arrayListN.add(key2);
        }
        return qq8Var.e(arrayListN);
    }

    @Override // defpackage.p79
    public final xg1 p(qq8 qq8Var) {
        qq8Var.getClass();
        float fC = c();
        if (1.0f > a() || fC > 1.0f) {
            bt.q("Failed requirement.");
            return null;
        }
        LinkedHashMap linkedHashMapK = zp4.K(new qg5(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ij0 ij0Var = jj0.h;
            jj0 jj0Var = this.X.b;
            ij0Var.getClass();
            jj0Var.getClass();
            if (i >= 34 && u3.v(jj0Var)) {
                u3.H(linkedHashMapK);
            }
        }
        return qq8Var.h(linkedHashMapK, oq8.b);
    }
}
