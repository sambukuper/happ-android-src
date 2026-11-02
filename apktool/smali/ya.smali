.class public final Lya;
.super Lxa;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;


# direct methods
.method public constructor <init>(Lza;Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;Leg0;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lxa;-><init>(Lza;Landroid/hardware/camera2/CameraCaptureSession;Leg0;Landroid/os/Handler;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lya;->g0:Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final C0(Lzu3;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-class v0, Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    .line 5
    .line 6
    sget-object v1, Lyb6;->a:Lzb6;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lya;->g0:Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-super {p0, p1}, Lxa;->C0(Lzu3;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
