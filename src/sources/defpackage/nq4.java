package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nq4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MaterialButton Y;
    public final /* synthetic */ Drawable Z;

    public /* synthetic */ nq4(MaterialButton materialButton, Drawable drawable, byte b) {
        this.X = b;
        this.Y = materialButton;
        this.Z = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Drawable drawable = this.Z;
        MaterialButton materialButton = this.Y;
        switch (b) {
            case 0:
                int[] iArr = MaterialButton.T0;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.T0;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
