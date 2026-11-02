package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 {
    public static final Object j = new Object();
    public static volatile yy1 k;
    public final ReentrantReadWriteLock a;
    public final bu b;
    public volatile byte c;
    public final Handler d;
    public final uy1 e;
    public final xy1 f;
    public final be g;
    public final boolean h;
    public final re1 i;

    public yy1(pi2 pi2Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        xy1 xy1Var = pi2Var.a;
        this.f = xy1Var;
        boolean z = pi2Var.b;
        this.h = z;
        this.i = pi2Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new bu(0);
        this.g = new be((byte) 28);
        uy1 uy1Var = new uy1(this);
        this.e = uy1Var;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                xy1Var.a(new ty1(uy1Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static yy1 a() {
        yy1 yy1Var;
        synchronized (j) {
            yy1Var = k;
            mb6.s("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", yy1Var != null);
        }
        return yy1Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        mb6.s("Not initialized yet", c() == 1);
        mb6.r(charSequence, "charSequence cannot be null");
        lr lrVar = this.e.b;
        lrVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            pj8[] pj8VarArr = (pj8[]) spanned.getSpans(i, i + 1, pj8.class);
            if (pj8VarArr.length > 0) {
                return spanned.getSpanStart(pj8VarArr[0]);
            }
        }
        return ((lz1) lrVar.y(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new lz1(i))).Y;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        mb6.s("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h);
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            uy1 uy1Var = this.e;
            yy1 yy1Var = uy1Var.a;
            try {
                yy1Var.f.a(new ty1(uy1Var));
            } catch (Throwable th) {
                yy1Var.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new wy1(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        pj8[] pj8VarArr;
        int spanStart;
        mb6.s("Not initialized yet", c() == 1);
        qn8 qn8Var = null;
        if (i < 0) {
            bt.q("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            bt.q("end cannot be negative");
            return null;
        }
        mb6.o(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        mb6.o(i <= charSequence.length(), "start should be < than charSequence length");
        mb6.o(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        lr lrVar = this.e.b;
        lrVar.getClass();
        boolean z2 = charSequence instanceof te7;
        if (z2) {
            ((te7) charSequence).a();
        }
        if (z2) {
            qn8Var = new qn8((Spannable) charSequence);
            if (qn8Var != null) {
                for (pj8 pj8Var : pj8VarArr) {
                    spanStart = qn8Var.Y.getSpanStart(pj8Var);
                    int spanEnd = qn8Var.Y.getSpanEnd(pj8Var);
                    if (spanStart != i2) {
                        qn8Var.removeSpan(pj8Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((te7) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    qn8Var = new qn8((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((te7) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, pj8.class) <= i2) {
                qn8Var = new qn8();
                qn8Var.X = false;
                qn8Var.Y = new SpannableString(charSequence);
            }
            if (qn8Var != null && (pj8VarArr = (pj8[]) qn8Var.Y.getSpans(i, i2, pj8.class)) != null && pj8VarArr.length > 0) {
                while (i < r2) {
                    spanStart = qn8Var.Y.getSpanStart(pj8Var);
                    int spanEnd2 = qn8Var.Y.getSpanEnd(pj8Var);
                    if (spanStart != i2) {
                        qn8Var.removeSpan(pj8Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    qn8 qn8Var2 = (qn8) lrVar.y(charSequence2, i4, i5, Integer.MAX_VALUE, z, new mj0((Object) qn8Var, lrVar.Y, (byte) 21));
                    if (qn8Var2 != null) {
                        Spannable spannable = qn8Var2.Y;
                        if (z2) {
                            ((te7) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((te7) charSequence2).b();
                    throw th;
                }
            }
            ((te7) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((te7) charSequence2).b();
        throw th;
    }

    public final void h(vy1 vy1Var) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new wy1(Arrays.asList(vy1Var), this.c, null));
            } else {
                this.b.add(vy1Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
