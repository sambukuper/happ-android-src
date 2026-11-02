package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wp1 {
    public static final be g = new be((byte) 26);
    public static final Size h = new Size(1920, 1080);
    public static final Size i = new Size(320, 240);
    public static final Size j = new Size(640, 480);
    public static volatile wp1 k;
    public final sr4 a = new sr4((byte) 0);
    public final vk1 b = new vk1((byte) 2);
    public final Object c = new Object();
    public volatile Display[] d;
    public final DisplayManager e;
    public volatile Size f;

    public wp1(Context context) {
        vp1 vp1Var = new vp1(this, (byte) 0);
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        displayManager.registerDisplayListener(vp1Var, new Handler(Looper.getMainLooper()));
        this.e = displayManager;
    }

    public final Size a() {
        Size sizeB;
        Size size;
        Point point = new Point();
        b(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        if (cb7.a(size2) < cb7.a(i)) {
            if (((SmallDisplaySizeQuirk) this.b.Y) != null) {
                Map map = SmallDisplaySizeQuirk.a;
                String str = Build.MODEL;
                str.getClass();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Object obj = map.get(upperCase);
                obj.getClass();
                size = (Size) obj;
            } else {
                size = null;
            }
            if (size == null) {
                size = j;
            }
            size2 = size;
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        Size size3 = h;
        if (cb7.a(size3) < cb7.a(size2)) {
            size2 = size3;
        }
        sr4 sr4Var = this.a;
        sr4Var.getClass();
        if (sr4Var.a != null && (sizeB = ExtraCroppingQuirk.b(qx7.X)) != null) {
            if (sizeB.getHeight() * sizeB.getWidth() > size2.getHeight() * size2.getWidth()) {
                return sizeB;
            }
        }
        return size2;
    }

    public final Display b(boolean z) {
        Display[] displays;
        int i2;
        synchronized (this.c) {
            displays = this.d;
            if (displays == null) {
                displays = this.e.getDisplays();
                this.d = displays;
                displays.getClass();
            }
        }
        if (displays.length == 1) {
            return displays[0];
        }
        int i3 = -1;
        int i4 = -1;
        Display display = null;
        Display display2 = null;
        for (Display display3 : displays) {
            Point point = new Point();
            display3.getRealSize(point);
            int i5 = point.x * point.y;
            if (i5 > i3) {
                display = display3;
                i3 = i5;
            }
            if (display3.getState() != 1 && (i2 = point.x * point.y) > i4) {
                display2 = display3;
                i4 = i2;
            }
        }
        if (z && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        String string = Arrays.toString(displays);
        string.getClass();
        b61.e(33, string, "No displays found from ");
        return null;
    }

    public final Size c() {
        synchronized (this.c) {
            if (this.f != null) {
                Size size = this.f;
                size.getClass();
                return size;
            }
            this.f = a();
            Size size2 = this.f;
            size2.getClass();
            return size2;
        }
    }
}
