package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pj implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aa6 b;
    public final /* synthetic */ sd1 c;

    public /* synthetic */ pj(sd1 sd1Var, aa6 aa6Var, byte b) {
        this.a = b;
        this.c = sd1Var;
        this.b = aa6Var;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        byte b = this.a;
        tr5 tr5Var = tr5.X;
        aa6 aa6Var = this.b;
        sd1 sd1Var = this.c;
        switch (b) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                pd5 pd5Var = ((sj) sd1Var).b;
                ta7 ta7Var = pd5Var.b;
                pw6 pw6Var = pd5Var.c;
                f4 f4Var = y63.b;
                long jL = w79.l(width, height, ta7Var, pw6Var, (ta7) z68.G(pd5Var, f4Var));
                int i = (int) (jL >> 32);
                int i2 = (int) (jL & 4294967295L);
                if (width > 0 && height > 0 && (width != i || height != i2)) {
                    pd5 pd5Var2 = ((sj) sd1Var).b;
                    double dN = w79.n(width, height, i, i2, pd5Var2.c, (ta7) z68.G(pd5Var2, f4Var));
                    boolean z = dN < 1.0d;
                    aa6Var.X = z;
                    if (z || ((sj) sd1Var).b.d == tr5Var) {
                        imageDecoder.setTargetSize(nr4.N(((double) width) * dN), nr4.N(dN * ((double) height)));
                    }
                }
                pd5 pd5Var3 = ((sj) sd1Var).b;
                imageDecoder.setAllocator(ue3.z(b73.a(pd5Var3)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) z68.G(pd5Var3, b73.h)).booleanValue() ? 1 : 0);
                f4 f4Var2 = b73.c;
                if (bt.a(z68.G(pd5Var3, f4Var2)) != null) {
                    imageDecoder.setTargetColorSpace(bt.a(z68.G(pd5Var3, f4Var2)));
                }
                if (z68.G(pd5Var3, w63.b) != null) {
                    c2.m();
                } else {
                    imageDecoder.setPostProcessor(null);
                }
                break;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                pd5 pd5Var4 = ((hi7) sd1Var).c;
                ta7 ta7Var2 = pd5Var4.b;
                pw6 pw6Var2 = pd5Var4.c;
                f4 f4Var3 = y63.b;
                long jL2 = w79.l(width2, height2, ta7Var2, pw6Var2, (ta7) z68.G(pd5Var4, f4Var3));
                int i3 = (int) (jL2 >> 32);
                int i4 = (int) (jL2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i3 || height2 != i4)) {
                    pd5 pd5Var5 = ((hi7) sd1Var).c;
                    double dN2 = w79.n(width2, height2, i3, i4, pd5Var5.c, (ta7) z68.G(pd5Var5, f4Var3));
                    boolean z2 = dN2 < 1.0d;
                    aa6Var.X = z2;
                    if (z2 || ((hi7) sd1Var).c.d == tr5Var) {
                        imageDecoder.setTargetSize(nr4.N(((double) width2) * dN2), nr4.N(dN2 * ((double) height2)));
                    }
                }
                final hi7 hi7Var = (hi7) sd1Var;
                imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: ei7
                    @Override // android.graphics.ImageDecoder.OnPartialImageListener
                    public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                        return ((Boolean) z68.G(hi7Var.c, b73.f)).booleanValue();
                    }
                });
                pd5 pd5Var6 = hi7Var.c;
                imageDecoder.setAllocator(ue3.z(b73.a(pd5Var6)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) z68.G(pd5Var6, b73.h)).booleanValue() ? 1 : 0);
                f4 f4Var4 = b73.c;
                if (bt.a(z68.G(pd5Var6, f4Var4)) != null) {
                    imageDecoder.setTargetColorSpace(bt.a(z68.G(pd5Var6, f4Var4)));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) z68.G(pd5Var6, b73.d)).booleanValue());
                break;
        }
    }
}
