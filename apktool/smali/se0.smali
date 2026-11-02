.class public final Lse0;
.super Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lkv5;


# direct methods
.method public constructor <init>(Lkv5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lse0;->a:Lkv5;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCameraAvailable(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lvi0;->a(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lvi0;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lvi0;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lse0;->a:Lkv5;

    .line 13
    .line 14
    invoke-static {p0, v0}, Ljm4;->c0(Ln17;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method
