.class public final Lly8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lyh0;


# instance fields
.field public final X:Lza;

.field public final Y:Ljava/lang/Object;

.field public Z:Z


# direct methods
.method public constructor <init>(Lza;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lly8;->X:Lza;

    .line 5
    .line 6
    new-instance p1, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lly8;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final B0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lly8;->X:Lza;

    .line 2
    .line 3
    invoke-virtual {p0}, Lza;->B0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final C(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lly8;->X:Lza;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lza;->C(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final C0(Lzu3;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lly8;->X:Lza;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lza;->C0(Lzu3;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final H0(Lw62;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object p0, p1, Lw62;->g:Lx62;

    .line 9
    .line 10
    invoke-virtual {p0}, Lx62;->a()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lza;->H0(Lw62;)Z

    .line 20
    .line 21
    .line 22
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :goto_0
    monitor-exit v0

    .line 24
    return p0

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final J()V
    .locals 0

    .line 1
    iget-object p0, p0, Lly8;->X:Lza;

    .line 2
    .line 3
    invoke-virtual {p0}, Lza;->J()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final J0(Ljava/util/ArrayList;Lsn0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Lsn0;->a()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Lza;->J0(Ljava/util/ArrayList;Lsn0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return p0

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p0
.end method

.method public final X(Li57;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object p0, p1, Li57;->e:Lsn0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lsn0;->a()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lza;->X(Li57;)Z

    .line 20
    .line 21
    .line 22
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :goto_0
    monitor-exit v0

    .line 24
    return p0

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final Y(I)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lza;->Y(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :goto_0
    monitor-exit v0

    .line 17
    return-object p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0

    .line 20
    throw p0
.end method

.method public final c0(Ljava/util/List;Lfh0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p2}, Ln57;->a()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Lza;->c0(Ljava/util/List;Lfh0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return p0

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p0
.end method

.method public final g(Lhd3;Ljava/util/ArrayList;Lsn0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p3}, Lsn0;->a()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lza;->g(Lhd3;Ljava/util/ArrayList;Lsn0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return p0

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p0
.end method

.method public final k(Ljava/util/ArrayList;Lsn0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Lsn0;->a()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Lza;->k(Ljava/util/ArrayList;Lsn0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return p0

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p0
.end method

.method public final m()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lly8;->X:Lza;

    .line 2
    .line 3
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final p(Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lza;->p(Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :goto_0
    monitor-exit v0

    .line 17
    return-object p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0

    .line 20
    throw p0
.end method

.method public final u(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/ArrayList;Lsn0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lly8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lly8;->Z:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p3}, Lsn0;->a()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object p0, p0, Lly8;->X:Lza;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lza;->u(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/ArrayList;Lsn0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return p0

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p0
.end method
