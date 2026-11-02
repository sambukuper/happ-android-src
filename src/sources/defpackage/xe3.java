package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xe3 implements ye3 {
    public int X;
    public long Y;

    public /* synthetic */ xe3(long j, int i) {
        this.Y = j;
        this.X = i;
    }

    public static xe3 b(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new xe3(j, i3);
    }

    public synchronized boolean a() {
        return this.X == 0 || System.currentTimeMillis() > this.Y;
    }

    public synchronized void c(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.X = 0;
            }
            return;
        } else {
            this.X++;
            synchronized (this) {
                this.Y = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.X) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
            }
            return;
        }
        throw th;
    }

    @Override // defpackage.ye3
    public te3 toInstant() {
        long j = this.Y;
        if (j >= te3.Z.X && j <= te3.f0.X) {
            return km4.F(this.X, j);
        }
        throw new ve3("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
