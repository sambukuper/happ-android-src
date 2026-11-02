package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class so5 implements ez2 {
    public final View a;

    public so5(View view) {
        this.a = view;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x004b  */
    /* JADX WARN: Code duplicated, block: B:54:0x006d  */
    /* JADX WARN: Code duplicated, block: B:55:0x006f  */
    public final void a(int i) {
        int i2;
        int i3 = 0;
        if (i == 16) {
            i2 = 16;
        } else if (i == 6) {
            i2 = 6;
        } else if (i == 13) {
            i2 = 13;
        } else {
            i2 = 23;
            if (i != 23) {
                i2 = 3;
                if (i != 3) {
                    if (i == 0) {
                        i2 = 0;
                    } else if (i == 17) {
                        i2 = 17;
                    } else if (i == 27) {
                        i2 = 27;
                    } else {
                        i2 = 26;
                        if (i != 26) {
                            if (i == 9) {
                                i2 = 9;
                            } else {
                                i2 = 22;
                                if (i != 22) {
                                    i2 = 21;
                                    if (i != 21) {
                                        i2 = i == 1 ? 1 : -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = cw8.a;
        if (i2 != -1) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 34) {
                switch (i2) {
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    case 23:
                    case 26:
                        i2 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i2 = 4;
                        break;
                    case 25:
                        i2 = 0;
                        break;
                }
            }
            if (i4 >= 30) {
                i3 = i2;
            } else if (i2 == 12) {
                i3 = 1;
            } else if (i2 == 13) {
                i3 = 6;
            } else if (i2 == 16) {
                i3 = 1;
            } else if (i2 != 17) {
                i3 = i2;
            }
            if (i4 < 27 && (i3 == 7 || i3 == 8 || i3 == 9)) {
                i3 = -1;
            }
        } else {
            i3 = -1;
        }
        if (i3 == -1) {
            return;
        }
        this.a.performHapticFeedback(i3);
    }
}
