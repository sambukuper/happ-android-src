.class public final Lk35;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lv82;


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lxd6;

.field public final d:Lvz7;


# direct methods
.method public constructor <init>(Ldw4;)V
    .locals 4

    .line 1
    new-instance v0, Ldw4;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldw4;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lj35;->X:Lj35;

    .line 9
    .line 10
    new-instance v2, Ldw4;

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ldw4;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lvz7;

    .line 21
    .line 22
    invoke-direct {v3, p1}, Lvz7;-><init>(Ldn2;)V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, Lk35;->a:Lvz7;

    .line 26
    .line 27
    invoke-static {v0}, Lx97;->Q(Ldn2;)Lvz7;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lk35;->b:Lvz7;

    .line 32
    .line 33
    new-instance p1, Lxd6;

    .line 34
    .line 35
    const/16 v0, 0x9

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lxd6;-><init>(B)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p1, Lxd6;->Y:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v0, Lqe4;->B0:Lqe4;

    .line 43
    .line 44
    iput-object v0, p1, Lxd6;->Z:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p1, p0, Lk35;->c:Lxd6;

    .line 47
    .line 48
    invoke-static {v2}, Lx97;->Q(Ldn2;)Lvz7;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lk35;->d:Lvz7;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lpd5;Lv76;)Lw82;
    .locals 10

    .line 1
    check-cast p1, Ldq8;

    .line 2
    .line 3
    iget-object v0, p1, Ldq8;->c:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "http"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p1, Ldq8;->c:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "https"

    .line 17
    .line 18
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1

    .line 26
    :cond_1
    :goto_0
    new-instance v2, Lo35;

    .line 27
    .line 28
    iget-object v3, p1, Ldq8;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v5, p0, Lk35;->a:Lvz7;

    .line 31
    .line 32
    new-instance p1, Ltb2;

    .line 33
    .line 34
    const/16 v0, 0x19

    .line 35
    .line 36
    invoke-direct {p1, p3, v0}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v6, Lvz7;

    .line 40
    .line 41
    invoke-direct {v6, p1}, Lvz7;-><init>(Ldn2;)V

    .line 42
    .line 43
    .line 44
    iget-object v7, p0, Lk35;->b:Lvz7;

    .line 45
    .line 46
    iget-object p1, p0, Lk35;->c:Lxd6;

    .line 47
    .line 48
    iget-object p3, p2, Lpd5;->a:Landroid/content/Context;

    .line 49
    .line 50
    iget-object v0, p1, Lxd6;->Z:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object v4, Lqe4;->B0:Lqe4;

    .line 53
    .line 54
    if-eq v0, v4, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    monitor-enter p1

    .line 58
    :try_start_0
    iget-object v0, p1, Lxd6;->Z:Ljava/lang/Object;

    .line 59
    .line 60
    if-eq v0, v4, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    iget-object v0, p1, Lxd6;->Y:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lgn2;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, p3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    iput-object p3, p1, Lxd6;->Z:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v1, p1, Lxd6;->Y:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    move-object v0, p3

    .line 79
    :goto_1
    monitor-exit p1

    .line 80
    :goto_2
    new-instance v8, Lqc3;

    .line 81
    .line 82
    invoke-direct {v8, v0}, Lqc3;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v9, p0, Lk35;->d:Lvz7;

    .line 86
    .line 87
    move-object v4, p2

    .line 88
    invoke-direct/range {v2 .. v9}, Lo35;-><init>(Ljava/lang/String;Lpd5;Lvz7;Lvz7;Lvz7;Lqc3;Lvz7;)V

    .line 89
    .line 90
    .line 91
    return-object v2

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object p0, v0

    .line 94
    monitor-exit p1

    .line 95
    throw p0
.end method
