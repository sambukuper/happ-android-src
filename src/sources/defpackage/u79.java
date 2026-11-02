package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u79 implements t79 {
    public final jj0 a;
    public final vz7 b = new vz7(new v38(this, (byte) 13));
    public final xd6 c = new xd6(new em7((byte) 25));
    public boolean d;
    public final boolean e;
    public z76 f;
    public v73 g;

    public u79(qj0 qj0Var) {
        this.a = qj0Var.b;
        this.e = um1.a().b(ZslDisablerQuirk.class) != null;
    }

    @Override // defpackage.t79
    public final void a() throws Exception {
        g();
    }

    @Override // defpackage.t79
    public final void b(b57 b57Var) throws Exception {
        xm0 xm0Var = b57Var.b;
        g();
        if (this.d) {
            xm0Var.Y = 1;
            return;
        }
        if (this.e) {
            xm0Var.Y = 1;
            return;
        }
        jj0.h.getClass();
        jj0 jj0Var = this.a;
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key);
        if (iArr == null) {
            iArr = ij0.b;
        }
        if (!eu.a0(iArr, 4)) {
            hi5.k0();
            xm0Var.Y = 1;
            return;
        }
        vz7 vz7Var = this.b;
        Size[] inputSizes = ((StreamConfigurationMap) vz7Var.getValue()).getInputSizes(34);
        inputSizes.getClass();
        Iterator it = eu.K0(inputSizes).iterator();
        if (!it.hasNext()) {
            bt.n();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            size.getClass();
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                size2.getClass();
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            hi5.m0();
            return;
        }
        if (hi5.i0("CXCP")) {
            size3.toString();
        }
        int[] validOutputFormatsForInput = ((StreamConfigurationMap) vz7Var.getValue()).getValidOutputFormatsForInput(34);
        validOutputFormatsForInput.getClass();
        if (!eu.a0(validOutputFormatsForInput, PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            hi5.m0();
            return;
        }
        cv4 cv4Var = new cv4(size3.getWidth(), size3.getHeight(), 34, 9);
        yg0 yg0Var = cv4Var.Y;
        yg0Var.getClass();
        z76 z76Var = new z76(cv4Var);
        cv4Var.p(new j78(this, (byte) 8), ki3.a());
        Surface surface = z76Var.getSurface();
        if (surface == null) {
            bt.i("Required value was null.");
            return;
        }
        v73 v73Var = new v73(surface, new Size(z76Var.b(), z76Var.a()), 34);
        vr3.P(v73Var.e).a(new cn0(z76Var, (byte) 3), km4.J());
        b57Var.b(v73Var, px1.d, -1);
        xm0Var.c(yg0Var);
        ArrayList arrayList = b57Var.e;
        if (!arrayList.contains(yg0Var)) {
            arrayList.add(yg0Var);
        }
        b57Var.g = new InputConfiguration(z76Var.b(), z76Var.a(), z76Var.e());
        this.f = z76Var;
        this.g = v73Var;
    }

    @Override // defpackage.t79
    public final void d(boolean z) throws Exception {
        if (this.d != z && z) {
            f();
        }
        this.d = z;
    }

    @Override // defpackage.t79
    public final boolean e(wg1 wg1Var, f57 f57Var) {
        Size size = wg1Var.h;
        f57Var.getClass();
        InputConfiguration inputConfiguration = f57Var.i;
        return inputConfiguration != null && wg1Var.i == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight();
    }

    public final void f() throws Exception {
        boolean zIsEmpty;
        xd6 xd6Var = this.c;
        while (true) {
            synchronized (xd6Var.Z) {
                zIsEmpty = ((ArrayDeque) xd6Var.Y).isEmpty();
            }
            if (zIsEmpty) {
                return;
            } else {
                ((n63) xd6Var.l()).close();
            }
        }
    }

    public final void g() throws Exception {
        v73 v73Var = this.g;
        if (v73Var != null) {
            z76 z76Var = this.f;
            if (z76Var != null) {
                vr3.P(v73Var.e).a(new cn0(z76Var, (byte) 4), km4.J());
                z76Var.h();
                this.f = null;
            }
            v73Var.a();
            this.g = null;
        }
        f();
    }

    @Override // defpackage.t79
    public final void c(boolean z) {
    }
}
