package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ly8 implements yh0 {
    public final za X;
    public final Object Y = new Object();
    public boolean Z;

    public ly8(za zaVar) {
        this.X = zaVar;
    }

    @Override // defpackage.yh0
    public final void B0() {
        this.X.B0();
    }

    @Override // defpackage.yh0
    public final void C(int i) {
        this.X.C(i);
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        return this.X.C0(zu3Var);
    }

    @Override // defpackage.yh0
    public final boolean H0(w62 w62Var) {
        boolean zH0;
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    w62Var.g.a();
                    zH0 = false;
                } else {
                    zH0 = this.X.H0(w62Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zH0;
    }

    @Override // defpackage.yh0
    public final void J() {
        this.X.J();
    }

    @Override // defpackage.yh0
    public final boolean J0(ArrayList arrayList, sn0 sn0Var) {
        boolean zJ0;
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    sn0Var.a();
                    zJ0 = false;
                } else {
                    zJ0 = this.X.J0(arrayList, sn0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ0;
    }

    @Override // defpackage.yh0
    public final boolean X(i57 i57Var) {
        boolean zX;
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    i57Var.e.a();
                    zX = false;
                } else {
                    zX = this.X.X(i57Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zX;
    }

    @Override // defpackage.yh0
    public final CaptureRequest.Builder Y(int i) {
        CaptureRequest.Builder builderY;
        synchronized (this.Y) {
            builderY = this.Z ? null : this.X.Y(i);
        }
        return builderY;
    }

    @Override // defpackage.yh0
    public final boolean c0(List list, fh0 fh0Var) {
        boolean zC0;
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    fh0Var.a();
                    zC0 = false;
                } else {
                    zC0 = this.X.c0(list, fh0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zC0;
    }

    @Override // defpackage.yh0
    public final boolean g(hd3 hd3Var, ArrayList arrayList, sn0 sn0Var) {
        boolean zG;
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    sn0Var.a();
                    zG = false;
                } else {
                    zG = this.X.g(hd3Var, arrayList, sn0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zG;
    }

    @Override // defpackage.yh0
    public final boolean k(ArrayList arrayList, sn0 sn0Var) {
        boolean zK;
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    sn0Var.a();
                    zK = false;
                } else {
                    zK = this.X.k(arrayList, sn0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zK;
    }

    @Override // defpackage.yh0
    public final String m() {
        return this.X.Z;
    }

    @Override // defpackage.yh0
    public final CaptureRequest.Builder p(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderP;
        synchronized (this.Y) {
            builderP = this.Z ? null : this.X.p(totalCaptureResult);
        }
        return builderP;
    }

    @Override // defpackage.yh0
    public final boolean u(InputConfiguration inputConfiguration, ArrayList arrayList, sn0 sn0Var) {
        boolean zU;
        synchronized (this.Y) {
            try {
                if (this.Z) {
                    sn0Var.a();
                    zU = false;
                } else {
                    zU = this.X.u(inputConfiguration, arrayList, sn0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zU;
    }
}
