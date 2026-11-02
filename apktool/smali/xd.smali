.class public final Lxd;
.super Landroid/hardware/camera2/CameraExtensionSession$StateCallback;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lza;

.field public final b:Lx62;

.field public final c:Leg0;

.field public final d:Ldq;

.field public final e:Lhv;

.field public final f:Ltv;

.field public final g:Ltv;


# direct methods
.method public constructor <init>(Lza;Lx62;Ln57;Leg0;Ldq;Lhv;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroid/hardware/camera2/CameraExtensionSession$StateCallback;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxd;->a:Lza;

    .line 8
    .line 9
    iput-object p2, p0, Lxd;->b:Lx62;

    .line 10
    .line 11
    iput-object p4, p0, Lxd;->c:Leg0;

    .line 12
    .line 13
    iput-object p5, p0, Lxd;->d:Ldq;

    .line 14
    .line 15
    iput-object p6, p0, Lxd;->e:Lhv;

    .line 16
    .line 17
    invoke-static {p3}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lxd;->f:Ltv;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-static {p1}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lxd;->g:Ltv;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CameraExtensionSession;Leg0;)Lfi0;
    .locals 3

    .line 1
    iget-object v0, p0, Lxd;->g:Ltv;

    .line 2
    .line 3
    iget-object v0, v0, Ltv;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lfi0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Lbb;

    .line 11
    .line 12
    iget-object v1, p0, Lxd;->a:Lza;

    .line 13
    .line 14
    iget-object v2, p0, Lxd;->e:Lhv;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1, p2, v2}, Lbb;-><init>(Lza;Landroid/hardware/camera2/CameraExtensionSession;Leg0;Lhv;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lxd;->g:Ltv;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2, v0}, Ltv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    iget-object p0, p0, Lxd;->g:Ltv;

    .line 30
    .line 31
    iget-object p0, p0, Ltv;->a:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p0, Lfi0;

    .line 37
    .line 38
    return-object p0
.end method

.method public final onClosed(Landroid/hardware/camera2/CameraExtensionSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxd;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lxd;->a(Landroid/hardware/camera2/CameraExtensionSession;Leg0;)Lfi0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lxd;->a(Landroid/hardware/camera2/CameraExtensionSession;Leg0;)Lfi0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lxd;->b:Lx62;

    .line 14
    .line 15
    iget-object v1, v0, Lx62;->a:Lsn0;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lsn0;->d(Lgh0;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lxd;->f:Ltv;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p1, v1}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ln57;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-interface {p1}, Ln57;->a()V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Lx62;->a()V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lxd;->d:Ldq;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object p0, p0, Lxd;->a:Lza;

    .line 42
    .line 43
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ldq;->B(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final onConfigureFailed(Landroid/hardware/camera2/CameraExtensionSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxd;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lxd;->a(Landroid/hardware/camera2/CameraExtensionSession;Leg0;)Lfi0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lxd;->b:Lx62;

    .line 11
    .line 12
    iget-object v1, v0, Lx62;->a:Lsn0;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lsn0;->h(Lgh0;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lxd;->f:Ltv;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p1, v1}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ln57;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ln57;->a()V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Lx62;->a()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lxd;->d:Ldq;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p0, p0, Lxd;->a:Lza;

    .line 39
    .line 40
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ldq;->C(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final onConfigured(Landroid/hardware/camera2/CameraExtensionSession;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxd;->c:Leg0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lxd;->a(Landroid/hardware/camera2/CameraExtensionSession;Leg0;)Lfi0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lxd;->b:Lx62;

    .line 11
    .line 12
    iget-object v0, v0, Lx62;->a:Lsn0;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lsn0;->g(Lgh0;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lxd;->f:Ltv;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ln57;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ln57;->a()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p0, Lxd;->d:Ldq;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p0, p0, Lxd;->a:Lza;

    .line 36
    .line 37
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Ldq;->D(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method
