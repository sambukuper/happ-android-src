package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lf0 implements jj0 {
    public final String X;
    public final CameraCharacteristics Y;
    public final hg0 Z;
    public final Set f0;
    public final ArrayMap g0;
    public final ArrayMap h0;
    public final g44 i0;
    public final g44 j0;
    public final g44 k0;

    public lf0(String str, CameraCharacteristics cameraCharacteristics, hg0 hg0Var, Set set) {
        str.getClass();
        set.getClass();
        this.X = str;
        this.Y = cameraCharacteristics;
        this.Z = hg0Var;
        this.f0 = set;
        this.g0 = new ArrayMap();
        this.h0 = new ArrayMap();
        final byte b = 0;
        dn2 dn2Var = new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b2 = b;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b2) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        };
        w74 w74Var = w74.X;
        this.i0 = x97.P(w74Var, dn2Var);
        final byte b2 = 1;
        x97.P(w74Var, new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b3 = b2;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b3) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        });
        final byte b3 = 2;
        x97.P(w74Var, new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b4 = b3;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b4) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        });
        final byte b4 = 3;
        x97.P(w74Var, new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b5 = b4;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b5) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        });
        final byte b5 = 4;
        this.j0 = x97.P(w74Var, new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b6 = b5;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b6) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        });
        final byte b6 = 5;
        x97.P(w74Var, new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b7 = b6;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b7) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        });
        final byte b7 = 6;
        x97.P(w74Var, new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b8 = b7;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b8) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        });
        final byte b8 = 7;
        this.k0 = x97.P(w74Var, new dn2(this) { // from class: kf0
            public final /* synthetic */ lf0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                Set setC1;
                byte b9 = b8;
                List list = d02.X;
                m02 m02Var = m02.X;
                lf0 lf0Var = this.Y;
                switch (b9) {
                    case 0:
                        String str2 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) vi0.b(str2)) + "#supportedExtensions");
                                hg0 hg0Var2 = lf0Var.Z;
                                str2.getClass();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setC1 = wv0.c1(tc.p(hg0Var2.d(str2)));
                                    break;
                                } else {
                                    setC1 = m02Var;
                                }
                                return setC1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused) {
                            vi0.b(str2);
                            return m02Var;
                        }
                    case 1:
                        String str3 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = lf0Var.Y.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused2) {
                            vi0.b(str3);
                            return m02Var;
                        }
                    case 2:
                        String str4 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = lf0Var.Y.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused3) {
                            vi0.b(str4);
                            return m02Var;
                        }
                    case 3:
                        String str5 = lf0Var.X;
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = lf0Var.Y.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused4) {
                            vi0.b(str5);
                            return m02Var;
                        }
                    case 4:
                        String str6 = lf0Var.X;
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) vi0.b(str6)) + "#physicalCameraIds");
                                Set setV = en.v(lf0Var.Y);
                                vi0.b(str6);
                                setV.toString();
                                Set<String> set2 = setV;
                                ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
                                for (String str7 : set2) {
                                    vi0.a(str7);
                                    arrayList.add(new vi0(str7));
                                }
                                return wv0.c1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused5) {
                            vi0.b(str6);
                            return m02Var;
                        } catch (NullPointerException unused6) {
                            vi0.b(str6);
                            return m02Var;
                        }
                    case 5:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availablePhysicalCameraRequestKeys");
                                List listL = en.l(lf0Var.Y);
                                if (listL != null) {
                                    list = listL;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused7) {
                            return m02Var;
                        }
                    case 6:
                        if (Build.VERSION.SDK_INT < 35) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#getAvailableSessionCharacteristicsKeys");
                                List listC = nn.c(lf0Var.Y);
                                if (listC != null) {
                                    list = listC;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused8) {
                            return m02Var;
                        }
                    default:
                        if (Build.VERSION.SDK_INT < 28) {
                            return m02Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + lf0Var.X + "#availableSessionKeys");
                                List listM = en.m(lf0Var.Y);
                                if (listM != null) {
                                    list = listM;
                                }
                                return wv0.c1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError unused9) {
                            return m02Var;
                        }
                }
            }
        });
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(CameraCharacteristics.class))) {
            return this.Y;
        }
        return null;
    }

    public final Object c(CameraCharacteristics.Key key) {
        Object obj;
        if (this.f0.contains(key)) {
            try {
                return this.Y.get(key);
            } catch (AssertionError unused) {
                b61.k("Failed to get characteristic for ", key, ": Framework throw an AssertionError");
                return null;
            }
        }
        synchronized (this.g0) {
            obj = this.g0.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.Y.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.g0) {
                this.g0.put(key, obj2);
            }
            return obj2;
        } catch (AssertionError unused2) {
            b61.k("Failed to get characteristic for ", key, ": Framework throw an AssertionError");
            return null;
        }
    }
}
