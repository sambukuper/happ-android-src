package defpackage;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bn0 implements d41 {
    public final /* synthetic */ byte a;

    public /* synthetic */ bn0(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x01da  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x022c  */
    /* JADX WARN: Code duplicated, block: B:136:0x023e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0244  */
    /* JADX WARN: Code duplicated, block: B:140:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0253  */
    /* JADX WARN: Code duplicated, block: B:143:0x0255  */
    /* JADX WARN: Code duplicated, block: B:146:0x025e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0270  */
    /* JADX WARN: Code duplicated, block: B:151:0x027b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0288  */
    /* JADX WARN: Code duplicated, block: B:156:0x0297  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02af  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:174:0x02da  */
    /* JADX WARN: Code duplicated, block: B:177:0x02de  */
    /* JADX WARN: Code duplicated, block: B:179:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:184:0x0304 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0307  */
    /* JADX WARN: Code duplicated, block: B:188:0x0316 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0323  */
    /* JADX WARN: Code duplicated, block: B:196:0x0331  */
    /* JADX WARN: Code duplicated, block: B:214:0x0364  */
    /* JADX WARN: Code duplicated, block: B:217:0x036d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0383  */
    /* JADX WARN: Code duplicated, block: B:223:0x0393  */
    /* JADX WARN: Code duplicated, block: B:225:0x039e  */
    /* JADX WARN: Code duplicated, block: B:227:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:228:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:231:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:234:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:243:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:252:0x0407  */
    /* JADX WARN: Code duplicated, block: B:255:0x0417  */
    /* JADX WARN: Code duplicated, block: B:257:0x0422  */
    /* JADX WARN: Code duplicated, block: B:259:0x043b  */
    /* JADX WARN: Code duplicated, block: B:260:0x043d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0446  */
    /* JADX WARN: Code duplicated, block: B:266:0x0456  */
    /* JADX WARN: Code duplicated, block: B:268:0x0461  */
    /* JADX WARN: Code duplicated, block: B:270:0x0469  */
    /* JADX WARN: Code duplicated, block: B:271:0x046b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0474  */
    /* JADX WARN: Code duplicated, block: B:277:0x0482  */
    /* JADX WARN: Code duplicated, block: B:279:0x048d  */
    /* JADX WARN: Code duplicated, block: B:281:0x049d  */
    /* JADX WARN: Code duplicated, block: B:282:0x049f  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:288:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:291:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:293:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:295:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:296:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:299:0x0506  */
    /* JADX WARN: Code duplicated, block: B:302:0x0517  */
    /* JADX WARN: Code duplicated, block: B:305:0x0527  */
    /* JADX WARN: Code duplicated, block: B:307:0x0532  */
    /* JADX WARN: Code duplicated, block: B:310:0x053b  */
    /* JADX WARN: Code duplicated, block: B:312:0x0541  */
    /* JADX WARN: Code duplicated, block: B:314:0x054c  */
    /* JADX WARN: Code duplicated, block: B:320:0x055f  */
    /* JADX WARN: Code duplicated, block: B:323:0x057c  */
    /* JADX WARN: Code duplicated, block: B:326:0x058e  */
    /* JADX WARN: Code duplicated, block: B:338:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:348:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:81:0x015b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0175  */
    /* JADX WARN: Code duplicated, block: B:95:0x0189  */
    /* JADX WARN: Code duplicated, block: B:98:0x019b  */
    @Override // defpackage.d41
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Set set;
        String lowerCase;
        String lowerCase2;
        boolean z7;
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        String str2;
        boolean z11;
        List list;
        String lowerCase3;
        boolean z12;
        boolean z13;
        String upperCase;
        boolean z14;
        List list2;
        String lowerCase4;
        List list3;
        String lowerCase5;
        boolean z15;
        boolean z16;
        Map map;
        String upperCase2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list4;
        String lowerCase6;
        boolean z17;
        boolean z18;
        List list5;
        String lowerCase7;
        List list6;
        String lowerCase8;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        switch (this.a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                s08.b();
                throw null;
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                s08.b();
                throw null;
            case 2:
                s08.b();
                return;
            case 3:
                g26 g26Var = (g26) obj;
                ArrayList arrayList = new ArrayList();
                String str20 = Build.BRAND;
                if (g26Var.a(ImageCaptureRotationOptionQuirk.class, ("HUAWEI".equalsIgnoreCase(str20) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str20) && "STK-LX1".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList.add(new ImageCaptureRotationOptionQuirk());
                }
                if (g26Var.a(SurfaceOrderQuirk.class, true)) {
                    arrayList.add(new SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.a;
                Locale locale = Locale.US;
                String upperCase3 = str20.toUpperCase(locale);
                String str21 = Build.MODEL;
                if (g26Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.a.contains(Pair.create(upperCase3, str21.toUpperCase(locale))))) {
                    arrayList.add(new CaptureFailedRetryQuirk());
                }
                if (g26Var.a(LowMemoryQuirk.class, LowMemoryQuirk.a.contains(str21.toUpperCase(locale)))) {
                    arrayList.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.a;
                if (g26Var.a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str20) || ("Vivo".equalsIgnoreCase(str20) && LargeJpegImageQuirk.a.contains(str21.toUpperCase(locale))))) {
                    arrayList.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.a;
                if (g26Var.a(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str20) && IncorrectJpegMetadataQuirk.a.contains(Build.DEVICE.toUpperCase(locale)))) {
                    arrayList.add(new IncorrectJpegMetadataQuirk());
                }
                HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.a;
                if (g26Var.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str20) && "cph2583".equalsIgnoreCase(str21)) || ("google".equalsIgnoreCase(str20) && ImageCaptureFailedForSpecificCombinationQuirk.a.contains(str21.toLowerCase())))) {
                    arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
                }
                PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.a;
                if (g26Var.a(PreviewGreenTintQuirk.class, "motorola".equalsIgnoreCase(str20) && "moto e20".equalsIgnoreCase(str21))) {
                    arrayList.add(previewGreenTintQuirk);
                }
                sm1.a = new i26(arrayList);
                i26.d(sm1.a);
                hi5.z0("DeviceQuirks");
                return;
            case 4:
                g26 g26Var2 = (g26) obj;
                ArrayList arrayList2 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str22 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str22)) {
                        String str23 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str23) && !"Q2Q".equalsIgnoreCase(str23)) {
                            if (("OPPO".equalsIgnoreCase(str22) || !"OP4E75L1".equalsIgnoreCase(Build.DEVICE)) && (!"LENOVO".equalsIgnoreCase(str22) || !"Q706F".equalsIgnoreCase(Build.DEVICE))) {
                                z = false;
                            }
                        }
                        z = true;
                    } else if ("OPPO".equalsIgnoreCase(str22)) {
                        z = false;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (g26Var2.a(SurfaceViewStretchedQuirk.class, z)) {
                    arrayList2.add(new SurfaceViewStretchedQuirk());
                }
                if (g26Var2.a(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                tm1.a = new i26(arrayList2);
                i26.d(tm1.a);
                hi5.z0("DeviceQuirks");
                return;
            case 5:
                ui7 ui7Var = ui7.X;
                g26 g26Var3 = (g26) obj;
                g26Var3.getClass();
                ArrayList arrayList3 = new ArrayList();
                int i = PixelJpegRSupportedQuirk.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    a10 a10Var = (a10) BackportedFixQuirk.a.getValue();
                    vz3 vz3Var = wz3.a;
                    a10Var.getClass();
                    vz3Var.getClass();
                    if (!((Boolean) vz3Var.d.invoke()).booleanValue()) {
                        ui7Var = ui7.Y;
                    } else if (!vz3Var.c.contains(Build.FINGERPRINT) && !((Set) ((vz7) a10Var.a.X).getValue()).contains(5)) {
                        ui7Var = ui7.Z;
                    }
                    int iOrdinal = ui7Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            z2 = false;
                        } else if (iOrdinal != 3) {
                            b61.c();
                            return;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (g26Var3.a(PixelJpegRSupportedQuirk.class, z2)) {
                    arrayList3.add(new PixelJpegRSupportedQuirk());
                }
                if (CloseCameraDeviceOnCameraGraphCloseQuirk.a || CloseCameraDeviceOnCameraGraphCloseQuirk.b || (30 <= i2 && i2 < 34 && (tc.q("Oppo") || tc.q("OnePlus") || tc.q("Realme")))) {
                    z3 = true;
                } else {
                    String str24 = Build.MANUFACTURER;
                    str24.getClass();
                    if (str24.equalsIgnoreCase("Vivo")) {
                        z3 = true;
                    } else {
                        String str25 = Build.BRAND;
                        str25.getClass();
                        if (str25.equalsIgnoreCase("Vivo") || CloseCameraDeviceOnCameraGraphCloseQuirk.c || CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                }
                if (g26Var3.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z3)) {
                    arrayList3.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
                }
                List list7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a;
                String str26 = Build.MODEL;
                str26.getClass();
                Locale locale2 = Locale.ROOT;
                String upperCase4 = str26.toUpperCase(locale2);
                upperCase4.getClass();
                if (g26Var3.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list7.contains(upperCase4))) {
                    arrayList3.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                }
                String str27 = Build.MANUFACTURER;
                str27.getClass();
                if (str27.equalsIgnoreCase("Jio")) {
                    if (mm7.Z(str26, true, "LS1542QW")) {
                        if (!str27.equalsIgnoreCase("Samsung")) {
                            str19 = Build.BRAND;
                            str19.getClass();
                            if (!str19.equalsIgnoreCase("Samsung")) {
                                if (!str27.equalsIgnoreCase("Vivo")) {
                                    str18 = Build.BRAND;
                                    str18.getClass();
                                    if (str18.equalsIgnoreCase("Vivo")) {
                                        if (str26.equalsIgnoreCase("VIVO 2039")) {
                                        }
                                    }
                                } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                                }
                                z4 = false;
                            } else if (mm7.Z(str26, true, "SM-A025")) {
                            }
                        } else if (mm7.Z(str26, true, "SM-A025")) {
                        }
                    }
                    if (g26Var3.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z4)) {
                        arrayList3.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                    }
                    boolean z19 = DisableAbortCapturesOnStopQuirk.a;
                    if (str27.equalsIgnoreCase("Tecno")) {
                        z5 = true;
                    } else {
                        str17 = Build.BRAND;
                        str17.getClass();
                        if (!str17.equalsIgnoreCase("Tecno")) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    if (g26Var3.a(DisableAbortCapturesOnStopQuirk.class, z5)) {
                        arrayList3.add(new DisableAbortCapturesOnStopQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        z6 = true;
                    } else {
                        str16 = Build.BRAND;
                        str16.getClass();
                        if (!str16.equalsIgnoreCase("Samsung")) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    if (g26Var3.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z6)) {
                        arrayList3.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                    }
                    set = FlashAvailabilityBufferUnderflowQuirk.a;
                    Locale locale3 = Locale.US;
                    locale3.getClass();
                    lowerCase = str27.toLowerCase(locale3);
                    lowerCase.getClass();
                    lowerCase2 = str26.toLowerCase(locale3);
                    lowerCase2.getClass();
                    if (g26Var3.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new nd2(lowerCase, lowerCase2)))) {
                        arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                    }
                    if (!ImageCapturePixelHDRPlusQuirk.a.contains(str26)) {
                        z7 = false;
                    } else if (!str27.equalsIgnoreCase("Google")) {
                        str15 = Build.BRAND;
                        str15.getClass();
                        if (!str15.equalsIgnoreCase("Google")) {
                            z7 = false;
                        } else if (i2 >= 26) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else if (i2 >= 26) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (g26Var3.a(ImageCapturePixelHDRPlusQuirk.class, z7)) {
                        arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                    }
                    List list8 = InvalidVideoProfilesQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str = Build.ID;
                        str.getClass();
                        if (mm7.Z(str, true, "TP1A")) {
                            list4 = InvalidVideoProfilesQuirk.a;
                            lowerCase6 = str26.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!mm7.Z(str13, true, "TP1A")) {
                                    str13.getClass();
                                    if (!mm7.Z(str13, true, "TD1A")) {
                                        if (str27.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        }
                                        if (str27.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        }
                                        if (z17 || z18) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!mm7.Z(str10, true, "TKQ1")) {
                                                str10.getClass();
                                                if (mm7.Z(str10, true, "TP1A")) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str26.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        list6 = InvalidVideoProfilesQuirk.b;
                                                        lowerCase8 = str26.toLowerCase(locale2);
                                                        lowerCase8.getClass();
                                                        if (list6.contains(lowerCase8)) {
                                                        }
                                                        z8 = false;
                                                    } else {
                                                        list6 = InvalidVideoProfilesQuirk.b;
                                                        lowerCase8 = str26.toLowerCase(locale2);
                                                        lowerCase8.getClass();
                                                        if (list6.contains(lowerCase8)) {
                                                        }
                                                        z8 = false;
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            } else {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!mm7.Z(str10, true, "TKQ1")) {
                                        str10.getClass();
                                        if (mm7.Z(str10, true, "TP1A")) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            } else {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    } else {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    }
                                }
                            }
                        }
                        if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                            arrayList3.add(new InvalidVideoProfilesQuirk());
                        }
                        if (km4.T()) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                            arrayList3.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
                        if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                            arrayList3.add(new ExtraCroppingQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z10 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                            arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        nx7 nx7Var = ExtraSupportedSurfaceCombinationsQuirk.a;
                        str2 = Build.DEVICE;
                        if ("heroqltevzw".equalsIgnoreCase(str2)) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                            arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        int i3 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                        if (!str27.equalsIgnoreCase("Google")) {
                            String str28 = Build.BRAND;
                            str28.getClass();
                            str28.equalsIgnoreCase("Google");
                        }
                        if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list9 = PreviewPixelHDRnetQuirk.a;
                        if (str27.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale4 = Locale.getDefault();
                            locale4.getClass();
                            lowerCase3 = str2.toLowerCase(locale4);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.a;
                                str2.getClass();
                                Locale locale5 = Locale.getDefault();
                                locale5.getClass();
                                lowerCase3 = str2.toLowerCase(locale5);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                z12 = false;
                            }
                        }
                        if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                            arrayList3.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z13 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str26)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                            arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str27.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (mm7.Z(upperCase, false, "SM-A716")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str26.toUpperCase(locale2);
                                upperCase.getClass();
                                if (mm7.Z(upperCase, false, "SM-A716")) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        }
                        if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                            arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                        lowerCase4 = str26.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list10 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        if (str27.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str29 = Build.HARDWARE;
                            str29.getClass();
                            Locale locale6 = Locale.getDefault();
                            locale6.getClass();
                            lowerCase5 = str29.toLowerCase(locale6);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                                String str210 = Build.HARDWARE;
                                str210.getClass();
                                Locale locale7 = Locale.getDefault();
                                locale7.getClass();
                                lowerCase5 = str210.toLowerCase(locale7);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        }
                        if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                            arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list11 = ZslDisablerQuirk.a;
                        if (str27.equalsIgnoreCase("Samsung")) {
                            if (a38.c(ZslDisablerQuirk.a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (a38.c(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (a38.c(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.a);
                            }
                            um1.a = new i26(arrayList3);
                            i26.d(um1.a());
                            hi5.z0("DeviceQuirks");
                            return;
                        }
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (!str4.equalsIgnoreCase("Samsung")) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (a38.c(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (a38.c(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        } else if (a38.c(ZslDisablerQuirk.a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (a38.c(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (a38.c(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.a);
                        }
                        um1.a = new i26(arrayList3);
                        i26.d(um1.a());
                        hi5.z0("DeviceQuirks");
                        return;
                        z16 = true;
                        if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.a);
                        }
                        um1.a = new i26(arrayList3);
                        i26.d(um1.a());
                        hi5.z0("DeviceQuirks");
                        return;
                    }
                    str14 = Build.BRAND;
                    str14.getClass();
                    if (str14.equalsIgnoreCase("Samsung")) {
                        str = Build.ID;
                        str.getClass();
                        if (mm7.Z(str, true, "TP1A")) {
                            list4 = InvalidVideoProfilesQuirk.a;
                            lowerCase6 = str26.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!mm7.Z(str13, true, "TP1A")) {
                                    str13.getClass();
                                    if (!mm7.Z(str13, true, "TD1A")) {
                                        if (str27.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                        if (str27.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        } else {
                                            z18 = true;
                                        }
                                        if (z17 || z18) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!mm7.Z(str10, true, "TKQ1")) {
                                                str10.getClass();
                                                if (mm7.Z(str10, true, "TP1A")) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str26.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        list6 = InvalidVideoProfilesQuirk.b;
                                                        lowerCase8 = str26.toLowerCase(locale2);
                                                        lowerCase8.getClass();
                                                        if (list6.contains(lowerCase8)) {
                                                        }
                                                        z8 = false;
                                                    } else {
                                                        list6 = InvalidVideoProfilesQuirk.b;
                                                        lowerCase8 = str26.toLowerCase(locale2);
                                                        lowerCase8.getClass();
                                                        if (list6.contains(lowerCase8)) {
                                                        }
                                                        z8 = false;
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            } else {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!mm7.Z(str10, true, "TKQ1")) {
                                        str10.getClass();
                                        if (mm7.Z(str10, true, "TP1A")) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            } else {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    } else {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    }
                                }
                            }
                        }
                    } else {
                        list4 = InvalidVideoProfilesQuirk.a;
                        lowerCase6 = str26.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!mm7.Z(str13, true, "TP1A")) {
                                str13.getClass();
                                if (!mm7.Z(str13, true, "TD1A")) {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!mm7.Z(str10, true, "TKQ1")) {
                                            str10.getClass();
                                            if (mm7.Z(str10, true, "TP1A")) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                } else {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str27.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else {
                                z18 = true;
                            }
                            if (z17 || z18) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!mm7.Z(str10, true, "TKQ1")) {
                                    str10.getClass();
                                    if (mm7.Z(str10, true, "TP1A")) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str26.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                } else {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                }
                            }
                        }
                    }
                    if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (km4.T()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap2 = ExtraCroppingQuirk.a;
                    if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    nx7 nx7Var2 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i4 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str211 = Build.BRAND;
                        str211.getClass();
                        str211.equalsIgnoreCase("Google");
                    }
                    if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list12 = PreviewPixelHDRnetQuirk.a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale8 = Locale.getDefault();
                            locale8.getClass();
                            lowerCase3 = str2.toLowerCase(locale8);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale9 = Locale.getDefault();
                        locale9.getClass();
                        lowerCase3 = str2.toLowerCase(locale9);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (mm7.Z(upperCase, false, "SM-A716")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list13 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str212 = Build.HARDWARE;
                            str212.getClass();
                            Locale locale10 = Locale.getDefault();
                            locale10.getClass();
                            lowerCase5 = str212.toLowerCase(locale10);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str213 = Build.HARDWARE;
                        str213.getClass();
                        Locale locale11 = Locale.getDefault();
                        locale11.getClass();
                        lowerCase5 = str213.toLowerCase(locale11);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list14 = ZslDisablerQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        if (a38.c(ZslDisablerQuirk.a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (a38.c(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (a38.c(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.a);
                        }
                        um1.a = new i26(arrayList3);
                        i26.d(um1.a());
                        hi5.z0("DeviceQuirks");
                        return;
                    }
                    str4 = Build.BRAND;
                    str4.getClass();
                    if (!str4.equalsIgnoreCase("Samsung")) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    } else if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                    z16 = true;
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                    z8 = true;
                    if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (km4.T()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap3 = ExtraCroppingQuirk.a;
                    if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    nx7 nx7Var3 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i5 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str214 = Build.BRAND;
                        str214.getClass();
                        str214.equalsIgnoreCase("Google");
                    }
                    if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list15 = PreviewPixelHDRnetQuirk.a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale12 = Locale.getDefault();
                            locale12.getClass();
                            lowerCase3 = str2.toLowerCase(locale12);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale13 = Locale.getDefault();
                        locale13.getClass();
                        lowerCase3 = str2.toLowerCase(locale13);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (mm7.Z(upperCase, false, "SM-A716")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list16 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str215 = Build.HARDWARE;
                            str215.getClass();
                            Locale locale14 = Locale.getDefault();
                            locale14.getClass();
                            lowerCase5 = str215.toLowerCase(locale14);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str216 = Build.HARDWARE;
                        str216.getClass();
                        Locale locale15 = Locale.getDefault();
                        locale15.getClass();
                        lowerCase5 = str216.toLowerCase(locale15);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list17 = ZslDisablerQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        if (a38.c(ZslDisablerQuirk.a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (a38.c(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (a38.c(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.a);
                        }
                        um1.a = new i26(arrayList3);
                        i26.d(um1.a());
                        hi5.z0("DeviceQuirks");
                        return;
                    }
                    str4 = Build.BRAND;
                    str4.getClass();
                    if (!str4.equalsIgnoreCase("Samsung")) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    } else if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                    z16 = true;
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                }
                String str30 = Build.BRAND;
                str30.getClass();
                if (str30.equalsIgnoreCase("Jio")) {
                    if (mm7.Z(str26, true, "LS1542QW")) {
                        if (!str27.equalsIgnoreCase("Samsung")) {
                            str19 = Build.BRAND;
                            str19.getClass();
                            if (!str19.equalsIgnoreCase("Samsung")) {
                                if (!str27.equalsIgnoreCase("Vivo")) {
                                    str18 = Build.BRAND;
                                    str18.getClass();
                                    if (str18.equalsIgnoreCase("Vivo")) {
                                        if (str26.equalsIgnoreCase("VIVO 2039")) {
                                        }
                                    }
                                } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                                }
                                z4 = false;
                            } else if (mm7.Z(str26, true, "SM-A025") && !str26.equalsIgnoreCase("SM-S124DL")) {
                                if (!str27.equalsIgnoreCase("Vivo")) {
                                    str18 = Build.BRAND;
                                    str18.getClass();
                                    if (str18.equalsIgnoreCase("Vivo")) {
                                        if (str26.equalsIgnoreCase("VIVO 2039")) {
                                        }
                                    }
                                } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                                }
                                z4 = false;
                            }
                        } else if (mm7.Z(str26, true, "SM-A025")) {
                        }
                    }
                } else if (!str27.equalsIgnoreCase("Samsung")) {
                    str19 = Build.BRAND;
                    str19.getClass();
                    if (!str19.equalsIgnoreCase("Samsung")) {
                        if (!str27.equalsIgnoreCase("Vivo")) {
                            str18 = Build.BRAND;
                            str18.getClass();
                            if (str18.equalsIgnoreCase("Vivo")) {
                                if (str26.equalsIgnoreCase("VIVO 2039")) {
                                }
                            }
                        } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                        }
                        z4 = false;
                    } else if (mm7.Z(str26, true, "SM-A025")) {
                    }
                } else if (mm7.Z(str26, true, "SM-A025")) {
                }
                if (g26Var3.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z4)) {
                    arrayList3.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                }
                boolean z110 = DisableAbortCapturesOnStopQuirk.a;
                if (str27.equalsIgnoreCase("Tecno")) {
                    str17 = Build.BRAND;
                    str17.getClass();
                    if (!str17.equalsIgnoreCase("Tecno") || str27.equalsIgnoreCase("Tecno-mobile") || str17.equalsIgnoreCase("Tecno-mobile") || DisableAbortCapturesOnStopQuirk.a || DisableAbortCapturesOnStopQuirk.b) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = true;
                }
                if (g26Var3.a(DisableAbortCapturesOnStopQuirk.class, z5)) {
                    arrayList3.add(new DisableAbortCapturesOnStopQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str16 = Build.BRAND;
                    str16.getClass();
                    if (!str16.equalsIgnoreCase("Samsung") || str27.equalsIgnoreCase("Xiaomi") || str16.equalsIgnoreCase("Xiaomi")) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = true;
                }
                if (g26Var3.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z6)) {
                    arrayList3.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                }
                set = FlashAvailabilityBufferUnderflowQuirk.a;
                Locale locale16 = Locale.US;
                locale16.getClass();
                lowerCase = str27.toLowerCase(locale16);
                lowerCase.getClass();
                lowerCase2 = str26.toLowerCase(locale16);
                lowerCase2.getClass();
                if (g26Var3.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new nd2(lowerCase, lowerCase2)))) {
                    arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                }
                if (!ImageCapturePixelHDRPlusQuirk.a.contains(str26)) {
                    z7 = false;
                } else if (!str27.equalsIgnoreCase("Google")) {
                    str15 = Build.BRAND;
                    str15.getClass();
                    if (!str15.equalsIgnoreCase("Google")) {
                        z7 = false;
                    } else if (i2 >= 26) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else if (i2 >= 26) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (g26Var3.a(ImageCapturePixelHDRPlusQuirk.class, z7)) {
                    arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                }
                List list18 = InvalidVideoProfilesQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    str = Build.ID;
                    str.getClass();
                    if (mm7.Z(str, true, "TP1A")) {
                        list4 = InvalidVideoProfilesQuirk.a;
                        lowerCase6 = str26.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!mm7.Z(str13, true, "TP1A")) {
                                str13.getClass();
                                if (!mm7.Z(str13, true, "TD1A")) {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!mm7.Z(str10, true, "TKQ1")) {
                                            str10.getClass();
                                            if (mm7.Z(str10, true, "TP1A")) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                } else {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str27.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else {
                                z18 = true;
                            }
                            if (z17 || z18) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!mm7.Z(str10, true, "TKQ1")) {
                                    str10.getClass();
                                    if (mm7.Z(str10, true, "TP1A")) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str26.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                } else {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                }
                            }
                        }
                    }
                    if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (km4.T()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap4 = ExtraCroppingQuirk.a;
                    if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    nx7 nx7Var4 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i6 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str217 = Build.BRAND;
                        str217.getClass();
                        str217.equalsIgnoreCase("Google");
                    }
                    if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list19 = PreviewPixelHDRnetQuirk.a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale17 = Locale.getDefault();
                            locale17.getClass();
                            lowerCase3 = str2.toLowerCase(locale17);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale18 = Locale.getDefault();
                        locale18.getClass();
                        lowerCase3 = str2.toLowerCase(locale18);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (mm7.Z(upperCase, false, "SM-A716")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list110 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str218 = Build.HARDWARE;
                            str218.getClass();
                            Locale locale19 = Locale.getDefault();
                            locale19.getClass();
                            lowerCase5 = str218.toLowerCase(locale19);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str219 = Build.HARDWARE;
                        str219.getClass();
                        Locale locale110 = Locale.getDefault();
                        locale110.getClass();
                        lowerCase5 = str219.toLowerCase(locale110);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list111 = ZslDisablerQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        if (a38.c(ZslDisablerQuirk.a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (a38.c(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (a38.c(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.a);
                        }
                        um1.a = new i26(arrayList3);
                        i26.d(um1.a());
                        hi5.z0("DeviceQuirks");
                        return;
                    }
                    str4 = Build.BRAND;
                    str4.getClass();
                    if (!str4.equalsIgnoreCase("Samsung")) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    } else if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                    z16 = true;
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                }
                str14 = Build.BRAND;
                str14.getClass();
                if (str14.equalsIgnoreCase("Samsung")) {
                    str = Build.ID;
                    str.getClass();
                    if (mm7.Z(str, true, "TP1A")) {
                        list4 = InvalidVideoProfilesQuirk.a;
                        lowerCase6 = str26.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!mm7.Z(str13, true, "TP1A")) {
                                str13.getClass();
                                if (!mm7.Z(str13, true, "TD1A")) {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!mm7.Z(str10, true, "TKQ1")) {
                                            str10.getClass();
                                            if (mm7.Z(str10, true, "TP1A")) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7) || i2 != 33) {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8) || i2 != 33) {
                                                        z8 = false;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str27.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else {
                                z18 = true;
                            }
                            if (z17 || z18) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!mm7.Z(str10, true, "TKQ1")) {
                                    str10.getClass();
                                    if (mm7.Z(str10, true, "TP1A")) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str26.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                } else {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                }
                            }
                        }
                    }
                } else {
                    list4 = InvalidVideoProfilesQuirk.a;
                    lowerCase6 = str26.toLowerCase(locale2);
                    lowerCase6.getClass();
                    if (list4.contains(lowerCase6)) {
                        str13 = Build.ID;
                        str13.getClass();
                        if (!mm7.Z(str13, true, "TP1A")) {
                            str13.getClass();
                            if (!mm7.Z(str13, true, "TD1A")) {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!mm7.Z(str10, true, "TKQ1")) {
                                        str10.getClass();
                                        if (mm7.Z(str10, true, "TP1A")) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            } else {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    } else {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    }
                                }
                            }
                        }
                    } else {
                        if (str27.equalsIgnoreCase("Redmi")) {
                            str12 = Build.BRAND;
                            str12.getClass();
                            if (str12.equalsIgnoreCase("Redmi")) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        } else {
                            z17 = true;
                        }
                        if (str27.equalsIgnoreCase("Xiaomi")) {
                            str11 = Build.BRAND;
                            str11.getClass();
                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        } else {
                            z18 = true;
                        }
                        if (z17 || z18) {
                            str10 = Build.ID;
                            str10.getClass();
                            if (!mm7.Z(str10, true, "TKQ1")) {
                                str10.getClass();
                                if (mm7.Z(str10, true, "TP1A")) {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    } else {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    }
                                }
                            }
                        } else {
                            list5 = InvalidVideoProfilesQuirk.c;
                            lowerCase7 = str26.toLowerCase(locale2);
                            lowerCase7.getClass();
                            if (list5.contains(lowerCase7)) {
                                list6 = InvalidVideoProfilesQuirk.b;
                                lowerCase8 = str26.toLowerCase(locale2);
                                lowerCase8.getClass();
                                if (list6.contains(lowerCase8)) {
                                }
                                z8 = false;
                            } else {
                                list6 = InvalidVideoProfilesQuirk.b;
                                lowerCase8 = str26.toLowerCase(locale2);
                                lowerCase8.getClass();
                                if (list6.contains(lowerCase8)) {
                                }
                                z8 = false;
                            }
                        }
                    }
                }
                if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                    arrayList3.add(new InvalidVideoProfilesQuirk());
                }
                if (km4.T() || km4.U() || km4.Q() || km4.Y() || km4.X() || km4.V() || km4.W() || km4.S() || km4.Z()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                    arrayList3.add(new ExcludedSupportedSizesQuirk());
                }
                LinkedHashMap linkedHashMap5 = ExtraCroppingQuirk.a;
                if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                    arrayList3.add(new ExtraCroppingQuirk());
                }
                if (!str27.equalsIgnoreCase("Motorola")) {
                    str9 = Build.BRAND;
                    str9.getClass();
                    if (!str9.equalsIgnoreCase("Motorola")) {
                        z10 = false;
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                    arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                }
                nx7 nx7Var5 = ExtraSupportedSurfaceCombinationsQuirk.a;
                str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2) || wl7.W() || wl7.X()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                    arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                int i7 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                if (!str27.equalsIgnoreCase("Google")) {
                    String str2110 = Build.BRAND;
                    str2110.getClass();
                    str2110.equalsIgnoreCase("Google");
                }
                if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                List list112 = PreviewPixelHDRnetQuirk.a;
                if (str27.equalsIgnoreCase("Google")) {
                    str8 = Build.BRAND;
                    str8.getClass();
                    if (str8.equalsIgnoreCase("Google")) {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale111 = Locale.getDefault();
                        locale111.getClass();
                        lowerCase3 = str2.toLowerCase(locale111);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    list = PreviewPixelHDRnetQuirk.a;
                    str2.getClass();
                    Locale locale112 = Locale.getDefault();
                    locale112.getClass();
                    lowerCase3 = str2.toLowerCase(locale112);
                    lowerCase3.getClass();
                    if (list.contains(lowerCase3)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                    arrayList3.add(new PreviewPixelHDRnetQuirk());
                }
                if (!str27.equalsIgnoreCase("Huawei")) {
                    str7 = Build.BRAND;
                    str7.getClass();
                    if (!str7.equalsIgnoreCase("Huawei")) {
                        z13 = false;
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else if ("mha-l29".equalsIgnoreCase(str26)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                    arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str6 = Build.BRAND;
                    str6.getClass();
                    if (str6.equalsIgnoreCase("Samsung")) {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    upperCase = str26.toUpperCase(locale2);
                    upperCase.getClass();
                    if (mm7.Z(upperCase, false, "SM-A716")) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                    arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                lowerCase4 = str26.toLowerCase(locale2);
                lowerCase4.getClass();
                if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                    arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list113 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    str5 = Build.BRAND;
                    str5.getClass();
                    if (str5.equalsIgnoreCase("Samsung")) {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str2111 = Build.HARDWARE;
                        str2111.getClass();
                        Locale locale113 = Locale.getDefault();
                        locale113.getClass();
                        lowerCase5 = str2111.toLowerCase(locale113);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                } else {
                    list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    String str2112 = Build.HARDWARE;
                    str2112.getClass();
                    Locale locale114 = Locale.getDefault();
                    locale114.getClass();
                    lowerCase5 = str2112.toLowerCase(locale114);
                    lowerCase5.getClass();
                    if (list3.contains(lowerCase5)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                    arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                }
                if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                List list114 = ZslDisablerQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                }
                str4 = Build.BRAND;
                str4.getClass();
                if (!str4.equalsIgnoreCase("Samsung")) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                } else if (a38.c(ZslDisablerQuirk.a)) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                }
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
                z16 = true;
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
                z8 = true;
                if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                    arrayList3.add(new InvalidVideoProfilesQuirk());
                }
                if (km4.T()) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                    arrayList3.add(new ExcludedSupportedSizesQuirk());
                }
                LinkedHashMap linkedHashMap6 = ExtraCroppingQuirk.a;
                if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                    arrayList3.add(new ExtraCroppingQuirk());
                }
                if (!str27.equalsIgnoreCase("Motorola")) {
                    str9 = Build.BRAND;
                    str9.getClass();
                    if (!str9.equalsIgnoreCase("Motorola")) {
                        z10 = false;
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                    arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                }
                nx7 nx7Var6 = ExtraSupportedSurfaceCombinationsQuirk.a;
                str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2)) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                    arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                int i8 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                if (!str27.equalsIgnoreCase("Google")) {
                    String str2113 = Build.BRAND;
                    str2113.getClass();
                    str2113.equalsIgnoreCase("Google");
                }
                if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                List list115 = PreviewPixelHDRnetQuirk.a;
                if (str27.equalsIgnoreCase("Google")) {
                    str8 = Build.BRAND;
                    str8.getClass();
                    if (str8.equalsIgnoreCase("Google")) {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale115 = Locale.getDefault();
                        locale115.getClass();
                        lowerCase3 = str2.toLowerCase(locale115);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    list = PreviewPixelHDRnetQuirk.a;
                    str2.getClass();
                    Locale locale116 = Locale.getDefault();
                    locale116.getClass();
                    lowerCase3 = str2.toLowerCase(locale116);
                    lowerCase3.getClass();
                    if (list.contains(lowerCase3)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                    arrayList3.add(new PreviewPixelHDRnetQuirk());
                }
                if (!str27.equalsIgnoreCase("Huawei")) {
                    str7 = Build.BRAND;
                    str7.getClass();
                    if (!str7.equalsIgnoreCase("Huawei")) {
                        z13 = false;
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else if ("mha-l29".equalsIgnoreCase(str26)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                    arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str6 = Build.BRAND;
                    str6.getClass();
                    if (str6.equalsIgnoreCase("Samsung")) {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    upperCase = str26.toUpperCase(locale2);
                    upperCase.getClass();
                    if (mm7.Z(upperCase, false, "SM-A716")) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                    arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                lowerCase4 = str26.toLowerCase(locale2);
                lowerCase4.getClass();
                if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                    arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list116 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    str5 = Build.BRAND;
                    str5.getClass();
                    if (str5.equalsIgnoreCase("Samsung")) {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str2114 = Build.HARDWARE;
                        str2114.getClass();
                        Locale locale117 = Locale.getDefault();
                        locale117.getClass();
                        lowerCase5 = str2114.toLowerCase(locale117);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                } else {
                    list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    String str2115 = Build.HARDWARE;
                    str2115.getClass();
                    Locale locale118 = Locale.getDefault();
                    locale118.getClass();
                    lowerCase5 = str2115.toLowerCase(locale118);
                    lowerCase5.getClass();
                    if (list3.contains(lowerCase5)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                    arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                }
                if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                List list117 = ZslDisablerQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                }
                str4 = Build.BRAND;
                str4.getClass();
                if (!str4.equalsIgnoreCase("Samsung")) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                } else if (a38.c(ZslDisablerQuirk.a)) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                }
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
                z16 = true;
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
                z4 = true;
                if (g26Var3.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z4)) {
                    arrayList3.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                }
                boolean z111 = DisableAbortCapturesOnStopQuirk.a;
                if (str27.equalsIgnoreCase("Tecno")) {
                    str17 = Build.BRAND;
                    str17.getClass();
                    if (!str17.equalsIgnoreCase("Tecno")) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = true;
                }
                if (g26Var3.a(DisableAbortCapturesOnStopQuirk.class, z5)) {
                    arrayList3.add(new DisableAbortCapturesOnStopQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str16 = Build.BRAND;
                    str16.getClass();
                    if (!str16.equalsIgnoreCase("Samsung")) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = true;
                }
                if (g26Var3.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z6)) {
                    arrayList3.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                }
                set = FlashAvailabilityBufferUnderflowQuirk.a;
                Locale locale119 = Locale.US;
                locale119.getClass();
                lowerCase = str27.toLowerCase(locale119);
                lowerCase.getClass();
                lowerCase2 = str26.toLowerCase(locale119);
                lowerCase2.getClass();
                if (g26Var3.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new nd2(lowerCase, lowerCase2)))) {
                    arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                }
                if (!ImageCapturePixelHDRPlusQuirk.a.contains(str26)) {
                    z7 = false;
                } else if (!str27.equalsIgnoreCase("Google")) {
                    str15 = Build.BRAND;
                    str15.getClass();
                    if (!str15.equalsIgnoreCase("Google")) {
                        z7 = false;
                    } else if (i2 >= 26) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else if (i2 >= 26) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (g26Var3.a(ImageCapturePixelHDRPlusQuirk.class, z7)) {
                    arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                }
                List list118 = InvalidVideoProfilesQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    str = Build.ID;
                    str.getClass();
                    if (mm7.Z(str, true, "TP1A")) {
                        list4 = InvalidVideoProfilesQuirk.a;
                        lowerCase6 = str26.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!mm7.Z(str13, true, "TP1A")) {
                                str13.getClass();
                                if (!mm7.Z(str13, true, "TD1A")) {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!mm7.Z(str10, true, "TKQ1")) {
                                            str10.getClass();
                                            if (mm7.Z(str10, true, "TP1A")) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                } else {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str27.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else {
                                z18 = true;
                            }
                            if (z17 || z18) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!mm7.Z(str10, true, "TKQ1")) {
                                    str10.getClass();
                                    if (mm7.Z(str10, true, "TP1A")) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str26.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                } else {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                }
                            }
                        }
                    }
                    if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (km4.T()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap7 = ExtraCroppingQuirk.a;
                    if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    nx7 nx7Var7 = ExtraSupportedSurfaceCombinationsQuirk.a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    int i9 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str2116 = Build.BRAND;
                        str2116.getClass();
                        str2116.equalsIgnoreCase("Google");
                    }
                    if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list119 = PreviewPixelHDRnetQuirk.a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.a;
                            str2.getClass();
                            Locale locale1110 = Locale.getDefault();
                            locale1110.getClass();
                            lowerCase3 = str2.toLowerCase(locale1110);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale1111 = Locale.getDefault();
                        locale1111.getClass();
                        lowerCase3 = str2.toLowerCase(locale1111);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (mm7.Z(upperCase, false, "SM-A716")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list1110 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                            String str2117 = Build.HARDWARE;
                            str2117.getClass();
                            Locale locale1112 = Locale.getDefault();
                            locale1112.getClass();
                            lowerCase5 = str2117.toLowerCase(locale1112);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str2118 = Build.HARDWARE;
                        str2118.getClass();
                        Locale locale1113 = Locale.getDefault();
                        locale1113.getClass();
                        lowerCase5 = str2118.toLowerCase(locale1113);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list1111 = ZslDisablerQuirk.a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        if (a38.c(ZslDisablerQuirk.a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (a38.c(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (a38.c(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.a);
                        }
                        um1.a = new i26(arrayList3);
                        i26.d(um1.a());
                        hi5.z0("DeviceQuirks");
                        return;
                    }
                    str4 = Build.BRAND;
                    str4.getClass();
                    if (!str4.equalsIgnoreCase("Samsung")) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    } else if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                    z16 = true;
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                }
                str14 = Build.BRAND;
                str14.getClass();
                if (str14.equalsIgnoreCase("Samsung")) {
                    str = Build.ID;
                    str.getClass();
                    if (mm7.Z(str, true, "TP1A")) {
                        list4 = InvalidVideoProfilesQuirk.a;
                        lowerCase6 = str26.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!mm7.Z(str13, true, "TP1A")) {
                                str13.getClass();
                                if (!mm7.Z(str13, true, "TD1A")) {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!mm7.Z(str10, true, "TKQ1")) {
                                            str10.getClass();
                                            if (mm7.Z(str10, true, "TP1A")) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                } else {
                                                    list6 = InvalidVideoProfilesQuirk.b;
                                                    lowerCase8 = str26.toLowerCase(locale2);
                                                    lowerCase8.getClass();
                                                    if (list6.contains(lowerCase8)) {
                                                    }
                                                    z8 = false;
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str27.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else {
                                z18 = true;
                            }
                            if (z17 || z18) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!mm7.Z(str10, true, "TKQ1")) {
                                    str10.getClass();
                                    if (mm7.Z(str10, true, "TP1A")) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        } else {
                                            list6 = InvalidVideoProfilesQuirk.b;
                                            lowerCase8 = str26.toLowerCase(locale2);
                                            lowerCase8.getClass();
                                            if (list6.contains(lowerCase8)) {
                                            }
                                            z8 = false;
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str26.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                } else {
                                    list6 = InvalidVideoProfilesQuirk.b;
                                    lowerCase8 = str26.toLowerCase(locale2);
                                    lowerCase8.getClass();
                                    if (list6.contains(lowerCase8)) {
                                    }
                                    z8 = false;
                                }
                            }
                        }
                    }
                } else {
                    list4 = InvalidVideoProfilesQuirk.a;
                    lowerCase6 = str26.toLowerCase(locale2);
                    lowerCase6.getClass();
                    if (list4.contains(lowerCase6)) {
                        str13 = Build.ID;
                        str13.getClass();
                        if (!mm7.Z(str13, true, "TP1A")) {
                            str13.getClass();
                            if (!mm7.Z(str13, true, "TD1A")) {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!mm7.Z(str10, true, "TKQ1")) {
                                        str10.getClass();
                                        if (mm7.Z(str10, true, "TP1A")) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            } else {
                                                list6 = InvalidVideoProfilesQuirk.b;
                                                lowerCase8 = str26.toLowerCase(locale2);
                                                lowerCase8.getClass();
                                                if (list6.contains(lowerCase8)) {
                                                }
                                                z8 = false;
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    } else {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    }
                                }
                            }
                        }
                    } else {
                        if (str27.equalsIgnoreCase("Redmi")) {
                            str12 = Build.BRAND;
                            str12.getClass();
                            if (str12.equalsIgnoreCase("Redmi")) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        } else {
                            z17 = true;
                        }
                        if (str27.equalsIgnoreCase("Xiaomi")) {
                            str11 = Build.BRAND;
                            str11.getClass();
                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        } else {
                            z18 = true;
                        }
                        if (z17 || z18) {
                            str10 = Build.ID;
                            str10.getClass();
                            if (!mm7.Z(str10, true, "TKQ1")) {
                                str10.getClass();
                                if (mm7.Z(str10, true, "TP1A")) {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    } else {
                                        list6 = InvalidVideoProfilesQuirk.b;
                                        lowerCase8 = str26.toLowerCase(locale2);
                                        lowerCase8.getClass();
                                        if (list6.contains(lowerCase8)) {
                                        }
                                        z8 = false;
                                    }
                                }
                            }
                        } else {
                            list5 = InvalidVideoProfilesQuirk.c;
                            lowerCase7 = str26.toLowerCase(locale2);
                            lowerCase7.getClass();
                            if (list5.contains(lowerCase7)) {
                                list6 = InvalidVideoProfilesQuirk.b;
                                lowerCase8 = str26.toLowerCase(locale2);
                                lowerCase8.getClass();
                                if (list6.contains(lowerCase8)) {
                                }
                                z8 = false;
                            } else {
                                list6 = InvalidVideoProfilesQuirk.b;
                                lowerCase8 = str26.toLowerCase(locale2);
                                lowerCase8.getClass();
                                if (list6.contains(lowerCase8)) {
                                }
                                z8 = false;
                            }
                        }
                    }
                }
                if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                    arrayList3.add(new InvalidVideoProfilesQuirk());
                }
                if (km4.T()) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                    arrayList3.add(new ExcludedSupportedSizesQuirk());
                }
                LinkedHashMap linkedHashMap8 = ExtraCroppingQuirk.a;
                if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                    arrayList3.add(new ExtraCroppingQuirk());
                }
                if (!str27.equalsIgnoreCase("Motorola")) {
                    str9 = Build.BRAND;
                    str9.getClass();
                    if (!str9.equalsIgnoreCase("Motorola")) {
                        z10 = false;
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                    arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                }
                nx7 nx7Var8 = ExtraSupportedSurfaceCombinationsQuirk.a;
                str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2)) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                    arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                int i10 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                if (!str27.equalsIgnoreCase("Google")) {
                    String str2119 = Build.BRAND;
                    str2119.getClass();
                    str2119.equalsIgnoreCase("Google");
                }
                if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                List list1112 = PreviewPixelHDRnetQuirk.a;
                if (str27.equalsIgnoreCase("Google")) {
                    str8 = Build.BRAND;
                    str8.getClass();
                    if (str8.equalsIgnoreCase("Google")) {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale1114 = Locale.getDefault();
                        locale1114.getClass();
                        lowerCase3 = str2.toLowerCase(locale1114);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    list = PreviewPixelHDRnetQuirk.a;
                    str2.getClass();
                    Locale locale1115 = Locale.getDefault();
                    locale1115.getClass();
                    lowerCase3 = str2.toLowerCase(locale1115);
                    lowerCase3.getClass();
                    if (list.contains(lowerCase3)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                    arrayList3.add(new PreviewPixelHDRnetQuirk());
                }
                if (!str27.equalsIgnoreCase("Huawei")) {
                    str7 = Build.BRAND;
                    str7.getClass();
                    if (!str7.equalsIgnoreCase("Huawei")) {
                        z13 = false;
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else if ("mha-l29".equalsIgnoreCase(str26)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                    arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str6 = Build.BRAND;
                    str6.getClass();
                    if (str6.equalsIgnoreCase("Samsung")) {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    upperCase = str26.toUpperCase(locale2);
                    upperCase.getClass();
                    if (mm7.Z(upperCase, false, "SM-A716")) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                    arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                lowerCase4 = str26.toLowerCase(locale2);
                lowerCase4.getClass();
                if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                    arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list1113 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    str5 = Build.BRAND;
                    str5.getClass();
                    if (str5.equalsIgnoreCase("Samsung")) {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str21110 = Build.HARDWARE;
                        str21110.getClass();
                        Locale locale1116 = Locale.getDefault();
                        locale1116.getClass();
                        lowerCase5 = str21110.toLowerCase(locale1116);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                } else {
                    list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    String str21111 = Build.HARDWARE;
                    str21111.getClass();
                    Locale locale1117 = Locale.getDefault();
                    locale1117.getClass();
                    lowerCase5 = str21111.toLowerCase(locale1117);
                    lowerCase5.getClass();
                    if (list3.contains(lowerCase5)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                    arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                }
                if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                List list1114 = ZslDisablerQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                }
                str4 = Build.BRAND;
                str4.getClass();
                if (!str4.equalsIgnoreCase("Samsung")) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                } else if (a38.c(ZslDisablerQuirk.a)) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                }
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
                z16 = true;
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
                z8 = true;
                if (g26Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                    arrayList3.add(new InvalidVideoProfilesQuirk());
                }
                if (km4.T()) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (g26Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                    arrayList3.add(new ExcludedSupportedSizesQuirk());
                }
                LinkedHashMap linkedHashMap9 = ExtraCroppingQuirk.a;
                if (g26Var3.a(ExtraCroppingQuirk.class, x97.K())) {
                    arrayList3.add(new ExtraCroppingQuirk());
                }
                if (!str27.equalsIgnoreCase("Motorola")) {
                    str9 = Build.BRAND;
                    str9.getClass();
                    if (!str9.equalsIgnoreCase("Motorola")) {
                        z10 = false;
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g26Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                    arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                }
                nx7 nx7Var9 = ExtraSupportedSurfaceCombinationsQuirk.a;
                str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2)) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (g26Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                    arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                int i11 = Nexus4AndroidLTargetAspectRatioQuirk.a;
                if (!str27.equalsIgnoreCase("Google")) {
                    String str21112 = Build.BRAND;
                    str21112.getClass();
                    str21112.equalsIgnoreCase("Google");
                }
                if (g26Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                List list1115 = PreviewPixelHDRnetQuirk.a;
                if (str27.equalsIgnoreCase("Google")) {
                    str8 = Build.BRAND;
                    str8.getClass();
                    if (str8.equalsIgnoreCase("Google")) {
                        list = PreviewPixelHDRnetQuirk.a;
                        str2.getClass();
                        Locale locale1118 = Locale.getDefault();
                        locale1118.getClass();
                        lowerCase3 = str2.toLowerCase(locale1118);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    list = PreviewPixelHDRnetQuirk.a;
                    str2.getClass();
                    Locale locale1119 = Locale.getDefault();
                    locale1119.getClass();
                    lowerCase3 = str2.toLowerCase(locale1119);
                    lowerCase3.getClass();
                    if (list.contains(lowerCase3)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (g26Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                    arrayList3.add(new PreviewPixelHDRnetQuirk());
                }
                if (!str27.equalsIgnoreCase("Huawei")) {
                    str7 = Build.BRAND;
                    str7.getClass();
                    if (!str7.equalsIgnoreCase("Huawei")) {
                        z13 = false;
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else if ("mha-l29".equalsIgnoreCase(str26)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (g26Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                    arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str6 = Build.BRAND;
                    str6.getClass();
                    if (str6.equalsIgnoreCase("Samsung")) {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (mm7.Z(upperCase, false, "SM-A716")) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    upperCase = str26.toUpperCase(locale2);
                    upperCase.getClass();
                    if (mm7.Z(upperCase, false, "SM-A716")) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (g26Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                    arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                list2 = TorchIsClosedAfterImageCapturingQuirk.a;
                lowerCase4 = str26.toLowerCase(locale2);
                lowerCase4.getClass();
                if (g26Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                    arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list1116 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    str5 = Build.BRAND;
                    str5.getClass();
                    if (str5.equalsIgnoreCase("Samsung")) {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                        String str21113 = Build.HARDWARE;
                        str21113.getClass();
                        Locale locale11110 = Locale.getDefault();
                        locale11110.getClass();
                        lowerCase5 = str21113.toLowerCase(locale11110);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                } else {
                    list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
                    String str21114 = Build.HARDWARE;
                    str21114.getClass();
                    Locale locale11111 = Locale.getDefault();
                    locale11111.getClass();
                    lowerCase5 = str21114.toLowerCase(locale11111);
                    lowerCase5.getClass();
                    if (list3.contains(lowerCase5)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (g26Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                    arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                }
                if (g26Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                List list1117 = ZslDisablerQuirk.a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    if (a38.c(ZslDisablerQuirk.a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (a38.c(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (a38.c(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.a);
                    }
                    um1.a = new i26(arrayList3);
                    i26.d(um1.a());
                    hi5.z0("DeviceQuirks");
                    return;
                }
                str4 = Build.BRAND;
                str4.getClass();
                if (!str4.equalsIgnoreCase("Samsung")) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                } else if (a38.c(ZslDisablerQuirk.a)) {
                    if (!str27.equalsIgnoreCase("Xiaomi")) {
                        str3 = Build.BRAND;
                        str3.getClass();
                        if (str3.equalsIgnoreCase("Xiaomi")) {
                            if (a38.c(ZslDisablerQuirk.b)) {
                            }
                        }
                    } else if (a38.c(ZslDisablerQuirk.b)) {
                    }
                    z16 = false;
                }
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
                z16 = true;
                if (g26Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (g26Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (g26Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.a);
                }
                um1.a = new i26(arrayList3);
                i26.d(um1.a());
                hi5.z0("DeviceQuirks");
                return;
            default:
                return;
        }
    }

    public /* synthetic */ bn0(lr lrVar, byte b) {
        this.a = b;
    }
}
