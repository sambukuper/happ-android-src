.class public abstract synthetic Lfn;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static synthetic a(ILjava/util/ArrayList;Ljava/util/concurrent/Executor;Lhb;)Landroid/hardware/camera2/params/SessionConfiguration;
    .locals 1

    .line 1
    new-instance v0, Landroid/hardware/camera2/params/SessionConfiguration;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Landroid/hardware/camera2/params/SessionConfiguration;-><init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(ILjava/lang/String;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;
    .locals 2

    .line 1
    new-instance v0, Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, p1, v1, p0}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;-><init>(Ljava/lang/String;II)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
