.class public final Lhb;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lza;

.field public final b:Lfh0;

.field public final c:Leg0;

.field public final d:Ldq;

.field public final e:Landroid/os/Handler;

.field public final f:Ltv;

.field public final g:Ltv;


# direct methods
.method public constructor <init>(Lza;Lfh0;Ln57;Leg0;Ldq;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lhb;->a:Lza;

    .line 11
    .line 12
    iput-object p2, p0, Lhb;->b:Lfh0;

    .line 13
    .line 14
    iput-object p4, p0, Lhb;->c:Leg0;

    .line 15
    .line 16
    iput-object p5, p0, Lhb;->d:Ldq;

    .line 17
    .line 18
    iput-object p6, p0, Lhb;->e:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {p3}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lhb;->f:Ltv;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-static {p1}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lhb;->g:Ltv;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;
    .locals 3

    .line 1
    iget-object v0, p0, Lhb;->g:Ltv;

    .line 2
    .line 3
    iget-object v0, v0, Ltv;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lgh0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lhb;->e:Landroid/os/Handler;

    .line 11
    .line 12
    instance-of v1, p1, Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    .line 13
    .line 14
    iget-object v2, p0, Lhb;->a:Lza;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Lya;

    .line 19
    .line 20
    check-cast p1, Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    .line 21
    .line 22
    invoke-direct {v1, v2, p1, p2, v0}, Lya;-><init>(Lza;Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;Leg0;Landroid/os/Handler;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance v1, Lxa;

    .line 27
    .line 28
    invoke-direct {v1, v2, p1, p2, v0}, Lxa;-><init>(Lza;Landroid/hardware/camera2/CameraCaptureSession;Leg0;Landroid/os/Handler;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p1, p0, Lhb;->g:Ltv;

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-virtual {p1, p2, v1}, Ltv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    iget-object p0, p0, Lhb;->g:Ltv;

    .line 42
    .line 43
    iget-object p0, p0, Ltv;->a:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast p0, Lgh0;

    .line 49
    .line 50
    return-object p0
.end method

.method public final onActive(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lhb;->b:Lfh0;

    .line 10
    .line 11
    iget-object v1, p0, Lhb;->c:Leg0;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Lfh0;->c(Lgh0;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lhb;->d:Ldq;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lhb;->a:Lza;

    .line 25
    .line 26
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object p0, p1, Ldq;->Z:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ltv;

    .line 34
    .line 35
    iget-object p0, p0, Ltv;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 54
    .line 55
    iget-object v1, p1, Ldq;->Y:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lqc6;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onActive(Landroid/hardware/camera2/CameraCaptureSession;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
.end method

.method public final onCaptureQueueEmpty(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lhb;->b:Lfh0;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v1, p1}, Lfh0;->f(Lgh0;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lhb;->d:Ldq;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lhb;->a:Lza;

    .line 23
    .line 24
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v0, 0x1a

    .line 32
    .line 33
    if-lt p0, v0, :cond_0

    .line 34
    .line 35
    iget-object p0, p1, Ldq;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lqc6;

    .line 38
    .line 39
    iget-object p1, p1, Ldq;->Z:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ltv;

    .line 42
    .line 43
    invoke-static {p0, p1}, Lue3;->C(Landroid/hardware/camera2/CameraCaptureSession;Ltv;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-static {}, Lhi5;->j0()Z

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lhb;->b:Lfh0;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lfh0;->d(Lgh0;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lhb;->f:Ltv;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v1}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ln57;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ln57;->a()V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-interface {v0}, Ln57;->a()V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lhb;->d:Ldq;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Lhb;->a:Lza;

    .line 40
    .line 41
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ldq;->B(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lhb;->b:Lfh0;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lfh0;->h(Lgh0;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lhb;->f:Ltv;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p1, v1}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ln57;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ln57;->a()V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {v0}, Ln57;->a()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lhb;->d:Ldq;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, Lhb;->a:Lza;

    .line 37
    .line 38
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ldq;->C(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lhb;->b:Lfh0;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lfh0;->g(Lgh0;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lhb;->f:Ltv;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ln57;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ln57;->a()V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p1, p0, Lhb;->d:Ldq;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Lhb;->a:Lza;

    .line 34
    .line 35
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ldq;->D(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final onReady(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhb;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lhb;->b:Lfh0;

    .line 10
    .line 11
    iget-object v1, p0, Lhb;->c:Leg0;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1}, Lhb;->a(Landroid/hardware/camera2/CameraCaptureSession;Leg0;)Lgh0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Lfh0;->e(Lgh0;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lhb;->d:Ldq;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lhb;->a:Lza;

    .line 25
    .line 26
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object p0, p1, Ldq;->Z:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ltv;

    .line 34
    .line 35
    iget-object p0, p0, Ltv;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 54
    .line 55
    iget-object v1, p1, Ldq;->Y:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lqc6;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onReady(Landroid/hardware/camera2/CameraCaptureSession;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
.end method
