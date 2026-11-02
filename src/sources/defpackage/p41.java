package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p41 implements q41, s41 {
    public final /* synthetic */ byte a;
    public final Object b;

    public p41() {
        this.a = (byte) 2;
        this.b = z51.H(Boolean.FALSE);
    }

    @Override // defpackage.s41
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.q41
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.q41
    public t41 build() {
        return new t41(new p41(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.q41
    public void c(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.s41
    public int d() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.s41
    public ContentInfo e() {
        return (ContentInfo) this.b;
    }

    public void f(AndroidComposeView androidComposeView, b17 b17Var, s61 s61Var, Consumer consumer) {
        c15 c15Var = new c15(0, new lx6[16]);
        w79.Q(b17Var.a(), 0, new kx6(1, c15Var, c15.class, "add", "add(Ljava/lang/Object;)Z", 8, (byte) 0));
        Arrays.sort(c15Var.X, 0, c15Var.Z, new tx0(new gn2[]{new dw6((byte) 28), new dw6((byte) 29)}, (byte) 0));
        int i = c15Var.Z;
        lx6 lx6Var = (lx6) (i == 0 ? null : c15Var.X[i - 1]);
        if (lx6Var == null) {
            return;
        }
        lf3 lf3Var = lx6Var.c;
        pz0 pz0Var = new pz0(lx6Var.a, lf3Var, gv3.c(s61Var), this, androidComposeView);
        i55 i55Var = lx6Var.d;
        s86 s86VarH = jm4.x(i55Var).H(i55Var, true);
        long jC = lf3Var.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, pu.S(os4.L(s86VarH)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), pz0Var);
        scrollCaptureTarget.setScrollBounds(pu.S(lf3Var));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // defpackage.s41
    public int getSource() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.q41
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public p41(ContentInfo contentInfo) {
        this.a = (byte) 1;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public p41(ClipData clipData, int i) {
        this.a = (byte) 0;
        this.b = rc.d(clipData, i);
    }
}
