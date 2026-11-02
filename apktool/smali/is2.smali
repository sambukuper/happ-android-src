.class public abstract Lis2;
.super Lu10;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final y:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILfu6;Lps2;Lqs2;)V
    .locals 10

    .line 1
    sget-object v1, Lya9;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v0, Lya9;->h:Lya9;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lya9;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v0, v2, v3}, Lya9;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lya9;->h:Lya9;

    .line 22
    .line 23
    :cond_0
    move-object v5, v0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object p0, v0

    .line 27
    goto :goto_2

    .line 28
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    sget-object v0, Lns2;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p5}, Lw45;->s(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static/range {p6 .. p6}, Lw45;->s(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v7, Lrb8;

    .line 38
    .line 39
    const/16 v0, 0x9

    .line 40
    .line 41
    invoke-direct {v7, p5, v0}, Lrb8;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v8, Lq09;

    .line 45
    .line 46
    move-object/from16 p5, p6

    .line 47
    .line 48
    invoke-direct {v8, p5}, Lq09;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p5, p4, Lfu6;->g0:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v9, p5

    .line 54
    check-cast v9, Ljava/lang/String;

    .line 55
    .line 56
    move-object v2, p0

    .line 57
    move-object v3, p1

    .line 58
    move-object v4, p2

    .line 59
    move v6, p3

    .line 60
    invoke-direct/range {v2 .. v9}, Lu10;-><init>(Landroid/content/Context;Landroid/os/Looper;Lya9;ILrb8;Lq09;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p4, Lfu6;->Z:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/util/Set;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_2

    .line 76
    .line 77
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    check-cast p3, Lcom/google/android/gms/common/api/Scope;

    .line 82
    .line 83
    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    const-string p0, "Expanding scopes is not permitted, use implied scopes instead"

    .line 91
    .line 92
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    throw p0

    .line 97
    :cond_2
    iput-object p1, p0, Lis2;->y:Ljava/util/Set;

    .line 98
    .line 99
    return-void

    .line 100
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    throw p0
.end method
