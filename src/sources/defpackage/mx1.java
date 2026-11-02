package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 extends ys0 {
    public final /* synthetic */ byte w0;

    public /* synthetic */ mx1(byte b) {
        this.w0 = b;
    }

    @Override // defpackage.ys0
    public final float E(Object obj) {
        switch (this.w0) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getTranslationY();
            case 2:
                return ((View) obj).getScaleX();
            case 3:
                return ((View) obj).getScaleY();
            case 4:
                return ((View) obj).getRotation();
            case 5:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // defpackage.ys0
    public final void U(Object obj, float f) {
        switch (this.w0) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setTranslationY(f);
                break;
            case 2:
                ((View) obj).setScaleX(f);
                break;
            case 3:
                ((View) obj).setScaleY(f);
                break;
            case 4:
                ((View) obj).setRotation(f);
                break;
            case 5:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }
}
