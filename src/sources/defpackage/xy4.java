package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xy4 extends Drawable implements Animatable {
    public final Movie X;
    public final Bitmap.Config Y;
    public final pw6 Z;
    public Canvas j0;
    public Bitmap k0;
    public float n0;
    public float o0;
    public boolean p0;
    public long q0;
    public long r0;
    public Picture t0;
    public boolean v0;
    public final Paint f0 = new Paint(3);
    public final ArrayList g0 = new ArrayList();
    public final Rect h0 = new Rect();
    public final Rect i0 = new Rect();
    public float l0 = 1.0f;
    public float m0 = 1.0f;
    public int s0 = -1;
    public co5 u0 = co5.X;

    public xy4(Movie movie, Bitmap.Config config, pw6 pw6Var) {
        this.X = movie;
        this.Y = config;
        this.Z = pw6Var;
        if (ue3.z(config)) {
            bt.q("Bitmap config must not be hardware.");
            throw null;
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.f0;
        Canvas canvas2 = this.j0;
        Bitmap bitmap = this.k0;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.l0;
            canvas2.scale(f, f);
            this.X.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.t0;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.n0, this.o0);
                float f2 = this.m0;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.h0;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.X;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        ta7 ta7Var = ta7.c;
        double dN = w79.n(iWidth2, iHeight2, iWidth, iHeight, this.Z, ta7Var);
        if (!this.v0 && dN > 1.0d) {
            dN = 1.0d;
        }
        float f = (float) dN;
        this.l0 = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.Y);
        Bitmap bitmap = this.k0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.k0 = bitmapCreateBitmap;
        this.j0 = new Canvas(bitmapCreateBitmap);
        if (this.v0) {
            this.m0 = 1.0f;
            this.n0 = 0.0f;
            this.o0 = 0.0f;
        } else {
            float fN = (float) w79.n(i, i2, iWidth, iHeight, this.Z, ta7Var);
            this.m0 = fN;
            this.n0 = ((iWidth - (i * fN)) / 2.0f) + rect.left;
            this.o0 = ((iHeight - (fN * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.X;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.p0) {
                this.r0 = SystemClock.uptimeMillis();
            }
            int i = (int) (this.r0 - this.q0);
            int i2 = i / iDuration;
            int i3 = this.s0;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.v0) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.i0;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.l0;
                canvas.scale(f, f);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.p0 && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.X.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.X.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f0.getAlpha() != 255) {
            return -3;
        }
        co5 co5Var = this.u0;
        if (co5Var != co5.Y) {
            return (co5Var == co5.X && this.X.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.p0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            em7.c(pc6.j(i, "Invalid alpha: "));
        } else {
            this.f0.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        this.q0 = SystemClock.uptimeMillis();
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ni) arrayList.get(i)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.p0) {
            this.p0 = false;
            ArrayList arrayList = this.g0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ni) arrayList.get(i)).a(this);
            }
        }
    }
}
