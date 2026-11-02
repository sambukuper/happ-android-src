.class public final Lye0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lme6;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Ljava/lang/Object;

.field public Z:Lfg0;

.field public f0:Lux0;

.field public g0:Lux0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lye0;->X:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lye0;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Lfg0;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Lfg0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lye0;->Z:Lfg0;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final Y(Lte6;JLde;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lye0;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    iget-object p3, p0, Lye0;->f0:Lux0;

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const-string p4, "Camera2CameraControl.tag"

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Le18;->a:Lxu4;

    .line 19
    .line 20
    sget-object v2, Ld18;->b:Ld18;

    .line 21
    .line 22
    invoke-interface {p1, v1, v2}, Lyu4;->a(Lxu4;Ld18;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ld18;

    .line 27
    .line 28
    iget-object p1, p1, Ld18;->a:Landroid/util/ArrayMap;

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    invoke-virtual {p3, p1}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lye0;->f0:Lux0;

    .line 45
    .line 46
    iget-object p3, p0, Lye0;->g0:Lux0;

    .line 47
    .line 48
    if-eqz p3, :cond_0

    .line 49
    .line 50
    invoke-virtual {p3, p1}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lye0;->g0:Lux0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :goto_0
    monitor-exit p2

    .line 59
    return-void

    .line 60
    :goto_1
    monitor-exit p2

    .line 61
    throw p0
.end method

.method public final a(Lqq8;Z)Lux0;
    .locals 5

    .line 1
    new-instance v0, Lux0;

    .line 2
    .line 3
    invoke-direct {v0}, Lux0;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lye0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Lye0;->Z:Lfg0;

    .line 10
    .line 11
    invoke-virtual {v2}, Lfg0;->a()Lgg0;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    monitor-exit v1

    .line 16
    iget-object v1, p0, Lye0;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v3, p0, Lye0;->f0:Lux0;

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    :try_start_1
    const-string p2, "Camera2CameraControl was updated with new options."

    .line 28
    .line 29
    new-instance v4, Lnh0;

    .line 30
    .line 31
    invoke-direct {v4, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v4}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-static {v0, v3}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    :goto_0
    iput-object v0, p0, Lye0;->f0:Lux0;

    .line 47
    .line 48
    const-string p0, "Camera2CameraControl.tag"

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {p0, p2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v2, p0}, Lqq8;->c(Lgg0;Ljava/util/Map;)Lxg1;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-object p1, p0, Lye0;->g0:Lux0;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    const-string p2, "Camera2CameraControl was updated with new options."

    .line 74
    .line 75
    new-instance v2, Lnh0;

    .line 76
    .line 77
    invoke-direct {v2, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v2}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 81
    .line 82
    .line 83
    :cond_3
    iput-object v0, p0, Lye0;->g0:Lux0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    :goto_1
    monitor-exit v1

    .line 86
    return-object v0

    .line 87
    :goto_2
    monitor-exit v1

    .line 88
    throw p0

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    monitor-exit v1

    .line 91
    throw p0
.end method
