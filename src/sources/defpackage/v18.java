package defpackage;

import android.content.res.TypedArray;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v18 {
    public static final void a(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = a03.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final s39 b(l49 l49Var) {
        l49Var.getClass();
        return new s39(l49Var.a, l49Var.t);
    }

    public static void c(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return;
        }
        while (true) {
            sb.append((CharSequence) it.next());
            if (!it.hasNext()) {
                return;
            } else {
                sb.append((CharSequence) "|");
            }
        }
    }

    public static final ld4 d(te3 te3Var, pa8 pa8Var) {
        te3Var.getClass();
        pa8Var.getClass();
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(te3Var.X, te3Var.Y);
            instantOfEpochSecond.getClass();
            return new ld4(LocalDateTime.ofInstant(instantOfEpochSecond, pa8Var.a));
        } catch (DateTimeException e) {
            throw new yb1(e);
        }
    }

    public static final void e(TypedArray typedArray, gn2 gn2Var) {
        try {
            gn2Var.B(typedArray);
        } finally {
            typedArray.recycle();
        }
    }

    public static final void f(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }
}
