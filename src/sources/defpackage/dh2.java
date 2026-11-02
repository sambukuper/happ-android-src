package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dh2 implements kq8, kr8 {
    public final qj0 a;
    public final kh7 b;
    public qq8 c;
    public ux0 d;

    public dh2(qj0 qj0Var, jv4 jv4Var, kh7 kh7Var, pr8 pr8Var, p79 p79Var) {
        Object next;
        qj0Var.getClass();
        kh7Var.getClass();
        pr8Var.getClass();
        this.a = qj0Var;
        this.b = kh7Var;
        jj0 jj0Var = qj0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        key.getClass();
        Object obj = 0;
        lf0 lf0Var = (lf0) jj0Var;
        lf0Var.getClass();
        Object objC = lf0Var.c(key);
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        key2.getClass();
        lf0Var.getClass();
        Object objC2 = lf0Var.c(key2);
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        key3.getClass();
        lf0Var.getClass();
        Object objC3 = lf0Var.c(key3);
        jj0.h.getClass();
        ij0.a(jj0Var);
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key4.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key4);
        if (iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = s7.b;
                arrayList.add(i21.z(i));
            }
        }
        jj0 jj0Var2 = this.a.b;
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key5.getClass();
        int[] iArr2 = (int[]) ((lf0) jj0Var2).c(key5);
        if (iArr2 != null) {
            ArrayList arrayList2 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = t7.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((t7) next).a != i2);
                arrayList2.add((t7) next);
            }
        }
    }

    @Override // defpackage.kr8
    public final void a(LinkedHashSet linkedHashSet) {
        Size sizeC;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hq8 hq8Var = (hq8) it.next();
            if ((hq8Var instanceof lt5) && (sizeC = ((lt5) hq8Var).c()) != null) {
                new Rational(sizeC.getWidth(), sizeC.getHeight());
            }
        }
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        this.c = qq8Var;
    }

    @Override // defpackage.kq8
    public final void reset() {
        ux0 ux0Var = new ux0();
        qq8 qq8Var = this.c;
        if (qq8Var == null) {
            p61.y("Camera is not active.", ux0Var);
            return;
        }
        ux0 ux0Var2 = this.d;
        if (ux0Var2 != null) {
            p61.y("Cancelled by another cancelFocusAndMetering()", ux0Var2);
        }
        this.d = ux0Var;
        kh7 kh7Var = this.b;
        synchronized (kh7Var.d) {
        }
        kh7Var.f();
        zc1.f0(qq8Var.i(), ux0Var);
    }
}
