package defpackage;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fr4 extends ys0 {
    public final int w0;

    public fr4(int i) {
        this.w0 = i;
    }

    @Override // defpackage.ys0
    public final float E(Object obj) {
        float[] fArr = ((gr4) obj).D0;
        if (fArr != null) {
            return fArr[this.w0];
        }
        return 0.0f;
    }

    @Override // defpackage.ys0
    public final void U(Object obj, float f) {
        gr4 gr4Var = (gr4) obj;
        float[] fArr = gr4Var.D0;
        if (fArr != null) {
            int i = this.w0;
            if (fArr[i] != f) {
                fArr[i] = f;
                o61 o61Var = gr4Var.F0;
                if (o61Var != null) {
                    float fJ = gr4Var.j();
                    MaterialButton materialButton = (MaterialButton) o61Var.Y;
                    int[] iArr = MaterialButton.T0;
                    int i2 = (int) (fJ * 0.11f);
                    if (materialButton.K0 != i2) {
                        materialButton.K0 = i2;
                        materialButton.w();
                        materialButton.invalidate();
                    }
                }
                gr4Var.invalidateSelf();
            }
        }
    }
}
